package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class G0 extends AbstractC0909b2 {
    private static final G0 zzb;
    private InterfaceC0939h2 zzd = C1028z2.f15711e;

    static {
        G0 g02 = new G0();
        zzb = g02;
        AbstractC0909b2.j(G0.class, g02);
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
                return new G0();
            }
            return new A2(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
