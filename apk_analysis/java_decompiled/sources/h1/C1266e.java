package h1;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.google.android.gms.internal.cast.RunnableC0869s;
import f1.InterfaceC1159a;
import j1.C1433c;
import j1.InterfaceC1432b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n1.C1613j;
import o1.k;
import o1.q;
import u0.z;

/* renamed from: h1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1266e implements InterfaceC1432b, InterfaceC1159a, q {
    public static final String j = e1.q.j("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f17842a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17843b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17844c;

    /* renamed from: d, reason: collision with root package name */
    public final C1268g f17845d;

    /* renamed from: e, reason: collision with root package name */
    public final C1433c f17846e;

    /* renamed from: h, reason: collision with root package name */
    public PowerManager.WakeLock f17849h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17850i = false;

    /* renamed from: g, reason: collision with root package name */
    public int f17848g = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f17847f = new Object();

    public C1266e(Context context, int i9, String str, C1268g c1268g) {
        this.f17842a = context;
        this.f17843b = i9;
        this.f17845d = c1268g;
        this.f17844c = str;
        this.f17846e = new C1433c(context, c1268g.f17855b, this);
    }

    @Override // f1.InterfaceC1159a
    public final void a(String str, boolean z9) {
        e1.q.d().a(j, "onExecuted " + str + ", " + z9, new Throwable[0]);
        b();
        int i9 = this.f17843b;
        C1268g c1268g = this.f17845d;
        Context context = this.f17842a;
        if (z9) {
            c1268g.f(new RunnableC0869s(c1268g, C1263b.c(context, this.f17844c), i9, 4));
        }
        if (this.f17850i) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            c1268g.f(new RunnableC0869s(c1268g, intent, i9, 4));
        }
    }

    public final void b() {
        synchronized (this.f17847f) {
            try {
                this.f17846e.d();
                this.f17845d.f17856c.b(this.f17844c);
                PowerManager.WakeLock wakeLock = this.f17849h;
                if (wakeLock != null && wakeLock.isHeld()) {
                    e1.q.d().a(j, "Releasing wakelock " + this.f17849h + " for WorkSpec " + this.f17844c, new Throwable[0]);
                    this.f17849h.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j1.InterfaceC1432b
    public final void c(ArrayList arrayList) {
        f();
    }

    public final void d() {
        StringBuilder sb = new StringBuilder();
        String str = this.f17844c;
        sb.append(str);
        sb.append(" (");
        this.f17849h = k.a(this.f17842a, z.g(sb, this.f17843b, ")"));
        e1.q d9 = e1.q.d();
        PowerManager.WakeLock wakeLock = this.f17849h;
        String str2 = j;
        d9.a(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f17849h.acquire();
        C1613j l9 = this.f17845d.f17858e.j.v().l(str);
        if (l9 == null) {
            f();
            return;
        }
        boolean b9 = l9.b();
        this.f17850i = b9;
        if (!b9) {
            e1.q.d().a(str2, z.e("No constraints for ", str), new Throwable[0]);
            e(Collections.singletonList(str));
        } else {
            this.f17846e.c(Collections.singletonList(l9));
        }
    }

    @Override // j1.InterfaceC1432b
    public final void e(List list) {
        if (!list.contains(this.f17844c)) {
            return;
        }
        synchronized (this.f17847f) {
            try {
                if (this.f17848g == 0) {
                    this.f17848g = 1;
                    e1.q.d().a(j, "onAllConstraintsMet for " + this.f17844c, new Throwable[0]);
                    if (this.f17845d.f17857d.h(this.f17844c, null)) {
                        this.f17845d.f17856c.a(this.f17844c, this);
                    } else {
                        b();
                    }
                } else {
                    e1.q.d().a(j, "Already started work for " + this.f17844c, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.f17847f) {
            try {
                if (this.f17848g < 2) {
                    this.f17848g = 2;
                    e1.q d9 = e1.q.d();
                    String str = j;
                    d9.a(str, "Stopping work for WorkSpec " + this.f17844c, new Throwable[0]);
                    Context context = this.f17842a;
                    String str2 = this.f17844c;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    C1268g c1268g = this.f17845d;
                    c1268g.f(new RunnableC0869s(c1268g, intent, this.f17843b, 4));
                    if (this.f17845d.f17857d.e(this.f17844c)) {
                        e1.q.d().a(str, "WorkSpec " + this.f17844c + " needs to be rescheduled", new Throwable[0]);
                        Intent c3 = C1263b.c(this.f17842a, this.f17844c);
                        C1268g c1268g2 = this.f17845d;
                        c1268g2.f(new RunnableC0869s(c1268g2, c3, this.f17843b, 4));
                    } else {
                        e1.q.d().a(str, "Processor does not have WorkSpec " + this.f17844c + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    e1.q.d().a(j, "Already stopped work for " + this.f17844c, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
