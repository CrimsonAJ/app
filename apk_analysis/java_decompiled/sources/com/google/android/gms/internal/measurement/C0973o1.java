package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0973o1 extends AbstractC0909b2 {
    private static final C0973o1 zzb;
    private InterfaceC0939h2 zzd = C1028z2.f15711e;

    static {
        C0973o1 c0973o1 = new C0973o1();
        zzb = c0973o1;
        AbstractC0909b2.j(C0973o1.class, c0973o1);
    }

    public static C0973o1 o() {
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
                return new C0973o1();
            }
            return new A2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C0978p1.class});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zzd.size();
    }

    public final InterfaceC0939h2 p() {
        return this.zzd;
    }
}
