package K5;

import P.Q;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class A implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public int f4306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f4307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f4308c;

    public A(TextInputLayout textInputLayout, EditText editText) {
        this.f4308c = textInputLayout;
        this.f4307b = editText;
        this.f4306a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f4308c;
        textInputLayout.u(!textInputLayout.f16198Y0, false);
        if (textInputLayout.f16214k) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f16229s) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f4307b;
        int lineCount = editText.getLineCount();
        int i9 = this.f4306a;
        if (lineCount != i9) {
            if (lineCount < i9) {
                WeakHashMap weakHashMap = Q.f5546a;
                int minimumHeight = editText.getMinimumHeight();
                int i10 = textInputLayout.f16191R0;
                if (minimumHeight != i10) {
                    editText.setMinimumHeight(i10);
                }
            }
            this.f4306a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
