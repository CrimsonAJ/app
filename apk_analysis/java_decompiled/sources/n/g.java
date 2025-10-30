package n;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o.n;
import o.o;
import o.s;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f20956A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f20957B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ h f20960E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f20961a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20968h;

    /* renamed from: i, reason: collision with root package name */
    public int f20969i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f20970k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f20971l;

    /* renamed from: m, reason: collision with root package name */
    public int f20972m;

    /* renamed from: n, reason: collision with root package name */
    public char f20973n;

    /* renamed from: o, reason: collision with root package name */
    public int f20974o;

    /* renamed from: p, reason: collision with root package name */
    public char f20975p;

    /* renamed from: q, reason: collision with root package name */
    public int f20976q;

    /* renamed from: r, reason: collision with root package name */
    public int f20977r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20978s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20979t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f20980u;

    /* renamed from: v, reason: collision with root package name */
    public int f20981v;

    /* renamed from: w, reason: collision with root package name */
    public int f20982w;

    /* renamed from: x, reason: collision with root package name */
    public String f20983x;

    /* renamed from: y, reason: collision with root package name */
    public String f20984y;

    /* renamed from: z, reason: collision with root package name */
    public o f20985z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f20958C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f20959D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f20962b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f20963c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f20964d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f20965e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20966f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20967g = true;

    public g(h hVar, Menu menu) {
        this.f20960E = hVar;
        this.f20961a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f20960E.f20990c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e8) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e8);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.MenuItem$OnMenuItemClickListener, n.f, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z9;
        MenuItem enabled = menuItem.setChecked(this.f20978s).setVisible(this.f20979t).setEnabled(this.f20980u);
        boolean z10 = false;
        if (this.f20977r >= 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        enabled.setCheckable(z9).setTitleCondensed(this.f20971l).setIcon(this.f20972m);
        int i9 = this.f20981v;
        if (i9 >= 0) {
            menuItem.setShowAsAction(i9);
        }
        String str = this.f20984y;
        h hVar = this.f20960E;
        if (str != null) {
            if (!hVar.f20990c.isRestricted()) {
                if (hVar.f20991d == null) {
                    hVar.f20991d = h.a(hVar.f20990c);
                }
                Object obj = hVar.f20991d;
                String str2 = this.f20984y;
                ?? obj2 = new Object();
                obj2.f20954a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f20955b = cls.getMethod(str2, MenuItemOnMenuItemClickListenerC1600f.f20953c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e8) {
                    StringBuilder r5 = AbstractC0953k1.r("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    r5.append(cls.getName());
                    InflateException inflateException = new InflateException(r5.toString());
                    inflateException.initCause(e8);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f20977r >= 2) {
            if (menuItem instanceof n) {
                ((n) menuItem).f(true);
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                try {
                    Method method = sVar.f21438d;
                    J.a aVar = sVar.f21437c;
                    if (method == null) {
                        sVar.f21438d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.f21438d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e9) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e9);
                }
            }
        }
        String str3 = this.f20983x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.f20986e, hVar.f20988a));
            z10 = true;
        }
        int i10 = this.f20982w;
        if (i10 > 0) {
            if (!z10) {
                menuItem.setActionView(i10);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        o oVar = this.f20985z;
        if (oVar != null) {
            if (menuItem instanceof J.a) {
                ((J.a) menuItem).b(oVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f20956A;
        boolean z11 = menuItem instanceof J.a;
        if (z11) {
            ((J.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            I.a.e(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f20957B;
        if (z11) {
            ((J.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            I.a.i(menuItem, charSequence2);
        }
        char c3 = this.f20973n;
        int i11 = this.f20974o;
        if (z11) {
            ((J.a) menuItem).setAlphabeticShortcut(c3, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            I.a.d(menuItem, c3, i11);
        }
        char c9 = this.f20975p;
        int i12 = this.f20976q;
        if (z11) {
            ((J.a) menuItem).setNumericShortcut(c9, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            I.a.h(menuItem, c9, i12);
        }
        PorterDuff.Mode mode = this.f20959D;
        if (mode != null) {
            if (z11) {
                ((J.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                I.a.g(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f20958C;
        if (colorStateList != null) {
            if (z11) {
                ((J.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                I.a.f(menuItem, colorStateList);
            }
        }
    }
}
