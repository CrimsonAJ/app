package U3;

import android.os.Handler;
import k4.J;
import q3.C1902g;
import q3.InterfaceC1907l;

/* renamed from: U3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0399f implements J {

    /* renamed from: a, reason: collision with root package name */
    public final int f7358a;

    /* renamed from: b, reason: collision with root package name */
    public final u f7359b;

    /* renamed from: c, reason: collision with root package name */
    public final C3.v f7360c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1907l f7361d;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0397d f7363f;

    /* renamed from: g, reason: collision with root package name */
    public C0400g f7364g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f7365h;
    public volatile long j;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f7362e = l4.y.l(null);

    /* renamed from: i, reason: collision with root package name */
    public volatile long f7366i = -9223372036854775807L;

    public C0399f(int i9, u uVar, C3.v vVar, InterfaceC1907l interfaceC1907l, InterfaceC0397d interfaceC0397d) {
        this.f7358a = i9;
        this.f7359b = uVar;
        this.f7360c = vVar;
        this.f7361d = interfaceC1907l;
        this.f7363f = interfaceC0397d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, c7.j] */
    @Override // k4.J
    public final void a() {
        InterfaceC0398e e8;
        InterfaceC0398e interfaceC0398e = null;
        try {
            e8 = this.f7363f.e(this.f7358a);
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f7362e.post(new N3.E(this, e8.b(), e8, 1));
            C1902g c1902g = new C1902g(e8, 0L, -1L);
            C0400g c0400g = new C0400g(this.f7359b.f7465a, this.f7358a);
            this.f7364g = c0400g;
            c0400g.i(this.f7361d);
            while (!this.f7365h) {
                if (this.f7366i != -9223372036854775807L) {
                    this.f7364g.b(this.j, this.f7366i);
                    this.f7366i = -9223372036854775807L;
                }
                if (this.f7364g.f(c1902g, new Object()) == -1) {
                    break;
                }
            }
            s8.n.h(e8);
        } catch (Throwable th2) {
            th = th2;
            interfaceC0398e = e8;
            s8.n.h(interfaceC0398e);
            throw th;
        }
    }

    @Override // k4.J
    public final void c() {
        this.f7365h = true;
    }
}
