package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0972o0 extends AbstractC0909b2 {
    private static final C0972o0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private InterfaceC0939h2 zzg = C1028z2.f15711e;
    private boolean zzh;
    private C0996t0 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C0972o0 c0972o0 = new C0972o0();
        zzb = c0972o0;
        AbstractC0909b2.j(C0972o0.class, c0972o0);
    }

    public static C0967n0 p() {
        return (C0967n0) zzb.e();
    }

    public static /* synthetic */ void u(C0972o0 c0972o0, String str) {
        c0972o0.zzd |= 2;
        c0972o0.zzf = str;
    }

    public static void v(C0972o0 c0972o0, int i9, C0982q0 c0982q0) {
        InterfaceC0939h2 interfaceC0939h2 = c0972o0.zzg;
        if (!((O1) interfaceC0939h2).f15279a) {
            int size = interfaceC0939h2.size();
            c0972o0.zzg = interfaceC0939h2.a(size + size);
        }
        c0972o0.zzg.set(i9, c0982q0);
    }

    public final boolean A() {
        return (this.zzd & 1) != 0;
    }

    public final boolean B() {
        return (this.zzd & 64) != 0;
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
                return new C0972o0();
            }
            return new A2(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", C0982q0.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zzg.size();
    }

    public final int o() {
        return this.zze;
    }

    public final C0982q0 q(int i9) {
        return (C0982q0) this.zzg.get(i9);
    }

    public final C0996t0 r() {
        C0996t0 c0996t0 = this.zzi;
        if (c0996t0 == null) {
            return C0996t0.n();
        }
        return c0996t0;
    }

    public final String s() {
        return this.zzf;
    }

    public final List t() {
        return this.zzg;
    }

    public final boolean w() {
        return this.zzj;
    }

    public final boolean x() {
        return this.zzk;
    }

    public final boolean y() {
        return this.zzl;
    }

    public final boolean z() {
        return (this.zzd & 8) != 0;
    }
}
