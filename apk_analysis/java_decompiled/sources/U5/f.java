package U5;

import G0.H;
import android.support.v4.media.session.y;
import b6.AbstractC0698t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1030a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1050v;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import com.google.crypto.tink.shaded.protobuf.C1040k;
import h6.W;
import h6.X;
import h6.Y;
import h6.Z;
import h6.b0;
import h6.d0;
import h6.e0;
import h6.f0;
import h6.g0;
import h6.r0;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f7499c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f7500d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f7501e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7502a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7503b;

    static {
        int i9 = 0;
        f7499c = new f(i9, "ENABLED");
        f7500d = new f(i9, "DISABLED");
        f7501e = new f(i9, "DESTROYED");
    }

    public /* synthetic */ f(int i9, Object obj) {
        this.f7502a = i9;
        this.f7503b = obj;
    }

    public synchronized void a(b0 b0Var) {
        f0 e8 = e(b0Var);
        d0 d0Var = (d0) this.f7503b;
        d0Var.h();
        g0.x((g0) d0Var.f16404b, e8);
    }

    public synchronized f0 b(Y y9, r0 r0Var) {
        e0 F2;
        int g9 = g();
        if (r0Var != r0.UNKNOWN_PREFIX) {
            F2 = f0.F();
            F2.h();
            f0.w((f0) F2.f16404b, y9);
            F2.h();
            f0.z((f0) F2.f16404b, g9);
            F2.h();
            f0.y((f0) F2.f16404b);
            F2.h();
            f0.x((f0) F2.f16404b, r0Var);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (f0) F2.c();
    }

    public synchronized y c() {
        return y.I((g0) ((d0) this.f7503b).c());
    }

    public synchronized boolean d(int i9) {
        Iterator it = Collections.unmodifiableList(((g0) ((d0) this.f7503b).f16404b).A()).iterator();
        while (it.hasNext()) {
            if (((f0) it.next()).B() == i9) {
                return true;
            }
        }
        return false;
    }

    public synchronized f0 e(b0 b0Var) {
        return b(n.d(b0Var), b0Var.A());
    }

    public Y f(AbstractC1037h abstractC1037h) {
        H h7 = (H) this.f7503b;
        try {
            D.n f9 = h7.f();
            AbstractC1030a f02 = f9.f0(abstractC1037h);
            f9.k0(f02);
            AbstractC1030a X8 = f9.X(f02);
            W D8 = Y.D();
            String d9 = h7.d();
            D8.h();
            Y.w((Y) D8.f16404b, d9);
            try {
                int a5 = ((AbstractC1050v) X8).a(null);
                byte[] bArr = new byte[a5];
                C1040k c1040k = new C1040k(a5, bArr);
                X8.f(c1040k);
                if (c1040k.f16379i - c1040k.j == 0) {
                    C1036g c1036g = new C1036g(bArr);
                    D8.h();
                    Y.x((Y) D8.f16404b, c1036g);
                    X g9 = h7.g();
                    D8.h();
                    Y.y((Y) D8.f16404b, g9);
                    return (Y) D8.c();
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            } catch (IOException e8) {
                throw new RuntimeException(X8.c("ByteString"), e8);
            }
        } catch (B e9) {
            throw new GeneralSecurityException("Unexpected proto", e9);
        }
    }

    public synchronized int g() {
        int a5;
        a5 = AbstractC0698t.a();
        while (d(a5)) {
            a5 = AbstractC0698t.a();
        }
        return a5;
    }

    public synchronized void h(int i9) {
        for (int i10 = 0; i10 < ((g0) ((d0) this.f7503b).f16404b).z(); i10++) {
            try {
                f0 y9 = ((g0) ((d0) this.f7503b).f16404b).y(i10);
                if (y9.B() == i9) {
                    if (y9.D().equals(Z.ENABLED)) {
                        d0 d0Var = (d0) this.f7503b;
                        d0Var.h();
                        g0.w((g0) d0Var.f16404b, i9);
                    } else {
                        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        throw new GeneralSecurityException("key not found: " + i9);
    }

    public String toString() {
        switch (this.f7502a) {
            case 0:
                return (String) this.f7503b;
            default:
                return super.toString();
        }
    }

    public f(H h7, Class cls) {
        this.f7502a = 2;
        if (!((Map) h7.f2664b).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException("Given internalKeyMananger " + h7.toString() + " does not support primitive class " + cls.getName());
        }
        this.f7503b = h7;
    }
}
