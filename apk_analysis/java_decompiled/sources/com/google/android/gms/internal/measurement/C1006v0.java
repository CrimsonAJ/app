package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006v0 extends AbstractC0909b2 {
    private static final C1006v0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private C0982q0 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C1006v0 c1006v0 = new C1006v0();
        zzb = c1006v0;
        AbstractC0909b2.j(C1006v0.class, c1006v0);
    }

    public static C1001u0 p() {
        return (C1001u0) zzb.e();
    }

    public static /* synthetic */ void r(C1006v0 c1006v0, String str) {
        c1006v0.zzd |= 2;
        c1006v0.zzf = str;
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
                return new C1006v0();
            }
            return new A2(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zze;
    }

    public final C0982q0 o() {
        C0982q0 c0982q0 = this.zzg;
        if (c0982q0 == null) {
            return C0982q0.n();
        }
        return c0982q0;
    }

    public final String q() {
        return this.zzf;
    }

    public final boolean s() {
        return this.zzh;
    }

    public final boolean t() {
        return this.zzi;
    }

    public final boolean u() {
        return this.zzj;
    }

    public final boolean v() {
        return (this.zzd & 1) != 0;
    }

    public final boolean w() {
        return (this.zzd & 32) != 0;
    }
}
