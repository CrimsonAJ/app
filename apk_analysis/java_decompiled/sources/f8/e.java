package f8;

import Y7.AbstractC0480v;
import d8.AbstractC1130a;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final e f17468c;

    /* JADX WARN: Type inference failed for: r0v0, types: [f8.h, f8.e, Y7.v] */
    static {
        int i9 = k.f17476c;
        int i10 = k.f17477d;
        long j = k.f17478e;
        String str = k.f17474a;
        ?? abstractC0480v = new AbstractC0480v();
        abstractC0480v.f17470b = new c(j, str, i9, i10);
        f17468c = abstractC0480v;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // Y7.AbstractC0480v
    public final AbstractC0480v j0(int i9) {
        AbstractC1130a.a(1);
        if (1 >= k.f17476c) {
            return this;
        }
        return super.j0(1);
    }

    @Override // Y7.AbstractC0480v
    public final String toString() {
        return "Dispatchers.Default";
    }
}
