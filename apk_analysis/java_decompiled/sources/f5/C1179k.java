package f5;

import java.util.concurrent.ExecutionException;

/* renamed from: f5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1179k implements InterfaceC1173e, InterfaceC1172d, InterfaceC1170b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17416a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final int f17417b;

    /* renamed from: c, reason: collision with root package name */
    public final C1185q f17418c;

    /* renamed from: d, reason: collision with root package name */
    public int f17419d;

    /* renamed from: e, reason: collision with root package name */
    public int f17420e;

    /* renamed from: f, reason: collision with root package name */
    public int f17421f;

    /* renamed from: g, reason: collision with root package name */
    public Exception f17422g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17423h;

    public C1179k(int i9, C1185q c1185q) {
        this.f17417b = i9;
        this.f17418c = c1185q;
    }

    @Override // f5.InterfaceC1170b
    public final void a() {
        synchronized (this.f17416a) {
            this.f17421f++;
            this.f17423h = true;
            b();
        }
    }

    public final void b() {
        int i9 = this.f17419d + this.f17420e + this.f17421f;
        int i10 = this.f17417b;
        if (i9 == i10) {
            Exception exc = this.f17422g;
            C1185q c1185q = this.f17418c;
            if (exc != null) {
                c1185q.n(new ExecutionException(this.f17420e + " out of " + i10 + " underlying tasks failed", this.f17422g));
                return;
            }
            if (this.f17423h) {
                c1185q.p();
            } else {
                c1185q.o(null);
            }
        }
    }

    @Override // f5.InterfaceC1173e
    public final void o(Object obj) {
        synchronized (this.f17416a) {
            this.f17419d++;
            b();
        }
    }

    @Override // f5.InterfaceC1172d
    public final void y(Exception exc) {
        synchronized (this.f17416a) {
            this.f17420e++;
            this.f17422g = exc;
            b();
        }
    }
}
