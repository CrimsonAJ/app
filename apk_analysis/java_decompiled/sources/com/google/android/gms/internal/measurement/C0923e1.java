package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0923e1 extends AbstractC0909b2 {
    private static final C0923e1 zzb;
    private int zzd;
    private int zze = 1;
    private InterfaceC0939h2 zzf = C1028z2.f15711e;

    static {
        C0923e1 c0923e1 = new C0923e1();
        zzb = c0923e1;
        AbstractC0909b2.j(C0923e1.class, c0923e1);
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
                return new C0923e1();
            }
            return new A2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzd", "zze", C0991s0.f15585h, "zzf", W0.class});
        }
        return (byte) 1;
    }
}
