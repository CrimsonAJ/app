package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class F0 extends AbstractC0909b2 {
    private static final F0 zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private int zzg;
    private InterfaceC0939h2 zzh;
    private InterfaceC0939h2 zzi;
    private InterfaceC0939h2 zzj;
    private String zzk;
    private boolean zzl;
    private InterfaceC0939h2 zzm;
    private InterfaceC0939h2 zzn;
    private String zzo;
    private String zzp;
    private A0 zzq;
    private H0 zzr;
    private K0 zzs;
    private I0 zzt;
    private G0 zzu;

    static {
        F0 f02 = new F0();
        zzb = f02;
        AbstractC0909b2.j(F0.class, f02);
    }

    public F0() {
        C1028z2 c1028z2 = C1028z2.f15711e;
        this.zzh = c1028z2;
        this.zzi = c1028z2;
        this.zzj = c1028z2;
        this.zzk = "";
        this.zzm = c1028z2;
        this.zzn = c1028z2;
        this.zzo = "";
        this.zzp = "";
    }

    public static void B(F0 f02) {
        f02.zzj = C1028z2.f15711e;
    }

    public static void C(F0 f02) {
        f02.zzm = C1028z2.f15711e;
    }

    public static void D(F0 f02, int i9, D0 d02) {
        InterfaceC0939h2 interfaceC0939h2 = f02.zzi;
        if (!((O1) interfaceC0939h2).f15279a) {
            int size = interfaceC0939h2.size();
            f02.zzi = interfaceC0939h2.a(size + size);
        }
        f02.zzi.set(i9, d02);
    }

    public static E0 s() {
        return (E0) zzb.e();
    }

    public static F0 t() {
        return zzb;
    }

    public final List A() {
        return this.zzh;
    }

    public final boolean E() {
        return (this.zzd & 128) != 0;
    }

    public final boolean F() {
        return (this.zzd & 2) != 0;
    }

    public final boolean G() {
        return (this.zzd & 512) != 0;
    }

    public final boolean H() {
        return (this.zzd & 1) != 0;
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
                return new F0();
            }
            return new A2(zzb, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", J0.class, "zzi", D0.class, "zzj", C0962m0.class, "zzk", "zzl", "zzm", C0983q1.class, "zzn", B0.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zzm.size();
    }

    public final int o() {
        return this.zzi.size();
    }

    public final long p() {
        return this.zze;
    }

    public final A0 q() {
        A0 a02 = this.zzq;
        if (a02 == null) {
            return A0.n();
        }
        return a02;
    }

    public final D0 r(int i9) {
        return (D0) this.zzi.get(i9);
    }

    public final K0 u() {
        K0 k02 = this.zzs;
        if (k02 == null) {
            return K0.o();
        }
        return k02;
    }

    public final String v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzo;
    }

    public final InterfaceC0939h2 x() {
        return this.zzj;
    }

    public final InterfaceC0939h2 y() {
        return this.zzn;
    }

    public final InterfaceC0939h2 z() {
        return this.zzm;
    }
}
