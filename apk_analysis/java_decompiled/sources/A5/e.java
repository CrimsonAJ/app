package A5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import co.notix.R;
import com.google.android.gms.internal.measurement.D1;
import g5.AbstractC1254a;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public int f400a;

    /* renamed from: b, reason: collision with root package name */
    public int f401b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f402c;

    /* renamed from: d, reason: collision with root package name */
    public int f403d;

    /* renamed from: e, reason: collision with root package name */
    public int f404e;

    /* renamed from: f, reason: collision with root package name */
    public int f405f;

    /* renamed from: g, reason: collision with root package name */
    public int f406g;

    public e(Context context, AttributeSet attributeSet, int i9, int i10) {
        this.f402c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        int[] iArr = AbstractC1254a.f17739d;
        w5.p.a(context, attributeSet, i9, i10);
        w5.p.b(context, attributeSet, iArr, i9, i10, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i9, i10);
        this.f400a = D1.r(context, obtainStyledAttributes, 9, dimensionPixelSize);
        this.f401b = Math.min(D1.r(context, obtainStyledAttributes, 8, 0), this.f400a / 2);
        this.f404e = obtainStyledAttributes.getInt(5, 0);
        this.f405f = obtainStyledAttributes.getInt(1, 0);
        this.f406g = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        if (!obtainStyledAttributes.hasValue(2)) {
            this.f402c = new int[]{s8.n.q(context, R.attr.colorPrimary, -1)};
        } else if (obtainStyledAttributes.peekValue(2).type != 1) {
            this.f402c = new int[]{obtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(2, -1));
            this.f402c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (obtainStyledAttributes.hasValue(7)) {
            this.f403d = obtainStyledAttributes.getColor(7, -1);
        } else {
            this.f403d = this.f402c[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f9 = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.f403d = s8.n.j(this.f403d, (int) (f9 * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public void a() {
        if (this.f406g >= 0) {
        } else {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
