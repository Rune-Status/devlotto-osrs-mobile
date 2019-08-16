package com.appsflyer;

final class l {
    /* renamed from: ˊ */
    private String f187;
    /* renamed from: ˎ */
    private e f188;
    /* renamed from: ॱ */
    private boolean f189;

    enum e {
        GOOGLE(0),
        AMAZON(1);
        
        /* renamed from: ˋ */
        private int f186;

        private e(int i) {
            this.f186 = i;
        }

        public final String toString() {
            return String.valueOf(this.f186);
        }
    }

    l(e eVar, String str, boolean z) {
        this.f188 = eVar;
        this.f187 = str;
        this.f189 = z;
    }

    public final String toString() {
        return String.format("%s,%s", new Object[]{this.f187, Boolean.valueOf(this.f189)});
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˎ */
    public final String m142() {
        return this.f187;
    }

    /* Access modifiers changed, original: final */
    /* renamed from: ˏ */
    public final boolean m143() {
        return this.f189;
    }
}
