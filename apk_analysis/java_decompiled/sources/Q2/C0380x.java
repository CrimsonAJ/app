package Q2;

import F0.r0;
import android.view.View;
import android.widget.TextView;
import co.notix.R;

/* renamed from: Q2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380x extends r0 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6308u;

    /* renamed from: v, reason: collision with root package name */
    public final View f6309v;

    public C0380x(View view) {
        super(view);
        if (l4.y.f20553a < 26) {
            view.setFocusable(true);
        }
        this.f6308u = (TextView) view.findViewById(R.id.exo_text);
        this.f6309v = view.findViewById(R.id.exo_check);
    }
}
