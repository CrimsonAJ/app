package B7;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: B7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052c extends C0051b implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0054e f1122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0052c(AbstractC0054e abstractC0054e, int i9) {
        super(0, abstractC0054e);
        this.f1122d = abstractC0054e;
        int b9 = abstractC0054e.b();
        if (i9 >= 0 && i9 <= b9) {
            this.f1120b = i9;
            return;
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, b9, ", size: "));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f1120b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1120b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f1120b - 1;
            this.f1120b = i9;
            return this.f1122d.get(i9);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1120b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
