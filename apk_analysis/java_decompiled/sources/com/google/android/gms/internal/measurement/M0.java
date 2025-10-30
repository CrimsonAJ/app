package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class M0 extends AbstractC0909b2 {
    private static final M0 zzb;
    private int zzd;
    private long zzh;
    private long zzl;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        M0 m02 = new M0();
        zzb = m02;
        AbstractC0909b2.j(M0.class, m02);
    }

    public static /* synthetic */ void F(M0 m02) {
        m02.zzd &= -5;
        m02.zzg = zzb.zzg;
    }

    public static /* synthetic */ void G(M0 m02) {
        m02.zzd &= -3;
        m02.zzf = zzb.zzf;
    }

    public static /* synthetic */ void H(M0 m02) {
        m02.zzd &= -2;
        m02.zze = zzb.zze;
    }

    public static /* synthetic */ void I(M0 m02) {
        m02.zzd &= -65;
        m02.zzk = zzb.zzk;
    }

    public static /* synthetic */ void J(M0 m02) {
        m02.zzd &= -33;
        m02.zzj = zzb.zzj;
    }

    public static /* synthetic */ void K(M0 m02) {
        m02.zzd &= -17;
        m02.zzi = zzb.zzi;
    }

    public static /* synthetic */ void L(M0 m02, String str) {
        m02.zzd |= 4;
        m02.zzg = str;
    }

    public static /* synthetic */ void M(M0 m02, String str) {
        m02.zzd |= 2;
        m02.zzf = str;
    }

    public static /* synthetic */ void N(M0 m02, String str) {
        m02.zzd |= 1;
        m02.zze = str;
    }

    public static /* synthetic */ void O(M0 m02, long j) {
        m02.zzd |= 8;
        m02.zzh = j;
    }

    public static /* synthetic */ void P(M0 m02, long j) {
        m02.zzd |= 128;
        m02.zzl = j;
    }

    public static /* synthetic */ void Q(M0 m02, String str) {
        m02.zzd |= 64;
        m02.zzk = str;
    }

    public static /* synthetic */ void R(M0 m02, String str) {
        m02.zzd |= 32;
        m02.zzj = str;
    }

    public static /* synthetic */ void S(M0 m02, String str) {
        m02.zzd |= 16;
        m02.zzi = str;
    }

    public static L0 x() {
        return (L0) zzb.e();
    }

    public static M0 y() {
        return zzb;
    }

    public final String A() {
        return this.zzf;
    }

    public final String B() {
        return this.zze;
    }

    public final String C() {
        return this.zzk;
    }

    public final String D() {
        return this.zzj;
    }

    public final String E() {
        return this.zzi;
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
                return new M0();
            }
            return new A2(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final boolean n() {
        return (this.zzd & 4) != 0;
    }

    public final boolean o() {
        return (this.zzd & 2) != 0;
    }

    public final boolean p() {
        return (this.zzd & 1) != 0;
    }

    public final boolean q() {
        return (this.zzd & 8) != 0;
    }

    public final boolean r() {
        return (this.zzd & 128) != 0;
    }

    public final boolean s() {
        return (this.zzd & 64) != 0;
    }

    public final boolean t() {
        return (this.zzd & 32) != 0;
    }

    public final boolean u() {
        return (this.zzd & 16) != 0;
    }

    public final long v() {
        return this.zzh;
    }

    public final long w() {
        return this.zzl;
    }

    public final String z() {
        return this.zzg;
    }
}
