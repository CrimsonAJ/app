package F0;

import java.util.List;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class I extends S {

    /* renamed from: d, reason: collision with root package name */
    public final C0102f f2039d;

    public I(AbstractC0098c abstractC0098c) {
        H h7 = new H(this);
        s4.i iVar = new s4.i(this);
        synchronized (AbstractC0098c.f2080a) {
            try {
                if (AbstractC0098c.f2081b == null) {
                    AbstractC0098c.f2081b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0102f c0102f = new C0102f(iVar, new A1.g(AbstractC0098c.f2081b, 10, abstractC0098c));
        this.f2039d = c0102f;
        c0102f.f2098d.add(h7);
    }

    @Override // F0.S
    public final int a() {
        return this.f2039d.f2100f.size();
    }

    public final Object n(int i9) {
        return this.f2039d.f2100f.get(i9);
    }

    public final void o(List list) {
        this.f2039d.b(list, null);
    }
}
