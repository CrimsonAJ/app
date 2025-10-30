package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0816e1 {

    /* renamed from: d, reason: collision with root package name */
    public static C0816e1 f14828d;

    /* renamed from: a, reason: collision with root package name */
    public long f14829a;

    /* renamed from: b, reason: collision with root package name */
    public long f14830b;

    /* renamed from: c, reason: collision with root package name */
    public int f14831c;

    public void a(double d9, double d10, long j) {
        double d11 = (0.01720197f * (((float) (j - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d11) * 0.03341960161924362d) + d11 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d11) * 0.0053d) + ((float) Math.round((r2 - 9.0E-4f) - r6)) + 9.0E-4f + ((-d10) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d12 = 0.01745329238474369d * d9;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d12))) / (Math.cos(asin) * Math.cos(d12));
        if (sin3 >= 1.0d) {
            this.f14831c = 1;
            this.f14829a = -1L;
            this.f14830b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f14831c = 0;
                this.f14829a = -1L;
                this.f14830b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f14829a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f14830b = round;
            if (round < j && this.f14829a > j) {
                this.f14831c = 0;
            } else {
                this.f14831c = 1;
            }
        }
    }
}
