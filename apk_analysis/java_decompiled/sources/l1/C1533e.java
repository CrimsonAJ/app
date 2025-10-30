package l1;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.mediarouter.app.C0568d;
import e1.q;
import j1.C1431a;
import q1.InterfaceC1871a;

/* renamed from: l1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1533e extends AbstractC1532d {
    public static final String j = q.j("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f20176g;

    /* renamed from: h, reason: collision with root package name */
    public final B1.f f20177h;

    /* renamed from: i, reason: collision with root package name */
    public final C0568d f20178i;

    public C1533e(Context context, InterfaceC1871a interfaceC1871a) {
        super(context, interfaceC1871a);
        this.f20176g = (ConnectivityManager) this.f20172b.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.f20177h = new B1.f(2, this);
        } else {
            this.f20178i = new C0568d(5, this);
        }
    }

    @Override // l1.AbstractC1532d
    public final Object a() {
        return f();
    }

    @Override // l1.AbstractC1532d
    public final void d() {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 24) {
            z9 = true;
        } else {
            z9 = false;
        }
        String str = j;
        if (z9) {
            try {
                q.d().a(str, "Registering network callback", new Throwable[0]);
                this.f20176g.registerDefaultNetworkCallback(this.f20177h);
                return;
            } catch (IllegalArgumentException | SecurityException e8) {
                q.d().c(str, "Received exception while registering network callback", e8);
                return;
            }
        }
        q.d().a(str, "Registering broadcast receiver", new Throwable[0]);
        this.f20172b.registerReceiver(this.f20178i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // l1.AbstractC1532d
    public final void e() {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 24) {
            z9 = true;
        } else {
            z9 = false;
        }
        String str = j;
        if (z9) {
            try {
                q.d().a(str, "Unregistering network callback", new Throwable[0]);
                this.f20176g.unregisterNetworkCallback(this.f20177h);
                return;
            } catch (IllegalArgumentException | SecurityException e8) {
                q.d().c(str, "Received exception while unregistering network callback", e8);
                return;
            }
        }
        q.d().a(str, "Unregistering broadcast receiver", new Throwable[0]);
        this.f20172b.unregisterReceiver(this.f20178i);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, j1.a] */
    public final C1431a f() {
        boolean z9;
        boolean z10;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f20176g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z11 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z9 = true;
        } else {
            z9 = false;
        }
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e8) {
            q.d().c(j, "Unable to validate active network", e8);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z10 = true;
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                    z11 = true;
                }
                ?? obj = new Object();
                obj.f19186a = z9;
                obj.f19187b = z10;
                obj.f19188c = isActiveNetworkMetered;
                obj.f19189d = z11;
                return obj;
            }
        }
        z10 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z11 = true;
        }
        ?? obj2 = new Object();
        obj2.f19186a = z9;
        obj2.f19187b = z10;
        obj2.f19188c = isActiveNetworkMetered2;
        obj2.f19189d = z11;
        return obj2;
    }
}
