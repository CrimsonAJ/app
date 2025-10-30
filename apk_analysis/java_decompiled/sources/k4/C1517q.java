package k4;

import java.util.Arrays;

/* renamed from: k4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1517q {

    /* renamed from: c, reason: collision with root package name */
    public int f20087c;

    /* renamed from: d, reason: collision with root package name */
    public int f20088d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20085a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f20086b = 65536;

    /* renamed from: e, reason: collision with root package name */
    public int f20089e = 0;

    /* renamed from: f, reason: collision with root package name */
    public C1501a[] f20090f = new C1501a[100];

    public final synchronized void a(int i9) {
        boolean z9;
        if (i9 < this.f20087c) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f20087c = i9;
        if (z9) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, l4.y.f(this.f20087c, this.f20086b) - this.f20088d);
        int i9 = this.f20089e;
        if (max >= i9) {
            return;
        }
        Arrays.fill(this.f20090f, max, i9, (Object) null);
        this.f20089e = max;
    }
}
