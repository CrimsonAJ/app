package A4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public int f366a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Messenger f367b;

    /* renamed from: c, reason: collision with root package name */
    public A1.g f368c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f369d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q f371f;

    public n(q qVar) {
        this.f371f = qVar;
        Handler handler = new Handler(Looper.getMainLooper(), new m(0, this));
        Looper.getMainLooper();
        this.f367b = new Messenger(handler);
        this.f369d = new ArrayDeque();
        this.f370e = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [A4.p, java.lang.Exception] */
    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i9 = this.f366a;
            if (i9 != 0) {
                if (i9 != 1 && i9 != 2) {
                    if (i9 != 3) {
                        return;
                    }
                    this.f366a = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f366a = 4;
                J4.a.b().c((Context) this.f371f.f379b, this);
                ?? exc = new Exception(str, securityException);
                Iterator it = this.f369d.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).b(exc);
                }
                this.f369d.clear();
                for (int i10 = 0; i10 < this.f370e.size(); i10++) {
                    ((o) this.f370e.valueAt(i10)).b(exc);
                }
                this.f370e.clear();
                return;
            }
            throw new IllegalStateException();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.f366a == 2 && this.f369d.isEmpty() && this.f370e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f366a = 3;
                J4.a.b().c((Context) this.f371f.f379b, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean d(o oVar) {
        int i9 = this.f366a;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return false;
                }
                this.f369d.add(oVar);
                ((ScheduledExecutorService) this.f371f.f380c).execute(new l(this, 0));
                return true;
            }
            this.f369d.add(oVar);
            return true;
        }
        this.f369d.add(oVar);
        if (this.f366a == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f366a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!J4.a.b().a((Context) this.f371f.f379b, intent, this, 1)) {
                    a("Unable to bind to service");
                } else {
                    ((ScheduledExecutorService) this.f371f.f380c).schedule(new l(this, 1), 30L, TimeUnit.SECONDS);
                }
            } catch (SecurityException e8) {
                b("Unable to bind to service", e8);
            }
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f371f.f380c).execute(new S5.o(this, 1, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f371f.f380c).execute(new l(this, 2));
    }
}
