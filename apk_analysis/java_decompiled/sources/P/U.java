package P;

import B7.C0051b;
import a.AbstractC0485a;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class U extends G7.i implements O7.p {

    /* renamed from: s, reason: collision with root package name */
    public int f5554s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f5555t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ View f5556u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(View view, E7.d dVar) {
        super(dVar);
        this.f5556u = view;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        U u9 = new U(this.f5556u, dVar);
        u9.f5555t = obj;
        return u9;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((V7.k) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = F7.a.f2587a;
        int i9 = this.f5554s;
        View view = this.f5556u;
        if (i9 != 0) {
            Object obj4 = A7.n.f558a;
            if (i9 != 1) {
                if (i9 == 2) {
                    AbstractC0485a.A(obj);
                    return obj4;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V7.k kVar = (V7.k) this.f5555t;
            AbstractC0485a.A(obj);
            if (view instanceof ViewGroup) {
                this.f5555t = null;
                this.f5554s = 2;
                kVar.getClass();
                C0323y c0323y = new C0323y(new C0051b(1, (ViewGroup) view));
                if (!c0323y.f5652b.hasNext()) {
                    obj2 = obj4;
                } else {
                    kVar.f7836c = c0323y;
                    kVar.f7834a = 2;
                    kVar.f7837d = this;
                    obj2 = obj3;
                }
                if (obj2 != obj3) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
            return obj4;
        }
        AbstractC0485a.A(obj);
        V7.k kVar2 = (V7.k) this.f5555t;
        this.f5555t = kVar2;
        this.f5554s = 1;
        kVar2.d(view, this);
        return obj3;
    }
}
