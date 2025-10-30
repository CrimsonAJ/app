package T1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.external_player.SelectPlayerFragment;

/* renamed from: T1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0391e extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f7013r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SelectPlayerFragment f7014s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0391e(E7.d dVar, SelectPlayerFragment selectPlayerFragment) {
        super(2, dVar);
        this.f7014s = selectPlayerFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0391e(dVar, this.f7014s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0391e) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f7013r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            SelectPlayerFragment selectPlayerFragment = this.f7014s;
            C0709H c0709h = new C0709H(((p) selectPlayerFragment.f13755T0.getValue()).f7031g);
            C0390d c0390d = new C0390d(null, selectPlayerFragment);
            this.f7013r = 1;
            if (AbstractC0714M.i(c0709h, c0390d, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
