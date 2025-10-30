package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: p.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1786b0 {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f21948l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f21949m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f21950a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21951b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f21952c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f21953d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f21954e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f21955f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f21956g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f21957h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f21958i;
    public final Context j;

    /* renamed from: k, reason: collision with root package name */
    public final C1779Y f21959k;

    public C1786b0(TextView textView) {
        this.f21958i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f21959k = new C1781Z();
        } else {
            this.f21959k = new C1779Y();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i9 : iArr) {
                if (i9 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i9)) < 0) {
                    arrayList.add(Integer.valueOf(i9));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f21949m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
                return method;
            }
            return method;
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e8);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e8);
            return obj2;
        }
    }

    public final void a() {
        int measuredWidth;
        if (f()) {
            if (this.f21951b) {
                if (this.f21958i.getMeasuredHeight() > 0 && this.f21958i.getMeasuredWidth() > 0) {
                    if (this.f21959k.b(this.f21958i)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f21958i.getMeasuredWidth() - this.f21958i.getTotalPaddingLeft()) - this.f21958i.getTotalPaddingRight();
                    }
                    int height = (this.f21958i.getHeight() - this.f21958i.getCompoundPaddingBottom()) - this.f21958i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f21948l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float c3 = c(rectF);
                                if (c3 != this.f21958i.getTextSize()) {
                                    g(0, c3);
                                }
                            } finally {
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f21951b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        CharSequence transformation;
        int length = this.f21955f.length;
        if (length != 0) {
            int i9 = length - 1;
            int i10 = 0;
            int i11 = 1;
            while (i11 <= i9) {
                int i12 = (i11 + i9) / 2;
                int i13 = this.f21955f[i12];
                TextView textView = this.f21958i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    charSequence = transformation;
                } else {
                    charSequence = text;
                }
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.f21957h;
                if (textPaint == null) {
                    this.f21957h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f21957h.set(textView.getPaint());
                this.f21957h.setTextSize(i13);
                StaticLayout a5 = AbstractC1777X.a(charSequence, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.f21958i, this.f21957h, this.f21959k);
                if ((maxLines != -1 && (a5.getLineCount() > maxLines || a5.getLineEnd(a5.getLineCount() - 1) != charSequence.length())) || a5.getHeight() > rectF.bottom) {
                    i10 = i12 - 1;
                    i9 = i10;
                } else {
                    int i14 = i12 + 1;
                    i10 = i11;
                    i11 = i14;
                }
            }
            return this.f21955f[i10];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (j() && this.f21950a != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i9, float f9) {
        Resources resources;
        Context context = this.j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i9, f9, resources.getDisplayMetrics());
        TextView textView = this.f21958i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f21951b = false;
                try {
                    Method d9 = d("nullLayouts");
                    if (d9 != null) {
                        d9.invoke(textView, null);
                    }
                } catch (Exception e8) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e8);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f21950a == 1) {
            if (!this.f21956g || this.f21955f.length == 0) {
                int floor = ((int) Math.floor((this.f21954e - this.f21953d) / this.f21952c)) + 1;
                int[] iArr = new int[floor];
                for (int i9 = 0; i9 < floor; i9++) {
                    iArr[i9] = Math.round((i9 * this.f21952c) + this.f21953d);
                }
                this.f21955f = b(iArr);
            }
            this.f21951b = true;
        } else {
            this.f21951b = false;
        }
        return this.f21951b;
    }

    public final boolean i() {
        boolean z9;
        if (this.f21955f.length > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f21956g = z9;
        if (z9) {
            this.f21950a = 1;
            this.f21953d = r0[0];
            this.f21954e = r0[r1 - 1];
            this.f21952c = -1.0f;
        }
        return z9;
    }

    public final boolean j() {
        return !(this.f21958i instanceof AppCompatEditText);
    }

    public final void k(float f9, float f10, float f11) {
        if (f9 > 0.0f) {
            if (f10 > f9) {
                if (f11 > 0.0f) {
                    this.f21950a = 1;
                    this.f21953d = f9;
                    this.f21954e = f10;
                    this.f21952c = f11;
                    this.f21956g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f9 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f9 + "px) is less or equal to (0px)");
    }
}
