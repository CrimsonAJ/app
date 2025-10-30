package V6;

import F5.e;
import T6.k;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f7807d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f7808e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final k f7809a;

    /* renamed from: b, reason: collision with root package name */
    public long f7810b;

    /* renamed from: c, reason: collision with root package name */
    public int f7811c;

    public d() {
        if (e.f2463b == null) {
            Pattern pattern = k.f7234c;
            e.f2463b = new e(15);
        }
        e eVar = e.f2463b;
        if (k.f7235d == null) {
            k.f7235d = new k(eVar);
        }
        this.f7809a = k.f7235d;
    }

    public final synchronized long a(int i9) {
        boolean z9;
        if (i9 != 429 && (i9 < 500 || i9 >= 600)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            return f7807d;
        }
        double pow = Math.pow(2.0d, this.f7811c);
        this.f7809a.getClass();
        return (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f7808e);
    }

    public final synchronized boolean b() {
        boolean z9;
        if (this.f7811c != 0) {
            this.f7809a.f7236a.getClass();
            if (System.currentTimeMillis() <= this.f7810b) {
                z9 = false;
            }
        }
        z9 = true;
        return z9;
    }

    public final synchronized void c() {
        this.f7811c = 0;
    }

    public final synchronized void d(int i9) {
        if ((i9 < 200 || i9 >= 300) && i9 != 401 && i9 != 404) {
            this.f7811c++;
            long a5 = a(i9);
            this.f7809a.f7236a.getClass();
            this.f7810b = System.currentTimeMillis() + a5;
            return;
        }
        c();
    }
}
