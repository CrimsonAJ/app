package o0;

import android.os.Handler;
import android.os.Looper;
import d2.v;
import java.util.concurrent.atomic.AtomicBoolean;
import s4.C1957d;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1664a implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static Handler f21451f;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1957d f21456e;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f21453b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f21454c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f21455d = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final C1665b f21452a = new C1665b(this, new Q4.b(3, this));

    public RunnableC1664a(C1957d c1957d) {
        this.f21456e = c1957d;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (RunnableC1664a.class) {
            try {
                if (f21451f == null) {
                    f21451f = new Handler(Looper.getMainLooper());
                }
                handler = f21451f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new v(this, 12, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21456e.b();
    }
}
