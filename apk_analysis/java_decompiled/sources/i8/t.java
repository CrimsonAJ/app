package i8;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import x8.C2187g;
import x8.InterfaceC2188h;

/* loaded from: classes.dex */
public final class t extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final A f19150c;

    /* renamed from: a, reason: collision with root package name */
    public final List f19151a;

    /* renamed from: b, reason: collision with root package name */
    public final List f19152b;

    static {
        Pattern pattern = A.f18925d;
        f19150c = M4.a.o("application/x-www-form-urlencoded");
    }

    public t(ArrayList encodedNames, ArrayList encodedValues) {
        kotlin.jvm.internal.h.e(encodedNames, "encodedNames");
        kotlin.jvm.internal.h.e(encodedValues, "encodedValues");
        this.f19151a = k8.c.x(encodedNames);
        this.f19152b = k8.c.x(encodedValues);
    }

    @Override // i8.J
    public final long a() {
        return d(null, true);
    }

    @Override // i8.J
    public final A b() {
        return f19150c;
    }

    @Override // i8.J
    public final void c(InterfaceC2188h interfaceC2188h) {
        d(interfaceC2188h, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(InterfaceC2188h interfaceC2188h, boolean z9) {
        C2187g c2187g;
        if (z9) {
            c2187g = new Object();
        } else {
            kotlin.jvm.internal.h.b(interfaceC2188h);
            c2187g = interfaceC2188h.b();
        }
        List list = this.f19151a;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (i9 > 0) {
                c2187g.w0(38);
            }
            c2187g.B0((String) list.get(i9));
            c2187g.w0(61);
            c2187g.B0((String) this.f19152b.get(i9));
        }
        if (z9) {
            long j = c2187g.f24644b;
            c2187g.x();
            return j;
        }
        return 0L;
    }
}
