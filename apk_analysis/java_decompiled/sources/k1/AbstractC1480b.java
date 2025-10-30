package k1;

import e1.q;
import j1.C1433c;
import j1.InterfaceC1432b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import l1.AbstractC1532d;
import n1.C1613j;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1480b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19871a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Object f19872b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1532d f19873c;

    /* renamed from: d, reason: collision with root package name */
    public C1433c f19874d;

    public AbstractC1480b(AbstractC1532d abstractC1532d) {
        this.f19873c = abstractC1532d;
    }

    public abstract boolean a(C1613j c1613j);

    public abstract boolean b(Object obj);

    public final void c(Collection collection) {
        this.f19871a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C1613j c1613j = (C1613j) it.next();
            if (a(c1613j)) {
                this.f19871a.add(c1613j.f21031a);
            }
        }
        if (this.f19871a.isEmpty()) {
            this.f19873c.b(this);
        } else {
            AbstractC1532d abstractC1532d = this.f19873c;
            synchronized (abstractC1532d.f20173c) {
                try {
                    if (abstractC1532d.f20174d.add(this)) {
                        if (abstractC1532d.f20174d.size() == 1) {
                            abstractC1532d.f20175e = abstractC1532d.a();
                            q.d().a(AbstractC1532d.f20170f, String.format("%s: initial state = %s", abstractC1532d.getClass().getSimpleName(), abstractC1532d.f20175e), new Throwable[0]);
                            abstractC1532d.d();
                        }
                        Object obj = abstractC1532d.f20175e;
                        this.f19872b = obj;
                        d(this.f19874d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f19874d, this.f19872b);
    }

    public final void d(C1433c c1433c, Object obj) {
        if (!this.f19871a.isEmpty() && c1433c != null) {
            if (obj != null && !b(obj)) {
                ArrayList arrayList = this.f19871a;
                synchronized (c1433c.f19193c) {
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i9 = 0;
                        while (i9 < size) {
                            Object obj2 = arrayList.get(i9);
                            i9++;
                            String str = (String) obj2;
                            if (c1433c.a(str)) {
                                q.d().a(C1433c.f19190d, "Constraints met for " + str, new Throwable[0]);
                                arrayList2.add(str);
                            }
                        }
                        InterfaceC1432b interfaceC1432b = c1433c.f19191a;
                        if (interfaceC1432b != null) {
                            interfaceC1432b.e(arrayList2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            c1433c.b(this.f19871a);
        }
    }
}
