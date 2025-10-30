package I5;

import P.H;
import P.Q;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import co.notix.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import h5.AbstractC1281a;
import java.util.List;
import java.util.WeakHashMap;
import k0.C1478a;
import l1.C1535g;
import o1.C1671f;
import s8.n;
import w5.p;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f3553a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3554b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3555c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f3556d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f3557e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f3558f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f3559g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f3560h;

    /* renamed from: i, reason: collision with root package name */
    public final i f3561i;
    public final SnackbarContentLayout j;

    /* renamed from: k, reason: collision with root package name */
    public g f3562k;

    /* renamed from: l, reason: collision with root package name */
    public final d f3563l;

    /* renamed from: m, reason: collision with root package name */
    public int f3564m;

    /* renamed from: n, reason: collision with root package name */
    public int f3565n;

    /* renamed from: o, reason: collision with root package name */
    public int f3566o;

    /* renamed from: p, reason: collision with root package name */
    public int f3567p;

    /* renamed from: q, reason: collision with root package name */
    public int f3568q;

    /* renamed from: r, reason: collision with root package name */
    public int f3569r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3570s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f3571t;

    /* renamed from: u, reason: collision with root package name */
    public final f f3572u = new f(this);

    /* renamed from: v, reason: collision with root package name */
    public static final C1478a f3548v = AbstractC1281a.f17926b;

    /* renamed from: w, reason: collision with root package name */
    public static final LinearInterpolator f3549w = AbstractC1281a.f17925a;

    /* renamed from: x, reason: collision with root package name */
    public static final C1478a f3550x = AbstractC1281a.f17928d;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f3552z = {R.attr.snackbarStyle};

    /* renamed from: A, reason: collision with root package name */
    public static final String f3547A = j.class.getSimpleName();

    /* renamed from: y, reason: collision with root package name */
    public static final Handler f3551y = new Handler(Looper.getMainLooper(), new Object());

    public j(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        int i9;
        int i10 = 0;
        this.f3563l = new d(this, i10);
        if (snackbarContentLayout != null) {
            if (snackbarContentLayout2 != null) {
                this.f3559g = viewGroup;
                this.j = snackbarContentLayout2;
                this.f3560h = context;
                p.c(context, p.f24312a, "Theme.AppCompat");
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3552z);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    i9 = R.layout.mtrl_layout_snackbar;
                } else {
                    i9 = R.layout.design_layout_snackbar;
                }
                i iVar = (i) from.inflate(i9, viewGroup, false);
                this.f3561i = iVar;
                i.a(iVar, this);
                float actionTextColorAlpha = iVar.getActionTextColorAlpha();
                if (actionTextColorAlpha != 1.0f) {
                    snackbarContentLayout.f16115b.setTextColor(n.t(n.r(snackbarContentLayout, R.attr.colorSurface), actionTextColorAlpha, snackbarContentLayout.f16115b.getCurrentTextColor()));
                }
                snackbarContentLayout.setMaxInlineActionWidth(iVar.getMaxInlineActionWidth());
                iVar.addView(snackbarContentLayout);
                WeakHashMap weakHashMap = Q.f5546a;
                iVar.setAccessibilityLiveRegion(1);
                iVar.setImportantForAccessibility(1);
                iVar.setFitsSystemWindows(true);
                H.l(iVar, new C1671f(9, this));
                Q.m(iVar, new e(i10, this));
                this.f3571t = (AccessibilityManager) context.getSystemService("accessibility");
                this.f3555c = Z0.a.y(context, R.attr.motionDurationLong2, 250);
                this.f3553a = Z0.a.y(context, R.attr.motionDurationLong2, 150);
                this.f3554b = Z0.a.y(context, R.attr.motionDurationMedium1, 75);
                this.f3556d = Z0.a.z(context, R.attr.motionEasingEmphasizedInterpolator, f3549w);
                this.f3558f = Z0.a.z(context, R.attr.motionEasingEmphasizedInterpolator, f3550x);
                this.f3557e = Z0.a.z(context, R.attr.motionEasingEmphasizedInterpolator, f3548v);
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    public final void a(int i9) {
        boolean z9;
        C1535g r5 = C1535g.r();
        f fVar = this.f3572u;
        synchronized (r5.f20182a) {
            try {
                if (r5.t(fVar)) {
                    r5.h((m) r5.f20184c, i9);
                } else {
                    m mVar = (m) r5.f20185d;
                    if (mVar != null && mVar.f3579a.get() == fVar) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        r5.h((m) r5.f20185d, i9);
                    }
                }
            } finally {
            }
        }
    }

    public final View b() {
        g gVar = this.f3562k;
        if (gVar == null) {
            return null;
        }
        return (View) gVar.f3534b.get();
    }

    public final void c() {
        C1535g r5 = C1535g.r();
        f fVar = this.f3572u;
        synchronized (r5.f20182a) {
            try {
                if (r5.t(fVar)) {
                    r5.f20184c = null;
                    if (((m) r5.f20185d) != null) {
                        r5.I();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.f3561i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f3561i);
        }
    }

    public final void d() {
        C1535g r5 = C1535g.r();
        f fVar = this.f3572u;
        synchronized (r5.f20182a) {
            try {
                if (r5.t(fVar)) {
                    r5.G((m) r5.f20184c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z9 = true;
        AccessibilityManager accessibilityManager = this.f3571t;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z9 = false;
        }
        i iVar = this.f3561i;
        if (z9) {
            iVar.post(new d(this, 2));
            return;
        }
        if (iVar.getParent() != null) {
            iVar.setVisibility(0);
        }
        d();
    }

    public final void f() {
        int i9;
        boolean z9;
        i iVar = this.f3561i;
        ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
        boolean z10 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f3547A;
        if (!z10) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (iVar.j == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (iVar.getParent() != null) {
            if (b() != null) {
                i9 = this.f3567p;
            } else {
                i9 = this.f3564m;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = iVar.j;
            int i10 = rect.bottom + i9;
            int i11 = rect.left + this.f3565n;
            int i12 = rect.right + this.f3566o;
            int i13 = rect.top;
            if (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                marginLayoutParams.bottomMargin = i10;
                marginLayoutParams.leftMargin = i11;
                marginLayoutParams.rightMargin = i12;
                marginLayoutParams.topMargin = i13;
                iVar.requestLayout();
            }
            if ((z9 || this.f3569r != this.f3568q) && Build.VERSION.SDK_INT >= 29 && this.f3568q > 0) {
                ViewGroup.LayoutParams layoutParams2 = iVar.getLayoutParams();
                if ((layoutParams2 instanceof B.f) && (((B.f) layoutParams2).f567a instanceof SwipeDismissBehavior)) {
                    d dVar = this.f3563l;
                    iVar.removeCallbacks(dVar);
                    iVar.post(dVar);
                }
            }
        }
    }
}
