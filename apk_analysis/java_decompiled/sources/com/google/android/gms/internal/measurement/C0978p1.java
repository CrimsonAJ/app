package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0978p1 extends AbstractC0909b2 {
    private static final C0978p1 zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC0939h2 zzf = C1028z2.f15711e;

    static {
        C0978p1 c0978p1 = new C0978p1();
        zzb = c0978p1;
        AbstractC0909b2.j(C0978p1.class, c0978p1);
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
                return new C0978p1();
            }
            return new A2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C0987r1.class});
        }
        return (byte) 1;
    }

    public final String n() {
        return this.zze;
    }

    public final InterfaceC0939h2 o() {
        return this.zzf;
    }
}
