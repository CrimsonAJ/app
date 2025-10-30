package T1;

import J1.AbstractC0192o;
import a.AbstractC0485a;
import android.widget.ProgressBar;
import com.anilab.android.ui.external_player.SelectPlayerFragment;

/* renamed from: T1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392f extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f7015r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SelectPlayerFragment f7016s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0392f(E7.d dVar, SelectPlayerFragment selectPlayerFragment) {
        super(2, dVar);
        this.f7016s = selectPlayerFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0392f c0392f = new C0392f(dVar, this.f7016s);
        c0392f.f7015r = ((Boolean) obj).booleanValue();
        return c0392f;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C0392f c0392f = (C0392f) create(bool, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0392f.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int i9;
        AbstractC0485a.A(obj);
        boolean z9 = this.f7015r;
        ProgressBar progressBar = ((AbstractC0192o) this.f7016s.m0()).f4024x;
        kotlin.jvm.internal.h.d(progressBar, "progressBar");
        if (!z9) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        progressBar.setVisibility(i9);
        return A7.n.f558a;
    }
}
