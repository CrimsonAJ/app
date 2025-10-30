package F4;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class I implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f2352a;

    public /* synthetic */ I(J j) {
        this.f2352a = j;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i9 = message.what;
        if (i9 != 0) {
            if (i9 != 1) {
                return false;
            }
            synchronized (this.f2352a.f2356a) {
                try {
                    G g9 = (G) message.obj;
                    H h7 = (H) this.f2352a.f2356a.get(g9);
                    if (h7 != null && h7.f2346b == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(g9)), new Exception());
                        ComponentName componentName = h7.f2350f;
                        if (componentName == null) {
                            g9.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = g9.f2343b;
                            y.h(str);
                            componentName = new ComponentName(str, "unknown");
                        }
                        h7.onServiceDisconnected(componentName);
                    }
                } finally {
                }
            }
            return true;
        }
        synchronized (this.f2352a.f2356a) {
            try {
                G g10 = (G) message.obj;
                H h9 = (H) this.f2352a.f2356a.get(g10);
                if (h9 != null && h9.f2345a.isEmpty()) {
                    if (h9.f2347c) {
                        h9.f2351g.f2358c.removeMessages(1, h9.f2349e);
                        J j = h9.f2351g;
                        j.f2359d.c(j.f2357b, h9);
                        h9.f2347c = false;
                        h9.f2346b = 2;
                    }
                    this.f2352a.f2356a.remove(g10);
                }
            } finally {
            }
        }
        return true;
    }
}
