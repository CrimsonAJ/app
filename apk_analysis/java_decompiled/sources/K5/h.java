package K5;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public final class h extends F5.h {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f4330z = 0;

    /* renamed from: y, reason: collision with root package name */
    public g f4331y;

    @Override // F5.h
    public final void f(Canvas canvas) {
        if (this.f4331y.f4329r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f4331y.f4329r);
        } else {
            canvas.clipRect(this.f4331y.f4329r, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    @Override // F5.h, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f4331y = new g(this.f4331y);
        return this;
    }

    public final void q(float f9, float f10, float f11, float f12) {
        RectF rectF = this.f4331y.f4329r;
        if (f9 == rectF.left && f10 == rectF.top && f11 == rectF.right && f12 == rectF.bottom) {
            return;
        }
        rectF.set(f9, f10, f11, f12);
        invalidateSelf();
    }
}
