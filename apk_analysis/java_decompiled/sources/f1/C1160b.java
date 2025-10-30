package f1;

import S5.p;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import b5.G1;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import e1.m;
import e1.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import m1.C1583a;
import p1.C1847j;
import u0.z;

/* renamed from: f1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1160b implements InterfaceC1159a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f17263l = q.j("Processor");

    /* renamed from: b, reason: collision with root package name */
    public final Context f17265b;

    /* renamed from: c, reason: collision with root package name */
    public final e1.b f17266c;

    /* renamed from: d, reason: collision with root package name */
    public final G1 f17267d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f17268e;

    /* renamed from: h, reason: collision with root package name */
    public final List f17271h;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f17270g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f17269f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f17272i = new HashSet();
    public final ArrayList j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f17264a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f17273k = new Object();

    public C1160b(Context context, e1.b bVar, G1 g12, WorkDatabase workDatabase, List list) {
        this.f17265b = context;
        this.f17266c = bVar;
        this.f17267d = g12;
        this.f17268e = workDatabase;
        this.f17271h = list;
    }

    public static boolean c(String str, l lVar) {
        boolean z9;
        if (lVar != null) {
            lVar.f17325s = true;
            lVar.h();
            p pVar = lVar.f17324r;
            if (pVar != null) {
                z9 = pVar.isDone();
                lVar.f17324r.cancel(true);
            } else {
                z9 = false;
            }
            ListenableWorker listenableWorker = lVar.f17313f;
            if (listenableWorker != null && !z9) {
                listenableWorker.stop();
            } else {
                q.d().a(l.f17307t, "WorkSpec " + lVar.f17312e + " is already done. Not interrupting.", new Throwable[0]);
            }
            q.d().a(f17263l, z.e("WorkerWrapper interrupted for ", str), new Throwable[0]);
            return true;
        }
        q.d().a(f17263l, z.e("WorkerWrapper could not be found for ", str), new Throwable[0]);
        return false;
    }

    @Override // f1.InterfaceC1159a
    public final void a(String str, boolean z9) {
        synchronized (this.f17273k) {
            try {
                this.f17270g.remove(str);
                int i9 = 0;
                q.d().a(f17263l, C1160b.class.getSimpleName() + " " + str + " executed; reschedule = " + z9, new Throwable[0]);
                ArrayList arrayList = this.j;
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((InterfaceC1159a) obj).a(str, z9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(InterfaceC1159a interfaceC1159a) {
        synchronized (this.f17273k) {
            this.j.add(interfaceC1159a);
        }
    }

    public final boolean d(String str) {
        boolean contains;
        synchronized (this.f17273k) {
            contains = this.f17272i.contains(str);
        }
        return contains;
    }

    public final boolean e(String str) {
        boolean z9;
        synchronized (this.f17273k) {
            try {
                if (!this.f17270g.containsKey(str) && !this.f17269f.containsKey(str)) {
                    z9 = false;
                }
                z9 = true;
            } finally {
            }
        }
        return z9;
    }

    public final void f(InterfaceC1159a interfaceC1159a) {
        synchronized (this.f17273k) {
            this.j.remove(interfaceC1159a);
        }
    }

    public final void g(String str, e1.j jVar) {
        synchronized (this.f17273k) {
            try {
                q.d().i(f17263l, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                l lVar = (l) this.f17270g.remove(str);
                if (lVar != null) {
                    if (this.f17264a == null) {
                        PowerManager.WakeLock a5 = o1.k.a(this.f17265b, "ProcessorForegroundLck");
                        this.f17264a = a5;
                        a5.acquire();
                    }
                    this.f17269f.put(str, lVar);
                    Intent d9 = C1583a.d(this.f17265b, str, jVar);
                    Context context = this.f17265b;
                    if (Build.VERSION.SDK_INT >= 26) {
                        E.b.c(context, d9);
                    } else {
                        context.startService(d9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [f1.l, java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, p1.j] */
    public final boolean h(String str, G1 g12) {
        synchronized (this.f17273k) {
            try {
                if (e(str)) {
                    q.d().a(f17263l, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f17265b;
                e1.b bVar = this.f17266c;
                G1 g13 = this.f17267d;
                WorkDatabase workDatabase = this.f17268e;
                G1 g14 = new G1(9);
                Context applicationContext = context.getApplicationContext();
                List list = this.f17271h;
                if (g12 == null) {
                    g12 = g14;
                }
                ?? obj = new Object();
                obj.f17315h = new m();
                obj.f17323q = new Object();
                obj.f17324r = null;
                obj.f17308a = applicationContext;
                obj.f17314g = g13;
                obj.j = this;
                obj.f17309b = str;
                obj.f17310c = list;
                obj.f17311d = g12;
                obj.f17313f = null;
                obj.f17316i = bVar;
                obj.f17317k = workDatabase;
                obj.f17318l = workDatabase.v();
                obj.f17319m = workDatabase.q();
                obj.f17320n = workDatabase.w();
                C1847j c1847j = obj.f17323q;
                A4.j jVar = new A4.j(13);
                jVar.f354b = this;
                jVar.f355c = str;
                jVar.f356d = c1847j;
                c1847j.a(jVar, (D4.q) this.f17267d.f10719d);
                this.f17270g.put(str, obj);
                ((o1.i) this.f17267d.f10717b).execute(obj);
                q.d().a(f17263l, AbstractC0953k1.o(C1160b.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.f17273k) {
            try {
                if (this.f17269f.isEmpty()) {
                    Context context = this.f17265b;
                    String str = C1583a.j;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f17265b.startService(intent);
                    } catch (Throwable th) {
                        q.d().c(f17263l, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f17264a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f17264a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean j(String str) {
        boolean c3;
        synchronized (this.f17273k) {
            q.d().a(f17263l, "Processor stopping foreground work " + str, new Throwable[0]);
            c3 = c(str, (l) this.f17269f.remove(str));
        }
        return c3;
    }

    public final boolean k(String str) {
        boolean c3;
        synchronized (this.f17273k) {
            q.d().a(f17263l, "Processor stopping background work " + str, new Throwable[0]);
            c3 = c(str, (l) this.f17270g.remove(str));
        }
        return c3;
    }
}
