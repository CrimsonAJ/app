package B7;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;
import s.C1940j;

/* renamed from: B7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0051b implements Iterator, P7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1119a;

    /* renamed from: b, reason: collision with root package name */
    public int f1120b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1121c;

    public /* synthetic */ C0051b(int i9, Object obj) {
        this.f1119a = i9;
        this.f1121c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1119a) {
            case 0:
                if (this.f1120b < ((AbstractC0054e) this.f1121c).b()) {
                    return true;
                }
                return false;
            case 1:
                if (this.f1120b < ((ViewGroup) this.f1121c).getChildCount()) {
                    return true;
                }
                return false;
            case 2:
                if (this.f1120b < ((Object[]) this.f1121c).length) {
                    return true;
                }
                return false;
            default:
                if (this.f1120b < ((C1940j) this.f1121c).i()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1119a) {
            case 0:
                if (hasNext()) {
                    int i9 = this.f1120b;
                    this.f1120b = i9 + 1;
                    return ((AbstractC0054e) this.f1121c).get(i9);
                }
                throw new NoSuchElementException();
            case 1:
                int i10 = this.f1120b;
                this.f1120b = i10 + 1;
                View childAt = ((ViewGroup) this.f1121c).getChildAt(i10);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 2:
                try {
                    Object[] objArr = (Object[]) this.f1121c;
                    int i11 = this.f1120b;
                    this.f1120b = i11 + 1;
                    return objArr[i11];
                } catch (ArrayIndexOutOfBoundsException e8) {
                    this.f1120b--;
                    throw new NoSuchElementException(e8.getMessage());
                }
            default:
                int i12 = this.f1120b;
                this.f1120b = i12 + 1;
                return ((C1940j) this.f1121c).j(i12);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1119a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i9 = this.f1120b - 1;
                this.f1120b = i9;
                ((ViewGroup) this.f1121c).removeViewAt(i9);
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0051b(Object[] array) {
        this.f1119a = 2;
        kotlin.jvm.internal.h.e(array, "array");
        this.f1121c = array;
    }
}
