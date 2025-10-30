package Q2;

import F0.r0;
import K5.ViewOnClickListenerC0215a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import co.notix.R;

/* renamed from: Q2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378v extends r0 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6300u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f6301v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f6302w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ D f6303x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0378v(D d9, View view) {
        super(view);
        this.f6303x = d9;
        if (l4.y.f20553a < 26) {
            view.setFocusable(true);
        }
        this.f6300u = (TextView) view.findViewById(R.id.exo_main_text);
        this.f6301v = (TextView) view.findViewById(R.id.exo_sub_text);
        this.f6302w = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new ViewOnClickListenerC0215a(7, this));
    }
}
