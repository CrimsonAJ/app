package t0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import f5.C1183o;
import j2.C1435b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class W extends AbstractC1986u implements ServiceConnection {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f22924q = 0;

    /* renamed from: i, reason: collision with root package name */
    public final ComponentName f22925i;
    public final T4.d j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f22926k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f22927l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22928m;

    /* renamed from: n, reason: collision with root package name */
    public Q f22929n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22930o;

    /* renamed from: p, reason: collision with root package name */
    public C1435b f22931p;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T4.d, android.os.Handler] */
    public W(Context context, ComponentName componentName) {
        super(context, new C1183o(16, componentName));
        this.f22926k = new ArrayList();
        this.f22925i = componentName;
        this.j = new Handler();
    }

    @Override // t0.AbstractC1986u
    public final r a(String str, C1985t c1985t) {
        if (str != null) {
            C1987v c1987v = this.f23041g;
            if (c1987v != null) {
                List list = c1987v.f23044b;
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    if (((C1980n) list.get(i9)).d().equals(str)) {
                        U u9 = new U(this, str, c1985t);
                        this.f22926k.add(u9);
                        if (this.f22930o) {
                            u9.c(this.f22929n);
                        }
                        l();
                        return u9;
                    }
                }
                return null;
            }
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Override // t0.AbstractC1986u
    public final AbstractC1984s c(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return i(str, str2, C1985t.f23033b);
            }
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // t0.AbstractC1986u
    public final AbstractC1984s d(String str, C1985t c1985t) {
        if (str != null) {
            return i(str, null, c1985t);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // t0.AbstractC1986u
    public final void e(C1981o c1981o) {
        Bundle bundle;
        if (this.f22930o) {
            Q q9 = this.f22929n;
            int i9 = q9.f22899d;
            q9.f22899d = i9 + 1;
            if (c1981o != null) {
                bundle = c1981o.f23016a;
            } else {
                bundle = null;
            }
            q9.b(10, i9, 0, bundle, null);
        }
        l();
    }

    public final void h() {
        int i9;
        if (!this.f22928m) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.f22925i);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i9 = 4097;
                } else {
                    i9 = 1;
                }
                this.f22928m = this.f23035a.bindService(intent, this, i9);
            } catch (SecurityException unused) {
            }
        }
    }

    public final V i(String str, String str2, C1985t c1985t) {
        C1987v c1987v = this.f23041g;
        if (c1987v != null) {
            List list = c1987v.f23044b;
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((C1980n) list.get(i9)).d().equals(str)) {
                    V v8 = new V(this, str, str2, c1985t);
                    this.f22926k.add(v8);
                    if (this.f22930o) {
                        v8.c(this.f22929n);
                    }
                    l();
                    return v8;
                }
            }
            return null;
        }
        return null;
    }

    public final void j() {
        if (this.f22929n != null) {
            f(null);
            this.f22930o = false;
            ArrayList arrayList = this.f22926k;
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((S) arrayList.get(i9)).b();
            }
            Q q9 = this.f22929n;
            q9.b(2, 0, 0, null, null);
            q9.f22897b.f18038b.clear();
            q9.f22896a.getBinder().unlinkToDeath(q9, 0);
            q9.f22904i.j.post(new P(q9, 0));
            this.f22929n = null;
        }
    }

    public final void k() {
        if (this.f22928m) {
            this.f22928m = false;
            j();
            try {
                this.f23035a.unbindService(this);
            } catch (IllegalArgumentException e8) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e8);
            }
        }
    }

    public final void l() {
        if (this.f22927l && (this.f23039e != null || !this.f22926k.isEmpty())) {
            h();
        } else {
            k();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger;
        if (this.f22928m) {
            j();
            if (iBinder != null) {
                messenger = new Messenger(iBinder);
            } else {
                messenger = null;
            }
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        Q q9 = new Q(this, messenger);
                        int i9 = q9.f22899d;
                        q9.f22899d = i9 + 1;
                        q9.f22902g = i9;
                        if (q9.b(1, i9, 4, null, null)) {
                            try {
                                q9.f22896a.getBinder().linkToDeath(q9, 0);
                                this.f22929n = q9;
                                return;
                            } catch (RemoteException unused) {
                                q9.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        j();
    }

    public final String toString() {
        return "Service connection " + this.f22925i.flattenToShortString();
    }
}
