package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0899z1 extends N2 {
    private static final C0899z1 zzb;
    private int zzd;
    private long zze;
    private Q2 zzf;
    private Q2 zzg;

    static {
        C0899z1 c0899z1 = new C0899z1();
        zzb = c0899z1;
        N2.e(C0899z1.class, c0899z1);
    }

    public C0899z1() {
        V2 v22 = V2.f14778e;
        this.zzf = v22;
        this.zzg = v22;
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
                return new C0899z1();
            }
            return new f3(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
