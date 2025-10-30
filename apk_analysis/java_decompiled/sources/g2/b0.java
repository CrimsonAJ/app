package g2;

import J1.Y0;
import co.notix.R;

/* loaded from: classes.dex */
public final class b0 extends M1.o {

    /* renamed from: u, reason: collision with root package name */
    public final Y0 f17654u;

    public b0(Y0 y02) {
        super(y02);
        this.f17654u = y02;
    }

    @Override // M1.o
    public final void r(Object obj) {
        int i9;
        H2.x xVar = (H2.x) obj;
        Y0 y02 = this.f17654u;
        y02.f3815v.setText(xVar.f3085a.f3456a);
        if (xVar.f3086b) {
            i9 = R.drawable.bg_selected_text;
        } else {
            i9 = R.drawable.bg_unselected_text;
        }
        y02.f3815v.setBackgroundResource(i9);
    }
}
