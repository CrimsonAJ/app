package h1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import b5.G1;
import com.google.android.gms.internal.cast.RunnableC0869s;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import e1.q;
import f1.InterfaceC1159a;
import f1.k;
import j1.C1433c;
import java.util.ArrayList;
import java.util.HashMap;
import n1.C1607d;
import n1.C1613j;
import u0.z;

/* renamed from: h1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1263b implements InterfaceC1159a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f17833d = q.j("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f17834a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f17835b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f17836c = new Object();

    public C1263b(Context context) {
        this.f17834a = context;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // f1.InterfaceC1159a
    public final void a(String str, boolean z9) {
        synchronized (this.f17836c) {
            try {
                InterfaceC1159a interfaceC1159a = (InterfaceC1159a) this.f17835b.remove(str);
                if (interfaceC1159a != null) {
                    interfaceC1159a.a(str, z9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean z9;
        synchronized (this.f17836c) {
            z9 = !this.f17835b.isEmpty();
        }
        return z9;
    }

    public final void e(Intent intent, int i9, C1268g c1268g) {
        boolean z9;
        int i10 = 4;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            q.d().a(f17833d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            C1265d c1265d = new C1265d(this.f17834a, i9, c1268g);
            ArrayList h7 = c1268g.f17858e.j.v().h();
            String str = AbstractC1264c.f17837a;
            int size = h7.size();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            int i11 = 0;
            while (i11 < size) {
                Object obj = h7.get(i11);
                i11++;
                e1.c cVar = ((C1613j) obj).j;
                z10 |= cVar.f17034d;
                z11 |= cVar.f17032b;
                z12 |= cVar.f17035e;
                if (cVar.f17031a != 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                z13 |= z9;
                if (z10 && z11 && z12 && z13) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f10432a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = c1265d.f17839a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
            context.sendBroadcast(intent2);
            C1433c c1433c = c1265d.f17841c;
            c1433c.c(h7);
            ArrayList arrayList = new ArrayList(h7.size());
            long currentTimeMillis = System.currentTimeMillis();
            int size2 = h7.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = h7.get(i12);
                i12++;
                C1613j c1613j = (C1613j) obj2;
                String str3 = c1613j.f21031a;
                if (currentTimeMillis >= c1613j.a() && (!c1613j.b() || c1433c.a(str3))) {
                    arrayList.add(c1613j);
                }
            }
            int size3 = arrayList.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList.get(i13);
                i13++;
                String str4 = ((C1613j) obj3).f21031a;
                Intent b9 = b(context, str4);
                q.d().a(C1265d.f17838d, A0.a.n("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                c1268g.f(new RunnableC0869s(c1268g, b9, c1265d.f17840b, i10));
            }
            c1433c.d();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            q.d().a(f17833d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i9)), new Throwable[0]);
            c1268g.f17858e.d0();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
            if ("ACTION_SCHEDULE_WORK".equals(action)) {
                String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
                String str5 = f17833d;
                q.d().a(str5, z.e("Handling schedule work for ", string), new Throwable[0]);
                WorkDatabase workDatabase = c1268g.f17858e.j;
                workDatabase.c();
                try {
                    C1613j l9 = workDatabase.v().l(string);
                    if (l9 == null) {
                        q.d().k(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                        return;
                    }
                    if (AbstractC0953k1.c(l9.f21032b)) {
                        q.d().k(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                        return;
                    }
                    long a5 = l9.a();
                    boolean b10 = l9.b();
                    Context context2 = this.f17834a;
                    k kVar = c1268g.f17858e;
                    if (!b10) {
                        q.d().a(str5, "Setting up Alarms for " + string + " at " + a5, new Throwable[0]);
                        AbstractC1262a.b(context2, kVar, string, a5);
                    } else {
                        q.d().a(str5, "Opportunistically setting an alarm for " + string + " at " + a5, new Throwable[0]);
                        AbstractC1262a.b(context2, kVar, string, a5);
                        Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                        c1268g.f(new RunnableC0869s(c1268g, intent3, i9, i10));
                    }
                    workDatabase.p();
                    return;
                } finally {
                    workDatabase.m();
                }
            }
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f17836c) {
                    try {
                        String string2 = extras2.getString("KEY_WORKSPEC_ID");
                        q d9 = q.d();
                        String str6 = f17833d;
                        d9.a(str6, "Handing delay met for " + string2, new Throwable[0]);
                        if (!this.f17835b.containsKey(string2)) {
                            C1266e c1266e = new C1266e(this.f17834a, i9, string2, c1268g);
                            this.f17835b.put(string2, c1266e);
                            c1266e.d();
                        } else {
                            q.d().a(str6, "WorkSpec " + string2 + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        }
                    } finally {
                    }
                }
                return;
            }
            if ("ACTION_STOP_WORK".equals(action)) {
                String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
                q.d().a(f17833d, z.e("Handing stopWork work for ", string3), new Throwable[0]);
                c1268g.f17858e.f0(string3);
                String str7 = AbstractC1262a.f17832a;
                G1 s9 = c1268g.f17858e.j.s();
                C1607d r5 = s9.r(string3);
                if (r5 != null) {
                    AbstractC1262a.a(r5.f21015b, this.f17834a, string3);
                    q.d().a(AbstractC1262a.f17832a, A0.a.n("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                    s9.z(string3);
                }
                c1268g.a(string3, false);
                return;
            }
            if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                Bundle extras3 = intent.getExtras();
                String string4 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z14 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                q.d().a(f17833d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i9)), new Throwable[0]);
                a(string4, z14);
                return;
            }
            q.d().k(f17833d, String.format("Ignoring intent %s", intent), new Throwable[0]);
            return;
        }
        q.d().c(f17833d, A0.a.n("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
    }
}
