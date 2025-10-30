package o7;

import java.lang.reflect.Method;

/* renamed from: o7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1713e extends AbstractC1708D {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Method f21674k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class f21675l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f21676m;

    public C1713e(Method method, Class cls, int i9) {
        this.f21674k = method;
        this.f21675l = cls;
        this.f21676m = i9;
    }

    @Override // o7.AbstractC1708D
    public final Object e() {
        return this.f21674k.invoke(null, this.f21675l, Integer.valueOf(this.f21676m));
    }

    public final String toString() {
        return this.f21675l.getName();
    }
}
