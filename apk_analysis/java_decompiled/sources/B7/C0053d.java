package B7;

import java.util.RandomAccess;

/* renamed from: B7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053d extends AbstractC0054e implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0054e f1123a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1124b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1125c;

    public C0053d(AbstractC0054e abstractC0054e, int i9, int i10) {
        this.f1123a = abstractC0054e;
        this.f1124b = i9;
        s8.n.g(i9, i10, abstractC0054e.b());
        this.f1125c = i10 - i9;
    }

    @Override // B7.AbstractC0054e
    public final int b() {
        return this.f1125c;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        int i10 = this.f1125c;
        if (i9 >= 0 && i9 < i10) {
            return this.f1123a.get(this.f1124b + i9);
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, i10, ", size: "));
    }
}
