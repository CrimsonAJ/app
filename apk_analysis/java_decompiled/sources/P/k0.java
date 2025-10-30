package P;

import l6.AbstractC1570b;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f5612a;

    /* renamed from: b, reason: collision with root package name */
    public H.c[] f5613b;

    public k0() {
        this(new u0());
    }

    public final void a() {
        H.c[] cVarArr = this.f5613b;
        if (cVarArr != null) {
            H.c cVar = cVarArr[0];
            H.c cVar2 = cVarArr[1];
            u0 u0Var = this.f5612a;
            if (cVar2 == null) {
                cVar2 = u0Var.f5645a.f(2);
            }
            if (cVar == null) {
                cVar = u0Var.f5645a.f(1);
            }
            g(H.c.a(cVar, cVar2));
            H.c cVar3 = this.f5613b[AbstractC1570b.j(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            H.c cVar4 = this.f5613b[AbstractC1570b.j(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            H.c cVar5 = this.f5613b[AbstractC1570b.j(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract u0 b();

    public void c(int i9, H.c cVar) {
        if (this.f5613b == null) {
            this.f5613b = new H.c[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i9 & i10) != 0) {
                this.f5613b[AbstractC1570b.j(i10)] = cVar;
            }
        }
    }

    public abstract void e(H.c cVar);

    public abstract void g(H.c cVar);

    public k0(u0 u0Var) {
        this.f5612a = u0Var;
    }

    public void d(H.c cVar) {
    }

    public void f(H.c cVar) {
    }

    public void h(H.c cVar) {
    }
}
