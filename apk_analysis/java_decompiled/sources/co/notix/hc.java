package co.notix;

/* loaded from: classes.dex */
public final class hc implements fc {

    /* renamed from: a, reason: collision with root package name */
    public final m f12367a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12368b;

    /* renamed from: c, reason: collision with root package name */
    public final O7.a f12369c;

    /* renamed from: d, reason: collision with root package name */
    public final O7.a f12370d;

    /* renamed from: e, reason: collision with root package name */
    public final O7.l f12371e;

    public hc(m model, boolean z9, O7.a aVar, O7.a aVar2, O7.l lVar) {
        kotlin.jvm.internal.h.e(model, "model");
        this.f12367a = model;
        this.f12368b = z9;
        this.f12369c = aVar;
        this.f12370d = aVar2;
        this.f12371e = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc)) {
            return false;
        }
        hc hcVar = (hc) obj;
        if (kotlin.jvm.internal.h.a(this.f12367a, hcVar.f12367a) && this.f12368b == hcVar.f12368b && kotlin.jvm.internal.h.a(this.f12369c, hcVar.f12369c) && kotlin.jvm.internal.h.a(this.f12370d, hcVar.f12370d) && kotlin.jvm.internal.h.a(this.f12371e, hcVar.f12371e)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f12367a.hashCode() * 31;
        boolean z9 = this.f12368b;
        int i9 = z9;
        if (z9 != 0) {
            i9 = 1;
        }
        int i10 = (hashCode3 + i9) * 31;
        O7.a aVar = this.f12369c;
        int i11 = 0;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int i12 = (i10 + hashCode) * 31;
        O7.a aVar2 = this.f12370d;
        if (aVar2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aVar2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        O7.l lVar = this.f12371e;
        if (lVar != null) {
            i11 = lVar.hashCode();
        }
        return i13 + i11;
    }

    public final String toString() {
        return "InterstitialStartParamHtml(model=" + this.f12367a + ", closeOnClick=" + this.f12368b + ", onClick=" + this.f12369c + ", onDismiss=" + this.f12370d + ", onShowError=" + this.f12371e + ')';
    }
}
