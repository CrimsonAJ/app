package y6;

import android.util.Log;
import f5.C1177i;
import f5.C1185q;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import p.c1;

/* loaded from: classes.dex */
public final class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f25054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Thread f25055c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G6.e f25056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f25057e;

    public j(l lVar, long j, Throwable th, Thread thread, G6.e eVar) {
        this.f25057e = lVar;
        this.f25053a = j;
        this.f25054b = th;
        this.f25055c = thread;
        this.f25056d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.firebase.messaging.u, f5.g, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        E6.e eVar;
        String str;
        long j = this.f25053a;
        long j4 = j / 1000;
        l lVar = this.f25057e;
        String e8 = lVar.e();
        if (e8 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return s8.n.p(null);
        }
        lVar.f25064c.b();
        c1 c1Var = lVar.f25073m;
        c1Var.getClass();
        String concat = "Persisting fatal event for session ".concat(e8);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        c1Var.h(this.f25054b, this.f25055c, "crash", new A6.c(e8, j4, B7.u.f1136a), true);
        try {
            eVar = lVar.f25068g;
            str = ".ae" + j;
            eVar.getClass();
        } catch (IOException e9) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e9);
        }
        if (!new File((File) eVar.f1969c, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        G6.e eVar2 = this.f25056d;
        lVar.b(false, eVar2, false);
        lVar.c(new e().f25041a, Boolean.FALSE);
        if (!lVar.f25063b.b()) {
            return s8.n.p(null);
        }
        C1185q c1185q = ((C1177i) ((AtomicReference) eVar2.f2895i).get()).f17413a;
        z6.b bVar = lVar.f25066e.f25505a;
        ?? obj = new Object();
        obj.f16512a = this;
        return c1185q.m(bVar, obj);
    }
}
