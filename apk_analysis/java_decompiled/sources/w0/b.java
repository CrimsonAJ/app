package w0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import u0.C;
import u0.InterfaceC2034e;

/* loaded from: classes.dex */
public final class b extends C implements InterfaceC2034e {

    /* renamed from: k, reason: collision with root package name */
    public String f23973k;

    @Override // u0.C
    public final void e(Context context, AttributeSet attributeSet) {
        super.e(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, k.f23998a);
        kotlin.jvm.internal.h.d(obtainAttributes, "context.resources.obtain….DialogFragmentNavigator)");
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.f23973k = string;
        }
        obtainAttributes.recycle();
    }

    @Override // u0.C
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof b) && super.equals(obj) && kotlin.jvm.internal.h.a(this.f23973k, ((b) obj).f23973k)) {
            return true;
        }
        return false;
    }

    @Override // u0.C
    public final int hashCode() {
        int i9;
        int hashCode = super.hashCode() * 31;
        String str = this.f23973k;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return hashCode + i9;
    }
}
