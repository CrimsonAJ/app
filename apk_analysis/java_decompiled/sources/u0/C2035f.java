package u0;

import android.os.Bundle;
import java.util.Set;

/* renamed from: u0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2035f {

    /* renamed from: a, reason: collision with root package name */
    public final int f23481a;

    /* renamed from: b, reason: collision with root package name */
    public J f23482b = null;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f23483c = null;

    public C2035f(int i9) {
        this.f23481a = i9;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C2035f)) {
            C2035f c2035f = (C2035f) obj;
            if (this.f23481a == c2035f.f23481a && kotlin.jvm.internal.h.a(this.f23482b, c2035f.f23482b)) {
                if (!kotlin.jvm.internal.h.a(this.f23483c, c2035f.f23483c)) {
                    Bundle bundle = this.f23483c;
                    if (bundle != null && (keySet = bundle.keySet()) != null) {
                        if (!keySet.isEmpty()) {
                            for (String str : keySet) {
                                Bundle bundle2 = this.f23483c;
                                Object obj3 = null;
                                if (bundle2 != null) {
                                    obj2 = bundle2.get(str);
                                } else {
                                    obj2 = null;
                                }
                                Bundle bundle3 = c2035f.f23483c;
                                if (bundle3 != null) {
                                    obj3 = bundle3.get(str);
                                }
                                if (!kotlin.jvm.internal.h.a(obj2, obj3)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        Set<String> keySet;
        Object obj;
        int i10;
        int i11 = this.f23481a * 31;
        J j = this.f23482b;
        if (j != null) {
            i9 = j.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = i11 + i9;
        Bundle bundle = this.f23483c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i13 = i12 * 31;
                Bundle bundle2 = this.f23483c;
                if (bundle2 != null) {
                    obj = bundle2.get(str);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    i10 = obj.hashCode();
                } else {
                    i10 = 0;
                }
                i12 = i13 + i10;
            }
        }
        return i12;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C2035f.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.f23481a));
        sb.append(")");
        if (this.f23482b != null) {
            sb.append(" navOptions=");
            sb.append(this.f23482b);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "sb.toString()");
        return sb2;
    }
}
