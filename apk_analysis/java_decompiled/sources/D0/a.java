package D0;

import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import n3.C1635l;
import n3.InterfaceC1636m;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1733a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1735c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1736d;

    public /* synthetic */ a(Object obj, int i9, Object obj2, int i10) {
        this.f1733a = i10;
        this.f1735c = obj;
        this.f1734b = i9;
        this.f1736d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [n3.m, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1733a) {
            case 0:
                ((c) ((b) this.f1735c).f1739c).h(this.f1734b, (Serializable) this.f1736d);
                return;
            case 1:
                Iterator it = ((CopyOnWriteArraySet) this.f1735c).iterator();
                while (it.hasNext()) {
                    l4.k kVar = (l4.k) it.next();
                    if (!kVar.f20503d) {
                        int i9 = this.f1734b;
                        if (i9 != -1) {
                            kVar.f20501b.b(i9);
                        }
                        kVar.f20502c = true;
                        ((l4.i) this.f1736d).invoke(kVar.f20500a);
                    }
                }
                return;
            default:
                C1635l c1635l = (C1635l) this.f1735c;
                int i10 = c1635l.f21130a;
                ?? r22 = this.f1736d;
                r22.getClass();
                r22.x(i10, c1635l.f21131b, this.f1734b);
                return;
        }
    }

    public /* synthetic */ a(C1635l c1635l, InterfaceC1636m interfaceC1636m, int i9) {
        this.f1733a = 2;
        this.f1735c = c1635l;
        this.f1736d = interfaceC1636m;
        this.f1734b = i9;
    }
}
