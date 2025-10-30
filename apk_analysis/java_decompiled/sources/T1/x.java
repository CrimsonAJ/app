package T1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.external_player.SelectSubtitleForPlayerFragment;
import i0.W;

/* loaded from: classes.dex */
public final class x extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f7046r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SelectSubtitleForPlayerFragment f7047s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(E7.d dVar, SelectSubtitleForPlayerFragment selectSubtitleForPlayerFragment) {
        super(2, dVar);
        this.f7047s = selectSubtitleForPlayerFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new x(dVar, this.f7047s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f7046r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            SelectSubtitleForPlayerFragment selectSubtitleForPlayerFragment = this.f7047s;
            W t7 = selectSubtitleForPlayerFragment.t();
            EnumC0555p enumC0555p = EnumC0555p.f9896d;
            w wVar = new w(null, selectSubtitleForPlayerFragment);
            this.f7046r = 1;
            if (Y.h(t7, enumC0555p, wVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
