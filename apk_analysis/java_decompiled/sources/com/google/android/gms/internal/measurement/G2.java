package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class G2 extends H2 {
    @Override // com.google.android.gms.internal.measurement.H2
    public final double a(long j, Object obj) {
        return Double.longBitsToDouble(this.f15219a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.H2
    public final float b(long j, Object obj) {
        return Float.intBitsToFloat(this.f15219a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.H2
    public final void c(long j, Object obj, boolean z9) {
        if (I2.f15230g) {
            I2.b(obj, j, z9 ? (byte) 1 : (byte) 0);
        } else {
            I2.c(obj, j, z9 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.H2
    public final void d(Object obj, long j, byte b9) {
        if (I2.f15230g) {
            I2.b(obj, j, b9);
        } else {
            I2.c(obj, j, b9);
        }
    }

    @Override // com.google.android.gms.internal.measurement.H2
    public final void e(Object obj, long j, double d9) {
        this.f15219a.putLong(obj, j, Double.doubleToLongBits(d9));
    }

    @Override // com.google.android.gms.internal.measurement.H2
    public final void f(Object obj, long j, float f9) {
        this.f15219a.putInt(obj, j, Float.floatToIntBits(f9));
    }

    @Override // com.google.android.gms.internal.measurement.H2
    public final boolean g(long j, Object obj) {
        if (I2.f15230g) {
            return I2.l(j, obj);
        }
        return I2.m(j, obj);
    }
}
