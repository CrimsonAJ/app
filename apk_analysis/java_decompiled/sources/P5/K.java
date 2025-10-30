package P5;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class K extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5914b;

    public K(Object obj) {
        this.f5914b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f5913a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f5913a) {
            this.f5913a = true;
            return this.f5914b;
        }
        throw new NoSuchElementException();
    }
}
