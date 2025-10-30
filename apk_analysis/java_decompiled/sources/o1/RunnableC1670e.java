package o1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* renamed from: o1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1670e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f21467d = e1.q.j("ForceStopRunnable");

    /* renamed from: e, reason: collision with root package name */
    public static final long f21468e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f21469a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.k f21470b;

    /* renamed from: c, reason: collision with root package name */
    public int f21471c = 0;

    public RunnableC1670e(Context context, f1.k kVar) {
        this.f21469a = context.getApplicationContext();
        this.f21470b = kVar;
    }

    public static void c(Context context) {
        int i9;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (L.a.a()) {
            i9 = 167772160;
        } else {
            i9 = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i9);
        long currentTimeMillis = System.currentTimeMillis() + f21468e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.RunnableC1670e.a():void");
    }

    public final boolean b() {
        e1.b bVar = this.f21470b.f17300i;
        bVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f21467d;
        if (isEmpty) {
            e1.q.d().a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a5 = AbstractC1673h.a(this.f21469a, bVar);
        e1.q.d().a(str, "Is default app process = " + a5, new Throwable[0]);
        return a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f21467d;
        f1.k kVar = this.f21470b;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                f1.j.a(this.f21469a);
                e1.q.d().a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e8) {
                    int i9 = this.f21471c + 1;
                    this.f21471c = i9;
                    if (i9 < 3) {
                        e1.q.d().a(str, "Retrying after " + (i9 * 300), e8);
                        try {
                            Thread.sleep(this.f21471c * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        e1.q.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e8);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e8);
                        kVar.f17300i.getClass();
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            kVar.c0();
        }
    }
}
