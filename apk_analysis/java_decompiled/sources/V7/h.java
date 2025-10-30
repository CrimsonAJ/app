package V7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h implements Iterator, P7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7827a;

    /* renamed from: b, reason: collision with root package name */
    public int f7828b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7829c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f7830d;

    public h(o oVar) {
        this.f7827a = 1;
        this.f7830d = oVar;
        this.f7829c = oVar.f7839a.iterator();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [O7.l, kotlin.jvm.internal.i] */
    public void a() {
        Object invoke;
        int i9;
        int i10 = this.f7828b;
        i iVar = (i) this.f7830d;
        if (i10 == -2) {
            invoke = ((B2.i) iVar.f7833c).f630b;
        } else {
            ?? r0 = (kotlin.jvm.internal.i) iVar.f7832b;
            Object obj = this.f7829c;
            kotlin.jvm.internal.h.b(obj);
            invoke = r0.invoke(obj);
        }
        this.f7829c = invoke;
        if (invoke == null) {
            i9 = 0;
        } else {
            i9 = 1;
        }
        this.f7828b = i9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        o oVar;
        Iterator it;
        switch (this.f7827a) {
            case 0:
                if (this.f7828b < 0) {
                    a();
                }
                if (this.f7828b == 1) {
                    return true;
                }
                return false;
        }
        while (true) {
            int i9 = this.f7828b;
            oVar = (o) this.f7830d;
            int i10 = oVar.f7840b;
            it = (Iterator) this.f7829c;
            if (i9 < i10 && it.hasNext()) {
                it.next();
                this.f7828b++;
            }
        }
        if (this.f7828b < oVar.f7841c && it.hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        o oVar;
        Iterator it;
        switch (this.f7827a) {
            case 0:
                if (this.f7828b < 0) {
                    a();
                }
                if (this.f7828b != 0) {
                    Object obj = this.f7829c;
                    kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                    this.f7828b = -1;
                    return obj;
                }
                throw new NoSuchElementException();
        }
        while (true) {
            int i9 = this.f7828b;
            oVar = (o) this.f7830d;
            int i10 = oVar.f7840b;
            it = (Iterator) this.f7829c;
            if (i9 < i10 && it.hasNext()) {
                it.next();
                this.f7828b++;
            }
        }
        int i11 = this.f7828b;
        if (i11 < oVar.f7841c) {
            this.f7828b = i11 + 1;
            return it.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7827a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(i iVar) {
        this.f7827a = 0;
        this.f7830d = iVar;
        this.f7828b = -2;
    }
}
