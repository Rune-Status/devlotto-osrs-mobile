package android.support.v4.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.annotation.ArrayRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.compat.R;
import android.support.v4.provider.FontRequest;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.LIBRARY_GROUP})
public class FontResourcesParserCompat {
    private static final int DEFAULT_TIMEOUT_MILLIS = 500;
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;
    private static final int ITALIC = 1;
    private static final int NORMAL_WEIGHT = 400;

    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {
        @NonNull
        private final FontFileResourceEntry[] mEntries;

        public FontFamilyFilesResourceEntry(@NonNull FontFileResourceEntry[] fontFileResourceEntryArr) {
            this.mEntries = fontFileResourceEntryArr;
        }

        @NonNull
        public FontFileResourceEntry[] getEntries() {
            return this.mEntries;
        }
    }

    public static final class FontFileResourceEntry {
        @NonNull
        private final String mFileName;
        private boolean mItalic;
        private int mResourceId;
        private int mTtcIndex;
        private String mVariationSettings;
        private int mWeight;

        public FontFileResourceEntry(@NonNull String str, int i, boolean z, @Nullable String str2, int i2, int i3) {
            this.mFileName = str;
            this.mWeight = i;
            this.mItalic = z;
            this.mVariationSettings = str2;
            this.mTtcIndex = i2;
            this.mResourceId = i3;
        }

        @NonNull
        public String getFileName() {
            return this.mFileName;
        }

        public int getResourceId() {
            return this.mResourceId;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        @Nullable
        public String getVariationSettings() {
            return this.mVariationSettings;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }
    }

    public static final class ProviderResourceEntry implements FamilyResourceEntry {
        @NonNull
        private final FontRequest mRequest;
        private final int mStrategy;
        private final int mTimeoutMs;

        public ProviderResourceEntry(@NonNull FontRequest fontRequest, int i, int i2) {
            this.mRequest = fontRequest;
            this.mStrategy = i;
            this.mTimeoutMs = i2;
        }

        public int getFetchStrategy() {
            return this.mStrategy;
        }

        @NonNull
        public FontRequest getRequest() {
            return this.mRequest;
        }

        public int getTimeout() {
            return this.mTimeoutMs;
        }
    }

    private FontResourcesParserCompat() {
    }

    private static int getType(TypedArray typedArray, int i) {
        if (VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    @Nullable
    public static FamilyResourceEntry parse(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return readFamilies(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> readCerts(Resources resources, @ArrayRes int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                List<List<byte[]>> emptyList = Collections.emptyList();
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            if (getType(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(toByteArrayList(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(toByteArrayList(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    @Nullable
    private static FamilyResourceEntry readFamilies(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return readFamily(xmlPullParser, resources);
        }
        skip(xmlPullParser);
        return null;
    }

    @Nullable
    private static FamilyResourceEntry readFamily(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.FontFamily);
        String string = obtainAttributes.getString(R.styleable.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(R.styleable.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchTimeout, DEFAULT_TIMEOUT_MILLIS);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(readFont(xmlPullParser, resources));
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            return arrayList.isEmpty() ? null : new FontFamilyFilesResourceEntry((FontFileResourceEntry[]) arrayList.toArray(new FontFileResourceEntry[arrayList.size()]));
        } else {
            while (xmlPullParser.next() != 3) {
                skip(xmlPullParser);
            }
            return new ProviderResourceEntry(new FontRequest(string, string2, string3, readCerts(resources, resourceId)), integer, integer2);
        }
    }

    private static FontFileResourceEntry readFont(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        boolean z = true;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(R.styleable.FontFamilyFont_fontWeight) ? R.styleable.FontFamilyFont_fontWeight : R.styleable.FontFamilyFont_android_fontWeight, NORMAL_WEIGHT);
        if (1 != obtainAttributes.getInt(obtainAttributes.hasValue(R.styleable.FontFamilyFont_fontStyle) ? R.styleable.FontFamilyFont_fontStyle : R.styleable.FontFamilyFont_android_fontStyle, 0)) {
            z = false;
        }
        int i2 = obtainAttributes.hasValue(R.styleable.FontFamilyFont_ttcIndex) ? R.styleable.FontFamilyFont_ttcIndex : R.styleable.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(R.styleable.FontFamilyFont_fontVariationSettings) ? R.styleable.FontFamilyFont_fontVariationSettings : R.styleable.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        i2 = obtainAttributes.hasValue(R.styleable.FontFamilyFont_font) ? R.styleable.FontFamilyFont_font : R.styleable.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i2, 0);
        String string2 = obtainAttributes.getString(i2);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            skip(xmlPullParser);
        }
        return new FontFileResourceEntry(string2, i, z, string, i3, resourceId);
    }

    private static void skip(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
                default:
                    break;
            }
        }
    }

    private static List<byte[]> toByteArrayList(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
