package s;

import B7.x;

/* renamed from: s.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1941k extends x {

    /* renamed from: a, reason: collision with root package name */
    public int f22665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1940j f22666b;

    public C1941k(C1940j c1940j) {
        this.f22666b = c1940j;
    }

    @Override // B7.x
    public final int a() {
        int i9 = this.f22665a;
        this.f22665a = i9 + 1;
        return this.f22666b.f(i9);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f22665a < this.f22666b.i()) {
            return true;
        }
        return false;
    }
}
