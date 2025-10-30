package p;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: p.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1834z0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1733A0 f22100a;

    public ViewOnTouchListenerC1834z0(C1733A0 c1733a0) {
        this.f22100a = c1733a0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1829x c1829x;
        int action = motionEvent.getAction();
        int x5 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        C1733A0 c1733a0 = this.f22100a;
        if (action == 0 && (c1829x = c1733a0.f21795z) != null && c1829x.isShowing() && x5 >= 0 && x5 < c1733a0.f21795z.getWidth() && y9 >= 0 && y9 < c1733a0.f21795z.getHeight()) {
            c1733a0.f21791v.postDelayed(c1733a0.f21787r, 250L);
            return false;
        }
        if (action == 1) {
            c1733a0.f21791v.removeCallbacks(c1733a0.f21787r);
            return false;
        }
        return false;
    }
}
