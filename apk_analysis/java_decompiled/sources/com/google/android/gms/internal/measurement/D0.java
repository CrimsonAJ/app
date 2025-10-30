package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class D0 extends AbstractC0909b2 {
    private static final D0 zzb;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        D0 d02 = new D0();
        zzb = d02;
        AbstractC0909b2.j(D0.class, d02);
    }

    public static /* synthetic */ void p(D0 d02, String str) {
        str.getClass();
        d02.zzd |= 1;
        d02.zze = str;
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
                return new D0();
            }
            return new A2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zzh;
    }

    public final String o() {
        return this.zze;
    }

    public final boolean q() {
        return this.zzf;
    }

    public final boolean r() {
        return this.zzg;
    }

    public final boolean s() {
        return (this.zzd & 2) != 0;
    }

    public final boolean t() {
        return (this.zzd & 4) != 0;
    }

    public final boolean u() {
        return (this.zzd & 8) != 0;
    }
}
