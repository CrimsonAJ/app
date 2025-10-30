package co.notix;

/* loaded from: classes.dex */
public final class sp {

    /* renamed from: a, reason: collision with root package name */
    public final l9 f13194a;

    /* renamed from: b, reason: collision with root package name */
    public final rp f13195b;

    /* renamed from: c, reason: collision with root package name */
    public final pp f13196c;

    /* renamed from: d, reason: collision with root package name */
    public final mp f13197d;

    public sp(l9 l9Var, rp rpVar, pp ppVar, mp mpVar) {
        this.f13194a = l9Var;
        this.f13195b = rpVar;
        this.f13196c = ppVar;
        this.f13197d = mpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp)) {
            return false;
        }
        sp spVar = (sp) obj;
        return kotlin.jvm.internal.h.a(this.f13194a, spVar.f13194a) && kotlin.jvm.internal.h.a(this.f13195b, spVar.f13195b) && kotlin.jvm.internal.h.a(this.f13196c, spVar.f13196c) && kotlin.jvm.internal.h.a(this.f13197d, spVar.f13197d);
    }

    public final int hashCode() {
        l9 l9Var = this.f13194a;
        int hashCode = (l9Var == null ? 0 : l9Var.hashCode()) * 31;
        rp rpVar = this.f13195b;
        int hashCode2 = (hashCode + (rpVar == null ? 0 : rpVar.hashCode())) * 31;
        pp ppVar = this.f13196c;
        int hashCode3 = (hashCode2 + (ppVar == null ? 0 : ppVar.hashCode())) * 31;
        mp mpVar = this.f13197d;
        return hashCode3 + (mpVar != null ? mpVar.hashCode() : 0);
    }

    public final String toString() {
        return "Settings(domains=" + this.f13194a + ", remoteLogger=" + this.f13195b + ", notification=" + this.f13196c + ", lsi=" + this.f13197d + ')';
    }
}
