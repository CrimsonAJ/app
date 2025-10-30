package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887w1 extends N2 {
    private static final C0887w1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C0887w1 c0887w1 = new C0887w1();
        zzb = c0887w1;
        N2.e(C0887w1.class, c0887w1);
    }

    @Override // com.google.android.gms.internal.cast.N2
    public final Object h(int i9, N2 n22) {
        int i10 = i9 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new M2(zzb);
                }
                return new C0887w1();
            }
            return new f3(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
