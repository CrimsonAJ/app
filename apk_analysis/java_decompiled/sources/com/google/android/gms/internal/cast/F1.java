package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class F1 extends N2 {
    private static final F1 zzb;
    private int zzd;
    private R2 zze;
    private R2 zzf;
    private R1 zzg;

    static {
        F1 f12 = new F1();
        zzb = f12;
        N2.e(F1.class, f12);
    }

    public F1() {
        e3 e3Var = e3.f14833e;
        this.zze = e3Var;
        this.zzf = e3Var;
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
                return new F1();
            }
            return new f3(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", C0801a2.class, "zzf", C0820f1.class, "zzg"});
        }
        return (byte) 1;
    }
}
