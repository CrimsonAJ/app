package P1;

import J1.AbstractC0204u0;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import co.notix.R;

/* loaded from: classes.dex */
public final class p implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W.g f5745b;

    public /* synthetic */ p(W.g gVar, int i9) {
        this.f5744a = i9;
        this.f5745b = gVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i9 = this.f5744a;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f5744a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        boolean z9;
        int i12;
        Drawable drawable;
        switch (this.f5744a) {
            case 0:
                View viewStroke = ((J1.E) this.f5745b).f3652H;
                kotlin.jvm.internal.h.d(viewStroke, "viewStroke");
                int i13 = 0;
                if (charSequence != null && !W7.d.U(charSequence)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    i13 = 8;
                }
                viewStroke.setVisibility(i13);
                return;
            default:
                AbstractC0204u0 abstractC0204u0 = (AbstractC0204u0) this.f5745b;
                AppCompatImageView appCompatImageView = abstractC0204u0.f4102w;
                if (charSequence != null && !W7.d.U(charSequence)) {
                    i12 = R.drawable.ic_clear;
                } else {
                    i12 = R.drawable.ic_search;
                }
                appCompatImageView.setImageResource(i12);
                AppCompatEditText appCompatEditText = abstractC0204u0.f4100D;
                if (charSequence != null && !W7.d.U(charSequence)) {
                    drawable = abstractC0204u0.f4100D.getContext().getDrawable(R.drawable.background_selected_subtitle);
                } else {
                    drawable = null;
                }
                appCompatEditText.setForeground(drawable);
                return;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
