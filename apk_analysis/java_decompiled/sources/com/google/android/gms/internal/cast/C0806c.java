package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806c extends N2 {
    private static final C0806c zzb;
    private R2 zzd;
    private R2 zze;
    private R2 zzf;
    private R2 zzg;

    static {
        C0806c c0806c = new C0806c();
        zzb = c0806c;
        N2.e(C0806c.class, c0806c);
    }

    public C0806c() {
        e3 e3Var = e3.f14833e;
        this.zzd = e3Var;
        this.zze = e3Var;
        this.zzf = e3Var;
        this.zzg = e3Var;
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
                return new C0806c();
            }
            return new f3(zzb, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"zzd", C0798a.class, "zze", r3.class, "zzf", C0798a.class, "zzg", r3.class});
        }
        return (byte) 1;
    }
}
