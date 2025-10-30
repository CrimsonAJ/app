package K5;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import co.notix.R;

/* loaded from: classes.dex */
public final class y extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f4428e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f4429f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0215a f4430g;

    public y(q qVar, int i9) {
        super(qVar);
        this.f4428e = R.drawable.design_password_eye;
        this.f4430g = new ViewOnClickListenerC0215a(2, this);
        if (i9 != 0) {
            this.f4428e = i9;
        }
    }

    @Override // K5.r
    public final void b() {
        q();
    }

    @Override // K5.r
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // K5.r
    public final int d() {
        return this.f4428e;
    }

    @Override // K5.r
    public final View.OnClickListener f() {
        return this.f4430g;
    }

    @Override // K5.r
    public final boolean k() {
        return true;
    }

    @Override // K5.r
    public final boolean l() {
        boolean z9;
        EditText editText = this.f4429f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z9 = true;
        } else {
            z9 = false;
        }
        return !z9;
    }

    @Override // K5.r
    public final void m(EditText editText) {
        this.f4429f = editText;
        q();
    }

    @Override // K5.r
    public final void r() {
        EditText editText = this.f4429f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f4429f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // K5.r
    public final void s() {
        EditText editText = this.f4429f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
