package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class Q0 extends N2 {
    private static final Q0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.cast.Q0, com.google.android.gms.internal.cast.N2] */
    static {
        ?? n22 = new N2();
        zzb = n22;
        N2.e(Q0.class, n22);
    }

    public static P0 l() {
        return (P0) zzb.j();
    }

    public static /* synthetic */ void m(Q0 q02, int i9) {
        q02.zzd |= 16;
        q02.zzi = i9;
    }

    public static /* synthetic */ void n(Q0 q02, int i9) {
        q02.zzd |= 2;
        q02.zzf = i9;
    }

    public static /* synthetic */ void o(Q0 q02, int i9) {
        q02.zzd |= 8;
        q02.zzh = i9;
    }

    public static /* synthetic */ void p(Q0 q02, int i9) {
        q02.zzd |= 4;
        q02.zzg = i9;
    }

    public static /* synthetic */ void q(Q0 q02, int i9) {
        q02.zze = i9 - 1;
        q02.zzd |= 1;
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
            return new f3(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", C0878u0.f15035z, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
