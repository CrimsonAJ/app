package Q2;

/* renamed from: Q2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366i {

    /* renamed from: a, reason: collision with root package name */
    public final String f6273a;

    public /* synthetic */ C0366i(String str) {
        this.f6273a = str;
    }

    public static C0366i a(A4.r rVar) {
        String str;
        rVar.I(2);
        int x5 = rVar.x();
        int i9 = x5 >> 1;
        int x9 = ((rVar.x() >> 3) & 31) | ((x5 & 1) << 5);
        if (i9 != 4 && i9 != 5 && i9 != 7) {
            if (i9 == 8) {
                str = "hev1";
            } else if (i9 == 9) {
                str = "avc3";
            } else {
                return null;
            }
        } else {
            str = "dvhe";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".0";
        sb.append(".0");
        sb.append(i9);
        if (x9 >= 10) {
            str2 = ".";
        }
        sb.append(str2);
        sb.append(x9);
        return new C0366i(sb.toString());
    }
}
