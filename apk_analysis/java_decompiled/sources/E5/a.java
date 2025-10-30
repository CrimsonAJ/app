package E5;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f1944i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f1945k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f1946l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f1947a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1948b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f1949c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1950d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1951e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1952f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f1953g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f1954h;

    public a() {
        Paint paint = new Paint();
        this.f1954h = paint;
        Paint paint2 = new Paint();
        this.f1947a = paint2;
        this.f1950d = H.a.h(-16777216, 68);
        this.f1951e = H.a.h(-16777216, 20);
        this.f1952f = H.a.h(-16777216, 0);
        paint2.setColor(this.f1950d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f1948b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f1949c = new Paint(paint3);
    }
}
