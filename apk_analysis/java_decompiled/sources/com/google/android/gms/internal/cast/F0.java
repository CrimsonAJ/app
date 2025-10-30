package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class F0 extends N2 {
    private static final F0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        F0 f02 = new F0();
        zzb = f02;
        N2.e(F0.class, f02);
    }

    public static E0 l() {
        return (E0) zzb.j();
    }

    public static /* synthetic */ void m(F0 f02, String str) {
        str.getClass();
        f02.zzd |= 1;
        f02.zze = str;
    }

    public static /* synthetic */ void n(F0 f02, String str) {
        str.getClass();
        f02.zzd |= 2;
        f02.zzf = str;
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
                return new F0();
            }
            return new f3(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
