package g2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.player.PlayerActivity;

/* renamed from: g2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1247x extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f17700r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17701s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1247x(E7.d dVar, PlayerActivity playerActivity) {
        super(2, dVar);
        this.f17701s = playerActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1247x(dVar, this.f17701s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1247x) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17700r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            int i10 = PlayerActivity.f13798w0;
            PlayerActivity playerActivity = this.f17701s;
            C0709H c0709h = new C0709H(playerActivity.d0().f17642s);
            C1246w c1246w = new C1246w(null, playerActivity);
            this.f17700r = 1;
            if (AbstractC0714M.i(c0709h, c1246w, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
