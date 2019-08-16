package android.support.v4.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.provider.FontsContractCompat.FontRequestCallback;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement.Param;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class LocalBroadcastManager {
    private static final boolean DEBUG = false;
    static final int MSG_EXEC_PENDING_BROADCASTS = 1;
    private static final String TAG = "LocalBroadcastManager";
    private static LocalBroadcastManager mInstance;
    private static final Object mLock = new Object();
    private final HashMap<String, ArrayList<ReceiverRecord>> mActions = new HashMap();
    private final Context mAppContext;
    private final Handler mHandler;
    private final ArrayList<BroadcastRecord> mPendingBroadcasts = new ArrayList();
    private final HashMap<BroadcastReceiver, ArrayList<ReceiverRecord>> mReceivers = new HashMap();

    private static final class BroadcastRecord {
        final Intent intent;
        final ArrayList<ReceiverRecord> receivers;

        BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
            this.intent = intent;
            this.receivers = arrayList;
        }
    }

    private static final class ReceiverRecord {
        boolean broadcasting;
        boolean dead;
        final IntentFilter filter;
        final BroadcastReceiver receiver;

        ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.filter = intentFilter;
            this.receiver = broadcastReceiver;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(128);
            stringBuilder.append("Receiver{");
            stringBuilder.append(this.receiver);
            stringBuilder.append(" filter=");
            stringBuilder.append(this.filter);
            if (this.dead) {
                stringBuilder.append(" DEAD");
            }
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    private LocalBroadcastManager(Context context) {
        this.mAppContext = context;
        this.mHandler = new Handler(context.getMainLooper()) {
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    LocalBroadcastManager.this.executePendingBroadcasts();
                }
            }
        };
    }

    @NonNull
    public static LocalBroadcastManager getInstance(@NonNull Context context) {
        LocalBroadcastManager localBroadcastManager;
        synchronized (mLock) {
            if (mInstance == null) {
                mInstance = new LocalBroadcastManager(context.getApplicationContext());
            }
            localBroadcastManager = mInstance;
        }
        return localBroadcastManager;
    }

    /* Access modifiers changed, original: 0000 */
    /* JADX WARNING: Missing block: B:10:0x001b, code skipped:
            r1 = 0;
     */
    /* JADX WARNING: Missing block: B:12:0x001d, code skipped:
            if (r1 >= r4.length) goto L_0x0001;
     */
    /* JADX WARNING: Missing block: B:13:0x001f, code skipped:
            r5 = r4[r1];
            r6 = r5.receivers.size();
            r3 = 0;
     */
    /* JADX WARNING: Missing block: B:14:0x0028, code skipped:
            if (r3 >= r6) goto L_0x0043;
     */
    /* JADX WARNING: Missing block: B:15:0x002a, code skipped:
            r0 = (android.support.v4.content.LocalBroadcastManager.ReceiverRecord) r5.receivers.get(r3);
     */
    /* JADX WARNING: Missing block: B:16:0x0034, code skipped:
            if (r0.dead != false) goto L_0x003f;
     */
    /* JADX WARNING: Missing block: B:17:0x0036, code skipped:
            r0.receiver.onReceive(r9.mAppContext, r5.intent);
     */
    /* JADX WARNING: Missing block: B:18:0x003f, code skipped:
            r3 = r3 + 1;
     */
    /* JADX WARNING: Missing block: B:19:0x0043, code skipped:
            r1 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executePendingBroadcasts() {
        while (true) {
            synchronized (this.mReceivers) {
                int size = this.mPendingBroadcasts.size();
                if (size <= 0) {
                    return;
                }
                BroadcastRecord[] broadcastRecordArr = new BroadcastRecord[size];
                this.mPendingBroadcasts.toArray(broadcastRecordArr);
                this.mPendingBroadcasts.clear();
            }
        }
        while (true) {
        }
    }

    public void registerReceiver(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        synchronized (this.mReceivers) {
            ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.mReceivers.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.mReceivers.put(broadcastReceiver, arrayList);
            }
            arrayList.add(receiverRecord);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                arrayList = (ArrayList) this.mActions.get(action);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.mActions.put(action, arrayList);
                }
                arrayList.add(receiverRecord);
            }
        }
    }

    /* JADX WARNING: Missing block: B:64:?, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:65:?, code skipped:
            return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean sendBroadcast(@NonNull Intent intent) {
        synchronized (this.mReceivers) {
            StringBuilder stringBuilder;
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.mAppContext.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set categories = intent.getCategories();
            Object obj = (intent.getFlags() & 8) != 0 ? 1 : null;
            if (obj != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Resolving type ");
                stringBuilder.append(resolveTypeIfNeeded);
                stringBuilder.append(" scheme ");
                stringBuilder.append(scheme);
                stringBuilder.append(" of intent ");
                stringBuilder.append(intent);
                Log.v(TAG, stringBuilder.toString());
            }
            ArrayList arrayList = (ArrayList) this.mActions.get(intent.getAction());
            if (arrayList != null) {
                if (obj != null) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Action list: ");
                    stringBuilder.append(arrayList);
                    Log.v(TAG, stringBuilder.toString());
                }
                ArrayList arrayList2 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    ArrayList arrayList3;
                    ReceiverRecord receiverRecord = (ReceiverRecord) arrayList.get(i);
                    if (obj != null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Matching against filter ");
                        stringBuilder.append(receiverRecord.filter);
                        Log.v(TAG, stringBuilder.toString());
                    }
                    if (receiverRecord.broadcasting) {
                        if (obj != null) {
                            Log.v(TAG, "  Filter's target already added");
                        }
                        arrayList3 = arrayList2;
                    } else {
                        int match = receiverRecord.filter.match(action, resolveTypeIfNeeded, scheme, data, categories, TAG);
                        StringBuilder stringBuilder2;
                        if (match >= 0) {
                            if (obj != null) {
                                stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("  Filter matched!  match=0x");
                                stringBuilder2.append(Integer.toHexString(match));
                                Log.v(TAG, stringBuilder2.toString());
                            }
                            arrayList3 = arrayList2 == null ? new ArrayList() : arrayList2;
                            arrayList3.add(receiverRecord);
                            receiverRecord.broadcasting = true;
                        } else if (obj != null) {
                            String str;
                            switch (match) {
                                case FontRequestCallback.FAIL_REASON_SECURITY_VIOLATION /*-4*/:
                                    str = "category";
                                    break;
                                case -3:
                                    str = "action";
                                    break;
                                case -2:
                                    str = "data";
                                    break;
                                case -1:
                                    str = Param.TYPE;
                                    break;
                                default:
                                    str = "unknown reason";
                                    break;
                            }
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("  Filter did not match: ");
                            stringBuilder2.append(str);
                            Log.v(TAG, stringBuilder2.toString());
                            arrayList3 = arrayList2;
                        } else {
                            arrayList3 = arrayList2;
                        }
                    }
                    arrayList2 = arrayList3;
                }
                if (arrayList2 != null) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        ((ReceiverRecord) arrayList2.get(i2)).broadcasting = false;
                    }
                    this.mPendingBroadcasts.add(new BroadcastRecord(intent, arrayList2));
                    if (!this.mHandler.hasMessages(1)) {
                        this.mHandler.sendEmptyMessage(1);
                    }
                }
            }
        }
    }

    public void sendBroadcastSync(@NonNull Intent intent) {
        if (sendBroadcast(intent)) {
            executePendingBroadcasts();
        }
    }

    public void unregisterReceiver(@NonNull BroadcastReceiver broadcastReceiver) {
        synchronized (this.mReceivers) {
            ArrayList arrayList = (ArrayList) this.mReceivers.remove(broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ReceiverRecord receiverRecord = (ReceiverRecord) arrayList.get(size);
                receiverRecord.dead = true;
                for (int i = 0; i < receiverRecord.filter.countActions(); i++) {
                    String action = receiverRecord.filter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.mActions.get(action);
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ReceiverRecord receiverRecord2 = (ReceiverRecord) arrayList2.get(size2);
                            if (receiverRecord2.receiver == broadcastReceiver) {
                                receiverRecord2.dead = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            this.mActions.remove(action);
                        }
                    }
                }
            }
        }
    }
}
