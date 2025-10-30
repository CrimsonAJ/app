package com.google.android.gms.internal.cast;

import D4.InterfaceC0093l;
import android.os.Parcel;
import f5.C1177i;
import java.io.IOException;
import u4.C2077b;

/* renamed from: com.google.android.gms.internal.cast.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0886w0 implements Y2, V2.e, InterfaceC0093l, V {

    /* renamed from: b, reason: collision with root package name */
    public static final C0886w0 f15080b = new C0886w0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0886w0 f15081c = new C0886w0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0886w0 f15082d = new C0886w0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0886w0 f15083e = new C0886w0(3);

    /* renamed from: f, reason: collision with root package name */
    public static final C0886w0 f15084f = new C0886w0(4);

    /* renamed from: g, reason: collision with root package name */
    public static final C0886w0 f15085g = new C0886w0(5);

    /* renamed from: h, reason: collision with root package name */
    public static final C0886w0 f15086h = new C0886w0(6);

    /* renamed from: i, reason: collision with root package name */
    public static final C0886w0 f15087i = new C0886w0(7);
    public static final C0886w0 j = new C0886w0(8);

    /* renamed from: k, reason: collision with root package name */
    public static final C0886w0 f15088k = new C0886w0(9);

    /* renamed from: l, reason: collision with root package name */
    public static final C0886w0 f15089l = new C0886w0(10);

    /* renamed from: m, reason: collision with root package name */
    public static final C0886w0 f15090m = new C0886w0(11);

    /* renamed from: n, reason: collision with root package name */
    public static final C0886w0 f15091n = new C0886w0(12);

    /* renamed from: o, reason: collision with root package name */
    public static final C0886w0 f15092o = new C0886w0(13);

    /* renamed from: p, reason: collision with root package name */
    public static final C0886w0 f15093p = new C0886w0(14);

    /* renamed from: q, reason: collision with root package name */
    public static final C0886w0 f15094q = new C0886w0(15);

    /* renamed from: r, reason: collision with root package name */
    public static final C0886w0 f15095r = new C0886w0(16);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15096a;

    public /* synthetic */ C0886w0(int i9) {
        this.f15096a = i9;
    }

    @Override // D4.InterfaceC0093l
    public void H(Object obj, Object obj2) {
        K k5 = new K((C1177i) obj2);
        S s9 = (S) ((U) obj).u();
        Parcel Q7 = s9.Q();
        C.d(Q7, k5);
        s9.g1(Q7, 2);
    }

    @Override // com.google.android.gms.internal.cast.V
    public Object a() {
        switch (this.f15096a) {
            case 19:
                throw new IllegalStateException();
            default:
                y4.b bVar = i3.f14868v;
                y4.b bVar2 = C2077b.f23643k;
                F4.y.d();
                C2077b c2077b = C2077b.f23645m;
                F4.y.h(c2077b);
                F4.y.d();
                return c2077b.f23650e.f23658a;
        }
    }

    @Override // V2.e
    public Object apply(Object obj) {
        O0 o02 = (O0) obj;
        try {
            int i9 = o02.i();
            byte[] bArr = new byte[i9];
            J2 j22 = new J2(i9, bArr);
            g3 a5 = d3.f14823c.a(O0.class);
            W2 w22 = j22.f14734d;
            if (w22 == null) {
                w22 = new W2(j22);
            }
            a5.a(o02, w22);
            if (i9 - j22.f14737g == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e8) {
            throw new RuntimeException(A0.a.n("Serializing ", O0.class.getName(), " to a byte array threw an IOException (should never happen)."), e8);
        }
    }

    @Override // com.google.android.gms.internal.cast.Y2
    public f3 b(Class cls) {
        switch (this.f15096a) {
            case 14:
                if (N2.class.isAssignableFrom(cls)) {
                    try {
                        return (f3) N2.k(cls.asSubclass(N2.class)).h(3, null);
                    } catch (Exception e8) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.cast.Y2
    public boolean c(Class cls) {
        switch (this.f15096a) {
            case 14:
                return N2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    public /* synthetic */ C0886w0(L l9) {
        this.f15096a = 18;
    }
}
