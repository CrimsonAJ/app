package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class Z0 extends AbstractC0909b2 {
    private static final Z0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private N0 zzg;

    static {
        Z0 z02 = new Z0();
        zzb = z02;
        AbstractC0909b2.j(Z0.class, z02);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0909b2
    public final Object m(int i9) {
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
                    return new AbstractC0904a2(zzb);
                }
                return new Z0();
            }
            return new A2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
