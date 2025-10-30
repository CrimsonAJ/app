package P5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class J extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5908a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5910c;

    /* renamed from: d, reason: collision with root package name */
    public final Iterator f5911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5912e;

    public J() {
        this.f5908a = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i9 = this.f5908a;
        if (i9 != 4) {
            int b9 = AbstractC2128h.b(i9);
            if (b9 == 0) {
                return true;
            }
            if (b9 != 2) {
                this.f5908a = 4;
                switch (this.f5910c) {
                    case 0:
                        do {
                            Iterator it = this.f5911d;
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                this.f5908a = 3;
                                next = null;
                                break;
                            }
                        } while (!((O5.j) this.f5912e).apply(next));
                    default:
                        do {
                            Iterator it2 = this.f5911d;
                            if (it2.hasNext()) {
                                next = it2.next();
                            } else {
                                this.f5908a = 3;
                                next = null;
                                break;
                            }
                        } while (!((a0) this.f5912e).f5958b.contains(next));
                }
                this.f5909b = next;
                if (this.f5908a != 3) {
                    this.f5908a = 1;
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f5908a = 2;
            Object obj = this.f5909b;
            this.f5909b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J(Iterator it, O5.j jVar) {
        this();
        this.f5910c = 0;
        this.f5911d = it;
        this.f5912e = jVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public J(a0 a0Var) {
        this();
        this.f5910c = 1;
        this.f5912e = a0Var;
        this.f5911d = a0Var.f5957a.iterator();
    }
}
