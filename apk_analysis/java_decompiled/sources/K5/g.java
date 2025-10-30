package K5;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class g extends F5.g {

    /* renamed from: r, reason: collision with root package name */
    public final RectF f4329r;

    public g(F5.m mVar, RectF rectF) {
        super(mVar);
        this.f4329r = rectF;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [K5.h, F5.h, android.graphics.drawable.Drawable] */
    @Override // F5.g, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? hVar = new F5.h(this);
        hVar.f4331y = this;
        hVar.invalidateSelf();
        return hVar;
    }

    public g(g gVar) {
        super(gVar);
        this.f4329r = gVar.f4329r;
    }
}
