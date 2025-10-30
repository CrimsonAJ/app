package androidx.work.impl.foreground;

import A4.j;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0564z;
import e1.q;
import f1.k;
import java.util.UUID;
import m1.C1583a;
import o1.C1666a;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0564z {

    /* renamed from: f, reason: collision with root package name */
    public static final String f10441f = q.j("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public Handler f10442b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10443c;

    /* renamed from: d, reason: collision with root package name */
    public C1583a f10444d;

    /* renamed from: e, reason: collision with root package name */
    public NotificationManager f10445e;

    public final void a() {
        this.f10442b = new Handler(Looper.getMainLooper());
        this.f10445e = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1583a c1583a = new C1583a(getApplicationContext());
        this.f10444d = c1583a;
        if (c1583a.f20673i != null) {
            q.d().c(C1583a.j, "A callback already exists.", new Throwable[0]);
        } else {
            c1583a.f20673i = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0564z, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC0564z, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f10444d.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i9, int i10) {
        super.onStartCommand(intent, i9, i10);
        boolean z9 = this.f10443c;
        String str = f10441f;
        if (z9) {
            q.d().i(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f10444d.g();
            a();
            this.f10443c = false;
        }
        if (intent != null) {
            C1583a c1583a = this.f10444d;
            c1583a.getClass();
            String action = intent.getAction();
            boolean equals = "ACTION_START_FOREGROUND".equals(action);
            String str2 = C1583a.j;
            k kVar = c1583a.f20665a;
            if (equals) {
                q.d().i(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
                c1583a.f20666b.i(new j(c1583a, kVar.j, intent.getStringExtra("KEY_WORKSPEC_ID"), 17, false));
                c1583a.f(intent);
                return 3;
            }
            if ("ACTION_NOTIFY".equals(action)) {
                c1583a.f(intent);
                return 3;
            }
            if ("ACTION_CANCEL_WORK".equals(action)) {
                q.d().i(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    UUID fromString = UUID.fromString(stringExtra);
                    kVar.getClass();
                    kVar.f17301k.i(new C1666a(kVar, fromString));
                    return 3;
                }
                return 3;
            }
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                q.d().i(str2, "Stopping foreground service", new Throwable[0]);
                SystemForegroundService systemForegroundService = c1583a.f20673i;
                if (systemForegroundService != null) {
                    systemForegroundService.f10443c = true;
                    q.d().a(str, "All commands completed.", new Throwable[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }
}
