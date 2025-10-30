package k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.measurement.Y1;

/* loaded from: classes.dex */
public final class e extends Drawable implements Drawable.Callback {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f19846t = 0;

    /* renamed from: a, reason: collision with root package name */
    public b f19847a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f19848b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f19849c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f19850d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19852f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19854h;

    /* renamed from: i, reason: collision with root package name */
    public A4.e f19855i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public long f19856k;

    /* renamed from: l, reason: collision with root package name */
    public Y0.c f19857l;

    /* renamed from: m, reason: collision with root package name */
    public b f19858m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f19859n;

    /* renamed from: o, reason: collision with root package name */
    public b f19860o;

    /* renamed from: p, reason: collision with root package name */
    public Y1 f19861p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f19864s;

    /* renamed from: e, reason: collision with root package name */
    public int f19851e = 255;

    /* renamed from: g, reason: collision with root package name */
    public int f19853g = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f19862q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f19863r = -1;

    public e(b bVar, Resources resources) {
        i(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0272, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0279, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:
    
        if (r6 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
    
        r6 = r26.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
    
        if (r6 != 4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0104, code lost:
    
        if (r6 != 2) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
    
        if (r26.getName().equals("vector") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0112, code lost:
    
        r6 = new Y0.r();
        r6.inflate(r1, r26, r27, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011b, code lost:
    
        r6 = l.AbstractC1526a.a(r25, r26, r27, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0138, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0139, code lost:
    
        if (r6 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013b, code lost:
    
        r9 = r5.f19860o;
        r6 = r9.a(r6);
        r9.f19813H[r6] = r8;
        r9.f19815J.h(r6, java.lang.Integer.valueOf(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016d, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static k.e c(android.content.Context r24, android.content.res.Resources r25, android.content.res.XmlResourceParser r26, android.util.AttributeSet r27, android.content.res.Resources.Theme r28) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):k.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f19852f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f19849c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f19851e
            r3.setAlpha(r9)
            r13.j = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            k.b r10 = r13.f19847a
            int r10 = r10.f19839y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f19851e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.j = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f19850d
            if (r9 == 0) goto L61
            long r10 = r13.f19856k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f19850d = r0
            r13.f19856k = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            k.b r4 = r13.f19847a
            int r4 = r4.f19840z
            int r3 = r3 / r4
            int r4 = r13.f19851e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f19856k = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            A4.e r14 = r13.f19855i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        b bVar = this.f19847a;
        if (theme != null) {
            bVar.c();
            int i9 = bVar.f19823h;
            Drawable[] drawableArr = bVar.f19822g;
            for (int i10 = 0; i10 < i9; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i10].applyTheme(theme);
                    bVar.f19820e |= drawableArr[i10].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                bVar.f19817b = resources;
                int i11 = resources.getDisplayMetrics().densityDpi;
                if (i11 == 0) {
                    i11 = 160;
                }
                int i12 = bVar.f19818c;
                bVar.f19818c = i11;
                if (i12 != i11) {
                    bVar.f19827m = false;
                    bVar.j = false;
                    return;
                }
                return;
            }
            return;
        }
        bVar.getClass();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f19847a.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f19857l == null) {
            this.f19857l = new Y0.c();
        }
        Y0.c cVar = this.f19857l;
        cVar.f8497b = drawable.getCallback();
        drawable.setCallback(cVar);
        try {
            if (this.f19847a.f19839y <= 0 && this.f19852f) {
                drawable.setAlpha(this.f19851e);
            }
            b bVar = this.f19847a;
            if (bVar.f19808C) {
                drawable.setColorFilter(bVar.f19807B);
            } else {
                if (bVar.f19811F) {
                    drawable.setTintList(bVar.f19809D);
                }
                b bVar2 = this.f19847a;
                if (bVar2.f19812G) {
                    drawable.setTintMode(bVar2.f19810E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f19847a.f19837w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f19847a.f19806A);
            Rect rect = this.f19848b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            Y0.c cVar2 = this.f19857l;
            Drawable.Callback callback = (Drawable.Callback) cVar2.f8497b;
            cVar2.f8497b = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            Y0.c cVar3 = this.f19857l;
            Drawable.Callback callback2 = (Drawable.Callback) cVar3.f8497b;
            cVar3.f8497b = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f19849c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f19850d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z9;
        Drawable drawable = this.f19850d;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f19850d = null;
            z9 = true;
        } else {
            z9 = false;
        }
        Drawable drawable2 = this.f19849c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f19852f) {
                this.f19849c.setAlpha(this.f19851e);
            }
        }
        if (this.f19856k != 0) {
            this.f19856k = 0L;
            z9 = true;
        }
        if (this.j != 0) {
            this.j = 0L;
        } else {
            z10 = z9;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f19854h && super.mutate() == this) {
            b bVar = new b(this.f19860o, this, null);
            bVar.f19814I = bVar.f19814I.clone();
            bVar.f19815J = bVar.f19815J.clone();
            i(bVar);
            this.f19854h = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f19859n) {
            f();
            b bVar = this.f19858m;
            bVar.f19814I = bVar.f19814I.clone();
            bVar.f19815J = bVar.f19815J.clone();
            this.f19859n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f19851e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f19847a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z9;
        b bVar = this.f19847a;
        if (bVar.f19835u) {
            z9 = bVar.f19836v;
        } else {
            bVar.c();
            bVar.f19835u = true;
            int i9 = bVar.f19823h;
            Drawable[] drawableArr = bVar.f19822g;
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    if (drawableArr[i10].getConstantState() == null) {
                        bVar.f19836v = false;
                        z9 = false;
                        break;
                    }
                    i10++;
                } else {
                    bVar.f19836v = true;
                    z9 = true;
                    break;
                }
            }
        }
        if (z9) {
            this.f19847a.f19819d = getChangingConfigurations();
            return this.f19847a;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f19849c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f19848b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f19847a;
        if (bVar.f19826l) {
            if (!bVar.f19827m) {
                bVar.b();
            }
            return bVar.f19829o;
        }
        Drawable drawable = this.f19849c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f19847a;
        if (bVar.f19826l) {
            if (!bVar.f19827m) {
                bVar.b();
            }
            return bVar.f19828n;
        }
        Drawable drawable = this.f19849c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f19847a;
        if (bVar.f19826l) {
            if (!bVar.f19827m) {
                bVar.b();
            }
            return bVar.f19831q;
        }
        Drawable drawable = this.f19849c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f19847a;
        if (bVar.f19826l) {
            if (!bVar.f19827m) {
                bVar.b();
            }
            return bVar.f19830p;
        }
        Drawable drawable = this.f19849c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f19849c;
        int i9 = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f19847a;
            if (bVar.f19832r) {
                return bVar.f19833s;
            }
            bVar.c();
            int i10 = bVar.f19823h;
            Drawable[] drawableArr = bVar.f19822g;
            if (i10 > 0) {
                i9 = drawableArr[0].getOpacity();
            }
            for (int i11 = 1; i11 < i10; i11++) {
                i9 = Drawable.resolveOpacity(i9, drawableArr[i11].getOpacity());
            }
            bVar.f19833s = i9;
            bVar.f19832r = true;
        }
        return i9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f19849c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f19847a;
        boolean z9 = false;
        Rect rect2 = null;
        if (!bVar.f19824i) {
            Rect rect3 = bVar.f19825k;
            if (rect3 == null && !bVar.j) {
                bVar.c();
                Rect rect4 = new Rect();
                int i9 = bVar.f19823h;
                Drawable[] drawableArr = bVar.f19822g;
                for (int i10 = 0; i10 < i9; i10++) {
                    if (drawableArr[i10].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i11 = rect4.left;
                        if (i11 > rect2.left) {
                            rect2.left = i11;
                        }
                        int i12 = rect4.top;
                        if (i12 > rect2.top) {
                            rect2.top = i12;
                        }
                        int i13 = rect4.right;
                        if (i13 > rect2.right) {
                            rect2.right = i13;
                        }
                        int i14 = rect4.bottom;
                        if (i14 > rect2.bottom) {
                            rect2.bottom = i14;
                        }
                    }
                }
                bVar.j = true;
                bVar.f19825k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z9 = true;
            }
        } else {
            Drawable drawable = this.f19849c;
            if (drawable != null) {
                z9 = drawable.getPadding(rect);
            } else {
                z9 = super.getPadding(rect);
            }
        }
        if (this.f19847a.f19806A && getLayoutDirection() == 1) {
            int i15 = rect.left;
            rect.left = rect.right;
            rect.right = i15;
        }
        return z9;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f19853g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            k.b r0 = r9.f19847a
            int r0 = r0.f19840z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f19850d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f19849c
            if (r0 == 0) goto L29
            r9.f19850d = r0
            k.b r0 = r9.f19847a
            int r0 = r0.f19840z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f19856k = r0
            goto L35
        L29:
            r9.f19850d = r4
            r9.f19856k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f19849c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            k.b r0 = r9.f19847a
            int r1 = r0.f19823h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f19849c = r0
            r9.f19853g = r10
            if (r0 == 0) goto L5a
            k.b r10 = r9.f19847a
            int r10 = r10.f19839y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.j = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f19849c = r4
            r10 = -1
            r9.f19853g = r10
        L5a:
            long r0 = r9.j
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.f19856k
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7b
        L67:
            A4.e r10 = r9.f19855i
            if (r10 != 0) goto L75
            A4.e r10 = new A4.e
            r1 = 28
            r10.<init>(r1, r9)
            r9.f19855i = r10
            goto L78
        L75:
            r9.unscheduleSelf(r10)
        L78:
            r9.a(r0)
        L7b:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.h(int):boolean");
    }

    public final void i(b bVar) {
        this.f19847a = bVar;
        int i9 = this.f19853g;
        if (i9 >= 0) {
            Drawable d9 = bVar.d(i9);
            this.f19849c = d9;
            if (d9 != null) {
                d(d9);
            }
        }
        this.f19850d = null;
        this.f19858m = bVar;
        this.f19860o = bVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f19847a;
        if (bVar != null) {
            bVar.f19832r = false;
            bVar.f19834t = false;
        }
        if (drawable == this.f19849c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f19847a.f19806A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        Drawable drawable = this.f19850d;
        if (drawable != null) {
            drawable.setVisible(z9, z10);
        }
        Drawable drawable2 = this.f19849c;
        if (drawable2 != null) {
            drawable2.setVisible(z9, z10);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        Y1 y12 = this.f19861p;
        if (y12 != null) {
            y12.H();
            this.f19861p = null;
            h(this.f19862q);
            this.f19862q = -1;
            this.f19863r = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f19864s) {
            g();
            b bVar = this.f19860o;
            bVar.f19814I = bVar.f19814I.clone();
            bVar.f19815J = bVar.f19815J.clone();
            this.f19864s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f19850d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f19849c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i9) {
        b bVar = this.f19847a;
        int i10 = this.f19853g;
        int i11 = bVar.f19823h;
        Drawable[] drawableArr = bVar.f19822g;
        boolean z9 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i9);
                if (i12 == i10) {
                    z9 = layoutDirection;
                }
            }
        }
        bVar.f19838x = i9;
        return z9;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i9) {
        Drawable drawable = this.f19850d;
        if (drawable != null) {
            return drawable.setLevel(i9);
        }
        Drawable drawable2 = this.f19849c;
        if (drawable2 != null) {
            return drawable2.setLevel(i9);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        if (h(r1) != false) goto L45;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.e.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f19849c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        if (!this.f19852f || this.f19851e != i9) {
            this.f19852f = true;
            this.f19851e = i9;
            Drawable drawable = this.f19849c;
            if (drawable != null) {
                if (this.j == 0) {
                    drawable.setAlpha(i9);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z9) {
        b bVar = this.f19847a;
        if (bVar.f19806A != z9) {
            bVar.f19806A = z9;
            Drawable drawable = this.f19849c;
            if (drawable != null) {
                drawable.setAutoMirrored(z9);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f19847a;
        bVar.f19808C = true;
        if (bVar.f19807B != colorFilter) {
            bVar.f19807B = colorFilter;
            Drawable drawable = this.f19849c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z9) {
        b bVar = this.f19847a;
        if (bVar.f19837w != z9) {
            bVar.f19837w = z9;
            Drawable drawable = this.f19849c;
            if (drawable != null) {
                drawable.setDither(z9);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f9, float f10) {
        Drawable drawable = this.f19849c;
        if (drawable != null) {
            drawable.setHotspot(f9, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i9, int i10, int i11, int i12) {
        Rect rect = this.f19848b;
        if (rect == null) {
            this.f19848b = new Rect(i9, i10, i11, i12);
        } else {
            rect.set(i9, i10, i11, i12);
        }
        Drawable drawable = this.f19849c;
        if (drawable != null) {
            drawable.setHotspotBounds(i9, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i9) {
        setTintList(ColorStateList.valueOf(i9));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f19847a;
        bVar.f19811F = true;
        if (bVar.f19809D != colorStateList) {
            bVar.f19809D = colorStateList;
            this.f19849c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f19847a;
        bVar.f19812G = true;
        if (bVar.f19810E != mode) {
            bVar.f19810E = mode;
            this.f19849c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        boolean j = j(z9, z10);
        Y1 y12 = this.f19861p;
        if (y12 != null && (j || z10)) {
            if (z9) {
                y12.G();
                return j;
            }
            jumpToCurrentState();
        }
        return j;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f19849c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
