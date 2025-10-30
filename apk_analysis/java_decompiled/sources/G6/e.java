package G6;

import G0.G;
import O4.h;
import R0.j;
import android.database.Cursor;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import b7.C0701c;
import com.google.android.gms.internal.measurement.D1;
import d0.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import n1.C1605b;
import n1.C1608e;
import n1.C1613j;
import o1.C1671f;
import org.json.JSONObject;
import s.C1931a;
import s.C1932b;
import s.C1935e;
import s.C1939i;
import s8.n;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Object f2887a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2888b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2889c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2890d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2891e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2892f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2893g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2894h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2895i;

    public e(WorkDatabase_Impl workDatabase_Impl) {
        this.f2887a = workDatabase_Impl;
        this.f2888b = new C1605b(workDatabase_Impl, 5);
        this.f2889c = new C1608e(workDatabase_Impl, 3);
        this.f2890d = new C1608e(workDatabase_Impl, 4);
        this.f2891e = new C1608e(workDatabase_Impl, 5);
        this.f2892f = new C1608e(workDatabase_Impl, 6);
        this.f2893g = new C1608e(workDatabase_Impl, 7);
        this.f2894h = new C1608e(workDatabase_Impl, 8);
        this.f2895i = new C1608e(workDatabase_Impl, 9);
        new C1608e(workDatabase_Impl, 10);
    }

    public static void n(JSONObject jSONObject, String str) {
        String str2 = str + jSONObject.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [s.i] */
    /* JADX WARN: Type inference failed for: r0v7, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [s.i] */
    public void a(C1935e c1935e) {
        ArrayList arrayList;
        C1932b c1932b = (C1932b) c1935e.keySet();
        C1935e c1935e2 = c1932b.f22640a;
        if (!c1935e2.isEmpty()) {
            if (c1935e.f22660c > 999) {
                ?? c1939i = new C1939i(999);
                int i9 = c1935e.f22660c;
                int i10 = 0;
                int i11 = 0;
                while (i10 < i9) {
                    c1939i.put((String) c1935e.f(i10), (ArrayList) c1935e.i(i10));
                    i10++;
                    i11++;
                    if (i11 == 999) {
                        a(c1939i);
                        c1939i = new C1939i(999);
                        i11 = 0;
                    }
                }
                if (i11 > 0) {
                    a(c1939i);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int i12 = c1935e2.f22660c;
            h.b(i12, sb);
            sb.append(")");
            G a5 = G.a(i12, sb.toString());
            Iterator it = c1932b.iterator();
            int i13 = 1;
            while (true) {
                C1931a c1931a = (C1931a) it;
                if (!c1931a.hasNext()) {
                    break;
                }
                String str = (String) c1931a.next();
                if (str == null) {
                    a5.t(i13);
                } else {
                    a5.m(i13, str);
                }
                i13++;
            }
            Cursor w7 = n.w((WorkDatabase_Impl) this.f2887a, a5, false);
            try {
                int y9 = s8.e.y(w7, "work_spec_id");
                if (y9 == -1) {
                    return;
                }
                while (w7.moveToNext()) {
                    if (!w7.isNull(y9) && (arrayList = (ArrayList) c1935e.get(w7.getString(y9))) != null) {
                        arrayList.add(e1.h.a(w7.getBlob(0)));
                    }
                }
            } finally {
                w7.close();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [s.i] */
    /* JADX WARN: Type inference failed for: r0v7, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [s.i] */
    public void b(C1935e c1935e) {
        ArrayList arrayList;
        C1932b c1932b = (C1932b) c1935e.keySet();
        C1935e c1935e2 = c1932b.f22640a;
        if (!c1935e2.isEmpty()) {
            if (c1935e.f22660c > 999) {
                ?? c1939i = new C1939i(999);
                int i9 = c1935e.f22660c;
                int i10 = 0;
                int i11 = 0;
                while (i10 < i9) {
                    c1939i.put((String) c1935e.f(i10), (ArrayList) c1935e.i(i10));
                    i10++;
                    i11++;
                    if (i11 == 999) {
                        b(c1939i);
                        c1939i = new C1939i(999);
                        i11 = 0;
                    }
                }
                if (i11 > 0) {
                    b(c1939i);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int i12 = c1935e2.f22660c;
            h.b(i12, sb);
            sb.append(")");
            G a5 = G.a(i12, sb.toString());
            Iterator it = c1932b.iterator();
            int i13 = 1;
            while (true) {
                C1931a c1931a = (C1931a) it;
                if (!c1931a.hasNext()) {
                    break;
                }
                String str = (String) c1931a.next();
                if (str == null) {
                    a5.t(i13);
                } else {
                    a5.m(i13, str);
                }
                i13++;
            }
            Cursor w7 = n.w((WorkDatabase_Impl) this.f2887a, a5, false);
            try {
                int y9 = s8.e.y(w7, "work_spec_id");
                if (y9 == -1) {
                    return;
                }
                while (w7.moveToNext()) {
                    if (!w7.isNull(y9) && (arrayList = (ArrayList) c1935e.get(w7.getString(y9))) != null) {
                        arrayList.add(w7.getString(0));
                    }
                }
            } finally {
                w7.close();
            }
        }
    }

    public void c(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2887a;
        workDatabase_Impl.b();
        C1608e c1608e = (C1608e) this.f2889c;
        j a5 = c1608e.a();
        if (str == null) {
            a5.t(1);
        } else {
            a5.m(1, str);
        }
        workDatabase_Impl.c();
        try {
            a5.a();
            workDatabase_Impl.p();
        } finally {
            workDatabase_Impl.m();
            c1608e.i(a5);
        }
    }

    public ArrayList d() {
        G g9;
        int z9;
        int z10;
        int z11;
        int z12;
        int z13;
        int z14;
        int z15;
        int z16;
        int z17;
        int z18;
        int z19;
        int z20;
        int z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        G a5 = G.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        a5.z(200, 1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2887a;
        workDatabase_Impl.b();
        Cursor w7 = n.w(workDatabase_Impl, a5, false);
        try {
            z9 = s8.e.z(w7, "required_network_type");
            z10 = s8.e.z(w7, "requires_charging");
            z11 = s8.e.z(w7, "requires_device_idle");
            z12 = s8.e.z(w7, "requires_battery_not_low");
            z13 = s8.e.z(w7, "requires_storage_not_low");
            z14 = s8.e.z(w7, "trigger_content_update_delay");
            z15 = s8.e.z(w7, "trigger_max_content_delay");
            z16 = s8.e.z(w7, "content_uri_triggers");
            z17 = s8.e.z(w7, "id");
            z18 = s8.e.z(w7, "state");
            z19 = s8.e.z(w7, "worker_class_name");
            z20 = s8.e.z(w7, "input_merger_class_name");
            z21 = s8.e.z(w7, "input");
            g9 = a5;
        } catch (Throwable th) {
            th = th;
            g9 = a5;
        }
        try {
            int z27 = s8.e.z(w7, "output");
            int z28 = s8.e.z(w7, "initial_delay");
            int z29 = s8.e.z(w7, "interval_duration");
            int z30 = s8.e.z(w7, "flex_duration");
            int z31 = s8.e.z(w7, "run_attempt_count");
            int z32 = s8.e.z(w7, "backoff_policy");
            int z33 = s8.e.z(w7, "backoff_delay_duration");
            int z34 = s8.e.z(w7, "period_start_time");
            int z35 = s8.e.z(w7, "minimum_retention_duration");
            int z36 = s8.e.z(w7, "schedule_requested_at");
            int z37 = s8.e.z(w7, "run_in_foreground");
            int z38 = s8.e.z(w7, "out_of_quota_policy");
            int i9 = z27;
            ArrayList arrayList = new ArrayList(w7.getCount());
            while (w7.moveToNext()) {
                String string = w7.getString(z17);
                int i10 = z17;
                String string2 = w7.getString(z19);
                int i11 = z19;
                e1.c cVar = new e1.c();
                int i12 = z9;
                cVar.f17031a = D1.x(w7.getInt(z9));
                if (w7.getInt(z10) != 0) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                cVar.f17032b = z22;
                if (w7.getInt(z11) != 0) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                cVar.f17033c = z23;
                if (w7.getInt(z12) != 0) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                cVar.f17034d = z24;
                if (w7.getInt(z13) != 0) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                cVar.f17035e = z25;
                int i13 = z10;
                int i14 = z11;
                cVar.f17036f = w7.getLong(z14);
                cVar.f17037g = w7.getLong(z15);
                cVar.f17038h = D1.e(w7.getBlob(z16));
                C1613j c1613j = new C1613j(string, string2);
                c1613j.f21032b = D1.z(w7.getInt(z18));
                c1613j.f21034d = w7.getString(z20);
                c1613j.f21035e = e1.h.a(w7.getBlob(z21));
                int i15 = i9;
                c1613j.f21036f = e1.h.a(w7.getBlob(i15));
                int i16 = z20;
                int i17 = z28;
                c1613j.f21037g = w7.getLong(i17);
                i9 = i15;
                int i18 = z29;
                c1613j.f21038h = w7.getLong(i18);
                int i19 = z12;
                int i20 = z30;
                c1613j.f21039i = w7.getLong(i20);
                int i21 = z31;
                c1613j.f21040k = w7.getInt(i21);
                int i22 = z32;
                c1613j.f21041l = D1.w(w7.getInt(i22));
                z30 = i20;
                int i23 = z33;
                c1613j.f21042m = w7.getLong(i23);
                int i24 = z34;
                c1613j.f21043n = w7.getLong(i24);
                z34 = i24;
                int i25 = z35;
                c1613j.f21044o = w7.getLong(i25);
                int i26 = z36;
                c1613j.f21045p = w7.getLong(i26);
                int i27 = z37;
                if (w7.getInt(i27) != 0) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                c1613j.f21046q = z26;
                int i28 = z38;
                c1613j.f21047r = D1.y(w7.getInt(i28));
                c1613j.j = cVar;
                arrayList.add(c1613j);
                z33 = i23;
                z12 = i19;
                z32 = i22;
                z38 = i28;
                z10 = i13;
                z28 = i17;
                z29 = i18;
                z31 = i21;
                z36 = i26;
                z19 = i11;
                z9 = i12;
                z37 = i27;
                z35 = i25;
                z20 = i16;
                z17 = i10;
                z11 = i14;
            }
            w7.close();
            g9.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            w7.close();
            g9.g();
            throw th;
        }
    }

    public c e(int i9) {
        c cVar = null;
        try {
            if (!AbstractC2128h.a(2, i9)) {
                JSONObject I4 = ((C1671f) this.f2891e).I();
                if (I4 != null) {
                    c K = ((C0701c) this.f2889c).K(I4);
                    n(I4, "Loaded cached settings: ");
                    ((o) this.f2890d).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!AbstractC2128h.a(3, i9) && K.f2881c < currentTimeMillis) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                            return null;
                        }
                    } else {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return K;
                        } catch (Exception e8) {
                            e = e8;
                            cVar = K;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return cVar;
                        }
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e9) {
            e = e9;
        }
    }

    public ArrayList f(int i9) {
        G g9;
        int z9;
        int z10;
        int z11;
        int z12;
        int z13;
        int z14;
        int z15;
        int z16;
        int z17;
        int z18;
        int z19;
        int z20;
        int z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        G a5 = G.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        a5.z(i9, 1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2887a;
        workDatabase_Impl.b();
        Cursor w7 = n.w(workDatabase_Impl, a5, false);
        try {
            z9 = s8.e.z(w7, "required_network_type");
            z10 = s8.e.z(w7, "requires_charging");
            z11 = s8.e.z(w7, "requires_device_idle");
            z12 = s8.e.z(w7, "requires_battery_not_low");
            z13 = s8.e.z(w7, "requires_storage_not_low");
            z14 = s8.e.z(w7, "trigger_content_update_delay");
            z15 = s8.e.z(w7, "trigger_max_content_delay");
            z16 = s8.e.z(w7, "content_uri_triggers");
            z17 = s8.e.z(w7, "id");
            z18 = s8.e.z(w7, "state");
            z19 = s8.e.z(w7, "worker_class_name");
            z20 = s8.e.z(w7, "input_merger_class_name");
            z21 = s8.e.z(w7, "input");
            g9 = a5;
        } catch (Throwable th) {
            th = th;
            g9 = a5;
        }
        try {
            int z27 = s8.e.z(w7, "output");
            int z28 = s8.e.z(w7, "initial_delay");
            int z29 = s8.e.z(w7, "interval_duration");
            int z30 = s8.e.z(w7, "flex_duration");
            int z31 = s8.e.z(w7, "run_attempt_count");
            int z32 = s8.e.z(w7, "backoff_policy");
            int z33 = s8.e.z(w7, "backoff_delay_duration");
            int z34 = s8.e.z(w7, "period_start_time");
            int z35 = s8.e.z(w7, "minimum_retention_duration");
            int z36 = s8.e.z(w7, "schedule_requested_at");
            int z37 = s8.e.z(w7, "run_in_foreground");
            int z38 = s8.e.z(w7, "out_of_quota_policy");
            int i10 = z27;
            ArrayList arrayList = new ArrayList(w7.getCount());
            while (w7.moveToNext()) {
                String string = w7.getString(z17);
                int i11 = z17;
                String string2 = w7.getString(z19);
                int i12 = z19;
                e1.c cVar = new e1.c();
                int i13 = z9;
                cVar.f17031a = D1.x(w7.getInt(z9));
                if (w7.getInt(z10) != 0) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                cVar.f17032b = z22;
                if (w7.getInt(z11) != 0) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                cVar.f17033c = z23;
                if (w7.getInt(z12) != 0) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                cVar.f17034d = z24;
                if (w7.getInt(z13) != 0) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                cVar.f17035e = z25;
                int i14 = z10;
                int i15 = z11;
                cVar.f17036f = w7.getLong(z14);
                cVar.f17037g = w7.getLong(z15);
                cVar.f17038h = D1.e(w7.getBlob(z16));
                C1613j c1613j = new C1613j(string, string2);
                c1613j.f21032b = D1.z(w7.getInt(z18));
                c1613j.f21034d = w7.getString(z20);
                c1613j.f21035e = e1.h.a(w7.getBlob(z21));
                int i16 = i10;
                c1613j.f21036f = e1.h.a(w7.getBlob(i16));
                int i17 = z20;
                int i18 = z28;
                c1613j.f21037g = w7.getLong(i18);
                i10 = i16;
                int i19 = z29;
                c1613j.f21038h = w7.getLong(i19);
                int i20 = z12;
                int i21 = z30;
                c1613j.f21039i = w7.getLong(i21);
                int i22 = z31;
                c1613j.f21040k = w7.getInt(i22);
                int i23 = z32;
                c1613j.f21041l = D1.w(w7.getInt(i23));
                z30 = i21;
                int i24 = z33;
                c1613j.f21042m = w7.getLong(i24);
                int i25 = z34;
                c1613j.f21043n = w7.getLong(i25);
                z34 = i25;
                int i26 = z35;
                c1613j.f21044o = w7.getLong(i26);
                int i27 = z36;
                c1613j.f21045p = w7.getLong(i27);
                int i28 = z37;
                if (w7.getInt(i28) != 0) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                c1613j.f21046q = z26;
                int i29 = z38;
                c1613j.f21047r = D1.y(w7.getInt(i29));
                c1613j.j = cVar;
                arrayList.add(c1613j);
                z33 = i24;
                z12 = i20;
                z32 = i23;
                z38 = i29;
                z10 = i14;
                z28 = i18;
                z29 = i19;
                z31 = i22;
                z36 = i27;
                z19 = i12;
                z9 = i13;
                z37 = i28;
                z35 = i26;
                z20 = i17;
                z17 = i11;
                z11 = i15;
            }
            w7.close();
            g9.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            w7.close();
            g9.g();
            throw th;
        }
    }

    public ArrayList g() {
        G g9;
        int z9;
        int z10;
        int z11;
        int z12;
        int z13;
        int z14;
        int z15;
        int z16;
        int z17;
        int z18;
        int z19;
        int z20;
        int z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        G a5 = G.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2887a;
        workDatabase_Impl.b();
        Cursor w7 = n.w(workDatabase_Impl, a5, false);
        try {
            z9 = s8.e.z(w7, "required_network_type");
            z10 = s8.e.z(w7, "requires_charging");
            z11 = s8.e.z(w7, "requires_device_idle");
            z12 = s8.e.z(w7, "requires_battery_not_low");
            z13 = s8.e.z(w7, "requires_storage_not_low");
            z14 = s8.e.z(w7, "trigger_content_update_delay");
            z15 = s8.e.z(w7, "trigger_max_content_delay");
            z16 = s8.e.z(w7, "content_uri_triggers");
            z17 = s8.e.z(w7, "id");
            z18 = s8.e.z(w7, "state");
            z19 = s8.e.z(w7, "worker_class_name");
            z20 = s8.e.z(w7, "input_merger_class_name");
            z21 = s8.e.z(w7, "input");
            g9 = a5;
        } catch (Throwable th) {
            th = th;
            g9 = a5;
        }
        try {
            int z27 = s8.e.z(w7, "output");
            int z28 = s8.e.z(w7, "initial_delay");
            int z29 = s8.e.z(w7, "interval_duration");
            int z30 = s8.e.z(w7, "flex_duration");
            int z31 = s8.e.z(w7, "run_attempt_count");
            int z32 = s8.e.z(w7, "backoff_policy");
            int z33 = s8.e.z(w7, "backoff_delay_duration");
            int z34 = s8.e.z(w7, "period_start_time");
            int z35 = s8.e.z(w7, "minimum_retention_duration");
            int z36 = s8.e.z(w7, "schedule_requested_at");
            int z37 = s8.e.z(w7, "run_in_foreground");
            int z38 = s8.e.z(w7, "out_of_quota_policy");
            int i9 = z27;
            ArrayList arrayList = new ArrayList(w7.getCount());
            while (w7.moveToNext()) {
                String string = w7.getString(z17);
                int i10 = z17;
                String string2 = w7.getString(z19);
                int i11 = z19;
                e1.c cVar = new e1.c();
                int i12 = z9;
                cVar.f17031a = D1.x(w7.getInt(z9));
                if (w7.getInt(z10) != 0) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                cVar.f17032b = z22;
                if (w7.getInt(z11) != 0) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                cVar.f17033c = z23;
                if (w7.getInt(z12) != 0) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                cVar.f17034d = z24;
                if (w7.getInt(z13) != 0) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                cVar.f17035e = z25;
                int i13 = z10;
                int i14 = z11;
                cVar.f17036f = w7.getLong(z14);
                cVar.f17037g = w7.getLong(z15);
                cVar.f17038h = D1.e(w7.getBlob(z16));
                C1613j c1613j = new C1613j(string, string2);
                c1613j.f21032b = D1.z(w7.getInt(z18));
                c1613j.f21034d = w7.getString(z20);
                c1613j.f21035e = e1.h.a(w7.getBlob(z21));
                int i15 = i9;
                c1613j.f21036f = e1.h.a(w7.getBlob(i15));
                int i16 = z21;
                int i17 = z28;
                c1613j.f21037g = w7.getLong(i17);
                i9 = i15;
                int i18 = z29;
                c1613j.f21038h = w7.getLong(i18);
                int i19 = z12;
                int i20 = z30;
                c1613j.f21039i = w7.getLong(i20);
                int i21 = z31;
                c1613j.f21040k = w7.getInt(i21);
                int i22 = z32;
                c1613j.f21041l = D1.w(w7.getInt(i22));
                z30 = i20;
                int i23 = z33;
                c1613j.f21042m = w7.getLong(i23);
                int i24 = z34;
                c1613j.f21043n = w7.getLong(i24);
                z34 = i24;
                int i25 = z35;
                c1613j.f21044o = w7.getLong(i25);
                int i26 = z36;
                c1613j.f21045p = w7.getLong(i26);
                int i27 = z37;
                if (w7.getInt(i27) != 0) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                c1613j.f21046q = z26;
                int i28 = z38;
                c1613j.f21047r = D1.y(w7.getInt(i28));
                c1613j.j = cVar;
                arrayList.add(c1613j);
                z33 = i23;
                z12 = i19;
                z32 = i22;
                z38 = i28;
                z10 = i13;
                z28 = i17;
                z29 = i18;
                z31 = i21;
                z36 = i26;
                z19 = i11;
                z9 = i12;
                z37 = i27;
                z35 = i25;
                z21 = i16;
                z17 = i10;
                z11 = i14;
            }
            w7.close();
            g9.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            w7.close();
            g9.g();
            throw th;
        }
    }

    public ArrayList h() {
        G g9;
        int z9;
        int z10;
        int z11;
        int z12;
        int z13;
        int z14;
        int z15;
        int z16;
        int z17;
        int z18;
        int z19;
        int z20;
        int z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        G a5 = G.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2887a;
        workDatabase_Impl.b();
        Cursor w7 = n.w(workDatabase_Impl, a5, false);
        try {
            z9 = s8.e.z(w7, "required_network_type");
            z10 = s8.e.z(w7, "requires_charging");
            z11 = s8.e.z(w7, "requires_device_idle");
            z12 = s8.e.z(w7, "requires_battery_not_low");
            z13 = s8.e.z(w7, "requires_storage_not_low");
            z14 = s8.e.z(w7, "trigger_content_update_delay");
            z15 = s8.e.z(w7, "trigger_max_content_delay");
            z16 = s8.e.z(w7, "content_uri_triggers");
            z17 = s8.e.z(w7, "id");
            z18 = s8.e.z(w7, "state");
            z19 = s8.e.z(w7, "worker_class_name");
            z20 = s8.e.z(w7, "input_merger_class_name");
            z21 = s8.e.z(w7, "input");
            g9 = a5;
        } catch (Throwable th) {
            th = th;
            g9 = a5;
        }
        try {
            int z27 = s8.e.z(w7, "output");
            int z28 = s8.e.z(w7, "initial_delay");
            int z29 = s8.e.z(w7, "interval_duration");
            int z30 = s8.e.z(w7, "flex_duration");
            int z31 = s8.e.z(w7, "run_attempt_count");
            int z32 = s8.e.z(w7, "backoff_policy");
            int z33 = s8.e.z(w7, "backoff_delay_duration");
            int z34 = s8.e.z(w7, "period_start_time");
            int z35 = s8.e.z(w7, "minimum_retention_duration");
            int z36 = s8.e.z(w7, "schedule_requested_at");
            int z37 = s8.e.z(w7, "run_in_foreground");
            int z38 = s8.e.z(w7, "out_of_quota_policy");
            int i9 = z27;
            ArrayList arrayList = new ArrayList(w7.getCount());
            while (w7.moveToNext()) {
                String string = w7.getString(z17);
                int i10 = z17;
                String string2 = w7.getString(z19);
                int i11 = z19;
                e1.c cVar = new e1.c();
                int i12 = z9;
                cVar.f17031a = D1.x(w7.getInt(z9));
                if (w7.getInt(z10) != 0) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                cVar.f17032b = z22;
                if (w7.getInt(z11) != 0) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                cVar.f17033c = z23;
                if (w7.getInt(z12) != 0) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                cVar.f17034d = z24;
                if (w7.getInt(z13) != 0) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                cVar.f17035e = z25;
                int i13 = z10;
                int i14 = z11;
                cVar.f17036f = w7.getLong(z14);
                cVar.f17037g = w7.getLong(z15);
                cVar.f17038h = D1.e(w7.getBlob(z16));
                C1613j c1613j = new C1613j(string, string2);
                c1613j.f21032b = D1.z(w7.getInt(z18));
                c1613j.f21034d = w7.getString(z20);
                c1613j.f21035e = e1.h.a(w7.getBlob(z21));
                int i15 = i9;
                c1613j.f21036f = e1.h.a(w7.getBlob(i15));
                int i16 = z21;
                int i17 = z28;
                c1613j.f21037g = w7.getLong(i17);
                i9 = i15;
                int i18 = z29;
                c1613j.f21038h = w7.getLong(i18);
                int i19 = z12;
                int i20 = z30;
                c1613j.f21039i = w7.getLong(i20);
                int i21 = z31;
                c1613j.f21040k = w7.getInt(i21);
                int i22 = z32;
                c1613j.f21041l = D1.w(w7.getInt(i22));
                z30 = i20;
                int i23 = z33;
                c1613j.f21042m = w7.getLong(i23);
                int i24 = z34;
                c1613j.f21043n = w7.getLong(i24);
                z34 = i24;
                int i25 = z35;
                c1613j.f21044o = w7.getLong(i25);
                int i26 = z36;
                c1613j.f21045p = w7.getLong(i26);
                int i27 = z37;
                if (w7.getInt(i27) != 0) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                c1613j.f21046q = z26;
                int i28 = z38;
                c1613j.f21047r = D1.y(w7.getInt(i28));
                c1613j.j = cVar;
                arrayList.add(c1613j);
                z33 = i23;
                z12 = i19;
                z32 = i22;
                z38 = i28;
                z10 = i13;
                z28 = i17;
                z29 = i18;
                z31 = i21;
                z36 = i26;
                z19 = i11;
                z9 = i12;
                z37 = i27;
                z35 = i25;
                z21 = i16;
                z17 = i10;
                z11 = i14;
            }
            w7.close();
            g9.g();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            w7.close();
            g9.g();
            throw th;
        }
    }

    public c i() {
        return (c) ((AtomicReference) this.f2894h).get();
    }

    public int j(String str) {
        G a5 = G.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            a5.t(1);
        } else {
            a5.m(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2887a;
        workDatabase_Impl.b();
        int i9 = 0;
        Cursor w7 = n.w(workDatabase_Impl, a5, false);
        try {
            if (w7.moveToFirst()) {
                i9 = D1.z(w7.getInt(0));
            }
            return i9;
        } finally {
            w7.close();
            a5.g();
        }
    }

    public ArrayList k(String str) {
        G a5 = G.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a5.t(1);
        } else {
            a5.m(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2887a;
        workDatabase_Impl.b();
        Cursor w7 = n.w(workDatabase_Impl, a5, false);
        try {
            ArrayList arrayList = new ArrayList(w7.getCount());
            while (w7.moveToNext()) {
                arrayList.add(w7.getString(0));
            }
            return arrayList;
        } finally {
            w7.close();
            a5.g();
        }
    }

    public C1613j l(String str) {
        G g9;
        int z9;
        int z10;
        int z11;
        int z12;
        int z13;
        int z14;
        int z15;
        int z16;
        int z17;
        int z18;
        int z19;
        int z20;
        int z21;
        C1613j c1613j;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        G a5 = G.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            a5.t(1);
        } else {
            a5.m(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2887a;
        workDatabase_Impl.b();
        Cursor w7 = n.w(workDatabase_Impl, a5, false);
        try {
            z9 = s8.e.z(w7, "required_network_type");
            z10 = s8.e.z(w7, "requires_charging");
            z11 = s8.e.z(w7, "requires_device_idle");
            z12 = s8.e.z(w7, "requires_battery_not_low");
            z13 = s8.e.z(w7, "requires_storage_not_low");
            z14 = s8.e.z(w7, "trigger_content_update_delay");
            z15 = s8.e.z(w7, "trigger_max_content_delay");
            z16 = s8.e.z(w7, "content_uri_triggers");
            z17 = s8.e.z(w7, "id");
            z18 = s8.e.z(w7, "state");
            z19 = s8.e.z(w7, "worker_class_name");
            z20 = s8.e.z(w7, "input_merger_class_name");
            z21 = s8.e.z(w7, "input");
            g9 = a5;
        } catch (Throwable th) {
            th = th;
            g9 = a5;
        }
        try {
            int z27 = s8.e.z(w7, "output");
            int z28 = s8.e.z(w7, "initial_delay");
            int z29 = s8.e.z(w7, "interval_duration");
            int z30 = s8.e.z(w7, "flex_duration");
            int z31 = s8.e.z(w7, "run_attempt_count");
            int z32 = s8.e.z(w7, "backoff_policy");
            int z33 = s8.e.z(w7, "backoff_delay_duration");
            int z34 = s8.e.z(w7, "period_start_time");
            int z35 = s8.e.z(w7, "minimum_retention_duration");
            int z36 = s8.e.z(w7, "schedule_requested_at");
            int z37 = s8.e.z(w7, "run_in_foreground");
            int z38 = s8.e.z(w7, "out_of_quota_policy");
            if (w7.moveToFirst()) {
                String string = w7.getString(z17);
                String string2 = w7.getString(z19);
                e1.c cVar = new e1.c();
                cVar.f17031a = D1.x(w7.getInt(z9));
                if (w7.getInt(z10) != 0) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                cVar.f17032b = z22;
                if (w7.getInt(z11) != 0) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                cVar.f17033c = z23;
                if (w7.getInt(z12) != 0) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                cVar.f17034d = z24;
                if (w7.getInt(z13) != 0) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                cVar.f17035e = z25;
                cVar.f17036f = w7.getLong(z14);
                cVar.f17037g = w7.getLong(z15);
                cVar.f17038h = D1.e(w7.getBlob(z16));
                c1613j = new C1613j(string, string2);
                c1613j.f21032b = D1.z(w7.getInt(z18));
                c1613j.f21034d = w7.getString(z20);
                c1613j.f21035e = e1.h.a(w7.getBlob(z21));
                c1613j.f21036f = e1.h.a(w7.getBlob(z27));
                c1613j.f21037g = w7.getLong(z28);
                c1613j.f21038h = w7.getLong(z29);
                c1613j.f21039i = w7.getLong(z30);
                c1613j.f21040k = w7.getInt(z31);
                c1613j.f21041l = D1.w(w7.getInt(z32));
                c1613j.f21042m = w7.getLong(z33);
                c1613j.f21043n = w7.getLong(z34);
                c1613j.f21044o = w7.getLong(z35);
                c1613j.f21045p = w7.getLong(z36);
                if (w7.getInt(z37) != 0) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                c1613j.f21046q = z26;
                c1613j.f21047r = D1.y(w7.getInt(z38));
                c1613j.j = cVar;
            } else {
                c1613j = null;
            }
            w7.close();
            g9.g();
            return c1613j;
        } catch (Throwable th2) {
            th = th2;
            w7.close();
            g9.g();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, n1.h] */
    public ArrayList m(String str) {
        G a5 = G.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a5.t(1);
        } else {
            a5.m(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2887a;
        workDatabase_Impl.b();
        Cursor w7 = n.w(workDatabase_Impl, a5, false);
        try {
            int z9 = s8.e.z(w7, "id");
            int z10 = s8.e.z(w7, "state");
            ArrayList arrayList = new ArrayList(w7.getCount());
            while (w7.moveToNext()) {
                ?? obj = new Object();
                obj.f21021a = w7.getString(z9);
                obj.f21022b = D1.z(w7.getInt(z10));
                arrayList.add(obj);
            }
            return arrayList;
        } finally {
            w7.close();
            a5.g();
        }
    }

    public void o(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2887a;
        workDatabase_Impl.b();
        C1608e c1608e = (C1608e) this.f2894h;
        j a5 = c1608e.a();
        a5.z(j, 1);
        if (str == null) {
            a5.t(2);
        } else {
            a5.m(2, str);
        }
        workDatabase_Impl.c();
        try {
            a5.a();
            workDatabase_Impl.p();
        } finally {
            workDatabase_Impl.m();
            c1608e.i(a5);
        }
    }

    public void p(String str, e1.h hVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2887a;
        workDatabase_Impl.b();
        C1608e c1608e = (C1608e) this.f2890d;
        j a5 = c1608e.a();
        byte[] b9 = e1.h.b(hVar);
        if (b9 == null) {
            a5.t(1);
        } else {
            a5.U(1, b9);
        }
        if (str == null) {
            a5.t(2);
        } else {
            a5.m(2, str);
        }
        workDatabase_Impl.c();
        try {
            a5.a();
            workDatabase_Impl.p();
        } finally {
            workDatabase_Impl.m();
            c1608e.i(a5);
        }
    }

    public void q(long j, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2887a;
        workDatabase_Impl.b();
        C1608e c1608e = (C1608e) this.f2891e;
        j a5 = c1608e.a();
        a5.z(j, 1);
        if (str == null) {
            a5.t(2);
        } else {
            a5.m(2, str);
        }
        workDatabase_Impl.c();
        try {
            a5.a();
            workDatabase_Impl.p();
        } finally {
            workDatabase_Impl.m();
            c1608e.i(a5);
        }
    }

    public void r(int i9, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f2887a;
        workDatabase_Impl.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=? WHERE id IN (");
        h.b(strArr.length, sb);
        sb.append(")");
        String sql = sb.toString();
        kotlin.jvm.internal.h.e(sql, "sql");
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        j q9 = workDatabase_Impl.i().Z().q(sql);
        q9.z(D1.K(i9), 1);
        int i10 = 2;
        for (String str : strArr) {
            if (str == null) {
                q9.t(i10);
            } else {
                q9.m(i10, str);
            }
            i10++;
        }
        workDatabase_Impl.c();
        try {
            q9.a();
            workDatabase_Impl.p();
        } finally {
            workDatabase_Impl.m();
        }
    }
}
