package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0933g1 extends AbstractC0909b2 {
    private static final C0933g1 zzb;
    private InterfaceC0934g2 zzd;
    private InterfaceC0934g2 zze;
    private InterfaceC0939h2 zzf;
    private InterfaceC0939h2 zzg;

    static {
        C0933g1 c0933g1 = new C0933g1();
        zzb = c0933g1;
        AbstractC0909b2.j(C0933g1.class, c0933g1);
    }

    public C0933g1() {
        C0969n2 c0969n2 = C0969n2.f15552e;
        this.zzd = c0969n2;
        this.zze = c0969n2;
        C1028z2 c1028z2 = C1028z2.f15711e;
        this.zzf = c1028z2;
        this.zzg = c1028z2;
    }

    public static void A(C0933g1 c0933g1, List list) {
        RandomAccess randomAccess = c0933g1.zzd;
        if (!((O1) randomAccess).f15279a) {
            C0969n2 c0969n2 = (C0969n2) randomAccess;
            int i9 = c0969n2.f15554c;
            c0933g1.zzd = c0969n2.a(i9 + i9);
        }
        N1.b(list, c0933g1.zzd);
    }

    public static void B(C0933g1 c0933g1) {
        c0933g1.zzf = C1028z2.f15711e;
    }

    public static void C(C0933g1 c0933g1) {
        c0933g1.zze = C0969n2.f15552e;
    }

    public static void D(C0933g1 c0933g1) {
        c0933g1.zzg = C1028z2.f15711e;
    }

    public static void E(C0933g1 c0933g1) {
        c0933g1.zzd = C0969n2.f15552e;
    }

    public static C0928f1 r() {
        return (C0928f1) zzb.e();
    }

    public static C0933g1 s() {
        return zzb;
    }

    public static void x(C0933g1 c0933g1, ArrayList arrayList) {
        InterfaceC0939h2 interfaceC0939h2 = c0933g1.zzf;
        if (!((O1) interfaceC0939h2).f15279a) {
            int size = interfaceC0939h2.size();
            c0933g1.zzf = interfaceC0939h2.a(size + size);
        }
        N1.b(arrayList, c0933g1.zzf);
    }

    public static void y(C0933g1 c0933g1, List list) {
        RandomAccess randomAccess = c0933g1.zze;
        if (!((O1) randomAccess).f15279a) {
            C0969n2 c0969n2 = (C0969n2) randomAccess;
            int i9 = c0969n2.f15554c;
            c0933g1.zze = c0969n2.a(i9 + i9);
        }
        N1.b(list, c0933g1.zze);
    }

    public static void z(C0933g1 c0933g1, List list) {
        InterfaceC0939h2 interfaceC0939h2 = c0933g1.zzg;
        if (!((O1) interfaceC0939h2).f15279a) {
            int size = interfaceC0939h2.size();
            c0933g1.zzg = interfaceC0939h2.a(size + size);
        }
        N1.b(list, c0933g1.zzg);
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
                return new C0933g1();
            }
            return new A2(zzb, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", T0.class, "zzg", C0943i1.class});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zzf.size();
    }

    public final int o() {
        return ((C0969n2) this.zze).size();
    }

    public final int p() {
        return this.zzg.size();
    }

    public final int q() {
        return ((C0969n2) this.zzd).size();
    }

    public final List t() {
        return this.zzf;
    }

    public final List u() {
        return this.zze;
    }

    public final List v() {
        return this.zzg;
    }

    public final InterfaceC0934g2 w() {
        return this.zzd;
    }
}
