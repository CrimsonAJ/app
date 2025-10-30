package b2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.main.HostFragment;

/* renamed from: b2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590c extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f10479r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HostFragment f10480s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0590c(E7.d dVar, HostFragment hostFragment) {
        super(2, dVar);
        this.f10480s = hostFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0590c(dVar, this.f10480s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0590c) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f10479r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            HostFragment hostFragment = this.f10480s;
            C0709H c0709h = new C0709H(hostFragment.h0().f10495i);
            C0589b c0589b = new C0589b(null, hostFragment);
            this.f10479r = 1;
            if (AbstractC0714M.i(c0709h, c0589b, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
