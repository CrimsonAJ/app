package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class S0 extends N2 {
    private static final S0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.cast.S0, com.google.android.gms.internal.cast.N2] */
    static {
        ?? n22 = new N2();
        zzb = n22;
        N2.e(S0.class, n22);
    }

    public static R0 l() {
        return (R0) zzb.j();
    }

    public static /* synthetic */ void m(S0 s02, int i9) {
        s02.zzd |= 2;
        s02.zzf = i9;
    }

    public static /* synthetic */ void n(S0 s02, int i9) {
        s02.zze = i9 - 1;
        s02.zzd |= 1;
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
                return new N2();
            }
            return new f3(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", C0878u0.f15007A, "zzf"});
        }
        return (byte) 1;
    }
}
