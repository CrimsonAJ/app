package p;

import a.AbstractC0485a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import h.AbstractC1260a;
import java.lang.reflect.Method;
import o.InterfaceC1657B;

/* renamed from: p.A0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1733A0 implements InterfaceC1657B {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f21768A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f21769B;

    /* renamed from: C, reason: collision with root package name */
    public static final Method f21770C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f21771a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f21772b;

    /* renamed from: c, reason: collision with root package name */
    public C1812o0 f21773c;

    /* renamed from: f, reason: collision with root package name */
    public int f21776f;

    /* renamed from: g, reason: collision with root package name */
    public int f21777g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21779i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f21780k;

    /* renamed from: n, reason: collision with root package name */
    public C1830x0 f21783n;

    /* renamed from: o, reason: collision with root package name */
    public View f21784o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f21785p;

    /* renamed from: q, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f21786q;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f21791v;

    /* renamed from: x, reason: collision with root package name */
    public Rect f21793x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f21794y;

    /* renamed from: z, reason: collision with root package name */
    public final C1829x f21795z;

    /* renamed from: d, reason: collision with root package name */
    public final int f21774d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f21775e = -2;

    /* renamed from: h, reason: collision with root package name */
    public final int f21778h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f21781l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f21782m = Integer.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final RunnableC1828w0 f21787r = new RunnableC1828w0(this, 1);

    /* renamed from: s, reason: collision with root package name */
    public final ViewOnTouchListenerC1834z0 f21788s = new ViewOnTouchListenerC1834z0(this);

    /* renamed from: t, reason: collision with root package name */
    public final C1832y0 f21789t = new C1832y0(this);

    /* renamed from: u, reason: collision with root package name */
    public final RunnableC1828w0 f21790u = new RunnableC1828w0(this, 0);

    /* renamed from: w, reason: collision with root package name */
    public final Rect f21792w = new Rect();

    static {
        int i9 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i9 <= 28) {
            try {
                f21768A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f21770C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f21769B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [android.widget.PopupWindow, p.x] */
    public C1733A0(Context context, AttributeSet attributeSet, int i9) {
        Drawable drawable;
        int resourceId;
        this.f21771a = context;
        this.f21791v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1260a.f17818o, i9, 0);
        this.f21776f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f21777g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f21779i = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, attributeSet, i9, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1260a.f17822s, i9, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            popupWindow.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = AbstractC0485a.q(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.f21795z = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    @Override // o.InterfaceC1657B
    public final boolean a() {
        return this.f21795z.isShowing();
    }

    public final int b() {
        return this.f21776f;
    }

    public final Drawable c() {
        return this.f21795z.getBackground();
    }

    @Override // o.InterfaceC1657B
    public final void d() {
        int i9;
        boolean z9;
        int a5;
        int makeMeasureSpec;
        int i10;
        int i11;
        boolean z10;
        C1812o0 c1812o0;
        int i12;
        int i13;
        int i14 = 0;
        C1812o0 c1812o02 = this.f21773c;
        C1829x c1829x = this.f21795z;
        Context context = this.f21771a;
        if (c1812o02 == null) {
            C1812o0 q9 = q(context, !this.f21794y);
            this.f21773c = q9;
            q9.setAdapter(this.f21772b);
            this.f21773c.setOnItemClickListener(this.f21785p);
            this.f21773c.setFocusable(true);
            this.f21773c.setFocusableInTouchMode(true);
            this.f21773c.setOnItemSelectedListener(new C1822t0(this));
            this.f21773c.setOnScrollListener(this.f21789t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f21786q;
            if (onItemSelectedListener != null) {
                this.f21773c.setOnItemSelectedListener(onItemSelectedListener);
            }
            c1829x.setContentView(this.f21773c);
        }
        Drawable background = c1829x.getBackground();
        Rect rect = this.f21792w;
        if (background != null) {
            background.getPadding(rect);
            int i15 = rect.top;
            i9 = rect.bottom + i15;
            if (!this.f21779i) {
                this.f21777g = -i15;
            }
        } else {
            rect.setEmpty();
            i9 = 0;
        }
        if (c1829x.getInputMethodMode() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        View view = this.f21784o;
        int i16 = this.f21777g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f21769B;
            if (method != null) {
                try {
                    a5 = ((Integer) method.invoke(c1829x, view, Integer.valueOf(i16), Boolean.valueOf(z9))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a5 = c1829x.getMaxAvailableHeight(view, i16);
        } else {
            a5 = AbstractC1824u0.a(c1829x, view, i16, z9);
        }
        int i17 = this.f21774d;
        if (i17 == -1) {
            i11 = a5 + i9;
        } else {
            int i18 = this.f21775e;
            if (i18 != -2) {
                if (i18 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a9 = this.f21773c.a(makeMeasureSpec, a5);
            if (a9 > 0) {
                i10 = this.f21773c.getPaddingBottom() + this.f21773c.getPaddingTop() + i9;
            } else {
                i10 = 0;
            }
            i11 = a9 + i10;
        }
        if (this.f21795z.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        c1829x.setWindowLayoutType(this.f21778h);
        if (c1829x.isShowing()) {
            if (this.f21784o.isAttachedToWindow()) {
                int i19 = this.f21775e;
                if (i19 == -1) {
                    i19 = -1;
                } else if (i19 == -2) {
                    i19 = this.f21784o.getWidth();
                }
                if (i17 == -1) {
                    if (z10) {
                        i17 = i11;
                    } else {
                        i17 = -1;
                    }
                    if (z10) {
                        if (this.f21775e == -1) {
                            i13 = -1;
                        } else {
                            i13 = 0;
                        }
                        c1829x.setWidth(i13);
                        c1829x.setHeight(0);
                    } else {
                        if (this.f21775e == -1) {
                            i14 = -1;
                        }
                        c1829x.setWidth(i14);
                        c1829x.setHeight(-1);
                    }
                } else if (i17 == -2) {
                    i17 = i11;
                }
                c1829x.setOutsideTouchable(true);
                int i20 = i19;
                View view2 = this.f21784o;
                int i21 = this.f21776f;
                int i22 = this.f21777g;
                if (i20 < 0) {
                    i20 = -1;
                }
                if (i17 < 0) {
                    i12 = -1;
                } else {
                    i12 = i17;
                }
                c1829x.update(view2, i21, i22, i20, i12);
                return;
            }
            return;
        }
        int i23 = this.f21775e;
        if (i23 == -1) {
            i23 = -1;
        } else if (i23 == -2) {
            i23 = this.f21784o.getWidth();
        }
        if (i17 == -1) {
            i17 = -1;
        } else if (i17 == -2) {
            i17 = i11;
        }
        c1829x.setWidth(i23);
        c1829x.setHeight(i17);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f21768A;
            if (method2 != null) {
                try {
                    method2.invoke(c1829x, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC1826v0.b(c1829x, true);
        }
        c1829x.setOutsideTouchable(true);
        c1829x.setTouchInterceptor(this.f21788s);
        if (this.f21780k) {
            c1829x.setOverlapAnchor(this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f21770C;
            if (method3 != null) {
                try {
                    method3.invoke(c1829x, this.f21793x);
                } catch (Exception e8) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e8);
                }
            }
        } else {
            AbstractC1826v0.a(c1829x, this.f21793x);
        }
        c1829x.showAsDropDown(this.f21784o, this.f21776f, this.f21777g, this.f21781l);
        this.f21773c.setSelection(-1);
        if ((!this.f21794y || this.f21773c.isInTouchMode()) && (c1812o0 = this.f21773c) != null) {
            c1812o0.setListSelectionHidden(true);
            c1812o0.requestLayout();
        }
        if (!this.f21794y) {
            this.f21791v.post(this.f21790u);
        }
    }

    @Override // o.InterfaceC1657B
    public final void dismiss() {
        C1829x c1829x = this.f21795z;
        c1829x.dismiss();
        c1829x.setContentView(null);
        this.f21773c = null;
        this.f21791v.removeCallbacks(this.f21787r);
    }

    @Override // o.InterfaceC1657B
    public final C1812o0 e() {
        return this.f21773c;
    }

    public final void g(Drawable drawable) {
        this.f21795z.setBackgroundDrawable(drawable);
    }

    public final void i(int i9) {
        this.f21777g = i9;
        this.f21779i = true;
    }

    public final void k(int i9) {
        this.f21776f = i9;
    }

    public final int m() {
        if (!this.f21779i) {
            return 0;
        }
        return this.f21777g;
    }

    public void p(ListAdapter listAdapter) {
        C1830x0 c1830x0 = this.f21783n;
        if (c1830x0 == null) {
            this.f21783n = new C1830x0(this);
        } else {
            ListAdapter listAdapter2 = this.f21772b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c1830x0);
            }
        }
        this.f21772b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f21783n);
        }
        C1812o0 c1812o0 = this.f21773c;
        if (c1812o0 != null) {
            c1812o0.setAdapter(this.f21772b);
        }
    }

    public C1812o0 q(Context context, boolean z9) {
        return new C1812o0(context, z9);
    }

    public final void r(int i9) {
        Drawable background = this.f21795z.getBackground();
        if (background != null) {
            Rect rect = this.f21792w;
            background.getPadding(rect);
            this.f21775e = rect.left + rect.right + i9;
            return;
        }
        this.f21775e = i9;
    }
}
