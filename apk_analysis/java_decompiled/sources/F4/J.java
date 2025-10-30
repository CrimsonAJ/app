package F4;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2353g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static J f2354h;

    /* renamed from: i, reason: collision with root package name */
    public static HandlerThread f2355i;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2356a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f2357b;

    /* renamed from: c, reason: collision with root package name */
    public volatile T4.d f2358c;

    /* renamed from: d, reason: collision with root package name */
    public final J4.a f2359d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2360e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2361f;

    /* JADX WARN: Type inference failed for: r2v2, types: [T4.d, android.os.Handler] */
    public J(Context context, Looper looper) {
        I i9 = new I(this);
        this.f2357b = context.getApplicationContext();
        ?? handler = new Handler(looper, i9);
        Looper.getMainLooper();
        this.f2358c = handler;
        this.f2359d = J4.a.b();
        this.f2360e = 5000L;
        this.f2361f = 300000L;
    }

    public static J a(Context context) {
        synchronized (f2353g) {
            try {
                if (f2354h == null) {
                    f2354h = new J(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f2354h;
    }

    public static HandlerThread b() {
        synchronized (f2353g) {
            try {
                HandlerThread handlerThread = f2355i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f2355i = handlerThread2;
                handlerThread2.start();
                return f2355i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final B4.b c(G g9, C c3, String str, Executor executor) {
        synchronized (this.f2356a) {
            try {
                H h7 = (H) this.f2356a.get(g9);
                B4.b bVar = null;
                if (executor == null) {
                    executor = null;
                }
                if (h7 == null) {
                    h7 = new H(this, g9);
                    h7.f2345a.put(c3, c3);
                    bVar = H.a(h7, str, executor);
                    this.f2356a.put(g9, h7);
                } else {
                    this.f2358c.removeMessages(0, g9);
                    if (!h7.f2345a.containsKey(c3)) {
                        h7.f2345a.put(c3, c3);
                        int i9 = h7.f2346b;
                        if (i9 != 1) {
                            if (i9 == 2) {
                                bVar = H.a(h7, str, executor);
                            }
                        } else {
                            c3.onServiceConnected(h7.f2350f, h7.f2348d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(g9.toString()));
                    }
                }
                if (h7.f2347c) {
                    return B4.b.f683e;
                }
                if (bVar == null) {
                    bVar = new B4.b(-1);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str, ServiceConnection serviceConnection, boolean z9) {
        G g9 = new G(str, z9);
        y.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f2356a) {
            try {
                H h7 = (H) this.f2356a.get(g9);
                if (h7 != null) {
                    if (h7.f2345a.containsKey(serviceConnection)) {
                        h7.f2345a.remove(serviceConnection);
                        if (h7.f2345a.isEmpty()) {
                            this.f2358c.sendMessageDelayed(this.f2358c.obtainMessage(0, g9), this.f2360e);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(g9.toString()));
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(g9.toString()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
