package h1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import b5.G1;
import e1.q;
import f1.k;
import n1.C1606c;
import n1.C1607d;
import o1.C1671f;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1262a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17832a = q.j("Alarms");

    public static void a(int i9, Context context, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i9, C1263b.b(context, str), 603979776);
        if (service != null && alarmManager != null) {
            q.d().a(f17832a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i9 + ")", new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, k kVar, String str, long j) {
        int i9;
        int i10;
        WorkDatabase workDatabase = kVar.j;
        G1 s9 = workDatabase.s();
        C1607d r5 = s9.r(str);
        if (r5 != null) {
            a(r5.f21015b, context, str);
            int i11 = r5.f21015b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i11, C1263b.b(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        synchronized (C1671f.class) {
            workDatabase.c();
            try {
                Long k5 = workDatabase.r().k("next_alarm_manager_id");
                if (k5 != null) {
                    i9 = k5.intValue();
                } else {
                    i9 = 0;
                }
                if (i9 == Integer.MAX_VALUE) {
                    i10 = 0;
                } else {
                    i10 = i9 + 1;
                }
                workDatabase.r().n(new C1606c(i10, "next_alarm_manager_id"));
                workDatabase.p();
                workDatabase.m();
            } catch (Throwable th) {
                workDatabase.m();
                throw th;
            }
        }
        s9.u(new C1607d(str, i9));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, i9, C1263b.b(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
