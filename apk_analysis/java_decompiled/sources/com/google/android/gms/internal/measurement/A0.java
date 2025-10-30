package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class A0 extends AbstractC0909b2 {
    private static final A0 zzb;
    private int zzd;
    private InterfaceC0939h2 zze;
    private InterfaceC0939h2 zzf;
    private InterfaceC0939h2 zzg;
    private boolean zzh;
    private InterfaceC0939h2 zzi;

    static {
        A0 a02 = new A0();
        zzb = a02;
        AbstractC0909b2.j(A0.class, a02);
    }

    public A0() {
        C1028z2 c1028z2 = C1028z2.f15711e;
        this.zze = c1028z2;
        this.zzf = c1028z2;
        this.zzg = c1028z2;
        this.zzi = c1028z2;
    }

    public static A0 n() {
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
                return new A0();
            }
            return new A2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzd", "zze", C1016x0.class, "zzf", C1021y0.class, "zzg", C1026z0.class, "zzh", "zzi", C1016x0.class});
        }
        return (byte) 1;
    }

    public final InterfaceC0939h2 o() {
        return this.zzg;
    }

    public final InterfaceC0939h2 p() {
        return this.zze;
    }

    public final InterfaceC0939h2 q() {
        return this.zzf;
    }

    public final List r() {
        return this.zzi;
    }

    public final boolean s() {
        return this.zzh;
    }

    public final boolean t() {
        return (this.zzd & 1) != 0;
    }
}
