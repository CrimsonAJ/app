package androidx.work.impl.workers;

import G0.G;
import G6.e;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import b5.G1;
import com.google.android.gms.internal.measurement.D1;
import e1.c;
import e1.h;
import e1.o;
import e1.q;
import f1.k;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import k4.C1499E;
import n1.C1607d;
import n1.C1613j;
import s8.n;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: i, reason: collision with root package name */
    public static final String f10452i = q.j("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String d(C1499E c1499e, C1499E c1499e2, G1 g12, ArrayList arrayList) {
        Integer num;
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            C1613j c1613j = (C1613j) obj;
            C1607d r5 = g12.r(c1613j.f21031a);
            if (r5 != null) {
                num = Integer.valueOf(r5.f21015b);
            } else {
                num = null;
            }
            String str2 = c1613j.f21031a;
            c1499e.getClass();
            G a5 = G.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str2 == null) {
                a5.t(1);
            } else {
                a5.m(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c1499e.f19985b;
            workDatabase_Impl.b();
            Cursor w7 = n.w(workDatabase_Impl, a5, false);
            try {
                ArrayList arrayList2 = new ArrayList(w7.getCount());
                while (w7.moveToNext()) {
                    arrayList2.add(w7.getString(0));
                }
                w7.close();
                a5.g();
                ArrayList m9 = c1499e2.m(c1613j.f21031a);
                String join = TextUtils.join(",", arrayList2);
                String join2 = TextUtils.join(",", m9);
                String str3 = c1613j.f21031a;
                String str4 = c1613j.f21033c;
                switch (c1613j.f21032b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                sb.append("\n" + str3 + "\t " + str4 + "\t " + num + "\t " + str + "\t " + join + "\t " + join2 + "\t");
            } catch (Throwable th) {
                w7.close();
                a5.g();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final o b() {
        G g9;
        G1 g12;
        C1499E c1499e;
        C1499E c1499e2;
        int i9;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        WorkDatabase workDatabase = k.b0(getApplicationContext()).j;
        e v8 = workDatabase.v();
        C1499E t7 = workDatabase.t();
        C1499E w7 = workDatabase.w();
        G1 s9 = workDatabase.s();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        v8.getClass();
        G a5 = G.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        a5.z(currentTimeMillis, 1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) v8.f2887a;
        workDatabase_Impl.b();
        Cursor w9 = n.w(workDatabase_Impl, a5, false);
        try {
            int z14 = s8.e.z(w9, "required_network_type");
            int z15 = s8.e.z(w9, "requires_charging");
            int z16 = s8.e.z(w9, "requires_device_idle");
            int z17 = s8.e.z(w9, "requires_battery_not_low");
            int z18 = s8.e.z(w9, "requires_storage_not_low");
            int z19 = s8.e.z(w9, "trigger_content_update_delay");
            int z20 = s8.e.z(w9, "trigger_max_content_delay");
            int z21 = s8.e.z(w9, "content_uri_triggers");
            int z22 = s8.e.z(w9, "id");
            int z23 = s8.e.z(w9, "state");
            int z24 = s8.e.z(w9, "worker_class_name");
            g9 = a5;
            try {
                int z25 = s8.e.z(w9, "input_merger_class_name");
                int z26 = s8.e.z(w9, "input");
                int z27 = s8.e.z(w9, "output");
                int z28 = s8.e.z(w9, "initial_delay");
                int z29 = s8.e.z(w9, "interval_duration");
                int z30 = s8.e.z(w9, "flex_duration");
                int z31 = s8.e.z(w9, "run_attempt_count");
                int z32 = s8.e.z(w9, "backoff_policy");
                int z33 = s8.e.z(w9, "backoff_delay_duration");
                int z34 = s8.e.z(w9, "period_start_time");
                int z35 = s8.e.z(w9, "minimum_retention_duration");
                int z36 = s8.e.z(w9, "schedule_requested_at");
                int z37 = s8.e.z(w9, "run_in_foreground");
                int z38 = s8.e.z(w9, "out_of_quota_policy");
                int i10 = z27;
                ArrayList arrayList = new ArrayList(w9.getCount());
                while (w9.moveToNext()) {
                    String string = w9.getString(z22);
                    int i11 = z22;
                    String string2 = w9.getString(z24);
                    int i12 = z24;
                    c cVar = new c();
                    int i13 = z14;
                    cVar.f17031a = D1.x(w9.getInt(z14));
                    if (w9.getInt(z15) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    cVar.f17032b = z9;
                    if (w9.getInt(z16) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    cVar.f17033c = z10;
                    if (w9.getInt(z17) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    cVar.f17034d = z11;
                    if (w9.getInt(z18) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    cVar.f17035e = z12;
                    int i14 = z15;
                    cVar.f17036f = w9.getLong(z19);
                    cVar.f17037g = w9.getLong(z20);
                    cVar.f17038h = D1.e(w9.getBlob(z21));
                    C1613j c1613j = new C1613j(string, string2);
                    c1613j.f21032b = D1.z(w9.getInt(z23));
                    c1613j.f21034d = w9.getString(z25);
                    c1613j.f21035e = h.a(w9.getBlob(z26));
                    int i15 = i10;
                    c1613j.f21036f = h.a(w9.getBlob(i15));
                    int i16 = z23;
                    int i17 = z28;
                    int i18 = z25;
                    c1613j.f21037g = w9.getLong(i17);
                    int i19 = z29;
                    c1613j.f21038h = w9.getLong(i19);
                    int i20 = z16;
                    int i21 = z30;
                    c1613j.f21039i = w9.getLong(i21);
                    int i22 = z31;
                    c1613j.f21040k = w9.getInt(i22);
                    int i23 = z32;
                    int i24 = z26;
                    c1613j.f21041l = D1.w(w9.getInt(i23));
                    int i25 = z33;
                    c1613j.f21042m = w9.getLong(i25);
                    int i26 = z34;
                    c1613j.f21043n = w9.getLong(i26);
                    int i27 = z35;
                    c1613j.f21044o = w9.getLong(i27);
                    int i28 = z36;
                    c1613j.f21045p = w9.getLong(i28);
                    int i29 = z37;
                    if (w9.getInt(i29) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    c1613j.f21046q = z13;
                    int i30 = z38;
                    c1613j.f21047r = D1.y(w9.getInt(i30));
                    c1613j.j = cVar;
                    arrayList.add(c1613j);
                    z34 = i26;
                    z16 = i20;
                    i10 = i15;
                    z37 = i29;
                    z23 = i16;
                    z26 = i24;
                    z30 = i21;
                    z32 = i23;
                    z35 = i27;
                    z33 = i25;
                    z24 = i12;
                    z14 = i13;
                    z38 = i30;
                    z36 = i28;
                    z25 = i18;
                    z28 = i17;
                    z29 = i19;
                    z15 = i14;
                    z31 = i22;
                    z22 = i11;
                }
                w9.close();
                g9.g();
                ArrayList g10 = v8.g();
                ArrayList d9 = v8.d();
                boolean isEmpty = arrayList.isEmpty();
                String str = f10452i;
                if (!isEmpty) {
                    i9 = 0;
                    q.d().i(str, "Recently completed work:\n\n", new Throwable[0]);
                    g12 = s9;
                    c1499e = t7;
                    c1499e2 = w7;
                    q.d().i(str, d(c1499e, c1499e2, g12, arrayList), new Throwable[0]);
                } else {
                    g12 = s9;
                    c1499e = t7;
                    c1499e2 = w7;
                    i9 = 0;
                }
                if (!g10.isEmpty()) {
                    q.d().i(str, "Running work:\n\n", new Throwable[i9]);
                    q.d().i(str, d(c1499e, c1499e2, g12, g10), new Throwable[i9]);
                }
                if (!d9.isEmpty()) {
                    q.d().i(str, "Enqueued work:\n\n", new Throwable[i9]);
                    q.d().i(str, d(c1499e, c1499e2, g12, d9), new Throwable[i9]);
                }
                return new o(h.f17049c);
            } catch (Throwable th) {
                th = th;
                w9.close();
                g9.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            g9 = a5;
        }
    }
}
