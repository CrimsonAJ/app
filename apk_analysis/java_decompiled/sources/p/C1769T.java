package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import b5.G1;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import h.AbstractC1260a;
import i8.C1425o;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: p.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1769T {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f21905a;

    /* renamed from: b, reason: collision with root package name */
    public C1425o f21906b;

    /* renamed from: c, reason: collision with root package name */
    public C1425o f21907c;

    /* renamed from: d, reason: collision with root package name */
    public C1425o f21908d;

    /* renamed from: e, reason: collision with root package name */
    public C1425o f21909e;

    /* renamed from: f, reason: collision with root package name */
    public C1425o f21910f;

    /* renamed from: g, reason: collision with root package name */
    public C1425o f21911g;

    /* renamed from: h, reason: collision with root package name */
    public C1425o f21912h;

    /* renamed from: i, reason: collision with root package name */
    public final C1786b0 f21913i;
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f21914k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f21915l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f21916m;

    public C1769T(TextView textView) {
        this.f21905a = textView;
        this.f21913i = new C1786b0(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [i8.o, java.lang.Object] */
    public static C1425o c(Context context, C1821t c1821t, int i9) {
        ColorStateList i10;
        synchronized (c1821t) {
            i10 = c1821t.f22079a.i(context, i9);
        }
        if (i10 != null) {
            ?? obj = new Object();
            obj.f19127b = true;
            obj.f19128c = i10;
            return obj;
        }
        return null;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i9;
        int i10;
        CharSequence subSequence;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i11 >= 30) {
                R.b.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i11 >= 30) {
                R.b.a(editorInfo, text);
                return;
            }
            int i12 = editorInfo.initialSelStart;
            int i13 = editorInfo.initialSelEnd;
            if (i12 > i13) {
                i9 = i13;
            } else {
                i9 = i12;
            }
            if (i12 <= i13) {
                i12 = i13;
            }
            int length = text.length();
            if (i9 >= 0 && i12 <= length) {
                int i14 = editorInfo.inputType & 4095;
                if (i14 != 129 && i14 != 225 && i14 != 18) {
                    if (length <= 2048) {
                        R.c.a(editorInfo, text, i9, i12);
                        return;
                    }
                    int i15 = i12 - i9;
                    if (i15 > 1024) {
                        i10 = 0;
                    } else {
                        i10 = i15;
                    }
                    int i16 = 2048 - i10;
                    int min = Math.min(text.length() - i12, i16 - Math.min(i9, (int) (i16 * 0.8d)));
                    int min2 = Math.min(i9, i16 - min);
                    int i17 = i9 - min2;
                    if (Character.isLowSurrogate(text.charAt(i17))) {
                        i17++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i12 + min) - 1))) {
                        min--;
                    }
                    int i18 = min2 + i10;
                    int i19 = i18 + min;
                    if (i10 != i15) {
                        subSequence = TextUtils.concat(text.subSequence(i17, i17 + min2), text.subSequence(i12, min + i12));
                    } else {
                        subSequence = text.subSequence(i17, i19 + i17);
                    }
                    R.c.a(editorInfo, subSequence, min2, i18);
                    return;
                }
                R.c.a(editorInfo, null, 0, 0);
                return;
            }
            R.c.a(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, C1425o c1425o) {
        if (drawable != null && c1425o != null) {
            C1821t.e(drawable, c1425o, this.f21905a.getDrawableState());
        }
    }

    public final void b() {
        C1425o c1425o = this.f21906b;
        TextView textView = this.f21905a;
        if (c1425o != null || this.f21907c != null || this.f21908d != null || this.f21909e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f21906b);
            a(compoundDrawables[1], this.f21907c);
            a(compoundDrawables[2], this.f21908d);
            a(compoundDrawables[3], this.f21909e);
        }
        if (this.f21910f == null && this.f21911g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f21910f);
        a(compoundDrawablesRelative[2], this.f21911g);
    }

    public final ColorStateList d() {
        C1425o c1425o = this.f21912h;
        if (c1425o != null) {
            return (ColorStateList) c1425o.f19128c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        C1425o c1425o = this.f21912h;
        if (c1425o != null) {
            return (PorterDuff.Mode) c1425o.f19129d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r25, int r26) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1769T.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i9) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i9, AbstractC1260a.f17826w);
        G1 g12 = new G1(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f21905a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, g12);
        if (i10 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            AbstractC1764Q.d(textView, string);
        }
        g12.y();
        Typeface typeface = this.f21915l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i9, int i10, int i11, int i12) {
        C1786b0 c1786b0 = this.f21913i;
        if (c1786b0.j()) {
            DisplayMetrics displayMetrics = c1786b0.j.getResources().getDisplayMetrics();
            c1786b0.k(TypedValue.applyDimension(i12, i9, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (c1786b0.h()) {
                c1786b0.a();
            }
        }
    }

    public final void j(int[] iArr, int i9) {
        C1786b0 c1786b0 = this.f21913i;
        if (c1786b0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i9 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1786b0.j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArr2[i10] = Math.round(TypedValue.applyDimension(i9, iArr[i10], displayMetrics));
                    }
                }
                c1786b0.f21955f = C1786b0.b(iArr2);
                if (!c1786b0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1786b0.f21956g = false;
            }
            if (c1786b0.h()) {
                c1786b0.a();
            }
        }
    }

    public final void k(int i9) {
        C1786b0 c1786b0 = this.f21913i;
        if (c1786b0.j()) {
            if (i9 != 0) {
                if (i9 == 1) {
                    DisplayMetrics displayMetrics = c1786b0.j.getResources().getDisplayMetrics();
                    c1786b0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (c1786b0.h()) {
                        c1786b0.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Unknown auto-size text type: "));
            }
            c1786b0.f21950a = 0;
            c1786b0.f21953d = -1.0f;
            c1786b0.f21954e = -1.0f;
            c1786b0.f21952c = -1.0f;
            c1786b0.f21955f = new int[0];
            c1786b0.f21951b = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [i8.o, java.lang.Object] */
    public final void l(ColorStateList colorStateList) {
        boolean z9;
        if (this.f21912h == null) {
            this.f21912h = new Object();
        }
        C1425o c1425o = this.f21912h;
        c1425o.f19128c = colorStateList;
        if (colorStateList != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        c1425o.f19127b = z9;
        this.f21906b = c1425o;
        this.f21907c = c1425o;
        this.f21908d = c1425o;
        this.f21909e = c1425o;
        this.f21910f = c1425o;
        this.f21911g = c1425o;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [i8.o, java.lang.Object] */
    public final void m(PorterDuff.Mode mode) {
        boolean z9;
        if (this.f21912h == null) {
            this.f21912h = new Object();
        }
        C1425o c1425o = this.f21912h;
        c1425o.f19129d = mode;
        if (mode != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        c1425o.f19126a = z9;
        this.f21906b = c1425o;
        this.f21907c = c1425o;
        this.f21908d = c1425o;
        this.f21909e = c1425o;
        this.f21910f = c1425o;
        this.f21911g = c1425o;
    }

    public final void n(Context context, G1 g12) {
        String string;
        boolean z9;
        boolean z10;
        int i9 = this.j;
        TypedArray typedArray = (TypedArray) g12.f10718c;
        this.j = typedArray.getInt(2, i9);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.f21914k = i11;
            if (i11 != -1) {
                this.j &= 2;
            }
        }
        int i12 = 10;
        boolean z11 = false;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f21916m = false;
                int i13 = typedArray.getInt(1, 1);
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 == 3) {
                            this.f21915l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f21915l = Typeface.SERIF;
                    return;
                }
                this.f21915l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f21915l = null;
        if (typedArray.hasValue(12)) {
            i12 = 12;
        }
        int i14 = this.f21914k;
        int i15 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface q9 = g12.q(i12, this.j, new C1758N(this, i14, i15, new WeakReference(this.f21905a)));
                if (q9 != null) {
                    if (i10 >= 28 && this.f21914k != -1) {
                        Typeface create = Typeface.create(q9, 0);
                        int i16 = this.f21914k;
                        if ((this.j & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f21915l = AbstractC1767S.a(create, i16, z10);
                    } else {
                        this.f21915l = q9;
                    }
                }
                if (this.f21915l == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f21916m = z9;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f21915l == null && (string = typedArray.getString(i12)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f21914k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i17 = this.f21914k;
                if ((this.j & 2) != 0) {
                    z11 = true;
                }
                this.f21915l = AbstractC1767S.a(create2, i17, z11);
                return;
            }
            this.f21915l = Typeface.create(string, this.j);
        }
    }
}
