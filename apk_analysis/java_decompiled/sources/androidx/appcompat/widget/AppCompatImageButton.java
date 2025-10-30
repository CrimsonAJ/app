package androidx.appcompat.widget;

import A3.E;
import F0.C0096b;
import a.AbstractC0485a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import co.notix.R;
import i8.C1425o;
import p.AbstractC1761O0;
import p.AbstractC1763P0;
import p.AbstractC1800i0;

/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0096b f9440a;

    /* renamed from: b, reason: collision with root package name */
    public final E f9441b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9442c;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0096b c0096b = this.f9440a;
        if (c0096b != null) {
            c0096b.a();
        }
        E e8 = this.f9441b;
        if (e8 != null) {
            e8.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0096b c0096b = this.f9440a;
        if (c0096b != null) {
            return c0096b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0096b c0096b = this.f9440a;
        if (c0096b != null) {
            return c0096b.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1425o c1425o;
        E e8 = this.f9441b;
        if (e8 == null || (c1425o = (C1425o) e8.f48d) == null) {
            return null;
        }
        return (ColorStateList) c1425o.f19128c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1425o c1425o;
        E e8 = this.f9441b;
        if (e8 == null || (c1425o = (C1425o) e8.f48d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c1425o.f19129d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f9441b.f47c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0096b c0096b = this.f9440a;
        if (c0096b != null) {
            c0096b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C0096b c0096b = this.f9440a;
        if (c0096b != null) {
            c0096b.n(i9);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        E e8 = this.f9441b;
        if (e8 != null) {
            e8.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        E e8 = this.f9441b;
        if (e8 != null && drawable != null && !this.f9442c) {
            e8.f46b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (e8 != null) {
            e8.b();
            if (!this.f9442c) {
                ImageView imageView = (ImageView) e8.f47c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(e8.f46b);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i9) {
        super.setImageLevel(i9);
        this.f9442c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i9) {
        E e8 = this.f9441b;
        ImageView imageView = (ImageView) e8.f47c;
        if (i9 != 0) {
            Drawable q9 = AbstractC0485a.q(imageView.getContext(), i9);
            if (q9 != null) {
                AbstractC1800i0.a(q9);
            }
            imageView.setImageDrawable(q9);
        } else {
            imageView.setImageDrawable(null);
        }
        e8.b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        E e8 = this.f9441b;
        if (e8 != null) {
            e8.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0096b c0096b = this.f9440a;
        if (c0096b != null) {
            c0096b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0096b c0096b = this.f9440a;
        if (c0096b != null) {
            c0096b.t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        E e8 = this.f9441b;
        if (e8 != null) {
            if (((C1425o) e8.f48d) == null) {
                e8.f48d = new Object();
            }
            C1425o c1425o = (C1425o) e8.f48d;
            c1425o.f19128c = colorStateList;
            c1425o.f19127b = true;
            e8.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        E e8 = this.f9441b;
        if (e8 != null) {
            if (((C1425o) e8.f48d) == null) {
                e8.f48d = new Object();
            }
            C1425o c1425o = (C1425o) e8.f48d;
            c1425o.f19129d = mode;
            c1425o.f19126a = true;
            e8.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        AbstractC1763P0.a(context);
        this.f9442c = false;
        AbstractC1761O0.a(this, getContext());
        C0096b c0096b = new C0096b(this);
        this.f9440a = c0096b;
        c0096b.k(attributeSet, i9);
        E e8 = new E(this);
        this.f9441b = e8;
        e8.l(attributeSet, i9);
    }
}
