package x8;

import B7.AbstractC0054e;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class x extends AbstractC0054e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final C2190j[] f24683a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f24684b;

    public x(C2190j[] c2190jArr, int[] iArr) {
        this.f24683a = c2190jArr;
        this.f24684b = iArr;
    }

    @Override // B7.AbstractC0054e
    public final int b() {
        return this.f24683a.length;
    }

    @Override // B7.AbstractC0054e, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C2190j)) {
            return false;
        }
        return super.contains((C2190j) obj);
    }

    @Override // java.util.List
    public final Object get(int i9) {
        return this.f24683a[i9];
    }

    @Override // B7.AbstractC0054e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C2190j)) {
            return -1;
        }
        return super.indexOf((C2190j) obj);
    }

    @Override // B7.AbstractC0054e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C2190j)) {
            return -1;
        }
        return super.lastIndexOf((C2190j) obj);
    }
}
