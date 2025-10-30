package A8;

import i8.A;
import i8.H;
import java.util.regex.Pattern;
import kotlin.jvm.internal.h;
import o7.AbstractC1719k;
import o7.C1724p;
import x8.C2190j;
import z8.InterfaceC2262k;

/* loaded from: classes.dex */
public final class b implements InterfaceC2262k {

    /* renamed from: b, reason: collision with root package name */
    public static final A f562b;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1719k f563a;

    static {
        Pattern pattern = A.f18925d;
        f562b = M4.a.o("application/json; charset=UTF-8");
    }

    public b(AbstractC1719k abstractC1719k) {
        this.f563a = abstractC1719k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x8.g] */
    @Override // z8.InterfaceC2262k
    public final Object b(Object obj) {
        ?? obj2 = new Object();
        this.f563a.e(new C1724p(obj2), obj);
        C2190j content = obj2.j0(obj2.f24644b);
        h.e(content, "content");
        return new H(f562b, content);
    }
}
