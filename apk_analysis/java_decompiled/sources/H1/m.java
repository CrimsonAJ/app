package H1;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.support.v4.media.session.y;
import java.lang.ref.WeakReference;
import t1.C2004m;

/* loaded from: classes.dex */
public final class m implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2967a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2968b;

    /* renamed from: c, reason: collision with root package name */
    public B1.e f2969c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2970d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2971e = true;

    public m(C2004m c2004m) {
        this.f2967a = new WeakReference(c2004m);
    }

    public final synchronized void a() {
        B1.e fVar;
        try {
            C2004m c2004m = (C2004m) this.f2967a.get();
            if (c2004m != null) {
                if (this.f2969c == null) {
                    if (c2004m.f23100d.f2960b) {
                        Context context = c2004m.f23097a;
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                        if (connectivityManager != null && E.d.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                            try {
                                fVar = new y(connectivityManager, this);
                            } catch (Exception unused) {
                                fVar = new Q6.f(1);
                            }
                        } else {
                            fVar = new Q6.f(1);
                        }
                    } else {
                        fVar = new Q6.f(1);
                    }
                    this.f2969c = fVar;
                    this.f2971e = fVar.m();
                }
            } else {
                b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f2970d) {
                return;
            }
            this.f2970d = true;
            Context context = this.f2968b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            B1.e eVar = this.f2969c;
            if (eVar != null) {
                eVar.shutdown();
            }
            this.f2967a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((C2004m) this.f2967a.get()) == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i9) {
        C2004m c2004m = (C2004m) this.f2967a.get();
        if (c2004m != null) {
            A1.d dVar = (A1.d) c2004m.f23099c.getValue();
            if (dVar != null) {
                dVar.f10a.e(i9);
                dVar.f11b.o(i9);
            }
        } else {
            b();
        }
    }
}
