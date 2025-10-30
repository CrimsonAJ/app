package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class Z1 extends N2 {
    private static final Z1 zzb;
    private int zzd;
    private String zze = "";

    static {
        Z1 z12 = new Z1();
        zzb = z12;
        N2.e(Z1.class, z12);
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
                return new Z1();
            }
            return new f3(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
