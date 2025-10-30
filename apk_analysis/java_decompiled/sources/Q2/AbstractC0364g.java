package Q2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import co.notix.R;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import l4.AbstractC1566a;

/* renamed from: Q2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0364g extends View implements S {

    /* renamed from: A, reason: collision with root package name */
    public int f6224A;

    /* renamed from: B, reason: collision with root package name */
    public long f6225B;

    /* renamed from: C, reason: collision with root package name */
    public int f6226C;

    /* renamed from: D, reason: collision with root package name */
    public Rect f6227D;

    /* renamed from: a, reason: collision with root package name */
    public final Rect f6228a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f6229b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f6230c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f6231d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f6232e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f6233f;

    /* renamed from: f0, reason: collision with root package name */
    public final ValueAnimator f6234f0;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f6235g;

    /* renamed from: g0, reason: collision with root package name */
    public float f6236g0;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f6237h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f6238h0;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f6239i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f6240i0;
    public final Paint j;

    /* renamed from: j0, reason: collision with root package name */
    public long f6241j0;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f6242k;

    /* renamed from: k0, reason: collision with root package name */
    public long f6243k0;

    /* renamed from: l, reason: collision with root package name */
    public final int f6244l;

    /* renamed from: l0, reason: collision with root package name */
    public long f6245l0;

    /* renamed from: m, reason: collision with root package name */
    public final int f6246m;

    /* renamed from: m0, reason: collision with root package name */
    public long f6247m0;

    /* renamed from: n, reason: collision with root package name */
    public final int f6248n;

    /* renamed from: n0, reason: collision with root package name */
    public int f6249n0;

    /* renamed from: o, reason: collision with root package name */
    public final int f6250o;

    /* renamed from: o0, reason: collision with root package name */
    public long[] f6251o0;

    /* renamed from: p, reason: collision with root package name */
    public final int f6252p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean[] f6253p0;

    /* renamed from: q, reason: collision with root package name */
    public final int f6254q;

    /* renamed from: q0, reason: collision with root package name */
    public final float f6255q0;

    /* renamed from: r, reason: collision with root package name */
    public final int f6256r;
    public long[] r0;

    /* renamed from: s, reason: collision with root package name */
    public final int f6257s;

    /* renamed from: s0, reason: collision with root package name */
    public long[] f6258s0;

    /* renamed from: t, reason: collision with root package name */
    public final int f6259t;

    /* renamed from: t0, reason: collision with root package name */
    public RectF f6260t0;

    /* renamed from: u, reason: collision with root package name */
    public final StringBuilder f6261u;

    /* renamed from: u0, reason: collision with root package name */
    public RectF f6262u0;

    /* renamed from: v, reason: collision with root package name */
    public final Formatter f6263v;

    /* renamed from: w, reason: collision with root package name */
    public final A6.s f6264w;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArraySet f6265x;

    /* renamed from: y, reason: collision with root package name */
    public final Point f6266y;

    /* renamed from: z, reason: collision with root package name */
    public final float f6267z;

    public AbstractC0364g(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.f6228a = new Rect();
        this.f6229b = new Rect();
        this.f6230c = new Rect();
        this.f6231d = new Rect();
        Paint paint = new Paint();
        this.f6232e = paint;
        Paint paint2 = new Paint();
        this.f6233f = paint2;
        Paint paint3 = new Paint();
        this.f6235g = paint3;
        Paint paint4 = new Paint();
        this.f6237h = paint4;
        Paint paint5 = new Paint();
        this.f6239i = paint5;
        Paint paint6 = new Paint();
        this.j = paint6;
        paint6.setAntiAlias(true);
        this.f6265x = new CopyOnWriteArraySet();
        this.f6266y = new Point();
        float f9 = context.getResources().getDisplayMetrics().density;
        this.f6267z = f9;
        this.f6259t = a(-50, f9);
        int a5 = a(4, f9);
        int a9 = a(26, f9);
        int a10 = a(4, f9);
        int a11 = a(12, f9);
        int a12 = a(0, f9);
        int a13 = a(16, f9);
        this.f6255q0 = a5 / 2.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC0365h.f6269b, 0, R.style.ExoStyledControls_TimeBar);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.f6242k = drawable;
                if (drawable != null) {
                    int i9 = l4.y.f20553a;
                    if (i9 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i9 < 23 || !drawable.setLayoutDirection(layoutDirection)) {
                        }
                    }
                    a9 = Math.max(drawable.getMinimumHeight(), a9);
                }
                this.f6244l = obtainStyledAttributes.getDimensionPixelSize(3, a5);
                this.f6246m = obtainStyledAttributes.getDimensionPixelSize(12, a9);
                this.f6248n = obtainStyledAttributes.getInt(2, 0);
                this.f6250o = obtainStyledAttributes.getDimensionPixelSize(1, a10);
                this.f6252p = obtainStyledAttributes.getDimensionPixelSize(11, a11);
                this.f6254q = obtainStyledAttributes.getDimensionPixelSize(8, a12);
                this.f6256r = obtainStyledAttributes.getDimensionPixelSize(9, a13);
                int i10 = obtainStyledAttributes.getInt(6, -1);
                int i11 = obtainStyledAttributes.getInt(7, -1);
                int i12 = obtainStyledAttributes.getInt(4, -855638017);
                int i13 = obtainStyledAttributes.getInt(13, 872415231);
                int i14 = obtainStyledAttributes.getInt(0, -1291845888);
                int i15 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i10);
                paint6.setColor(i11);
                paint2.setColor(i12);
                paint3.setColor(i13);
                paint4.setColor(i14);
                paint5.setColor(i15);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f6244l = a5;
            this.f6246m = a9;
            this.f6248n = 0;
            this.f6250o = a10;
            this.f6252p = a11;
            this.f6254q = a12;
            this.f6256r = a13;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f6242k = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f6261u = sb;
        this.f6263v = new Formatter(sb, Locale.getDefault());
        this.f6264w = new A6.s(7, this);
        Drawable drawable2 = this.f6242k;
        if (drawable2 != null) {
            this.f6257s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f6257s = (Math.max(this.f6254q, Math.max(this.f6252p, this.f6256r)) + 1) / 2;
        }
        this.f6236g0 = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f6234f0 = valueAnimator;
        valueAnimator.addUpdateListener(new K5.i(1, this));
        this.f6243k0 = -9223372036854775807L;
        this.f6225B = -9223372036854775807L;
        this.f6224A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(int i9, float f9) {
        return (int) ((i9 * f9) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f6225B;
        if (j == -9223372036854775807L) {
            long j4 = this.f6243k0;
            if (j4 == -9223372036854775807L) {
                return 0L;
            }
            return j4 / this.f6224A;
        }
        return j;
    }

    private String getProgressText() {
        return l4.y.A(this.f6261u, this.f6263v, this.f6245l0);
    }

    private long getScrubberPosition() {
        if (this.f6229b.width() > 0 && this.f6243k0 != -9223372036854775807L) {
            return (this.f6231d.width() * this.f6243k0) / r0.width();
        }
        return 0L;
    }

    public final boolean b(long j) {
        long j4;
        long j9 = this.f6243k0;
        if (j9 > 0) {
            if (this.f6240i0) {
                j4 = this.f6241j0;
            } else {
                j4 = this.f6245l0;
            }
            long j10 = j4;
            long j11 = l4.y.j(j10 + j, 0L, j9);
            if (j11 == j10) {
                return false;
            }
            if (!this.f6240i0) {
                c(j11);
            } else {
                f(j11);
            }
            e();
            return true;
        }
        return false;
    }

    public final void c(long j) {
        this.f6241j0 = j;
        this.f6240i0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f6265x.iterator();
        while (it.hasNext()) {
            ((Q) it.next()).c(j);
        }
    }

    public final void d(boolean z9) {
        removeCallbacks(this.f6264w);
        this.f6240i0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f6265x.iterator();
        while (it.hasNext()) {
            ((Q) it.next()).e(this.f6241j0, z9);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6242k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.AbstractC0364g.e():void");
    }

    public final void f(long j) {
        if (this.f6241j0 != j) {
            this.f6241j0 = j;
            Iterator it = this.f6265x.iterator();
            while (it.hasNext()) {
                ((Q) it.next()).h(j);
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int width = (int) (this.f6229b.width() / this.f6267z);
        if (width != 0) {
            long j = this.f6243k0;
            if (j != 0 && j != -9223372036854775807L) {
                return j / width;
            }
            return Long.MAX_VALUE;
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6242k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2;
        int i9;
        canvas.save();
        Rect rect = this.f6229b;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i10 = centerY + height;
        long j = this.f6243k0;
        Paint paint2 = this.f6235g;
        Rect rect2 = this.f6231d;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, centerY, rect.right, i10, paint2);
        } else {
            Rect rect3 = this.f6230c;
            int i11 = rect3.left;
            int i12 = rect3.right;
            int max = Math.max(Math.max(rect.left, i12), rect2.right);
            int i13 = rect.right;
            if (max < i13) {
                canvas.drawRect(max, centerY, i13, i10, paint2);
            }
            int max2 = Math.max(i11, rect2.right);
            if (i12 > max2) {
                canvas.drawRect(max2, centerY, i12, i10, this.f6233f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i10, this.f6232e);
            }
            if (this.f6249n0 != 0) {
                long[] jArr = this.f6251o0;
                jArr.getClass();
                boolean[] zArr = this.f6253p0;
                zArr.getClass();
                int i14 = this.f6250o;
                int i15 = i14 / 2;
                int i16 = 0;
                int i17 = 0;
                while (i17 < this.f6249n0) {
                    int min = Math.min(rect.width() - i14, Math.max(i16, ((int) ((rect.width() * l4.y.j(jArr[i17], 0L, this.f6243k0)) / this.f6243k0)) - i15)) + rect.left;
                    if (zArr[i17]) {
                        paint = this.f6239i;
                    } else {
                        paint = this.f6237h;
                    }
                    Paint paint3 = paint;
                    int i18 = i17;
                    canvas.drawRect(min, centerY, min + i14, i10, paint3);
                    i17 = i18 + 1;
                    i16 = i16;
                }
            }
            canvas2 = canvas;
        }
        long j4 = this.f6243k0;
        Paint paint4 = this.j;
        if (j4 > 0) {
            int i19 = l4.y.i(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.f6242k;
            if (drawable == null) {
                if (!this.f6240i0 && !isFocused()) {
                    if (isEnabled()) {
                        i9 = this.f6252p;
                    } else {
                        i9 = this.f6254q;
                    }
                } else {
                    i9 = this.f6256r;
                }
                canvas2.drawCircle(i19, centerY2, (int) ((i9 * this.f6236g0) / 2.0f), paint4);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f6236g0)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f6236g0)) / 2;
                drawable.setBounds(i19 - intrinsicWidth, centerY2 - intrinsicHeight, i19 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        RectF rectF = this.f6260t0;
        if (rectF != null) {
            float f9 = rectF.left;
            float f10 = rectF.top;
            float f11 = this.f6255q0;
            canvas2.drawRoundRect(f9, f10 - f11, rectF.right, rectF.bottom + f11, f11, f11, paint4);
        }
        RectF rectF2 = this.f6262u0;
        if (rectF2 != null) {
            float f12 = rectF2.left;
            float f13 = rectF2.top;
            float f14 = this.f6255q0;
            canvas.drawRoundRect(f12, f13 - f14, rectF2.right, rectF2.bottom + f14, f14, f14, paint4);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z9, int i9, Rect rect) {
        super.onFocusChanged(z9, i9, rect);
        if (this.f6240i0 && !z9) {
            d(false);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f6243k0 <= 0) {
            return;
        }
        if (l4.y.f20553a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L2e
            A6.s r5 = r4.f6264w
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.f6240i0
            if (r0 == 0) goto L2e
            r5 = 0
            r4.d(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.AbstractC0364g.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        Rect rect;
        int i16 = i11 - i9;
        int i17 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i16 - getPaddingRight();
        if (this.f6238h0) {
            i13 = 0;
        } else {
            i13 = this.f6257s;
        }
        int i18 = this.f6248n;
        int i19 = this.f6244l;
        int i20 = this.f6246m;
        if (i18 == 1) {
            i14 = (i17 - getPaddingBottom()) - i20;
            i15 = ((i17 - getPaddingBottom()) - i19) - Math.max(i13 - (i19 / 2), 0);
        } else {
            i14 = (i17 - i20) / 2;
            i15 = (i17 - i19) / 2;
        }
        Rect rect2 = this.f6228a;
        rect2.set(paddingLeft, i14, paddingRight, i20 + i14);
        this.f6229b.set(rect2.left + i13, i15, rect2.right - i13, i19 + i15);
        if (l4.y.f20553a >= 29 && ((rect = this.f6227D) == null || rect.width() != i16 || this.f6227D.height() != i17)) {
            Rect rect3 = new Rect(0, 0, i16, i17);
            this.f6227D = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int i11 = this.f6246m;
        if (mode == 0) {
            size = i11;
        } else if (mode != 1073741824) {
            size = Math.min(i11, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i9), size);
        Drawable drawable = this.f6242k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i9) {
        Drawable drawable = this.f6242k;
        if (drawable != null && l4.y.f20553a >= 23 && drawable.setLayoutDirection(i9)) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La1
            long r2 = r9.f6243k0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La1
        L11:
            android.graphics.Point r0 = r9.f6266y
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f6231d
            android.graphics.Rect r5 = r9.f6229b
            r6 = 1
            if (r3 == 0) goto L7d
            r7 = 3
            if (r3 == r6) goto L6e
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6e
            goto La1
        L38:
            boolean r10 = r9.f6240i0
            if (r10 == 0) goto La1
            int r10 = r9.f6259t
            if (r0 >= r10) goto L52
            int r10 = r9.f6226C
            int r2 = r2 - r10
            int r2 = r2 / r7
            int r2 = r2 + r10
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = l4.y.i(r10, r0, r1)
            r4.right = r10
            goto L60
        L52:
            r9.f6226C = r2
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = l4.y.i(r10, r0, r1)
            r4.right = r10
        L60:
            long r0 = r9.getScrubberPosition()
            r9.f(r0)
            r9.e()
            r9.invalidate()
            return r6
        L6e:
            boolean r0 = r9.f6240i0
            if (r0 == 0) goto La1
            int r10 = r10.getAction()
            if (r10 != r7) goto L79
            r1 = r6
        L79:
            r9.d(r1)
            return r6
        L7d:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f6228a
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La1
            int r0 = r5.left
            int r1 = r5.right
            int r10 = l4.y.i(r10, r0, r1)
            r4.right = r10
            long r0 = r9.getScrubberPosition()
            r9.c(r0)
            r9.e()
            r9.invalidate()
            return r6
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.AbstractC0364g.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        if (super.performAccessibilityAction(i9, bundle)) {
            return true;
        }
        if (this.f6243k0 <= 0) {
            return false;
        }
        if (i9 == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i9 != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i9) {
        this.f6237h.setColor(i9);
        invalidate(this.f6228a);
    }

    public void setBufferedColor(int i9) {
        this.f6233f.setColor(i9);
        invalidate(this.f6228a);
    }

    public void setBufferedPosition(long j) {
        if (this.f6247m0 == j) {
            return;
        }
        this.f6247m0 = j;
        e();
    }

    public void setDuration(long j) {
        if (this.f6243k0 == j) {
            return;
        }
        this.f6243k0 = j;
        if (this.f6240i0 && j == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        if (this.f6240i0 && !z9) {
            d(true);
        }
    }

    public void setKeyCountIncrement(int i9) {
        boolean z9;
        if (i9 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        this.f6224A = i9;
        this.f6225B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        boolean z9;
        if (j > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        this.f6224A = -1;
        this.f6225B = j;
    }

    public void setPlayedAdMarkerColor(int i9) {
        this.f6239i.setColor(i9);
        invalidate(this.f6228a);
    }

    public void setPlayedColor(int i9) {
        this.f6232e.setColor(i9);
        invalidate(this.f6228a);
    }

    public void setPosition(long j) {
        if (this.f6245l0 == j) {
            return;
        }
        this.f6245l0 = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i9) {
        this.j.setColor(i9);
        invalidate(this.f6228a);
    }

    public void setUnplayedColor(int i9) {
        this.f6235g.setColor(i9);
        invalidate(this.f6228a);
    }
}
