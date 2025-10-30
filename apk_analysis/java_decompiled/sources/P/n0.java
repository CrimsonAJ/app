package P;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class n0 extends m0 {
    public n0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var, windowInsets);
    }

    @Override // P.r0
    public u0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f5623c.consumeDisplayCutout();
        return u0.g(null, consumeDisplayCutout);
    }

    @Override // P.r0
    public C0308i e() {
        DisplayCutout displayCutout;
        displayCutout = this.f5623c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0308i(displayCutout);
    }

    @Override // P.l0, P.r0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (Objects.equals(this.f5623c, n0Var.f5623c) && Objects.equals(this.f5627g, n0Var.f5627g) && l0.A(this.f5628h, n0Var.f5628h)) {
            return true;
        }
        return false;
    }

    @Override // P.r0
    public int hashCode() {
        return this.f5623c.hashCode();
    }
}
