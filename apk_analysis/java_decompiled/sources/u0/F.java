package u0;

import B7.C0051b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b5.G1;
import java.util.ArrayList;
import java.util.Iterator;
import s.C1940j;
import v0.AbstractC2092a;

/* loaded from: classes.dex */
public final class F extends C implements Iterable, P7.a {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f23386n = 0;

    /* renamed from: k, reason: collision with root package name */
    public final C1940j f23387k;

    /* renamed from: l, reason: collision with root package name */
    public int f23388l;

    /* renamed from: m, reason: collision with root package name */
    public String f23389m;

    public F(G g9) {
        super(g9);
        this.f23387k = new C1940j(0);
    }

    @Override // u0.C
    public final C2029A d(G1 g12) {
        return i(g12, false, this);
    }

    @Override // u0.C
    public final void e(Context context, AttributeSet attributeSet) {
        String valueOf;
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC2092a.f23720d);
        kotlin.jvm.internal.h.d(obtainAttributes, "context.resources.obtain…leable.NavGraphNavigator)");
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId != this.f23381h) {
            this.f23388l = resourceId;
            this.f23389m = null;
            if (resourceId <= 16777215) {
                valueOf = String.valueOf(resourceId);
            } else {
                try {
                    valueOf = context.getResources().getResourceName(resourceId);
                } catch (Resources.NotFoundException unused) {
                    valueOf = String.valueOf(resourceId);
                }
                kotlin.jvm.internal.h.d(valueOf, "try {\n                  …tring()\n                }");
            }
            this.f23389m = valueOf;
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
    }

    @Override // u0.C
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof F) && super.equals(obj)) {
                C1940j c1940j = this.f23387k;
                int i9 = c1940j.i();
                F f9 = (F) obj;
                C1940j c1940j2 = f9.f23387k;
                if (i9 == c1940j2.i() && this.f23388l == f9.f23388l) {
                    for (C c3 : V7.l.f0(new C0051b(3, c1940j))) {
                        if (!c3.equals(c1940j2.e(c3.f23381h))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(C node) {
        kotlin.jvm.internal.h.e(node, "node");
        int i9 = node.f23381h;
        String str = node.f23382i;
        if (i9 == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = this.f23382i;
        if (str2 != null && kotlin.jvm.internal.h.a(str, str2)) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (i9 != this.f23381h) {
            C1940j c1940j = this.f23387k;
            C c3 = (C) c1940j.e(i9);
            if (c3 == node) {
                return;
            }
            if (node.f23375b == null) {
                if (c3 != null) {
                    c3.f23375b = null;
                }
                node.f23375b = this;
                c1940j.h(node.f23381h, node);
                return;
            }
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
    }

    public final C g(int i9, F f9, boolean z9, C c3) {
        C1940j c1940j = this.f23387k;
        C c9 = (C) c1940j.e(i9);
        if (c3 != null) {
            if (kotlin.jvm.internal.h.a(c9, c3) && kotlin.jvm.internal.h.a(c9.f23375b, c3.f23375b)) {
                return c9;
            }
            c9 = null;
        } else if (c9 != null) {
            return c9;
        }
        if (z9) {
            Iterator it = V7.l.f0(new C0051b(3, c1940j)).iterator();
            while (true) {
                if (it.hasNext()) {
                    C c10 = (C) it.next();
                    if ((c10 instanceof F) && !kotlin.jvm.internal.h.a(c10, f9)) {
                        c9 = ((F) c10).g(i9, this, true, c3);
                    } else {
                        c9 = null;
                    }
                    if (c9 != null) {
                        break;
                    }
                } else {
                    c9 = null;
                    break;
                }
            }
        }
        if (c9 == null) {
            F f10 = this.f23375b;
            if (f10 == null || f10.equals(f9)) {
                return null;
            }
            F f11 = this.f23375b;
            kotlin.jvm.internal.h.b(f11);
            return f11.g(i9, this, z9, c3);
        }
        return c9;
    }

    @Override // u0.C
    public final int hashCode() {
        int i9 = this.f23388l;
        C1940j c1940j = this.f23387k;
        int i10 = c1940j.i();
        for (int i11 = 0; i11 < i10; i11++) {
            i9 = (((i9 * 31) + c1940j.f(i11)) * 31) + ((C) c1940j.j(i11)).hashCode();
        }
        return i9;
    }

    public final C2029A i(G1 g12, boolean z9, F f9) {
        C2029A c2029a;
        C2029A d9 = super.d(g12);
        ArrayList arrayList = new ArrayList();
        E e8 = new E(this);
        while (true) {
            c2029a = null;
            if (!e8.hasNext()) {
                break;
            }
            C c3 = (C) e8.next();
            if (!kotlin.jvm.internal.h.a(c3, f9)) {
                c2029a = c3.d(g12);
            }
            if (c2029a != null) {
                arrayList.add(c2029a);
            }
        }
        C2029A c2029a2 = (C2029A) B7.k.x0(arrayList);
        F f10 = this.f23375b;
        if (f10 != null && z9 && !f10.equals(f9)) {
            c2029a = f10.i(g12, true, this);
        }
        return (C2029A) B7.k.x0(B7.j.k0(new C2029A[]{d9, c2029a2, c2029a}));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new E(this);
    }

    @Override // u0.C
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        C g9 = g(this.f23388l, this, false, null);
        sb.append(" startDestination=");
        if (g9 == null) {
            String str = this.f23389m;
            if (str != null) {
                sb.append(str);
            } else {
                sb.append("0x" + Integer.toHexString(this.f23388l));
            }
        } else {
            sb.append("{");
            sb.append(g9.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "sb.toString()");
        return sb2;
    }
}
