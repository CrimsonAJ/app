package androidx.mediarouter.app;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import co.notix.R;

/* loaded from: classes.dex */
public final class H extends E {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ L f9955A;

    /* renamed from: y, reason: collision with root package name */
    public final TextView f9956y;

    /* renamed from: z, reason: collision with root package name */
    public final int f9957z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(L l9, View view) {
        super(l9.f9979m, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.f9955A = l9;
        this.f9956y = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
        Resources resources = l9.f9979m.f10030n.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
        this.f9957z = (int) typedValue.getDimension(displayMetrics);
    }
}
