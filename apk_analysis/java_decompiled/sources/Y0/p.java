package Y0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class p extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f8550a;

    /* renamed from: b, reason: collision with root package name */
    public o f8551b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f8552c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f8553d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8554e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f8555f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f8556g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f8557h;

    /* renamed from: i, reason: collision with root package name */
    public int f8558i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8559k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f8560l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f8550a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new r(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new r(this);
    }
}
