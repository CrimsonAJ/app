package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class K0 extends AbstractC0909b2 {
    private static final K0 zzb;
    private int zzd;
    private int zzh;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";

    static {
        K0 k02 = new K0();
        zzb = k02;
        AbstractC0909b2.j(K0.class, k02);
    }

    public static K0 o() {
        return zzb;
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
                return new K0();
            }
            return new A2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zzh;
    }

    public final String p() {
        return this.zzf;
    }

    public final String q() {
        return this.zzi;
    }

    public final String r() {
        return this.zze;
    }
}
