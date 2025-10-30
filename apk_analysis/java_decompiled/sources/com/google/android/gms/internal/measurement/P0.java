package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class P0 extends AbstractC0909b2 {
    private static final P0 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.b2, com.google.android.gms.internal.measurement.P0] */
    static {
        ?? abstractC0909b2 = new AbstractC0909b2();
        zzb = abstractC0909b2;
        AbstractC0909b2.j(P0.class, abstractC0909b2);
    }

    public static O0 n() {
        return (O0) zzb.e();
    }

    public static P0 o() {
        return zzb;
    }

    public static /* synthetic */ void p(P0 p02, boolean z9) {
        p02.zzd |= 32;
        p02.zzj = z9;
    }

    public static /* synthetic */ void q(P0 p02, boolean z9) {
        p02.zzd |= 16;
        p02.zzi = z9;
    }

    public static /* synthetic */ void r(P0 p02, boolean z9) {
        p02.zzd |= 1;
        p02.zze = z9;
    }

    public static /* synthetic */ void s(P0 p02, boolean z9) {
        p02.zzd |= 64;
        p02.zzk = z9;
    }

    public static /* synthetic */ void t(P0 p02, boolean z9) {
        p02.zzd |= 2;
        p02.zzf = z9;
    }

    public static /* synthetic */ void u(P0 p02, boolean z9) {
        p02.zzd |= 4;
        p02.zzg = z9;
    }

    public static /* synthetic */ void v(P0 p02, boolean z9) {
        p02.zzd |= 8;
        p02.zzh = z9;
    }

    public final boolean A() {
        return this.zzf;
    }

    public final boolean B() {
        return this.zzg;
    }

    public final boolean C() {
        return this.zzh;
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
            return new A2(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final boolean w() {
        return this.zzj;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zze;
    }

    public final boolean z() {
        return this.zzk;
    }
}
