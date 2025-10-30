package i;

import P.Q;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.gms.internal.measurement.D1;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class F extends D1 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17987g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ I f17988h;

    public /* synthetic */ F(I i9, int i10) {
        this.f17987g = i10;
        this.f17988h = i9;
    }

    @Override // P.Y
    public final void a() {
        View view;
        I i9 = this.f17988h;
        switch (this.f17987g) {
            case 0:
                if (i9.f18015u && (view = i9.f18007m) != null) {
                    view.setTranslationY(0.0f);
                    i9.j.setTranslationY(0.0f);
                }
                i9.j.setVisibility(8);
                i9.j.setTransitioning(false);
                i9.f18019y = null;
                O0.c cVar = i9.f18011q;
                if (cVar != null) {
                    cVar.G(i9.f18010p);
                    i9.f18010p = null;
                    i9.f18011q = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = i9.f18004i;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = Q.f5546a;
                    P.F.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                i9.f18019y = null;
                i9.j.requestLayout();
                return;
        }
    }
}
