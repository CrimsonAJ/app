package V0;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f7583a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final Paint f7584b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f7585c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f7586d;

    /* renamed from: e, reason: collision with root package name */
    public float f7587e;

    /* renamed from: f, reason: collision with root package name */
    public float f7588f;

    /* renamed from: g, reason: collision with root package name */
    public float f7589g;

    /* renamed from: h, reason: collision with root package name */
    public float f7590h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f7591i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public float f7592k;

    /* renamed from: l, reason: collision with root package name */
    public float f7593l;

    /* renamed from: m, reason: collision with root package name */
    public float f7594m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7595n;

    /* renamed from: o, reason: collision with root package name */
    public Path f7596o;

    /* renamed from: p, reason: collision with root package name */
    public float f7597p;

    /* renamed from: q, reason: collision with root package name */
    public float f7598q;

    /* renamed from: r, reason: collision with root package name */
    public int f7599r;

    /* renamed from: s, reason: collision with root package name */
    public int f7600s;

    /* renamed from: t, reason: collision with root package name */
    public int f7601t;

    /* renamed from: u, reason: collision with root package name */
    public int f7602u;

    public d() {
        Paint paint = new Paint();
        this.f7584b = paint;
        Paint paint2 = new Paint();
        this.f7585c = paint2;
        Paint paint3 = new Paint();
        this.f7586d = paint3;
        this.f7587e = 0.0f;
        this.f7588f = 0.0f;
        this.f7589g = 0.0f;
        this.f7590h = 5.0f;
        this.f7597p = 1.0f;
        this.f7601t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i9) {
        this.j = i9;
        this.f7602u = this.f7591i[i9];
    }
}
