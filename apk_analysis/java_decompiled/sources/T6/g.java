package T6;

import f5.C1177i;

/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final k f7228a;

    /* renamed from: b, reason: collision with root package name */
    public final C1177i f7229b;

    public g(k kVar, C1177i c1177i) {
        this.f7228a = kVar;
        this.f7229b = c1177i;
    }

    @Override // T6.j
    public final boolean a(U6.b bVar) {
        if (bVar.f7529b == 4 && !this.f7228a.a(bVar)) {
            String str = bVar.f7530c;
            if (str != null) {
                this.f7229b.b(new a(bVar.f7532e, str, bVar.f7533f));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }

    @Override // T6.j
    public final boolean b(Exception exc) {
        this.f7229b.c(exc);
        return true;
    }
}
