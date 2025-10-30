package F5;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class k extends AbstractC0485a {
    @Override // a.AbstractC0485a
    public final void p(w wVar, float f9, float f10) {
        wVar.d(0.0f, f10 * f9, 180.0f, 90.0f);
        float f11 = f10 * 2.0f * f9;
        s sVar = new s(0.0f, 0.0f, f11, f11);
        sVar.f2553f = 180.0f;
        sVar.f2554g = 90.0f;
        wVar.f2566g.add(sVar);
        q qVar = new q(sVar);
        wVar.a(180.0f);
        wVar.f2567h.add(qVar);
        wVar.f2564e = 270.0f;
        float f12 = (0.0f + f11) * 0.5f;
        float f13 = (f11 - 0.0f) / 2.0f;
        double d9 = 270.0f;
        wVar.f2562c = (((float) Math.cos(Math.toRadians(d9))) * f13) + f12;
        wVar.f2563d = (f13 * ((float) Math.sin(Math.toRadians(d9)))) + f12;
    }
}
