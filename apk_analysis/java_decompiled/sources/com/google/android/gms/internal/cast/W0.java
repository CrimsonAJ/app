package com.google.android.gms.internal.cast;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class W0 extends N2 {
    private static final W0 zzb;
    private int zzd;
    private C0828h1 zze;
    private long zzf;
    private int zzg;
    private R2 zzh;
    private R2 zzi;
    private R2 zzj;
    private R2 zzk;
    private R2 zzl;
    private int zzm;

    static {
        W0 w02 = new W0();
        zzb = w02;
        N2.e(W0.class, w02);
    }

    public W0() {
        e3 e3Var = e3.f14833e;
        this.zzh = e3Var;
        this.zzi = e3Var;
        this.zzj = e3Var;
        this.zzk = e3Var;
        this.zzl = e3Var;
    }

    public static V0 l() {
        return (V0) zzb.j();
    }

    public static void m(W0 w02, ArrayList arrayList) {
        R2 r22 = w02.zzh;
        if (!((F2) r22).f14714a) {
            int size = r22.size();
            w02.zzh = r22.a(size + size);
        }
        E2.b(arrayList, w02.zzh);
    }

    public static void n(W0 w02, ArrayList arrayList) {
        R2 r22 = w02.zzi;
        if (!((F2) r22).f14714a) {
            int size = r22.size();
            w02.zzi = r22.a(size + size);
        }
        E2.b(arrayList, w02.zzi);
    }

    public static void o(W0 w02, ArrayList arrayList) {
        R2 r22 = w02.zzl;
        if (!((F2) r22).f14714a) {
            int size = r22.size();
            w02.zzl = r22.a(size + size);
        }
        E2.b(arrayList, w02.zzl);
    }

    public static void p(W0 w02, ArrayList arrayList) {
        R2 r22 = w02.zzj;
        if (!((F2) r22).f14714a) {
            int size = r22.size();
            w02.zzj = r22.a(size + size);
        }
        E2.b(arrayList, w02.zzj);
    }

    public static void q(W0 w02, ArrayList arrayList) {
        R2 r22 = w02.zzk;
        if (!((F2) r22).f14714a) {
            int size = r22.size();
            w02.zzk = r22.a(size + size);
        }
        E2.b(arrayList, w02.zzk);
    }

    public static /* synthetic */ void r(W0 w02, C0828h1 c0828h1) {
        w02.zze = c0828h1;
        w02.zzd |= 1;
    }

    public static /* synthetic */ void s(W0 w02, int i9) {
        w02.zzd |= 8;
        w02.zzm = i9;
    }

    public static /* synthetic */ void t(W0 w02, long j) {
        w02.zzd |= 2;
        w02.zzf = j;
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
                return new W0();
            }
            return new f3(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0005\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\tင\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C0886w0.f15080b, "zzh", U0.class, "zzi", Q0.class, "zzj", Z0.class, "zzk", Y0.class, "zzl", S0.class, "zzm"});
        }
        return (byte) 1;
    }
}
