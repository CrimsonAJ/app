package T1;

import J1.AbstractC0212y0;
import a.AbstractC0485a;
import android.widget.FrameLayout;
import com.anilab.android.ui.external_player.SelectSubtitleForPlayerFragment;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class s extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f7036r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SelectSubtitleForPlayerFragment f7037s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(E7.d dVar, SelectSubtitleForPlayerFragment selectSubtitleForPlayerFragment) {
        super(2, dVar);
        this.f7037s = selectSubtitleForPlayerFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        s sVar = new s(dVar, this.f7037s);
        sVar.f7036r = ((Boolean) obj).booleanValue();
        return sVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        s sVar = (s) create(bool, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        sVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int i9;
        float f9;
        AbstractC0485a.A(obj);
        boolean z9 = this.f7036r;
        AbstractC0212y0 abstractC0212y0 = (AbstractC0212y0) this.f7037s.m0();
        FrameLayout progressBar = abstractC0212y0.f4141z;
        kotlin.jvm.internal.h.d(progressBar, "progressBar");
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        progressBar.setVisibility(i9);
        MaterialButton materialButton = abstractC0212y0.f4138w;
        materialButton.setEnabled(!z9);
        if (z9) {
            f9 = 0.5f;
        } else {
            f9 = 1.0f;
        }
        materialButton.setAlpha(f9);
        return A7.n.f558a;
    }
}
