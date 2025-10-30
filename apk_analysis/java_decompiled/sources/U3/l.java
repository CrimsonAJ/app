package U3;

import P5.AbstractC0349q;
import P5.X;
import j3.M;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f7398a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7399b;

    /* renamed from: c, reason: collision with root package name */
    public final M f7400c;

    /* renamed from: d, reason: collision with root package name */
    public final X f7401d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7402e;

    public l(M m9, int i9, int i10, X x5, String str) {
        this.f7398a = i9;
        this.f7399b = i10;
        this.f7400c = m9;
        this.f7401d = X.a(x5);
        this.f7402e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f7398a == lVar.f7398a && this.f7399b == lVar.f7399b && this.f7400c.equals(lVar.f7400c)) {
                X x5 = this.f7401d;
                x5.getClass();
                if (AbstractC0349q.e(x5, lVar.f7401d) && this.f7402e.equals(lVar.f7402e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7402e.hashCode() + ((this.f7401d.hashCode() + ((this.f7400c.hashCode() + ((((217 + this.f7398a) * 31) + this.f7399b) * 31)) * 31)) * 31);
    }
}
