package q8;

import x8.C2187g;
import x8.G;
import x8.K;

/* loaded from: classes.dex */
public final class s implements G, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22538a;

    /* renamed from: b, reason: collision with root package name */
    public final C2187g f22539b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public boolean f22540c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f22541d;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, x8.g] */
    public s(v vVar, boolean z9) {
        this.f22541d = vVar;
        this.f22538a = z9;
    }

    @Override // x8.G
    public final void G(C2187g source, long j) {
        kotlin.jvm.internal.h.e(source, "source");
        byte[] bArr = k8.c.f20141a;
        C2187g c2187g = this.f22539b;
        c2187g.G(source, j);
        while (c2187g.f24644b >= 16384) {
            a(false);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z9) {
        long min;
        boolean z10;
        boolean z11;
        v vVar = this.f22541d;
        synchronized (vVar) {
            vVar.f22559l.h();
            while (vVar.f22553e >= vVar.f22554f && !this.f22538a && !this.f22540c && vVar.f() == 0) {
                try {
                    vVar.l();
                } catch (Throwable th) {
                    vVar.f22559l.k();
                    throw th;
                }
            }
            vVar.f22559l.k();
            vVar.b();
            min = Math.min(vVar.f22554f - vVar.f22553e, this.f22539b.f24644b);
            vVar.f22553e += min;
            if (z9 && min == this.f22539b.f24644b) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z10;
        }
        this.f22541d.f22559l.h();
        try {
            v vVar2 = this.f22541d;
            vVar2.f22550b.I(vVar2.f22549a, z11, this.f22539b, min);
        } finally {
            this.f22541d.f22559l.k();
        }
    }

    @Override // x8.G
    public final K c() {
        return this.f22541d.f22559l;
    }

    @Override // x8.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z9;
        v vVar = this.f22541d;
        byte[] bArr = k8.c.f20141a;
        synchronized (vVar) {
            if (this.f22540c) {
                return;
            }
            if (vVar.f() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            v vVar2 = this.f22541d;
            if (!vVar2.j.f22538a) {
                if (this.f22539b.f24644b > 0) {
                    while (this.f22539b.f24644b > 0) {
                        a(true);
                    }
                } else if (z9) {
                    vVar2.f22550b.I(vVar2.f22549a, true, null, 0L);
                }
            }
            synchronized (this.f22541d) {
                this.f22540c = true;
            }
            this.f22541d.f22550b.flush();
            this.f22541d.a();
        }
    }

    @Override // x8.G, java.io.Flushable
    public final void flush() {
        v vVar = this.f22541d;
        byte[] bArr = k8.c.f20141a;
        synchronized (vVar) {
            vVar.b();
        }
        while (this.f22539b.f24644b > 0) {
            a(false);
            this.f22541d.f22550b.flush();
        }
    }
}
