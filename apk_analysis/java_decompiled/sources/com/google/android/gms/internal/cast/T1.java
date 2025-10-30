package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class T1 extends N2 {
    private static final T1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private boolean zzk;
    private int zzl;

    static {
        T1 t12 = new T1();
        zzb = t12;
        N2.e(T1.class, t12);
    }

    public static S1 l() {
        return (S1) zzb.j();
    }

    public static /* synthetic */ void m(T1 t12, String str) {
        str.getClass();
        t12.zzd |= 8;
        t12.zzh = str;
    }

    public static /* synthetic */ void n(T1 t12, String str) {
        str.getClass();
        t12.zzd |= 16;
        t12.zzi = str;
    }

    public static /* synthetic */ void o(T1 t12, String str) {
        str.getClass();
        t12.zzd |= 1;
        t12.zze = str;
    }

    public static /* synthetic */ void p(T1 t12, String str) {
        str.getClass();
        t12.zzd |= 2;
        t12.zzf = str;
    }

    public static /* synthetic */ void q(T1 t12, String str) {
        str.getClass();
        t12.zzd |= 4;
        t12.zzg = str;
    }

    public static /* synthetic */ void r(T1 t12, String str) {
        str.getClass();
        t12.zzd |= 32;
        t12.zzj = str;
    }

    public static /* synthetic */ void s(T1 t12, int i9) {
        t12.zzl = i9 - 1;
        t12.zzd |= 128;
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
                return new T1();
            }
            return new f3(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\b᠌\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", C0879u1.f15055q});
        }
        return (byte) 1;
    }
}
