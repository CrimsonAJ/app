package n8;

import B2.l;
import B7.q;
import J5.k;
import U3.C0394a;
import b5.W;
import i8.E;
import i8.G;
import i8.InterfaceC1420j;
import i8.L;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.C1535g;
import s8.p;

/* loaded from: classes.dex */
public final class g implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final E f21262a;

    /* renamed from: b, reason: collision with root package name */
    public final G f21263b;

    /* renamed from: c, reason: collision with root package name */
    public final W f21264c;

    /* renamed from: d, reason: collision with root package name */
    public final f f21265d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f21266e;

    /* renamed from: f, reason: collision with root package name */
    public Object f21267f;

    /* renamed from: g, reason: collision with root package name */
    public C0394a f21268g;

    /* renamed from: h, reason: collision with root package name */
    public i f21269h;

    /* renamed from: i, reason: collision with root package name */
    public k f21270i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21271k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21272l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f21273m;

    /* renamed from: n, reason: collision with root package name */
    public volatile k f21274n;

    /* renamed from: o, reason: collision with root package name */
    public volatile i f21275o;

    public g(E client, G originalRequest) {
        kotlin.jvm.internal.h.e(client, "client");
        kotlin.jvm.internal.h.e(originalRequest, "originalRequest");
        this.f21262a = client;
        this.f21263b = originalRequest;
        this.f21264c = (W) client.f18973b.f17990b;
        client.f18976e.getClass();
        f fVar = new f(this);
        long j = client.f18993w;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        fVar.g(j);
        this.f21265d = fVar;
        this.f21266e = new AtomicBoolean();
        this.f21272l = true;
    }

    public static final String b(g gVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (gVar.f21273m) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("call");
        sb.append(" to ");
        sb.append(gVar.f21263b.f19005a.h());
        return sb.toString();
    }

    public final void c(i iVar) {
        byte[] bArr = k8.c.f20141a;
        if (this.f21269h == null) {
            this.f21269h = iVar;
            iVar.f21290p.add(new e(this, this.f21267f));
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void cancel() {
        Socket socket;
        if (this.f21273m) {
            return;
        }
        this.f21273m = true;
        k kVar = this.f21274n;
        if (kVar != null) {
            ((o8.b) kVar.f4226d).cancel();
        }
        i iVar = this.f21275o;
        if (iVar != null && (socket = iVar.f21278c) != null) {
            k8.c.e(socket);
        }
    }

    public final Object clone() {
        return new g(this.f21262a, this.f21263b);
    }

    public final IOException e(IOException iOException) {
        IOException interruptedIOException;
        Socket m9;
        byte[] bArr = k8.c.f20141a;
        i iVar = this.f21269h;
        if (iVar != null) {
            synchronized (iVar) {
                m9 = m();
            }
            if (this.f21269h == null) {
                if (m9 != null) {
                    k8.c.e(m9);
                }
            } else if (m9 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f21265d.i()) {
            interruptedIOException = iOException;
        } else {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        }
        if (iOException != null) {
            kotlin.jvm.internal.h.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final void f(InterfaceC1420j interfaceC1420j) {
        d dVar;
        if (this.f21266e.compareAndSet(false, true)) {
            p pVar = p.f22822a;
            this.f21267f = p.f22822a.g();
            C1535g c1535g = this.f21262a.f18972a;
            d dVar2 = new d(this, interfaceC1420j);
            c1535g.getClass();
            synchronized (c1535g) {
                ((ArrayDeque) c1535g.f20183b).add(dVar2);
                String str = this.f21263b.f19005a.f19172d;
                Iterator it = ((ArrayDeque) c1535g.f20184c).iterator();
                while (true) {
                    if (it.hasNext()) {
                        dVar = (d) it.next();
                        if (kotlin.jvm.internal.h.a(dVar.f21259c.f21263b.f19005a.f19172d, str)) {
                            break;
                        }
                    } else {
                        Iterator it2 = ((ArrayDeque) c1535g.f20183b).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                dVar = (d) it2.next();
                                if (kotlin.jvm.internal.h.a(dVar.f21259c.f21263b.f19005a.f19172d, str)) {
                                    break;
                                }
                            } else {
                                dVar = null;
                                break;
                            }
                        }
                    }
                }
                if (dVar != null) {
                    dVar2.f21258b = dVar.f21258b;
                }
            }
            c1535g.z();
            return;
        }
        throw new IllegalStateException("Already Executed");
    }

    public final L h() {
        if (this.f21266e.compareAndSet(false, true)) {
            this.f21265d.h();
            p pVar = p.f22822a;
            this.f21267f = p.f22822a.g();
            try {
                C1535g c1535g = this.f21262a.f18972a;
                synchronized (c1535g) {
                    ((ArrayDeque) c1535g.f20185d).add(this);
                }
                return j();
            } finally {
                C1535g c1535g2 = this.f21262a.f18972a;
                c1535g2.l((ArrayDeque) c1535g2.f20185d, this);
            }
        }
        throw new IllegalStateException("Already Executed");
    }

    public final void i(boolean z9) {
        k kVar;
        synchronized (this) {
            if (!this.f21272l) {
                throw new IllegalStateException("released");
            }
        }
        if (z9 && (kVar = this.f21274n) != null) {
            ((o8.b) kVar.f4226d).cancel();
            ((g) kVar.f4224b).k(kVar, true, true, null);
        }
        this.f21270i = null;
    }

    public final L j() {
        ArrayList arrayList = new ArrayList();
        q.h0(arrayList, this.f21262a.f18974c);
        arrayList.add(new l(this.f21262a));
        arrayList.add(new l(this.f21262a.j));
        arrayList.add(new l8.b(this.f21262a.f18981k));
        arrayList.add(a.f21245a);
        q.h0(arrayList, this.f21262a.f18975d);
        arrayList.add(new B2.e(3));
        G g9 = this.f21263b;
        E e8 = this.f21262a;
        try {
            try {
                L b9 = new o8.d(this, arrayList, 0, null, g9, e8.f18994x, e8.f18995y, e8.f18996z).b(this.f21263b);
                if (!this.f21273m) {
                    l(null);
                    return b9;
                }
                k8.c.d(b9);
                throw new IOException("Canceled");
            } catch (IOException e9) {
                IOException l9 = l(e9);
                kotlin.jvm.internal.h.c(l9, "null cannot be cast to non-null type kotlin.Throwable");
                throw l9;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                l(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:41:0x0012, B:10:0x0021, B:12:0x0025, B:13:0x0027, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001b), top: B:40:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:41:0x0012, B:10:0x0021, B:12:0x0025, B:13:0x0027, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:7:0x001b), top: B:40:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException k(J5.k r2, boolean r3, boolean r4, java.io.IOException r5) {
        /*
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.h.e(r2, r0)
            J5.k r0 = r1.f21274n
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Le
            goto L58
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.j     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L41
        L19:
            if (r4 == 0) goto L43
            boolean r0 = r1.f21271k     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L43
        L1f:
            if (r3 == 0) goto L23
            r1.j = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.f21271k = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.j     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.f21271k     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = r4
            goto L33
        L32:
            r0 = r2
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.f21271k     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.f21272l     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = r4
        L3e:
            r3 = r2
            r2 = r0
            goto L44
        L41:
            monitor-exit(r1)
            throw r2
        L43:
            r3 = r2
        L44:
            monitor-exit(r1)
            if (r2 == 0) goto L51
            r2 = 0
            r1.f21274n = r2
            n8.i r2 = r1.f21269h
            if (r2 == 0) goto L51
            r2.h()
        L51:
            if (r3 == 0) goto L58
            java.io.IOException r2 = r1.e(r5)
            return r2
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.g.k(J5.k, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException l(IOException iOException) {
        boolean z9;
        synchronized (this) {
            z9 = false;
            if (this.f21272l) {
                this.f21272l = false;
                if (!this.j) {
                    if (!this.f21271k) {
                        z9 = true;
                    }
                }
            }
        }
        if (z9) {
            return e(iOException);
        }
        return iOException;
    }

    public final Socket m() {
        i iVar = this.f21269h;
        kotlin.jvm.internal.h.b(iVar);
        byte[] bArr = k8.c.f20141a;
        ArrayList arrayList = iVar.f21290p;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (kotlin.jvm.internal.h.a(((Reference) obj).get(), this)) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 != -1) {
            arrayList.remove(i9);
            this.f21269h = null;
            if (!arrayList.isEmpty()) {
                return null;
            }
            iVar.f21291q = System.nanoTime();
            W w7 = this.f21264c;
            w7.getClass();
            byte[] bArr2 = k8.c.f20141a;
            boolean z9 = iVar.j;
            m8.b bVar = (m8.b) w7.f10986c;
            if (!z9) {
                bVar.c((l8.f) w7.f10987d, 0L);
                return null;
            }
            iVar.j = true;
            ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) w7.f10988e;
            concurrentLinkedQueue.remove(iVar);
            if (concurrentLinkedQueue.isEmpty()) {
                bVar.a();
            }
            Socket socket = iVar.f21279d;
            kotlin.jvm.internal.h.b(socket);
            return socket;
        }
        throw new IllegalStateException("Check failed.");
    }
}
