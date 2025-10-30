package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0871s1 extends N2 {
    private static final C0871s1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        C0871s1 c0871s1 = new C0871s1();
        zzb = c0871s1;
        N2.e(C0871s1.class, c0871s1);
    }

    @Override // com.google.android.gms.internal.cast.N2
    public final Object h(int i9, N2 n22) {
        byte b9 = 1;
        int i10 = i9 - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (n22 == null) {
                                b9 = 0;
                            }
                            this.zzh = b9;
                            return null;
                        }
                        return zzb;
                    }
                    return new M2(zzb);
                }
                return new C0871s1();
            }
            return new f3(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", C0878u0.f15015e, "zzf", "zzg", C0886w0.f15088k});
        }
        return Byte.valueOf(this.zzh);
    }
}
