package k4;

import android.os.Looper;
import android.os.SystemClock;
import d0.ThreadFactoryC1083a;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class M implements N {

    /* renamed from: d, reason: collision with root package name */
    public static final B3.f f20002d = new B3.f(0, -9223372036854775807L, false);

    /* renamed from: e, reason: collision with root package name */
    public static final B3.f f20003e = new B3.f(2, -9223372036854775807L, false);

    /* renamed from: f, reason: collision with root package name */
    public static final B3.f f20004f = new B3.f(3, -9223372036854775807L, false);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f20005a;

    /* renamed from: b, reason: collision with root package name */
    public I f20006b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f20007c;

    public M(String str) {
        String e8 = u0.z.e("ExoPlayer:Loader:", str);
        int i9 = l4.y.f20553a;
        this.f20005a = Executors.newSingleThreadExecutor(new ThreadFactoryC1083a(e8, 1));
    }

    public final void a() {
        I i9 = this.f20006b;
        AbstractC1566a.n(i9);
        i9.a(false);
    }

    @Override // k4.N
    public final void b() {
        IOException iOException;
        IOException iOException2 = this.f20007c;
        if (iOException2 == null) {
            I i9 = this.f20006b;
            if (i9 != null && (iOException = i9.f19997e) != null && i9.f19998f > i9.f19993a) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }

    public final boolean c() {
        if (this.f20007c != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f20006b != null) {
            return true;
        }
        return false;
    }

    public final void e(K k5) {
        I i9 = this.f20006b;
        if (i9 != null) {
            i9.a(true);
        }
        ExecutorService executorService = this.f20005a;
        if (k5 != null) {
            executorService.execute(new A4.e(29, k5));
        }
        executorService.shutdown();
    }

    public final long f(J j, H h7, int i9) {
        boolean z9;
        Looper myLooper = Looper.myLooper();
        AbstractC1566a.n(myLooper);
        this.f20007c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        I i10 = new I(this, myLooper, j, h7, i9, elapsedRealtime);
        if (this.f20006b == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        this.f20006b = i10;
        i10.f19997e = null;
        this.f20005a.execute(i10);
        return elapsedRealtime;
    }
}
