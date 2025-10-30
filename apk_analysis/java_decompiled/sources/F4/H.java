package F4;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class H implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2345a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f2346b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2347c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f2348d;

    /* renamed from: e, reason: collision with root package name */
    public final G f2349e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f2350f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ J f2351g;

    public H(J j, G g9) {
        this.f2351g = j;
        this.f2349e = g9;
    }

    public static B4.b a(H h7, String str, Executor executor) {
        try {
            Intent a5 = h7.f2349e.a(h7.f2351g.f2357b);
            h7.f2346b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(K4.f.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                J j = h7.f2351g;
                boolean d9 = j.f2359d.d(j.f2357b, str, a5, h7, 4225, executor);
                h7.f2347c = d9;
                if (d9) {
                    h7.f2351g.f2358c.sendMessageDelayed(h7.f2351g.f2358c.obtainMessage(1, h7.f2349e), h7.f2351g.f2361f);
                    B4.b bVar = B4.b.f683e;
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar;
                }
                h7.f2346b = 2;
                try {
                    J j4 = h7.f2351g;
                    j4.f2359d.c(j4.f2357b, h7);
                } catch (IllegalArgumentException unused) {
                }
                B4.b bVar2 = new B4.b(16);
                StrictMode.setVmPolicy(vmPolicy);
                return bVar2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (z e8) {
            return e8.f2459a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f2351g.f2356a) {
            try {
                this.f2351g.f2358c.removeMessages(1, this.f2349e);
                this.f2348d = iBinder;
                this.f2350f = componentName;
                Iterator it = this.f2345a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f2346b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f2351g.f2356a) {
            try {
                this.f2351g.f2358c.removeMessages(1, this.f2349e);
                this.f2348d = null;
                this.f2350f = componentName;
                Iterator it = this.f2345a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f2346b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
