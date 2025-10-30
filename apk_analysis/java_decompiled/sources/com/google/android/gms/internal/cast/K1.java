package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class K1 extends N2 {
    private static final K1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.cast.K1, com.google.android.gms.internal.cast.N2] */
    static {
        ?? n22 = new N2();
        zzb = n22;
        N2.e(K1.class, n22);
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
            return new f3(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
