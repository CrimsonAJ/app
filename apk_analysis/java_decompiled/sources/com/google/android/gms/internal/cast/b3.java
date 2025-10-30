package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class b3 implements g3 {

    /* renamed from: a, reason: collision with root package name */
    public final E2 f14816a;

    /* renamed from: b, reason: collision with root package name */
    public final C0886w0 f14817b;

    public b3(C0886w0 c0886w0, E2 e22) {
        C0886w0 c0886w02 = K2.f14739a;
        this.f14817b = c0886w0;
        this.f14816a = e22;
    }

    @Override // com.google.android.gms.internal.cast.g3
    public final void a(Object obj, W2 w22) {
        throw AbstractC0953k1.i(obj);
    }

    @Override // com.google.android.gms.internal.cast.g3
    public final void b(Object obj) {
        this.f14817b.getClass();
        j3 j3Var = ((N2) obj).zzc;
        if (j3Var.f14897d) {
            j3Var.f14897d = false;
        }
        C0886w0 c0886w0 = K2.f14739a;
        throw AbstractC0953k1.i(obj);
    }

    @Override // com.google.android.gms.internal.cast.g3
    public final int c(N2 n22) {
        j3 j3Var = n22.zzc;
        int i9 = j3Var.f14896c;
        if (i9 == -1) {
            j3Var.f14896c = 0;
            return 0;
        }
        return i9;
    }

    @Override // com.google.android.gms.internal.cast.g3
    public final boolean d(Object obj) {
        throw AbstractC0953k1.i(obj);
    }

    @Override // com.google.android.gms.internal.cast.g3
    public final boolean e(N2 n22, N2 n23) {
        if (!n22.zzc.equals(n23.zzc)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.cast.g3
    public final void f(Object obj, Object obj2) {
        h3.n(obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.g3
    public final int g(N2 n22) {
        n22.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.cast.g3
    public final N2 l() {
        E2 e22 = this.f14816a;
        if (e22 instanceof N2) {
            return (N2) ((N2) e22).h(4, null);
        }
        return ((M2) ((N2) e22).h(5, null)).c();
    }
}
