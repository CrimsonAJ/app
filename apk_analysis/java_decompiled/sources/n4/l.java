package n4;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC1652c {

    /* renamed from: c, reason: collision with root package name */
    public final j f21213c;

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetector f21215e;

    /* renamed from: a, reason: collision with root package name */
    public final PointF f21211a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    public final PointF f21212b = new PointF();

    /* renamed from: d, reason: collision with root package name */
    public final float f21214d = 25.0f;

    /* renamed from: f, reason: collision with root package name */
    public volatile float f21216f = 3.1415927f;

    public l(Context context, j jVar) {
        this.f21213c = jVar;
        this.f21215e = new GestureDetector(context, this);
    }

    @Override // n4.InterfaceC1652c
    public final void a(float[] fArr, float f9) {
        this.f21216f = -f9;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f21211a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        float x5 = (motionEvent2.getX() - this.f21211a.x) / this.f21214d;
        float y9 = motionEvent2.getY();
        PointF pointF = this.f21211a;
        float f11 = (y9 - pointF.y) / this.f21214d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d9 = this.f21216f;
        float cos = (float) Math.cos(d9);
        float sin = (float) Math.sin(d9);
        PointF pointF2 = this.f21212b;
        pointF2.x -= (cos * x5) - (sin * f11);
        float f12 = (cos * f11) + (sin * x5) + pointF2.y;
        pointF2.y = f12;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f12));
        j jVar = this.f21213c;
        PointF pointF3 = this.f21212b;
        synchronized (jVar) {
            float f13 = pointF3.y;
            jVar.f21196g = f13;
            Matrix.setRotateM(jVar.f21194e, 0, -f13, (float) Math.cos(jVar.f21197h), (float) Math.sin(jVar.f21197h), 0.0f);
            Matrix.setRotateM(jVar.f21195f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f21213c.f21199k.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f21215e.onTouchEvent(motionEvent);
    }
}
