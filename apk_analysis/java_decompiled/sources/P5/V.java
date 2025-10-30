package P5;

/* loaded from: classes.dex */
public final class V extends I {

    /* renamed from: d, reason: collision with root package name */
    public final transient X f5933d;

    /* renamed from: e, reason: collision with root package name */
    public final transient W f5934e;

    public V(X x5, W w7) {
        this.f5933d = x5;
        this.f5934e = w7;
    }

    @Override // P5.I, P5.A
    public final F b() {
        return this.f5934e;
    }

    @Override // P5.A
    public final int c(int i9, Object[] objArr) {
        return this.f5934e.c(i9, objArr);
    }

    @Override // P5.A, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f5933d.get(obj) != null) {
            return true;
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
        return this.f5934e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5933d.f5944f;
    }
}
