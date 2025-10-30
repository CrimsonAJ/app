package d;

import android.window.BackEvent;

/* renamed from: d.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1061b {

    /* renamed from: a, reason: collision with root package name */
    public final float f16557a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16558b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16559c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16560d;

    public C1061b(BackEvent backEvent) {
        kotlin.jvm.internal.h.e(backEvent, "backEvent");
        C1060a c1060a = C1060a.f16556a;
        float d9 = c1060a.d(backEvent);
        float e8 = c1060a.e(backEvent);
        float b9 = c1060a.b(backEvent);
        int c3 = c1060a.c(backEvent);
        this.f16557a = d9;
        this.f16558b = e8;
        this.f16559c = b9;
        this.f16560d = c3;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f16557a + ", touchY=" + this.f16558b + ", progress=" + this.f16559c + ", swipeEdge=" + this.f16560d + '}';
    }
}
