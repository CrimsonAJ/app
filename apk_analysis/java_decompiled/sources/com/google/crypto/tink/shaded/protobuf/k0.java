package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class k0 extends m0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16380b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Unsafe unsafe, int i9) {
        super(unsafe);
        this.f16380b = i9;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final boolean c(long j, Object obj) {
        switch (this.f16380b) {
            case 0:
                if (n0.f16391g) {
                    if (n0.h(j, obj) == 0) {
                        return false;
                    }
                } else if (n0.i(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (n0.f16391g) {
                    if (n0.h(j, obj) == 0) {
                        return false;
                    }
                } else if (n0.i(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final byte d(long j, Object obj) {
        switch (this.f16380b) {
            case 0:
                if (n0.f16391g) {
                    return n0.h(j, obj);
                }
                return n0.i(j, obj);
            default:
                if (n0.f16391g) {
                    return n0.h(j, obj);
                }
                return n0.i(j, obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final double e(long j, Object obj) {
        switch (this.f16380b) {
            case 0:
                return Double.longBitsToDouble(h(j, obj));
            default:
                return Double.longBitsToDouble(h(j, obj));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final float f(long j, Object obj) {
        switch (this.f16380b) {
            case 0:
                return Float.intBitsToFloat(g(j, obj));
            default:
                return Float.intBitsToFloat(g(j, obj));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void k(long j, Object obj, boolean z9) {
        switch (this.f16380b) {
            case 0:
                if (n0.f16391g) {
                    n0.l(obj, j, z9 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    n0.m(obj, j, z9 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (n0.f16391g) {
                    n0.l(obj, j, z9 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    n0.m(obj, j, z9 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void l(Object obj, long j, byte b9) {
        switch (this.f16380b) {
            case 0:
                if (n0.f16391g) {
                    n0.l(obj, j, b9);
                    return;
                } else {
                    n0.m(obj, j, b9);
                    return;
                }
            default:
                if (n0.f16391g) {
                    n0.l(obj, j, b9);
                    return;
                } else {
                    n0.m(obj, j, b9);
                    return;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void m(Object obj, long j, double d9) {
        switch (this.f16380b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d9));
                return;
            default:
                p(obj, j, Double.doubleToLongBits(d9));
                return;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void n(Object obj, long j, float f9) {
        switch (this.f16380b) {
            case 0:
                o(Float.floatToIntBits(f9), j, obj);
                return;
            default:
                o(Float.floatToIntBits(f9), j, obj);
                return;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final boolean s() {
        switch (this.f16380b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
