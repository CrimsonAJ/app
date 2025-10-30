package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810d extends N2 {
    private static final C0810d zzb;
    private R2 zzd = e3.f14833e;

    static {
        C0810d c0810d = new C0810d();
        zzb = c0810d;
        N2.e(C0810d.class, c0810d);
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
                return new C0810d();
            }
            return new f3(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C0814e.class});
        }
        return (byte) 1;
    }
}
