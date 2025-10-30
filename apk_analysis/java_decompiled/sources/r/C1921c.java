package r;

import java.util.Map;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1921c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22578a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22579b;

    /* renamed from: c, reason: collision with root package name */
    public C1921c f22580c;

    /* renamed from: d, reason: collision with root package name */
    public C1921c f22581d;

    public C1921c(Object obj, Object obj2) {
        this.f22578a = obj;
        this.f22579b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1921c)) {
            return false;
        }
        C1921c c1921c = (C1921c) obj;
        if (this.f22578a.equals(c1921c.f22578a) && this.f22579b.equals(c1921c.f22579b)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f22578a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f22579b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f22578a.hashCode() ^ this.f22579b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f22578a + "=" + this.f22579b;
    }
}
