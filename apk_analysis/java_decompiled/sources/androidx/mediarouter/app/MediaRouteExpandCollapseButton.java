package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import co.notix.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MediaRouteExpandCollapseButton extends AppCompatImageButton {

    /* renamed from: d, reason: collision with root package name */
    public final AnimationDrawable f9998d;

    /* renamed from: e, reason: collision with root package name */
    public final AnimationDrawable f9999e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10000f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10001g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10002h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnClickListener f10003i;

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnimationDrawable animationDrawable = (AnimationDrawable) context.getDrawable(R.drawable.mr_group_expand);
        this.f9998d = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) context.getDrawable(R.drawable.mr_group_collapse);
        this.f9999e = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(s8.e.A(context), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        this.f10000f = string;
        this.f10001g = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new D(1, this));
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10003i = onClickListener;
    }
}
