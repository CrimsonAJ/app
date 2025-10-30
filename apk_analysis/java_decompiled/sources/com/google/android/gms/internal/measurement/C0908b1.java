package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0908b1 extends AbstractC0909b2 {
    private static final C0908b1 zzb;
    private int zzd;
    private InterfaceC0939h2 zze = C1028z2.f15711e;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        C0908b1 c0908b1 = new C0908b1();
        zzb = c0908b1;
        AbstractC0909b2.j(C0908b1.class, c0908b1);
    }

    public static C0903a1 o() {
        return (C0903a1) zzb.e();
    }

    public static C0903a1 p(C0908b1 c0908b1) {
        AbstractC0904a2 e8 = zzb.e();
        e8.e(c0908b1);
        return (C0903a1) e8;
    }

    public static /* synthetic */ void u(C0908b1 c0908b1, ArrayList arrayList) {
        c0908b1.C();
        N1.b(arrayList, c0908b1.zze);
    }

    public static /* synthetic */ void v(C0908b1 c0908b1, C0918d1 c0918d1) {
        c0908b1.C();
        c0908b1.zze.add(c0918d1);
    }

    public static void w(C0908b1 c0908b1) {
        c0908b1.zze = C1028z2.f15711e;
    }

    public static /* synthetic */ void x(C0908b1 c0908b1, int i9, C0918d1 c0918d1) {
        c0908b1.C();
        c0908b1.zze.set(i9, c0918d1);
    }

    public static /* synthetic */ void y(C0908b1 c0908b1, String str) {
        str.getClass();
        c0908b1.zzd |= 1;
        c0908b1.zzf = str;
    }

    public static /* synthetic */ void z(C0908b1 c0908b1, String str) {
        str.getClass();
        c0908b1.zzd |= 2;
        c0908b1.zzg = str;
    }

    public final boolean A() {
        return (this.zzd & 1) != 0;
    }

    public final boolean B() {
        return (this.zzd & 2) != 0;
    }

    public final void C() {
        InterfaceC0939h2 interfaceC0939h2 = this.zze;
        if (!((O1) interfaceC0939h2).f15279a) {
            int size = interfaceC0939h2.size();
            this.zze = interfaceC0939h2.a(size + size);
        }
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
                return new C0908b1();
            }
            return new A2(zzb, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzd", "zze", C0918d1.class, "zzf", "zzg", "zzh", C0991s0.f15584g});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zze.size();
    }

    public final C0918d1 q(int i9) {
        return (C0918d1) this.zze.get(i9);
    }

    public final String r() {
        return this.zzf;
    }

    public final String s() {
        return this.zzg;
    }

    public final List t() {
        return this.zze;
    }
}
