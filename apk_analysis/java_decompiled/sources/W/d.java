package W;

import P.F;
import P.Q;
import android.view.View;
import co.notix.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7844a;

    public /* synthetic */ d(int i9) {
        this.f7844a = i9;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        g gVar;
        switch (this.f7844a) {
            case 0:
                if (view != null) {
                    gVar = (g) view.getTag(R.id.dataBinding);
                } else {
                    gVar = null;
                }
                gVar.f7851h.run();
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = Q.f5546a;
                F.c(view);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i9 = this.f7844a;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
