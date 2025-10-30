package o7;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;
import k4.C1499E;

/* renamed from: o7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1715g extends AbstractC1719k {

    /* renamed from: d, reason: collision with root package name */
    public static final C1709a f21680d = new C1709a(1);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1708D f21681a;

    /* renamed from: b, reason: collision with root package name */
    public final C1714f[] f21682b;

    /* renamed from: c, reason: collision with root package name */
    public final C1499E f21683c;

    public C1715g(AbstractC1708D abstractC1708D, TreeMap treeMap) {
        this.f21681a = abstractC1708D;
        this.f21682b = (C1714f[]) treeMap.values().toArray(new C1714f[treeMap.size()]);
        this.f21683c = C1499E.o((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n abstractC1722n) {
        try {
            Object e8 = this.f21681a.e();
            try {
                abstractC1722n.d();
                while (abstractC1722n.F()) {
                    int h02 = abstractC1722n.h0(this.f21683c);
                    if (h02 == -1) {
                        abstractC1722n.i0();
                        abstractC1722n.j0();
                    } else {
                        C1714f c1714f = this.f21682b[h02];
                        c1714f.f21678b.set(e8, c1714f.f21679c.b(abstractC1722n));
                    }
                }
                abstractC1722n.s();
                return e8;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e9) {
            throw new RuntimeException(e9);
        } catch (InvocationTargetException e10) {
            p7.e.g(e10);
            throw null;
        }
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q abstractC1725q, Object obj) {
        try {
            abstractC1725q.d();
            for (C1714f c1714f : this.f21682b) {
                abstractC1725q.x(c1714f.f21677a);
                c1714f.f21679c.e(abstractC1725q, c1714f.f21678b.get(obj));
            }
            abstractC1725q.g();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.f21681a + ")";
    }
}
