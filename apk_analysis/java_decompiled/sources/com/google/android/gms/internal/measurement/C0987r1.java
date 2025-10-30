package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0987r1 extends AbstractC0909b2 {
    private static final C0987r1 zzb;
    private int zzd;
    private int zze;
    private InterfaceC0939h2 zzf = C1028z2.f15711e;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        C0987r1 c0987r1 = new C0987r1();
        zzb = c0987r1;
        AbstractC0909b2.j(C0987r1.class, c0987r1);
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
                return new C0987r1();
            }
            return new A2(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", C0991s0.f15588l, "zzf", C0987r1.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }

    public final double n() {
        return this.zzj;
    }

    public final String o() {
        return this.zzg;
    }

    public final String p() {
        return this.zzh;
    }

    public final InterfaceC0939h2 q() {
        return this.zzf;
    }

    public final boolean r() {
        return this.zzi;
    }

    public final boolean s() {
        return (this.zzd & 8) != 0;
    }

    public final boolean t() {
        return (this.zzd & 16) != 0;
    }

    public final boolean u() {
        return (this.zzd & 4) != 0;
    }

    public final int v() {
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
