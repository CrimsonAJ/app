package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class B0 extends N2 {
    private static final B0 zzb;
    private int zzd;
    private F0 zze;
    private C0887w1 zzf;
    private R2 zzg = e3.f14833e;
    private P2 zzh = O2.f14753e;

    static {
        B0 b02 = new B0();
        zzb = b02;
        N2.e(B0.class, b02);
    }

    public static A0 l() {
        return (A0) zzb.j();
    }

    public static void m(B0 b02, ArrayList arrayList) {
        RandomAccess randomAccess = b02.zzh;
        if (!((F2) randomAccess).f14714a) {
            O2 o22 = (O2) randomAccess;
            int i9 = o22.f14755c;
            b02.zzh = o22.a(i9 + i9);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((O2) b02.zzh).e(((EnumC0894y0) obj).f15166a);
        }
    }

    public static /* synthetic */ void n(B0 b02, F0 f02) {
        b02.zze = f02;
        b02.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.N2
    public final Object h(int i9, N2 n22) {
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
                    return new M2(zzb);
                }
                return new B0();
            }
            return new f3(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zzd", "zze", "zzf", "zzg", C0867r1.class, "zzh", C0886w0.f15087i});
        }
        return (byte) 1;
    }
}
