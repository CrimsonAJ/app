package f5;

import d2.v;
import java.util.concurrent.Executor;

/* renamed from: f5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1181m implements InterfaceC1182n, InterfaceC1173e, InterfaceC1172d, InterfaceC1170b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17428a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f17429b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17430c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17431d;

    public C1181m(Executor executor, InterfaceC1170b interfaceC1170b) {
        this.f17428a = 0;
        this.f17430c = new Object();
        this.f17429b = executor;
        this.f17431d = interfaceC1170b;
    }

    private final void c(AbstractC1176h abstractC1176h) {
        synchronized (this.f17430c) {
        }
        this.f17429b.execute(new v(this, 5, abstractC1176h));
    }

    private final void d(AbstractC1176h abstractC1176h) {
        if (!abstractC1176h.j() && !((C1185q) abstractC1176h).f17438d) {
            synchronized (this.f17430c) {
                try {
                    if (((InterfaceC1172d) this.f17431d) == null) {
                        return;
                    }
                    this.f17429b.execute(new v(this, 6, abstractC1176h));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final void e(AbstractC1176h abstractC1176h) {
        if (abstractC1176h.j()) {
            synchronized (this.f17430c) {
                try {
                    if (((InterfaceC1173e) this.f17431d) == null) {
                        return;
                    }
                    this.f17429b.execute(new v(this, 7, abstractC1176h));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // f5.InterfaceC1170b
    public void a() {
        ((C1185q) this.f17431d).p();
    }

    @Override // f5.InterfaceC1182n
    public final void b(AbstractC1176h abstractC1176h) {
        switch (this.f17428a) {
            case 0:
                if (((C1185q) abstractC1176h).f17438d) {
                    synchronized (this.f17430c) {
                        try {
                            if (((InterfaceC1170b) this.f17431d) != null) {
                                this.f17429b.execute(new A4.e(24, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                c(abstractC1176h);
                return;
            case 2:
                d(abstractC1176h);
                return;
            case 3:
                e(abstractC1176h);
                return;
            default:
                this.f17429b.execute(new v(this, 8, abstractC1176h));
                return;
        }
    }

    @Override // f5.InterfaceC1173e
    public void o(Object obj) {
        ((C1185q) this.f17431d).o(obj);
    }

    @Override // f5.InterfaceC1172d
    public void y(Exception exc) {
        ((C1185q) this.f17431d).n(exc);
    }

    public C1181m(Executor executor, InterfaceC1171c interfaceC1171c) {
        this.f17428a = 1;
        this.f17430c = new Object();
        this.f17429b = executor;
        this.f17431d = interfaceC1171c;
    }

    public C1181m(Executor executor, InterfaceC1172d interfaceC1172d) {
        this.f17428a = 2;
        this.f17430c = new Object();
        this.f17429b = executor;
        this.f17431d = interfaceC1172d;
    }

    public C1181m(Executor executor, InterfaceC1173e interfaceC1173e) {
        this.f17428a = 3;
        this.f17430c = new Object();
        this.f17429b = executor;
        this.f17431d = interfaceC1173e;
    }

    public C1181m(Executor executor, InterfaceC1175g interfaceC1175g, C1185q c1185q) {
        this.f17428a = 4;
        this.f17429b = executor;
        this.f17430c = interfaceC1175g;
        this.f17431d = c1185q;
    }
}
