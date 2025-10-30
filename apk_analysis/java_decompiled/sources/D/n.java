package D;

import android.content.Context;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.InterfaceC0560v;
import b5.C0647m0;
import b5.C0650n0;
import b5.InterfaceC0676y0;
import b5.V;
import com.google.crypto.tink.shaded.protobuf.AbstractC1030a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import j3.D0;
import j3.E0;
import j3.Y;
import j3.r0;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import l1.C1535g;
import z2.C2235a;

/* loaded from: classes.dex */
public abstract class n implements InterfaceC0676y0, r0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f1707a;

    @Override // b5.InterfaceC0676y0
    public V A() {
        throw null;
    }

    @Override // b5.InterfaceC0676y0
    public Context G() {
        throw null;
    }

    @Override // b5.InterfaceC0676y0
    public C0647m0 K() {
        throw null;
    }

    @Override // j3.r0
    public long N() {
        return T();
    }

    @Override // b5.InterfaceC0676y0
    public K4.a S() {
        throw null;
    }

    public abstract void V(InterfaceC0560v interfaceC0560v);

    public abstract void W(C1535g c1535g);

    public abstract AbstractC1030a X(AbstractC1030a abstractC1030a);

    public String Y() {
        return null;
    }

    public Y Z() {
        E0 I4 = I();
        if (I4.p()) {
            return null;
        }
        return I4.m(z(), (D0) this.f1707a, 0L).f19305c;
    }

    public abstract EnumC0555p a0();

    public boolean b0(int i9) {
        return l().f19699a.f20498a.get(i9);
    }

    public boolean c0() {
        E0 I4 = I();
        if (!I4.p() && I4.m(z(), (D0) this.f1707a, 0L).a()) {
            return true;
        }
        return false;
    }

    public boolean d0() {
        if (e() == 3 && m() && F() == 0) {
            return true;
        }
        return false;
    }

    public Map e0() {
        return Collections.EMPTY_MAP;
    }

    public abstract AbstractC1030a f0(AbstractC1037h abstractC1037h);

    public abstract void g0(InterfaceC0560v interfaceC0560v);

    public void h0() {
        Q(-9223372036854775807L, z());
    }

    public void i0() {
        int e8;
        boolean z9;
        int e9;
        if (!I().p() && !g()) {
            E0 I4 = I();
            boolean z10 = true;
            int i9 = 0;
            if (I4.p()) {
                e8 = -1;
            } else {
                int z11 = z();
                int j = j();
                if (j == 1) {
                    j = 0;
                }
                e8 = I4.e(z11, j, L());
            }
            if (e8 != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                E0 I8 = I();
                if (I8.p()) {
                    e9 = -1;
                } else {
                    int z12 = z();
                    int j4 = j();
                    if (j4 != 1) {
                        i9 = j4;
                    }
                    e9 = I8.e(z12, i9, L());
                }
                if (e9 != -1) {
                    if (e9 == z()) {
                        h0();
                        return;
                    } else {
                        Q(-9223372036854775807L, e9);
                        return;
                    }
                }
                return;
            }
            if (c0()) {
                E0 I9 = I();
                if (I9.p() || !I9.m(z(), (D0) this.f1707a, 0L).f19311i) {
                    z10 = false;
                }
                if (z10) {
                    Q(-9223372036854775807L, z());
                }
            }
        }
    }

    public void j0() {
        int k5;
        boolean z9;
        int k9;
        boolean z10;
        int k10;
        if (!I().p() && !g()) {
            E0 I4 = I();
            int i9 = 0;
            if (I4.p()) {
                k5 = -1;
            } else {
                int z11 = z();
                int j = j();
                if (j == 1) {
                    j = 0;
                }
                k5 = I4.k(z11, j, L());
            }
            if (k5 != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (c0()) {
                E0 I8 = I();
                if (!I8.p() && I8.m(z(), (D0) this.f1707a, 0L).f19310h) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (z9) {
                        E0 I9 = I();
                        if (I9.p()) {
                            k10 = -1;
                        } else {
                            int z12 = z();
                            int j4 = j();
                            if (j4 != 1) {
                                i9 = j4;
                            }
                            k10 = I9.k(z12, i9, L());
                        }
                        if (k10 != -1) {
                            if (k10 == z()) {
                                h0();
                                return;
                            } else {
                                Q(-9223372036854775807L, k10);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            if (z9) {
                long T8 = T();
                r();
                if (T8 <= 3000) {
                    E0 I10 = I();
                    if (I10.p()) {
                        k9 = -1;
                    } else {
                        int z13 = z();
                        int j9 = j();
                        if (j9 != 1) {
                            i9 = j9;
                        }
                        k9 = I10.k(z13, i9, L());
                    }
                    if (k9 != -1) {
                        if (k9 == z()) {
                            h0();
                            return;
                        } else {
                            Q(-9223372036854775807L, k9);
                            return;
                        }
                    }
                    return;
                }
            }
            Q(0L, z());
        }
    }

    @Override // j3.r0
    public long k() {
        return T();
    }

    public abstract void k0(AbstractC1030a abstractC1030a);

    public void l0() {
        C0647m0 c0647m0 = ((C0650n0) this.f1707a).j;
        C0650n0.f(c0647m0);
        c0647m0.l0();
    }

    @Override // b5.InterfaceC0676y0
    public C2235a p() {
        throw null;
    }

    @Override // j3.r0
    public int t() {
        return z();
    }

    public n(C0650n0 c0650n0) {
        F4.y.h(c0650n0);
        this.f1707a = c0650n0;
    }

    public n(int i9) {
        switch (i9) {
            case 4:
                this.f1707a = new D0();
                return;
            default:
                this.f1707a = new AtomicReference();
                return;
        }
    }
}
