package E1;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.InterfaceC0545f;
import androidx.lifecycle.InterfaceC0561w;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class a implements InterfaceC0545f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1925a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f1926b;

    public a(ImageView imageView) {
        this.f1926b = imageView;
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final void a(InterfaceC0561w owner) {
        h.e(owner, "owner");
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final /* synthetic */ void b(InterfaceC0561w interfaceC0561w) {
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final void c(InterfaceC0561w owner) {
        h.e(owner, "owner");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            if (h.a(this.f1926b, ((a) obj).f1926b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final /* synthetic */ void f(InterfaceC0561w interfaceC0561w) {
    }

    public final void g() {
        Animatable animatable;
        Object drawable = this.f1926b.getDrawable();
        if (drawable instanceof Animatable) {
            animatable = (Animatable) drawable;
        } else {
            animatable = null;
        }
        if (animatable == null) {
            return;
        }
        if (this.f1925a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final int hashCode() {
        return this.f1926b.hashCode();
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final void i(InterfaceC0561w interfaceC0561w) {
        this.f1925a = true;
        g();
    }

    @Override // androidx.lifecycle.InterfaceC0545f
    public final void j(InterfaceC0561w interfaceC0561w) {
        this.f1925a = false;
        g();
    }

    public final void k(Drawable drawable) {
        Animatable animatable;
        ImageView imageView = this.f1926b;
        Object drawable2 = imageView.getDrawable();
        if (drawable2 instanceof Animatable) {
            animatable = (Animatable) drawable2;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        g();
    }
}
