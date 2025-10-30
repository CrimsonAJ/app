package o7;

import java.io.IOException;
import p7.C1863a;

/* renamed from: o7.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1719k {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x8.i, x8.g] */
    public final Object a(String str) {
        ?? obj = new Object();
        obj.B0(str);
        C1723o c1723o = new C1723o(obj);
        Object b9 = b(c1723o);
        if (!(this instanceof AbstractC1718j) && c1723o.a0() != 10) {
            throw new RuntimeException("JSON document was not fully consumed.");
        }
        return b9;
    }

    public abstract Object b(AbstractC1722n abstractC1722n);

    public final C1863a c() {
        if (this instanceof C1863a) {
            return (C1863a) this;
        }
        return new C1863a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x8.g] */
    public final String d(Object obj) {
        ?? obj2 = new Object();
        try {
            e(new C1724p(obj2), obj);
            return obj2.q0();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    public abstract void e(AbstractC1725q abstractC1725q, Object obj);
}
