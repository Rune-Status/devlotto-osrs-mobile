package defpackage;

/* renamed from: nk */
public class nk {
    byte ad;
    public int ai;
    public int aj;
    public int al;
    public int aq;
    public int ar;

    public nk() {
        try {
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nk.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public nk(lj ljVar, boolean z) {
        try {
            this.ad = ljVar.ay(-746725959);
            this.aq = ljVar.an(-1464407032) * 1943592117;
            this.ar = ljVar.at((byte) -23) * 1355918505;
            this.al = ljVar.at((byte) -101) * 907517525;
            this.aj = ljVar.at((byte) -79) * -872936661;
            this.ai = ljVar.at((byte) -40) * 731102305;
            if (z) {
                aq(lj.ad(ljVar, 1118724010), 1588350842);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nk.<init>(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    static Integer ae(lj ljVar) {
        Object obj = null;
        int i = 0;
        while (true) {
            Object obj2 = obj;
            int af = ljVar.af(1804771424);
            if (af == 255) {
                return obj2 != null ? Integer.valueOf(i) : null;
            } else {
                if (af == 0) {
                    obj = obj2;
                    while (ljVar.af(1804771424) != 255) {
                        ljVar.al += 879823907;
                        if (ljVar.an(-1464407032) != 0) {
                            throw new IllegalStateException("");
                        } else if (obj == null) {
                            i = ljVar.at((byte) -21);
                            obj = 1;
                        } else {
                            throw new IllegalStateException("");
                        }
                    }
                }
                throw new IllegalStateException("");
            }
        }
    }

    static Integer ak(lj ljVar) {
        Object obj = null;
        int i = 0;
        while (true) {
            Object obj2 = obj;
            int af = ljVar.af(1804771424);
            if (af == 255) {
                return obj2 != null ? Integer.valueOf(i) : null;
            } else {
                if (af == 0) {
                    obj = obj2;
                    while (ljVar.af(1804771424) != 255) {
                        ljVar.al += 879823907;
                        if (ljVar.an(-1464407032) != 0) {
                            throw new IllegalStateException("");
                        } else if (obj == null) {
                            i = ljVar.at((byte) -100);
                            obj = 1;
                        } else {
                            throw new IllegalStateException("");
                        }
                    }
                }
                throw new IllegalStateException("");
            }
        }
    }

    static Integer am(lj ljVar) {
        Object obj = null;
        int i = 0;
        while (true) {
            Object obj2 = obj;
            int af = ljVar.af(1804771424);
            if (af == 1325277553) {
                return obj2 != null ? Integer.valueOf(i) : null;
            } else {
                if (af == 0) {
                    obj = obj2;
                    while (ljVar.af(1804771424) != 659173120) {
                        ljVar.al += 24486851;
                        if (ljVar.an(-1464407032) != 0) {
                            throw new IllegalStateException("");
                        } else if (obj == null) {
                            i = ljVar.at((byte) -20);
                            obj = 1;
                        } else {
                            throw new IllegalStateException("");
                        }
                    }
                }
                throw new IllegalStateException("");
            }
        }
    }

    public int aa() {
        return 8 == (this.ad & 8) ? 1 : 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void ab(int i) {
        this.ad = (byte) (this.ad & -9);
        if (i == 1) {
            this.ad = (byte) (this.ad | 8);
        }
    }

    public int ac() {
        return 8 == (this.ad & 8) ? 1 : 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void af(int i) {
        this.ad = (byte) (this.ad & -8);
        this.ad = (byte) ((i & 7) | this.ad);
    }

    /* Access modifiers changed, original: 0000 */
    public void ag(Integer num) {
    }

    /* Access modifiers changed, original: 0000 */
    public void ah(int i) {
        this.ad = (byte) (this.ad & -8);
        this.ad = (byte) ((i & 7) | this.ad);
    }

    /* Access modifiers changed, original: 0000 */
    public void ai(int i, byte b) {
        try {
            this.ad = (byte) (this.ad & -9);
            if (i == 1) {
                this.ad = (byte) (this.ad | 8);
            }
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nk.ai(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void aj(int i, byte b) {
        try {
            this.ad = (byte) (this.ad & -8);
            this.ad = (byte) ((i & 7) | this.ad);
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nk.aj(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    public int al(byte b) {
        try {
            return 8 == (this.ad & 8) ? 1 : 0;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nk.al(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void an(int i) {
        this.ad = (byte) (this.ad & 1638224215);
        this.ad = (byte) ((i & 7) | this.ad);
    }

    public int ao() {
        return 8 == (this.ad & 8) ? 1 : 0;
    }

    /* Access modifiers changed, original: 0000 */
    public void ap(Integer num) {
    }

    /* Access modifiers changed, original: 0000 */
    public void aq(Integer num, int i) {
    }

    public int ar(int i) {
        try {
            return this.ad & 7;
        } catch (RuntimeException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("nk.ar(");
            stringBuilder.append(')');
            throw mv.aq(e, stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void as(Integer num) {
    }

    public int au() {
        return this.ad & 7;
    }

    /* Access modifiers changed, original: 0000 */
    public void av(int i) {
        this.ad = (byte) (this.ad & -9);
        if (i == 1) {
            this.ad = (byte) (this.ad | 8);
        }
    }

    public int aw() {
        return 8 == (this.ad & 8) ? 1 : 0;
    }

    public int ax() {
        return this.ad & 7;
    }

    /* Access modifiers changed, original: 0000 */
    public void ay(int i) {
        this.ad = (byte) (this.ad & -8);
        this.ad = (byte) ((i & 7) | this.ad);
    }

    public int az() {
        return this.ad & 7;
    }
}
