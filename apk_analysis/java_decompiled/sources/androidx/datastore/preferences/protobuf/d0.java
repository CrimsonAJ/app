package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class d0 extends f0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Unsafe unsafe, int i9) {
        super(unsafe);
        this.f9695b = i9;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean c(long j, Object obj) {
        switch (this.f9695b) {
            case 0:
                if (g0.f9710g) {
                    return g0.b(j, obj);
                }
                return g0.c(j, obj);
            default:
                if (g0.f9710g) {
                    return g0.b(j, obj);
                }
                return g0.c(j, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final double d(long j, Object obj) {
        switch (this.f9695b) {
            case 0:
                return Double.longBitsToDouble(g(j, obj));
            default:
                return Double.longBitsToDouble(g(j, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final float e(long j, Object obj) {
        switch (this.f9695b) {
            case 0:
                return Float.intBitsToFloat(f(j, obj));
            default:
                return Float.intBitsToFloat(f(j, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void j(long j, Object obj, boolean z9) {
        switch (this.f9695b) {
            case 0:
                if (g0.f9710g) {
                    g0.k(obj, j, z9 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    g0.l(obj, j, z9 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (g0.f9710g) {
                    g0.k(obj, j, z9 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    g0.l(obj, j, z9 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void k(Object obj, long j, byte b9) {
        switch (this.f9695b) {
            case 0:
                if (g0.f9710g) {
                    g0.k(obj, j, b9);
                    return;
                } else {
                    g0.l(obj, j, b9);
                    return;
                }
            default:
                if (g0.f9710g) {
                    g0.k(obj, j, b9);
                    return;
                } else {
                    g0.l(obj, j, b9);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void l(Object obj, long j, double d9) {
        switch (this.f9695b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d9));
                return;
            default:
                o(obj, j, Double.doubleToLongBits(d9));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void m(Object obj, long j, float f9) {
        switch (this.f9695b) {
            case 0:
                n(Float.floatToIntBits(f9), j, obj);
                return;
            default:
                n(Float.floatToIntBits(f9), j, obj);
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean r() {
        switch (this.f9695b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
