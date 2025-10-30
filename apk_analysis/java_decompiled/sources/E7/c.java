package E7;

import O7.p;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final i f1975a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1976b;

    public c(g element, i left) {
        kotlin.jvm.internal.h.e(left, "left");
        kotlin.jvm.internal.h.e(element, "element");
        this.f1975a = left;
        this.f1976b = element;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                cVar.getClass();
                int i9 = 2;
                c cVar2 = cVar;
                int i10 = 2;
                while (true) {
                    i iVar = cVar2.f1975a;
                    if (iVar instanceof c) {
                        cVar2 = (c) iVar;
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 == null) {
                        break;
                    }
                    i10++;
                }
                c cVar3 = this;
                while (true) {
                    i iVar2 = cVar3.f1975a;
                    if (iVar2 instanceof c) {
                        cVar3 = (c) iVar2;
                    } else {
                        cVar3 = null;
                    }
                    if (cVar3 == null) {
                        break;
                    }
                    i9++;
                }
                if (i10 == i9) {
                    c cVar4 = this;
                    while (true) {
                        g gVar = cVar4.f1976b;
                        if (!kotlin.jvm.internal.h.a(cVar.get(gVar.getKey()), gVar)) {
                            z9 = false;
                            break;
                        }
                        i iVar3 = cVar4.f1975a;
                        if (iVar3 instanceof c) {
                            cVar4 = (c) iVar3;
                        } else {
                            kotlin.jvm.internal.h.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            g gVar2 = (g) iVar3;
                            z9 = kotlin.jvm.internal.h.a(cVar.get(gVar2.getKey()), gVar2);
                            break;
                        }
                    }
                    if (z9) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // E7.i
    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(this.f1975a.fold(obj, pVar), this.f1976b);
    }

    @Override // E7.i
    public final g get(h key) {
        kotlin.jvm.internal.h.e(key, "key");
        c cVar = this;
        while (true) {
            g gVar = cVar.f1976b.get(key);
            if (gVar != null) {
                return gVar;
            }
            i iVar = cVar.f1975a;
            if (iVar instanceof c) {
                cVar = (c) iVar;
            } else {
                return iVar.get(key);
            }
        }
    }

    public final int hashCode() {
        return this.f1976b.hashCode() + this.f1975a.hashCode();
    }

    @Override // E7.i
    public final i minusKey(h key) {
        kotlin.jvm.internal.h.e(key, "key");
        g gVar = this.f1976b;
        g gVar2 = gVar.get(key);
        i iVar = this.f1975a;
        if (gVar2 != null) {
            return iVar;
        }
        i minusKey = iVar.minusKey(key);
        if (minusKey == iVar) {
            return this;
        }
        if (minusKey == j.f1978a) {
            return gVar;
        }
        return new c(gVar, minusKey);
    }

    @Override // E7.i
    public final i plus(i context) {
        kotlin.jvm.internal.h.e(context, "context");
        if (context == j.f1978a) {
            return this;
        }
        return (i) context.fold(this, new b(1));
    }

    public final String toString() {
        return AbstractC0953k1.p(new StringBuilder("["), (String) fold("", new b(0)), ']');
    }
}
