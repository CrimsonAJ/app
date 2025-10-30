package androidx.lifecycle;

import android.os.Handler;
import o1.C1671f;

/* loaded from: classes.dex */
public final class J implements InterfaceC0561w {

    /* renamed from: i, reason: collision with root package name */
    public static final J f9800i = new J();

    /* renamed from: a, reason: collision with root package name */
    public int f9801a;

    /* renamed from: b, reason: collision with root package name */
    public int f9802b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f9805e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9803c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9804d = true;

    /* renamed from: f, reason: collision with root package name */
    public final C0563y f9806f = new C0563y(this);

    /* renamed from: g, reason: collision with root package name */
    public final A6.s f9807g = new A6.s(13, this);

    /* renamed from: h, reason: collision with root package name */
    public final C1671f f9808h = new C1671f(24, this);

    public final void a() {
        int i9 = this.f9802b + 1;
        this.f9802b = i9;
        if (i9 == 1) {
            if (this.f9803c) {
                this.f9806f.o0(EnumC0554o.ON_RESUME);
                this.f9803c = false;
            } else {
                Handler handler = this.f9805e;
                kotlin.jvm.internal.h.b(handler);
                handler.removeCallbacks(this.f9807g);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0561w
    public final D.n x() {
        return this.f9806f;
    }
}
