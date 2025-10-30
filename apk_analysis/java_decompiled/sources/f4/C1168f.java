package f4;

import android.text.Layout;

/* renamed from: f4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1168f {

    /* renamed from: a, reason: collision with root package name */
    public String f17395a;

    /* renamed from: b, reason: collision with root package name */
    public int f17396b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17397c;

    /* renamed from: d, reason: collision with root package name */
    public int f17398d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17399e;

    /* renamed from: k, reason: collision with root package name */
    public float f17404k;

    /* renamed from: l, reason: collision with root package name */
    public String f17405l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f17408o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f17409p;

    /* renamed from: r, reason: collision with root package name */
    public C1164b f17411r;

    /* renamed from: f, reason: collision with root package name */
    public int f17400f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f17401g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f17402h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f17403i = -1;
    public int j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f17406m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f17407n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f17410q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f17412s = Float.MAX_VALUE;

    public final void a(C1168f c1168f) {
        int i9;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c1168f != null) {
            if (!this.f17397c && c1168f.f17397c) {
                this.f17396b = c1168f.f17396b;
                this.f17397c = true;
            }
            if (this.f17402h == -1) {
                this.f17402h = c1168f.f17402h;
            }
            if (this.f17403i == -1) {
                this.f17403i = c1168f.f17403i;
            }
            if (this.f17395a == null && (str = c1168f.f17395a) != null) {
                this.f17395a = str;
            }
            if (this.f17400f == -1) {
                this.f17400f = c1168f.f17400f;
            }
            if (this.f17401g == -1) {
                this.f17401g = c1168f.f17401g;
            }
            if (this.f17407n == -1) {
                this.f17407n = c1168f.f17407n;
            }
            if (this.f17408o == null && (alignment2 = c1168f.f17408o) != null) {
                this.f17408o = alignment2;
            }
            if (this.f17409p == null && (alignment = c1168f.f17409p) != null) {
                this.f17409p = alignment;
            }
            if (this.f17410q == -1) {
                this.f17410q = c1168f.f17410q;
            }
            if (this.j == -1) {
                this.j = c1168f.j;
                this.f17404k = c1168f.f17404k;
            }
            if (this.f17411r == null) {
                this.f17411r = c1168f.f17411r;
            }
            if (this.f17412s == Float.MAX_VALUE) {
                this.f17412s = c1168f.f17412s;
            }
            if (!this.f17399e && c1168f.f17399e) {
                this.f17398d = c1168f.f17398d;
                this.f17399e = true;
            }
            if (this.f17406m == -1 && (i9 = c1168f.f17406m) != -1) {
                this.f17406m = i9;
            }
        }
    }
}
