package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0982q0 extends AbstractC0909b2 {
    private static final C0982q0 zzb;
    private int zzd;
    private C1011w0 zze;
    private C0996t0 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        C0982q0 c0982q0 = new C0982q0();
        zzb = c0982q0;
        AbstractC0909b2.j(C0982q0.class, c0982q0);
    }

    public static C0982q0 n() {
        return zzb;
    }

    public static /* synthetic */ void r(C0982q0 c0982q0, String str) {
        c0982q0.zzd |= 8;
        c0982q0.zzh = str;
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
                return new C0982q0();
            }
            return new A2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final C0996t0 o() {
        C0996t0 c0996t0 = this.zzf;
        if (c0996t0 == null) {
            return C0996t0.n();
        }
        return c0996t0;
    }

    public final C1011w0 p() {
        C1011w0 c1011w0 = this.zze;
        if (c1011w0 == null) {
            return C1011w0.o();
        }
        return c1011w0;
    }

    public final String q() {
        return this.zzh;
    }

    public final boolean s() {
        return this.zzg;
    }

    public final boolean t() {
        return (this.zzd & 4) != 0;
    }

    public final boolean u() {
        return (this.zzd & 2) != 0;
    }

    public final boolean v() {
        return (this.zzd & 8) != 0;
    }

    public final boolean w() {
        return (this.zzd & 1) != 0;
    }
}
