package P5;

import java.util.Objects;

/* loaded from: classes.dex */
public final class S extends F {

    /* renamed from: e, reason: collision with root package name */
    public static final S f5926e = new S(0, new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f5927c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f5928d;

    public S(int i9, Object[] objArr) {
        this.f5927c = objArr;
        this.f5928d = i9;
    }

    @Override // P5.F, P5.A
    public final int c(int i9, Object[] objArr) {
        Object[] objArr2 = this.f5927c;
        int i10 = this.f5928d;
        System.arraycopy(objArr2, 0, objArr, i9, i10);
        return i9 + i10;
    }

    @Override // P5.A
    public final Object[] d() {
        return this.f5927c;
    }

    @Override // P5.A
    public final int e() {
        return this.f5928d;
    }

    @Override // P5.A
    public final int f() {
        return 0;
    }

    @Override // P5.A
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        O4.h.f(i9, this.f5928d);
        Object obj = this.f5927c[i9];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5928d;
    }
}
