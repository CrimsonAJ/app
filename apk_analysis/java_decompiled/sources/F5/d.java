package F5;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class d extends AbstractC0485a {
    @Override // a.AbstractC0485a
    public final void p(w wVar, float f9, float f10) {
        wVar.d(0.0f, f10 * f9, 180.0f, 90.0f);
        double d9 = f10;
        double d10 = f9;
        wVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d9 * d10), (float) (Math.sin(Math.toRadians(0.0f)) * d9 * d10));
    }
}
