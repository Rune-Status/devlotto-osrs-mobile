package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class Streams {

    private static final class AppendableWriter extends Writer {
        private final Appendable appendable;
        private final CurrentWrite currentWrite = new CurrentWrite();

        static class CurrentWrite implements CharSequence {
            char[] chars;

            CurrentWrite() {
            }

            public char charAt(int i) {
                return this.chars[i];
            }

            public int length() {
                return this.chars.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.chars, i, i2 - i);
            }
        }

        AppendableWriter(Appendable appendable) {
            this.appendable = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i) throws IOException {
            this.appendable.append((char) i);
        }

        public void write(char[] cArr, int i, int i2) throws IOException {
            this.currentWrite.chars = cArr;
            this.appendable.append(this.currentWrite, i, i2 + i);
        }
    }

    private Streams() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0022 A:{Splitter:B:0:0x0000, ExcHandler: MalformedJsonException (r0_8 'e' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b A:{Splitter:B:0:0x0000, ExcHandler: IOException (r0_7 'e' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0014 A:{Splitter:B:0:0x0000, ExcHandler: NumberFormatException (r0_6 'e' java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:9:0x0014, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:11:0x001a, code skipped:
            throw new com.google.gson.JsonSyntaxException(r0);
     */
    /* JADX WARNING: Missing block: B:12:0x001b, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:14:0x0021, code skipped:
            throw new com.google.gson.JsonIOException(r0);
     */
    /* JADX WARNING: Missing block: B:15:0x0022, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:17:0x0028, code skipped:
            throw new com.google.gson.JsonSyntaxException(r0);
     */
    /* JADX WARNING: Missing block: B:18:0x0029, code skipped:
            r2 = e;
     */
    /* JADX WARNING: Missing block: B:19:0x002a, code skipped:
            r1 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static JsonElement parse(JsonReader jsonReader) throws JsonParseException {
        Object obj;
        Throwable e;
        try {
            jsonReader.peek();
            obj = null;
            return (JsonElement) TypeAdapters.JSON_ELEMENT.read(jsonReader);
        } catch (EOFException e2) {
            e = e2;
        } catch (MalformedJsonException e3) {
        } catch (IOException e4) {
        } catch (NumberFormatException e5) {
        }
        if (obj != null) {
            return JsonNull.INSTANCE;
        }
        throw new JsonSyntaxException(e);
    }

    public static void write(JsonElement jsonElement, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.JSON_ELEMENT.write(jsonWriter, jsonElement);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable);
    }
}
