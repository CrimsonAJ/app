package z;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import x.AbstractC2154i;
import x.C2149d;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2223c extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f25188a;

    /* renamed from: b, reason: collision with root package name */
    public int f25189b;

    /* renamed from: c, reason: collision with root package name */
    public Context f25190c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC2154i f25191d;

    /* renamed from: e, reason: collision with root package name */
    public String f25192e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f25193f;

    public AbstractC2223c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25188a = new int[32];
        this.f25193f = new HashMap();
        this.f25190c = context;
        e(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto Laa
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto Laa
        La:
            android.content.Context r0 = r5.f25190c
            if (r0 != 0) goto L10
            goto Laa
        L10:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L22
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L22:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L32
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L33
        L32:
            r1 = r2
        L33:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5e
            if (r1 == 0) goto L5e
            boolean r3 = u0.z.i(r6)
            if (r3 == 0) goto L52
            java.util.HashMap r3 = r1.f9539m
            if (r3 == 0) goto L52
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L52
            java.util.HashMap r3 = r1.f9539m
            java.lang.Object r3 = r3.get(r6)
            goto L53
        L52:
            r3 = r2
        L53:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5e
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5f
        L5e:
            r3 = 0
        L5f:
            if (r3 != 0) goto L67
            if (r1 == 0) goto L67
            int r3 = r5.d(r1, r6)
        L67:
            if (r3 != 0) goto L73
            java.lang.Class<z.o> r1 = z.o.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L73
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L73
        L73:
            if (r3 != 0) goto L83
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L83:
            if (r3 == 0) goto L92
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f25193f
            r1.put(r0, r6)
            r5.b(r3)
            goto Laa
        L92:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.AbstractC2223c.a(java.lang.String):void");
    }

    public final void b(int i9) {
        if (i9 == getId()) {
            return;
        }
        int i10 = this.f25189b + 1;
        int[] iArr = this.f25188a;
        if (i10 > iArr.length) {
            this.f25188a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f25188a;
        int i11 = this.f25189b;
        iArr2[i11] = i9;
        this.f25189b = i11 + 1;
    }

    public final void c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i9 = 0; i9 < this.f25189b; i9++) {
                View view = (View) constraintLayout.f9528a.get(this.f25188a[i9]);
                if (view != null) {
                    view.setVisibility(visibility);
                    if (elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.f25190c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = constraintLayout.getChildAt(i9);
                if (childAt.getId() != -1) {
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        str2 = null;
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f25352b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = obtainStyledAttributes.getIndex(i9);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f25192e = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f25188a, this.f25189b);
    }

    public final void h() {
        if (this.f25191d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C2225e) {
                ((C2225e) layoutParams).f25239k0 = this.f25191d;
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f25192e;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f25192e = str;
        if (str == null) {
            return;
        }
        int i9 = 0;
        this.f25189b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i9);
            if (indexOf == -1) {
                a(str.substring(i9));
                return;
            } else {
                a(str.substring(i9, indexOf));
                i9 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f25192e = null;
        this.f25189b = 0;
        for (int i9 : iArr) {
            b(i9);
        }
    }

    public void g() {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void f(C2149d c2149d, boolean z9) {
    }
}
