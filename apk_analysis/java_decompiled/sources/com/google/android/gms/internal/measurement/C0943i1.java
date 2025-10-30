package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0943i1 extends AbstractC0909b2 {
    private static final C0943i1 zzb;
    private int zzd;
    private int zze;
    private InterfaceC0934g2 zzf = C0969n2.f15552e;

    static {
        C0943i1 c0943i1 = new C0943i1();
        zzb = c0943i1;
        AbstractC0909b2.j(C0943i1.class, c0943i1);
    }

    public static C0938h1 q() {
        return (C0938h1) zzb.e();
    }

    public static void s(C0943i1 c0943i1, List list) {
        RandomAccess randomAccess = c0943i1.zzf;
        if (!((O1) randomAccess).f15279a) {
            C0969n2 c0969n2 = (C0969n2) randomAccess;
            int i9 = c0969n2.f15554c;
            c0943i1.zzf = c0969n2.a(i9 + i9);
        }
        N1.b(list, c0943i1.zzf);
    }

    public static /* synthetic */ void t(C0943i1 c0943i1, int i9) {
        c0943i1.zzd |= 1;
        c0943i1.zze = i9;
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
                return new C0943i1();
            }
            return new A2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final int n() {
        return ((C0969n2) this.zzf).size();
    }

    public final int o() {
        return this.zze;
    }

    public final long p(int i9) {
        return ((C0969n2) this.zzf).c(i9);
    }

    public final List r() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzd & 1) != 0;
    }
}
