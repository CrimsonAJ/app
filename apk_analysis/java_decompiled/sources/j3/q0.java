package j3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q0 implements InterfaceC1453f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19719a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19720b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f19721c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19722d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19723e;

    /* renamed from: f, reason: collision with root package name */
    public final long f19724f;

    /* renamed from: g, reason: collision with root package name */
    public final long f19725g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19726h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19727i;

    public q0(Object obj, int i9, Y y9, Object obj2, int i10, long j, long j4, int i11, int i12) {
        this.f19719a = obj;
        this.f19720b = i9;
        this.f19721c = y9;
        this.f19722d = obj2;
        this.f19723e = i10;
        this.f19724f = j;
        this.f19725g = j4;
        this.f19726h = i11;
        this.f19727i = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass()) {
            q0 q0Var = (q0) obj;
            if (this.f19720b == q0Var.f19720b && this.f19723e == q0Var.f19723e && this.f19724f == q0Var.f19724f && this.f19725g == q0Var.f19725g && this.f19726h == q0Var.f19726h && this.f19727i == q0Var.f19727i && M4.a.l(this.f19719a, q0Var.f19719a) && M4.a.l(this.f19722d, q0Var.f19722d) && M4.a.l(this.f19721c, q0Var.f19721c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19719a, Integer.valueOf(this.f19720b), this.f19721c, this.f19722d, Integer.valueOf(this.f19723e), Long.valueOf(this.f19724f), Long.valueOf(this.f19725g), Integer.valueOf(this.f19726h), Integer.valueOf(this.f19727i)});
    }
}
