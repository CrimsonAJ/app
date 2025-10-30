package w0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import u0.C;

/* loaded from: classes.dex */
public final class g extends C {

    /* renamed from: k, reason: collision with root package name */
    public String f23990k;

    @Override // u0.C
    public final void e(Context context, AttributeSet attributeSet) {
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, k.f23999b);
        kotlin.jvm.internal.h.d(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.f23990k = string;
        }
        obtainAttributes.recycle();
    }

    @Override // u0.C
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g) && super.equals(obj) && kotlin.jvm.internal.h.a(this.f23990k, ((g) obj).f23990k)) {
            return true;
        }
        return false;
    }

    @Override // u0.C
    public final int hashCode() {
        int i9;
        int hashCode = super.hashCode() * 31;
        String str = this.f23990k;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode + i9;
    }

    @Override // u0.C
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.f23990k;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "sb.toString()");
        return sb2;
    }
}
