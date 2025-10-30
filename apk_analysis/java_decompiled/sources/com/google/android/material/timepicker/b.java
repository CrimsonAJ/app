package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f16277a;

    public b(ClockFaceView clockFaceView) {
        this.f16277a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f16277a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f16254s.f16265d) - clockFaceView.f16247A;
        if (height != clockFaceView.f16280q) {
            clockFaceView.f16280q = height;
            clockFaceView.f();
            int i9 = clockFaceView.f16280q;
            ClockHandView clockHandView = clockFaceView.f16254s;
            clockHandView.f16272l = i9;
            clockHandView.invalidate();
        }
        return true;
    }
}
