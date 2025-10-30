package k4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class I extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final int f19993a;

    /* renamed from: b, reason: collision with root package name */
    public final J f19994b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19995c;

    /* renamed from: d, reason: collision with root package name */
    public H f19996d;

    /* renamed from: e, reason: collision with root package name */
    public IOException f19997e;

    /* renamed from: f, reason: collision with root package name */
    public int f19998f;

    /* renamed from: g, reason: collision with root package name */
    public Thread f19999g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20000h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f20001i;
    public final /* synthetic */ M j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(M m9, Looper looper, J j, H h7, int i9, long j4) {
        super(looper);
        this.j = m9;
        this.f19994b = j;
        this.f19996d = h7;
        this.f19993a = i9;
        this.f19995c = j4;
    }

    public final void a(boolean z9) {
        this.f20001i = z9;
        this.f19997e = null;
        if (hasMessages(0)) {
            this.f20000h = true;
            removeMessages(0);
            if (!z9) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f20000h = true;
                    this.f19994b.c();
                    Thread thread = this.f19999g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z9) {
            this.j.f20006b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            H h7 = this.f19996d;
            h7.getClass();
            h7.s(this.f19994b, elapsedRealtime, elapsedRealtime - this.f19995c, true);
            this.f19996d = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (!this.f20001i) {
            int i9 = message.what;
            if (i9 == 0) {
                this.f19997e = null;
                M m9 = this.j;
                ExecutorService executorService = m9.f20005a;
                I i10 = m9.f20006b;
                i10.getClass();
                executorService.execute(i10);
                return;
            }
            if (i9 != 3) {
                this.j.f20006b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f19995c;
                H h7 = this.f19996d;
                h7.getClass();
                if (this.f20000h) {
                    h7.s(this.f19994b, elapsedRealtime, j, false);
                    return;
                }
                int i11 = message.what;
                boolean z9 = true;
                if (i11 != 1) {
                    if (i11 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f19997e = iOException;
                        int i12 = this.f19998f + 1;
                        this.f19998f = i12;
                        B3.f e8 = h7.e(this.f19994b, iOException, i12);
                        int i13 = e8.f674a;
                        if (i13 == 3) {
                            this.j.f20007c = this.f19997e;
                            return;
                        }
                        if (i13 != 2) {
                            if (i13 == 1) {
                                this.f19998f = 1;
                            }
                            long j4 = e8.f675b;
                            if (j4 == -9223372036854775807L) {
                                j4 = Math.min((this.f19998f - 1) * 1000, 5000);
                            }
                            M m10 = this.j;
                            if (m10.f20006b != null) {
                                z9 = false;
                            }
                            AbstractC1566a.m(z9);
                            m10.f20006b = this;
                            if (j4 > 0) {
                                sendEmptyMessageDelayed(0, j4);
                                return;
                            } else {
                                this.f19997e = null;
                                m10.f20005a.execute(this);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                try {
                    h7.f(this.f19994b, elapsedRealtime, j);
                    return;
                } catch (RuntimeException e9) {
                    AbstractC1566a.u("LoadTask", "Unexpected exception handling load completed", e9);
                    this.j.f20007c = new L(e9);
                    return;
                }
            }
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        try {
            synchronized (this) {
                z9 = this.f20000h;
                this.f19999g = Thread.currentThread();
            }
            if (!z9) {
                AbstractC1566a.c("load:".concat(this.f19994b.getClass().getSimpleName()));
                try {
                    this.f19994b.a();
                    AbstractC1566a.v();
                } catch (Throwable th) {
                    AbstractC1566a.v();
                    throw th;
                }
            }
            synchronized (this) {
                this.f19999g = null;
                Thread.interrupted();
            }
            if (!this.f20001i) {
                sendEmptyMessage(1);
            }
        } catch (IOException e8) {
            if (!this.f20001i) {
                obtainMessage(2, e8).sendToTarget();
            }
        } catch (Exception e9) {
            if (!this.f20001i) {
                AbstractC1566a.u("LoadTask", "Unexpected exception loading stream", e9);
                obtainMessage(2, new L(e9)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f20001i) {
                AbstractC1566a.u("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(2, new L(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f20001i) {
                AbstractC1566a.u("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(3, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
