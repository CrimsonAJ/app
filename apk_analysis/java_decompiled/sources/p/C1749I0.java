package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import b6.C0693o;
import co.notix.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import s.C1937g;
import s.C1939i;
import s.C1940j;

/* renamed from: p.I0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1749I0 {

    /* renamed from: i, reason: collision with root package name */
    public static C1749I0 f21823i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f21824a;

    /* renamed from: b, reason: collision with root package name */
    public C1939i f21825b;

    /* renamed from: c, reason: collision with root package name */
    public C1940j f21826c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f21827d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f21828e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21829f;

    /* renamed from: g, reason: collision with root package name */
    public C0693o f21830g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f21822h = PorterDuff.Mode.SRC_IN;
    public static final C1745G0 j = new F0.z0(6);

    public static synchronized C1749I0 d() {
        C1749I0 c1749i0;
        synchronized (C1749I0.class) {
            try {
                if (f21823i == null) {
                    C1749I0 c1749i02 = new C1749I0();
                    f21823i = c1749i02;
                    j(c1749i02);
                }
                c1749i0 = f21823i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1749i0;
    }

    public static synchronized PorterDuffColorFilter h(int i9, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C1749I0.class) {
            C1745G0 c1745g0 = j;
            c1745g0.getClass();
            int i10 = (31 + i9) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c1745g0.h(Integer.valueOf(mode.hashCode() + i10));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i9, mode);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(C1749I0 c1749i0) {
        if (Build.VERSION.SDK_INT < 24) {
            c1749i0.a("vector", new C1747H0(3));
            c1749i0.a("animated-vector", new C1747H0(2));
            c1749i0.a("animated-selector", new C1747H0(1));
            c1749i0.a("drawable", new C1747H0(0));
        }
    }

    public final void a(String str, C1747H0 c1747h0) {
        if (this.f21825b == null) {
            this.f21825b = new C1939i(0);
        }
        this.f21825b.put(str, c1747h0);
    }

    public final synchronized void b(Context context, long j4, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C1937g c1937g = (C1937g) this.f21827d.get(context);
                if (c1937g == null) {
                    c1937g = new C1937g();
                    this.f21827d.put(context, c1937g);
                }
                c1937g.k(j4, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i9) {
        if (this.f21828e == null) {
            this.f21828e = new TypedValue();
        }
        TypedValue typedValue = this.f21828e;
        context.getResources().getValue(i9, typedValue, true);
        long j4 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e8 = e(context, j4);
        if (e8 != null) {
            return e8;
        }
        LayerDrawable layerDrawable = null;
        if (this.f21830g != null) {
            if (i9 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i9 == R.drawable.abc_ratingbar_material) {
                layerDrawable = C0693o.i(this, context, R.dimen.abc_star_big);
            } else if (i9 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C0693o.i(this, context, R.dimen.abc_star_medium);
            } else if (i9 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C0693o.i(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j4, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j4) {
        C1937g c1937g = (C1937g) this.f21827d.get(context);
        if (c1937g == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c1937g.f(j4);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c1937g.l(j4);
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i9) {
        return g(context, i9, false);
    }

    public final synchronized Drawable g(Context context, int i9, boolean z9) {
        Drawable k5;
        try {
            if (!this.f21829f) {
                this.f21829f = true;
                Drawable f9 = f(context, R.drawable.abc_vector_test);
                if (f9 == null || (!(f9 instanceof Y0.r) && !"android.graphics.drawable.VectorDrawable".equals(f9.getClass().getName()))) {
                    this.f21829f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k5 = k(context, i9);
            if (k5 == null) {
                k5 = c(context, i9);
            }
            if (k5 == null) {
                k5 = context.getDrawable(i9);
            }
            if (k5 != null) {
                k5 = n(context, i9, z9, k5);
            }
            if (k5 != null) {
                AbstractC1800i0.a(k5);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k5;
    }

    public final synchronized ColorStateList i(Context context, int i9) {
        ColorStateList colorStateList;
        C1940j c1940j;
        WeakHashMap weakHashMap = this.f21824a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (c1940j = (C1940j) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) c1940j.e(i9);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            C0693o c0693o = this.f21830g;
            if (c0693o != null) {
                colorStateList2 = c0693o.j(context, i9);
            }
            if (colorStateList2 != null) {
                if (this.f21824a == null) {
                    this.f21824a = new WeakHashMap();
                }
                C1940j c1940j2 = (C1940j) this.f21824a.get(context);
                if (c1940j2 == null) {
                    c1940j2 = new C1940j(0);
                    this.f21824a.put(context, c1940j2);
                }
                c1940j2.b(i9, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i9) {
        int next;
        C1939i c1939i = this.f21825b;
        if (c1939i != null && !c1939i.isEmpty()) {
            C1940j c1940j = this.f21826c;
            if (c1940j != null) {
                String str = (String) c1940j.e(i9);
                if (!"appcompat_skip_skip".equals(str)) {
                    if (str != null && this.f21825b.get(str) == null) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                this.f21826c = new C1940j(0);
            }
            if (this.f21828e == null) {
                this.f21828e = new TypedValue();
            }
            TypedValue typedValue = this.f21828e;
            Resources resources = context.getResources();
            resources.getValue(i9, typedValue, true);
            long j4 = (typedValue.assetCookie << 32) | typedValue.data;
            Drawable e8 = e(context, j4);
            if (e8 != null) {
                return e8;
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                try {
                    XmlResourceParser xml = resources.getXml(i9);
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        String name = xml.getName();
                        this.f21826c.b(i9, name);
                        C1747H0 c1747h0 = (C1747H0) this.f21825b.get(name);
                        if (c1747h0 != null) {
                            e8 = c1747h0.a(context, xml, asAttributeSet, context.getTheme());
                        }
                        if (e8 != null) {
                            e8.setChangingConfigurations(typedValue.changingConfigurations);
                            b(context, j4, e8);
                        }
                    } else {
                        throw new XmlPullParserException("No start tag found");
                    }
                } catch (Exception e9) {
                    Log.e("ResourceManagerInternal", "Exception while inflating drawable", e9);
                }
            }
            if (e8 == null) {
                this.f21826c.b(i9, "appcompat_skip_skip");
            }
            return e8;
        }
        return null;
    }

    public final synchronized void l(Context context) {
        C1937g c1937g = (C1937g) this.f21827d.get(context);
        if (c1937g != null) {
            c1937g.c();
        }
    }

    public final synchronized void m(C0693o c0693o) {
        this.f21830g = c0693o;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable n(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1749I0.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
