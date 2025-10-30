package m3;

import android.text.TextUtils;
import j3.M;
import l4.AbstractC1566a;
import u0.z;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f20710a;

    /* renamed from: b, reason: collision with root package name */
    public final M f20711b;

    /* renamed from: c, reason: collision with root package name */
    public final M f20712c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20713d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20714e;

    public h(String str, M m9, M m10, int i9, int i10) {
        boolean z9;
        if (i9 != 0 && i10 != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        AbstractC1566a.h(z9);
        if (!TextUtils.isEmpty(str)) {
            this.f20710a = str;
            m9.getClass();
            this.f20711b = m9;
            m10.getClass();
            this.f20712c = m10;
            this.f20713d = i9;
            this.f20714e = i10;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f20713d == hVar.f20713d && this.f20714e == hVar.f20714e && this.f20710a.equals(hVar.f20710a) && this.f20711b.equals(hVar.f20711b) && this.f20712c.equals(hVar.f20712c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20712c.hashCode() + ((this.f20711b.hashCode() + z.c(this.f20710a, (((527 + this.f20713d) * 31) + this.f20714e) * 31, 31)) * 31);
    }
}
