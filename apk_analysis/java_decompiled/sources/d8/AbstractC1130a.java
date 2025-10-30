package d8;

import Y7.A0;
import Y7.AbstractC0480v;
import Y7.C0463g0;
import Y7.C0476q;
import Y7.G0;
import Y7.InterfaceC0465h0;
import Y7.InterfaceC0482x;
import Y7.V;
import a.AbstractC0485a;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: d8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1130a {

    /* renamed from: c, reason: collision with root package name */
    public static final G6.a f16968c;

    /* renamed from: d, reason: collision with root package name */
    public static final G6.a f16969d;

    /* renamed from: a, reason: collision with root package name */
    public static final G6.a f16966a = new G6.a("NO_DECISION", 3);

    /* renamed from: b, reason: collision with root package name */
    public static final G6.a f16967b = new G6.a("CLOSED", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final G6.a f16970e = new G6.a("CONDITION_FALSE", 3);

    /* renamed from: f, reason: collision with root package name */
    public static final G6.a f16971f = new G6.a("NO_THREAD_ELEMENTS", 3);

    static {
        int i9 = 3;
        f16968c = new G6.a("UNDEFINED", i9);
        f16969d = new G6.a("REUSABLE_CLAIMED", i9);
    }

    public static final void a(int i9) {
        if (i9 >= 1) {
        } else {
            throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(u uVar, long j, O7.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (uVar.f17007c >= j && !uVar.c()) {
                return uVar;
            }
            Object obj = d.f16974a.get(uVar);
            G6.a aVar = f16967b;
            if (obj == aVar) {
                return aVar;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) pVar.invoke(Long.valueOf(uVar.f17007c + 1), uVar);
                do {
                    atomicReferenceFieldUpdater = d.f16974a;
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                        if (uVar.c()) {
                            uVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(uVar) == null);
            }
            uVar = uVar2;
        }
    }

    public static final u c(Object obj) {
        if (obj != f16967b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(E7.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f16977a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0482x) it.next()).handleException(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    O4.h.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            O4.h.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        if (obj == f16967b) {
            return true;
        }
        return false;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(E7.i iVar, Object obj) {
        if (obj != f16971f) {
            if (obj instanceof B) {
                B b9 = (B) obj;
                y[] yVarArr = b9.f16964c;
                int length = yVarArr.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i9 = length - 1;
                    y yVar = yVarArr[length];
                    kotlin.jvm.internal.h.b(yVar);
                    yVar.b(b9.f16963b[length]);
                    if (i9 >= 0) {
                        length = i9;
                    } else {
                        return;
                    }
                }
            } else {
                Object fold = iVar.fold(null, x.f17011f);
                kotlin.jvm.internal.h.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                ((y) fold).b(obj);
            }
        }
    }

    public static final void h(E7.d dVar, Object obj) {
        Object c0476q;
        G0 g02;
        if (dVar instanceof h) {
            h hVar = (h) dVar;
            Throwable a5 = A7.j.a(obj);
            if (a5 == null) {
                c0476q = obj;
            } else {
                c0476q = new C0476q(a5, false);
            }
            G7.c cVar = hVar.f16981e;
            cVar.getContext();
            AbstractC0480v abstractC0480v = hVar.f16980d;
            if (abstractC0480v.i0()) {
                hVar.f16982f = c0476q;
                hVar.f8769c = 1;
                abstractC0480v.g0(cVar.getContext(), hVar);
                return;
            }
            V a9 = A0.a();
            if (a9.f8789b >= 4294967296L) {
                hVar.f16982f = c0476q;
                hVar.f8769c = 1;
                a9.l0(hVar);
                return;
            }
            a9.n0(true);
            try {
                InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) cVar.getContext().get(C0463g0.f8811a);
                if (interfaceC0465h0 != null && !interfaceC0465h0.a()) {
                    CancellationException I4 = interfaceC0465h0.I();
                    hVar.d(c0476q, I4);
                    hVar.resumeWith(AbstractC0485a.h(I4));
                } else {
                    Object obj2 = hVar.f16983g;
                    E7.i context = cVar.getContext();
                    Object m9 = m(context, obj2);
                    if (m9 != f16971f) {
                        g02 = Y7.B.B(cVar, context, m9);
                    } else {
                        g02 = null;
                    }
                    try {
                        cVar.resumeWith(obj);
                    } finally {
                        if (g02 == null || g02.d0()) {
                            g(context, m9);
                        }
                    }
                }
                do {
                } while (a9.p0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.resumeWith(obj);
    }

    public static final long j(String str, long j, long j4, long j9) {
        String str2;
        int i9 = w.f17009a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long F2 = W7.k.F(str2);
        if (F2 != null) {
            long longValue = F2.longValue();
            if (j4 <= longValue && longValue <= j9) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j4 + ".." + j9 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    public static int k(String str, int i9, int i10) {
        int i11;
        if ((i10 & 8) != 0) {
            i11 = Integer.MAX_VALUE;
        } else {
            i11 = 2097150;
        }
        return (int) j(str, i9, 1, i11);
    }

    public static final Object l(E7.i iVar) {
        Object fold = iVar.fold(0, x.f17010e);
        kotlin.jvm.internal.h.b(fold);
        return fold;
    }

    public static final Object m(E7.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f16971f;
        }
        if (obj instanceof Integer) {
            return iVar.fold(new B(((Number) obj).intValue(), iVar), x.f17012g);
        }
        return ((y) obj).c(iVar);
    }
}
