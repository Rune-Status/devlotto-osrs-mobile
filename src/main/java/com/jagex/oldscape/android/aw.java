package com.jagex.oldscape.android;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.jagex.oldscape.osrenderer.ad;
import defpackage.mv;

class aw extends OrientationEventListener {
    int ad;
    WindowManager aq;
    final /* synthetic */ am this$0;

    aw(am amVar, Context context, int i) {
        this.this$0 = amVar;
        super(context, i);
    }

    public void ad(int i) {
        if (this.this$0.al != null) {
            if (this.aq == null) {
                this.aq = this.this$0.al.getWindowManager();
            }
            int rotation = this.aq.getDefaultDisplay().getRotation();
            if (rotation != this.ad * 1461471575) {
                this.ad = rotation * 2019603047;
                if (ad.ad(524812364) && ad.at((short) -15222)) {
                    ad.ag(-573967272);
                }
            }
        }
    }

    public void aq(int i) {
        if (this.this$0.al != null) {
            if (this.aq == null) {
                this.aq = this.this$0.al.getWindowManager();
            }
            int rotation = this.aq.getDefaultDisplay().getRotation();
            if (rotation != this.ad * 1461471575) {
                this.ad = rotation * 2019603047;
                if (ad.ad(-448307272) && ad.at((short) -15386)) {
                    ad.ag(-1497509241);
                }
            }
        }
    }

    public void onOrientationChanged(int i) {
        try {
            if (this.this$0.al != null) {
                if (this.aq == null) {
                    this.aq = this.this$0.al.getWindowManager();
                }
                int rotation = this.aq.getDefaultDisplay().getRotation();
                if (rotation != this.ad * 1461471575) {
                    this.ad = rotation * 2019603047;
                    if (ad.ad(1809913160) && ad.at((short) -10132)) {
                        ad.ag(1293116745);
                    }
                }
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/oldscape/android/aw.onOrientationChanged(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }
}
