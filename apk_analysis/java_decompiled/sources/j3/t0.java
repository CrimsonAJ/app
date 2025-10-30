package j3;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f19733a;

    /* renamed from: b, reason: collision with root package name */
    public final J f19734b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.u f19735c;

    /* renamed from: d, reason: collision with root package name */
    public int f19736d;

    /* renamed from: e, reason: collision with root package name */
    public Object f19737e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f19738f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19739g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19740h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19741i;

    public t0(J j, s0 s0Var, E0 e02, int i9, l4.u uVar, Looper looper) {
        this.f19734b = j;
        this.f19733a = s0Var;
        this.f19738f = looper;
        this.f19735c = uVar;
    }

    public final synchronized void a(long j) {
        boolean z9;
        boolean z10;
        AbstractC1566a.m(this.f19739g);
        if (this.f19738f.getThread() != Thread.currentThread()) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        this.f19735c.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z10 = this.f19741i;
            if (z10 || j <= 0) {
                break;
            }
            this.f19735c.getClass();
            wait(j);
            this.f19735c.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z9) {
        this.f19740h = z9 | this.f19740h;
        this.f19741i = true;
        notifyAll();
    }

    public final void c() {
        AbstractC1566a.m(!this.f19739g);
        this.f19739g = true;
        J j = this.f19734b;
        synchronized (j) {
            if (!j.f19385y && j.f19365i.isAlive()) {
                j.f19363h.a(14, this).b();
                return;
            }
            AbstractC1566a.P("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
