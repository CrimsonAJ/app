package P;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class o0 extends n0 {

    /* renamed from: o, reason: collision with root package name */
    public H.c f5630o;

    /* renamed from: p, reason: collision with root package name */
    public H.c f5631p;

    /* renamed from: q, reason: collision with root package name */
    public H.c f5632q;

    public o0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var, windowInsets);
        this.f5630o = null;
        this.f5631p = null;
        this.f5632q = null;
    }

    @Override // P.r0
    public H.c g() {
        Insets mandatorySystemGestureInsets;
        if (this.f5631p == null) {
            mandatorySystemGestureInsets = this.f5623c.getMandatorySystemGestureInsets();
            this.f5631p = H.c.c(mandatorySystemGestureInsets);
        }
        return this.f5631p;
    }

    @Override // P.r0
    public H.c i() {
        Insets systemGestureInsets;
        if (this.f5630o == null) {
            systemGestureInsets = this.f5623c.getSystemGestureInsets();
            this.f5630o = H.c.c(systemGestureInsets);
        }
        return this.f5630o;
    }

    @Override // P.r0
    public H.c k() {
        Insets tappableElementInsets;
        if (this.f5632q == null) {
            tappableElementInsets = this.f5623c.getTappableElementInsets();
            this.f5632q = H.c.c(tappableElementInsets);
        }
        return this.f5632q;
    }

    @Override // P.l0, P.r0
    public u0 l(int i9, int i10, int i11, int i12) {
        WindowInsets inset;
        inset = this.f5623c.inset(i9, i10, i11, i12);
        return u0.g(null, inset);
    }

    @Override // P.m0, P.r0
    public void r(H.c cVar) {
    }
}
