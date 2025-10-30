package P;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class r implements InterfaceC0317s {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f5638a;

    public r(NestedScrollView nestedScrollView) {
        this.f5638a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // P.InterfaceC0317s
    public final void b(int i9, int i10, int i11, boolean z9) {
        this.f5638a.onScrollLimit(i9, i10, i11, z9);
    }

    @Override // P.InterfaceC0317s
    public final void c(int i9, int i10, int i11, int i12) {
        this.f5638a.onScrollProgress(i9, i10, i11, i12);
    }
}
