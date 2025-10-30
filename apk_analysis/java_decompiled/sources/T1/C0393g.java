package T1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.external_player.SelectPlayerFragment;

/* renamed from: T1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393g extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f7017r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SelectPlayerFragment f7018s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0393g(E7.d dVar, SelectPlayerFragment selectPlayerFragment) {
        super(2, dVar);
        this.f7018s = selectPlayerFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0393g(dVar, this.f7018s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0393g) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f7017r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            SelectPlayerFragment selectPlayerFragment = this.f7018s;
            C0709H c0709h = new C0709H(((p) selectPlayerFragment.f13755T0.getValue()).f4741e);
            C0392f c0392f = new C0392f(null, selectPlayerFragment);
            this.f7017r = 1;
            if (AbstractC0714M.i(c0709h, c0392f, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
