package androidx.datastore.preferences.protobuf;

import F0.C0120y;

/* loaded from: classes.dex */
public final class L implements T {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0533t f9649a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f9650b;

    /* renamed from: c, reason: collision with root package name */
    public final C0527m f9651c;

    public L(b0 b0Var, C0527m c0527m, AbstractC0533t abstractC0533t) {
        this.f9650b = b0Var;
        c0527m.getClass();
        this.f9651c = c0527m;
        this.f9649a = abstractC0533t;
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final void a(Object obj, Object obj2) {
        U.k(this.f9650b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final void b(Object obj) {
        this.f9650b.getClass();
        a0 a0Var = ((AbstractC0533t) obj).unknownFields;
        if (a0Var.f9687e) {
            a0Var.f9687e = false;
        }
        this.f9651c.getClass();
        A0.a.x(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final boolean c(Object obj) {
        this.f9651c.getClass();
        A0.a.x(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final AbstractC0533t d() {
        AbstractC0533t abstractC0533t = this.f9649a;
        if (u0.z.i(abstractC0533t)) {
            return abstractC0533t.i();
        }
        return ((r) abstractC0533t.c(5)).c();
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final void e(Object obj, C0120y c0120y, C0526l c0526l) {
        this.f9650b.getClass();
        b0.a(obj);
        this.f9651c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final void f(Object obj, C c3) {
        this.f9651c.getClass();
        A0.a.x(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final int g(AbstractC0533t abstractC0533t) {
        this.f9650b.getClass();
        return abstractC0533t.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final boolean h(AbstractC0533t abstractC0533t, AbstractC0533t abstractC0533t2) {
        this.f9650b.getClass();
        if (!abstractC0533t.unknownFields.equals(abstractC0533t2.unknownFields)) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.T
    public final int i(AbstractC0533t abstractC0533t) {
        this.f9650b.getClass();
        a0 a0Var = abstractC0533t.unknownFields;
        int i9 = a0Var.f9686d;
        if (i9 != -1) {
            return i9;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < a0Var.f9683a; i11++) {
            int i12 = a0Var.f9684b[i11] >>> 3;
            i10 += C0524j.J(3, (C0521g) a0Var.f9685c[i11]) + C0524j.M(i12) + C0524j.L(2) + (C0524j.L(1) * 2);
        }
        a0Var.f9686d = i10;
        return i10;
    }
}
