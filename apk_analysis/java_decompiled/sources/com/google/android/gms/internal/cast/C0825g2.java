package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825g2 extends N2 {
    private static final C0825g2 zzb;
    private int zzd;
    private String zze = "";
    private long zzf;
    private long zzg;
    private C0829h2 zzh;

    static {
        C0825g2 c0825g2 = new C0825g2();
        zzb = c0825g2;
        N2.e(C0825g2.class, c0825g2);
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
                return new C0825g2();
            }
            return new f3(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
