package Y0;

import B6.u0;
import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f8485a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f8486b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f8487c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f8488d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f8489e = {R.attr.drawable};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f8490f = {R.attr.name, R.attr.animation};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f8491g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f8492h = {R.attr.ordering};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f8493i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f8494k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:10:0x03a8, code lost:
    
        r2 = new android.animation.Animator[r10.size()];
        r3 = r10.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x03b3, code lost:
    
        if (r1 >= r3) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x03b5, code lost:
    
        r4 = r10.get(r1);
        r1 = r1 + 1;
        r2[r11] = (android.animation.Animator) r4;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x03c3, code lost:
    
        if (r33 != 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03c5, code lost:
    
        r32.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03c8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x03c9, code lost:
    
        r32.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03cc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x03a4, code lost:
    
        if (r32 == null) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x03a6, code lost:
    
        if (r10 == null) goto L216;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x037c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0380  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator a(android.content.Context r27, android.content.res.Resources r28, android.content.res.Resources.Theme r29, android.content.res.XmlResourceParser r30, android.util.AttributeSet r31, android.animation.AnimatorSet r32, int r33) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* JADX WARN: Type inference failed for: r11v26, types: [android.animation.TypeEvaluator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.animation.TypeEvaluator, java.lang.Object] */
    public static PropertyValuesHolder b(TypedArray typedArray, int i9, int i10, int i11, String str) {
        boolean z9;
        int i12;
        boolean z10;
        int i13;
        boolean z11;
        h hVar;
        int i14;
        int i15;
        int i16;
        float f9;
        PropertyValuesHolder ofFloat;
        float f10;
        float f11;
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i12 = peekValue.type;
        } else {
            i12 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i11);
        if (peekValue2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i13 = peekValue2.type;
        } else {
            i13 = 0;
        }
        if (i9 == 4) {
            if ((z9 && c(i12)) || (z10 && c(i13))) {
                i9 = 3;
            } else {
                i9 = 0;
            }
        }
        if (i9 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i9 == 2) {
            String string = typedArray.getString(i10);
            String string2 = typedArray.getString(i11);
            H.e[] s9 = u0.s(string);
            H.e[] s10 = u0.s(string2);
            if (s9 != null || s10 != null) {
                if (s9 != null) {
                    ?? obj = new Object();
                    if (s10 != null) {
                        if (u0.g(s9, s10)) {
                            return PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, s9, s10);
                        }
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                    return PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, s9);
                }
                if (s10 != null) {
                    return PropertyValuesHolder.ofObject(str, (TypeEvaluator) new Object(), s10);
                }
            }
            return null;
        }
        if (i9 == 3) {
            hVar = h.f8510a;
        } else {
            hVar = null;
        }
        if (z11) {
            if (z9) {
                if (i12 == 5) {
                    f10 = typedArray.getDimension(i10, 0.0f);
                } else {
                    f10 = typedArray.getFloat(i10, 0.0f);
                }
                if (z10) {
                    if (i13 == 5) {
                        f11 = typedArray.getDimension(i11, 0.0f);
                    } else {
                        f11 = typedArray.getFloat(i11, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f10, f11);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f10);
                }
            } else {
                if (i13 == 5) {
                    f9 = typedArray.getDimension(i11, 0.0f);
                } else {
                    f9 = typedArray.getFloat(i11, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f9);
            }
            propertyValuesHolder = ofFloat;
        } else if (z9) {
            if (i12 == 5) {
                i15 = (int) typedArray.getDimension(i10, 0.0f);
            } else if (c(i12)) {
                i15 = typedArray.getColor(i10, 0);
            } else {
                i15 = typedArray.getInt(i10, 0);
            }
            if (z10) {
                if (i13 == 5) {
                    i16 = (int) typedArray.getDimension(i11, 0.0f);
                } else if (c(i13)) {
                    i16 = typedArray.getColor(i11, 0);
                } else {
                    i16 = typedArray.getInt(i11, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15, i16);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i15);
            }
        } else if (z10) {
            if (i13 == 5) {
                i14 = (int) typedArray.getDimension(i11, 0.0f);
            } else if (c(i13)) {
                i14 = typedArray.getColor(i11, 0);
            } else {
                i14 = typedArray.getInt(i11, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14);
        }
        if (propertyValuesHolder != null && hVar != null) {
            propertyValuesHolder.setEvaluator(hVar);
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i9) {
        if (i9 >= 28 && i9 <= 31) {
            return true;
        }
        return false;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        boolean z9;
        int i9;
        boolean z10;
        int i10;
        int i11;
        int i12;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        int i15 = 0;
        TypedArray g9 = G.b.g(resources, theme, attributeSet, f8491g);
        TypedArray g10 = G.b.g(resources, theme, attributeSet, f8494k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        int i16 = 300;
        if (G.b.d(xmlResourceParser, "duration")) {
            i16 = g9.getInt(1, 300);
        }
        long j4 = i16;
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            i9 = 0;
        } else {
            i9 = g9.getInt(2, 0);
        }
        long j9 = i9;
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 4;
        } else {
            i10 = g9.getInt(7, 4);
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i10 == 4) {
                TypedValue peekValue = g9.peekValue(5);
                if (peekValue != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i13 = peekValue.type;
                } else {
                    i13 = 0;
                }
                TypedValue peekValue2 = g9.peekValue(6);
                if (peekValue2 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    i14 = peekValue2.type;
                } else {
                    i14 = 0;
                }
                if ((z11 && c(i13)) || (z12 && c(i14))) {
                    i10 = 3;
                } else {
                    i10 = 0;
                }
            }
            PropertyValuesHolder b9 = b(g9, i10, 5, 6, "");
            if (b9 != null) {
                valueAnimator.setValues(b9);
            }
        }
        valueAnimator.setDuration(j4);
        valueAnimator.setStartDelay(j9);
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null) {
            i11 = g9.getInt(3, 0);
        } else {
            i11 = 0;
        }
        valueAnimator.setRepeatCount(i11);
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null) {
            i12 = g9.getInt(4, 1);
        } else {
            i12 = 1;
        }
        valueAnimator.setRepeatMode(i12);
        if (g10 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String c3 = G.b.c(g10, xmlResourceParser, "pathData", 1);
            if (c3 != null) {
                String c9 = G.b.c(g10, xmlResourceParser, "propertyXName", 2);
                String c10 = G.b.c(g10, xmlResourceParser, "propertyYName", 3);
                if (i10 != 2) {
                }
                if (c9 == null && c10 == null) {
                    throw new InflateException(g10.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path t7 = u0.t(c3);
                PathMeasure pathMeasure = new PathMeasure(t7, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f9 = 0.0f;
                do {
                    f9 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f9));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(t7, false);
                int min = Math.min(100, ((int) (f9 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f10 = f9 / (min - 1);
                valueAnimator2 = valueAnimator;
                int i17 = 0;
                int i18 = 0;
                float f11 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i17 >= min) {
                        break;
                    }
                    int i19 = i17;
                    pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i18)).floatValue(), fArr3, null);
                    fArr[i19] = fArr3[0];
                    fArr2[i19] = fArr3[1];
                    int i20 = i18 + 1;
                    f11 += f10;
                    if (i20 < arrayList.size() && f11 > ((Float) arrayList.get(i20)).floatValue()) {
                        pathMeasure2.nextContour();
                        i18 = i20;
                    }
                    i17 = i19 + 1;
                }
                if (c9 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(c9, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (c10 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(c10, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    objectAnimator2.setValues(propertyValuesHolder);
                } else if (propertyValuesHolder == null) {
                    objectAnimator2.setValues(propertyValuesHolder2);
                } else {
                    objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                }
                i15 = 0;
            } else {
                valueAnimator2 = valueAnimator;
                objectAnimator2.setPropertyName(G.b.c(g10, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
        }
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null) {
            i15 = g9.getResourceId(i15, i15);
        }
        if (i15 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i15));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        g9.recycle();
        if (g10 != null) {
            g10.recycle();
        }
        return valueAnimator3;
    }
}
