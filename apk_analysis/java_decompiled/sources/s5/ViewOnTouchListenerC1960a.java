package s5;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: s5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1960a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f22736a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22737b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22738c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22739d;

    public ViewOnTouchListenerC1960a(Dialog dialog, Rect rect) {
        this.f22736a = dialog;
        this.f22737b = rect.left;
        this.f22738c = rect.top;
        this.f22739d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f22737b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f22738c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i9 = this.f22739d;
            obtain.setLocation((-i9) - 1, (-i9) - 1);
        }
        view.performClick();
        return this.f22736a.onTouchEvent(obtain);
    }
}
