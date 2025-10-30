package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011w0 extends AbstractC0909b2 {
    private static final C1011w0 zzb;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private InterfaceC0939h2 zzh = C1028z2.f15711e;

    static {
        C1011w0 c1011w0 = new C1011w0();
        zzb = c1011w0;
        AbstractC0909b2.j(C1011w0.class, c1011w0);
    }

    public static C1011w0 o() {
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
                return new C1011w0();
            }
            return new A2(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", C0991s0.f15580c, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final int n() {
        return this.zzh.size();
    }

    public final String p() {
        return this.zzf;
    }

    public final InterfaceC0939h2 q() {
        return this.zzh;
    }

    public final boolean r() {
        return this.zzg;
    }

    public final boolean s() {
        return (this.zzd & 4) != 0;
    }

    public final boolean t() {
        return (this.zzd & 2) != 0;
    }

    public final boolean u() {
        return (this.zzd & 1) != 0;
    }

    public final int v() {
        int i9;
        switch (this.zze) {
            case 0:
                i9 = 1;
                break;
            case 1:
                i9 = 2;
                break;
            case 2:
                i9 = 3;
                break;
            case 3:
                i9 = 4;
                break;
            case 4:
                i9 = 5;
                break;
            case 5:
                i9 = 6;
                break;
            case 6:
                i9 = 7;
                break;
            default:
                i9 = 0;
                break;
        }
        if (i9 == 0) {
            return 1;
        }
        return i9;
    }
}
