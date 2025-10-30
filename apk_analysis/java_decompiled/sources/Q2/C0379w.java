package Q2;

import F0.r0;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import co.notix.R;

/* renamed from: Q2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0379w extends F0.S {

    /* renamed from: d, reason: collision with root package name */
    public final String[] f6304d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f6305e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable[] f6306f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D f6307g;

    public C0379w(D d9, String[] strArr, Drawable[] drawableArr) {
        this.f6307g = d9;
        this.f6304d = strArr;
        this.f6305e = new String[strArr.length];
        this.f6306f = drawableArr;
    }

    @Override // F0.S
    public final int a() {
        return this.f6304d.length;
    }

    @Override // F0.S
    public final long b(int i9) {
        return i9;
    }

    @Override // F0.S
    public final void g(r0 r0Var, int i9) {
        C0378v c0378v = (C0378v) r0Var;
        c0378v.f6300u.setText(this.f6304d[i9]);
        String str = this.f6305e[i9];
        TextView textView = c0378v.f6301v;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.f6306f[i9];
        ImageView imageView = c0378v.f6302w;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // F0.S
    public final r0 h(ViewGroup viewGroup, int i9) {
        D d9 = this.f6307g;
        return new C0378v(d9, LayoutInflater.from(d9.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }
}
