package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class R0 extends AbstractC0909b2 {
    private static final R0 zzb;
    private int zzd;
    private int zze;
    private C0933g1 zzf;
    private C0933g1 zzg;
    private boolean zzh;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.b2, com.google.android.gms.internal.measurement.R0] */
    static {
        ?? abstractC0909b2 = new AbstractC0909b2();
        zzb = abstractC0909b2;
        AbstractC0909b2.j(R0.class, abstractC0909b2);
    }

    public static Q0 o() {
        return (Q0) zzb.e();
    }

    public static /* synthetic */ void r(R0 r0, int i9) {
        r0.zzd |= 1;
        r0.zze = i9;
    }

    public static /* synthetic */ void s(R0 r0, C0933g1 c0933g1) {
        r0.zzf = c0933g1;
        r0.zzd |= 2;
    }

    public static /* synthetic */ void t(R0 r0, boolean z9) {
        r0.zzd |= 8;
        r0.zzh = z9;
    }

    public static /* synthetic */ void u(R0 r0, C0933g1 c0933g1) {
        r0.zzg = c0933g1;
        r0.zzd |= 4;
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
            return new A2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zze;
    }

    public final C0933g1 p() {
        C0933g1 c0933g1 = this.zzf;
        if (c0933g1 == null) {
            return C0933g1.s();
        }
        return c0933g1;
    }

    public final C0933g1 q() {
        C0933g1 c0933g1 = this.zzg;
        if (c0933g1 == null) {
            return C0933g1.s();
        }
        return c0933g1;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final boolean w() {
        return (this.zzd & 1) != 0;
    }

    public final boolean x() {
        return (this.zzd & 8) != 0;
    }

    public final boolean y() {
        return (this.zzd & 4) != 0;
    }
}
