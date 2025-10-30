package P5;

/* loaded from: classes.dex */
public final class Y extends I {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f5945i;
    public static final Y j;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f5946d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f5947e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f5948f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f5949g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f5950h;

    static {
        Object[] objArr = new Object[0];
        f5945i = objArr;
        j = new Y(0, 0, 0, objArr, objArr);
    }

    public Y(int i9, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f5946d = objArr;
        this.f5947e = i9;
        this.f5948f = objArr2;
        this.f5949g = i10;
        this.f5950h = i11;
    }

    @Override // P5.A
    public final int c(int i9, Object[] objArr) {
        Object[] objArr2 = this.f5946d;
        int i10 = this.f5950h;
        System.arraycopy(objArr2, 0, objArr, i9, i10);
        return i9 + i10;
    }

    @Override // P5.A, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f5948f;
            if (objArr.length != 0) {
                int r5 = AbstractC0349q.r(obj);
                while (true) {
                    int i9 = r5 & this.f5949g;
                    Object obj2 = objArr[i9];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    r5 = i9 + 1;
                }
            }
        }
        return false;
    }

    @Override // P5.A
    public final Object[] d() {
        return this.f5946d;
    }

    @Override // P5.A
    public final int e() {
        return this.f5950h;
    }

    @Override // P5.A
    public final int f() {
        return 0;
    }

    @Override // P5.A
    public final boolean g() {
        return false;
    }

    @Override // P5.I, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5947e;
    }

    @Override // P5.A
    /* renamed from: i */
    public final f0 iterator() {
        return b().listIterator(0);
    }

    @Override // P5.I
    public final F q() {
        return F.k(this.f5950h, this.f5946d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5950h;
    }
}
