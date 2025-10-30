package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0968n1 extends AbstractC0909b2 {
    private static final C0968n1 zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        C0968n1 c0968n1 = new C0968n1();
        zzb = c0968n1;
        AbstractC0909b2.j(C0968n1.class, c0968n1);
    }

    public static /* synthetic */ void A(C0968n1 c0968n1, long j) {
        c0968n1.zzd |= 1;
        c0968n1.zze = j;
    }

    public static /* synthetic */ void B(C0968n1 c0968n1, String str) {
        str.getClass();
        c0968n1.zzd |= 4;
        c0968n1.zzg = str;
    }

    public static C0963m1 r() {
        return (C0963m1) zzb.e();
    }

    public static /* synthetic */ void u(C0968n1 c0968n1) {
        c0968n1.zzd &= -33;
        c0968n1.zzj = 0.0d;
    }

    public static /* synthetic */ void v(C0968n1 c0968n1) {
        c0968n1.zzd &= -9;
        c0968n1.zzh = 0L;
    }

    public static /* synthetic */ void w(C0968n1 c0968n1) {
        c0968n1.zzd &= -5;
        c0968n1.zzg = zzb.zzg;
    }

    public static /* synthetic */ void x(C0968n1 c0968n1, double d9) {
        c0968n1.zzd |= 32;
        c0968n1.zzj = d9;
    }

    public static /* synthetic */ void y(C0968n1 c0968n1, long j) {
        c0968n1.zzd |= 8;
        c0968n1.zzh = j;
    }

    public static /* synthetic */ void z(C0968n1 c0968n1, String str) {
        str.getClass();
        c0968n1.zzd |= 2;
        c0968n1.zzf = str;
    }

    public final boolean C() {
        return (this.zzd & 32) != 0;
    }

    public final boolean D() {
        return (this.zzd & 16) != 0;
    }

    public final boolean E() {
        return (this.zzd & 8) != 0;
    }

    public final boolean F() {
        return (this.zzd & 1) != 0;
    }

    public final boolean G() {
        return (this.zzd & 4) != 0;
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
                return new C0968n1();
            }
            return new A2(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final double n() {
        return this.zzj;
    }

    public final float o() {
        return this.zzi;
    }

    public final long p() {
        return this.zzh;
    }

    public final long q() {
        return this.zze;
    }

    public final String s() {
        return this.zzf;
    }

    public final String t() {
        return this.zzg;
    }
}
