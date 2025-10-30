package e1;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.HashSet;
import java.util.UUID;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public UUID f17072a;

    /* renamed from: b, reason: collision with root package name */
    public int f17073b;

    /* renamed from: c, reason: collision with root package name */
    public h f17074c;

    /* renamed from: d, reason: collision with root package name */
    public HashSet f17075d;

    /* renamed from: e, reason: collision with root package name */
    public h f17076e;

    /* renamed from: f, reason: collision with root package name */
    public int f17077f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            x xVar = (x) obj;
            if (this.f17077f == xVar.f17077f && this.f17072a.equals(xVar.f17072a) && this.f17073b == xVar.f17073b && this.f17074c.equals(xVar.f17074c) && this.f17075d.equals(xVar.f17075d)) {
                return this.f17076e.equals(xVar.f17076e);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f17076e.hashCode() + ((this.f17075d.hashCode() + ((this.f17074c.hashCode() + ((AbstractC2128h.b(this.f17073b) + (this.f17072a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f17077f;
    }

    public final String toString() {
        return "WorkInfo{mId='" + this.f17072a + "', mState=" + AbstractC0953k1.A(this.f17073b) + ", mOutputData=" + this.f17074c + ", mTags=" + this.f17075d + ", mProgress=" + this.f17076e + '}';
    }
}
