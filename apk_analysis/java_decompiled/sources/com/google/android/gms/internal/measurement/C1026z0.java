package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1026z0 extends AbstractC0909b2 {
    private static final C1026z0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C1026z0 c1026z0 = new C1026z0();
        zzb = c1026z0;
        AbstractC0909b2.j(C1026z0.class, c1026z0);
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
                return new C1026z0();
            }
            return new A2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final String n() {
        return this.zze;
    }
}
