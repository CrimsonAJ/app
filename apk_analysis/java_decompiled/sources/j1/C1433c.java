package j1;

import android.content.Context;
import e1.q;
import java.util.ArrayList;
import java.util.Collection;
import k1.AbstractC1480b;
import k1.C1479a;
import l1.C1529a;
import l1.C1530b;
import l1.C1533e;
import l1.C1534f;
import l1.C1535g;
import q1.InterfaceC1871a;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1433c {

    /* renamed from: d, reason: collision with root package name */
    public static final String f19190d = q.j("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1432b f19191a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1480b[] f19192b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19193c;

    public C1433c(Context context, InterfaceC1871a interfaceC1871a, InterfaceC1432b interfaceC1432b) {
        Context applicationContext = context.getApplicationContext();
        this.f19191a = interfaceC1432b;
        this.f19192b = new AbstractC1480b[]{new C1479a((C1529a) C1535g.s(applicationContext, interfaceC1871a).f20182a, 0), new C1479a((C1530b) C1535g.s(applicationContext, interfaceC1871a).f20183b, 1), new C1479a((C1534f) C1535g.s(applicationContext, interfaceC1871a).f20185d, 4), new C1479a((C1533e) C1535g.s(applicationContext, interfaceC1871a).f20184c, 2), new C1479a((C1533e) C1535g.s(applicationContext, interfaceC1871a).f20184c, 3), new AbstractC1480b((C1533e) C1535g.s(applicationContext, interfaceC1871a).f20184c), new AbstractC1480b((C1533e) C1535g.s(applicationContext, interfaceC1871a).f20184c)};
        this.f19193c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f19193c) {
            try {
                for (AbstractC1480b abstractC1480b : this.f19192b) {
                    Object obj = abstractC1480b.f19872b;
                    if (obj != null && abstractC1480b.b(obj) && abstractC1480b.f19871a.contains(str)) {
                        q.d().a(f19190d, "Work " + str + " constrained by " + abstractC1480b.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList) {
        synchronized (this.f19193c) {
            InterfaceC1432b interfaceC1432b = this.f19191a;
            if (interfaceC1432b != null) {
                interfaceC1432b.c(arrayList);
            }
        }
    }

    public final void c(Collection collection) {
        synchronized (this.f19193c) {
            try {
                for (AbstractC1480b abstractC1480b : this.f19192b) {
                    if (abstractC1480b.f19874d != null) {
                        abstractC1480b.f19874d = null;
                        abstractC1480b.d(null, abstractC1480b.f19872b);
                    }
                }
                for (AbstractC1480b abstractC1480b2 : this.f19192b) {
                    abstractC1480b2.c(collection);
                }
                for (AbstractC1480b abstractC1480b3 : this.f19192b) {
                    if (abstractC1480b3.f19874d != this) {
                        abstractC1480b3.f19874d = this;
                        abstractC1480b3.d(this, abstractC1480b3.f19872b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f19193c) {
            try {
                for (AbstractC1480b abstractC1480b : this.f19192b) {
                    ArrayList arrayList = abstractC1480b.f19871a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        abstractC1480b.f19873c.b(abstractC1480b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
