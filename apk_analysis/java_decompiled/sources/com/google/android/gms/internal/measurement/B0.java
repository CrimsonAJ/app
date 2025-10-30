package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class B0 extends AbstractC0909b2 {
    private static final B0 zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC0939h2 zzf = C1028z2.f15711e;
    private boolean zzg;

    static {
        B0 b02 = new B0();
        zzb = b02;
        AbstractC0909b2.j(B0.class, b02);
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
                return new B0();
            }
            return new A2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", I0.class, "zzg"});
        }
        return (byte) 1;
    }

    public final String n() {
        return this.zze;
    }
}
