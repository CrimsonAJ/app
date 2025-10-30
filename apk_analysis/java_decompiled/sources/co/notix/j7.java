package co.notix;

import co.notix.domain.RequestVars;

/* loaded from: classes.dex */
public final class j7 extends o4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f12533a;

    /* renamed from: b, reason: collision with root package name */
    public final RequestVars f12534b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f12535c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f12536d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f12537e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(long j, RequestVars vars, Integer num, Integer num2, Integer num3) {
        super(0);
        kotlin.jvm.internal.h.e(vars, "vars");
        this.f12533a = j;
        this.f12534b = vars;
        this.f12535c = num;
        this.f12536d = num2;
        this.f12537e = num3;
    }

    @Override // co.notix.o4
    public final Integer a() {
        return this.f12535c;
    }

    @Override // co.notix.o4
    public final RequestVars b() {
        return this.f12534b;
    }

    @Override // co.notix.o4
    public final long c() {
        return this.f12533a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        if (this.f12533a == j7Var.f12533a && kotlin.jvm.internal.h.a(this.f12534b, j7Var.f12534b) && kotlin.jvm.internal.h.a(this.f12535c, j7Var.f12535c) && kotlin.jvm.internal.h.a(this.f12536d, j7Var.f12536d) && kotlin.jvm.internal.h.a(this.f12537e, j7Var.f12537e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.f12533a;
        int hashCode3 = (this.f12534b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31;
        Integer num = this.f12535c;
        int i9 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        Integer num2 = this.f12536d;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num3 = this.f12537e;
        if (num3 != null) {
            i9 = num3.hashCode();
        }
        return i11 + i9;
    }

    public final String toString() {
        return "BannerAdRequest(zoneId=" + this.f12533a + ", vars=" + this.f12534b + ", experiment=" + this.f12535c + ", availableWidth=" + this.f12536d + ", availableHeight=" + this.f12537e + ')';
    }
}
