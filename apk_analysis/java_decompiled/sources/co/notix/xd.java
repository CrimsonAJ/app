package co.notix;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class xd extends ae {

    /* renamed from: a, reason: collision with root package name */
    public final long f13518a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13519b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13520c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13521d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(long j, String uuid, String packageName, String str) {
        super(0);
        kotlin.jvm.internal.h.e(uuid, "uuid");
        kotlin.jvm.internal.h.e(packageName, "packageName");
        this.f13518a = j;
        this.f13519b = uuid;
        this.f13520c = packageName;
        this.f13521d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd)) {
            return false;
        }
        xd xdVar = (xd) obj;
        return this.f13518a == xdVar.f13518a && kotlin.jvm.internal.h.a(this.f13519b, xdVar.f13519b) && kotlin.jvm.internal.h.a(this.f13520c, xdVar.f13520c) && kotlin.jvm.internal.h.a(this.f13521d, xdVar.f13521d);
    }

    public final int hashCode() {
        int hashCode;
        long j = this.f13518a;
        int a5 = h.a(this.f13520c, h.a(this.f13519b, ((int) (j ^ (j >>> 32))) * 31, 31), 31);
        String str = this.f13521d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a5 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppUpdate(createdDateTimestamp=");
        sb.append(this.f13518a);
        sb.append(", uuid=");
        sb.append(this.f13519b);
        sb.append(", packageName=");
        sb.append(this.f13520c);
        sb.append(", appId=");
        return AbstractC0953k1.p(sb, this.f13521d, ')');
    }
}
