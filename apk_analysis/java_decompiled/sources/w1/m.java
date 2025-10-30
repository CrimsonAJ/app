package w1;

import u1.AbstractC2065m;
import u1.EnumC2057e;

/* loaded from: classes.dex */
public final class m extends e {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2065m f24031a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24032b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC2057e f24033c;

    public m(AbstractC2065m abstractC2065m, String str, EnumC2057e enumC2057e) {
        this.f24031a = abstractC2065m;
        this.f24032b = str;
        this.f24033c = enumC2057e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (kotlin.jvm.internal.h.a(this.f24031a, mVar.f24031a) && kotlin.jvm.internal.h.a(this.f24032b, mVar.f24032b) && this.f24033c == mVar.f24033c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.f24031a.hashCode() * 31;
        String str = this.f24032b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return this.f24033c.hashCode() + ((hashCode + i9) * 31);
    }
}
