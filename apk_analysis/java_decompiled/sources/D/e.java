package D;

import P.InterfaceC0309j;
import a.AbstractC0485a;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0563y;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.InterfaceC0561w;
import androidx.lifecycle.P;
import androidx.lifecycle.S;

/* loaded from: classes.dex */
public abstract class e extends Activity implements InterfaceC0561w, InterfaceC0309j {

    /* renamed from: a, reason: collision with root package name */
    public final C0563y f1670a = new C0563y(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.h.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        if (AbstractC0485a.k(decorView, event)) {
            return true;
        }
        return AbstractC0485a.l(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.h.e(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        if (AbstractC0485a.k(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // P.InterfaceC0309j
    public final boolean h(KeyEvent event) {
        kotlin.jvm.internal.h.e(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i9 = S.f9836b;
        P.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.h.e(outState, "outState");
        this.f1670a.q0(EnumC0555p.f9895c);
        super.onSaveInstanceState(outState);
    }
}
