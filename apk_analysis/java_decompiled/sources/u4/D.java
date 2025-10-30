package u4;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2079d f23639a;

    public D(C2079d c2079d) {
        this.f23639a = c2079d;
    }

    public final void a() {
        Iterator it = new HashSet(this.f23639a.f23677d).iterator();
        while (it.hasNext()) {
            ((D) it.next()).a();
        }
    }

    public final void b(int i9) {
        C2079d c2079d = this.f23639a;
        C2079d.d(c2079d, i9);
        c2079d.a(i9);
        Iterator it = new HashSet(c2079d.f23677d).iterator();
        while (it.hasNext()) {
            ((D) it.next()).b(i9);
        }
    }

    public final void c() {
        Iterator it = new HashSet(this.f23639a.f23677d).iterator();
        while (it.hasNext()) {
            ((D) it.next()).c();
        }
    }

    public final void d() {
        Iterator it = new HashSet(this.f23639a.f23677d).iterator();
        while (it.hasNext()) {
            ((D) it.next()).d();
        }
    }

    public final void e() {
        Iterator it = new HashSet(this.f23639a.f23677d).iterator();
        while (it.hasNext()) {
            ((D) it.next()).e();
        }
    }

    public final void f() {
        Iterator it = new HashSet(this.f23639a.f23677d).iterator();
        while (it.hasNext()) {
            ((D) it.next()).f();
        }
    }
}
