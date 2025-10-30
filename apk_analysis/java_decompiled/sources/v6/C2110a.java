package v6;

import B6.C0033l0;
import android.util.Log;
import d7.f;
import j2.C1435b;
import java.util.concurrent.atomic.AtomicReference;
import s6.n;
import u0.z;

/* renamed from: v6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2110a {

    /* renamed from: c, reason: collision with root package name */
    public static final C2112c f23896c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final n f23897a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f23898b = new AtomicReference(null);

    public C2110a(n nVar) {
        this.f23897a = nVar;
        nVar.a(new C1435b(17, this));
    }

    public final C2112c a(String str) {
        C2110a c2110a = (C2110a) this.f23898b.get();
        if (c2110a == null) {
            return f23896c;
        }
        return c2110a.a(str);
    }

    public final boolean b() {
        C2110a c2110a = (C2110a) this.f23898b.get();
        if (c2110a != null && c2110a.b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        C2110a c2110a = (C2110a) this.f23898b.get();
        if (c2110a != null && c2110a.c(str)) {
            return true;
        }
        return false;
    }

    public final void d(String str, long j, C0033l0 c0033l0) {
        String e8 = z.e("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", e8, null);
        }
        this.f23897a.a(new f(str, j, c0033l0));
    }
}
