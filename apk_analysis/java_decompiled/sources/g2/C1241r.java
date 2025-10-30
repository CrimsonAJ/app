package g2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0708G;
import com.anilab.android.ui.player.PlayerActivity;

/* renamed from: g2.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1241r extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f17688r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17689s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1241r(E7.d dVar, PlayerActivity playerActivity) {
        super(2, dVar);
        this.f17689s = playerActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1241r(dVar, this.f17689s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1241r) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17688r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            int i10 = PlayerActivity.f13798w0;
            PlayerActivity playerActivity = this.f17689s;
            C0708G c0708g = new C0708G(playerActivity.d0().f4740d);
            C1240q c1240q = new C1240q(null, playerActivity);
            this.f17688r = 1;
            if (AbstractC0714M.i(c0708g, c1240q, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
