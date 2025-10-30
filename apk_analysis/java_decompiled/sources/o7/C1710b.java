package o7;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: o7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1710b extends AbstractC1719k {

    /* renamed from: d, reason: collision with root package name */
    public static final C1709a f21663d = new C1709a(0);

    /* renamed from: e, reason: collision with root package name */
    public static final C1709a f21664e = new C1709a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21665a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1719k f21666b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21667c;

    public C1710b(Class cls, AbstractC1719k abstractC1719k) {
        this.f21667c = cls;
        this.f21666b = abstractC1719k;
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n abstractC1722n) {
        switch (this.f21665a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                abstractC1722n.a();
                while (abstractC1722n.F()) {
                    arrayList.add(this.f21666b.b(abstractC1722n));
                }
                abstractC1722n.g();
                Object newInstance = Array.newInstance((Class<?>) this.f21667c, arrayList.size());
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    Array.set(newInstance, i9, arrayList.get(i9));
                }
                return newInstance;
            default:
                C1729u c1729u = new C1729u();
                abstractC1722n.d();
                while (abstractC1722n.F()) {
                    C1723o c1723o = (C1723o) abstractC1722n;
                    if (c1723o.F()) {
                        c1723o.j = c1723o.q0();
                        c1723o.f21698g = 11;
                    }
                    Object b9 = this.f21666b.b(abstractC1722n);
                    Object b10 = ((AbstractC1719k) this.f21667c).b(abstractC1722n);
                    Object put = c1729u.put(b9, b10);
                    if (put != null) {
                        throw new RuntimeException("Map key '" + b9 + "' has multiple values at path " + abstractC1722n.x() + ": " + put + " and " + b10);
                    }
                }
                abstractC1722n.s();
                return c1729u;
        }
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q abstractC1725q, Object obj) {
        switch (this.f21665a) {
            case 0:
                abstractC1725q.a();
                int length = Array.getLength(obj);
                for (int i9 = 0; i9 < length; i9++) {
                    this.f21666b.e(abstractC1725q, Array.get(obj, i9));
                }
                ((C1724p) abstractC1725q).a0(1, 2, ']');
                return;
            default:
                abstractC1725q.d();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() != null) {
                        int I4 = abstractC1725q.I();
                        if (I4 != 5 && I4 != 3) {
                            throw new IllegalStateException("Nesting problem.");
                        }
                        abstractC1725q.f21708e = true;
                        this.f21666b.e(abstractC1725q, entry.getKey());
                        ((AbstractC1719k) this.f21667c).e(abstractC1725q, entry.getValue());
                    } else {
                        throw new RuntimeException("Map key is null at " + abstractC1725q.s());
                    }
                }
                abstractC1725q.g();
                return;
        }
    }

    public final String toString() {
        switch (this.f21665a) {
            case 0:
                return this.f21666b + ".array()";
            default:
                return "JsonAdapter(" + this.f21666b + "=" + ((AbstractC1719k) this.f21667c) + ")";
        }
    }

    public C1710b(y yVar, Type type, Type type2) {
        yVar.getClass();
        Set set = p7.e.f22206a;
        this.f21666b = yVar.b(type, set, null);
        this.f21667c = yVar.b(type2, set, null);
    }
}
