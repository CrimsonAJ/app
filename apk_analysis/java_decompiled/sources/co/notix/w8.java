package co.notix;

import co.notix.domain.RequestVars;

/* loaded from: classes.dex */
public final class w8 extends o4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f13410a;

    /* renamed from: b, reason: collision with root package name */
    public final RequestVars f13411b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f13412c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(long j, RequestVars vars, Integer num) {
        super(0);
        kotlin.jvm.internal.h.e(vars, "vars");
        this.f13410a = j;
        this.f13411b = vars;
        this.f13412c = num;
    }

    @Override // co.notix.o4
    public final Integer a() {
        return this.f13412c;
    }

    @Override // co.notix.o4
    public final RequestVars b() {
        return this.f13411b;
    }

    @Override // co.notix.o4
    public final long c() {
        return this.f13410a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8)) {
            return false;
        }
        w8 w8Var = (w8) obj;
        if (this.f13410a == w8Var.f13410a && kotlin.jvm.internal.h.a(this.f13411b, w8Var.f13411b) && kotlin.jvm.internal.h.a(this.f13412c, w8Var.f13412c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.f13410a;
        int hashCode2 = (this.f13411b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31;
        Integer num = this.f13412c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "CommonAdRequest(zoneId=" + this.f13410a + ", vars=" + this.f13411b + ", experiment=" + this.f13412c + ')';
    }
}
