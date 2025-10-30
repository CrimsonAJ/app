package co.notix;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class m implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f12751a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12752b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12753c;

    public m(String impressionData, String str, String str2) {
        kotlin.jvm.internal.h.e(impressionData, "impressionData");
        this.f12751a = impressionData;
        this.f12752b = str;
        this.f12753c = str2;
    }

    @Override // co.notix.g
    public final String a() {
        return this.f12751a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (kotlin.jvm.internal.h.a(this.f12751a, mVar.f12751a) && kotlin.jvm.internal.h.a(this.f12752b, mVar.f12752b) && kotlin.jvm.internal.h.a(this.f12753c, mVar.f12753c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f12751a.hashCode() * 31;
        String str = this.f12752b;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        String str2 = this.f12753c;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return i10 + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdContentHtml(impressionData=");
        sb.append(this.f12751a);
        sb.append(", nurl=");
        sb.append(this.f12752b);
        sb.append(", adm=");
        return AbstractC0953k1.p(sb, this.f12753c, ')');
    }
}
