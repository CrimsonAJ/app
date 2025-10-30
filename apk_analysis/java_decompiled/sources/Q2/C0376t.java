package Q2;

import F0.r0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co.notix.R;

/* renamed from: Q2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376t extends F0.S {

    /* renamed from: d, reason: collision with root package name */
    public final String[] f6296d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f6297e;

    /* renamed from: f, reason: collision with root package name */
    public int f6298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D f6299g;

    public C0376t(D d9, String[] strArr, float[] fArr) {
        this.f6299g = d9;
        this.f6296d = strArr;
        this.f6297e = fArr;
    }

    @Override // F0.S
    public final int a() {
        return this.f6296d.length;
    }

    @Override // F0.S
    public final void g(r0 r0Var, final int i9) {
        C0380x c0380x = (C0380x) r0Var;
        String[] strArr = this.f6296d;
        int length = strArr.length;
        TextView textView = c0380x.f6308u;
        if (i9 < length) {
            textView.setText(strArr[i9]);
        }
        int i10 = this.f6298f;
        View view = c0380x.f6309v;
        View view2 = c0380x.f2210a;
        if (i9 == i10) {
            view2.setSelected(true);
            view.setSelected(true);
            textView.setSelected(true);
        } else {
            view2.setSelected(false);
            view.setSelected(false);
            textView.setSelected(false);
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: Q2.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C0376t c0376t = C0376t.this;
                int i11 = c0376t.f6298f;
                int i12 = i9;
                D d9 = c0376t.f6299g;
                if (i12 != i11) {
                    d9.setPlaybackSpeed(c0376t.f6297e[i12]);
                }
                d9.f6061I0.dismiss();
            }
        });
    }

    @Override // F0.S
    public final r0 h(ViewGroup viewGroup, int i9) {
        return new C0380x(LayoutInflater.from(this.f6299g.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
