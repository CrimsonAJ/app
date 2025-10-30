package m4;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import j2.C1435b;
import l4.y;

/* loaded from: classes.dex */
public final class r implements q, DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f20804a;

    /* renamed from: b, reason: collision with root package name */
    public C1435b f20805b;

    public r(DisplayManager displayManager) {
        this.f20804a = displayManager;
    }

    @Override // m4.q
    public final void b(C1435b c1435b) {
        this.f20805b = c1435b;
        Handler l9 = y.l(null);
        DisplayManager displayManager = this.f20804a;
        displayManager.registerDisplayListener(this, l9);
        c1435b.a(displayManager.getDisplay(0));
    }

    @Override // m4.q
    public final void h() {
        this.f20804a.unregisterDisplayListener(this);
        this.f20805b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i9) {
        C1435b c1435b = this.f20805b;
        if (c1435b != null && i9 == 0) {
            c1435b.a(this.f20804a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i9) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i9) {
    }
}
