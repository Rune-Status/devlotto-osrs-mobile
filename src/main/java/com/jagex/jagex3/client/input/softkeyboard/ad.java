package com.jagex.jagex3.client.input.softkeyboard;

import defpackage.ft;
import defpackage.mv;

public class ad extends ft {
    ad() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/ad.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void aa() {
        long aq = aq(-1269791763);
        this.ad.ai(84, aq);
        this.ad.ae(1801229882, aq);
    }

    public void ac() {
        long aq = aq(-950468491);
        this.ad.ai(80, aq);
        this.ad.ae(80, aq);
    }

    public void af(int i) {
        this.ad.az(i, aq(-379701025));
    }

    public void ag(int i) {
        try {
            long aq = aq(683875974);
            this.ad.ai(84, aq);
            this.ad.ae(84, aq);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/ad.ag(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ah(int i) {
        this.ad.az(i, aq(-1573024074));
    }

    public void ak(String str, String str2, byte b) {
        try {
            int i;
            int min = Math.min(str.length(), str2.length());
            int i2 = 0;
            for (i = 0; i < min && str.charAt(i2) == str2.charAt(i2); i++) {
                i2++;
            }
            long aq = aq(-1849251922);
            for (i = i2; i < str.length(); i++) {
                this.ad.ai(85, aq);
                this.ad.ae(85, aq);
            }
            while (i2 < str2.length()) {
                this.ad.am(str2.charAt(i2), aq);
                i2++;
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/ad.ak(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void ao(int i) {
        this.ad.az(i, aq(137234624));
    }

    public void ap(int i, int i2) {
        try {
            this.ad.az(i, aq(-861697426));
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/ad.ap(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void as(int i) {
        try {
            long aq = aq(-2068787688);
            this.ad.ai(80, aq);
            this.ad.ae(80, aq);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com/jagex/jagex3/client/input/softkeyboard/ad.as(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public void au(String str, String str2) {
        int i;
        int min = Math.min(str.length(), str2.length());
        int i2 = 0;
        for (i = 0; i < min && str.charAt(i2) == str2.charAt(i2); i++) {
            i2++;
        }
        long aq = aq(-1729987549);
        for (i = i2; i < str.length(); i++) {
            this.ad.ai(85, aq);
            this.ad.ae(-1707778825, aq);
        }
        while (i2 < str2.length()) {
            this.ad.am(str2.charAt(i2), aq);
            i2++;
        }
    }

    public void aw() {
        long aq = aq(841041953);
        this.ad.ai(80, aq);
        this.ad.ae(80, aq);
    }

    public void ax() {
        long aq = aq(-1067812380);
        this.ad.ai(80, aq);
        this.ad.ae(80, aq);
    }

    public void ay(int i) {
        this.ad.az(i, aq(1007412775));
    }

    public void az() {
        long aq = aq(921386059);
        this.ad.ai(530321603, aq);
        this.ad.ae(80, aq);
    }
}
