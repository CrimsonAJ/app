package A3;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.L;
import java.util.Arrays;
import q3.C1904i;
import q3.InterfaceC1907l;

/* renamed from: A3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e implements InterfaceC0008i {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f106v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f107a;

    /* renamed from: d, reason: collision with root package name */
    public final String f110d;

    /* renamed from: e, reason: collision with root package name */
    public String f111e;

    /* renamed from: f, reason: collision with root package name */
    public q3.u f112f;

    /* renamed from: g, reason: collision with root package name */
    public q3.u f113g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f116k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f117l;

    /* renamed from: o, reason: collision with root package name */
    public int f120o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f121p;

    /* renamed from: r, reason: collision with root package name */
    public int f123r;

    /* renamed from: t, reason: collision with root package name */
    public q3.u f125t;

    /* renamed from: u, reason: collision with root package name */
    public long f126u;

    /* renamed from: b, reason: collision with root package name */
    public final Z3.f f108b = new Z3.f(7, new byte[7]);

    /* renamed from: c, reason: collision with root package name */
    public final A4.r f109c = new A4.r(Arrays.copyOf(f106v, 10));

    /* renamed from: h, reason: collision with root package name */
    public int f114h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f115i = 0;
    public int j = 256;

    /* renamed from: m, reason: collision with root package name */
    public int f118m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f119n = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f122q = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f124s = -9223372036854775807L;

    public C0004e(String str, boolean z9) {
        this.f107a = z9;
        this.f110d = str;
    }

    @Override // A3.InterfaceC0008i
    public final void a() {
        this.f124s = -9223372036854775807L;
        this.f117l = false;
        this.f114h = 0;
        this.f115i = 0;
        this.j = 256;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0213, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // A3.InterfaceC0008i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(A4.r r24) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.C0004e.c(A4.r):void");
    }

    @Override // A3.InterfaceC0008i
    public final void e(long j, int i9) {
        if (j != -9223372036854775807L) {
            this.f124s = j;
        }
    }

    @Override // A3.InterfaceC0008i
    public final void f(InterfaceC1907l interfaceC1907l, I i9) {
        i9.a();
        i9.b();
        this.f111e = i9.f78e;
        i9.b();
        q3.u u9 = interfaceC1907l.u(i9.f77d, 1);
        this.f112f = u9;
        this.f125t = u9;
        if (this.f107a) {
            i9.a();
            i9.b();
            q3.u u10 = interfaceC1907l.u(i9.f77d, 5);
            this.f113g = u10;
            L l9 = new L();
            i9.b();
            l9.f19393a = i9.f78e;
            l9.f19402k = "application/id3";
            AbstractC0953k1.u(l9, u10);
            return;
        }
        this.f113g = new C1904i();
    }

    @Override // A3.InterfaceC0008i
    public final void d() {
    }
}
