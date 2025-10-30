package Q3;

import F4.y;
import android.os.Bundle;
import android.text.TextUtils;
import b5.C0650n0;
import b5.C0663s;
import b5.P1;
import b5.V;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6391a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f6392b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6393c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6394d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6395e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6396f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6397g;

    public j(C0650n0 c0650n0, String str, String str2, String str3, long j, long j4, Bundle bundle) {
        C0663s c0663s;
        y.e(str2);
        y.e(str3);
        this.f6394d = str2;
        this.f6395e = str3;
        this.f6396f = true == TextUtils.isEmpty(str) ? null : str;
        this.f6392b = j;
        this.f6393c = j4;
        if (j4 != 0 && j4 > j) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10974i.c(V.t0(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    V v9 = c0650n0.f11229i;
                    C0650n0.f(v9);
                    v9.f10971f.b("Param name can't be null");
                    it.remove();
                } else {
                    P1 p12 = c0650n0.f11231l;
                    C0650n0.d(p12);
                    Object s02 = p12.s0(bundle2.get(next), next);
                    if (s02 == null) {
                        V v10 = c0650n0.f11229i;
                        C0650n0.f(v10);
                        v10.f10974i.c(c0650n0.f11232m.e(next), "Param value can't be null");
                        it.remove();
                    } else {
                        P1 p13 = c0650n0.f11231l;
                        C0650n0.d(p13);
                        p13.G0(bundle2, next, s02);
                    }
                }
            }
            c0663s = new C0663s(bundle2);
        } else {
            c0663s = new C0663s(new Bundle());
        }
        this.f6397g = c0663s;
    }

    public j a(long j, R3.m mVar) {
        long d9;
        long d10;
        i b9 = ((R3.m) this.f6395e).b();
        i b10 = mVar.b();
        if (b9 == null) {
            return new j(j, mVar, (R3.b) this.f6396f, (P3.d) this.f6394d, this.f6393c, b9);
        }
        if (!b9.q()) {
            return new j(j, mVar, (R3.b) this.f6396f, (P3.d) this.f6394d, this.f6393c, b10);
        }
        long z9 = b9.z(j);
        if (z9 == 0) {
            return new j(j, mVar, (R3.b) this.f6396f, (P3.d) this.f6394d, this.f6393c, b10);
        }
        long v8 = b9.v();
        long c3 = b9.c(v8);
        long j4 = z9 + v8;
        long j9 = j4 - 1;
        long h7 = b9.h(j9, j) + b9.c(j9);
        long v9 = b10.v();
        long c9 = b10.c(v9);
        long j10 = this.f6393c;
        if (h7 == c9) {
            d9 = j4 - v9;
        } else if (h7 >= c9) {
            if (c9 < c3) {
                d10 = j10 - (b10.d(c3, j) - v8);
                return new j(j, mVar, (R3.b) this.f6396f, (P3.d) this.f6394d, d10, b10);
            }
            d9 = b9.d(c9, j) - v9;
        } else {
            throw new IOException();
        }
        d10 = d9 + j10;
        return new j(j, mVar, (R3.b) this.f6396f, (P3.d) this.f6394d, d10, b10);
    }

    public long b(long j) {
        i iVar = (i) this.f6397g;
        long j4 = this.f6392b;
        return (iVar.A(j4, j) + (iVar.k(j4, j) + this.f6393c)) - 1;
    }

    public long c(long j) {
        return ((i) this.f6397g).h(j - this.f6393c, this.f6392b) + d(j);
    }

    public long d(long j) {
        return ((i) this.f6397g).c(j - this.f6393c);
    }

    public j e(C0650n0 c0650n0, long j) {
        return new j(c0650n0, (String) this.f6396f, (String) this.f6394d, (String) this.f6395e, this.f6392b, j, (C0663s) this.f6397g);
    }

    public String toString() {
        switch (this.f6391a) {
            case 1:
                return "Event{appId='" + ((String) this.f6394d) + "', name='" + ((String) this.f6395e) + "', params=" + ((C0663s) this.f6397g).toString() + "}";
            default:
                return super.toString();
        }
    }

    public j(C0650n0 c0650n0, String str, String str2, String str3, long j, long j4, C0663s c0663s) {
        y.e(str2);
        y.e(str3);
        y.h(c0663s);
        this.f6394d = str2;
        this.f6395e = str3;
        this.f6396f = true == TextUtils.isEmpty(str) ? null : str;
        this.f6392b = j;
        this.f6393c = j4;
        if (j4 != 0 && j4 > j) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10974i.d(V.t0(str2), V.t0(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f6397g = c0663s;
    }

    public j(long j, R3.m mVar, R3.b bVar, P3.d dVar, long j4, i iVar) {
        this.f6392b = j;
        this.f6395e = mVar;
        this.f6396f = bVar;
        this.f6393c = j4;
        this.f6394d = dVar;
        this.f6397g = iVar;
    }
}
