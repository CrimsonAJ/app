package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class U0 extends N2 {
    private static final U0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.cast.U0, com.google.android.gms.internal.cast.N2] */
    static {
        ?? n22 = new N2();
        zzb = n22;
        N2.e(U0.class, n22);
    }

    public static T0 l() {
        return (T0) zzb.j();
    }

    public static /* synthetic */ void m(U0 u02, boolean z9) {
        u02.zzd |= 8;
        u02.zzh = z9;
    }

    public static /* synthetic */ void n(U0 u02, int i9) {
        u02.zzd |= 4;
        u02.zzg = i9;
    }

    public static /* synthetic */ void o(U0 u02, long j) {
        u02.zzd |= 16;
        u02.zzi = j;
    }

    public static /* synthetic */ void p(U0 u02, int i9) {
        u02.zzd |= 2;
        u02.zzf = i9;
    }

    public static /* synthetic */ void q(U0 u02, int i9) {
        u02.zze = i9 - 1;
        u02.zzd |= 1;
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
            return new f3(zzb, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0006ဂ\u0004", new Object[]{"zzd", "zze", C0878u0.f15008B, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
