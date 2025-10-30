package X;

import a.AbstractC0485a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407g extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Iterator f8064r;

    /* renamed from: s, reason: collision with root package name */
    public Object f8065s;

    /* renamed from: t, reason: collision with root package name */
    public int f8066t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f8067u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List f8068v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8069w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0407g(List list, ArrayList arrayList, E7.d dVar) {
        super(2, dVar);
        this.f8068v = list;
        this.f8069w = arrayList;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0407g c0407g = new C0407g(this.f8068v, this.f8069w, dVar);
        c0407g.f8067u = obj;
        return c0407g;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0407g) create(obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        int i9 = this.f8066t;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    it = this.f8064r;
                    list = (List) this.f8067u;
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f8065s;
                Iterator it2 = this.f8064r;
                List list2 = (List) this.f8067u;
                AbstractC0485a.A(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new G7.j(1, null));
                    this.f8067u = list2;
                    this.f8064r = it2;
                    this.f8065s = null;
                    this.f8066t = 2;
                    throw null;
                }
            }
        } else {
            AbstractC0485a.A(obj);
            obj = this.f8067u;
            it = this.f8068v.iterator();
            list = this.f8069w;
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() == null) {
            this.f8067u = list;
            this.f8064r = it;
            this.f8065s = obj;
            this.f8066t = 1;
            throw null;
        }
        throw new ClassCastException();
    }
}
