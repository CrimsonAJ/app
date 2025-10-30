package F0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: F0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0099c0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public r0 f2083a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f2084b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2085c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2086d;

    public C0099c0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2084b = new Rect();
        this.f2085c = true;
        this.f2086d = false;
    }

    public C0099c0(int i9, int i10) {
        super(i9, i10);
        this.f2084b = new Rect();
        this.f2085c = true;
        this.f2086d = false;
    }

    public C0099c0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2084b = new Rect();
        this.f2085c = true;
        this.f2086d = false;
    }

    public C0099c0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2084b = new Rect();
        this.f2085c = true;
        this.f2086d = false;
    }

    public C0099c0(C0099c0 c0099c0) {
        super((ViewGroup.LayoutParams) c0099c0);
        this.f2084b = new Rect();
        this.f2085c = true;
        this.f2086d = false;
    }
}
