package K5;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f4378a;

    /* renamed from: b, reason: collision with root package name */
    public final q f4379b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f4380c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f4381d;

    public r(q qVar) {
        this.f4378a = qVar.f4357a;
        this.f4379b = qVar;
        this.f4380c = qVar.getContext();
        this.f4381d = qVar.f4363g;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public C3.v h() {
        return null;
    }

    public boolean i(int i9) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof l;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f4379b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void m(EditText editText) {
    }

    public void n(Q.g gVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z9) {
    }
}
