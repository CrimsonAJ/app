package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0962m0 extends AbstractC0909b2 {
    private static final C0962m0 zzb;
    private int zzd;
    private int zze;
    private InterfaceC0939h2 zzf;
    private InterfaceC0939h2 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        C0962m0 c0962m0 = new C0962m0();
        zzb = c0962m0;
        AbstractC0909b2.j(C0962m0.class, c0962m0);
    }

    public C0962m0() {
        C1028z2 c1028z2 = C1028z2.f15711e;
        this.zzf = c1028z2;
        this.zzg = c1028z2;
    }

    public static void u(C0962m0 c0962m0, int i9, C0972o0 c0972o0) {
        InterfaceC0939h2 interfaceC0939h2 = c0962m0.zzg;
        if (!((O1) interfaceC0939h2).f15279a) {
            int size = interfaceC0939h2.size();
            c0962m0.zzg = interfaceC0939h2.a(size + size);
        }
        c0962m0.zzg.set(i9, c0972o0);
    }

    public static void v(C0962m0 c0962m0, int i9, C1006v0 c1006v0) {
        InterfaceC0939h2 interfaceC0939h2 = c0962m0.zzf;
        if (!((O1) interfaceC0939h2).f15279a) {
            int size = interfaceC0939h2.size();
            c0962m0.zzf = interfaceC0939h2.a(size + size);
        }
        c0962m0.zzf.set(i9, c1006v0);
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
                return new C0962m0();
            }
            return new A2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", C1006v0.class, "zzg", C0972o0.class, "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zze;
    }

    public final int o() {
        return this.zzg.size();
    }

    public final int p() {
        return this.zzf.size();
    }

    public final C0972o0 q(int i9) {
        return (C0972o0) this.zzg.get(i9);
    }

    public final C1006v0 r(int i9) {
        return (C1006v0) this.zzf.get(i9);
    }

    public final List s() {
        return this.zzg;
    }

    public final List t() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzd & 1) != 0;
    }
}
