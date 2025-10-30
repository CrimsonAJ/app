package androidx.mediarouter.app;

import a.AbstractC0485a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.notix.R;
import t0.C1983q;
import t0.C1991z;

/* loaded from: classes.dex */
public final class K extends E {

    /* renamed from: A, reason: collision with root package name */
    public final ProgressBar f9961A;

    /* renamed from: B, reason: collision with root package name */
    public final TextView f9962B;

    /* renamed from: C, reason: collision with root package name */
    public final RelativeLayout f9963C;

    /* renamed from: D, reason: collision with root package name */
    public final CheckBox f9964D;

    /* renamed from: E, reason: collision with root package name */
    public final float f9965E;

    /* renamed from: F, reason: collision with root package name */
    public final int f9966F;

    /* renamed from: G, reason: collision with root package name */
    public final D f9967G;

    /* renamed from: H, reason: collision with root package name */
    public final /* synthetic */ L f9968H;

    /* renamed from: y, reason: collision with root package name */
    public final View f9969y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f9970z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l9, View view) {
        super(l9.f9979m, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.f9968H = l9;
        this.f9967G = new D(4, this);
        this.f9969y = view;
        this.f9970z = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
        this.f9961A = progressBar;
        this.f9962B = (TextView) view.findViewById(R.id.mr_cast_route_name);
        this.f9963C = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
        this.f9964D = checkBox;
        N n7 = l9.f9979m;
        Context context = n7.f10030n;
        Drawable q9 = AbstractC0485a.q(context, R.drawable.mr_cast_checkbox);
        if (s8.e.K(context)) {
            q9.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        checkBox.setButtonDrawable(q9);
        s8.e.a0(n7.f10030n, progressBar);
        this.f9965E = s8.e.B(n7.f10030n);
        Resources resources = n7.f10030n.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
        this.f9966F = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean t(t0.C c3) {
        int i9;
        if (!c3.g()) {
            C1991z a5 = this.f9968H.f9979m.f10021i.a();
            if (a5 != null) {
                C1983q c1983q = (C1983q) a5.f23055x.get(c3.f22842c);
                if (c1983q != null) {
                    i9 = c1983q.f23024b;
                } else {
                    i9 = 4;
                }
                if (i9 == 3) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void u(boolean z9, boolean z10) {
        CheckBox checkBox = this.f9964D;
        int i9 = 0;
        checkBox.setEnabled(false);
        this.f9969y.setEnabled(false);
        checkBox.setChecked(z9);
        if (z9) {
            this.f9970z.setVisibility(4);
            this.f9961A.setVisibility(0);
        }
        if (z10) {
            if (z9) {
                i9 = this.f9966F;
            }
            this.f9968H.n(this.f9963C, i9);
        }
    }
}
