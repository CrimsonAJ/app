package g2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.player.PlayerActivity;

/* renamed from: g2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1245v extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f17696r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17697s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245v(E7.d dVar, PlayerActivity playerActivity) {
        super(2, dVar);
        this.f17697s = playerActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1245v(dVar, this.f17697s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1245v) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17696r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            int i10 = PlayerActivity.f13798w0;
            PlayerActivity playerActivity = this.f17697s;
            C0709H c0709h = new C0709H(playerActivity.d0().f17641r);
            C1244u c1244u = new C1244u(null, playerActivity);
            this.f17696r = 1;
            if (AbstractC0714M.i(c0709h, c1244u, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
