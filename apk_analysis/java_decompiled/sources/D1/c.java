package D1;

import android.content.Context;
import android.util.DisplayMetrics;
import t1.C2001j;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1769a;

    public c(Context context) {
        this.f1769a = context;
    }

    @Override // D1.i
    public final Object a(C2001j c2001j) {
        DisplayMetrics displayMetrics = this.f1769a.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            if (kotlin.jvm.internal.h.a(this.f1769a, ((c) obj).f1769a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1769a.hashCode();
    }
}
