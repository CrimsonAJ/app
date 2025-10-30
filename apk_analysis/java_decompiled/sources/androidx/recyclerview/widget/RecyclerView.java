package androidx.recyclerview.widget;

import A1.g;
import A3.F;
import B7.l;
import F0.A;
import F0.AbstractC0095a0;
import F0.C0;
import F0.C0094a;
import F0.C0096b;
import F0.C0099c0;
import F0.C0104h;
import F0.C0119x;
import F0.C0120y;
import F0.G;
import F0.N;
import F0.O;
import F0.P;
import F0.Q;
import F0.S;
import F0.W;
import F0.X;
import F0.Y;
import F0.Z;
import F0.d0;
import F0.e0;
import F0.f0;
import F0.g0;
import F0.h0;
import F0.i0;
import F0.j0;
import F0.k0;
import F0.n0;
import F0.o0;
import F0.p0;
import F0.q0;
import F0.r0;
import F0.t0;
import P.C0306g;
import P.C0311l;
import P.H;
import P.InterfaceC0310k;
import P.K;
import U.b;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.google.android.gms.internal.measurement.Y1;
import d1.C1101g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o1.C1671f;
import s.C1937g;
import s.C1939i;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC0310k {

    /* renamed from: a1 */
    public static boolean f10232a1 = false;

    /* renamed from: b1 */
    public static boolean f10233b1 = false;

    /* renamed from: c1 */
    public static final int[] f10234c1 = {R.attr.nestedScrollingEnabled};

    /* renamed from: d1 */
    public static final float f10235d1 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: e1 */
    public static final boolean f10236e1 = true;

    /* renamed from: f1 */
    public static final boolean f10237f1 = true;

    /* renamed from: g1 */
    public static final Class[] f10238g1;

    /* renamed from: h1 */
    public static final O f10239h1;

    /* renamed from: i1 */
    public static final o0 f10240i1;

    /* renamed from: A */
    public boolean f10241A;

    /* renamed from: A0 */
    public final float f10242A0;

    /* renamed from: B */
    public final AccessibilityManager f10243B;

    /* renamed from: B0 */
    public boolean f10244B0;

    /* renamed from: C */
    public ArrayList f10245C;

    /* renamed from: C0 */
    public final q0 f10246C0;

    /* renamed from: D */
    public boolean f10247D;

    /* renamed from: D0 */
    public A f10248D0;

    /* renamed from: E0 */
    public final C0120y f10249E0;

    /* renamed from: F0 */
    public final n0 f10250F0;

    /* renamed from: G0 */
    public e0 f10251G0;

    /* renamed from: H0 */
    public ArrayList f10252H0;

    /* renamed from: I0 */
    public boolean f10253I0;

    /* renamed from: J0 */
    public boolean f10254J0;

    /* renamed from: K0 */
    public final Q f10255K0;

    /* renamed from: L0 */
    public boolean f10256L0;

    /* renamed from: M0 */
    public t0 f10257M0;

    /* renamed from: N0 */
    public final int[] f10258N0;

    /* renamed from: O0 */
    public C0311l f10259O0;

    /* renamed from: P0 */
    public final int[] f10260P0;

    /* renamed from: Q0 */
    public final int[] f10261Q0;

    /* renamed from: R0 */
    public final int[] f10262R0;

    /* renamed from: S0 */
    public final ArrayList f10263S0;

    /* renamed from: T0 */
    public final N f10264T0;

    /* renamed from: U0 */
    public boolean f10265U0;

    /* renamed from: V0 */
    public int f10266V0;

    /* renamed from: W0 */
    public int f10267W0;

    /* renamed from: X0 */
    public final boolean f10268X0;

    /* renamed from: Y0 */
    public final P f10269Y0;

    /* renamed from: Z0 */
    public final C0306g f10270Z0;

    /* renamed from: a */
    public final float f10271a;

    /* renamed from: b */
    public final j0 f10272b;

    /* renamed from: c */
    public final h0 f10273c;

    /* renamed from: d */
    public k0 f10274d;

    /* renamed from: e */
    public final C0096b f10275e;

    /* renamed from: f */
    public final F f10276f;

    /* renamed from: f0 */
    public boolean f10277f0;

    /* renamed from: g */
    public final g f10278g;

    /* renamed from: g0 */
    public int f10279g0;

    /* renamed from: h */
    public boolean f10280h;

    /* renamed from: h0 */
    public int f10281h0;

    /* renamed from: i */
    public final N f10282i;

    /* renamed from: i0 */
    public X f10283i0;
    public final Rect j;

    /* renamed from: j0 */
    public EdgeEffect f10284j0;

    /* renamed from: k */
    public final Rect f10285k;

    /* renamed from: k0 */
    public EdgeEffect f10286k0;

    /* renamed from: l */
    public final RectF f10287l;

    /* renamed from: l0 */
    public EdgeEffect f10288l0;

    /* renamed from: m */
    public S f10289m;

    /* renamed from: m0 */
    public EdgeEffect f10290m0;

    /* renamed from: n */
    public a f10291n;

    /* renamed from: n0 */
    public Z f10292n0;

    /* renamed from: o */
    public final ArrayList f10293o;

    /* renamed from: o0 */
    public int f10294o0;

    /* renamed from: p */
    public final ArrayList f10295p;

    /* renamed from: p0 */
    public int f10296p0;

    /* renamed from: q */
    public final ArrayList f10297q;

    /* renamed from: q0 */
    public VelocityTracker f10298q0;

    /* renamed from: r */
    public C0119x f10299r;
    public int r0;

    /* renamed from: s */
    public boolean f10300s;

    /* renamed from: s0 */
    public int f10301s0;

    /* renamed from: t */
    public boolean f10302t;

    /* renamed from: t0 */
    public int f10303t0;

    /* renamed from: u */
    public boolean f10304u;

    /* renamed from: u0 */
    public int f10305u0;

    /* renamed from: v */
    public int f10306v;

    /* renamed from: v0 */
    public int f10307v0;

    /* renamed from: w */
    public boolean f10308w;

    /* renamed from: w0 */
    public d0 f10309w0;

    /* renamed from: x */
    public boolean f10310x;

    /* renamed from: x0 */
    public final int f10311x0;

    /* renamed from: y */
    public boolean f10312y;

    /* renamed from: y0 */
    public final int f10313y0;

    /* renamed from: z */
    public int f10314z;

    /* renamed from: z0 */
    public final float f10315z0;

    /* JADX WARN: Type inference failed for: r0v1, types: [F0.o0, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        f10238g1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f10239h1 = new O(0);
        f10240i1 = new Object();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, co.notix.R.attr.recyclerViewStyle);
    }

    public static RecyclerView H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            RecyclerView H8 = H(viewGroup.getChildAt(i9));
            if (H8 != null) {
                return H8;
            }
        }
        return null;
    }

    public static r0 N(View view) {
        if (view == null) {
            return null;
        }
        return ((C0099c0) view.getLayoutParams()).f2083a;
    }

    private C0311l getScrollingChildHelper() {
        if (this.f10259O0 == null) {
            this.f10259O0 = new C0311l(this);
        }
        return this.f10259O0;
    }

    public static void l(r0 r0Var) {
        WeakReference weakReference = r0Var.f2211b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != r0Var.f2210a) {
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            r0Var.f2211b = null;
        }
    }

    public static int o(int i9, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i10) {
        if (i9 > 0 && edgeEffect != null && M4.a.p(edgeEffect) != 0.0f) {
            int round = Math.round(M4.a.v(edgeEffect, ((-i9) * 4.0f) / i10, 0.5f) * ((-i10) / 4.0f));
            if (round != i9) {
                edgeEffect.finish();
            }
            return i9 - round;
        }
        if (i9 < 0 && edgeEffect2 != null && M4.a.p(edgeEffect2) != 0.0f) {
            float f9 = i10;
            int round2 = Math.round(M4.a.v(edgeEffect2, (i9 * 4.0f) / f9, 0.5f) * (f9 / 4.0f));
            if (round2 != i9) {
                edgeEffect2.finish();
            }
            return i9 - round2;
        }
        return i9;
    }

    public static void setDebugAssertionsEnabled(boolean z9) {
        f10232a1 = z9;
    }

    public static void setVerboseLoggingEnabled(boolean z9) {
        f10233b1 = z9;
    }

    public final void A() {
        if (this.f10288l0 != null) {
            return;
        }
        ((o0) this.f10283i0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f10288l0 = edgeEffect;
        if (this.f10280h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.f10286k0 != null) {
            return;
        }
        ((o0) this.f10283i0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f10286k0 = edgeEffect;
        if (this.f10280h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.f10289m + ", layout:" + this.f10291n + ", context:" + getContext();
    }

    public final void D(n0 n0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f10246C0.f2201c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            n0Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        n0Var.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View E(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.E(android.view.View):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f10297q
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            F0.x r5 = (F0.C0119x) r5
            int r6 = r5.f2280v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f2281w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f2274p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f2281w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f2271m = r6
        L55:
            r5.f(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f10299r = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.F(android.view.MotionEvent):boolean");
    }

    public final void G(int[] iArr) {
        int i9 = this.f10276f.i();
        if (i9 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < i9; i12++) {
            r0 N8 = N(this.f10276f.h(i12));
            if (!N8.p()) {
                int c3 = N8.c();
                if (c3 < i10) {
                    i10 = c3;
                }
                if (c3 > i11) {
                    i11 = c3;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final r0 I(int i9) {
        r0 r0Var = null;
        if (this.f10247D) {
            return null;
        }
        int l9 = this.f10276f.l();
        for (int i10 = 0; i10 < l9; i10++) {
            r0 N8 = N(this.f10276f.k(i10));
            if (N8 != null && !N8.i() && K(N8) == i9) {
                if (((ArrayList) this.f10276f.f53e).contains(N8.f2210a)) {
                    r0Var = N8;
                } else {
                    return N8;
                }
            }
        }
        return r0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0211, code lost:
    
        if (r1 < r14) goto L279;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean J(int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.J(int, int, int, int):boolean");
    }

    public final int K(r0 r0Var) {
        boolean z9;
        if ((r0Var.j & 524) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && r0Var.f()) {
            C0096b c0096b = this.f10275e;
            int i9 = r0Var.f2212c;
            ArrayList arrayList = (ArrayList) c0096b.f2072c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                C0094a c0094a = (C0094a) arrayList.get(i10);
                int i11 = c0094a.f2066a;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 8) {
                            int i12 = c0094a.f2067b;
                            if (i12 == i9) {
                                i9 = c0094a.f2069d;
                            } else {
                                if (i12 < i9) {
                                    i9--;
                                }
                                if (c0094a.f2069d <= i9) {
                                    i9++;
                                }
                            }
                        }
                    } else {
                        int i13 = c0094a.f2067b;
                        if (i13 <= i9) {
                            int i14 = c0094a.f2069d;
                            if (i13 + i14 <= i9) {
                                i9 -= i14;
                            } else {
                                return -1;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (c0094a.f2067b <= i9) {
                    i9 += c0094a.f2069d;
                }
            }
            return i9;
        }
        return -1;
    }

    public final long L(r0 r0Var) {
        if (this.f10289m.f2056b) {
            return r0Var.f2214e;
        }
        return r0Var.f2212c;
    }

    public final r0 M(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return N(view);
    }

    public final Rect O(View view) {
        C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
        boolean z9 = c0099c0.f2085c;
        Rect rect = c0099c0.f2084b;
        if (!z9 || (this.f10250F0.f2170g && (c0099c0.f2083a.l() || c0099c0.f2083a.g()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f10295p;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            Rect rect2 = this.j;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0095a0) arrayList.get(i9)).getClass();
            ((C0099c0) view.getLayoutParams()).f2083a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0099c0.f2085c = false;
        return rect;
    }

    public final boolean P() {
        if (this.f10304u && !this.f10247D && !this.f10275e.j()) {
            return false;
        }
        return true;
    }

    public final boolean Q() {
        if (this.f10279g0 > 0) {
            return true;
        }
        return false;
    }

    public final void R(int i9) {
        if (this.f10291n == null) {
            return;
        }
        setScrollState(2);
        this.f10291n.x0(i9);
        awakenScrollBars();
    }

    public final void S() {
        int l9 = this.f10276f.l();
        for (int i9 = 0; i9 < l9; i9++) {
            ((C0099c0) this.f10276f.k(i9).getLayoutParams()).f2085c = true;
        }
        ArrayList arrayList = this.f10273c.f2118c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0099c0 c0099c0 = (C0099c0) ((r0) arrayList.get(i10)).f2210a.getLayoutParams();
            if (c0099c0 != null) {
                c0099c0.f2085c = true;
            }
        }
    }

    public final void T(int i9, int i10, boolean z9) {
        int i11 = i9 + i10;
        int l9 = this.f10276f.l();
        for (int i12 = 0; i12 < l9; i12++) {
            r0 N8 = N(this.f10276f.k(i12));
            if (N8 != null && !N8.p()) {
                int i13 = N8.f2212c;
                n0 n0Var = this.f10250F0;
                if (i13 >= i11) {
                    if (f10233b1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i12 + " holder " + N8 + " now at position " + (N8.f2212c - i10));
                    }
                    N8.m(-i10, z9);
                    n0Var.f2169f = true;
                } else if (i13 >= i9) {
                    if (f10233b1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i12 + " holder " + N8 + " now REMOVED");
                    }
                    N8.a(8);
                    N8.m(-i10, z9);
                    N8.f2212c = i9 - 1;
                    n0Var.f2169f = true;
                }
            }
        }
        h0 h0Var = this.f10273c;
        ArrayList arrayList = h0Var.f2118c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r0 r0Var = (r0) arrayList.get(size);
            if (r0Var != null) {
                int i14 = r0Var.f2212c;
                if (i14 >= i11) {
                    if (f10233b1) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + r0Var + " now at position " + (r0Var.f2212c - i10));
                    }
                    r0Var.m(-i10, z9);
                } else if (i14 >= i9) {
                    r0Var.a(8);
                    h0Var.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void U() {
        this.f10279g0++;
    }

    public final void V(boolean z9) {
        int i9;
        AccessibilityManager accessibilityManager;
        int i10 = this.f10279g0 - 1;
        this.f10279g0 = i10;
        if (i10 < 1) {
            if (f10232a1 && i10 < 0) {
                throw new IllegalStateException(A0.a.j(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f10279g0 = 0;
            if (z9) {
                int i11 = this.f10314z;
                this.f10314z = 0;
                if (i11 != 0 && (accessibilityManager = this.f10243B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i11);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f10263S0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    r0 r0Var = (r0) arrayList.get(size);
                    if (r0Var.f2210a.getParent() == this && !r0Var.p() && (i9 = r0Var.f2225q) != -1) {
                        r0Var.f2210a.setImportantForAccessibility(i9);
                        r0Var.f2225q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void W(MotionEvent motionEvent) {
        int i9;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f10296p0) {
            if (actionIndex == 0) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            this.f10296p0 = motionEvent.getPointerId(i9);
            int x5 = (int) (motionEvent.getX(i9) + 0.5f);
            this.f10303t0 = x5;
            this.r0 = x5;
            int y9 = (int) (motionEvent.getY(i9) + 0.5f);
            this.f10305u0 = y9;
            this.f10301s0 = y9;
        }
    }

    public final void X() {
        if (!this.f10256L0 && this.f10300s) {
            WeakHashMap weakHashMap = P.Q.f5546a;
            postOnAnimation(this.f10264T0);
            this.f10256L0 = true;
        }
    }

    public final void Y() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (this.f10247D) {
            C0096b c0096b = this.f10275e;
            c0096b.q((ArrayList) c0096b.f2072c);
            c0096b.q((ArrayList) c0096b.f2073d);
            c0096b.f2070a = 0;
            if (this.f10277f0) {
                this.f10291n.e0();
            }
        }
        if (this.f10292n0 != null && this.f10291n.J0()) {
            this.f10275e.p();
        } else {
            this.f10275e.d();
        }
        if (!this.f10253I0 && !this.f10254J0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (this.f10304u && this.f10292n0 != null && (((z11 = this.f10247D) || z9 || this.f10291n.f10342f) && (!z11 || this.f10289m.f2056b))) {
            z10 = true;
        } else {
            z10 = false;
        }
        n0 n0Var = this.f10250F0;
        n0Var.j = z10;
        if (z10 && z9 && !this.f10247D && this.f10292n0 != null && this.f10291n.J0()) {
            z12 = true;
        }
        n0Var.f2173k = z12;
    }

    public final void Z(boolean z9) {
        this.f10277f0 = z9 | this.f10277f0;
        this.f10247D = true;
        int l9 = this.f10276f.l();
        for (int i9 = 0; i9 < l9; i9++) {
            r0 N8 = N(this.f10276f.k(i9));
            if (N8 != null && !N8.p()) {
                N8.a(6);
            }
        }
        S();
        h0 h0Var = this.f10273c;
        ArrayList arrayList = h0Var.f2118c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            r0 r0Var = (r0) arrayList.get(i10);
            if (r0Var != null) {
                r0Var.a(6);
                r0Var.a(1024);
            }
        }
        S s9 = h0Var.f2123h.f10289m;
        if (s9 != null && s9.f2056b) {
            return;
        }
        h0Var.f();
    }

    public final void a0(r0 r0Var, Y y9) {
        r0Var.j &= -8193;
        boolean z9 = this.f10250F0.f2171h;
        g gVar = this.f10278g;
        if (z9 && r0Var.l() && !r0Var.i() && !r0Var.p()) {
            ((C1937g) gVar.f19c).k(L(r0Var), r0Var);
        }
        C1939i c1939i = (C1939i) gVar.f18b;
        C0 c02 = (C0) c1939i.get(r0Var);
        if (c02 == null) {
            c02 = C0.a();
            c1939i.put(r0Var, c02);
        }
        c02.f2003b = y9;
        c02.f2002a |= 4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i9, int i10) {
        a aVar = this.f10291n;
        if (aVar != null) {
            aVar.getClass();
        }
        super.addFocusables(arrayList, i9, i10);
    }

    public final void b0() {
        boolean z9;
        EdgeEffect edgeEffect = this.f10284j0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z9 = this.f10284j0.isFinished();
        } else {
            z9 = false;
        }
        EdgeEffect edgeEffect2 = this.f10286k0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z9 |= this.f10286k0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f10288l0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z9 |= this.f10288l0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f10290m0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z9 |= this.f10290m0.isFinished();
        }
        if (z9) {
            postInvalidateOnAnimation();
        }
    }

    public final int c0(int i9, float f9) {
        float height = f9 / getHeight();
        float width = i9 / getWidth();
        EdgeEffect edgeEffect = this.f10284j0;
        float f10 = 0.0f;
        if (edgeEffect != null && M4.a.p(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.f10284j0.onRelease();
            } else {
                float f11 = -M4.a.v(this.f10284j0, -width, 1.0f - height);
                if (M4.a.p(this.f10284j0) == 0.0f) {
                    this.f10284j0.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.f10288l0;
            if (edgeEffect2 != null && M4.a.p(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f10288l0.onRelease();
                } else {
                    float v8 = M4.a.v(this.f10288l0, width, height);
                    if (M4.a.p(this.f10288l0) == 0.0f) {
                        this.f10288l0.onRelease();
                    }
                    f10 = v8;
                }
                invalidate();
            }
        }
        return Math.round(f10 * getWidth());
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C0099c0) && this.f10291n.g((C0099c0) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        a aVar = this.f10291n;
        if (aVar != null && aVar.e()) {
            return this.f10291n.k(this.f10250F0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        a aVar = this.f10291n;
        if (aVar != null && aVar.e()) {
            return this.f10291n.l(this.f10250F0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        a aVar = this.f10291n;
        if (aVar != null && aVar.e()) {
            return this.f10291n.m(this.f10250F0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        a aVar = this.f10291n;
        if (aVar != null && aVar.f()) {
            return this.f10291n.n(this.f10250F0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        a aVar = this.f10291n;
        if (aVar != null && aVar.f()) {
            return this.f10291n.o(this.f10250F0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        a aVar = this.f10291n;
        if (aVar != null && aVar.f()) {
            return this.f10291n.p(this.f10250F0);
        }
        return 0;
    }

    public final int d0(int i9, float f9) {
        float width = f9 / getWidth();
        float height = i9 / getHeight();
        EdgeEffect edgeEffect = this.f10286k0;
        float f10 = 0.0f;
        if (edgeEffect != null && M4.a.p(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.f10286k0.onRelease();
            } else {
                float f11 = -M4.a.v(this.f10286k0, -height, width);
                if (M4.a.p(this.f10286k0) == 0.0f) {
                    this.f10286k0.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.f10290m0;
            if (edgeEffect2 != null && M4.a.p(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f10290m0.onRelease();
                } else {
                    float v8 = M4.a.v(this.f10290m0, height, 1.0f - width);
                    if (M4.a.p(this.f10290m0) == 0.0f) {
                        this.f10290m0.onRelease();
                    }
                    f10 = v8;
                }
                invalidate();
            }
        }
        return Math.round(f10 * getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        a layoutManager = getLayoutManager();
        int i9 = 0;
        if (layoutManager != null) {
            if (layoutManager.f()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 92 && keyCode != 93) {
                    if (keyCode == 122 || keyCode == 123) {
                        boolean Q7 = layoutManager.Q();
                        if (keyCode == 122) {
                            if (Q7) {
                                i9 = getAdapter().a();
                            }
                        } else if (!Q7) {
                            i9 = getAdapter().a();
                        }
                        k0(i9);
                        return true;
                    }
                } else {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        j0(0, measuredHeight, false);
                        return true;
                    }
                    j0(0, -measuredHeight, false);
                    return true;
                }
            } else if (layoutManager.e()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 != 92 && keyCode2 != 93) {
                    if (keyCode2 == 122 || keyCode2 == 123) {
                        boolean Q8 = layoutManager.Q();
                        if (keyCode2 == 122) {
                            if (Q8) {
                                i9 = getAdapter().a();
                            }
                        } else if (!Q8) {
                            i9 = getAdapter().a();
                        }
                        k0(i9);
                        return true;
                    }
                } else {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        j0(measuredWidth, 0, false);
                        return true;
                    }
                    j0(-measuredWidth, 0, false);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f9, float f10, boolean z9) {
        return getScrollingChildHelper().a(f9, f10, z9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f9, float f10) {
        return getScrollingChildHelper().b(f9, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i9, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i9, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z9;
        int i9;
        boolean z10;
        boolean z11;
        int i10;
        super.draw(canvas);
        ArrayList arrayList = this.f10295p;
        int size = arrayList.size();
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            ((AbstractC0095a0) arrayList.get(i11)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f10284j0;
        boolean z13 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f10280h) {
                i10 = getPaddingBottom();
            } else {
                i10 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i10, 0.0f);
            EdgeEffect edgeEffect2 = this.f10284j0;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z9 = true;
            } else {
                z9 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z9 = false;
        }
        EdgeEffect edgeEffect3 = this.f10286k0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f10280h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f10286k0;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z9 |= z11;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f10288l0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f10280h) {
                i9 = getPaddingTop();
            } else {
                i9 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i9, -width);
            EdgeEffect edgeEffect6 = this.f10288l0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            z9 |= z10;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f10290m0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f10280h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f10290m0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z12 = true;
            }
            z9 |= z12;
            canvas.restoreToCount(save4);
        }
        if (z9 || this.f10292n0 == null || arrayList.size() <= 0 || !this.f10292n0.f()) {
            z13 = z9;
        }
        if (z13) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(View view, View view2) {
        View view3;
        boolean z9;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0099c0) {
            C0099c0 c0099c0 = (C0099c0) layoutParams;
            if (!c0099c0.f2085c) {
                int i9 = rect.left;
                Rect rect2 = c0099c0.f2084b;
                rect.left = i9 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        a aVar = this.f10291n;
        boolean z10 = !this.f10304u;
        if (view2 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        aVar.u0(this, view, this.j, z10, z9);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.f0(int, int, android.view.MotionEvent, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0183, code lost:
    
        if (r5 < 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018b, code lost:
    
        if ((r5 * r6) <= 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0193, code lost:
    
        if ((r5 * r6) >= 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0164, code lost:
    
        if (r7 > 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017d, code lost:
    
        if (r5 > 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0180, code lost:
    
        if (r7 < 0) goto L276;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(int i9, int i10, int[] iArr) {
        int i11;
        int i12;
        r0 r0Var;
        l0();
        U();
        Trace.beginSection("RV Scroll");
        n0 n0Var = this.f10250F0;
        D(n0Var);
        h0 h0Var = this.f10273c;
        if (i9 != 0) {
            i11 = this.f10291n.w0(i9, h0Var, n0Var);
        } else {
            i11 = 0;
        }
        if (i10 != 0) {
            i12 = this.f10291n.y0(i10, h0Var, n0Var);
        } else {
            i12 = 0;
        }
        Trace.endSection();
        int i13 = this.f10276f.i();
        for (int i14 = 0; i14 < i13; i14++) {
            View h7 = this.f10276f.h(i14);
            r0 M7 = M(h7);
            if (M7 != null && (r0Var = M7.f2218i) != null) {
                int left = h7.getLeft();
                int top = h7.getTop();
                View view = r0Var.f2210a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        V(true);
        n0(false);
        if (iArr != null) {
            iArr[0] = i11;
            iArr[1] = i12;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = this.f10291n;
        if (aVar != null) {
            return aVar.s();
        }
        throw new IllegalStateException(A0.a.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        a aVar = this.f10291n;
        if (aVar != null) {
            return aVar.t(getContext(), attributeSet);
        }
        throw new IllegalStateException(A0.a.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public S getAdapter() {
        return this.f10289m;
    }

    @Override // android.view.View
    public int getBaseline() {
        a aVar = this.f10291n;
        if (aVar != null) {
            aVar.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i9, int i10) {
        return super.getChildDrawingOrder(i9, i10);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f10280h;
    }

    public t0 getCompatAccessibilityDelegate() {
        return this.f10257M0;
    }

    public X getEdgeEffectFactory() {
        return this.f10283i0;
    }

    public Z getItemAnimator() {
        return this.f10292n0;
    }

    public int getItemDecorationCount() {
        return this.f10295p.size();
    }

    public a getLayoutManager() {
        return this.f10291n;
    }

    public int getMaxFlingVelocity() {
        return this.f10313y0;
    }

    public int getMinFlingVelocity() {
        return this.f10311x0;
    }

    public long getNanoTime() {
        if (f10237f1) {
            return System.nanoTime();
        }
        return 0L;
    }

    public d0 getOnFlingListener() {
        return this.f10309w0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f10244B0;
    }

    public g0 getRecycledViewPool() {
        return this.f10273c.c();
    }

    public int getScrollState() {
        return this.f10294o0;
    }

    public final void h(r0 r0Var) {
        boolean z9;
        View view = r0Var.f2210a;
        if (view.getParent() == this) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f10273c.l(M(view));
        if (r0Var.k()) {
            this.f10276f.e(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z9) {
            this.f10276f.d(view, -1, true);
            return;
        }
        F f9 = this.f10276f;
        int indexOfChild = ((RecyclerView) ((C1671f) f9.f51c).f21473b).indexOfChild(view);
        if (indexOfChild >= 0) {
            ((C0104h) f9.f52d).M(indexOfChild);
            f9.m(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0(int i9) {
        if (this.f10310x) {
            return;
        }
        p0();
        a aVar = this.f10291n;
        if (aVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            aVar.x0(i9);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(AbstractC0095a0 abstractC0095a0) {
        a aVar = this.f10291n;
        if (aVar != null) {
            aVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f10295p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0095a0);
        S();
        requestLayout();
    }

    public final boolean i0(EdgeEffect edgeEffect, int i9, int i10) {
        if (i9 <= 0) {
            float p9 = M4.a.p(edgeEffect) * i10;
            float abs = Math.abs(-i9) * 0.35f;
            float f9 = this.f10271a * 0.015f;
            double log = Math.log(abs / f9);
            double d9 = f10235d1;
            if (((float) (Math.exp((d9 / (d9 - 1.0d)) * log) * f9)) < p9) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f10300s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f10310x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f5617d;
    }

    public final void j(e0 e0Var) {
        if (this.f10252H0 == null) {
            this.f10252H0 = new ArrayList();
        }
        this.f10252H0.add(e0Var);
    }

    public final void j0(int i9, int i10, boolean z9) {
        a aVar = this.f10291n;
        if (aVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.f10310x) {
            int i11 = 0;
            if (!aVar.e()) {
                i9 = 0;
            }
            if (!this.f10291n.f()) {
                i10 = 0;
            }
            if (i9 == 0 && i10 == 0) {
                return;
            }
            if (z9) {
                if (i9 != 0) {
                    i11 = 1;
                }
                if (i10 != 0) {
                    i11 |= 2;
                }
                getScrollingChildHelper().g(i11, 1);
            }
            this.f10246C0.c(i9, i10, Integer.MIN_VALUE, null);
        }
    }

    public final void k(String str) {
        if (Q()) {
            if (str == null) {
                throw new IllegalStateException(A0.a.j(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        }
        if (this.f10281h0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(A0.a.j(this, new StringBuilder(""))));
        }
    }

    public final void k0(int i9) {
        if (this.f10310x) {
            return;
        }
        a aVar = this.f10291n;
        if (aVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            aVar.H0(this, i9);
        }
    }

    public final void l0() {
        int i9 = this.f10306v + 1;
        this.f10306v = i9;
        if (i9 == 1 && !this.f10310x) {
            this.f10308w = false;
        }
    }

    public final void m() {
        int l9 = this.f10276f.l();
        for (int i9 = 0; i9 < l9; i9++) {
            r0 N8 = N(this.f10276f.k(i9));
            if (!N8.p()) {
                N8.f2213d = -1;
                N8.f2216g = -1;
            }
        }
        h0 h0Var = this.f10273c;
        ArrayList arrayList = h0Var.f2118c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            r0 r0Var = (r0) arrayList.get(i10);
            r0Var.f2213d = -1;
            r0Var.f2216g = -1;
        }
        ArrayList arrayList2 = h0Var.f2116a;
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            r0 r0Var2 = (r0) arrayList2.get(i11);
            r0Var2.f2213d = -1;
            r0Var2.f2216g = -1;
        }
        ArrayList arrayList3 = h0Var.f2117b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                r0 r0Var3 = (r0) h0Var.f2117b.get(i12);
                r0Var3.f2213d = -1;
                r0Var3.f2216g = -1;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0(int i9) {
        boolean e8 = this.f10291n.e();
        int i10 = e8;
        if (this.f10291n.f()) {
            i10 = (e8 ? 1 : 0) | 2;
        }
        getScrollingChildHelper().g(i10, i9);
    }

    public final void n(int i9, int i10) {
        boolean z9;
        EdgeEffect edgeEffect = this.f10284j0;
        if (edgeEffect != null && !edgeEffect.isFinished() && i9 > 0) {
            this.f10284j0.onRelease();
            z9 = this.f10284j0.isFinished();
        } else {
            z9 = false;
        }
        EdgeEffect edgeEffect2 = this.f10288l0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i9 < 0) {
            this.f10288l0.onRelease();
            z9 |= this.f10288l0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f10286k0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.f10286k0.onRelease();
            z9 |= this.f10286k0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f10290m0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.f10290m0.onRelease();
            z9 |= this.f10290m0.isFinished();
        }
        if (z9) {
            postInvalidateOnAnimation();
        }
    }

    public final void n0(boolean z9) {
        if (this.f10306v < 1) {
            if (!f10232a1) {
                this.f10306v = 1;
            } else {
                throw new IllegalStateException(A0.a.j(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z9 && !this.f10310x) {
            this.f10308w = false;
        }
        if (this.f10306v == 1) {
            if (z9 && this.f10308w && !this.f10310x && this.f10291n != null && this.f10289m != null) {
                s();
            }
            if (!this.f10310x) {
                this.f10308w = false;
            }
        }
        this.f10306v--;
    }

    public final void o0(int i9) {
        getScrollingChildHelper().h(i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1 >= 30.0f) goto L55;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f10279g0 = r0
            r1 = 1
            r5.f10300s = r1
            boolean r2 = r5.f10304u
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f10304u = r2
            F0.h0 r2 = r5.f10273c
            r2.d()
            androidx.recyclerview.widget.a r2 = r5.f10291n
            if (r2 == 0) goto L26
            r2.f10343g = r1
            r2.W(r5)
        L26:
            r5.f10256L0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f10237f1
            if (r0 == 0) goto L83
            java.lang.ThreadLocal r0 = F0.A.f1979e
            java.lang.Object r1 = r0.get()
            F0.A r1 = (F0.A) r1
            r5.f10248D0 = r1
            if (r1 != 0) goto L66
            F0.A r1 = new F0.A
            r1.<init>()
            r5.f10248D0 = r1
            java.util.WeakHashMap r1 = P.Q.f5546a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L58
            if (r1 == 0) goto L58
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L58
            goto L5a
        L58:
            r1 = 1114636288(0x42700000, float:60.0)
        L5a:
            F0.A r2 = r5.f10248D0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f1983c = r3
            r0.set(r2)
        L66:
            F0.A r0 = r5.f10248D0
            r0.getClass()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.f10232a1
            java.util.ArrayList r0 = r0.f1981a
            if (r1 == 0) goto L80
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L78
            goto L80
        L78:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L80:
            r0.add(r5)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        h0 h0Var;
        A a5;
        super.onDetachedFromWindow();
        Z z9 = this.f10292n0;
        if (z9 != null) {
            z9.e();
        }
        p0();
        int i9 = 0;
        this.f10300s = false;
        a aVar = this.f10291n;
        if (aVar != null) {
            aVar.f10343g = false;
            aVar.X(this);
        }
        this.f10263S0.clear();
        removeCallbacks(this.f10264T0);
        this.f10278g.getClass();
        do {
        } while (C0.f2001d.a() != null);
        int i10 = 0;
        while (true) {
            h0Var = this.f10273c;
            ArrayList arrayList = h0Var.f2118c;
            if (i10 >= arrayList.size()) {
                break;
            }
            Y1.c(((r0) arrayList.get(i10)).f2210a);
            i10++;
        }
        h0Var.e(h0Var.f2123h.f10289m, false);
        while (i9 < getChildCount()) {
            int i11 = i9 + 1;
            View childAt = getChildAt(i9);
            if (childAt != null) {
                T.a aVar2 = (T.a) childAt.getTag(co.notix.R.id.pooling_container_listener_holder_tag);
                if (aVar2 == null) {
                    aVar2 = new T.a();
                    childAt.setTag(co.notix.R.id.pooling_container_listener_holder_tag, aVar2);
                }
                ArrayList arrayList2 = aVar2.f6966a;
                int a02 = l.a0(arrayList2);
                if (-1 >= a02) {
                    i9 = i11;
                } else {
                    arrayList2.get(a02).getClass();
                    throw new ClassCastException();
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        if (f10237f1 && (a5 = this.f10248D0) != null) {
            boolean remove = a5.f1981a.remove(this);
            if (f10232a1 && !remove) {
                throw new IllegalStateException("RecyclerView removal failed!");
            }
            this.f10248D0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f10295p;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((AbstractC0095a0) arrayList.get(i9)).a(this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f9;
        int i9;
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        if (this.f10291n != null && !this.f10310x && motionEvent.getAction() == 8) {
            float f11 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f10291n.f()) {
                    f10 = -motionEvent.getAxisValue(9);
                } else {
                    f10 = 0.0f;
                }
                if (this.f10291n.e()) {
                    f11 = motionEvent.getAxisValue(10);
                }
                f9 = f11;
                i9 = 0;
                z9 = false;
                f11 = f10;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                f9 = motionEvent.getAxisValue(26);
                if (this.f10291n.f()) {
                    float f12 = -f9;
                    f9 = 0.0f;
                    f11 = f12;
                } else if (!this.f10291n.e()) {
                    f9 = 0.0f;
                }
                i9 = 26;
                z9 = this.f10268X0;
            } else {
                f9 = 0.0f;
                i9 = 0;
                z9 = false;
            }
            int i15 = (int) (f11 * this.f10242A0);
            int i16 = (int) (f9 * this.f10315z0);
            if (z9) {
                OverScroller overScroller = this.f10246C0.f2201c;
                j0((overScroller.getFinalX() - overScroller.getCurrX()) + i16, (overScroller.getFinalY() - overScroller.getCurrY()) + i15, true);
            } else {
                a aVar = this.f10291n;
                if (aVar == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f10310x) {
                    int[] iArr = this.f10262R0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean e8 = aVar.e();
                    boolean f13 = this.f10291n.f();
                    if (f13) {
                        i10 = (e8 ? 1 : 0) | 2;
                    } else {
                        i10 = e8 ? 1 : 0;
                    }
                    float y9 = motionEvent.getY();
                    float x5 = motionEvent.getX();
                    int c02 = i16 - c0(i16, y9);
                    int d02 = i15 - d0(i15, x5);
                    getScrollingChildHelper().g(i10, 1);
                    if (e8) {
                        i11 = c02;
                    } else {
                        i11 = 0;
                    }
                    if (f13) {
                        i12 = d02;
                    } else {
                        i12 = 0;
                    }
                    if (v(i11, i12, 1, this.f10262R0, this.f10260P0)) {
                        c02 -= iArr[0];
                        d02 -= iArr[1];
                    }
                    if (e8) {
                        i13 = c02;
                    } else {
                        i13 = 0;
                    }
                    if (f13) {
                        i14 = d02;
                    } else {
                        i14 = 0;
                    }
                    f0(i13, i14, motionEvent, 1);
                    A a5 = this.f10248D0;
                    if (a5 != null && (c02 != 0 || d02 != 0)) {
                        a5.a(this, c02, d02);
                    }
                    o0(1);
                }
            }
            if (i9 != 0 && !z9) {
                this.f10270Z0.a(motionEvent, i9);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        if (!this.f10310x) {
            this.f10299r = null;
            if (F(motionEvent)) {
                VelocityTracker velocityTracker = this.f10298q0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                o0(0);
                b0();
                setScrollState(0);
                return true;
            }
            a aVar = this.f10291n;
            if (aVar != null) {
                boolean e8 = aVar.e();
                boolean f9 = this.f10291n.f();
                if (this.f10298q0 == null) {
                    this.f10298q0 = VelocityTracker.obtain();
                }
                this.f10298q0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked != 5) {
                                    if (actionMasked == 6) {
                                        W(motionEvent);
                                    }
                                } else {
                                    this.f10296p0 = motionEvent.getPointerId(actionIndex);
                                    int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                                    this.f10303t0 = x5;
                                    this.r0 = x5;
                                    int y9 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                                    this.f10305u0 = y9;
                                    this.f10301s0 = y9;
                                }
                            } else {
                                VelocityTracker velocityTracker2 = this.f10298q0;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                                o0(0);
                                b0();
                                setScrollState(0);
                            }
                        } else {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f10296p0);
                            if (findPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f10296p0 + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            int x9 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                            int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                            if (this.f10294o0 != 1) {
                                int i9 = x9 - this.r0;
                                int i10 = y10 - this.f10301s0;
                                if (e8 && Math.abs(i9) > this.f10307v0) {
                                    this.f10303t0 = x9;
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (f9 && Math.abs(i10) > this.f10307v0) {
                                    this.f10305u0 = y10;
                                    z10 = true;
                                }
                                if (z10) {
                                    setScrollState(1);
                                }
                            }
                        }
                    } else {
                        this.f10298q0.clear();
                        o0(0);
                    }
                } else {
                    if (this.f10312y) {
                        this.f10312y = false;
                    }
                    this.f10296p0 = motionEvent.getPointerId(0);
                    int x10 = (int) (motionEvent.getX() + 0.5f);
                    this.f10303t0 = x10;
                    this.r0 = x10;
                    int y11 = (int) (motionEvent.getY() + 0.5f);
                    this.f10305u0 = y11;
                    this.f10301s0 = y11;
                    EdgeEffect edgeEffect = this.f10284j0;
                    if (edgeEffect != null && M4.a.p(edgeEffect) != 0.0f && !canScrollHorizontally(-1)) {
                        M4.a.v(this.f10284j0, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    EdgeEffect edgeEffect2 = this.f10288l0;
                    if (edgeEffect2 != null && M4.a.p(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        M4.a.v(this.f10288l0, 0.0f, motionEvent.getY() / getHeight());
                        z9 = true;
                    }
                    EdgeEffect edgeEffect3 = this.f10286k0;
                    if (edgeEffect3 != null && M4.a.p(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        M4.a.v(this.f10286k0, 0.0f, motionEvent.getX() / getWidth());
                        z9 = true;
                    }
                    EdgeEffect edgeEffect4 = this.f10290m0;
                    if (edgeEffect4 != null && M4.a.p(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        M4.a.v(this.f10290m0, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z9 = true;
                    }
                    if (z9 || this.f10294o0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        o0(1);
                    }
                    int[] iArr = this.f10261Q0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    m0(0);
                }
                if (this.f10294o0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        Trace.beginSection("RV OnLayout");
        s();
        Trace.endSection();
        this.f10304u = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        a aVar = this.f10291n;
        if (aVar == null) {
            q(i9, i10);
            return;
        }
        boolean P8 = aVar.P();
        boolean z9 = false;
        n0 n0Var = this.f10250F0;
        if (P8) {
            int mode = View.MeasureSpec.getMode(i9);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.f10291n.f10338b.q(i9, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z9 = true;
            }
            this.f10265U0 = z9;
            if (!z9 && this.f10289m != null) {
                if (n0Var.f2167d == 1) {
                    t();
                }
                this.f10291n.A0(i9, i10);
                n0Var.f2172i = true;
                u();
                this.f10291n.C0(i9, i10);
                if (this.f10291n.F0()) {
                    this.f10291n.A0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    n0Var.f2172i = true;
                    u();
                    this.f10291n.C0(i9, i10);
                }
                this.f10266V0 = getMeasuredWidth();
                this.f10267W0 = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.f10302t) {
            this.f10291n.f10338b.q(i9, i10);
            return;
        }
        if (this.f10241A) {
            l0();
            U();
            Y();
            V(true);
            if (n0Var.f2173k) {
                n0Var.f2170g = true;
            } else {
                this.f10275e.d();
                n0Var.f2170g = false;
            }
            this.f10241A = false;
            n0(false);
        } else if (n0Var.f2173k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        S s9 = this.f10289m;
        if (s9 != null) {
            n0Var.f2168e = s9.a();
        } else {
            n0Var.f2168e = 0;
        }
        l0();
        this.f10291n.f10338b.q(i9, i10);
        n0(false);
        n0Var.f2170g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i9, Rect rect) {
        if (Q()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i9, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k0 k0Var = (k0) parcelable;
        this.f10274d = k0Var;
        super.onRestoreInstanceState(k0Var.f7246a);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, U.b, F0.k0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new b(super.onSaveInstanceState());
        k0 k0Var = this.f10274d;
        if (k0Var != null) {
            bVar.f2140c = k0Var.f2140c;
            return bVar;
        }
        a aVar = this.f10291n;
        if (aVar != null) {
            bVar.f2140c = aVar.m0();
            return bVar;
        }
        bVar.f2140c = null;
        return bVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 == i11 && i10 == i12) {
            return;
        }
        this.f10290m0 = null;
        this.f10286k0 = null;
        this.f10288l0 = null;
        this.f10284j0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0224  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (this.f10304u && !this.f10247D) {
            if (this.f10275e.j()) {
                C0096b c0096b = this.f10275e;
                int i9 = c0096b.f2070a;
                if ((i9 & 4) != 0 && (i9 & 11) == 0) {
                    Trace.beginSection("RV PartialInvalidate");
                    l0();
                    U();
                    this.f10275e.p();
                    if (!this.f10308w) {
                        int i10 = this.f10276f.i();
                        int i11 = 0;
                        while (true) {
                            if (i11 < i10) {
                                r0 N8 = N(this.f10276f.h(i11));
                                if (N8 != null && !N8.p() && N8.l()) {
                                    s();
                                    break;
                                }
                                i11++;
                            } else {
                                this.f10275e.c();
                                break;
                            }
                        }
                    }
                    n0(true);
                    V(true);
                    Trace.endSection();
                    return;
                }
                if (c0096b.j()) {
                    Trace.beginSection("RV FullInvalidate");
                    s();
                    Trace.endSection();
                    return;
                }
                return;
            }
            return;
        }
        Trace.beginSection("RV FullInvalidate");
        s();
        Trace.endSection();
    }

    public final void p0() {
        G g9;
        setScrollState(0);
        q0 q0Var = this.f10246C0;
        q0Var.f2205g.removeCallbacks(q0Var);
        q0Var.f2201c.abortAnimation();
        a aVar = this.f10291n;
        if (aVar != null && (g9 = aVar.f10341e) != null) {
            g9.i();
        }
    }

    public final void q(int i9, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = P.Q.f5546a;
        setMeasuredDimension(a.h(i9, paddingRight, getMinimumWidth()), a.h(i10, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void r(View view) {
        N(view);
        ArrayList arrayList = this.f10245C;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C1101g) this.f10245C.get(size)).getClass();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z9) {
        r0 N8 = N(view);
        if (N8 != null) {
            if (N8.k()) {
                N8.j &= -257;
            } else if (!N8.p()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(N8);
                throw new IllegalArgumentException(A0.a.j(this, sb));
            }
        } else if (f10232a1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(A0.a.j(this, sb2));
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        G g9 = this.f10291n.f10341e;
        if ((g9 == null || !g9.f2027e) && !Q() && view2 != null) {
            e0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        return this.f10291n.u0(this, view, rect, z9, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        ArrayList arrayList = this.f10297q;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((C0119x) arrayList.get(i9)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f10306v == 0 && !this.f10310x) {
            super.requestLayout();
        } else {
            this.f10308w = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0348, code lost:
    
        if (((java.util.ArrayList) r21.f10276f.f53e).contains(getFocusedChild()) == false) goto L478;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03f4  */
    /* JADX WARN: Type inference failed for: r13v7, types: [F0.Y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r9v0, types: [A1.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s():void");
    }

    @Override // android.view.View
    public final void scrollBy(int i9, int i10) {
        a aVar = this.f10291n;
        if (aVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (!this.f10310x) {
            boolean e8 = aVar.e();
            boolean f9 = this.f10291n.f();
            if (!e8 && !f9) {
                return;
            }
            if (!e8) {
                i9 = 0;
            }
            if (!f9) {
                i10 = 0;
            }
            f0(i9, i10, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i9, int i10) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i9;
        if (Q()) {
            int i10 = 0;
            if (accessibilityEvent != null) {
                i9 = accessibilityEvent.getContentChangeTypes();
            } else {
                i9 = 0;
            }
            if (i9 != 0) {
                i10 = i9;
            }
            this.f10314z |= i10;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(t0 t0Var) {
        this.f10257M0 = t0Var;
        P.Q.m(this, t0Var);
    }

    public void setAdapter(S s9) {
        setLayoutFrozen(false);
        S s10 = this.f10289m;
        j0 j0Var = this.f10272b;
        if (s10 != null) {
            s10.f2055a.unregisterObserver(j0Var);
            this.f10289m.i(this);
        }
        Z z9 = this.f10292n0;
        if (z9 != null) {
            z9.e();
        }
        a aVar = this.f10291n;
        h0 h0Var = this.f10273c;
        if (aVar != null) {
            aVar.r0(h0Var);
            this.f10291n.s0(h0Var);
        }
        h0Var.f2116a.clear();
        h0Var.f();
        C0096b c0096b = this.f10275e;
        c0096b.q((ArrayList) c0096b.f2072c);
        c0096b.q((ArrayList) c0096b.f2073d);
        c0096b.f2070a = 0;
        S s11 = this.f10289m;
        this.f10289m = s9;
        if (s9 != null) {
            s9.m(j0Var);
            s9.f(this);
        }
        a aVar2 = this.f10291n;
        if (aVar2 != null) {
            aVar2.V();
        }
        S s12 = this.f10289m;
        h0Var.f2116a.clear();
        h0Var.f();
        h0Var.e(s11, true);
        g0 c3 = h0Var.c();
        if (s11 != null) {
            c3.f2111b--;
        }
        if (c3.f2111b == 0) {
            int i9 = 0;
            while (true) {
                SparseArray sparseArray = c3.f2110a;
                if (i9 >= sparseArray.size()) {
                    break;
                }
                f0 f0Var = (f0) sparseArray.valueAt(i9);
                ArrayList arrayList = f0Var.f2102a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    Y1.c(((r0) obj).f2210a);
                }
                f0Var.f2102a.clear();
                i9++;
            }
        }
        if (s12 != null) {
            c3.f2111b++;
        }
        h0Var.d();
        this.f10250F0.f2169f = true;
        Z(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(W w7) {
        if (w7 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z9) {
        if (z9 != this.f10280h) {
            this.f10290m0 = null;
            this.f10286k0 = null;
            this.f10288l0 = null;
            this.f10284j0 = null;
        }
        this.f10280h = z9;
        super.setClipToPadding(z9);
        if (this.f10304u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(X x5) {
        x5.getClass();
        this.f10283i0 = x5;
        this.f10290m0 = null;
        this.f10286k0 = null;
        this.f10288l0 = null;
        this.f10284j0 = null;
    }

    public void setHasFixedSize(boolean z9) {
        this.f10302t = z9;
    }

    public void setItemAnimator(Z z9) {
        Z z10 = this.f10292n0;
        if (z10 != null) {
            z10.e();
            this.f10292n0.f2060a = null;
        }
        this.f10292n0 = z9;
        if (z9 != null) {
            z9.f2060a = this.f10255K0;
        }
    }

    public void setItemViewCacheSize(int i9) {
        h0 h0Var = this.f10273c;
        h0Var.f2120e = i9;
        h0Var.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z9) {
        suppressLayout(z9);
    }

    public void setLayoutManager(a aVar) {
        RecyclerView recyclerView;
        if (aVar == this.f10291n) {
            return;
        }
        p0();
        a aVar2 = this.f10291n;
        h0 h0Var = this.f10273c;
        if (aVar2 != null) {
            Z z9 = this.f10292n0;
            if (z9 != null) {
                z9.e();
            }
            this.f10291n.r0(h0Var);
            this.f10291n.s0(h0Var);
            h0Var.f2116a.clear();
            h0Var.f();
            if (this.f10300s) {
                a aVar3 = this.f10291n;
                aVar3.f10343g = false;
                aVar3.X(this);
            }
            this.f10291n.D0(null);
            this.f10291n = null;
        } else {
            h0Var.f2116a.clear();
            h0Var.f();
        }
        F f9 = this.f10276f;
        ((C0104h) f9.f52d).L();
        ArrayList arrayList = (ArrayList) f9.f53e;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) ((C1671f) f9.f51c).f21473b;
            if (size < 0) {
                break;
            }
            r0 N8 = N((View) arrayList.get(size));
            if (N8 != null) {
                int i9 = N8.f2224p;
                if (recyclerView.Q()) {
                    N8.f2225q = i9;
                    recyclerView.f10263S0.add(N8);
                } else {
                    N8.f2210a.setImportantForAccessibility(i9);
                }
                N8.f2224p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f10291n = aVar;
        if (aVar != null) {
            if (aVar.f10338b == null) {
                aVar.D0(this);
                if (this.f10300s) {
                    a aVar4 = this.f10291n;
                    aVar4.f10343g = true;
                    aVar4.W(this);
                }
            } else {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(aVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(A0.a.j(aVar.f10338b, sb));
            }
        }
        h0Var.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z9) {
        C0311l scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f5617d) {
            WeakHashMap weakHashMap = P.Q.f5546a;
            H.m(scrollingChildHelper.f5616c);
        }
        scrollingChildHelper.f5617d = z9;
    }

    public void setOnFlingListener(d0 d0Var) {
        this.f10309w0 = d0Var;
    }

    @Deprecated
    public void setOnScrollListener(e0 e0Var) {
        this.f10251G0 = e0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z9) {
        this.f10244B0 = z9;
    }

    public void setRecycledViewPool(g0 g0Var) {
        h0 h0Var = this.f10273c;
        RecyclerView recyclerView = h0Var.f2123h;
        h0Var.e(recyclerView.f10289m, false);
        if (h0Var.f2122g != null) {
            r2.f2111b--;
        }
        h0Var.f2122g = g0Var;
        if (g0Var != null && recyclerView.getAdapter() != null) {
            h0Var.f2122g.f2111b++;
        }
        h0Var.d();
    }

    public void setScrollState(int i9) {
        G g9;
        if (i9 != this.f10294o0) {
            if (f10233b1) {
                StringBuilder p9 = A0.a.p("setting scroll state to ", i9, " from ");
                p9.append(this.f10294o0);
                Log.d("RecyclerView", p9.toString(), new Exception());
            }
            this.f10294o0 = i9;
            if (i9 != 2) {
                q0 q0Var = this.f10246C0;
                q0Var.f2205g.removeCallbacks(q0Var);
                q0Var.f2201c.abortAnimation();
                a aVar = this.f10291n;
                if (aVar != null && (g9 = aVar.f10341e) != null) {
                    g9.i();
                }
            }
            a aVar2 = this.f10291n;
            if (aVar2 != null) {
                aVar2.n0(i9);
            }
            e0 e0Var = this.f10251G0;
            if (e0Var != null) {
                e0Var.a(this, i9);
            }
            ArrayList arrayList = this.f10252H0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((e0) this.f10252H0.get(size)).a(this, i9);
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i9) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i9 != 0) {
            if (i9 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i9 + "; using default value");
            } else {
                this.f10307v0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f10307v0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(p0 p0Var) {
        this.f10273c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i9) {
        return getScrollingChildHelper().g(i9, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z9) {
        if (z9 != this.f10310x) {
            k("Do not suppressLayout in layout or scroll");
            if (!z9) {
                this.f10310x = false;
                if (this.f10308w && this.f10291n != null && this.f10289m != null) {
                    requestLayout();
                }
                this.f10308w = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f10310x = true;
            this.f10312y = true;
            p0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x007e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v5, types: [F0.Y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11, types: [F0.Y, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.t():void");
    }

    public final void u() {
        boolean z9;
        l0();
        U();
        n0 n0Var = this.f10250F0;
        n0Var.a(6);
        this.f10275e.d();
        n0Var.f2168e = this.f10289m.a();
        n0Var.f2166c = 0;
        if (this.f10274d != null) {
            S s9 = this.f10289m;
            int b9 = AbstractC2128h.b(s9.f2057c);
            if (b9 == 1 ? s9.a() > 0 : b9 != 2) {
                Parcelable parcelable = this.f10274d.f2140c;
                if (parcelable != null) {
                    this.f10291n.l0(parcelable);
                }
                this.f10274d = null;
            }
        }
        n0Var.f2170g = false;
        this.f10291n.j0(this.f10273c, n0Var);
        n0Var.f2169f = false;
        if (n0Var.j && this.f10292n0 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        n0Var.j = z9;
        n0Var.f2167d = 4;
        V(true);
        n0(false);
    }

    public final boolean v(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i9, i10, i11, iArr, iArr2);
    }

    public final void w(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().d(i9, i10, i11, i12, iArr, i13, iArr2);
    }

    public final void x(int i9, int i10) {
        this.f10281h0++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i9, scrollY - i10);
        e0 e0Var = this.f10251G0;
        if (e0Var != null) {
            e0Var.b(this, i9, i10);
        }
        ArrayList arrayList = this.f10252H0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((e0) this.f10252H0.get(size)).b(this, i9, i10);
            }
        }
        this.f10281h0--;
    }

    public final void y() {
        if (this.f10290m0 != null) {
            return;
        }
        ((o0) this.f10283i0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f10290m0 = edgeEffect;
        if (this.f10280h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.f10284j0 != null) {
            return;
        }
        ((o0) this.f10283i0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f10284j0 = edgeEffect;
        if (this.f10280h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r3v11, types: [F0.Z, java.lang.Object, F0.o] */
    /* JADX WARN: Type inference failed for: r3v17, types: [F0.n0, java.lang.Object] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        float a5;
        float a9;
        char c3;
        int i10;
        boolean z9;
        char c9;
        int i11;
        TypedArray typedArray;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        int i12 = 5;
        this.f10272b = new j0(0, this);
        this.f10273c = new h0(this);
        this.f10278g = new g(14, (byte) 0);
        this.f10282i = new N(this, 0);
        this.j = new Rect();
        this.f10285k = new Rect();
        this.f10287l = new RectF();
        this.f10293o = new ArrayList();
        this.f10295p = new ArrayList();
        this.f10297q = new ArrayList();
        this.f10306v = 0;
        this.f10247D = false;
        this.f10277f0 = false;
        this.f10279g0 = 0;
        this.f10281h0 = 0;
        this.f10283i0 = f10240i1;
        ?? obj = new Object();
        obj.f2060a = null;
        obj.f2061b = new ArrayList();
        obj.f2062c = 120L;
        obj.f2063d = 120L;
        obj.f2064e = 250L;
        obj.f2065f = 250L;
        obj.f2178g = true;
        obj.f2179h = new ArrayList();
        obj.f2180i = new ArrayList();
        obj.j = new ArrayList();
        obj.f2181k = new ArrayList();
        obj.f2182l = new ArrayList();
        obj.f2183m = new ArrayList();
        obj.f2184n = new ArrayList();
        obj.f2185o = new ArrayList();
        obj.f2186p = new ArrayList();
        obj.f2187q = new ArrayList();
        obj.f2188r = new ArrayList();
        this.f10292n0 = obj;
        this.f10294o0 = 0;
        this.f10296p0 = -1;
        this.f10315z0 = Float.MIN_VALUE;
        this.f10242A0 = Float.MIN_VALUE;
        this.f10244B0 = true;
        this.f10246C0 = new q0(this);
        this.f10249E0 = f10237f1 ? new C0120y(0) : null;
        ?? obj2 = new Object();
        obj2.f2164a = -1;
        obj2.f2165b = 0;
        obj2.f2166c = 0;
        obj2.f2167d = 1;
        obj2.f2168e = 0;
        obj2.f2169f = false;
        obj2.f2170g = false;
        obj2.f2171h = false;
        obj2.f2172i = false;
        obj2.j = false;
        obj2.f2173k = false;
        this.f10250F0 = obj2;
        this.f10253I0 = false;
        this.f10254J0 = false;
        Q q9 = new Q(this);
        this.f10255K0 = q9;
        this.f10256L0 = false;
        this.f10258N0 = new int[2];
        this.f10260P0 = new int[2];
        this.f10261Q0 = new int[2];
        this.f10262R0 = new int[2];
        this.f10263S0 = new ArrayList();
        this.f10264T0 = new N(this, 1);
        this.f10266V0 = 0;
        this.f10267W0 = 0;
        this.f10269Y0 = new P(this);
        this.f10270Z0 = new C0306g(getContext(), new Q(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10307v0 = viewConfiguration.getScaledTouchSlop();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            Method method = P.S.f5552a;
            a5 = I.a.b(viewConfiguration);
        } else {
            a5 = P.S.a(viewConfiguration, context);
        }
        this.f10315z0 = a5;
        if (i13 >= 26) {
            a9 = I.a.c(viewConfiguration);
        } else {
            a9 = P.S.a(viewConfiguration, context);
        }
        this.f10242A0 = a9;
        this.f10311x0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10313y0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10271a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f10292n0.f2060a = q9;
        this.f10275e = new C0096b(new P(this));
        this.f10276f = new F(new C1671f(i12, this));
        WeakHashMap weakHashMap = P.Q.f5546a;
        if ((i13 >= 26 ? K.a(this) : 0) == 0 && i13 >= 26) {
            K.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f10243B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new t0(this));
        int[] iArr = E0.a.f1924a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i9, 0);
        P.Q.l(this, context, iArr, attributeSet, obtainStyledAttributes, i9);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f10280h = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c9 = 2;
                z9 = 1;
                typedArray = obtainStyledAttributes;
                i11 = i9;
                i10 = 4;
                c3 = 3;
                new C0119x(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(co.notix.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(co.notix.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(co.notix.R.dimen.fastscroll_margin));
            } else {
                throw new IllegalArgumentException(A0.a.j(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
        } else {
            c3 = 3;
            i10 = 4;
            z9 = 1;
            c9 = 2;
            i11 = i9;
            typedArray = obtainStyledAttributes;
        }
        typedArray.recycle();
        this.f10268X0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = Class.forName(str, false, classLoader).asSubclass(a.class);
                    try {
                        constructor = asSubclass.getConstructor(f10238g1);
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = context;
                        objArr2[z9] = attributeSet;
                        objArr2[c9] = Integer.valueOf(i11);
                        objArr2[c3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e8) {
                        try {
                            constructor = asSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e9) {
                            e9.initCause(e8);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e9);
                        }
                    }
                    constructor.setAccessible(z9);
                    setLayoutManager((a) constructor.newInstance(objArr));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e10);
                } catch (ClassNotFoundException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e11);
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e12);
                } catch (InstantiationException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                } catch (InvocationTargetException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                }
            }
        }
        int[] iArr2 = f10234c1;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i11, 0);
        P.Q.l(this, context, iArr2, attributeSet, obtainStyledAttributes2, i11);
        boolean z10 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        setTag(co.notix.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a aVar = this.f10291n;
        if (aVar != null) {
            return aVar.u(layoutParams);
        }
        throw new IllegalStateException(A0.a.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Deprecated
    public void setRecyclerListener(i0 i0Var) {
    }
}
