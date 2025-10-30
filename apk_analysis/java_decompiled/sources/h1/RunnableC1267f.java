package h1;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import e1.q;
import o1.i;
import o1.k;

/* renamed from: h1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1267f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17851a;

    /* renamed from: b, reason: collision with root package name */
    public final C1268g f17852b;

    public /* synthetic */ RunnableC1267f(C1268g c1268g, int i9) {
        this.f17851a = i9;
        this.f17852b = c1268g;
    }

    private final void a() {
        int i9 = 1;
        synchronized (this.f17852b.f17861h) {
            C1268g c1268g = this.f17852b;
            c1268g.f17862i = (Intent) c1268g.f17861h.get(0);
        }
        Intent intent = this.f17852b.f17862i;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f17852b.f17862i.getIntExtra("KEY_START_ID", 0);
            q d9 = q.d();
            String str = C1268g.f17853k;
            d9.a(str, String.format("Processing command %s, %s", this.f17852b.f17862i, Integer.valueOf(intExtra)), new Throwable[0]);
            PowerManager.WakeLock a5 = k.a(this.f17852b.f17854a, action + " (" + intExtra + ")");
            try {
                q.d().a(str, "Acquiring operation wake lock (" + action + ") " + a5, new Throwable[0]);
                a5.acquire();
                C1268g c1268g2 = this.f17852b;
                c1268g2.f17859f.e(c1268g2.f17862i, intExtra, c1268g2);
                q.d().a(str, "Releasing operation wake lock (" + action + ") " + a5, new Throwable[0]);
                a5.release();
                C1268g c1268g3 = this.f17852b;
                c1268g3.f(new RunnableC1267f(c1268g3, i9));
            } catch (Throwable th) {
                try {
                    q d10 = q.d();
                    String str2 = C1268g.f17853k;
                    d10.c(str2, "Unexpected error in onHandleIntent", th);
                    q.d().a(str2, "Releasing operation wake lock (" + action + ") " + a5, new Throwable[0]);
                    a5.release();
                    C1268g c1268g4 = this.f17852b;
                    c1268g4.f(new RunnableC1267f(c1268g4, i9));
                } catch (Throwable th2) {
                    q.d().a(C1268g.f17853k, "Releasing operation wake lock (" + action + ") " + a5, new Throwable[0]);
                    a5.release();
                    C1268g c1268g5 = this.f17852b;
                    c1268g5.f(new RunnableC1267f(c1268g5, i9));
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17851a) {
            case 0:
                a();
                return;
            default:
                C1268g c1268g = this.f17852b;
                c1268g.getClass();
                q d9 = q.d();
                String str = C1268g.f17853k;
                d9.a(str, "Checking if commands are complete.", new Throwable[0]);
                c1268g.c();
                synchronized (c1268g.f17861h) {
                    try {
                        if (c1268g.f17862i != null) {
                            q.d().a(str, String.format("Removing command %s", c1268g.f17862i), new Throwable[0]);
                            if (((Intent) c1268g.f17861h.remove(0)).equals(c1268g.f17862i)) {
                                c1268g.f17862i = null;
                            } else {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                        }
                        i iVar = (i) c1268g.f17855b.f10717b;
                        if (!c1268g.f17859f.d() && c1268g.f17861h.isEmpty() && !iVar.a()) {
                            q.d().a(str, "No more commands & intents.", new Throwable[0]);
                            SystemAlarmService systemAlarmService = c1268g.j;
                            if (systemAlarmService != null) {
                                systemAlarmService.a();
                            }
                        } else if (!c1268g.f17861h.isEmpty()) {
                            c1268g.g();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
