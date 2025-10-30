package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0812d1 extends N2 {
    private static final C0812d1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private long zzg;

    static {
        C0812d1 c0812d1 = new C0812d1();
        zzb = c0812d1;
        N2.e(C0812d1.class, c0812d1);
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
                return new C0812d1();
            }
            return new f3(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002:\u0000\u00035\u0000\u00048\u0000", new Object[]{"zzf", "zze", "zzd", "zzg"});
        }
        return (byte) 1;
    }
}
