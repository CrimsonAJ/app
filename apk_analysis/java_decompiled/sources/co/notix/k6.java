package co.notix;

import K5.ViewOnClickListenerC0215a;
import Y7.B;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import co.notix.appopen.AppOpenActivity;

/* loaded from: classes.dex */
public final class k6 implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppOpenActivity f12596a;

    public k6(AppOpenActivity appOpenActivity) {
        this.f12596a = appOpenActivity;
    }

    public static final void a(AppOpenActivity this$0, View view) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        p8 reason = p8.X;
        ia iaVar = this$0.f11875b;
        c7 c7Var = this$0.f11878e;
        if (c7Var != null) {
            String data = c7Var.f11987a.f12423h;
            iaVar.getClass();
            kotlin.jvm.internal.h.e(data, "data");
            kotlin.jvm.internal.h.e(reason, "reason");
            B.r(iaVar.f12446c, null, new z9(iaVar, data, reason, null), 3);
            this$0.finish();
            return;
        }
        kotlin.jvm.internal.h.h("appOpenData");
        throw null;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AppOpenActivity appOpenActivity = this.f12596a;
        int i9 = AppOpenActivity.f11873u;
        Object value = appOpenActivity.f11890r.getValue();
        kotlin.jvm.internal.h.d(value, "<get-ivContinue>(...)");
        ((ImageView) value).setAlpha(1.0f);
        Object value2 = this.f12596a.f11884l.getValue();
        kotlin.jvm.internal.h.d(value2, "<get-llContinueContainer>(...)");
        ((LinearLayout) value2).setOnClickListener(new ViewOnClickListenerC0215a(13, this.f12596a));
        TypedValue typedValue = new TypedValue();
        this.f12596a.getTheme().resolveAttribute(android.R.attr.selectableItemBackgroundBorderless, typedValue, true);
        Object value3 = this.f12596a.f11888p.getValue();
        kotlin.jvm.internal.h.d(value3, "<get-flContinue>(...)");
        ((FrameLayout) value3).setBackgroundResource(typedValue.resourceId);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
