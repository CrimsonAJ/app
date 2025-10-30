package Q2;

import K5.ViewOnClickListenerC0215a;
import android.widget.TextView;
import co.notix.R;

/* renamed from: Q2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381y extends B {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D f6310f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0381y(D d9) {
        super(d9);
        this.f6310f = d9;
    }

    @Override // Q2.B, F0.S
    /* renamed from: n */
    public final void g(C0380x c0380x, int i9) {
        super.g(c0380x, i9);
        if (i9 > 0) {
            z zVar = (z) this.f6046d.get(i9 - 1);
            c0380x.f6309v.setSelected(zVar.a());
            c0380x.f6308u.setSelected(zVar.a());
        }
    }

    @Override // Q2.B
    public final void o(C0380x c0380x) {
        TextView textView = c0380x.f6308u;
        textView.setText(R.string.exo_track_selection_none);
        boolean z9 = false;
        int i9 = 0;
        while (true) {
            if (i9 < this.f6046d.size()) {
                if (((z) this.f6046d.get(i9)).a()) {
                    break;
                } else {
                    i9++;
                }
            } else {
                z9 = true;
                break;
            }
        }
        c0380x.f6309v.setSelected(z9);
        textView.setSelected(z9);
        c0380x.f2210a.setOnClickListener(new ViewOnClickListenerC0215a(8, this));
    }

    @Override // Q2.B
    public final void p(String str) {
    }
}
