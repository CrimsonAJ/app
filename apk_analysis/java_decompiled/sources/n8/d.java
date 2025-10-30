package n8;

import i8.InterfaceC1420j;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import l1.C1535g;
import s8.p;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1420j f21257a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f21258b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f21259c;

    public d(g gVar, InterfaceC1420j interfaceC1420j) {
        this.f21259c = gVar;
        this.f21257a = interfaceC1420j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1535g c1535g;
        String concat = "OkHttp ".concat(this.f21259c.f21263b.f19005a.h());
        g gVar = this.f21259c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            gVar.f21265d.h();
            boolean z9 = false;
            try {
                try {
                } catch (Throwable th) {
                    gVar.f21262a.f18972a.m(this);
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f21257a.c(gVar, gVar.j());
                c1535g = gVar.f21262a.f18972a;
            } catch (IOException e9) {
                e = e9;
                z9 = true;
                if (z9) {
                    p pVar = p.f22822a;
                    p pVar2 = p.f22822a;
                    String str = "Callback failure for " + g.b(gVar);
                    pVar2.getClass();
                    p.i(str, 4, e);
                } else {
                    this.f21257a.f(gVar, e);
                }
                c1535g = gVar.f21262a.f18972a;
                c1535g.m(this);
            } catch (Throwable th3) {
                th = th3;
                z9 = true;
                gVar.cancel();
                if (!z9) {
                    IOException iOException = new IOException("canceled due to " + th);
                    O4.h.a(iOException, th);
                    this.f21257a.f(gVar, iOException);
                }
                throw th;
            }
            c1535g.m(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
