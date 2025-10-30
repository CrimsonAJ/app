package K5;

import android.text.Editable;

/* loaded from: classes.dex */
public final class m extends w5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f4349a;

    public m(q qVar) {
        this.f4349a = qVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f4349a.b().a();
    }

    @Override // w5.o, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        this.f4349a.b().b();
    }
}
