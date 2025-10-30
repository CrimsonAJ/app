package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class T0 extends AbstractC0909b2 {
    private static final T0 zzb;
    private int zzd;
    private int zze;
    private long zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.b2, com.google.android.gms.internal.measurement.T0] */
    static {
        ?? abstractC0909b2 = new AbstractC0909b2();
        zzb = abstractC0909b2;
        AbstractC0909b2.j(T0.class, abstractC0909b2);
    }

    public static S0 p() {
        return (S0) zzb.e();
    }

    public static /* synthetic */ void q(T0 t02, long j) {
        t02.zzd |= 2;
        t02.zzf = j;
    }

    public static /* synthetic */ void r(T0 t02, int i9) {
        t02.zzd |= 1;
        t02.zze = i9;
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
                return new AbstractC0909b2();
            }
            return new A2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zze;
    }

    public final long o() {
        return this.zzf;
    }

    public final boolean s() {
        return (this.zzd & 2) != 0;
    }

    public final boolean t() {
        return (this.zzd & 1) != 0;
    }
}
