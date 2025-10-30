package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class V0 extends AbstractC0909b2 {
    private static final V0 zzb;
    private int zzd;
    private InterfaceC0939h2 zze = C1028z2.f15711e;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        V0 v02 = new V0();
        zzb = v02;
        AbstractC0909b2.j(V0.class, v02);
    }

    public static /* synthetic */ void A(V0 v02, int i9, Y0 y02) {
        v02.G();
        v02.zze.set(i9, y02);
    }

    public static /* synthetic */ void B(long j, V0 v02) {
        v02.zzd |= 4;
        v02.zzh = j;
    }

    public static /* synthetic */ void C(long j, V0 v02) {
        v02.zzd |= 2;
        v02.zzg = j;
    }

    public static U0 r() {
        return (U0) zzb.e();
    }

    public static /* synthetic */ void v(V0 v02, Iterable iterable) {
        v02.G();
        N1.b(iterable, v02.zze);
    }

    public static /* synthetic */ void w(V0 v02, Y0 y02) {
        y02.getClass();
        v02.G();
        v02.zze.add(y02);
    }

    public static void x(V0 v02) {
        v02.zze = C1028z2.f15711e;
    }

    public static /* synthetic */ void y(V0 v02, int i9) {
        v02.G();
        v02.zze.remove(i9);
    }

    public static /* synthetic */ void z(V0 v02, String str) {
        str.getClass();
        v02.zzd |= 1;
        v02.zzf = str;
    }

    public final boolean D() {
        return (this.zzd & 8) != 0;
    }

    public final boolean E() {
        return (this.zzd & 4) != 0;
    }

    public final boolean F() {
        return (this.zzd & 2) != 0;
    }

    public final void G() {
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
                return new V0();
            }
            return new A2(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", Y0.class, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zzi;
    }

    public final int o() {
        return this.zze.size();
    }

    public final long p() {
        return this.zzh;
    }

    public final long q() {
        return this.zzg;
    }

    public final Y0 s(int i9) {
        return (Y0) this.zze.get(i9);
    }

    public final String t() {
        return this.zzf;
    }

    public final List u() {
        return this.zze;
    }
}
