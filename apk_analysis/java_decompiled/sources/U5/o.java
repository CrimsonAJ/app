package U5;

import h6.Z;
import h6.f0;
import h6.g0;
import h6.h0;
import h6.i0;
import h6.j0;
import h6.k0;
import h6.r0;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7520a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static k0 a(g0 g0Var) {
        h0 z9 = k0.z();
        int B9 = g0Var.B();
        z9.h();
        k0.w((k0) z9.f16404b, B9);
        for (f0 f0Var : g0Var.A()) {
            i0 B10 = j0.B();
            String B11 = f0Var.A().B();
            B10.h();
            j0.w((j0) B10.f16404b, B11);
            Z D8 = f0Var.D();
            B10.h();
            j0.y((j0) B10.f16404b, D8);
            r0 C8 = f0Var.C();
            B10.h();
            j0.x((j0) B10.f16404b, C8);
            int B12 = f0Var.B();
            B10.h();
            j0.z((j0) B10.f16404b, B12);
            j0 j0Var = (j0) B10.c();
            z9.h();
            k0.x((k0) z9.f16404b, j0Var);
        }
        return (k0) z9.c();
    }
}
