package P;

import B7.C0051b;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: P.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323y implements Iterator, P7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5651a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f5652b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5653c;

    public C0323y(C0051b c0051b) {
        this.f5651a = 0;
        this.f5653c = new ArrayList();
        this.f5652b = c0051b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5651a) {
            case 0:
                return this.f5652b.hasNext();
            default:
                return this.f5652b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup;
        switch (this.f5651a) {
            case 0:
                Object next = this.f5652b.next();
                View view = (View) next;
                C0051b c0051b = null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    c0051b = new C0051b(1, viewGroup);
                }
                ArrayList arrayList = (ArrayList) this.f5653c;
                if (c0051b != null && c0051b.hasNext()) {
                    arrayList.add(this.f5652b);
                    this.f5652b = c0051b;
                } else {
                    while (!this.f5652b.hasNext() && !arrayList.isEmpty()) {
                        this.f5652b = (Iterator) B7.k.v0(arrayList);
                        B7.q.k0(arrayList);
                    }
                }
                return next;
            default:
                return ((O7.l) ((V7.i) this.f5653c).f7832b).invoke(this.f5652b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5651a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0323y(V7.i iVar) {
        this.f5651a = 1;
        this.f5653c = iVar;
        this.f5652b = ((V7.j) iVar.f7833c).iterator();
    }
}
