package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class D0 extends N2 {
    private static final D0 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private R2 zzi;
    private R2 zzj;
    private String zzk;

    static {
        D0 d02 = new D0();
        zzb = d02;
        N2.e(D0.class, d02);
    }

    public D0() {
        e3 e3Var = e3.f14833e;
        this.zzi = e3Var;
        this.zzj = e3Var;
        this.zzk = "";
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
                return new D0();
            }
            return new f3(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", C0879u1.f15050l, "zzf", "zzg", C0879u1.f15036A, "zzh", "zzi", C1.class, "zzj", C1.class, "zzk"});
        }
        return (byte) 1;
    }
}
