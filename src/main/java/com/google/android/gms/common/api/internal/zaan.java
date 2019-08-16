package com.google.android.gms.common.api.internal;

import android.support.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import java.util.ArrayList;
import java.util.Map;

final class zaan extends zaau {
    final /* synthetic */ zaak zagi;
    private final Map<Client, zaam> zagk;

    public zaan(zaak zaak, Map<Client, zaam> map) {
        this.zagi = zaak;
        super(zaak, null);
        this.zagk = map;
    }

    @WorkerThread
    public final void zaan() {
        int i;
        int i2 = 0;
        GoogleApiAvailabilityCache googleApiAvailabilityCache = new GoogleApiAvailabilityCache(this.zagi.zaex);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Client client : this.zagk.keySet()) {
            if (!client.requiresGooglePlayServices() || ((zaam) this.zagk.get(client)).zaeb) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        int i3 = -1;
        ArrayList arrayList3;
        int size;
        Object obj;
        if (arrayList.isEmpty()) {
            arrayList3 = arrayList2;
            size = arrayList3.size();
            while (i2 < size) {
                obj = arrayList3.get(i2);
                i2++;
                i3 = googleApiAvailabilityCache.getClientAvailability(this.zagi.mContext, (Client) obj);
                if (i3 == 0) {
                    i = i3;
                    break;
                }
            }
            i = i3;
        } else {
            arrayList3 = arrayList;
            int size2 = arrayList3.size();
            size = 0;
            while (size < size2) {
                obj = arrayList3.get(size);
                size++;
                i3 = googleApiAvailabilityCache.getClientAvailability(this.zagi.mContext, (Client) obj);
                if (i3 != 0) {
                    i = i3;
                    break;
                }
            }
            i = i3;
        }
        if (i != 0) {
            this.zagi.zafs.zaa(new zaao(this, this.zagi, new ConnectionResult(i, null)));
            return;
        }
        if (this.zagi.zagc) {
            this.zagi.zaga.connect();
        }
        for (Client client2 : this.zagk.keySet()) {
            ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (ConnectionProgressReportCallbacks) this.zagk.get(client2);
            if (!client2.requiresGooglePlayServices() || googleApiAvailabilityCache.getClientAvailability(this.zagi.mContext, client2) == 0) {
                client2.connect(connectionProgressReportCallbacks);
            } else {
                this.zagi.zafs.zaa(new zaap(this, this.zagi, connectionProgressReportCallbacks));
            }
        }
    }
}
