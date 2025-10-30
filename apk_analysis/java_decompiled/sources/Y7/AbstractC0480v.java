package Y7;

import d8.AbstractC1130a;

/* renamed from: Y7.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0480v extends E7.a implements E7.f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0479u f8858a = new C0479u(E7.e.f1977a, C0478t.f8854d);

    public AbstractC0480v() {
        super(E7.e.f1977a);
    }

    public abstract void g0(E7.i iVar, Runnable runnable);

    /* JADX WARN: Type inference failed for: r3v3, types: [O7.l, kotlin.jvm.internal.i] */
    @Override // E7.a, E7.i
    public final E7.g get(E7.h key) {
        E7.g gVar;
        kotlin.jvm.internal.h.e(key, "key");
        if (key instanceof C0479u) {
            C0479u c0479u = (C0479u) key;
            E7.h key2 = getKey();
            kotlin.jvm.internal.h.e(key2, "key");
            if ((key2 == c0479u || c0479u.f8856b == key2) && (gVar = (E7.g) c0479u.f8855a.invoke(this)) != null) {
                return gVar;
            }
            return null;
        }
        if (E7.e.f1977a == key) {
            return this;
        }
        return null;
    }

    public void h0(E7.i iVar, Runnable runnable) {
        g0(iVar, runnable);
    }

    public boolean i0() {
        return !(this instanceof F0);
    }

    public AbstractC0480v j0(int i9) {
        AbstractC1130a.a(i9);
        return new d8.i(this, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v2, types: [O7.l, kotlin.jvm.internal.i] */
    @Override // E7.a, E7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final E7.i minusKey(E7.h r4) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.h.e(r4, r0)
            boolean r1 = r4 instanceof Y7.C0479u
            E7.j r2 = E7.j.f1978a
            if (r1 == 0) goto L27
            Y7.u r4 = (Y7.C0479u) r4
            E7.h r1 = r3.getKey()
            kotlin.jvm.internal.h.e(r1, r0)
            if (r1 == r4) goto L1c
            E7.h r0 = r4.f8856b
            if (r0 != r1) goto L1b
            goto L1c
        L1b:
            return r3
        L1c:
            kotlin.jvm.internal.i r4 = r4.f8855a
            java.lang.Object r4 = r4.invoke(r3)
            E7.g r4 = (E7.g) r4
            if (r4 == 0) goto L2c
            goto L2b
        L27:
            E7.e r0 = E7.e.f1977a
            if (r0 != r4) goto L2c
        L2b:
            return r2
        L2c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.AbstractC0480v.minusKey(E7.h):E7.i");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + B.l(this);
    }
}
