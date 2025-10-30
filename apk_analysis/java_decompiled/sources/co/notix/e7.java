package co.notix;

/* loaded from: classes.dex */
public final class e7 implements e {

    /* renamed from: a, reason: collision with root package name */
    public final c7 f12142a;

    /* renamed from: b, reason: collision with root package name */
    public final O7.a f12143b;

    /* renamed from: c, reason: collision with root package name */
    public final O7.a f12144c;

    /* renamed from: d, reason: collision with root package name */
    public final O7.l f12145d;

    public e7(c7 appOpenData, O7.a aVar, O7.a aVar2, O7.l lVar) {
        kotlin.jvm.internal.h.e(appOpenData, "appOpenData");
        this.f12142a = appOpenData;
        this.f12143b = aVar;
        this.f12144c = aVar2;
        this.f12145d = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj;
        return kotlin.jvm.internal.h.a(this.f12142a, e7Var.f12142a) && kotlin.jvm.internal.h.a(this.f12143b, e7Var.f12143b) && kotlin.jvm.internal.h.a(this.f12144c, e7Var.f12144c) && kotlin.jvm.internal.h.a(this.f12145d, e7Var.f12145d);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f12142a.f11987a.hashCode() * 31;
        O7.a aVar = this.f12143b;
        int i9 = 0;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int i10 = (hashCode3 + hashCode) * 31;
        O7.a aVar2 = this.f12144c;
        if (aVar2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aVar2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        O7.l lVar = this.f12145d;
        if (lVar != null) {
            i9 = lVar.hashCode();
        }
        return i11 + i9;
    }

    public final String toString() {
        return "AppOpenStartParam(appOpenData=" + this.f12142a + ", onClick=" + this.f12143b + ", onDismiss=" + this.f12144c + ", onShowError=" + this.f12145d + ')';
    }
}
