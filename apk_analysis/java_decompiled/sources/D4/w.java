package D4;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public final class w extends C4.m {

    /* renamed from: b, reason: collision with root package name */
    public final C4.j f1901b;

    public w(C4.j jVar) {
        this.f1901b = jVar;
    }

    public final s4.g b(s4.g gVar) {
        C4.j jVar = this.f1901b;
        jVar.getClass();
        boolean z9 = true;
        if (!gVar.f14676v && !((Boolean) BasePendingResult.f14664w.get()).booleanValue()) {
            z9 = false;
        }
        gVar.f14676v = z9;
        C0088g c0088g = jVar.j;
        c0088g.getClass();
        B b9 = new B(new F(gVar), c0088g.f1851i.get(), jVar);
        T4.d dVar = c0088g.f1855n;
        dVar.sendMessage(dVar.obtainMessage(4, b9));
        return gVar;
    }
}
