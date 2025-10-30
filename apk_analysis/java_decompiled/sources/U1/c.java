package U1;

import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.filter.FilterFragment;

/* loaded from: classes.dex */
public final class c extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f7252r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FilterFragment f7253s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FilterFragment filterFragment, E7.d dVar) {
        super(2, dVar);
        this.f7253s = filterFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new c(this.f7253s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((c) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
        return F7.a.f2587a;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f7252r;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
            throw new RuntimeException();
        }
        AbstractC0485a.A(obj);
        FilterFragment filterFragment = this.f7253s;
        l lVar = (l) filterFragment.f13761D0.getValue();
        b bVar = new b(filterFragment, 0);
        this.f7252r = 1;
        lVar.f7272h.collect(bVar, this);
        return aVar;
    }
}
