package K5;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f4350a;

    public n(q qVar) {
        this.f4350a = qVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f4350a;
        if (qVar.f4374s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = qVar.f4374s;
        m mVar = qVar.f4377v;
        if (editText != null) {
            editText.removeTextChangedListener(mVar);
            if (qVar.f4374s.getOnFocusChangeListener() == qVar.b().e()) {
                qVar.f4374s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        qVar.f4374s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(mVar);
        }
        qVar.b().m(qVar.f4374s);
        qVar.j(qVar.b());
    }
}
