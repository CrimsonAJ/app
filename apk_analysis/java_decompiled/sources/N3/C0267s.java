package N3;

import j3.C0;
import j3.D0;
import j3.E0;

/* renamed from: N3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267s extends AbstractC0264o {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f5188e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f5189c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5190d;

    public C0267s(E0 e02, Object obj, Object obj2) {
        super(e02);
        this.f5189c = obj;
        this.f5190d = obj2;
    }

    @Override // N3.AbstractC0264o, j3.E0
    public final int b(Object obj) {
        Object obj2;
        if (f5188e.equals(obj) && (obj2 = this.f5190d) != null) {
            obj = obj2;
        }
        return this.f5173b.b(obj);
    }

    @Override // N3.AbstractC0264o, j3.E0
    public final C0 f(int i9, C0 c02, boolean z9) {
        this.f5173b.f(i9, c02, z9);
        if (l4.y.a(c02.f19236b, this.f5190d) && z9) {
            c02.f19236b = f5188e;
        }
        return c02;
    }

    @Override // N3.AbstractC0264o, j3.E0
    public final Object l(int i9) {
        Object l9 = this.f5173b.l(i9);
        if (l4.y.a(l9, this.f5190d)) {
            return f5188e;
        }
        return l9;
    }

    @Override // N3.AbstractC0264o, j3.E0
    public final D0 m(int i9, D0 d02, long j) {
        this.f5173b.m(i9, d02, j);
        if (l4.y.a(d02.f19303a, this.f5189c)) {
            d02.f19303a = D0.f19300r;
        }
        return d02;
    }
}
