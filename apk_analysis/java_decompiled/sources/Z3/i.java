package Z3;

import C3.v;
import Y3.k;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public abstract class i implements Y3.h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f9049a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f9050b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue f9051c;

    /* renamed from: d, reason: collision with root package name */
    public h f9052d;

    /* renamed from: e, reason: collision with root package name */
    public long f9053e;

    /* renamed from: f, reason: collision with root package name */
    public long f9054f;

    public i() {
        for (int i9 = 0; i9 < 10; i9++) {
            this.f9049a.add(new m3.f(1));
        }
        this.f9050b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.f9050b;
            v vVar = new v(12, this);
            Y3.d dVar = new Y3.d();
            dVar.f8700g = vVar;
            arrayDeque.add(dVar);
        }
        this.f9051c = new PriorityQueue();
    }

    @Override // m3.c
    public final void b(k kVar) {
        boolean z9;
        if (kVar == this.f9052d) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        h hVar = (h) kVar;
        if (hVar.e(Integer.MIN_VALUE)) {
            hVar.r();
            this.f9049a.add(hVar);
        } else {
            long j = this.f9054f;
            this.f9054f = 1 + j;
            hVar.j = j;
            this.f9051c.add(hVar);
        }
        this.f9052d = null;
    }

    @Override // Y3.h
    public final void c(long j) {
        this.f9053e = j;
    }

    @Override // m3.c
    public final Object e() {
        boolean z9;
        if (this.f9052d == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        ArrayDeque arrayDeque = this.f9049a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        h hVar = (h) arrayDeque.pollFirst();
        this.f9052d = hVar;
        return hVar;
    }

    public abstract j f();

    @Override // m3.c
    public void flush() {
        ArrayDeque arrayDeque;
        this.f9054f = 0L;
        this.f9053e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f9051c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f9049a;
            if (isEmpty) {
                break;
            }
            h hVar = (h) priorityQueue.poll();
            int i9 = y.f20553a;
            hVar.r();
            arrayDeque.add(hVar);
        }
        h hVar2 = this.f9052d;
        if (hVar2 != null) {
            hVar2.r();
            arrayDeque.add(hVar2);
            this.f9052d = null;
        }
    }

    public abstract void g(h hVar);

    @Override // m3.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Y3.d d() {
        ArrayDeque arrayDeque = this.f9050b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f9051c;
            if (!priorityQueue.isEmpty()) {
                h hVar = (h) priorityQueue.peek();
                int i9 = y.f20553a;
                if (hVar.f20706f <= this.f9053e) {
                    h hVar2 = (h) priorityQueue.poll();
                    boolean e8 = hVar2.e(4);
                    ArrayDeque arrayDeque2 = this.f9049a;
                    if (e8) {
                        Y3.d dVar = (Y3.d) arrayDeque.pollFirst();
                        dVar.b(4);
                        hVar2.r();
                        arrayDeque2.add(hVar2);
                        return dVar;
                    }
                    g(hVar2);
                    if (i()) {
                        j f9 = f();
                        Y3.d dVar2 = (Y3.d) arrayDeque.pollFirst();
                        dVar2.s(hVar2.f20706f, f9, Long.MAX_VALUE);
                        hVar2.r();
                        arrayDeque2.add(hVar2);
                        return dVar2;
                    }
                    hVar2.r();
                    arrayDeque2.add(hVar2);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
    }

    public abstract boolean i();

    @Override // m3.c
    public void a() {
    }
}
