package e3;

import A6.r;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import b3.EnumC0602c;
import com.google.firebase.messaging.u;
import g3.InterfaceC1251b;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t6.InterfaceC2022g;
import t6.RunnableC2019d;
import t6.ScheduledExecutorServiceC2021f;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC1251b, InterfaceC2022g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17167b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17168c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17170e;

    public /* synthetic */ i(j jVar, Iterable iterable, Y2.j jVar2, long j) {
        this.f17166a = 0;
        this.f17168c = jVar;
        this.f17169d = iterable;
        this.f17170e = jVar2;
        this.f17167b = j;
    }

    @Override // t6.InterfaceC2022g
    public ScheduledFuture a(final u uVar) {
        switch (this.f17166a) {
            case 1:
                ScheduledExecutorServiceC2021f scheduledExecutorServiceC2021f = (ScheduledExecutorServiceC2021f) this.f17168c;
                return scheduledExecutorServiceC2021f.f23308b.schedule(new RunnableC2019d(scheduledExecutorServiceC2021f, (Runnable) this.f17169d, uVar, 1), this.f17167b, (TimeUnit) this.f17170e);
            default:
                final ScheduledExecutorServiceC2021f scheduledExecutorServiceC2021f2 = (ScheduledExecutorServiceC2021f) this.f17168c;
                final Callable callable = (Callable) this.f17169d;
                return scheduledExecutorServiceC2021f2.f23308b.schedule(new Callable() { // from class: t6.e
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ScheduledExecutorServiceC2021f scheduledExecutorServiceC2021f3 = ScheduledExecutorServiceC2021f.this;
                        return scheduledExecutorServiceC2021f3.f23307a.submit(new r(callable, 27, uVar));
                    }
                }, this.f17167b, (TimeUnit) this.f17170e);
        }
    }

    @Override // g3.InterfaceC1251b
    public Object f() {
        j jVar = (j) this.f17168c;
        f3.h hVar = (f3.h) jVar.f17173c;
        hVar.getClass();
        Iterable iterable = (Iterable) this.f17169d;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + f3.h.I(iterable);
            SQLiteDatabase a5 = hVar.a();
            a5.beginTransaction();
            try {
                a5.compileStatement(str).execute();
                Cursor rawQuery = a5.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar.x(rawQuery.getInt(0), EnumC0602c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                a5.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                a5.setTransactionSuccessful();
            } finally {
                a5.endTransaction();
            }
        }
        hVar.g(new f3.e(jVar.f17177g.l() + this.f17167b, (Y2.j) this.f17170e));
        return null;
    }

    public /* synthetic */ i(ScheduledExecutorServiceC2021f scheduledExecutorServiceC2021f, Object obj, long j, TimeUnit timeUnit, int i9) {
        this.f17166a = i9;
        this.f17168c = scheduledExecutorServiceC2021f;
        this.f17169d = obj;
        this.f17167b = j;
        this.f17170e = timeUnit;
    }
}
