package f0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import b5.G1;
import d0.o;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1153e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f17251a;

    /* renamed from: b, reason: collision with root package name */
    public final o f17252b;

    public C1153e(KeyListener keyListener) {
        o oVar = new o(2);
        this.f17251a = keyListener;
        this.f17252b = oVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i9) {
        this.f17251a.clearMetaKeyState(view, editable, i9);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f17251a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i9, KeyEvent keyEvent) {
        boolean g9;
        boolean z9;
        this.f17252b.getClass();
        if (i9 != 67) {
            if (i9 != 112) {
                g9 = false;
            } else {
                g9 = G1.g(editable, keyEvent, true);
            }
        } else {
            g9 = G1.g(editable, keyEvent, false);
        }
        if (g9) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && !this.f17251a.onKeyDown(view, editable, i9, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f17251a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i9, KeyEvent keyEvent) {
        return this.f17251a.onKeyUp(view, editable, i9, keyEvent);
    }
}
