package i8;

import com.google.android.gms.internal.measurement.D1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: i8.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1422l {

    /* renamed from: c, reason: collision with root package name */
    public static final C1422l f19104c = new C1422l(B7.k.K0(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f19105a;

    /* renamed from: b, reason: collision with root package name */
    public final D1 f19106b;

    public C1422l(Set set, D1 d12) {
        this.f19105a = set;
        this.f19106b = d12;
    }

    public final void a(String hostname, O7.a aVar) {
        kotlin.jvm.internal.h.e(hostname, "hostname");
        Iterator it = this.f19105a.iterator();
        if (!it.hasNext()) {
        } else {
            throw A0.a.h(it);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1422l) {
            C1422l c1422l = (C1422l) obj;
            if (kotlin.jvm.internal.h.a(c1422l.f19105a, this.f19105a) && kotlin.jvm.internal.h.a(c1422l.f19106b, this.f19106b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (this.f19105a.hashCode() + 1517) * 41;
        D1 d12 = this.f19106b;
        if (d12 != null) {
            i9 = d12.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode + i9;
    }
}
