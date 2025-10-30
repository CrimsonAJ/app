package Y0;

import B6.u0;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s.C1935e;

/* loaded from: classes.dex */
public final class r extends i {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public p f8562b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f8563c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f8564d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8565e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8566f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f8567g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f8568h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f8569i;

    /* JADX WARN: Type inference failed for: r0v5, types: [Y0.p, android.graphics.drawable.Drawable$ConstantState] */
    public r() {
        this.f8566f = true;
        this.f8567g = new float[9];
        this.f8568h = new Matrix();
        this.f8569i = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f8552c = null;
        constantState.f8553d = j;
        constantState.f8551b = new o();
        this.f8562b = constantState;
    }

    public static r a(Resources resources, int i9, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            r rVar = new r();
            ThreadLocal threadLocal = G.l.f2623a;
            rVar.f8511a = resources.getDrawable(i9, theme);
            new q(rVar.f8511a.getConstantState());
            return rVar;
        }
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
                r rVar2 = new r();
                rVar2.inflate(resources, xml, asAttributeSet, theme);
                return rVar2;
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e8) {
            Log.e("VectorDrawableCompat", "parser error", e8);
            return null;
        } catch (XmlPullParserException e9) {
            Log.e("VectorDrawableCompat", "parser error", e9);
            return null;
        }
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f8569i;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f8564d;
            if (colorFilter == null) {
                colorFilter = this.f8563c;
            }
            Matrix matrix = this.f8568h;
            canvas.getMatrix(matrix);
            float[] fArr = this.f8567g;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int width = (int) (rect.width() * abs);
            int min = Math.min(2048, width);
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                p pVar = this.f8562b;
                Bitmap bitmap = pVar.f8555f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != pVar.f8555f.getHeight()) {
                    pVar.f8555f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    pVar.f8559k = true;
                }
                if (!this.f8566f) {
                    p pVar2 = this.f8562b;
                    pVar2.f8555f.eraseColor(0);
                    Canvas canvas2 = new Canvas(pVar2.f8555f);
                    o oVar = pVar2.f8551b;
                    oVar.a(oVar.f8542g, o.f8535p, canvas2, min, min2);
                } else {
                    p pVar3 = this.f8562b;
                    if (pVar3.f8559k || pVar3.f8556g != pVar3.f8552c || pVar3.f8557h != pVar3.f8553d || pVar3.j != pVar3.f8554e || pVar3.f8558i != pVar3.f8551b.getRootAlpha()) {
                        p pVar4 = this.f8562b;
                        pVar4.f8555f.eraseColor(0);
                        Canvas canvas3 = new Canvas(pVar4.f8555f);
                        o oVar2 = pVar4.f8551b;
                        oVar2.a(oVar2.f8542g, o.f8535p, canvas3, min, min2);
                        p pVar5 = this.f8562b;
                        pVar5.f8556g = pVar5.f8552c;
                        pVar5.f8557h = pVar5.f8553d;
                        pVar5.f8558i = pVar5.f8551b.getRootAlpha();
                        pVar5.j = pVar5.f8554e;
                        pVar5.f8559k = false;
                    }
                }
                p pVar6 = this.f8562b;
                if (pVar6.f8551b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (pVar6.f8560l == null) {
                        Paint paint2 = new Paint();
                        pVar6.f8560l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    pVar6.f8560l.setAlpha(pVar6.f8551b.getRootAlpha());
                    pVar6.f8560l.setColorFilter(colorFilter);
                    paint = pVar6.f8560l;
                }
                canvas.drawBitmap(pVar6.f8555f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f8562b.f8551b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f8562b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f8564d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f8511a != null && Build.VERSION.SDK_INT >= 24) {
            return new q(this.f8511a.getConstantState());
        }
        this.f8562b.f8550a = getChangingConfigurations();
        return this.f8562b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f8562b.f8551b.f8544i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f8562b.f8551b.f8543h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f8562b.f8554e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            p pVar = this.f8562b;
            if (pVar != null) {
                o oVar = pVar.f8551b;
                if (oVar.f8548n == null) {
                    oVar.f8548n = Boolean.valueOf(oVar.f8542g.a());
                }
                if (!oVar.f8548n.booleanValue()) {
                    ColorStateList colorStateList = this.f8562b.f8552c;
                    if (colorStateList == null || !colorStateList.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Y0.p, android.graphics.drawable.Drawable$ConstantState] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f8565e && super.mutate() == this) {
            p pVar = this.f8562b;
            ?? constantState = new Drawable.ConstantState();
            constantState.f8552c = null;
            constantState.f8553d = j;
            if (pVar != null) {
                constantState.f8550a = pVar.f8550a;
                o oVar = new o(pVar.f8551b);
                constantState.f8551b = oVar;
                if (pVar.f8551b.f8540e != null) {
                    oVar.f8540e = new Paint(pVar.f8551b.f8540e);
                }
                if (pVar.f8551b.f8539d != null) {
                    constantState.f8551b.f8539d = new Paint(pVar.f8551b.f8539d);
                }
                constantState.f8552c = pVar.f8552c;
                constantState.f8553d = pVar.f8553d;
                constantState.f8554e = pVar.f8554e;
            }
            this.f8562b = constantState;
            this.f8565e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z9;
        PorterDuff.Mode mode;
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        p pVar = this.f8562b;
        ColorStateList colorStateList = pVar.f8552c;
        if (colorStateList != null && (mode = pVar.f8553d) != null) {
            this.f8563c = b(colorStateList, mode);
            invalidateSelf();
            z9 = true;
        } else {
            z9 = false;
        }
        o oVar = pVar.f8551b;
        if (oVar.f8548n == null) {
            oVar.f8548n = Boolean.valueOf(oVar.f8542g.a());
        }
        if (oVar.f8548n.booleanValue()) {
            boolean b9 = pVar.f8551b.f8542g.b(iArr);
            pVar.f8559k |= b9;
            if (b9) {
                invalidateSelf();
                return true;
            }
        }
        return z9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.setAlpha(i9);
        } else if (this.f8562b.f8551b.getRootAlpha() != i9) {
            this.f8562b.f8551b.setRootAlpha(i9);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.setAutoMirrored(z9);
        } else {
            this.f8562b.f8554e = z9;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f8564d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i9) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            s8.e.c0(drawable, i9);
        } else {
            setTintList(ColorStateList.valueOf(i9));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        p pVar = this.f8562b;
        if (pVar.f8552c != colorStateList) {
            pVar.f8552c = colorStateList;
            this.f8563c = b(colorStateList, pVar.f8553d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        p pVar = this.f8562b;
        if (pVar.f8553d != mode) {
            pVar.f8553d = mode;
            this.f8563c = b(pVar.f8552c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            return drawable.setVisible(z9, z10);
        }
        return super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, Y0.k, Y0.n] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        o oVar;
        int i9;
        boolean z9;
        char c3;
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f8511a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        p pVar = this.f8562b;
        pVar.f8551b = new o();
        TypedArray g9 = G.b.g(resources, theme, attributeSet, a.f8485a);
        p pVar2 = this.f8562b;
        o oVar2 = pVar2.f8551b;
        int i11 = !G.b.d(xmlPullParser, "tintMode") ? -1 : g9.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        pVar2.f8553d = mode;
        int i12 = 1;
        ColorStateList colorStateList = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            g9.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i13 >= 28 && i13 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = g9.getResources();
                int resourceId = g9.getResourceId(1, 0);
                ThreadLocal threadLocal = G.c.f2602a;
                try {
                    colorStateList = G.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e8) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e8);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            pVar2.f8552c = colorStateList2;
        }
        boolean z10 = pVar2.f8554e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = g9.getBoolean(5, z10);
        }
        pVar2.f8554e = z10;
        float f9 = oVar2.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f9 = g9.getFloat(7, f9);
        }
        oVar2.j = f9;
        float f10 = oVar2.f8545k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f10 = g9.getFloat(8, f10);
        }
        oVar2.f8545k = f10;
        boolean z11 = false;
        if (oVar2.j <= 0.0f) {
            throw new XmlPullParserException(g9.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 > 0.0f) {
            oVar2.f8543h = g9.getDimension(3, oVar2.f8543h);
            float dimension = g9.getDimension(2, oVar2.f8544i);
            oVar2.f8544i = dimension;
            if (oVar2.f8543h <= 0.0f) {
                throw new XmlPullParserException(g9.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = oVar2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = g9.getFloat(4, alpha);
                }
                oVar2.setAlpha(alpha);
                String string = g9.getString(0);
                if (string != null) {
                    oVar2.f8547m = string;
                    oVar2.f8549o.put(string, oVar2);
                }
                g9.recycle();
                pVar.f8550a = getChangingConfigurations();
                pVar.f8559k = true;
                p pVar3 = this.f8562b;
                o oVar3 = pVar3.f8551b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(oVar3.f8542g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z12 = true;
                while (eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        l lVar = (l) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i9 = depth;
                        C1935e c1935e = oVar3.f8549o;
                        if (equals) {
                            ?? nVar = new n();
                            nVar.f8513e = 0.0f;
                            nVar.f8515g = 1.0f;
                            nVar.f8516h = 1.0f;
                            oVar = oVar3;
                            nVar.f8517i = 0.0f;
                            nVar.j = 1.0f;
                            nVar.f8518k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            nVar.f8519l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            nVar.f8520m = join2;
                            nVar.f8521n = 4.0f;
                            TypedArray g10 = G.b.g(resources, theme, attributeSet, a.f8487c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = g10.getString(0);
                                if (string2 != null) {
                                    nVar.f8533b = string2;
                                }
                                String string3 = g10.getString(2);
                                if (string3 != null) {
                                    nVar.f8532a = u0.s(string3);
                                }
                                nVar.f8514f = G.b.b(g10, xmlPullParser, theme, "fillColor", 1);
                                float f11 = nVar.f8516h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f11 = g10.getFloat(12, f11);
                                }
                                nVar.f8516h = f11;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? g10.getInt(8, -1) : -1;
                                Paint.Cap cap3 = nVar.f8519l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                nVar.f8519l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? g10.getInt(9, -1) : -1;
                                Paint.Join join3 = nVar.f8520m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                nVar.f8520m = join;
                                float f12 = nVar.f8521n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f12 = g10.getFloat(10, f12);
                                }
                                nVar.f8521n = f12;
                                nVar.f8512d = G.b.b(g10, xmlPullParser, theme, "strokeColor", 3);
                                float f13 = nVar.f8515g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f13 = g10.getFloat(11, f13);
                                }
                                nVar.f8515g = f13;
                                float f14 = nVar.f8513e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f14 = g10.getFloat(4, f14);
                                }
                                nVar.f8513e = f14;
                                float f15 = nVar.j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f15 = g10.getFloat(6, f15);
                                }
                                nVar.j = f15;
                                float f16 = nVar.f8518k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f16 = g10.getFloat(7, f16);
                                }
                                nVar.f8518k = f16;
                                float f17 = nVar.f8517i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f17 = g10.getFloat(5, f17);
                                }
                                nVar.f8517i = f17;
                                int i16 = nVar.f8534c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = g10.getInt(13, i16);
                                }
                                nVar.f8534c = i16;
                            }
                            g10.recycle();
                            lVar.f8523b.add(nVar);
                            if (nVar.getPathName() != null) {
                                c1935e.put(nVar.getPathName(), nVar);
                            }
                            pVar3.f8550a = pVar3.f8550a;
                            z12 = false;
                            c3 = '\b';
                            z9 = false;
                        } else {
                            oVar = oVar3;
                            c3 = '\b';
                            z9 = false;
                            if ("clip-path".equals(name)) {
                                n nVar2 = new n();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray g11 = G.b.g(resources, theme, attributeSet, a.f8488d);
                                    String string4 = g11.getString(0);
                                    if (string4 != null) {
                                        nVar2.f8533b = string4;
                                    }
                                    String string5 = g11.getString(1);
                                    if (string5 != null) {
                                        nVar2.f8532a = u0.s(string5);
                                    }
                                    nVar2.f8534c = !G.b.d(xmlPullParser, "fillType") ? 0 : g11.getInt(2, 0);
                                    g11.recycle();
                                }
                                lVar.f8523b.add(nVar2);
                                if (nVar2.getPathName() != null) {
                                    c1935e.put(nVar2.getPathName(), nVar2);
                                }
                                pVar3.f8550a = pVar3.f8550a;
                            } else if ("group".equals(name)) {
                                l lVar2 = new l();
                                TypedArray g12 = G.b.g(resources, theme, attributeSet, a.f8486b);
                                float f18 = lVar2.f8524c;
                                if (G.b.d(xmlPullParser, "rotation")) {
                                    f18 = g12.getFloat(5, f18);
                                }
                                lVar2.f8524c = f18;
                                lVar2.f8525d = g12.getFloat(1, lVar2.f8525d);
                                lVar2.f8526e = g12.getFloat(2, lVar2.f8526e);
                                float f19 = lVar2.f8527f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f19 = g12.getFloat(3, f19);
                                }
                                lVar2.f8527f = f19;
                                float f20 = lVar2.f8528g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f20 = g12.getFloat(4, f20);
                                }
                                lVar2.f8528g = f20;
                                float f21 = lVar2.f8529h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f21 = g12.getFloat(6, f21);
                                }
                                lVar2.f8529h = f21;
                                float f22 = lVar2.f8530i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f22 = g12.getFloat(7, f22);
                                }
                                lVar2.f8530i = f22;
                                String string6 = g12.getString(0);
                                if (string6 != null) {
                                    lVar2.f8531k = string6;
                                }
                                lVar2.c();
                                g12.recycle();
                                lVar.f8523b.add(lVar2);
                                arrayDeque.push(lVar2);
                                if (lVar2.getGroupName() != null) {
                                    c1935e.put(lVar2.getGroupName(), lVar2);
                                }
                                pVar3.f8550a = pVar3.f8550a;
                            }
                        }
                        i10 = 1;
                    } else {
                        oVar = oVar3;
                        i9 = depth;
                        z9 = z11;
                        c3 = '\b';
                        i10 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i12 = i10;
                    z11 = z9;
                    oVar3 = oVar;
                    depth = i9;
                }
                if (!z12) {
                    this.f8563c = b(pVar.f8552c, pVar.f8553d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(g9.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(g9.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public r(p pVar) {
        this.f8566f = true;
        this.f8567g = new float[9];
        this.f8568h = new Matrix();
        this.f8569i = new Rect();
        this.f8562b = pVar;
        this.f8563c = b(pVar.f8552c, pVar.f8553d);
    }
}
