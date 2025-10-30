package co.notix;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* loaded from: classes.dex */
public final class x6 extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        kotlin.jvm.internal.h.e(view, "view");
        kotlin.jvm.internal.h.e(outline, "outline");
        int width = view.getWidth();
        int height = view.getHeight();
        float a5 = h9.a(Float.valueOf(20.0f));
        outline.setRoundRect(0, 0, width, height + ((int) a5), a5);
    }
}
