package y5;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import co.notix.R;
import d.C1061b;

/* renamed from: y5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2217a {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f25005a;

    /* renamed from: b, reason: collision with root package name */
    public final View f25006b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25007c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25008d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25009e;

    /* renamed from: f, reason: collision with root package name */
    public C1061b f25010f;

    public AbstractC2217a(View view) {
        this.f25006b = view;
        Context context = view.getContext();
        this.f25005a = Z0.a.z(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        this.f25007c = Z0.a.y(context, R.attr.motionDurationMedium2, 300);
        this.f25008d = Z0.a.y(context, R.attr.motionDurationShort3, 150);
        this.f25009e = Z0.a.y(context, R.attr.motionDurationShort2, 100);
    }
}
