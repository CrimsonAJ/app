package z8;

import android.net.Uri;
import i8.InterfaceC1420j;
import java.io.IOException;
import java.util.List;
import k4.C1515o;

/* renamed from: z8.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2273w implements InterfaceC1420j, k4.O {

    /* renamed from: a, reason: collision with root package name */
    public final Object f25638a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25639b;

    public C2273w(k4.O o9, List list) {
        this.f25638a = o9;
        this.f25639b = list;
    }

    @Override // i8.InterfaceC1420j
    public void c(n8.g gVar, i8.L l9) {
        InterfaceC2258g interfaceC2258g = (InterfaceC2258g) this.f25638a;
        y yVar = (y) this.f25639b;
        try {
            try {
                interfaceC2258g.g(yVar, yVar.e(l9));
            } catch (Throwable th) {
                X.s(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            X.s(th2);
            try {
                interfaceC2258g.e(yVar, th2);
            } catch (Throwable th3) {
                X.s(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // i8.InterfaceC1420j
    public void f(n8.g gVar, IOException iOException) {
        try {
            ((InterfaceC2258g) this.f25638a).e((y) this.f25639b, iOException);
        } catch (Throwable th) {
            X.s(th);
            th.printStackTrace();
        }
    }

    @Override // k4.O
    public Object k(Uri uri, C1515o c1515o) {
        M3.a aVar = (M3.a) ((k4.O) this.f25638a).k(uri, c1515o);
        List list = (List) this.f25639b;
        if (list != null && !list.isEmpty()) {
            return (M3.a) aVar.a(list);
        }
        return aVar;
    }

    public C2273w(y yVar, InterfaceC2258g interfaceC2258g) {
        this.f25639b = yVar;
        this.f25638a = interfaceC2258g;
    }
}
