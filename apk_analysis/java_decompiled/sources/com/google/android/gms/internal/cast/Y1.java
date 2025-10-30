package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class Y1 extends N2 {
    private static final Y1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private R2 zzg;
    private R2 zzh;

    static {
        Y1 y12 = new Y1();
        zzb = y12;
        N2.e(Y1.class, y12);
    }

    public Y1() {
        e3 e3Var = e3.f14833e;
        this.zzg = e3Var;
        this.zzh = e3Var;
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
                return new Y1();
            }
            return new f3(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", C0878u0.f15033x, "zzf", "zzg", W1.class, "zzh", X1.class});
        }
        return (byte) 1;
    }
}
