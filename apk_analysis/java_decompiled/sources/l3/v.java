package l3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class v implements InterfaceC1561j {

    /* renamed from: b, reason: collision with root package name */
    public C1559h f20464b;

    /* renamed from: c, reason: collision with root package name */
    public C1559h f20465c;

    /* renamed from: d, reason: collision with root package name */
    public C1559h f20466d;

    /* renamed from: e, reason: collision with root package name */
    public C1559h f20467e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f20468f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f20469g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20470h;

    public v() {
        ByteBuffer byteBuffer = InterfaceC1561j.f20407a;
        this.f20468f = byteBuffer;
        this.f20469g = byteBuffer;
        C1559h c1559h = C1559h.f20402e;
        this.f20466d = c1559h;
        this.f20467e = c1559h;
        this.f20464b = c1559h;
        this.f20465c = c1559h;
    }

    @Override // l3.InterfaceC1561j
    public boolean a() {
        if (this.f20467e != C1559h.f20402e) {
            return true;
        }
        return false;
    }

    @Override // l3.InterfaceC1561j
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f20469g;
        this.f20469g = InterfaceC1561j.f20407a;
        return byteBuffer;
    }

    @Override // l3.InterfaceC1561j
    public final void c() {
        this.f20470h = true;
        i();
    }

    @Override // l3.InterfaceC1561j
    public boolean d() {
        if (this.f20470h && this.f20469g == InterfaceC1561j.f20407a) {
            return true;
        }
        return false;
    }

    @Override // l3.InterfaceC1561j
    public final C1559h f(C1559h c1559h) {
        this.f20466d = c1559h;
        this.f20467e = g(c1559h);
        if (a()) {
            return this.f20467e;
        }
        return C1559h.f20402e;
    }

    @Override // l3.InterfaceC1561j
    public final void flush() {
        this.f20469g = InterfaceC1561j.f20407a;
        this.f20470h = false;
        this.f20464b = this.f20466d;
        this.f20465c = this.f20467e;
        h();
    }

    public abstract C1559h g(C1559h c1559h);

    public final ByteBuffer k(int i9) {
        if (this.f20468f.capacity() < i9) {
            this.f20468f = ByteBuffer.allocateDirect(i9).order(ByteOrder.nativeOrder());
        } else {
            this.f20468f.clear();
        }
        ByteBuffer byteBuffer = this.f20468f;
        this.f20469g = byteBuffer;
        return byteBuffer;
    }

    @Override // l3.InterfaceC1561j
    public final void reset() {
        flush();
        this.f20468f = InterfaceC1561j.f20407a;
        C1559h c1559h = C1559h.f20402e;
        this.f20466d = c1559h;
        this.f20467e = c1559h;
        this.f20464b = c1559h;
        this.f20465c = c1559h;
        j();
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }
}
