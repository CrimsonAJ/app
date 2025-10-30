package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class P1 extends N2 {
    private static final P1 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private R2 zzg = e3.f14833e;

    static {
        P1 p12 = new P1();
        zzb = p12;
        N2.e(P1.class, p12);
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
                return new P1();
            }
            return new f3(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", Q1.class});
        }
        return (byte) 1;
    }
}
