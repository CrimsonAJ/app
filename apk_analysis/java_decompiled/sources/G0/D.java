package G0;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import d.C1082w;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final /* synthetic */ class D extends kotlin.jvm.internal.g implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2641a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(int i9, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i9, obj, cls, str, str2, i10);
        this.f2641a = i11;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f2641a) {
            case 0:
                E e8 = (E) this.receiver;
                d8.e eVar = e8.f2642a;
                if (eVar != null) {
                    Y7.B.d(eVar);
                    C0149o c0149o = e8.h().f2779i;
                    if (c0149o != null) {
                        if (c0149o.f2791e.compareAndSet(false, true)) {
                            C0145k c0145k = c0149o.f2788b;
                            A1.g observer = c0149o.f2795i;
                            kotlin.jvm.internal.h.e(observer, "observer");
                            ReentrantLock reentrantLock = c0145k.f2775e;
                            reentrantLock.lock();
                            try {
                                C0153t c0153t = (C0153t) c0145k.f2774d.remove(observer);
                                if (c0153t != null) {
                                    X x5 = c0145k.f2773c;
                                    x5.getClass();
                                    int[] iArr = c0153t.f2806b;
                                    A6.t tVar = x5.f2736h;
                                    tVar.getClass();
                                    ReentrantLock reentrantLock2 = (ReentrantLock) tVar.f540b;
                                    reentrantLock2.lock();
                                    try {
                                        boolean z9 = false;
                                        for (int i9 : iArr) {
                                            long[] jArr = (long[]) tVar.f541c;
                                            long j = jArr[i9];
                                            jArr[i9] = j - 1;
                                            if (j == 1) {
                                                tVar.f539a = true;
                                                z9 = true;
                                            }
                                        }
                                        if (z9) {
                                            C0143i c0143i = new C0143i(c0145k, null);
                                            Thread.interrupted();
                                            Y7.B.v(E7.j.f1978a, new I0.v(c0143i, null));
                                        }
                                    } finally {
                                        reentrantLock2.unlock();
                                    }
                                }
                                try {
                                    InterfaceC0140f interfaceC0140f = c0149o.f2793g;
                                    if (interfaceC0140f != null) {
                                        interfaceC0140f.i0(c0149o.j, c0149o.f2792f);
                                    }
                                } catch (RemoteException e9) {
                                    Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e9);
                                }
                                c0149o.f2789c.unbindService(c0149o.f2796k);
                            } finally {
                                reentrantLock.unlock();
                            }
                        }
                    }
                    y yVar = e8.f2645d;
                    if (yVar != null) {
                        yVar.f2816f.close();
                        return A7.n.f558a;
                    }
                    kotlin.jvm.internal.h.h("connectionManager");
                    throw null;
                }
                kotlin.jvm.internal.h.h("coroutineScope");
                throw null;
            case 1:
                ((C1082w) this.receiver).e();
                return A7.n.f558a;
            case 2:
                ((C1082w) this.receiver).e();
                return A7.n.f558a;
            case 3:
                ((z6.c) this.receiver).getClass();
                String threadName = Thread.currentThread().getName();
                kotlin.jvm.internal.h.d(threadName, "threadName");
                return Boolean.valueOf(W7.d.N(threadName, "Firebase Background Thread #"));
            case 4:
                ((z6.c) this.receiver).getClass();
                String threadName2 = Thread.currentThread().getName();
                kotlin.jvm.internal.h.d(threadName2, "threadName");
                return Boolean.valueOf(W7.d.N(threadName2, "Firebase Blocking Thread #"));
            default:
                ((z6.c) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
        }
    }
}
