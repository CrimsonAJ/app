package V;

import A4.e;
import F0.O;
import P.Q;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: v, reason: collision with root package name */
    public static final O f7556v = new O(1);

    /* renamed from: a, reason: collision with root package name */
    public int f7557a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7558b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f7560d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f7561e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f7562f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f7563g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f7564h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f7565i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f7566k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f7567l;

    /* renamed from: m, reason: collision with root package name */
    public final float f7568m;

    /* renamed from: n, reason: collision with root package name */
    public final float f7569n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7570o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f7571p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC1002u1 f7572q;

    /* renamed from: r, reason: collision with root package name */
    public View f7573r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7574s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f7575t;

    /* renamed from: c, reason: collision with root package name */
    public int f7559c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final e f7576u = new e(8, this);

    public d(Context context, CoordinatorLayout coordinatorLayout, AbstractC1002u1 abstractC1002u1) {
        if (coordinatorLayout != null) {
            if (abstractC1002u1 != null) {
                this.f7575t = coordinatorLayout;
                this.f7572q = abstractC1002u1;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.f7570o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.f7558b = viewConfiguration.getScaledTouchSlop();
                this.f7568m = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f7569n = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f7571p = new OverScroller(context, f7556v);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final void a() {
        this.f7559c = -1;
        float[] fArr = this.f7560d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f7561e, 0.0f);
            Arrays.fill(this.f7562f, 0.0f);
            Arrays.fill(this.f7563g, 0.0f);
            Arrays.fill(this.f7564h, 0);
            Arrays.fill(this.f7565i, 0);
            Arrays.fill(this.j, 0);
            this.f7566k = 0;
        }
        VelocityTracker velocityTracker = this.f7567l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7567l = null;
        }
    }

    public final void b(View view, int i9) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f7575t;
        if (parent == coordinatorLayout) {
            this.f7573r = view;
            this.f7559c = i9;
            this.f7572q.O(view, i9);
            n(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            com.google.android.gms.internal.measurement.u1 r1 = r3.f7572q
            int r4 = r1.G(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.H()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f7558b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f7558b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f7558b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V.d.c(android.view.View, float, float):boolean");
    }

    public final void d(int i9) {
        float[] fArr = this.f7560d;
        if (fArr != null) {
            int i10 = this.f7566k;
            int i11 = 1 << i9;
            if ((i10 & i11) != 0) {
                fArr[i9] = 0.0f;
                this.f7561e[i9] = 0.0f;
                this.f7562f[i9] = 0.0f;
                this.f7563g[i9] = 0.0f;
                this.f7564h[i9] = 0;
                this.f7565i[i9] = 0;
                this.j[i9] = 0;
                this.f7566k = (~i11) & i10;
            }
        }
    }

    public final int e(int i9, int i10, int i11) {
        int abs;
        if (i9 == 0) {
            return 0;
        }
        float width = this.f7575t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i9) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i10);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i9) / i11) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean f() {
        if (this.f7557a == 2) {
            OverScroller overScroller = this.f7571p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f7573r.getLeft();
            int top = currY - this.f7573r.getTop();
            if (left != 0) {
                View view = this.f7573r;
                WeakHashMap weakHashMap = Q.f5546a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f7573r;
                WeakHashMap weakHashMap2 = Q.f5546a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f7572q.Q(this.f7573r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f7575t.post(this.f7576u);
            }
        }
        if (this.f7557a != 2) {
            return false;
        }
        return true;
    }

    public final View g(int i9, int i10) {
        CoordinatorLayout coordinatorLayout = this.f7575t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f7572q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i9 >= childAt.getLeft() && i9 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i9, int i10, int i11, int i12) {
        float f9;
        float f10;
        float f11;
        float f12;
        int left = this.f7573r.getLeft();
        int top = this.f7573r.getTop();
        int i13 = i9 - left;
        int i14 = i10 - top;
        OverScroller overScroller = this.f7571p;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f7573r;
        int i15 = (int) this.f7569n;
        int i16 = (int) this.f7568m;
        int abs = Math.abs(i11);
        if (abs < i15) {
            i11 = 0;
        } else if (abs > i16) {
            if (i11 > 0) {
                i11 = i16;
            } else {
                i11 = -i16;
            }
        }
        int abs2 = Math.abs(i12);
        if (abs2 < i15) {
            i12 = 0;
        } else if (abs2 > i16) {
            if (i12 > 0) {
                i12 = i16;
            } else {
                i12 = -i16;
            }
        }
        int abs3 = Math.abs(i13);
        int abs4 = Math.abs(i14);
        int abs5 = Math.abs(i11);
        int abs6 = Math.abs(i12);
        int i17 = abs5 + abs6;
        int i18 = abs3 + abs4;
        if (i11 != 0) {
            f9 = abs5;
            f10 = i17;
        } else {
            f9 = abs3;
            f10 = i18;
        }
        float f13 = f9 / f10;
        if (i12 != 0) {
            f11 = abs6;
            f12 = i17;
        } else {
            f11 = abs4;
            f12 = i18;
        }
        float f14 = f11 / f12;
        AbstractC1002u1 abstractC1002u1 = this.f7572q;
        overScroller.startScroll(left, top, i13, i14, (int) ((e(i14, i12, abstractC1002u1.H()) * f14) + (e(i13, i11, abstractC1002u1.G(view)) * f13)));
        n(2);
        return true;
    }

    public final boolean i(int i9) {
        if ((this.f7566k & (1 << i9)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i9 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i9;
        boolean z9 = true;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f7567l == null) {
            this.f7567l = VelocityTracker.obtain();
        }
        this.f7567l.addMovement(motionEvent);
        int i10 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                AbstractC1002u1 abstractC1002u1 = this.f7572q;
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.f7557a == 1 && pointerId == this.f7559c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i10 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i10);
                                            if (pointerId2 != this.f7559c) {
                                                View g9 = g((int) motionEvent.getX(i10), (int) motionEvent.getY(i10));
                                                View view = this.f7573r;
                                                if (g9 == view && q(view, pointerId2)) {
                                                    i9 = this.f7559c;
                                                    break;
                                                }
                                            }
                                            i10++;
                                        } else {
                                            i9 = -1;
                                            break;
                                        }
                                    }
                                    if (i9 == -1) {
                                        k();
                                    }
                                }
                                d(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x5 = motionEvent.getX(actionIndex);
                        float y9 = motionEvent.getY(actionIndex);
                        l(x5, y9, pointerId3);
                        if (this.f7557a == 0) {
                            q(g((int) x5, (int) y9), pointerId3);
                            int i11 = this.f7564h[pointerId3];
                            return;
                        }
                        int i12 = (int) x5;
                        int i13 = (int) y9;
                        View view2 = this.f7573r;
                        if (view2 == null || i12 < view2.getLeft() || i12 >= view2.getRight() || i13 < view2.getTop() || i13 >= view2.getBottom()) {
                            z9 = false;
                        }
                        if (z9) {
                            q(this.f7573r, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.f7557a == 1) {
                        this.f7574s = true;
                        abstractC1002u1.R(this.f7573r, 0.0f, 0.0f);
                        this.f7574s = false;
                        if (this.f7557a == 1) {
                            n(0);
                        }
                    }
                    a();
                    return;
                }
                if (this.f7557a == 1) {
                    if (!i(this.f7559c)) {
                        return;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f7559c);
                    float x9 = motionEvent.getX(findPointerIndex);
                    float y10 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f7562f;
                    int i14 = this.f7559c;
                    int i15 = (int) (x9 - fArr[i14]);
                    int i16 = (int) (y10 - this.f7563g[i14]);
                    int left = this.f7573r.getLeft() + i15;
                    int top = this.f7573r.getTop() + i16;
                    int left2 = this.f7573r.getLeft();
                    int top2 = this.f7573r.getTop();
                    if (i15 != 0) {
                        left = abstractC1002u1.i(this.f7573r, left);
                        WeakHashMap weakHashMap = Q.f5546a;
                        this.f7573r.offsetLeftAndRight(left - left2);
                    }
                    if (i16 != 0) {
                        top = abstractC1002u1.j(this.f7573r, top);
                        WeakHashMap weakHashMap2 = Q.f5546a;
                        this.f7573r.offsetTopAndBottom(top - top2);
                    }
                    if (i15 != 0 || i16 != 0) {
                        abstractC1002u1.Q(this.f7573r, left, top);
                    }
                    m(motionEvent);
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                while (i10 < pointerCount2) {
                    int pointerId4 = motionEvent.getPointerId(i10);
                    if (i(pointerId4)) {
                        float x10 = motionEvent.getX(i10);
                        float y11 = motionEvent.getY(i10);
                        float f9 = x10 - this.f7560d[pointerId4];
                        float f10 = y11 - this.f7561e[pointerId4];
                        Math.abs(f9);
                        Math.abs(f10);
                        int i17 = this.f7564h[pointerId4];
                        Math.abs(f10);
                        Math.abs(f9);
                        int i18 = this.f7564h[pointerId4];
                        Math.abs(f9);
                        Math.abs(f10);
                        int i19 = this.f7564h[pointerId4];
                        Math.abs(f10);
                        Math.abs(f9);
                        int i20 = this.f7564h[pointerId4];
                        if (this.f7557a != 1) {
                            View g10 = g((int) x10, (int) y11);
                            if (c(g10, f9, f10) && q(g10, pointerId4)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i10++;
                }
                m(motionEvent);
                return;
            }
            if (this.f7557a == 1) {
                k();
            }
            a();
            return;
        }
        float x11 = motionEvent.getX();
        float y12 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View g11 = g((int) x11, (int) y12);
        l(x11, y12, pointerId5);
        q(g11, pointerId5);
        int i21 = this.f7564h[pointerId5];
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f7567l;
        float f9 = this.f7568m;
        velocityTracker.computeCurrentVelocity(1000, f9);
        float xVelocity = this.f7567l.getXVelocity(this.f7559c);
        float f10 = this.f7569n;
        float abs = Math.abs(xVelocity);
        if (abs < f10) {
            xVelocity = 0.0f;
        } else if (abs > f9) {
            if (xVelocity > 0.0f) {
                xVelocity = f9;
            } else {
                xVelocity = -f9;
            }
        }
        float yVelocity = this.f7567l.getYVelocity(this.f7559c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f10) {
            f9 = 0.0f;
        } else if (abs2 > f9) {
            if (yVelocity <= 0.0f) {
                f9 = -f9;
            }
        } else {
            f9 = yVelocity;
        }
        this.f7574s = true;
        this.f7572q.R(this.f7573r, xVelocity, f9);
        this.f7574s = false;
        if (this.f7557a == 1) {
            n(0);
        }
    }

    public final void l(float f9, float f10, int i9) {
        float[] fArr = this.f7560d;
        int i10 = 0;
        if (fArr == null || fArr.length <= i9) {
            int i11 = i9 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f7561e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f7562f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f7563g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f7564h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f7565i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f7560d = fArr2;
            this.f7561e = fArr3;
            this.f7562f = fArr4;
            this.f7563g = fArr5;
            this.f7564h = iArr;
            this.f7565i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f7560d;
        this.f7562f[i9] = f9;
        fArr9[i9] = f9;
        float[] fArr10 = this.f7561e;
        this.f7563g[i9] = f10;
        fArr10[i9] = f10;
        int[] iArr7 = this.f7564h;
        int i12 = (int) f9;
        int i13 = (int) f10;
        CoordinatorLayout coordinatorLayout = this.f7575t;
        int left = coordinatorLayout.getLeft();
        int i14 = this.f7570o;
        if (i12 < left + i14) {
            i10 = 1;
        }
        if (i13 < coordinatorLayout.getTop() + i14) {
            i10 |= 4;
        }
        if (i12 > coordinatorLayout.getRight() - i14) {
            i10 |= 2;
        }
        if (i13 > coordinatorLayout.getBottom() - i14) {
            i10 |= 8;
        }
        iArr7[i9] = i10;
        this.f7566k |= 1 << i9;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i9 = 0; i9 < pointerCount; i9++) {
            int pointerId = motionEvent.getPointerId(i9);
            if (i(pointerId)) {
                float x5 = motionEvent.getX(i9);
                float y9 = motionEvent.getY(i9);
                this.f7562f[pointerId] = x5;
                this.f7563g[pointerId] = y9;
            }
        }
    }

    public final void n(int i9) {
        this.f7575t.removeCallbacks(this.f7576u);
        if (this.f7557a != i9) {
            this.f7557a = i9;
            this.f7572q.P(i9);
            if (this.f7557a == 0) {
                this.f7573r = null;
            }
        }
    }

    public final boolean o(int i9, int i10) {
        if (this.f7574s) {
            return h(i9, i10, (int) this.f7567l.getXVelocity(this.f7559c), (int) this.f7567l.getYVelocity(this.f7559c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V.d.p(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i9) {
        if (view == this.f7573r && this.f7559c == i9) {
            return true;
        }
        if (view != null && this.f7572q.h0(view, i9)) {
            this.f7559c = i9;
            b(view, i9);
            return true;
        }
        return false;
    }
}
