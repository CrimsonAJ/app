package P5;

import java.util.Objects;

/* loaded from: classes.dex */
public final class W extends F {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f5935c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f5936d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f5937e;

    public W(Object[] objArr, int i9, int i10) {
        this.f5935c = objArr;
        this.f5936d = i9;
        this.f5937e = i10;
    }

    @Override // P5.A
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        O4.h.f(i9, this.f5937e);
        Object obj = this.f5935c[(i9 * 2) + this.f5936d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5937e;
    }
}
