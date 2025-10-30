package I0;

import B6.u0;
import F0.C0120y;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f3224a;

    /* renamed from: b, reason: collision with root package name */
    public final O7.a f3225b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f3226c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public int f3227d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3228e;

    /* renamed from: f, reason: collision with root package name */
    public final i[] f3229f;

    /* renamed from: g, reason: collision with root package name */
    public final g8.i f3230g;

    /* renamed from: h, reason: collision with root package name */
    public final C0120y f3231h;

    public k(int i9, O7.a aVar) {
        this.f3224a = i9;
        this.f3225b = aVar;
        this.f3229f = new i[i9];
        int i10 = g8.j.f17797a;
        this.f3230g = new g8.i(i9, 0);
        C0120y c0120y = new C0120y(4);
        if (i9 >= 1) {
            if (i9 <= 1073741824) {
                i9 = Integer.bitCount(i9) != 1 ? Integer.highestOneBit(i9 - 1) << 1 : i9;
                c0120y.f2292d = i9 - 1;
                c0120y.f2293e = new Object[i9];
                this.f3231h = c0120y;
                return;
            }
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        throw new IllegalArgumentException("capacity must be >= 1");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:15:0x0049, B:17:0x004e, B:19:0x0054, B:22:0x005b, B:23:0x0075, B:25:0x007b, B:29:0x0093, B:30:0x0098, B:31:0x0099, B:32:0x00a0), top: B:14:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[Catch: all -> 0x0091, TryCatch #0 {all -> 0x0091, blocks: (B:15:0x0049, B:17:0x004e, B:19:0x0054, B:22:0x005b, B:23:0x0075, B:25:0x007b, B:29:0x0093, B:30:0x0098, B:31:0x0099, B:32:0x00a0), top: B:14:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(G7.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof I0.j
            if (r0 == 0) goto L13
            r0 = r8
            I0.j r0 = (I0.j) r0
            int r1 = r0.f3223u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3223u = r1
            goto L18
        L13:
            I0.j r0 = new I0.j
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f3221s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f3223u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            I0.k r0 = r0.f3220r
            a.AbstractC0485a.A(r8)
            goto L42
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            a.AbstractC0485a.A(r8)
            g8.i r8 = r7.f3230g
            r0.f3220r = r7
            r0.f3223u = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            r0 = r7
        L42:
            java.util.concurrent.locks.ReentrantLock r8 = r0.f3226c     // Catch: java.lang.Throwable -> L8f
            F0.y r1 = r0.f3231h
            r8.lock()     // Catch: java.lang.Throwable -> L8f
            boolean r2 = r0.f3228e     // Catch: java.lang.Throwable -> L91
            r4 = 0
            if (r2 != 0) goto L99
            int r2 = r1.f2290b     // Catch: java.lang.Throwable -> L91
            int r5 = r1.f2291c     // Catch: java.lang.Throwable -> L91
            if (r2 != r5) goto L75
            int r2 = r0.f3227d     // Catch: java.lang.Throwable -> L91
            int r5 = r0.f3224a     // Catch: java.lang.Throwable -> L91
            if (r2 < r5) goto L5b
            goto L75
        L5b:
            I0.i r2 = new I0.i     // Catch: java.lang.Throwable -> L91
            O7.a r5 = r0.f3225b     // Catch: java.lang.Throwable -> L91
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L91
            P0.a r5 = (P0.a) r5     // Catch: java.lang.Throwable -> L91
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L91
            int r5 = r0.f3227d     // Catch: java.lang.Throwable -> L91
            int r6 = r5 + 1
            r0.f3227d = r6     // Catch: java.lang.Throwable -> L91
            I0.i[] r6 = r0.f3229f     // Catch: java.lang.Throwable -> L91
            r6[r5] = r2     // Catch: java.lang.Throwable -> L91
            r1.b(r2)     // Catch: java.lang.Throwable -> L91
        L75:
            int r2 = r1.f2290b     // Catch: java.lang.Throwable -> L91
            int r5 = r1.f2291c     // Catch: java.lang.Throwable -> L91
            if (r2 == r5) goto L93
            java.lang.Object r5 = r1.f2293e     // Catch: java.lang.Throwable -> L91
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch: java.lang.Throwable -> L91
            r6 = r5[r2]     // Catch: java.lang.Throwable -> L91
            r5[r2] = r4     // Catch: java.lang.Throwable -> L91
            int r2 = r2 + r3
            int r3 = r1.f2292d     // Catch: java.lang.Throwable -> L91
            r2 = r2 & r3
            r1.f2290b = r2     // Catch: java.lang.Throwable -> L91
            I0.i r6 = (I0.i) r6     // Catch: java.lang.Throwable -> L91
            r8.unlock()     // Catch: java.lang.Throwable -> L8f
            return r6
        L8f:
            r8 = move-exception
            goto La5
        L91:
            r1 = move-exception
            goto La1
        L93:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L91
            r1.<init>()     // Catch: java.lang.Throwable -> L91
            throw r1     // Catch: java.lang.Throwable -> L91
        L99:
            java.lang.String r1 = "Connection pool is closed"
            r2 = 21
            s8.n.y(r2, r1)     // Catch: java.lang.Throwable -> L91
            throw r4     // Catch: java.lang.Throwable -> L91
        La1:
            r8.unlock()     // Catch: java.lang.Throwable -> L8f
            throw r1     // Catch: java.lang.Throwable -> L8f
        La5:
            g8.i r0 = r0.f3230g
            r0.e()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.k.a(G7.c):java.lang.Object");
    }

    public final void b() {
        ReentrantLock reentrantLock = this.f3226c;
        reentrantLock.lock();
        try {
            this.f3228e = true;
            for (i iVar : this.f3229f) {
                if (iVar != null) {
                    iVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c(StringBuilder sb) {
        String str;
        C0120y c0120y = this.f3231h;
        ReentrantLock reentrantLock = this.f3226c;
        reentrantLock.lock();
        try {
            C7.c cVar = new C7.c(10);
            int i9 = (c0120y.f2291c - c0120y.f2290b) & c0120y.f2292d;
            for (int i10 = 0; i10 < i9; i10++) {
                if (i10 >= 0) {
                    int i11 = c0120y.f2291c;
                    int i12 = c0120y.f2290b;
                    int i13 = c0120y.f2292d;
                    if (i10 < ((i11 - i12) & i13)) {
                        Object obj = ((Object[]) c0120y.f2293e)[(i12 + i10) & i13];
                        kotlin.jvm.internal.h.b(obj);
                        cVar.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            C7.c e8 = u0.e(cVar);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.f3224a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            g8.i iVar = this.f3230g;
            iVar.getClass();
            sb2.append(Math.max(g8.i.f17794g.get(iVar), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + e8.b() + ")[" + B7.k.u0(e8, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            int i14 = 0;
            for (i iVar2 : this.f3229f) {
                i14++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i14);
                sb3.append("] - ");
                if (iVar2 != null) {
                    str = iVar2.f3216a.toString();
                } else {
                    str = null;
                }
                sb3.append(str);
                sb.append(sb3.toString());
                sb.append('\n');
                if (iVar2 != null) {
                    iVar2.g(sb);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(i connection) {
        kotlin.jvm.internal.h.e(connection, "connection");
        ReentrantLock reentrantLock = this.f3226c;
        reentrantLock.lock();
        try {
            this.f3231h.b(connection);
            reentrantLock.unlock();
            this.f3230g.e();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
