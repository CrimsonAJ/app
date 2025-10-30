package B2;

import Y2.r;
import com.google.android.gms.internal.measurement.D1;
import g6.o;
import i8.G;
import i8.L;
import i8.x;
import i8.y;
import i8.z;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public final class h implements z {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f628a = new AtomicReference(o.f17761a.n());

    @Override // i8.z
    public final L a(o8.d dVar) {
        AtomicReference atomicReference = f628a;
        G g9 = dVar.f21756e;
        try {
            L b9 = dVar.b(g9);
            if (b9.f19032d > 500) {
                String[] o9 = o.f17761a.o();
                int l02 = B7.j.l0(o9, D1.o());
                if (l02 < (o9.length - 1) + l02) {
                    try {
                        b9.close();
                    } catch (Exception unused) {
                    }
                    try {
                        String value = o9[(l02 + 1) % o9.length];
                        kotlin.jvm.internal.h.e(value, "value");
                        atomicReference.set(value);
                        x f9 = g9.f19005a.f();
                        f9.d(W7.d.Y(D1.o(), o.f17761a.M()));
                        y b10 = f9.b();
                        r b11 = g9.b();
                        b11.f8647a = b10;
                        return dVar.b(b11.o());
                    } catch (IOException e8) {
                        throw e8;
                    } catch (Exception e9) {
                        throw new IOException(e9);
                    }
                }
            }
            return b9;
        } catch (Exception e10) {
            if (!(e10 instanceof UnknownHostException) && !(e10 instanceof SSLException) && !(e10 instanceof SocketTimeoutException)) {
                throw e10;
            }
            o oVar = o.f17761a;
            String[] o10 = oVar.o();
            int l03 = B7.j.l0(o10, D1.o());
            if (l03 < (o10.length - 1) + l03) {
                try {
                    String value2 = o10[(l03 + 1) % o10.length];
                    kotlin.jvm.internal.h.e(value2, "value");
                    atomicReference.set(value2);
                    x f10 = g9.f19005a.f();
                    f10.d(W7.d.Y(D1.o(), oVar.M()));
                    y b12 = f10.b();
                    r b13 = g9.b();
                    b13.f8647a = b12;
                    return dVar.b(b13.o());
                } catch (IOException e11) {
                    throw e11;
                } catch (Exception unused2) {
                    throw e10;
                }
            }
            throw e10;
        }
    }
}
