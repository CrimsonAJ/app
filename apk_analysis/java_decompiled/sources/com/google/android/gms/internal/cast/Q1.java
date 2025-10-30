package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class Q1 extends N2 {
    private static final Q1 zzb;
    private int zzd;
    private String zze = "";
    private R2 zzf;
    private R2 zzg;
    private boolean zzh;

    static {
        Q1 q12 = new Q1();
        zzb = q12;
        N2.e(Q1.class, q12);
    }

    public Q1() {
        e3 e3Var = e3.f14833e;
        this.zzf = e3Var;
        this.zzg = e3Var;
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
                return new Q1();
            }
            return new f3(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzd", "zze", "zzf", C0856o1.class, "zzg", C0828h1.class, "zzh"});
        }
        return (byte) 1;
    }
}
