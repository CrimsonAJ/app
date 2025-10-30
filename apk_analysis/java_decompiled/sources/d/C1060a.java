package d;

import android.window.BackEvent;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1060a {

    /* renamed from: a, reason: collision with root package name */
    public static final C1060a f16556a = new Object();

    public final BackEvent a(float f9, float f10, float f11, int i9) {
        return new BackEvent(f9, f10, f11, i9);
    }

    public final float b(BackEvent backEvent) {
        kotlin.jvm.internal.h.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        kotlin.jvm.internal.h.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        kotlin.jvm.internal.h.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        kotlin.jvm.internal.h.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
