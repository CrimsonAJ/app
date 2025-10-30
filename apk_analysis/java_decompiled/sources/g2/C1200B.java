package g2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.player.PlayerActivity;
import i0.C1337N;
import l6.AbstractC1570b;
import o2.C1685l;
import u6.C2083b;

/* renamed from: g2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1200B extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f17559r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17560s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1200B(E7.d dVar, PlayerActivity playerActivity) {
        super(2, dVar);
        this.f17560s = playerActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1200B(dVar, this.f17560s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1200B) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17559r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f17559r = 1;
            obj = AbstractC1570b.k(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            int i10 = PlayerActivity.f13798w0;
            PlayerActivity playerActivity = this.f17560s;
            if (playerActivity.d0().f17647x) {
                playerActivity.Z().stop();
                String str = C1685l.f21533M0;
                C1337N P8 = playerActivity.P();
                kotlin.jvm.internal.h.d(P8, "getSupportFragmentManager(...)");
                String str2 = C1685l.f21533M0;
                if (P8.C(str2) == null) {
                    new C1685l().k0(P8, str2);
                }
            } else {
                C2083b.a().b(new IllegalArgumentException("616"));
            }
        }
        return A7.n.f558a;
    }
}
