package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import co.notix.R;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class r extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final float f10121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f10122b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.f10122b = sVar;
        this.f10121a = s8.e.B(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i9, View view, ViewGroup viewGroup) {
        int i10;
        s sVar = this.f10122b;
        int i11 = 0;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            s.n((LinearLayout) view.findViewById(R.id.volume_item_container), sVar.f10156m0);
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i12 = sVar.f10154l0;
            layoutParams.width = i12;
            layoutParams.height = i12;
            findViewById.setLayoutParams(layoutParams);
        }
        t0.C c3 = (t0.C) getItem(i9);
        if (c3 != null) {
            boolean z9 = c3.f22846g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z9);
            textView.setText(c3.f22843d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = sVar.f10141X;
            int A2 = s8.e.A(context);
            int i13 = 255;
            if (Color.alpha(A2) != 255) {
                A2 = H.a.f(A2, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(A2, A2);
            mediaRouteVolumeSlider.setTag(c3);
            sVar.f10162p0.put(c3, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z9);
            mediaRouteVolumeSlider.setEnabled(z9);
            if (z9) {
                if (sVar.f10178y) {
                    if (c3.e() && !t0.D.g()) {
                        i10 = 0;
                    } else {
                        i10 = c3.f22853o;
                    }
                    if (i10 == 1) {
                        mediaRouteVolumeSlider.setMax(c3.f22855q);
                        mediaRouteVolumeSlider.setProgress(c3.f22854p);
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(sVar.f10150j0);
                    }
                }
                mediaRouteVolumeSlider.setMax(100);
                mediaRouteVolumeSlider.setProgress(100);
                mediaRouteVolumeSlider.setEnabled(false);
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_volume_item_icon);
            if (!z9) {
                i13 = (int) (this.f10121a * 255.0f);
            }
            imageView.setAlpha(i13);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.volume_item_container);
            if (sVar.f10147h0.contains(c3)) {
                i11 = 4;
            }
            linearLayout.setVisibility(i11);
            HashSet hashSet = sVar.f10143f0;
            if (hashSet != null && hashSet.contains(c3)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i9) {
        return false;
    }
}
