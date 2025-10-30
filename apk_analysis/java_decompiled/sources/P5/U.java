package P5;

import java.util.Map;

/* loaded from: classes.dex */
public final class U extends I {

    /* renamed from: d, reason: collision with root package name */
    public final transient X f5930d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f5931e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f5932f;

    public U(X x5, Object[] objArr, int i9) {
        this.f5930d = x5;
        this.f5931e = objArr;
        this.f5932f = i9;
    }

    @Override // P5.A
    public final int c(int i9, Object[] objArr) {
        return b().c(i9, objArr);
    }

    @Override // P5.A, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f5930d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // P5.A
    public final boolean g() {
        return true;
    }

    @Override // P5.A
    /* renamed from: i */
    public final f0 iterator() {
        return b().listIterator(0);
    }

    @Override // P5.I
    public final F q() {
        return new T(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5932f;
    }
}
