package l3;

import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public int f20307a;

    /* renamed from: b, reason: collision with root package name */
    public int f20308b;

    /* renamed from: c, reason: collision with root package name */
    public int f20309c;

    /* renamed from: d, reason: collision with root package name */
    public int f20310d;

    /* renamed from: e, reason: collision with root package name */
    public int f20311e;

    /* renamed from: f, reason: collision with root package name */
    public int f20312f;

    /* renamed from: g, reason: collision with root package name */
    public Object f20313g;

    public I(ConstraintLayout constraintLayout) {
        this.f20313g = constraintLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0224 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0219 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(x.C2149d r22, y.b r23) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.I.a(x.d, y.b):void");
    }

    public boolean b(int i9) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if ((i9 & (-2097152)) == -2097152) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0 || (i12 = (i9 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i9 >>> 10) & 3) == 3) {
            return false;
        }
        this.f20307a = i10;
        this.f20313g = AbstractC1552a.f20377m[3 - i11];
        int i16 = AbstractC1552a.f20378n[i13];
        this.f20309c = i16;
        int i17 = 2;
        if (i10 == 2) {
            this.f20309c = i16 / 2;
        } else if (i10 == 0) {
            this.f20309c = i16 / 4;
        }
        int i18 = (i9 >>> 9) & 1;
        int i19 = 1152;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    i19 = 384;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else if (i10 != 3) {
            i19 = 576;
        }
        this.f20312f = i19;
        if (i11 == 3) {
            if (i10 == 3) {
                i15 = AbstractC1552a.f20379o[i12 - 1];
            } else {
                i15 = AbstractC1552a.f20380p[i12 - 1];
            }
            this.f20311e = i15;
            this.f20308b = (((i15 * 12) / this.f20309c) + i18) * 4;
        } else {
            int i20 = 144;
            if (i10 == 3) {
                if (i11 == 2) {
                    i14 = AbstractC1552a.f20381q[i12 - 1];
                } else {
                    i14 = AbstractC1552a.f20382r[i12 - 1];
                }
                this.f20311e = i14;
                this.f20308b = ((i14 * 144) / this.f20309c) + i18;
            } else {
                int i21 = AbstractC1552a.f20383s[i12 - 1];
                this.f20311e = i21;
                if (i11 == 1) {
                    i20 = 72;
                }
                this.f20308b = ((i20 * i21) / this.f20309c) + i18;
            }
        }
        if (((i9 >> 6) & 3) == 3) {
            i17 = 1;
        }
        this.f20310d = i17;
        return true;
    }
}
