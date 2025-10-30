package p;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: p.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1826v0 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z9) {
        popupWindow.setIsClippedToScreen(z9);
    }
}
