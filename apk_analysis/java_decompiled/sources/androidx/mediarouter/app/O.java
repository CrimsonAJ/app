package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final BitmapDrawable f10047a;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f10049c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f10050d;

    /* renamed from: e, reason: collision with root package name */
    public long f10051e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f10052f;

    /* renamed from: g, reason: collision with root package name */
    public int f10053g;

    /* renamed from: i, reason: collision with root package name */
    public long f10055i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10056k;

    /* renamed from: l, reason: collision with root package name */
    public O0.c f10057l;

    /* renamed from: b, reason: collision with root package name */
    public float f10048b = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f10054h = 1.0f;

    public O(BitmapDrawable bitmapDrawable, Rect rect) {
        this.f10047a = bitmapDrawable;
        this.f10052f = rect;
        Rect rect2 = new Rect(rect);
        this.f10049c = rect2;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.f10048b * 255.0f));
            bitmapDrawable.setBounds(rect2);
        }
    }
}
