package com.jagex.oldscape.android;

import com.jagex.mobilesdk.auth.MobileAuthServiceListener;
import com.jagex.mobilesdk.common.comms.CommsResult;
import defpackage.ap;
import defpackage.dw;
import defpackage.mv;

class aa implements MobileAuthServiceListener {
    final /* synthetic */ ag this$0;

    aa(ag agVar) {
        this.this$0 = agVar;
    }

    public void ad(CommsResult commsResult) {
        dw.ez.az(commsResult != null ? this.this$0.aj((String) commsResult.getResultValue(), commsResult.responseCode, 50123935) : this.this$0.aj(null, commsResult.responseCode, 2074894187), 241828305);
    }

    public void aq(CommsResult commsResult) {
        dw.ez.az(commsResult != null ? this.this$0.aj((String) commsResult.getResultValue(), commsResult.responseCode, 1781055300) : this.this$0.aj(null, commsResult.responseCode, 422761682), 887944881);
    }

    public void onResult(CommsResult commsResult) {
        ap aj;
        if (commsResult != null) {
            try {
                aj = this.this$0.aj((String) commsResult.getResultValue(), commsResult.responseCode, 1216391766);
            } catch (RuntimeException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("com/jagex/oldscape/android/aa.onResult(");
                stringBuilder.append(')');
                throw mv.aq(e, stringBuilder.toString());
            }
        }
        aj = this.this$0.aj(null, commsResult.responseCode, 1621222307);
        dw.ez.az(aj, 2141103297);
    }
}
