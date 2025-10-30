package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0983q1 extends AbstractC0909b2 {
    private static final C0983q1 zzb;
    private int zzd;
    private InterfaceC0939h2 zze = C1028z2.f15711e;
    private C0973o1 zzf;

    static {
        C0983q1 c0983q1 = new C0983q1();
        zzb = c0983q1;
        AbstractC0909b2.j(C0983q1.class, c0983q1);
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
                return new C0983q1();
            }
            return new A2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", C0987r1.class, "zzf"});
        }
        return (byte) 1;
    }

    public final C0973o1 n() {
        C0973o1 c0973o1 = this.zzf;
        if (c0973o1 == null) {
            return C0973o1.o();
        }
        return c0973o1;
    }

    public final InterfaceC0939h2 o() {
        return this.zze;
    }
}
