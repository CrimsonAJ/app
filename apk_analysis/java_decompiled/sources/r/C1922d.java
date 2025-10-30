package r;

import java.util.Iterator;

/* renamed from: r.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1922d extends AbstractC1923e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C1921c f22582a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22583b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1924f f22584c;

    public C1922d(C1924f c1924f) {
        this.f22584c = c1924f;
    }

    @Override // r.AbstractC1923e
    public final void a(C1921c c1921c) {
        boolean z9;
        C1921c c1921c2 = this.f22582a;
        if (c1921c == c1921c2) {
            C1921c c1921c3 = c1921c2.f22581d;
            this.f22582a = c1921c3;
            if (c1921c3 == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f22583b = z9;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f22583b) {
            if (this.f22584c.f22585a == null) {
                return false;
            }
            return true;
        }
        C1921c c1921c = this.f22582a;
        if (c1921c == null || c1921c.f22580c == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1921c c1921c;
        if (this.f22583b) {
            this.f22583b = false;
            this.f22582a = this.f22584c.f22585a;
        } else {
            C1921c c1921c2 = this.f22582a;
            if (c1921c2 != null) {
                c1921c = c1921c2.f22580c;
            } else {
                c1921c = null;
            }
            this.f22582a = c1921c;
        }
        return this.f22582a;
    }
}
