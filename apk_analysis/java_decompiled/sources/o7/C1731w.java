package o7;

import java.lang.reflect.Type;

/* renamed from: o7.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1731w extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final Type f21736a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21737b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f21738c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC1719k f21739d;

    public C1731w(Type type, String str, Object obj) {
        this.f21736a = type;
        this.f21737b = str;
        this.f21738c = obj;
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n abstractC1722n) {
        AbstractC1719k abstractC1719k = this.f21739d;
        if (abstractC1719k != null) {
            return abstractC1719k.b(abstractC1722n);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q abstractC1725q, Object obj) {
        AbstractC1719k abstractC1719k = this.f21739d;
        if (abstractC1719k != null) {
            abstractC1719k.e(abstractC1725q, obj);
            return;
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    public final String toString() {
        AbstractC1719k abstractC1719k = this.f21739d;
        if (abstractC1719k != null) {
            return abstractC1719k.toString();
        }
        return super.toString();
    }
}
