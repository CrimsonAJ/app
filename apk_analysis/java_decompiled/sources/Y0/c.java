package Y0;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8496a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Object f8497b;

    public /* synthetic */ c() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f8496a) {
            case 0:
                ((f) this.f8497b).invalidateSelf();
                return;
            default:
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f8496a) {
            case 0:
                ((f) this.f8497b).scheduleSelf(runnable, j);
                return;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f8497b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f8496a) {
            case 0:
                ((f) this.f8497b).unscheduleSelf(runnable);
                return;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f8497b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
        }
    }

    public c(f fVar) {
        this.f8497b = fVar;
    }

    private final void a(Drawable drawable) {
    }
}
