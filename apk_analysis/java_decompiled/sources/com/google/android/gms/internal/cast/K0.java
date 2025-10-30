package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class K0 extends N2 {
    private static final K0 zzb;
    private R2 zzd = e3.f14833e;

    static {
        K0 k02 = new K0();
        zzb = k02;
        N2.e(K0.class, k02);
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
                return new K0();
            }
            return new f3(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
