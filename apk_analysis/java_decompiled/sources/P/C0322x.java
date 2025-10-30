package P;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: P.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322x extends C0320v {

    /* renamed from: b, reason: collision with root package name */
    public View f5650b;

    /* JADX WARN: Type inference failed for: r4v0, types: [P.w] */
    @Override // P.C0320v
    public final void a() {
        WindowInsetsController windowInsetsController;
        int ime;
        View view = this.f5650b;
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: P.w
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i9) {
                    boolean z9;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if ((i9 & 8) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    atomicBoolean2.set(z9);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r42);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r42);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
            return;
        }
        super.a();
    }

    @Override // P.C0320v
    public final void b() {
        WindowInsetsController windowInsetsController;
        int ime;
        View view = this.f5650b;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        }
        super.b();
    }
}
