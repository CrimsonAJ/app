package o7;

import java.lang.reflect.Method;

/* renamed from: o7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1712d extends AbstractC1708D {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Method f21671k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f21672l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Class f21673m;

    public C1712d(Method method, Object obj, Class cls) {
        this.f21671k = method;
        this.f21672l = obj;
        this.f21673m = cls;
    }

    @Override // o7.AbstractC1708D
    public final Object e() {
        return this.f21671k.invoke(this.f21672l, this.f21673m);
    }

    public final String toString() {
        return this.f21673m.getName();
    }
}
