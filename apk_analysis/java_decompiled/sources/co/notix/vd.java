package co.notix;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class vd extends ae {

    /* renamed from: a, reason: collision with root package name */
    public final long f13354a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13355b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13356c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13357d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(long j, String uuid, String packageName, String str) {
        super(0);
        kotlin.jvm.internal.h.e(uuid, "uuid");
        kotlin.jvm.internal.h.e(packageName, "packageName");
        this.f13354a = j;
        this.f13355b = uuid;
        this.f13356c = packageName;
        this.f13357d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return this.f13354a == vdVar.f13354a && kotlin.jvm.internal.h.a(this.f13355b, vdVar.f13355b) && kotlin.jvm.internal.h.a(this.f13356c, vdVar.f13356c) && kotlin.jvm.internal.h.a(this.f13357d, vdVar.f13357d);
    }

    public final int hashCode() {
        int hashCode;
        long j = this.f13354a;
        int a5 = h.a(this.f13356c, h.a(this.f13355b, ((int) (j ^ (j >>> 32))) * 31, 31), 31);
        String str = this.f13357d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a5 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppInstall(createdDateTimestamp=");
        sb.append(this.f13354a);
        sb.append(", uuid=");
        sb.append(this.f13355b);
        sb.append(", packageName=");
        sb.append(this.f13356c);
        sb.append(", appId=");
        return AbstractC0953k1.p(sb, this.f13357d, ')');
    }
}
