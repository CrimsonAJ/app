package com.google.android.material.timepicker;

import P.C0301b;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import b7.C0701c;
import co.notix.R;

/* loaded from: classes.dex */
public final class c extends C0301b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f16278d;

    public c(ClockFaceView clockFaceView) {
        this.f16278d = clockFaceView;
    }

    @Override // P.C0301b
    public final void d(View view, Q.g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f5573a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f6035a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f16278d.f16258w.get(intValue - 1));
        }
        gVar.j(C0701c.I(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        gVar.b(Q.e.f6020e);
    }

    @Override // P.C0301b
    public final boolean g(View view, int i9, Bundle bundle) {
        if (i9 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f16278d;
            view.getHitRect(clockFaceView.f16255t);
            float centerX = clockFaceView.f16255t.centerX();
            float centerY = clockFaceView.f16255t.centerY();
            clockFaceView.f16254s.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.f16254s.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.g(view, i9, bundle);
    }
}
