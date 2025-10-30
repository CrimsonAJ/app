package S;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import p.C1812o0;

/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f6676r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f6677a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f6678b;

    /* renamed from: c, reason: collision with root package name */
    public final ListView f6679c;

    /* renamed from: d, reason: collision with root package name */
    public A4.e f6680d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f6681e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f6682f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6683g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6684h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f6685i;
    public final float[] j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f6686k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6687l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6688m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6689n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6690o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6691p;

    /* renamed from: q, reason: collision with root package name */
    public final C1812o0 f6692q;

    /* JADX WARN: Type inference failed for: r1v0, types: [S.a, java.lang.Object] */
    public d(C1812o0 c1812o0) {
        ?? obj = new Object();
        obj.f6671e = Long.MIN_VALUE;
        obj.f6673g = -1L;
        obj.f6672f = 0L;
        this.f6677a = obj;
        this.f6678b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f6681e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6682f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f6685i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f6686k = fArr5;
        this.f6679c = c1812o0;
        float f9 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f9) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f9 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.f6683g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f6684h = f6676r;
        obj.f6667a = 500;
        obj.f6668b = 500;
        this.f6692q = c1812o0;
    }

    public static float b(float f9, float f10, float f11) {
        if (f9 > f11) {
            return f11;
        }
        if (f9 < f10) {
            return f10;
        }
        return f9;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f6681e
            r0 = r0[r7]
            float[] r1 = r3.f6682f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f6678b
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f6685i
            r0 = r0[r7]
            float[] r1 = r3.j
            r1 = r1[r7]
            float[] r2 = r3.f6686k
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: S.d.a(float, float, float, int):float");
    }

    public final float c(float f9, float f10) {
        if (f10 != 0.0f) {
            int i9 = this.f6683g;
            if (i9 != 0 && i9 != 1) {
                if (i9 == 2 && f9 < 0.0f) {
                    return f9 / (-f10);
                }
            } else if (f9 < f10) {
                if (f9 >= 0.0f) {
                    return 1.0f - (f9 / f10);
                }
                if (this.f6690o && i9 == 1) {
                    return 1.0f;
                }
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i9 = 0;
        if (this.f6688m) {
            this.f6690o = false;
            return;
        }
        a aVar = this.f6677a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i10 = (int) (currentAnimationTimeMillis - aVar.f6671e);
        int i11 = aVar.f6668b;
        if (i10 > i11) {
            i9 = i11;
        } else if (i10 >= 0) {
            i9 = i10;
        }
        aVar.f6675i = i9;
        aVar.f6674h = aVar.a(currentAnimationTimeMillis);
        aVar.f6673g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C1812o0 c1812o0;
        int count;
        a aVar = this.f6677a;
        float f9 = aVar.f6670d;
        int abs = (int) (f9 / Math.abs(f9));
        Math.abs(aVar.f6669c);
        if (abs != 0 && (count = (c1812o0 = this.f6692q).getCount()) != 0) {
            int childCount = c1812o0.getChildCount();
            int firstVisiblePosition = c1812o0.getFirstVisiblePosition();
            int i9 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && c1812o0.getChildAt(0).getTop() >= 0)) : !(i9 >= count && c1812o0.getChildAt(childCount - 1).getBottom() <= c1812o0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f6691p
            r1 = 0
            if (r0 != 0) goto L7
            goto L7d
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7d
        L17:
            r7.d()
            return r1
        L1b:
            r7.f6689n = r2
            r7.f6687l = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f6679c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            S.a r9 = r7.f6677a
            r9.f6669c = r0
            r9.f6670d = r8
            boolean r8 = r7.f6690o
            if (r8 != 0) goto L7d
            boolean r8 = r7.e()
            if (r8 == 0) goto L7d
            A4.e r8 = r7.f6680d
            if (r8 != 0) goto L61
            A4.e r8 = new A4.e
            r9 = 7
            r8.<init>(r9, r7)
            r7.f6680d = r8
        L61:
            r7.f6690o = r2
            r7.f6688m = r2
            boolean r8 = r7.f6687l
            if (r8 != 0) goto L76
            int r8 = r7.f6684h
            if (r8 <= 0) goto L76
            A4.e r9 = r7.f6680d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = P.Q.f5546a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7b
        L76:
            A4.e r8 = r7.f6680d
            r8.run()
        L7b:
            r7.f6687l = r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
