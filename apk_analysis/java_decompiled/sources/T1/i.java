package T1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.external_player.SelectPlayerFragment;

/* loaded from: classes.dex */
public final class i extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f7021r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SelectPlayerFragment f7022s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(E7.d dVar, SelectPlayerFragment selectPlayerFragment) {
        super(2, dVar);
        this.f7022s = selectPlayerFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new i(dVar, this.f7022s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f7021r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            SelectPlayerFragment selectPlayerFragment = this.f7022s;
            h hVar = new h(null, selectPlayerFragment);
            this.f7021r = 1;
            if (Y.h(selectPlayerFragment, enumC0555p, hVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
