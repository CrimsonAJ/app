package f5;

import F4.y;
import com.google.android.gms.internal.measurement.C1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: f5.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1185q extends AbstractC1176h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17435a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C1 f17436b = new C1(4);

    /* renamed from: c, reason: collision with root package name */
    public boolean f17437c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f17438d;

    /* renamed from: e, reason: collision with root package name */
    public Object f17439e;

    /* renamed from: f, reason: collision with root package name */
    public Exception f17440f;

    @Override // f5.AbstractC1176h
    public final C1185q a(Executor executor, InterfaceC1170b interfaceC1170b) {
        this.f17436b.f(new C1181m(executor, interfaceC1170b));
        s();
        return this;
    }

    @Override // f5.AbstractC1176h
    public final C1185q b(Executor executor, InterfaceC1171c interfaceC1171c) {
        this.f17436b.f(new C1181m(executor, interfaceC1171c));
        s();
        return this;
    }

    @Override // f5.AbstractC1176h
    public final C1185q c(Executor executor, InterfaceC1172d interfaceC1172d) {
        this.f17436b.f(new C1181m(executor, interfaceC1172d));
        s();
        return this;
    }

    @Override // f5.AbstractC1176h
    public final C1185q d(Executor executor, InterfaceC1173e interfaceC1173e) {
        this.f17436b.f(new C1181m(executor, interfaceC1173e));
        s();
        return this;
    }

    @Override // f5.AbstractC1176h
    public final C1185q e(Executor executor, InterfaceC1169a interfaceC1169a) {
        C1185q c1185q = new C1185q();
        this.f17436b.f(new C1180l(executor, interfaceC1169a, c1185q, 1));
        s();
        return c1185q;
    }

    @Override // f5.AbstractC1176h
    public final Exception f() {
        Exception exc;
        synchronized (this.f17435a) {
            exc = this.f17440f;
        }
        return exc;
    }

    @Override // f5.AbstractC1176h
    public final Object g() {
        Object obj;
        synchronized (this.f17435a) {
            try {
                y.j("Task is not yet complete", this.f17437c);
                if (!this.f17438d) {
                    Exception exc = this.f17440f;
                    if (exc == null) {
                        obj = this.f17439e;
                    } else {
                        throw new RuntimeException(exc);
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // f5.AbstractC1176h
    public final Object h(Class cls) {
        Object obj;
        synchronized (this.f17435a) {
            try {
                y.j("Task is not yet complete", this.f17437c);
                if (!this.f17438d) {
                    if (!cls.isInstance(this.f17440f)) {
                        Exception exc = this.f17440f;
                        if (exc == null) {
                            obj = this.f17439e;
                        } else {
                            throw new RuntimeException(exc);
                        }
                    } else {
                        throw ((Throwable) cls.cast(this.f17440f));
                    }
                } else {
                    throw new CancellationException("Task is already canceled.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // f5.AbstractC1176h
    public final boolean i() {
        boolean z9;
        synchronized (this.f17435a) {
            z9 = this.f17437c;
        }
        return z9;
    }

    @Override // f5.AbstractC1176h
    public final boolean j() {
        boolean z9;
        synchronized (this.f17435a) {
            try {
                z9 = false;
                if (this.f17437c && !this.f17438d && this.f17440f == null) {
                    z9 = true;
                }
            } finally {
            }
        }
        return z9;
    }

    public final C1185q k(InterfaceC1171c interfaceC1171c) {
        this.f17436b.f(new C1181m(AbstractC1178j.f17414a, interfaceC1171c));
        s();
        return this;
    }

    public final C1185q l(Executor executor, InterfaceC1169a interfaceC1169a) {
        C1185q c1185q = new C1185q();
        this.f17436b.f(new C1180l(executor, interfaceC1169a, c1185q, 0));
        s();
        return c1185q;
    }

    public final C1185q m(Executor executor, InterfaceC1175g interfaceC1175g) {
        C1185q c1185q = new C1185q();
        this.f17436b.f(new C1181m(executor, interfaceC1175g, c1185q));
        s();
        return c1185q;
    }

    public final void n(Exception exc) {
        y.i(exc, "Exception must not be null");
        synchronized (this.f17435a) {
            r();
            this.f17437c = true;
            this.f17440f = exc;
        }
        this.f17436b.g(this);
    }

    public final void o(Object obj) {
        synchronized (this.f17435a) {
            r();
            this.f17437c = true;
            this.f17439e = obj;
        }
        this.f17436b.g(this);
    }

    public final void p() {
        synchronized (this.f17435a) {
            try {
                if (this.f17437c) {
                    return;
                }
                this.f17437c = true;
                this.f17438d = true;
                this.f17436b.g(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean q(Object obj) {
        synchronized (this.f17435a) {
            try {
                if (this.f17437c) {
                    return false;
                }
                this.f17437c = true;
                this.f17439e = obj;
                this.f17436b.g(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        String str;
        if (this.f17437c) {
            int i9 = a8.o.f9233a;
            if (i()) {
                Exception f9 = f();
                if (f9 == null) {
                    if (!j()) {
                        if (this.f17438d) {
                            str = "cancellation";
                        } else {
                            str = "unknown issue";
                        }
                    } else {
                        str = "result ".concat(String.valueOf(g()));
                    }
                } else {
                    str = "failure";
                }
                throw new IllegalStateException("Complete with: ".concat(str), f9);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    public final void s() {
        synchronized (this.f17435a) {
            try {
                if (!this.f17437c) {
                    return;
                }
                this.f17436b.g(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
