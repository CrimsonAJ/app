package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class Y0 extends AbstractC0909b2 {
    private static final Y0 zzb;
    private int zzd;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private InterfaceC0939h2 zzj = C1028z2.f15711e;

    static {
        Y0 y02 = new Y0();
        zzb = y02;
        AbstractC0909b2.j(Y0.class, y02);
    }

    public static /* synthetic */ void A(Y0 y02) {
        y02.zzd &= -3;
        y02.zzf = zzb.zzf;
    }

    public static /* synthetic */ void B(Y0 y02, double d9) {
        y02.zzd |= 16;
        y02.zzi = d9;
    }

    public static /* synthetic */ void C(Y0 y02, long j) {
        y02.zzd |= 4;
        y02.zzg = j;
    }

    public static /* synthetic */ void D(Y0 y02, String str) {
        str.getClass();
        y02.zzd |= 1;
        y02.zze = str;
    }

    public static /* synthetic */ void E(Y0 y02, String str) {
        str.getClass();
        y02.zzd |= 2;
        y02.zzf = str;
    }

    public static X0 r() {
        return (X0) zzb.e();
    }

    public static void v(Y0 y02, ArrayList arrayList) {
        InterfaceC0939h2 interfaceC0939h2 = y02.zzj;
        if (!((O1) interfaceC0939h2).f15279a) {
            int size = interfaceC0939h2.size();
            y02.zzj = interfaceC0939h2.a(size + size);
        }
        N1.b(arrayList, y02.zzj);
    }

    public static void w(Y0 y02, Y0 y03) {
        InterfaceC0939h2 interfaceC0939h2 = y02.zzj;
        if (!((O1) interfaceC0939h2).f15279a) {
            int size = interfaceC0939h2.size();
            y02.zzj = interfaceC0939h2.a(size + size);
        }
        y02.zzj.add(y03);
    }

    public static /* synthetic */ void x(Y0 y02) {
        y02.zzd &= -17;
        y02.zzi = 0.0d;
    }

    public static /* synthetic */ void y(Y0 y02) {
        y02.zzd &= -5;
        y02.zzg = 0L;
    }

    public static void z(Y0 y02) {
        y02.zzj = C1028z2.f15711e;
    }

    public final boolean F() {
        return (this.zzd & 16) != 0;
    }

    public final boolean G() {
        return (this.zzd & 8) != 0;
    }

    public final boolean H() {
        return (this.zzd & 4) != 0;
    }

    public final boolean I() {
        return (this.zzd & 1) != 0;
    }

    public final boolean J() {
        return (this.zzd & 2) != 0;
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
                return new Y0();
            }
            return new A2(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", Y0.class});
        }
        return (byte) 1;
    }

    public final double n() {
        return this.zzi;
    }

    public final float o() {
        return this.zzh;
    }

    public final int p() {
        return this.zzj.size();
    }

    public final long q() {
        return this.zzg;
    }

    public final String s() {
        return this.zze;
    }

    public final String t() {
        return this.zzf;
    }

    public final List u() {
        return this.zzj;
    }
}
