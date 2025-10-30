package P3;

import N3.c0;
import j3.M;
import k4.C1516p;
import k4.InterfaceC1513m;
import k4.V;
import l4.AbstractC1566a;
import q3.C1902g;
import s8.n;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: o, reason: collision with root package name */
    public final int f5874o;

    /* renamed from: p, reason: collision with root package name */
    public final long f5875p;

    /* renamed from: q, reason: collision with root package name */
    public final d f5876q;

    /* renamed from: r, reason: collision with root package name */
    public long f5877r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f5878s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5879t;

    public i(InterfaceC1513m interfaceC1513m, C1516p c1516p, M m9, int i9, Object obj, long j, long j4, long j9, long j10, long j11, int i10, long j12, d dVar) {
        super(interfaceC1513m, c1516p, m9, i9, obj, j, j4, j9, j10, j11);
        this.f5874o = i10;
        this.f5875p = j12;
        this.f5876q = dVar;
    }

    @Override // k4.J
    public final void a() {
        boolean z9;
        boolean z10;
        long j;
        if (this.f5877r == 0) {
            O0.c cVar = this.f5818m;
            AbstractC1566a.n(cVar);
            long j4 = this.f5875p;
            for (c0 c0Var : (c0[]) cVar.f5264c) {
                if (c0Var.f5052F != j4) {
                    c0Var.f5052F = j4;
                    c0Var.f5078z = true;
                }
            }
            d dVar = this.f5876q;
            long j9 = this.f5816k;
            long j10 = -9223372036854775807L;
            if (j9 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = j9 - this.f5875p;
            }
            long j11 = this.f5817l;
            if (j11 != -9223372036854775807L) {
                j10 = j11 - this.f5875p;
            }
            dVar.a(cVar, j, j10);
        }
        try {
            C1516p c3 = this.f5839b.c(this.f5877r);
            V v8 = this.f5846i;
            C1902g c1902g = new C1902g(v8, c3.f20081e, v8.g(c3));
            do {
                try {
                    if (this.f5878s) {
                        break;
                    }
                    int f9 = this.f5876q.f5829a.f(c1902g, d.j);
                    if (f9 != 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    AbstractC1566a.m(z9);
                    if (f9 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } finally {
                    this.f5877r = c1902g.f22312d - this.f5839b.f20081e;
                }
            } while (z10);
            n.h(this.f5846i);
            this.f5879t = !this.f5878s;
        } catch (Throwable th) {
            n.h(this.f5846i);
            throw th;
        }
    }

    @Override // P3.k
    public final long b() {
        return this.j + this.f5874o;
    }

    @Override // k4.J
    public final void c() {
        this.f5878s = true;
    }

    @Override // P3.k
    public final boolean d() {
        return this.f5879t;
    }
}
