package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.AbstractServiceC0564z;
import e1.q;
import h1.C1268g;
import java.util.HashMap;
import java.util.WeakHashMap;
import o1.k;

/* loaded from: classes.dex */
public class SystemAlarmService extends AbstractServiceC0564z {

    /* renamed from: d, reason: collision with root package name */
    public static final String f10434d = q.j("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public C1268g f10435b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10436c;

    public final void a() {
        this.f10436c = true;
        q.d().a(f10434d, "All commands completed in dispatcher", new Throwable[0]);
        String str = k.f21484a;
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = k.f21485b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                q.d().k(k.f21484a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.AbstractServiceC0564z, android.app.Service
    public final void onCreate() {
        super.onCreate();
        C1268g c1268g = new C1268g(this);
        this.f10435b = c1268g;
        if (c1268g.j != null) {
            q.d().c(C1268g.f17853k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            c1268g.j = this;
        }
        this.f10436c = false;
    }

    @Override // androidx.lifecycle.AbstractServiceC0564z, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f10436c = true;
        this.f10435b.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i9, int i10) {
        super.onStartCommand(intent, i9, i10);
        if (this.f10436c) {
            q.d().i(f10434d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f10435b.e();
            C1268g c1268g = new C1268g(this);
            this.f10435b = c1268g;
            if (c1268g.j != null) {
                q.d().c(C1268g.f17853k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                c1268g.j = this;
            }
            this.f10436c = false;
        }
        if (intent != null) {
            this.f10435b.b(intent, i10);
            return 3;
        }
        return 3;
    }
}
