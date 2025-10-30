package i8;

import java.util.List;
import java.util.regex.Pattern;
import x8.C2187g;
import x8.C2190j;
import x8.InterfaceC2188h;

/* loaded from: classes.dex */
public final class C extends J {

    /* renamed from: e, reason: collision with root package name */
    public static final A f18932e;

    /* renamed from: f, reason: collision with root package name */
    public static final A f18933f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f18934g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f18935h;

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f18936i;

    /* renamed from: a, reason: collision with root package name */
    public final C2190j f18937a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18938b;

    /* renamed from: c, reason: collision with root package name */
    public final A f18939c;

    /* renamed from: d, reason: collision with root package name */
    public long f18940d;

    static {
        Pattern pattern = A.f18925d;
        f18932e = M4.a.o("multipart/mixed");
        M4.a.o("multipart/alternative");
        M4.a.o("multipart/digest");
        M4.a.o("multipart/parallel");
        f18933f = M4.a.o("multipart/form-data");
        f18934g = new byte[]{58, 32};
        f18935h = new byte[]{13, 10};
        f18936i = new byte[]{45, 45};
    }

    public C(C2190j boundaryByteString, A type, List list) {
        kotlin.jvm.internal.h.e(boundaryByteString, "boundaryByteString");
        kotlin.jvm.internal.h.e(type, "type");
        this.f18937a = boundaryByteString;
        this.f18938b = list;
        Pattern pattern = A.f18925d;
        this.f18939c = M4.a.o(type + "; boundary=" + boundaryByteString.q());
        this.f18940d = -1L;
    }

    @Override // i8.J
    public final long a() {
        long j = this.f18940d;
        if (j == -1) {
            long d9 = d(null, true);
            this.f18940d = d9;
            return d9;
        }
        return j;
    }

    @Override // i8.J
    public final A b() {
        return this.f18939c;
    }

    @Override // i8.J
    public final void c(InterfaceC2188h interfaceC2188h) {
        d(interfaceC2188h, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(InterfaceC2188h interfaceC2188h, boolean z9) {
        C2187g c2187g;
        InterfaceC2188h interfaceC2188h2;
        if (z9) {
            Object obj = new Object();
            c2187g = obj;
            interfaceC2188h2 = obj;
        } else {
            c2187g = null;
            interfaceC2188h2 = interfaceC2188h;
        }
        List list = this.f18938b;
        int size = list.size();
        long j = 0;
        int i9 = 0;
        while (true) {
            C2190j c2190j = this.f18937a;
            byte[] bArr = f18936i;
            byte[] bArr2 = f18935h;
            if (i9 < size) {
                B b9 = (B) list.get(i9);
                w wVar = b9.f18930a;
                kotlin.jvm.internal.h.b(interfaceC2188h2);
                interfaceC2188h2.D(bArr);
                interfaceC2188h2.A(c2190j);
                interfaceC2188h2.D(bArr2);
                int size2 = wVar.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    interfaceC2188h2.X(wVar.c(i10)).D(f18934g).X(wVar.f(i10)).D(bArr2);
                }
                J j4 = b9.f18931b;
                A b10 = j4.b();
                if (b10 != null) {
                    interfaceC2188h2.X("Content-Type: ").X(b10.f18927a).D(bArr2);
                }
                long a5 = j4.a();
                if (a5 != -1) {
                    interfaceC2188h2.X("Content-Length: ").Y(a5).D(bArr2);
                } else if (z9) {
                    kotlin.jvm.internal.h.b(c2187g);
                    c2187g.x();
                    return -1L;
                }
                interfaceC2188h2.D(bArr2);
                if (z9) {
                    j += a5;
                } else {
                    j4.c(interfaceC2188h2);
                }
                interfaceC2188h2.D(bArr2);
                i9++;
            } else {
                kotlin.jvm.internal.h.b(interfaceC2188h2);
                interfaceC2188h2.D(bArr);
                interfaceC2188h2.A(c2190j);
                interfaceC2188h2.D(bArr);
                interfaceC2188h2.D(bArr2);
                if (z9) {
                    kotlin.jvm.internal.h.b(c2187g);
                    long j9 = j + c2187g.f24644b;
                    c2187g.x();
                    return j9;
                }
                return j;
            }
        }
    }
}
