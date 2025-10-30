package com.anilab.android.ui.views;

import O7.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import co.notix.R;
import kotlin.jvm.internal.h;
import p.C1754L;

/* loaded from: classes.dex */
public final class FreakSpinner extends C1754L {
    public a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreakSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 1);
        h.e(context, "context");
        setBackgroundResource(R.drawable.bg_spinner);
        setPopupBackgroundResource(R.drawable.bg_popup);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        setDropDownVerticalOffset(i10);
    }

    @Override // p.C1754L, android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (motionEvent != null && motionEvent.getAction() == 0 && (aVar = this.j) != null) {
            aVar.invoke();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setActionDownListener(a listener) {
        h.e(listener, "listener");
        this.j = listener;
    }
}
