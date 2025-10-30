package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public abstract class M2 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final N2 f14747a;

    /* renamed from: b, reason: collision with root package name */
    public N2 f14748b;

    public M2(N2 n22) {
        this.f14747a = n22;
        if (!n22.g()) {
            this.f14748b = (N2) n22.h(4, null);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final N2 b() {
        N2 c3 = c();
        c3.getClass();
        boolean z9 = true;
        N2 n22 = null;
        byte byteValue = ((Byte) c3.h(1, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z9 = false;
            } else {
                boolean d9 = d3.f14823c.a(c3.getClass()).d(c3);
                if (true == d9) {
                    n22 = c3;
                }
                c3.h(2, n22);
                z9 = d9;
            }
        }
        if (z9) {
            return c3;
        }
        throw new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final N2 c() {
        if (!this.f14748b.g()) {
            return this.f14748b;
        }
        N2 n22 = this.f14748b;
        n22.getClass();
        d3.f14823c.a(n22.getClass()).b(n22);
        n22.d();
        return this.f14748b;
    }

    public final Object clone() {
        M2 m22 = (M2) this.f14747a.h(5, null);
        m22.f14748b = c();
        return m22;
    }

    public final void e() {
        if (!this.f14748b.g()) {
            N2 n22 = (N2) this.f14747a.h(4, null);
            d3.f14823c.a(n22.getClass()).f(n22, this.f14748b);
            this.f14748b = n22;
        }
    }
}
