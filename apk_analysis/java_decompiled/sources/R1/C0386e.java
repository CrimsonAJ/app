package R1;

import J1.AbstractC0176g;
import a.AbstractC0485a;
import android.widget.FrameLayout;
import com.anilab.android.ui.download.DownloadFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* renamed from: R1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386e extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f6525r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DownloadFragment f6526s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0386e(E7.d dVar, DownloadFragment downloadFragment) {
        super(2, dVar);
        this.f6526s = downloadFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0386e c0386e = new C0386e(dVar, this.f6526s);
        c0386e.f6525r = ((Boolean) obj).booleanValue();
        return c0386e;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C0386e c0386e = (C0386e) create(bool, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0386e.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        float f9;
        int i9;
        AbstractC0485a.A(obj);
        boolean z9 = this.f6525r;
        AbstractC0176g abstractC0176g = (AbstractC0176g) this.f6526s.m0();
        MaterialButton materialButton = abstractC0176g.f3934w;
        materialButton.setEnabled(!z9);
        if (z9) {
            f9 = 0.5f;
        } else {
            f9 = 1.0f;
        }
        materialButton.setAlpha(f9);
        FrameLayout loadingEpisode = abstractC0176g.f3927A;
        kotlin.jvm.internal.h.d(loadingEpisode, "loadingEpisode");
        int i10 = 8;
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        loadingEpisode.setVisibility(i9);
        CircularProgressIndicator loadingQuality = abstractC0176g.f3928B;
        kotlin.jvm.internal.h.d(loadingQuality, "loadingQuality");
        if (z9) {
            i10 = 0;
        }
        loadingQuality.setVisibility(i10);
        return A7.n.f558a;
    }
}
