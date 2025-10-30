package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class l3 extends n3 {
    @Override // com.google.android.gms.internal.cast.n3
    public final double a(long j, Object obj) {
        return Double.longBitsToDouble(this.f14932a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.cast.n3
    public final float b(long j, Object obj) {
        return Float.intBitsToFloat(this.f14932a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.cast.n3
    public final void c(long j, Object obj, boolean z9) {
        if (o3.f14941g) {
            o3.b(obj, j, z9 ? (byte) 1 : (byte) 0);
        } else {
            o3.c(obj, j, z9 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.cast.n3
    public final void d(Object obj, long j, byte b9) {
        if (o3.f14941g) {
            o3.b(obj, j, b9);
        } else {
            o3.c(obj, j, b9);
        }
    }

    @Override // com.google.android.gms.internal.cast.n3
    public final void e(Object obj, long j, double d9) {
        this.f14932a.putLong(obj, j, Double.doubleToLongBits(d9));
    }

    @Override // com.google.android.gms.internal.cast.n3
    public final void f(Object obj, long j, float f9) {
        this.f14932a.putInt(obj, j, Float.floatToIntBits(f9));
    }

    @Override // com.google.android.gms.internal.cast.n3
    public final boolean g(long j, Object obj) {
        if (o3.f14941g) {
            return o3.l(j, obj);
        }
        return o3.m(j, obj);
    }
}
