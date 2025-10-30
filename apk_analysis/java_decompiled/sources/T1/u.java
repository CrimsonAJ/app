package T1;

import a.AbstractC0485a;
import co.notix.R;
import com.anilab.android.ui.external_player.SelectSubtitleForPlayerFragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7040r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SelectSubtitleForPlayerFragment f7041s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(E7.d dVar, SelectSubtitleForPlayerFragment selectSubtitleForPlayerFragment) {
        super(2, dVar);
        this.f7041s = selectSubtitleForPlayerFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        u uVar = new u(dVar, this.f7041s);
        uVar.f7040r = obj;
        return uVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        u uVar = (u) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        uVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        SelectSubtitleForPlayerFragment selectSubtitleForPlayerFragment = this.f7041s;
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f7040r).a();
        if (a5 != null) {
            B b9 = (B) a5;
            if (b9.equals(A.f6972a)) {
                try {
                    String r5 = selectSubtitleForPlayerFragment.r(R.string.label_none);
                    kotlin.jvm.internal.h.d(r5, "getString(...)");
                    ArrayList c02 = B7.l.c0(new I2.c(0L, "", r5, ""));
                    c02.addAll(selectSubtitleForPlayerFragment.u0().f6995l.f3447d);
                    ((n2.h) selectSubtitleForPlayerFragment.f13759U0.getValue()).o(B7.k.H0(c02));
                    SelectSubtitleForPlayerFragment.t0(selectSubtitleForPlayerFragment);
                } catch (Exception unused) {
                }
            } else if (!b9.equals(A.f6973b)) {
                throw new RuntimeException();
            }
        }
        return A7.n.f558a;
    }
}
