package T6;

import f5.C1177i;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final C1177i f7230a;

    public h(C1177i c1177i) {
        this.f7230a = c1177i;
    }

    @Override // T6.j
    public final boolean a(U6.b bVar) {
        int i9 = bVar.f7529b;
        if (i9 == 3 || i9 == 4 || i9 == 5) {
            this.f7230a.d(bVar.f7528a);
            return true;
        }
        return false;
    }

    @Override // T6.j
    public final boolean b(Exception exc) {
        return false;
    }
}
