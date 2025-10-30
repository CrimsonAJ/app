package b0;

import B6.u0;
import B7.k;
import B7.t;
import B7.y;
import X.C0404d;
import X.O;
import Y7.B;
import Y7.K;
import a0.C0486a;
import androidx.datastore.preferences.protobuf.AbstractC0533t;
import androidx.datastore.preferences.protobuf.AbstractC0535v;
import androidx.datastore.preferences.protobuf.C0521g;
import androidx.datastore.preferences.protobuf.C0524j;
import androidx.datastore.preferences.protobuf.C0537x;
import androidx.datastore.preferences.protobuf.InterfaceC0534u;
import b7.C0701c;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import w.AbstractC2128h;
import x8.A;
import x8.C;
import x8.C2186f;
import x8.n;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f10465a = new Object();

    public static C0586d a(C0701c c0701c, O7.a aVar) {
        t tVar = t.f1135a;
        return new C0586d(new C0586d(new O(new Z.f(n.f24664a, new e(0, aVar)), u0.D(new C0404d(tVar, null)), c0701c, B.a(K.f8774b.plus(B.b())))));
    }

    public C0584b b(C c3) {
        int i9;
        byte[] bArr;
        try {
            a0.c o9 = a0.c.o(new C2186f(c3, 1));
            C0584b c0584b = new C0584b(false);
            h[] pairs = (h[]) Arrays.copyOf(new h[0], 0);
            kotlin.jvm.internal.h.e(pairs, "pairs");
            c0584b.b();
            if (pairs.length <= 0) {
                Map m9 = o9.m();
                kotlin.jvm.internal.h.d(m9, "preferencesProto.preferencesMap");
                for (Map.Entry entry : m9.entrySet()) {
                    String name = (String) entry.getKey();
                    a0.g value = (a0.g) entry.getValue();
                    kotlin.jvm.internal.h.d(name, "name");
                    kotlin.jvm.internal.h.d(value, "value");
                    int C8 = value.C();
                    if (C8 == 0) {
                        i9 = -1;
                    } else {
                        i9 = j.f10470a[AbstractC2128h.b(C8)];
                    }
                    switch (i9) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case 0:
                        default:
                            throw new RuntimeException();
                        case 1:
                            c0584b.d(new g(name), Boolean.valueOf(value.t()));
                            break;
                        case 2:
                            c0584b.d(new g(name), Float.valueOf(value.x()));
                            break;
                        case 3:
                            c0584b.d(new g(name), Double.valueOf(value.w()));
                            break;
                        case 4:
                            c0584b.d(new g(name), Integer.valueOf(value.y()));
                            break;
                        case 5:
                            c0584b.d(new g(name), Long.valueOf(value.z()));
                            break;
                        case 6:
                            g gVar = new g(name);
                            String A2 = value.A();
                            kotlin.jvm.internal.h.d(A2, "value.string");
                            c0584b.d(gVar, A2);
                            break;
                        case 7:
                            g gVar2 = new g(name);
                            InterfaceC0534u n7 = value.B().n();
                            kotlin.jvm.internal.h.d(n7, "value.stringSet.stringsList");
                            c0584b.d(gVar2, k.K0(n7));
                            break;
                        case 8:
                            g gVar3 = new g(name);
                            C0521g u9 = value.u();
                            int size = u9.size();
                            if (size == 0) {
                                bArr = AbstractC0535v.f9766b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                u9.e(size, bArr2);
                                bArr = bArr2;
                            }
                            kotlin.jvm.internal.h.d(bArr, "value.bytes.toByteArray()");
                            c0584b.d(gVar3, bArr);
                            break;
                        case 9:
                            throw new IOException("Value not set.", null);
                    }
                }
                return new C0584b(y.I(c0584b.a()), true);
            }
            h hVar = pairs[0];
            throw null;
        } catch (C0537x e8) {
            throw new IOException("Unable to parse preferences proto.", e8);
        }
    }

    public void c(Object obj, x8.B b9) {
        AbstractC0533t b10;
        Map a5 = ((C0584b) obj).a();
        C0486a n7 = a0.c.n();
        for (Map.Entry entry : a5.entrySet()) {
            g gVar = (g) entry.getKey();
            Object value = entry.getValue();
            String str = gVar.f10466a;
            if (value instanceof Boolean) {
                a0.f D8 = a0.g.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D8.e();
                a0.g.q((a0.g) D8.f9764b, booleanValue);
                b10 = D8.b();
            } else if (value instanceof Float) {
                a0.f D9 = a0.g.D();
                float floatValue = ((Number) value).floatValue();
                D9.e();
                a0.g.r((a0.g) D9.f9764b, floatValue);
                b10 = D9.b();
            } else if (value instanceof Double) {
                a0.f D10 = a0.g.D();
                double doubleValue = ((Number) value).doubleValue();
                D10.e();
                a0.g.o((a0.g) D10.f9764b, doubleValue);
                b10 = D10.b();
            } else if (value instanceof Integer) {
                a0.f D11 = a0.g.D();
                int intValue = ((Number) value).intValue();
                D11.e();
                a0.g.s((a0.g) D11.f9764b, intValue);
                b10 = D11.b();
            } else if (value instanceof Long) {
                a0.f D12 = a0.g.D();
                long longValue = ((Number) value).longValue();
                D12.e();
                a0.g.l((a0.g) D12.f9764b, longValue);
                b10 = D12.b();
            } else if (value instanceof String) {
                a0.f D13 = a0.g.D();
                D13.e();
                a0.g.m((a0.g) D13.f9764b, (String) value);
                b10 = D13.b();
            } else if (value instanceof Set) {
                a0.f D14 = a0.g.D();
                a0.d o9 = a0.e.o();
                kotlin.jvm.internal.h.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                o9.e();
                a0.e.l((a0.e) o9.f9764b, (Set) value);
                D14.e();
                a0.g.n((a0.g) D14.f9764b, (a0.e) o9.b());
                b10 = D14.b();
            } else if (value instanceof byte[]) {
                a0.f D15 = a0.g.D();
                byte[] bArr = (byte[]) value;
                C0521g c0521g = C0521g.f9700c;
                C0521g d9 = C0521g.d(bArr, 0, bArr.length);
                D15.e();
                a0.g.p((a0.g) D15.f9764b, d9);
                b10 = D15.b();
            } else {
                throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
            }
            n7.getClass();
            n7.e();
            a0.c.l((a0.c) n7.f9764b).put(str, (a0.g) b10);
        }
        a0.c cVar = (a0.c) n7.b();
        A a9 = new A(b9);
        int a10 = cVar.a(null);
        Logger logger = C0524j.f9726n;
        if (a10 > 4096) {
            a10 = 4096;
        }
        C0524j c0524j = new C0524j(a9, a10);
        cVar.b(c0524j);
        if (c0524j.f9730l > 0) {
            c0524j.O();
        }
    }
}
