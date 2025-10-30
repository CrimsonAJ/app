package r;

import java.util.HashMap;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1919a extends C1924f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f22574e = new HashMap();

    @Override // r.C1924f
    public final C1921c b(Object obj) {
        return (C1921c) this.f22574e.get(obj);
    }

    @Override // r.C1924f
    public final Object c(Object obj) {
        Object c3 = super.c(obj);
        this.f22574e.remove(obj);
        return c3;
    }
}
