package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class M1 extends N2 {
    private static final M1 zzb;
    private int zzd;
    private C0806c zze;
    private R2 zzf;
    private R2 zzg;
    private R2 zzh;
    private String zzi;
    private long zzj;
    private int zzk;

    static {
        M1 m12 = new M1();
        zzb = m12;
        N2.e(M1.class, m12);
    }

    public M1() {
        e3 e3Var = e3.f14833e;
        this.zzf = e3Var;
        this.zzg = e3Var;
        this.zzh = e3Var;
        this.zzi = "";
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
                return new M1();
            }
            return new f3(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001a\u0003\u001b\u0004\u001b\u0005ဈ\u0001\u0006ဂ\u0002\u0007᠌\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", G0.class, "zzh", I1.class, "zzi", "zzj", "zzk", C0886w0.f15089l});
        }
        return (byte) 1;
    }
}
