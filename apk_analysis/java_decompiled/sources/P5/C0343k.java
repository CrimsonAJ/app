package P5;

import java.util.List;
import java.util.ListIterator;

/* renamed from: P5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343k extends C0335c implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0344l f5978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0343k(C0344l c0344l) {
        super(c0344l);
        this.f5978e = c0344l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0344l c0344l = this.f5978e;
        boolean isEmpty = c0344l.isEmpty();
        b().add(obj);
        c0344l.f5984f.f5921e++;
        if (isEmpty) {
            c0344l.b();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f5963b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0343k(C0344l c0344l, int i9) {
        super(c0344l, ((List) c0344l.f5980b).listIterator(i9));
        this.f5978e = c0344l;
    }
}
