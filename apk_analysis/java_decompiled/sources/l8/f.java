package l8;

import M1.w;
import b5.W;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import n8.i;
import q8.n;

/* loaded from: classes.dex */
public final class f extends m8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20634f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, String str, int i9) {
        super(str, true);
        this.f20633e = i9;
        this.f20634f = obj;
    }

    private final long b() {
        W w7 = (W) this.f20634f;
        long nanoTime = System.nanoTime();
        Iterator it = ((ConcurrentLinkedQueue) w7.f10988e).iterator();
        int i9 = 0;
        long j = Long.MIN_VALUE;
        i iVar = null;
        int i10 = 0;
        while (it.hasNext()) {
            i connection = (i) it.next();
            kotlin.jvm.internal.h.d(connection, "connection");
            synchronized (connection) {
                if (w7.b(connection, nanoTime) > 0) {
                    i10++;
                } else {
                    i9++;
                    long j4 = nanoTime - connection.f21291q;
                    if (j4 > j) {
                        iVar = connection;
                        j = j4;
                    }
                }
            }
        }
        long j9 = w7.f10985b;
        if (j < j9 && i9 <= 5) {
            if (i9 > 0) {
                return j9 - j;
            }
            if (i10 > 0) {
                return j9;
            }
            return -1L;
        }
        kotlin.jvm.internal.h.b(iVar);
        synchronized (iVar) {
            if (!iVar.f21290p.isEmpty()) {
                return 0L;
            }
            if (iVar.f21291q + j != nanoTime) {
                return 0L;
            }
            iVar.j = true;
            ((ConcurrentLinkedQueue) w7.f10988e).remove(iVar);
            Socket socket = iVar.f21279d;
            kotlin.jvm.internal.h.b(socket);
            k8.c.e(socket);
            if (((ConcurrentLinkedQueue) w7.f10988e).isEmpty()) {
                ((m8.b) w7.f10986c).a();
            }
            return 0L;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, x8.G] */
    @Override // m8.a
    public final long a() {
        switch (this.f20633e) {
            case 0:
                g gVar = (g) this.f20634f;
                synchronized (gVar) {
                    if (gVar.f20649k && !gVar.f20650l) {
                        try {
                            gVar.h0();
                        } catch (IOException unused) {
                            gVar.f20651m = true;
                        }
                        try {
                            if (gVar.F()) {
                                gVar.a0();
                                gVar.f20647h = 0;
                            }
                        } catch (IOException unused2) {
                            gVar.f20652n = true;
                            gVar.f20645f = v4.e.a(new Object());
                        }
                    }
                }
                return -1L;
            case 1:
                ((w) this.f20634f).invoke();
                return -1L;
            case 2:
                return b();
            default:
                n nVar = (n) this.f20634f;
                nVar.getClass();
                try {
                    nVar.f22517w.F(2, 0, false);
                    return -1L;
                } catch (IOException e8) {
                    nVar.a(2, 2, e8);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(String str, Object obj, int i9) {
        super(str, true);
        this.f20633e = i9;
        this.f20634f = obj;
    }
}
