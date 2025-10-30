package G0;

import Y7.C0483y;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public d8.e f2642a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f2643b;

    /* renamed from: c, reason: collision with root package name */
    public I f2644c;

    /* renamed from: d, reason: collision with root package name */
    public y f2645d;

    /* renamed from: e, reason: collision with root package name */
    public C0145k f2646e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2648g;

    /* renamed from: f, reason: collision with root package name */
    public final A1.g f2647f = new A1.g(new D(0, this, E.class, "onClosed", "onClosed()V", 0, 0));

    /* renamed from: h, reason: collision with root package name */
    public final ThreadLocal f2649h = new ThreadLocal();

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f2650i = new LinkedHashMap();
    public boolean j = true;

    public final void a() {
        boolean z9;
        if (!this.f2648g) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
            } else {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    public final void b() {
        if (l()) {
            if ((!o() || !i().Z().B()) && this.f2649h.get() != null) {
                throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            }
        }
    }

    public final void c() {
        a();
        a();
        Q0.a Z6 = i().Z();
        if (!Z6.B()) {
            C0144j c0144j = new C0144j(h(), null);
            Thread.interrupted();
            Y7.B.v(E7.j.f1978a, new I0.v(c0144j, null));
        }
        if (Z6.J()) {
            Z6.P();
        } else {
            Z6.f();
        }
    }

    public List d(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(B7.y.D(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(AbstractC1570b.f((U7.c) entry.getKey()), entry.getValue());
        }
        return B7.t.f1135a;
    }

    public abstract C0145k e();

    public F0.K f() {
        throw new A7.g(0);
    }

    public Q0.d g(C0135a config) {
        kotlin.jvm.internal.h.e(config, "config");
        throw new A7.g(0);
    }

    public final C0145k h() {
        C0145k c0145k = this.f2646e;
        if (c0145k != null) {
            return c0145k;
        }
        kotlin.jvm.internal.h.h("internalTracker");
        throw null;
    }

    public final Q0.d i() {
        y yVar = this.f2645d;
        if (yVar != null) {
            Q0.d c3 = yVar.c();
            if (c3 != null) {
                return c3;
            }
            throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        }
        kotlin.jvm.internal.h.h("connectionManager");
        throw null;
    }

    public Set j() {
        return B7.k.K0(new ArrayList(B7.m.f0(B7.v.f1137a, 10)));
    }

    public LinkedHashMap k() {
        int D8 = B7.y.D(B7.m.f0(B7.v.f1137a, 10));
        if (D8 < 16) {
            D8 = 16;
        }
        return new LinkedHashMap(D8);
    }

    public final boolean l() {
        y yVar = this.f2645d;
        if (yVar != null) {
            if (yVar.c() != null) {
                return true;
            }
            return false;
        }
        kotlin.jvm.internal.h.h("connectionManager");
        throw null;
    }

    public final void m() {
        i().Z().e();
        if (o() && i().Z().B()) {
            return;
        }
        C0145k h7 = h();
        X x5 = h7.f2773c;
        x5.getClass();
        C0141g onRefreshScheduled = h7.f2776f;
        kotlin.jvm.internal.h.e(onRefreshScheduled, "onRefreshScheduled");
        C0141g onRefreshCompleted = h7.f2777g;
        kotlin.jvm.internal.h.e(onRefreshCompleted, "onRefreshCompleted");
        if (x5.j.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            d8.e eVar = x5.f2729a.f2642a;
            if (eVar != null) {
                Y7.B.r(eVar, new C0483y(), new Q(x5, onRefreshCompleted, null), 2);
            } else {
                kotlin.jvm.internal.h.h("coroutineScope");
                throw null;
            }
        }
    }

    public final void n(P0.a connection) {
        kotlin.jvm.internal.h.e(connection, "connection");
        C0145k h7 = h();
        X x5 = h7.f2773c;
        x5.getClass();
        P0.c d02 = connection.d0("PRAGMA query_only");
        try {
            d02.W();
            boolean K = d02.K();
            AbstractC1002u1.k(d02, null);
            if (!K) {
                s8.n.m(connection, "PRAGMA temp_store = MEMORY");
                s8.n.m(connection, "PRAGMA recursive_triggers = 1");
                s8.n.m(connection, "DROP TABLE IF EXISTS room_table_modification_log");
                if (x5.f2732d) {
                    s8.n.m(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    s8.n.m(connection, W7.l.J("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                A6.t tVar = x5.f2736h;
                ReentrantLock reentrantLock = (ReentrantLock) tVar.f540b;
                reentrantLock.lock();
                try {
                    tVar.f539a = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (h7.j) {
                try {
                    C0149o c0149o = h7.f2779i;
                    if (c0149o != null) {
                        Intent intent = h7.f2778h;
                        if (intent != null) {
                            c0149o.a(intent);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
        }
    }

    public final boolean o() {
        y yVar = this.f2645d;
        if (yVar != null) {
            Q0.a aVar = yVar.f2817g;
            if (aVar != null) {
                return aVar.isOpen();
            }
            return false;
        }
        kotlin.jvm.internal.h.h("connectionManager");
        throw null;
    }

    public final void p() {
        i().Z().M();
    }
}
