package C7;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements Map.Entry, P7.a {

    /* renamed from: a, reason: collision with root package name */
    public final g f1631a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1632b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1633c;

    public e(g map, int i9) {
        kotlin.jvm.internal.h.e(map, "map");
        this.f1631a = map;
        this.f1632b = i9;
        this.f1633c = map.f1646h;
    }

    public final void a() {
        if (this.f1631a.f1646h == this.f1633c) {
        } else {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (kotlin.jvm.internal.h.a(entry.getKey(), getKey()) && kotlin.jvm.internal.h.a(entry.getValue(), getValue())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f1631a.f1639a[this.f1632b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f1631a.f1640b;
        kotlin.jvm.internal.h.b(objArr);
        return objArr[this.f1632b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int i9;
        Object key = getKey();
        int i10 = 0;
        if (key != null) {
            i9 = key.hashCode();
        } else {
            i9 = 0;
        }
        Object value = getValue();
        if (value != null) {
            i10 = value.hashCode();
        }
        return i9 ^ i10;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        g gVar = this.f1631a;
        gVar.b();
        Object[] objArr = gVar.f1640b;
        if (objArr == null) {
            int length = gVar.f1639a.length;
            if (length >= 0) {
                objArr = new Object[length];
                gVar.f1640b = objArr;
            } else {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
        }
        int i9 = this.f1632b;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
