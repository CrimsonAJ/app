package o7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: o7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1716h extends AbstractC1719k {

    /* renamed from: c, reason: collision with root package name */
    public static final C1709a f21684c = new C1709a(2);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1719k f21685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21686b;

    public C1716h(AbstractC1719k abstractC1719k, int i9) {
        this.f21686b = i9;
        this.f21685a = abstractC1719k;
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n abstractC1722n) {
        switch (this.f21686b) {
            case 0:
                Collection f9 = f();
                abstractC1722n.a();
                while (abstractC1722n.F()) {
                    ((ArrayList) f9).add(this.f21685a.b(abstractC1722n));
                }
                abstractC1722n.g();
                return f9;
            default:
                Collection f10 = f();
                abstractC1722n.a();
                while (abstractC1722n.F()) {
                    f10.add(this.f21685a.b(abstractC1722n));
                }
                abstractC1722n.g();
                return f10;
        }
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q abstractC1725q, Object obj) {
        switch (this.f21686b) {
            case 0:
                abstractC1725q.a();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    this.f21685a.e(abstractC1725q, it.next());
                }
                ((C1724p) abstractC1725q).a0(1, 2, ']');
                return;
            default:
                abstractC1725q.a();
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    this.f21685a.e(abstractC1725q, it2.next());
                }
                ((C1724p) abstractC1725q).a0(1, 2, ']');
                return;
        }
    }

    public final Collection f() {
        switch (this.f21686b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    public final String toString() {
        return this.f21685a + ".collection()";
    }
}
