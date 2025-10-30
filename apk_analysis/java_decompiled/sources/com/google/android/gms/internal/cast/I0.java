package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class I0 extends N2 {
    private static final I0 zzb;
    private int zzd;
    private C0828h1 zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private N1 zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.cast.I0, com.google.android.gms.internal.cast.N2] */
    static {
        ?? n22 = new N2();
        zzb = n22;
        N2.e(I0.class, n22);
    }

    public static H0 l() {
        return (H0) zzb.j();
    }

    public static H0 m(I0 i02) {
        M2 j = zzb.j();
        N2 n22 = j.f14747a;
        if (!n22.equals(i02)) {
            if (!j.f14748b.g()) {
                N2 n23 = (N2) n22.h(4, null);
                d3.f14823c.a(n23.getClass()).f(n23, j.f14748b);
                j.f14748b = n23;
            }
            N2 n24 = j.f14748b;
            d3.f14823c.a(n24.getClass()).f(n24, i02);
        }
        return (H0) j;
    }

    public static I0 n() {
        return zzb;
    }

    public static /* synthetic */ void o(I0 i02, C0828h1 c0828h1) {
        i02.zze = c0828h1;
        i02.zzd |= 1;
    }

    public static /* synthetic */ void p(I0 i02, int i9) {
        i02.zzd |= 1024;
        i02.zzo = i9;
    }

    public static /* synthetic */ void q(I0 i02, int i9) {
        i02.zzd |= 128;
        i02.zzl = i9;
    }

    public static /* synthetic */ void r(I0 i02, boolean z9) {
        i02.zzd |= 2048;
        i02.zzp = z9;
    }

    public static /* synthetic */ void s(I0 i02, boolean z9) {
        i02.zzd |= 16384;
        i02.zzs = z9;
    }

    public static /* synthetic */ void t(I0 i02, boolean z9) {
        i02.zzd |= 2;
        i02.zzf = z9;
    }

    public static /* synthetic */ void u(I0 i02, int i9) {
        i02.zzd |= 64;
        i02.zzk = i9;
    }

    public static /* synthetic */ void v(I0 i02, long j) {
        i02.zzd |= 4;
        i02.zzg = j;
    }

    public static /* synthetic */ void w(I0 i02) {
        i02.zzd |= 8192;
        i02.zzr = 101;
    }

    public static /* synthetic */ void x(I0 i02) {
        i02.zzd |= 4096;
        i02.zzq = 0;
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
            return new f3(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", C0879u1.f15052n, "zzj", C0879u1.f15051m, "zzk", "zzl", "zzm", "zzn", C0879u1.f15037B, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        return (byte) 1;
    }
}
