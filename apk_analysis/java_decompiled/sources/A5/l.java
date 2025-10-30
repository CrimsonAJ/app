package A5;

import B6.u0;
import android.animation.ObjectAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import b5.G1;
import c0.C0747a;
import c0.C0750d;
import c0.C0751e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: q, reason: collision with root package name */
    public static final k f429q = new Object();

    /* renamed from: l, reason: collision with root package name */
    public final p f430l;

    /* renamed from: m, reason: collision with root package name */
    public final C0751e f431m;

    /* renamed from: n, reason: collision with root package name */
    public final C0750d f432n;

    /* renamed from: o, reason: collision with root package name */
    public final o f433o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f434p;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, A5.o] */
    public l(Context context, e eVar, p pVar) {
        super(context, eVar);
        this.f434p = false;
        this.f430l = pVar;
        this.f433o = new Object();
        C0751e c0751e = new C0751e();
        this.f431m = c0751e;
        c0751e.f11579b = 1.0f;
        c0751e.f11580c = false;
        c0751e.f11578a = Math.sqrt(50.0f);
        c0751e.f11580c = false;
        C0750d c0750d = new C0750d(this);
        this.f432n = c0750d;
        c0750d.f11575k = c0751e;
        if (this.f445h != 1.0f) {
            this.f445h = 1.0f;
            invalidateSelf();
        }
    }

    @Override // A5.n
    public final boolean d(boolean z9, boolean z10, boolean z11) {
        boolean d9 = super.d(z9, z10, z11);
        a aVar = this.f440c;
        ContentResolver contentResolver = this.f438a.getContentResolver();
        aVar.getClass();
        float f9 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f9 == 0.0f) {
            this.f434p = true;
            return d9;
        }
        this.f434p = false;
        float f10 = 50.0f / f9;
        C0751e c0751e = this.f431m;
        c0751e.getClass();
        if (f10 > 0.0f) {
            c0751e.f11578a = Math.sqrt(f10);
            c0751e.f11580c = false;
            return d9;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z9;
        boolean z10;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            p pVar = this.f430l;
            Rect bounds = getBounds();
            float b9 = b();
            ObjectAnimator objectAnimator = this.f441d;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                z9 = true;
            } else {
                z9 = false;
            }
            ObjectAnimator objectAnimator2 = this.f442e;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                z10 = true;
            } else {
                z10 = false;
            }
            pVar.f451a.a();
            pVar.a(canvas, bounds, b9, z9, z10);
            Paint paint = this.f446i;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            e eVar = this.f439b;
            int i9 = eVar.f402c[0];
            o oVar = this.f433o;
            oVar.f449c = i9;
            int i10 = eVar.f406g;
            if (i10 > 0) {
                if (!(this.f430l instanceof s)) {
                    i10 = (int) ((u0.j(oVar.f448b, 0.0f, 0.01f) * i10) / 0.01f);
                }
                this.f430l.d(canvas, paint, oVar.f448b, 1.0f, eVar.f403d, this.j, i10);
            } else {
                this.f430l.d(canvas, paint, 0.0f, 1.0f, eVar.f403d, this.j, 0);
            }
            this.f430l.c(canvas, paint, oVar, this.j);
            this.f430l.b(canvas, paint, eVar.f402c[0], this.j);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f430l.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f430l.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f432n.b();
        this.f433o.f448b = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i9) {
        boolean z9 = this.f434p;
        o oVar = this.f433o;
        C0750d c0750d = this.f432n;
        if (z9) {
            c0750d.b();
            oVar.f448b = i9 / 10000.0f;
            invalidateSelf();
            return true;
        }
        c0750d.f11567b = oVar.f448b * 10000.0f;
        c0750d.f11568c = true;
        float f9 = i9;
        if (c0750d.f11571f) {
            c0750d.f11576l = f9;
            return true;
        }
        if (c0750d.f11575k == null) {
            c0750d.f11575k = new C0751e(f9);
        }
        C0751e c0751e = c0750d.f11575k;
        double d9 = f9;
        c0751e.f11586i = d9;
        double d10 = (float) d9;
        if (d10 <= Float.MAX_VALUE) {
            if (d10 >= -3.4028235E38f) {
                double abs = Math.abs(c0750d.f11573h * 0.75f);
                c0751e.f11581d = abs;
                c0751e.f11582e = abs * 62.5d;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    boolean z10 = c0750d.f11571f;
                    if (!z10 && !z10) {
                        c0750d.f11571f = true;
                        if (!c0750d.f11568c) {
                            c0750d.f11570e.getClass();
                            c0750d.f11567b = c0750d.f11569d.f433o.f448b * 10000.0f;
                        }
                        float f10 = c0750d.f11567b;
                        if (f10 <= Float.MAX_VALUE && f10 >= -3.4028235E38f) {
                            ThreadLocal threadLocal = C0747a.f11552f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new C0747a());
                            }
                            C0747a c0747a = (C0747a) threadLocal.get();
                            ArrayList arrayList = c0747a.f11554b;
                            if (arrayList.size() == 0) {
                                if (c0747a.f11556d == null) {
                                    c0747a.f11556d = new G1(c0747a.f11555c);
                                }
                                G1 g12 = c0747a.f11556d;
                                ((Choreographer) g12.f10718c).postFrameCallback((W.e) g12.f10719d);
                            }
                            if (!arrayList.contains(c0750d)) {
                                arrayList.add(c0750d);
                                return true;
                            }
                        } else {
                            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                        }
                    }
                    return true;
                }
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
    }
}
