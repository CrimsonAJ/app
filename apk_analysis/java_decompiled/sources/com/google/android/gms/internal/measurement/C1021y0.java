package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1021y0 extends AbstractC0909b2 {
    private static final C1021y0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.b2, com.google.android.gms.internal.measurement.y0] */
    static {
        ?? abstractC0909b2 = new AbstractC0909b2();
        zzb = abstractC0909b2;
        AbstractC0909b2.j(C1021y0.class, abstractC0909b2);
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
            C0991s0 c0991s0 = C0991s0.f15582e;
            return new A2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", c0991s0, "zzf", c0991s0});
        }
        return (byte) 1;
    }

    public final int n() {
        int j02 = s8.e.j0(this.zzf);
        if (j02 == 0) {
            return 1;
        }
        return j02;
    }

    public final int o() {
        int j02 = s8.e.j0(this.zze);
        if (j02 == 0) {
            return 1;
        }
        return j02;
    }
}
