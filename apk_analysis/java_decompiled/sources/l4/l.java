package l4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j3.p0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final u f20504a;

    /* renamed from: b, reason: collision with root package name */
    public final w f20505b;

    /* renamed from: c, reason: collision with root package name */
    public final j f20506c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f20507d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f20508e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f20509f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20510g;

    public l(Looper looper, u uVar, j jVar) {
        this(new CopyOnWriteArraySet(), looper, uVar, jVar);
    }

    public final void a(Object obj) {
        if (this.f20510g) {
            return;
        }
        obj.getClass();
        this.f20507d.add(new k(obj));
    }

    public final void b() {
        ArrayDeque arrayDeque = this.f20509f;
        if (!arrayDeque.isEmpty()) {
            w wVar = this.f20505b;
            if (!wVar.f20548a.hasMessages(0)) {
                wVar.getClass();
                v b9 = w.b();
                b9.f20546a = wVar.f20548a.obtainMessage(0);
                wVar.getClass();
                Message message = b9.f20546a;
                message.getClass();
                wVar.f20548a.sendMessageAtFrontOfQueue(message);
                b9.a();
            }
            ArrayDeque arrayDeque2 = this.f20508e;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (isEmpty) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public final void c(int i9, i iVar) {
        this.f20509f.add(new D0.a(new CopyOnWriteArraySet(this.f20507d), i9, iVar, 1));
    }

    public final void d(p0 p0Var) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f20507d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.f20500a.equals(p0Var)) {
                kVar.f20503d = true;
                if (kVar.f20502c) {
                    kVar.f20502c = false;
                    f c3 = kVar.f20501b.c();
                    this.f20506c.a(kVar.f20500a, c3);
                }
                copyOnWriteArraySet.remove(kVar);
            }
        }
    }

    public final void e(int i9, i iVar) {
        c(i9, iVar);
        b();
    }

    public l(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, u uVar, j jVar) {
        this.f20504a = uVar;
        this.f20507d = copyOnWriteArraySet;
        this.f20506c = jVar;
        this.f20508e = new ArrayDeque();
        this.f20509f = new ArrayDeque();
        this.f20505b = uVar.a(looper, new Handler.Callback() { // from class: l4.h
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                l lVar = l.this;
                Iterator it = lVar.f20507d.iterator();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (!kVar.f20503d && kVar.f20502c) {
                        f c3 = kVar.f20501b.c();
                        kVar.f20501b = new A6.i();
                        kVar.f20502c = false;
                        lVar.f20506c.a(kVar.f20500a, c3);
                    }
                    if (lVar.f20505b.f20548a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
    }
}
