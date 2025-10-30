package y6;

import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final D4.v f25051a;

    /* renamed from: b, reason: collision with root package name */
    public final h f25052b;

    public i(D4.v vVar, E6.e eVar) {
        this.f25051a = vVar;
        this.f25052b = new h(eVar);
    }

    public final void a(String str) {
        h hVar = this.f25052b;
        synchronized (hVar) {
            if (!Objects.equals(hVar.f25049b, str)) {
                h.a(hVar.f25048a, str, hVar.f25050c);
                hVar.f25049b = str;
            }
        }
    }
}
