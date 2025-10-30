package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.response.HomeResponse;
import java.util.Collection;
import java.util.List;
import o7.AbstractC1708D;
import p7.C1865c;
import v2.C2102b;
import y2.C2203a;

/* renamed from: C2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068n extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ E f1386r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0068n(E e8, E7.d dVar) {
        super(2, dVar);
        this.f1386r = e8;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0068n(this.f1386r, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0068n) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object h7;
        AbstractC0485a.A(obj);
        C2203a c2203a = this.f1386r.f1269b;
        String string = c2203a.f24771a.getString(g6.o.f17761a.a0(), "");
        C1865c f9 = AbstractC1708D.f(HomeResponse.class);
        Collection collection = B7.t.f1135a;
        if (string != null && string.length() != 0) {
            Object obj2 = null;
            try {
                h7 = (List) c2203a.f24772b.b(f9, p7.e.f22206a, null).a(string);
            } catch (Throwable th) {
                h7 = AbstractC0485a.h(th);
            }
            if (!(h7 instanceof A7.i)) {
                obj2 = h7;
            }
            Collection collection2 = (List) obj2;
            if (collection2 != null) {
                collection = collection2;
            }
        }
        return new C2102b(collection);
    }
}
