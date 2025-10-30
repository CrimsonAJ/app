package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class W0 extends AbstractC0909b2 {
    private static final W0 zzb;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        W0 w02 = new W0();
        zzb = w02;
        AbstractC0909b2.j(W0.class, w02);
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
                return new W0();
            }
            return new A2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
