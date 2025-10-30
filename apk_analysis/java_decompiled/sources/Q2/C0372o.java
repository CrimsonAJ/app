package Q2;

import K5.ViewOnClickListenerC0215a;
import android.widget.TextView;
import co.notix.R;
import j3.r0;

/* renamed from: Q2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372o extends B {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D f6287f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0372o(D d9) {
        super(d9);
        this.f6287f = d9;
    }

    @Override // Q2.B
    public final void o(C0380x c0380x) {
        TextView textView = c0380x.f6308u;
        textView.setText(R.string.exo_track_selection_auto);
        r0 r0Var = this.f6287f.f6093m0;
        r0Var.getClass();
        boolean z9 = !q(r0Var.M());
        c0380x.f6309v.setSelected(z9);
        textView.setSelected(z9);
        c0380x.f2210a.setOnClickListener(new ViewOnClickListenerC0215a(6, this));
    }

    @Override // Q2.B
    public final void p(String str) {
        this.f6287f.f6059G0.f6305e[1] = str;
    }

    public final boolean q(i4.v vVar) {
        for (int i9 = 0; i9 < this.f6046d.size(); i9++) {
            if (vVar.f18648y.containsKey(((z) this.f6046d.get(i9)).f6311a.f19326b)) {
                return true;
            }
        }
        return false;
    }
}
