package w5;

import P.F;
import P.H;
import P.Q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b5.G1;
import co.notix.R;
import com.google.android.material.appbar.MaterialToolbar;
import g5.AbstractC1254a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k4.C1499E;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f24312a = {R.attr.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f24313b = {R.attr.colorPrimaryVariant};

    /* renamed from: c, reason: collision with root package name */
    public static final B.j f24314c = new B.j(17);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24315d = 0;

    public static void a(Context context, AttributeSet attributeSet, int i9, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1254a.f17734T, i9, i10);
        boolean z9 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z9) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f24313b, "Theme.MaterialComponents");
            }
        }
        c(context, f24312a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = g5.AbstractC1254a.f17734T
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L1f
            int r5 = r0.getResourceId(r2, r4)
            if (r5 == r4) goto L3a
        L1d:
            r2 = r3
            goto L3a
        L1f:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L25:
            if (r7 >= r6) goto L36
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L33
            r5.recycle()
            goto L3a
        L33:
            int r7 = r7 + 1
            goto L25
        L36:
            r5.recycle()
            goto L1d
        L3a:
            r0.recycle()
            if (r2 == 0) goto L40
            return
        L40:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.p.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i9 = 0; i9 < iArr.length; i9++) {
            if (!obtainStyledAttributes.hasValue(i9)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(A0.a.n("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [k4.G, java.lang.Object] */
    public static void d(View view, q qVar) {
        WeakHashMap weakHashMap = Q.f5546a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        ?? obj = new Object();
        obj.f19989a = paddingStart;
        obj.f19990b = paddingTop;
        obj.f19991c = paddingEnd;
        obj.f19992d = paddingBottom;
        H.l(view, new C1499E(qVar, 22, obj));
        if (view.isAttachedToWindow()) {
            F.c(view);
        } else {
            view.addOnAttachStateChangeListener(new W.d(1));
        }
    }

    public static float e(Context context, int i9) {
        return TypedValue.applyDimension(1, i9, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup f(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static ArrayList g(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < materialToolbar.getChildCount(); i9++) {
            View childAt = materialToolbar.getChildAt(i9);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static boolean h(View view) {
        WeakHashMap weakHashMap = Q.f5546a;
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static TypedArray i(Context context, AttributeSet attributeSet, int[] iArr, int i9, int i10, int... iArr2) {
        a(context, attributeSet, i9, i10);
        b(context, attributeSet, iArr, i9, i10, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i9, i10);
    }

    public static G1 j(Context context, AttributeSet attributeSet, int[] iArr, int i9, int i10, int... iArr2) {
        a(context, attributeSet, i9, i10);
        b(context, attributeSet, iArr, i9, i10, iArr2);
        return new G1(context, context.obtainStyledAttributes(attributeSet, iArr, i9, i10));
    }

    public static PorterDuff.Mode k(int i9, PorterDuff.Mode mode) {
        if (i9 != 3) {
            if (i9 != 5) {
                if (i9 != 9) {
                    switch (i9) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
