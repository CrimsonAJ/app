package u5;

import android.content.Context;
import android.graphics.Color;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import s8.n;

/* renamed from: u5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2081a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f23701f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23702a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23703b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23704c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23705d;

    /* renamed from: e, reason: collision with root package name */
    public final float f23706e;

    public C2081a(Context context) {
        boolean Y = AbstractC1002u1.Y(context, R.attr.elevationOverlayEnabled, false);
        int q9 = n.q(context, R.attr.elevationOverlayColor, 0);
        int q10 = n.q(context, R.attr.elevationOverlayAccentColor, 0);
        int q11 = n.q(context, R.attr.colorSurface, 0);
        float f9 = context.getResources().getDisplayMetrics().density;
        this.f23702a = Y;
        this.f23703b = q9;
        this.f23704c = q10;
        this.f23705d = q11;
        this.f23706e = f9;
    }

    public final int a(int i9, float f9) {
        float f10;
        int i10;
        if (this.f23702a && H.a.h(i9, 255) == this.f23705d) {
            if (this.f23706e > 0.0f && f9 > 0.0f) {
                f10 = Math.min(((((float) Math.log1p(f9 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
            } else {
                f10 = 0.0f;
            }
            int alpha = Color.alpha(i9);
            int t7 = n.t(H.a.h(i9, 255), f10, this.f23703b);
            if (f10 > 0.0f && (i10 = this.f23704c) != 0) {
                t7 = H.a.f(H.a.h(i10, f23701f), t7);
            }
            return H.a.h(t7, alpha);
        }
        return i9;
    }
}
