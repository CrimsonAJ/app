package A5;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final e f451a;

    public p(e eVar) {
        this.f451a = eVar;
    }

    public abstract void a(Canvas canvas, Rect rect, float f9, boolean z9, boolean z10);

    public abstract void b(Canvas canvas, Paint paint, int i9, int i10);

    public abstract void c(Canvas canvas, Paint paint, o oVar, int i9);

    public abstract void d(Canvas canvas, Paint paint, float f9, float f10, int i9, int i10, int i11);

    public abstract int e();

    public abstract int f();
}
