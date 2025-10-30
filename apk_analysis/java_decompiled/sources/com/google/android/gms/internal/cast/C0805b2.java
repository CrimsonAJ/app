package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0805b2 extends N2 {
    private static final C0805b2 zzb;
    private int zzd;
    private int zze;
    private R2 zzf;
    private R2 zzg;
    private int zzh;

    static {
        C0805b2 c0805b2 = new C0805b2();
        zzb = c0805b2;
        N2.e(C0805b2.class, c0805b2);
    }

    public C0805b2() {
        e3 e3Var = e3.f14833e;
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
                return new C0805b2();
            }
            return new f3(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", C0886w0.f15082d, "zzf", C1.class, "zzg", C1.class, "zzh"});
        }
        return (byte) 1;
    }
}
