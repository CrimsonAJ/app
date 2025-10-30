package p;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* renamed from: p.Y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1780Y0 implements InterfaceC1794f0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f21928a;

    /* renamed from: b, reason: collision with root package name */
    public int f21929b;

    /* renamed from: c, reason: collision with root package name */
    public View f21930c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f21931d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f21932e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f21933f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21934g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f21935h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f21936i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f21937k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f21938l;

    /* renamed from: m, reason: collision with root package name */
    public C1805l f21939m;

    /* renamed from: n, reason: collision with root package name */
    public int f21940n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f21941o;

    public final void a(int i9) {
        View view;
        int i10 = this.f21929b ^ i9;
        this.f21929b = i9;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i9 & 4) != 0) {
                    b();
                }
                int i11 = this.f21929b & 4;
                Toolbar toolbar = this.f21928a;
                if (i11 != 0) {
                    Drawable drawable = this.f21933f;
                    if (drawable == null) {
                        drawable = this.f21941o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            int i12 = i10 & 8;
            Toolbar toolbar2 = this.f21928a;
            if (i12 != 0) {
                if ((i9 & 8) != 0) {
                    toolbar2.setTitle(this.f21935h);
                    toolbar2.setSubtitle(this.f21936i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f21930c) != null) {
                if ((i9 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.f21929b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f21928a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f21940n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i9 = this.f21929b;
        if ((i9 & 2) != 0) {
            if ((i9 & 1) != 0) {
                drawable = this.f21932e;
                if (drawable == null) {
                    drawable = this.f21931d;
                }
            } else {
                drawable = this.f21931d;
            }
        } else {
            drawable = null;
        }
        this.f21928a.setLogo(drawable);
    }
}
