package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class I0 extends AbstractC0909b2 {
    private static final I0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        I0 i02 = new I0();
        zzb = i02;
        AbstractC0909b2.j(I0.class, i02);
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
                return new I0();
            }
            return new A2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
