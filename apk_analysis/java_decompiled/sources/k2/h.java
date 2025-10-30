package k2;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import com.anilab.android.ui.releaseCalendar.ReleaseCalendarFragment;

/* loaded from: classes.dex */
public final class h extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f19896r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ReleaseCalendarFragment f19897s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ReleaseCalendarFragment releaseCalendarFragment, E7.d dVar) {
        super(2, dVar);
        this.f19897s = releaseCalendarFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new h(this.f19897s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((h) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
        return F7.a.f2587a;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f19896r;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
            throw new RuntimeException();
        }
        AbstractC0485a.A(obj);
        ReleaseCalendarFragment releaseCalendarFragment = this.f19897s;
        C0718Q c0718q = releaseCalendarFragment.h0().f19911k;
        N1.k kVar = new N1.k(7, releaseCalendarFragment);
        this.f19896r = 1;
        c0718q.collect(kVar, this);
        return aVar;
    }
}
