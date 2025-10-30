package P3;

import j3.M;
import k4.C1516p;
import k4.InterfaceC1513m;
import k4.V;
import l4.AbstractC1566a;
import q3.C1902g;
import s8.n;

/* loaded from: classes.dex */
public final class j extends e {
    public final d j;

    /* renamed from: k, reason: collision with root package name */
    public O0.c f5880k;

    /* renamed from: l, reason: collision with root package name */
    public long f5881l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f5882m;

    public j(InterfaceC1513m interfaceC1513m, C1516p c1516p, M m9, int i9, Object obj, d dVar) {
        super(interfaceC1513m, c1516p, 2, m9, i9, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = dVar;
    }

    @Override // k4.J
    public final void a() {
        boolean z9;
        if (this.f5881l == 0) {
            this.j.a(this.f5880k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C1516p c3 = this.f5839b.c(this.f5881l);
            V v8 = this.f5846i;
            C1902g c1902g = new C1902g(v8, c3.f20081e, v8.g(c3));
            while (!this.f5882m) {
                try {
                    int f9 = this.j.f5829a.f(c1902g, d.j);
                    boolean z10 = false;
                    if (f9 != 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    AbstractC1566a.m(z9);
                    if (f9 == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        break;
                    }
                } finally {
                    this.f5881l = c1902g.f22312d - this.f5839b.f20081e;
                }
            }
        } finally {
            n.h(this.f5846i);
        }
    }

    @Override // k4.J
    public final void c() {
        this.f5882m = true;
    }
}
