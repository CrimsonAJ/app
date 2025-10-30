package o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import n.InterfaceC1596b;

/* loaded from: classes.dex */
public final class p extends FrameLayout implements InterfaceC1596b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f21432a;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
        super(view.getContext());
        this.f21432a = (CollapsibleActionView) view;
        addView(view);
    }
}
