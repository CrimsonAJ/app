package h1;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import b5.G1;
import com.google.android.gms.internal.cast.RunnableC0869s;
import e1.q;
import f1.C1160b;
import f1.InterfaceC1159a;
import f1.k;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import o1.s;

/* renamed from: h1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1268g implements InterfaceC1159a {

    /* renamed from: k, reason: collision with root package name */
    public static final String f17853k = q.j("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f17854a;

    /* renamed from: b, reason: collision with root package name */
    public final G1 f17855b;

    /* renamed from: c, reason: collision with root package name */
    public final s f17856c;

    /* renamed from: d, reason: collision with root package name */
    public final C1160b f17857d;

    /* renamed from: e, reason: collision with root package name */
    public final k f17858e;

    /* renamed from: f, reason: collision with root package name */
    public final C1263b f17859f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f17860g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f17861h;

    /* renamed from: i, reason: collision with root package name */
    public Intent f17862i;
    public SystemAlarmService j;

    public C1268g(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f17854a = applicationContext;
        this.f17859f = new C1263b(applicationContext);
        this.f17856c = new s();
        k b02 = k.b0(systemAlarmService);
        this.f17858e = b02;
        C1160b c1160b = b02.f17303m;
        this.f17857d = c1160b;
        this.f17855b = b02.f17301k;
        c1160b.b(this);
        this.f17861h = new ArrayList();
        this.f17862i = null;
        this.f17860g = new Handler(Looper.getMainLooper());
    }

    @Override // f1.InterfaceC1159a
    public final void a(String str, boolean z9) {
        String str2 = C1263b.f17833d;
        Intent intent = new Intent(this.f17854a, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z9);
        f(new RunnableC0869s(this, intent, 0, 4));
    }

    public final void b(Intent intent, int i9) {
        q d9 = q.d();
        String str = f17853k;
        d9.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i9)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            q.d().k(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && d()) {
            return;
        }
        intent.putExtra("KEY_START_ID", i9);
        synchronized (this.f17861h) {
            try {
                boolean isEmpty = this.f17861h.isEmpty();
                this.f17861h.add(intent);
                if (isEmpty) {
                    g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (this.f17860g.getLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final boolean d() {
        c();
        synchronized (this.f17861h) {
            try {
                ArrayList arrayList = this.f17861h;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        q.d().a(f17853k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f17857d.f(this);
        ScheduledExecutorService scheduledExecutorService = this.f17856c.f21506a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.j = null;
    }

    public final void f(Runnable runnable) {
        this.f17860g.post(runnable);
    }

    public final void g() {
        c();
        PowerManager.WakeLock a5 = o1.k.a(this.f17854a, "ProcessCommand");
        try {
            a5.acquire();
            this.f17858e.f17301k.i(new RunnableC1267f(this, 0));
        } finally {
            a5.release();
        }
    }
}
