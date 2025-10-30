package p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;
import co.notix.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public static b1 f21960k;

    /* renamed from: l, reason: collision with root package name */
    public static b1 f21961l;

    /* renamed from: a, reason: collision with root package name */
    public final View f21962a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f21963b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21964c;

    /* renamed from: d, reason: collision with root package name */
    public final a1 f21965d;

    /* renamed from: e, reason: collision with root package name */
    public final a1 f21966e;

    /* renamed from: f, reason: collision with root package name */
    public int f21967f;

    /* renamed from: g, reason: collision with root package name */
    public int f21968g;

    /* renamed from: h, reason: collision with root package name */
    public c1 f21969h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21970i;
    public boolean j;

    /* JADX WARN: Type inference failed for: r0v0, types: [p.a1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [p.a1] */
    public b1(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        final int i9 = 0;
        this.f21965d = new Runnable(this) { // from class: p.a1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b1 f21946b;

            {
                this.f21946b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        this.f21946b.c(false);
                        return;
                    default:
                        this.f21946b.a();
                        return;
                }
            }
        };
        final int i10 = 1;
        this.f21966e = new Runnable(this) { // from class: p.a1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b1 f21946b;

            {
                this.f21946b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f21946b.c(false);
                        return;
                    default:
                        this.f21946b.a();
                        return;
                }
            }
        };
        this.f21962a = view;
        this.f21963b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = P.S.f5552a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = F.a.k(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f21964c = scaledTouchSlop;
        this.j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(b1 b1Var) {
        b1 b1Var2 = f21960k;
        if (b1Var2 != null) {
            b1Var2.f21962a.removeCallbacks(b1Var2.f21965d);
        }
        f21960k = b1Var;
        if (b1Var != null) {
            b1Var.f21962a.postDelayed(b1Var.f21965d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        b1 b1Var = f21961l;
        View view = this.f21962a;
        if (b1Var == this) {
            f21961l = null;
            c1 c1Var = this.f21969h;
            if (c1Var != null) {
                View view2 = (View) c1Var.f21977b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c1Var.f21976a).getSystemService("window")).removeView(view2);
                }
                this.f21969h = null;
                this.j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f21960k == this) {
            b(null);
        }
        view.removeCallbacks(this.f21966e);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, p.c1] */
    public final void c(boolean z9) {
        int height;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long longPressTimeout;
        long j;
        long j4;
        View view = this.f21962a;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        b1 b1Var = f21961l;
        if (b1Var != null) {
            b1Var.a();
        }
        f21961l = this;
        this.f21970i = z9;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.f21979d = layoutParams;
        obj.f21980e = new Rect();
        obj.f21981f = new int[2];
        obj.f21982g = new int[2];
        obj.f21976a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        obj.f21977b = inflate;
        obj.f21978c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(c1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
        this.f21969h = obj;
        int i16 = this.f21967f;
        int i17 = this.f21968g;
        boolean z10 = this.f21970i;
        View view2 = (View) obj.f21977b;
        ViewParent parent = view2.getParent();
        Context context2 = (Context) obj.f21976a;
        if (parent != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.f21978c).setText(this.f21963b);
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.f21979d;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i16 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i17 + dimensionPixelOffset2;
            i9 = i17 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i9 = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z10) {
            i10 = R.dimen.tooltip_y_offset_touch;
        } else {
            i10 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i10);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
        if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
            Context context3 = view.getContext();
            while (true) {
                if (!(context3 instanceof ContextWrapper)) {
                    break;
                }
                if (context3 instanceof Activity) {
                    rootView = ((Activity) context3).getWindow().getDecorView();
                    break;
                }
                context3 = ((ContextWrapper) context3).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            i14 = 1;
        } else {
            Rect rect = (Rect) obj.f21980e;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context2.getResources();
                i14 = 1;
                i11 = i16;
                i12 = i9;
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i15 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i15 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i13 = 0;
                rect.set(0, i15, displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                i11 = i16;
                i12 = i9;
                i13 = 0;
                i14 = 1;
            }
            int[] iArr = (int[]) obj.f21982g;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = (int[]) obj.f21981f;
            view.getLocationOnScreen(iArr2);
            int i18 = iArr2[i13] - iArr[i13];
            iArr2[i13] = i18;
            iArr2[i14] = iArr2[i14] - iArr[i14];
            layoutParams2.x = (i18 + i11) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, i13);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i19 = iArr2[i14];
            int i20 = ((i19 + i12) - dimensionPixelOffset3) - measuredHeight;
            int i21 = i19 + height + dimensionPixelOffset3;
            if (z10) {
                if (i20 >= 0) {
                    layoutParams2.y = i20;
                } else {
                    layoutParams2.y = i21;
                }
            } else if (measuredHeight + i21 <= rect.height()) {
                layoutParams2.y = i21;
            } else {
                layoutParams2.y = i20;
            }
        }
        ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
        view.addOnAttachStateChangeListener(this);
        if (this.f21970i) {
            j4 = 2500;
        } else {
            WeakHashMap weakHashMap = P.Q.f5546a;
            if ((view.getWindowSystemUiVisibility() & 1) == i14) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j4 = j - longPressTimeout;
        }
        a1 a1Var = this.f21966e;
        view.removeCallbacks(a1Var);
        view.postDelayed(a1Var, j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.f21968g) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            p.c1 r4 = r3.f21969h
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f21970i
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f21962a
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.j = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            p.c1 r4 = r3.f21969h
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.j
            if (r1 != 0) goto L66
            int r1 = r3.f21967f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f21964c
            if (r1 > r2) goto L66
            int r1 = r3.f21968g
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f21967f = r4
            r3.f21968g = r5
            r3.j = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f21967f = view.getWidth() / 2;
        this.f21968g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
