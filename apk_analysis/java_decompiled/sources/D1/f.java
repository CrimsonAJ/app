package D1;

import Y7.C0464h;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.android.gms.internal.measurement.D1;
import t1.C2001j;

/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f1772a;

    public f(ImageView imageView) {
        this.f1772a = imageView;
    }

    @Override // D1.i
    public final Object a(C2001j c2001j) {
        h b9 = A0.a.b(this);
        if (b9 != null) {
            return b9;
        }
        C0464h c0464h = new C0464h(1, D1.A(c2001j));
        c0464h.s();
        ViewTreeObserver viewTreeObserver = this.f1772a.getViewTreeObserver();
        k kVar = new k(this, viewTreeObserver, c0464h);
        viewTreeObserver.addOnPreDrawListener(kVar);
        c0464h.u(new j(this, viewTreeObserver, kVar));
        return c0464h.r();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            if (kotlin.jvm.internal.h.a(this.f1772a, ((f) obj).f1772a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1772a.hashCode() * 31) + 1231;
    }
}
