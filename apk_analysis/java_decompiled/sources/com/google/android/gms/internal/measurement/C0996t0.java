package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0996t0 extends AbstractC0909b2 {
    private static final C0996t0 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C0996t0 c0996t0 = new C0996t0();
        zzb = c0996t0;
        AbstractC0909b2.j(C0996t0.class, c0996t0);
    }

    public static C0996t0 n() {
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
                return new C0996t0();
            }
            return new A2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", C0991s0.f15579b, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final String o() {
        return this.zzg;
    }

    public final String p() {
        return this.zzi;
    }

    public final String q() {
        return this.zzh;
    }

    public final boolean r() {
        return this.zzf;
    }

    public final boolean s() {
        return (this.zzd & 1) != 0;
    }

    public final boolean t() {
        return (this.zzd & 4) != 0;
    }

    public final boolean u() {
        return (this.zzd & 2) != 0;
    }

    public final boolean v() {
        return (this.zzd & 16) != 0;
    }

    public final boolean w() {
        return (this.zzd & 8) != 0;
    }

    public final int x() {
        int i9;
        int i10 = this.zze;
        if (i10 != 0) {
            i9 = 2;
            if (i10 != 1) {
                if (i10 != 2) {
                    i9 = 4;
                    if (i10 != 3) {
                        i9 = i10 != 4 ? 0 : 5;
                    }
                } else {
                    i9 = 3;
                }
            }
        } else {
            i9 = 1;
        }
        if (i9 == 0) {
            return 1;
        }
        return i9;
    }
}
