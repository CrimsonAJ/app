package b5;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;

/* renamed from: b5.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0656p0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinderC0672w0 f11272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q1 f11273c;

    public /* synthetic */ RunnableC0656p0(BinderC0672w0 binderC0672w0, Q1 q12, int i9) {
        this.f11271a = i9;
        this.f11272b = binderC0672w0;
        this.f11273c = q12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11271a) {
            case 0:
                J1 j12 = this.f11272b.f11339e;
                j12.e();
                j12.R(this.f11273c);
                return;
            case 1:
                J1 j13 = this.f11272b.f11339e;
                j13.e();
                j13.Q(this.f11273c);
                return;
            case 2:
                BinderC0672w0 binderC0672w0 = this.f11272b;
                binderC0672w0.f11339e.e();
                binderC0672w0.f11339e.N(this.f11273c);
                return;
            case 3:
                BinderC0672w0 binderC0672w02 = this.f11272b;
                binderC0672w02.f11339e.e();
                J1 j14 = binderC0672w02.f11339e;
                A0.a.v(j14);
                Q1 q12 = this.f11273c;
                F4.y.h(q12);
                String str = q12.f10901a;
                F4.y.e(str);
                int i9 = 0;
                if (j14.h0().y0(null, E.f10701z0)) {
                    j14.S().getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int r0 = j14.h0().r0(null, E.f10660i0);
                    j14.h0();
                    long longValue = currentTimeMillis - ((Long) E.f10647e.a(null)).longValue();
                    while (i9 < r0 && j14.D(longValue, null)) {
                        i9++;
                    }
                } else {
                    j14.h0();
                    long intValue = ((Integer) E.f10667l.a(null)).intValue();
                    while (i9 < intValue && j14.D(0L, str)) {
                        i9++;
                    }
                }
                if (j14.h0().y0(null, E.f10586A0)) {
                    j14.K().l0();
                    j14.B();
                }
                if (j14.h0().y0(null, E.f10619R0)) {
                    int d9 = AbstractC0953k1.d(q12.f10900Z);
                    F1 f12 = j14.j;
                    f12.l0();
                    if (((C0650n0) f12.f1707a).f11227g.y0(null, E.f10617Q0) && d9 == 2 && !F1.o0(str)) {
                        C0635i0 c0635i0 = f12.f11361b.f10742a;
                        J1.J(c0635i0);
                        com.google.android.gms.internal.measurement.F0 A02 = c0635i0.A0(str);
                        if (A02 != null && A02.G() && !A02.u().q().isEmpty()) {
                            j14.A().f10978n.c(str, "[sgtm] Going background, trigger client side upload. appId");
                            j14.S().getClass();
                            j14.Y(System.currentTimeMillis(), str);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                BinderC0672w0 binderC0672w03 = this.f11272b;
                binderC0672w03.f11339e.e();
                J1 j15 = binderC0672w03.f11339e;
                A0.a.v(j15);
                Q1 q13 = this.f11273c;
                F4.y.e(q13.f10901a);
                j15.f0(q13);
                return;
            case 5:
                BinderC0672w0 binderC0672w04 = this.f11272b;
                binderC0672w04.f11339e.e();
                J1 j16 = binderC0672w04.f11339e;
                if (j16.f10768y != null) {
                    ArrayList arrayList = new ArrayList();
                    j16.f10769z = arrayList;
                    arrayList.addAll(j16.f10768y);
                }
                C0649n c0649n = j16.f10744c;
                J1.J(c0649n);
                C0650n0 c0650n0 = (C0650n0) c0649n.f1707a;
                Q1 q14 = this.f11273c;
                String str2 = q14.f10901a;
                F4.y.h(str2);
                F4.y.e(str2);
                c0649n.l0();
                c0649n.m0();
                try {
                    SQLiteDatabase h12 = c0649n.h1();
                    String[] strArr = {str2};
                    int delete = h12.delete("apps", "app_id=?", strArr) + h12.delete("events", "app_id=?", strArr) + h12.delete("events_snapshot", "app_id=?", strArr) + h12.delete("user_attributes", "app_id=?", strArr) + h12.delete("conditional_properties", "app_id=?", strArr) + h12.delete("raw_events", "app_id=?", strArr) + h12.delete("raw_events_metadata", "app_id=?", strArr) + h12.delete("queue", "app_id=?", strArr) + h12.delete("audience_filter_values", "app_id=?", strArr) + h12.delete("main_event_params", "app_id=?", strArr) + h12.delete("default_event_params", "app_id=?", strArr) + h12.delete("trigger_uris", "app_id=?", strArr) + h12.delete("upload_queue", "app_id=?", strArr);
                    if (delete > 0) {
                        V v8 = c0650n0.f11229i;
                        C0650n0.f(v8);
                        v8.f10978n.d(str2, Integer.valueOf(delete), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e8) {
                    V v9 = c0650n0.f11229i;
                    C0650n0.f(v9);
                    v9.f10971f.d(V.t0(str2), e8, "Error resetting analytics data. appId, error");
                }
                if (q14.f10908h) {
                    j16.N(q14);
                    return;
                }
                return;
            default:
                BinderC0672w0 binderC0672w05 = this.f11272b;
                binderC0672w05.f11339e.e();
                J1 j17 = binderC0672w05.f11339e;
                A0.a.v(j17);
                Q1 q15 = this.f11273c;
                F4.y.e(q15.f10901a);
                j17.R(q15);
                j17.Q(q15);
                return;
        }
    }
}
