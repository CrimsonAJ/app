package j3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class D0 implements InterfaceC1453f {

    /* renamed from: r, reason: collision with root package name */
    public static final Object f19300r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static final Object f19301s = new Object();

    /* renamed from: t, reason: collision with root package name */
    public static final Y f19302t;

    /* renamed from: b, reason: collision with root package name */
    public Object f19304b;

    /* renamed from: d, reason: collision with root package name */
    public Object f19306d;

    /* renamed from: e, reason: collision with root package name */
    public long f19307e;

    /* renamed from: f, reason: collision with root package name */
    public long f19308f;

    /* renamed from: g, reason: collision with root package name */
    public long f19309g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19310h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19311i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public T f19312k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19313l;

    /* renamed from: m, reason: collision with root package name */
    public long f19314m;

    /* renamed from: n, reason: collision with root package name */
    public long f19315n;

    /* renamed from: o, reason: collision with root package name */
    public int f19316o;

    /* renamed from: p, reason: collision with root package name */
    public int f19317p;

    /* renamed from: q, reason: collision with root package name */
    public long f19318q;

    /* renamed from: a, reason: collision with root package name */
    public Object f19303a = f19300r;

    /* renamed from: c, reason: collision with root package name */
    public Y f19305c = f19302t;

    /* JADX WARN: Type inference failed for: r11v0, types: [j3.P, j3.Q] */
    static {
        boolean z9;
        U u9;
        O o9 = new O();
        Y2.r rVar = new Y2.r(6);
        List list = Collections.EMPTY_LIST;
        P5.S s9 = P5.S.f5926e;
        V v8 = V.f19480c;
        Uri uri = Uri.EMPTY;
        if (((Uri) rVar.f8648b) != null && ((UUID) rVar.f8647a) == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        AbstractC1566a.m(z9);
        S s10 = null;
        if (uri != null) {
            if (((UUID) rVar.f8647a) != null) {
                s10 = new S(rVar);
            }
            u9 = new U(uri, null, s10, list, s9);
        } else {
            u9 = null;
        }
        f19302t = new Y("com.google.android.exoplayer2.Timeline", new P(o9), u9, new T(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C1446b0.f19533Z, v8);
    }

    public final boolean a() {
        boolean z9;
        boolean z10;
        boolean z11 = this.j;
        if (this.f19312k != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z11 == z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC1566a.m(z10);
        if (this.f19312k == null) {
            return false;
        }
        return true;
    }

    public final void b(Object obj, Y y9, Object obj2, long j, long j4, long j9, boolean z9, boolean z10, T t7, long j10, long j11, int i9, int i10, long j12) {
        Y y10;
        boolean z11;
        this.f19303a = obj;
        if (y9 != null) {
            y10 = y9;
        } else {
            y10 = f19302t;
        }
        this.f19305c = y10;
        if (y9 != null) {
            U u9 = y9.f19492b;
        }
        this.f19304b = null;
        this.f19306d = obj2;
        this.f19307e = j;
        this.f19308f = j4;
        this.f19309g = j9;
        this.f19310h = z9;
        this.f19311i = z10;
        if (t7 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.j = z11;
        this.f19312k = t7;
        this.f19314m = j10;
        this.f19315n = j11;
        this.f19316o = i9;
        this.f19317p = i10;
        this.f19318q = j12;
        this.f19313l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && D0.class.equals(obj.getClass())) {
            D0 d02 = (D0) obj;
            if (l4.y.a(this.f19303a, d02.f19303a) && l4.y.a(this.f19305c, d02.f19305c) && l4.y.a(this.f19306d, d02.f19306d) && l4.y.a(this.f19312k, d02.f19312k) && this.f19307e == d02.f19307e && this.f19308f == d02.f19308f && this.f19309g == d02.f19309g && this.f19310h == d02.f19310h && this.f19311i == d02.f19311i && this.f19313l == d02.f19313l && this.f19314m == d02.f19314m && this.f19315n == d02.f19315n && this.f19316o == d02.f19316o && this.f19317p == d02.f19317p && this.f19318q == d02.f19318q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f19305c.hashCode() + ((this.f19303a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f19306d;
        int i9 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        T t7 = this.f19312k;
        if (t7 != null) {
            i9 = t7.hashCode();
        }
        int i11 = (i10 + i9) * 31;
        long j = this.f19307e;
        int i12 = (i11 + ((int) (j ^ (j >>> 32)))) * 31;
        long j4 = this.f19308f;
        int i13 = (i12 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j9 = this.f19309g;
        int i14 = (((((((i13 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.f19310h ? 1 : 0)) * 31) + (this.f19311i ? 1 : 0)) * 31) + (this.f19313l ? 1 : 0)) * 31;
        long j10 = this.f19314m;
        int i15 = (i14 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f19315n;
        int i16 = (((((i15 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f19316o) * 31) + this.f19317p) * 31;
        long j12 = this.f19318q;
        return i16 + ((int) (j12 ^ (j12 >>> 32)));
    }
}
