package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class W implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f9673a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V f9675c;

    public W(V v8, Comparable comparable, Object obj) {
        this.f9675c = v8;
        this.f9673a = comparable;
        this.f9674b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9673a.compareTo(((W) obj).f9673a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f9673a;
                if (comparable == null) {
                    if (key == null) {
                        equals = true;
                    } else {
                        equals = false;
                    }
                } else {
                    equals = comparable.equals(key);
                }
                if (equals) {
                    Object obj2 = this.f9674b;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        if (value == null) {
                            equals2 = true;
                        } else {
                            equals2 = false;
                        }
                    } else {
                        equals2 = obj2.equals(value);
                    }
                    if (equals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9673a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9674b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Comparable comparable = this.f9673a;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f9674b;
        if (obj != null) {
            i9 = obj.hashCode();
        }
        return i9 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f9675c.b();
        Object obj2 = this.f9674b;
        this.f9674b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f9673a + "=" + this.f9674b;
    }
}
