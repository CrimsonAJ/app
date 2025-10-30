package P5;

/* loaded from: classes.dex */
public final class e0 extends I {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f5972d;

    public e0(Object obj) {
        obj.getClass();
        this.f5972d = obj;
    }

    @Override // P5.I, P5.A
    public final F b() {
        return F.s(this.f5972d);
    }

    @Override // P5.A
    public final int c(int i9, Object[] objArr) {
        objArr[i9] = this.f5972d;
        return i9 + 1;
    }

    @Override // P5.A, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5972d.equals(obj);
    }

    @Override // P5.A
    public final boolean g() {
        return false;
    }

    @Override // P5.I, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5972d.hashCode();
    }

    @Override // P5.A
    /* renamed from: i */
    public final f0 iterator() {
        return new K(this.f5972d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f5972d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
