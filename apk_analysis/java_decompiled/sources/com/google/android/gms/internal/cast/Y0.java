package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class Y0 extends N2 {
    private static final Y0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.cast.Y0, com.google.android.gms.internal.cast.N2] */
    static {
        ?? n22 = new N2();
        zzb = n22;
        N2.e(Y0.class, n22);
    }

    public static X0 l() {
        return (X0) zzb.j();
    }

    public static /* synthetic */ void m(Y0 y02, int i9) {
        y02.zzd |= 2;
        y02.zzf = i9;
    }

    public static /* synthetic */ void n(Y0 y02, int i9) {
        y02.zzd |= 4;
        y02.zzg = i9;
    }

    public static /* synthetic */ void o(Y0 y02, int i9) {
        y02.zzd |= 8;
        y02.zzh = i9;
    }

    public static /* synthetic */ void p(Y0 y02, int i9) {
        y02.zze = i9 - 1;
        y02.zzd |= 1;
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
            return new f3(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", C0878u0.f15009C, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
