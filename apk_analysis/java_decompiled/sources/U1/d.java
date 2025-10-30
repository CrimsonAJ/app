package U1;

import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.filter.FilterFragment;

/* loaded from: classes.dex */
public final class d extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f7254r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FilterFragment f7255s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FilterFragment filterFragment, E7.d dVar) {
        super(2, dVar);
        this.f7255s = filterFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new d(this.f7255s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((d) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
        return F7.a.f2587a;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f7254r;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
            throw new RuntimeException();
        }
        AbstractC0485a.A(obj);
        FilterFragment filterFragment = this.f7255s;
        l lVar = (l) filterFragment.f13761D0.getValue();
        b bVar = new b(filterFragment, 1);
        this.f7254r = 1;
        lVar.f7274k.collect(bVar, this);
        return aVar;
    }
}
