package u0;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: b, reason: collision with root package name */
    public static final M f23443b;

    /* renamed from: c, reason: collision with root package name */
    public static final M f23444c;

    /* renamed from: d, reason: collision with root package name */
    public static final L f23445d;

    /* renamed from: e, reason: collision with root package name */
    public static final L f23446e;

    /* renamed from: f, reason: collision with root package name */
    public static final M f23447f;

    /* renamed from: g, reason: collision with root package name */
    public static final L f23448g;

    /* renamed from: h, reason: collision with root package name */
    public static final L f23449h;

    /* renamed from: i, reason: collision with root package name */
    public static final M f23450i;
    public static final L j;

    /* renamed from: k, reason: collision with root package name */
    public static final L f23451k;

    /* renamed from: l, reason: collision with root package name */
    public static final M f23452l;

    /* renamed from: m, reason: collision with root package name */
    public static final L f23453m;

    /* renamed from: n, reason: collision with root package name */
    public static final L f23454n;

    /* renamed from: o, reason: collision with root package name */
    public static final M f23455o;

    /* renamed from: p, reason: collision with root package name */
    public static final L f23456p;

    /* renamed from: q, reason: collision with root package name */
    public static final L f23457q;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23458a;

    static {
        boolean z9 = false;
        f23443b = new M(2, z9);
        f23444c = new M(4, z9);
        boolean z10 = true;
        f23445d = new L(4, z10);
        f23446e = new L(5, z10);
        f23447f = new M(3, z9);
        f23448g = new L(6, z10);
        f23449h = new L(7, z10);
        f23450i = new M(1, z9);
        j = new L(2, z10);
        f23451k = new L(3, z10);
        f23452l = new M(0, z9);
        f23453m = new L(0, z10);
        f23454n = new L(1, z10);
        f23455o = new M(5, z10);
        f23456p = new L(8, z10);
        f23457q = new L(9, z10);
    }

    public T(boolean z9) {
        this.f23458a = z9;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
