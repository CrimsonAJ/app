package r;

import java.util.Iterator;

/* renamed from: r.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1920b extends AbstractC1923e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C1921c f22575a;

    /* renamed from: b, reason: collision with root package name */
    public C1921c f22576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22577c;

    public C1920b(C1921c c1921c, C1921c c1921c2, int i9) {
        this.f22577c = i9;
        this.f22575a = c1921c2;
        this.f22576b = c1921c;
    }

    @Override // r.AbstractC1923e
    public final void a(C1921c c1921c) {
        C1921c c1921c2;
        C1921c c1921c3 = null;
        if (this.f22575a == c1921c && c1921c == this.f22576b) {
            this.f22576b = null;
            this.f22575a = null;
        }
        C1921c c1921c4 = this.f22575a;
        if (c1921c4 == c1921c) {
            switch (this.f22577c) {
                case 0:
                    c1921c2 = c1921c4.f22581d;
                    break;
                default:
                    c1921c2 = c1921c4.f22580c;
                    break;
            }
            this.f22575a = c1921c2;
        }
        C1921c c1921c5 = this.f22576b;
        if (c1921c5 == c1921c) {
            C1921c c1921c6 = this.f22575a;
            if (c1921c5 != c1921c6 && c1921c6 != null) {
                c1921c3 = b(c1921c5);
            }
            this.f22576b = c1921c3;
        }
    }

    public final C1921c b(C1921c c1921c) {
        switch (this.f22577c) {
            case 0:
                return c1921c.f22580c;
            default:
                return c1921c.f22581d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f22576b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1921c c1921c;
        C1921c c1921c2 = this.f22576b;
        C1921c c1921c3 = this.f22575a;
        if (c1921c2 != c1921c3 && c1921c3 != null) {
            c1921c = b(c1921c2);
        } else {
            c1921c = null;
        }
        this.f22576b = c1921c;
        return c1921c2;
    }
}
