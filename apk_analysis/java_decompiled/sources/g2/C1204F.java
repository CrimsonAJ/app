package g2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.player.PlayerActivity;

/* renamed from: g2.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1204F extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f17568r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17569s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CharSequence f17570t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204F(PlayerActivity playerActivity, CharSequence charSequence, E7.d dVar) {
        super(2, dVar);
        this.f17569s = playerActivity;
        this.f17570t = charSequence;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1204F(this.f17569s, this.f17570t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1204F) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17568r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f17568r = 1;
            if (Y7.B.g(200L, this) == aVar) {
                return aVar;
            }
        }
        int i10 = PlayerActivity.f13798w0;
        C1225b a02 = this.f17569s.a0();
        a02.getClass();
        new R1.B(a02, 2).filter(this.f17570t);
        return A7.n.f558a;
    }
}
