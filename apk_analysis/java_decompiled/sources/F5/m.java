package F5;

import a.AbstractC0485a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import g5.AbstractC1254a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0485a f2519a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0485a f2520b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0485a f2521c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0485a f2522d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public c f2523e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public c f2524f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public c f2525g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public c f2526h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public e f2527i = new e(0);
    public e j = new e(0);

    /* renamed from: k, reason: collision with root package name */
    public e f2528k = new e(0);

    /* renamed from: l, reason: collision with root package name */
    public e f2529l = new e(0);

    public static l a(Context context, int i9, int i10, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i9);
        if (i10 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i10);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC1254a.f17724I);
        try {
            int i11 = obtainStyledAttributes.getInt(0, 0);
            int i12 = obtainStyledAttributes.getInt(3, i11);
            int i13 = obtainStyledAttributes.getInt(4, i11);
            int i14 = obtainStyledAttributes.getInt(2, i11);
            int i15 = obtainStyledAttributes.getInt(1, i11);
            c c3 = c(obtainStyledAttributes, 5, aVar);
            c c9 = c(obtainStyledAttributes, 8, c3);
            c c10 = c(obtainStyledAttributes, 9, c3);
            c c11 = c(obtainStyledAttributes, 7, c3);
            c c12 = c(obtainStyledAttributes, 6, c3);
            l lVar = new l();
            AbstractC0485a m9 = AbstractC1002u1.m(i12);
            lVar.f2508a = m9;
            l.b(m9);
            lVar.f2512e = c9;
            AbstractC0485a m10 = AbstractC1002u1.m(i13);
            lVar.f2509b = m10;
            l.b(m10);
            lVar.f2513f = c10;
            AbstractC0485a m11 = AbstractC1002u1.m(i14);
            lVar.f2510c = m11;
            l.b(m11);
            lVar.f2514g = c11;
            AbstractC0485a m12 = AbstractC1002u1.m(i15);
            lVar.f2511d = m12;
            l.b(m12);
            lVar.f2515h = c12;
            return lVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static l b(Context context, AttributeSet attributeSet, int i9, int i10) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1254a.f17716A, i9, i10);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i9, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i9);
        if (peekValue != null) {
            int i10 = peekValue.type;
            if (i10 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i10 == 6) {
                return new j(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.f2529l.getClass().equals(e.class) && this.j.getClass().equals(e.class) && this.f2527i.getClass().equals(e.class) && this.f2528k.getClass().equals(e.class)) {
            z9 = true;
        } else {
            z9 = false;
        }
        float a5 = this.f2523e.a(rectF);
        if (this.f2524f.a(rectF) == a5 && this.f2526h.a(rectF) == a5 && this.f2525g.a(rectF) == a5) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((this.f2520b instanceof k) && (this.f2519a instanceof k) && (this.f2521c instanceof k) && (this.f2522d instanceof k)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z9 || !z10 || !z11) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, F5.l] */
    public final l e() {
        ?? obj = new Object();
        obj.f2508a = this.f2519a;
        obj.f2509b = this.f2520b;
        obj.f2510c = this.f2521c;
        obj.f2511d = this.f2522d;
        obj.f2512e = this.f2523e;
        obj.f2513f = this.f2524f;
        obj.f2514g = this.f2525g;
        obj.f2515h = this.f2526h;
        obj.f2516i = this.f2527i;
        obj.j = this.j;
        obj.f2517k = this.f2528k;
        obj.f2518l = this.f2529l;
        return obj;
    }
}
