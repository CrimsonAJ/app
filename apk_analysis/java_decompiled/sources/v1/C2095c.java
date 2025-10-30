package v1;

import java.io.Closeable;

/* renamed from: v1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2095c implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final C2094b f23737a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2098f f23739c;

    public C2095c(C2098f c2098f, C2094b c2094b) {
        this.f23739c = c2098f;
        this.f23737a = c2094b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f23738b) {
            this.f23738b = true;
            C2098f c2098f = this.f23739c;
            synchronized (c2098f) {
                C2094b c2094b = this.f23737a;
                int i9 = c2094b.f23735h - 1;
                c2094b.f23735h = i9;
                if (i9 == 0 && c2094b.f23733f) {
                    W7.c cVar = C2098f.f23742q;
                    c2098f.S(c2094b);
                }
            }
        }
    }
}
