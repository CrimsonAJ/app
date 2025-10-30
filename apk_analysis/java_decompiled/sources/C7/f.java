package C7;

import P.C0300a;
import P.C0301b;
import P.Q;
import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public int f1634a;

    /* renamed from: b, reason: collision with root package name */
    public int f1635b;

    /* renamed from: c, reason: collision with root package name */
    public int f1636c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1637d;

    public f() {
        if (e0.c.f17018b == null) {
            e0.c.f17018b = new e0.c(0);
        }
    }

    public int a(int i9) {
        if (i9 < this.f1636c) {
            return ((ByteBuffer) this.f1637d).getShort(this.f1635b + i9);
        }
        return 0;
    }

    public void b() {
        if (((g) this.f1637d).f1646h == this.f1636c) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i9 = this.f1634a;
            g gVar = (g) this.f1637d;
            if (i9 < gVar.f1644f && gVar.f1641c[i9] < 0) {
                this.f1634a = i9 + 1;
            } else {
                return;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        C0301b c0301b;
        if (Build.VERSION.SDK_INT >= this.f1635b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f1635b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f1634a);
            if (!((Class) this.f1637d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate d9 = Q.d(view);
            if (d9 == null) {
                c0301b = null;
            } else if (d9 instanceof C0300a) {
                c0301b = ((C0300a) d9).f5569a;
            } else {
                c0301b = new C0301b(d9);
            }
            if (c0301b == null) {
                c0301b = new C0301b();
            }
            Q.m(view, c0301b);
            view.setTag(this.f1634a, obj);
            Q.h(view, this.f1636c);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        if (this.f1634a < ((g) this.f1637d).f1644f) {
            return true;
        }
        return false;
    }

    public void remove() {
        b();
        if (this.f1635b != -1) {
            g gVar = (g) this.f1637d;
            gVar.b();
            gVar.k(this.f1635b);
            this.f1635b = -1;
            this.f1636c = gVar.f1646h;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.");
    }
}
