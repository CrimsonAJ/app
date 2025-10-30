package u6;

import A6.r;
import android.util.Log;
import java.util.Collections;
import java.util.Map;
import l6.C1574f;
import y6.p;

/* renamed from: u6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2083b {

    /* renamed from: a, reason: collision with root package name */
    public final p f23708a;

    public C2083b(p pVar) {
        this.f23708a = pVar;
    }

    public static C2083b a() {
        C2083b c2083b = (C2083b) C1574f.c().b(C2083b.class);
        if (c2083b != null) {
            return c2083b;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void b(Throwable th) {
        if (th == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", null);
            return;
        }
        Map map = Collections.EMPTY_MAP;
        p pVar = this.f23708a;
        pVar.f25099o.f25505a.a(new r(pVar, th));
    }
}
