package androidx.mediarouter.app;

import F0.r0;
import a.AbstractC0485a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import co.notix.R;

/* loaded from: classes.dex */
public abstract class E extends r0 {

    /* renamed from: u, reason: collision with root package name */
    public t0.C f9942u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageButton f9943v;

    /* renamed from: w, reason: collision with root package name */
    public final MediaRouteVolumeSlider f9944w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ N f9945x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(N n7, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int color;
        int color2;
        this.f9945x = n7;
        this.f9943v = imageButton;
        this.f9944w = mediaRouteVolumeSlider;
        Context context = n7.f10030n;
        Drawable q9 = AbstractC0485a.q(context, R.drawable.mr_cast_mute_button);
        if (s8.e.K(context)) {
            q9.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(q9);
        Context context2 = n7.f10030n;
        if (s8.e.K(context2)) {
            color = context2.getColor(R.color.mr_cast_progressbar_progress_and_thumb_light);
            color2 = context2.getColor(R.color.mr_cast_progressbar_background_light);
        } else {
            color = context2.getColor(R.color.mr_cast_progressbar_progress_and_thumb_dark);
            color2 = context2.getColor(R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(color, color2);
    }

    public final void r(t0.C c3) {
        boolean z9;
        this.f9942u = c3;
        int i9 = c3.f22854p;
        if (i9 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ImageButton imageButton = this.f9943v;
        imageButton.setActivated(z9);
        imageButton.setOnClickListener(new D(0, this));
        t0.C c9 = this.f9942u;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.f9944w;
        mediaRouteVolumeSlider.setTag(c9);
        mediaRouteVolumeSlider.setMax(c3.f22855q);
        mediaRouteVolumeSlider.setProgress(i9);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.f9945x.f10041u);
    }

    public final void s(boolean z9) {
        ImageButton imageButton = this.f9943v;
        if (imageButton.isActivated() == z9) {
            return;
        }
        imageButton.setActivated(z9);
        N n7 = this.f9945x;
        if (z9) {
            n7.f10044x.put(this.f9942u.f22842c, Integer.valueOf(this.f9944w.getProgress()));
        } else {
            n7.f10044x.remove(this.f9942u.f22842c);
        }
    }
}
