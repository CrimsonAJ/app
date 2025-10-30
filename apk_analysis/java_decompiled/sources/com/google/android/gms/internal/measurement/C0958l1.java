package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958l1 extends AbstractC0909b2 {
    private static final C0958l1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.b2, com.google.android.gms.internal.measurement.l1] */
    static {
        ?? abstractC0909b2 = new AbstractC0909b2();
        zzb = abstractC0909b2;
        AbstractC0909b2.j(C0958l1.class, abstractC0909b2);
    }

    public static C0948j1 n() {
        return (C0948j1) zzb.e();
    }

    public static C0958l1 p() {
        return zzb;
    }

    public static void q(C0958l1 c0958l1, int i9) {
        c0958l1.zzf = AbstractC0953k1.f(i9);
        c0958l1.zzd |= 2;
    }

    public static /* synthetic */ void t(C0958l1 c0958l1, int i9) {
        c0958l1.zzg = i9 - 1;
        c0958l1.zzd |= 4;
    }

    public static /* synthetic */ void u(C0958l1 c0958l1, int i9) {
        c0958l1.zze = i9 - 1;
        c0958l1.zzd |= 1;
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
            return new A2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", C0991s0.f15587k, "zzf", C0991s0.f15586i, "zzg", C0991s0.j});
        }
        return (byte) 1;
    }

    public final int o() {
        int d9 = AbstractC0953k1.d(this.zzf);
        if (d9 == 0) {
            return 1;
        }
        return d9;
    }

    public final int r() {
        int i9;
        int i10 = this.zzg;
        if (i10 != 0) {
            i9 = 2;
            if (i10 != 1) {
                int i11 = 3;
                if (i10 != 2) {
                    i9 = 4;
                    if (i10 != 3) {
                        i11 = 5;
                        if (i10 != 4) {
                            i9 = i10 != 5 ? 0 : 6;
                        }
                    }
                }
                i9 = i11;
            }
        } else {
            i9 = 1;
        }
        if (i9 == 0) {
            return 1;
        }
        return i9;
    }

    public final int s() {
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
