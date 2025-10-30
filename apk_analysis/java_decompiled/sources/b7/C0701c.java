package b7;

import A1.i;
import A1.j;
import B6.u0;
import B7.k;
import F0.AbstractC0098c;
import F0.RunnableC0100d;
import F4.L;
import G2.q;
import G6.f;
import H2.t;
import M0.d;
import M0.e;
import N3.f0;
import O7.l;
import P.C0320v;
import P.InterfaceC0304e;
import P.InterfaceC0314o;
import P.Q;
import P.r0;
import Q2.T;
import a.AbstractC0485a;
import android.content.ClipData;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import b5.C0650n0;
import b5.J1;
import b5.O1;
import b5.RunnableC0659q0;
import b5.V;
import co.notix.R;
import com.anilab.data.model.response.ListPlayerResponse;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import d0.o;
import e1.h;
import f0.C1155g;
import j3.M;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import l1.C1535g;
import l4.n;
import l6.AbstractC1570b;
import org.json.JSONObject;
import z2.C2235a;

/* renamed from: b7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0701c implements j, InterfaceC0314o, q, M.a, f0, InterfaceC0304e, T, O1, Q.q {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0701c f11402c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11403a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11404b;

    public /* synthetic */ C0701c(int i9, Object obj) {
        this.f11403a = i9;
        this.f11404b = obj;
    }

    public static void C(R0.c cVar) {
        cVar.l("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.l("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        cVar.l("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        cVar.l("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        cVar.l("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        cVar.l("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        cVar.l("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.l("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        cVar.l("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.l("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.l("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        cVar.l("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        cVar.l("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        cVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static C0701c I(boolean z9, int i9, int i10, int i11, int i12) {
        return new C0701c(14, AccessibilityNodeInfo.CollectionItemInfo.obtain(i9, i10, i11, i12, false, z9));
    }

    public static L J(R0.c cVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new M0.b(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap.put("prerequisite_id", new M0.b(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new M0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new M0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id")));
        hashSet2.add(new d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id")));
        e eVar = new e("Dependency", hashMap, hashSet, hashSet2);
        e a5 = e.a(cVar, "Dependency");
        if (!eVar.equals(a5)) {
            return new L(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a5, 2);
        }
        HashMap hashMap2 = new HashMap(25);
        hashMap2.put("id", new M0.b(1, 1, "id", "TEXT", null, true));
        hashMap2.put("state", new M0.b(0, 1, "state", "INTEGER", null, true));
        hashMap2.put("worker_class_name", new M0.b(0, 1, "worker_class_name", "TEXT", null, true));
        hashMap2.put("input_merger_class_name", new M0.b(0, 1, "input_merger_class_name", "TEXT", null, false));
        hashMap2.put("input", new M0.b(0, 1, "input", "BLOB", null, true));
        hashMap2.put("output", new M0.b(0, 1, "output", "BLOB", null, true));
        hashMap2.put("initial_delay", new M0.b(0, 1, "initial_delay", "INTEGER", null, true));
        hashMap2.put("interval_duration", new M0.b(0, 1, "interval_duration", "INTEGER", null, true));
        hashMap2.put("flex_duration", new M0.b(0, 1, "flex_duration", "INTEGER", null, true));
        hashMap2.put("run_attempt_count", new M0.b(0, 1, "run_attempt_count", "INTEGER", null, true));
        hashMap2.put("backoff_policy", new M0.b(0, 1, "backoff_policy", "INTEGER", null, true));
        hashMap2.put("backoff_delay_duration", new M0.b(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        hashMap2.put("period_start_time", new M0.b(0, 1, "period_start_time", "INTEGER", null, true));
        hashMap2.put("minimum_retention_duration", new M0.b(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        hashMap2.put("schedule_requested_at", new M0.b(0, 1, "schedule_requested_at", "INTEGER", null, true));
        hashMap2.put("run_in_foreground", new M0.b(0, 1, "run_in_foreground", "INTEGER", null, true));
        hashMap2.put("out_of_quota_policy", new M0.b(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        hashMap2.put("required_network_type", new M0.b(0, 1, "required_network_type", "INTEGER", null, false));
        hashMap2.put("requires_charging", new M0.b(0, 1, "requires_charging", "INTEGER", null, true));
        hashMap2.put("requires_device_idle", new M0.b(0, 1, "requires_device_idle", "INTEGER", null, true));
        hashMap2.put("requires_battery_not_low", new M0.b(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        hashMap2.put("requires_storage_not_low", new M0.b(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        hashMap2.put("trigger_content_update_delay", new M0.b(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        hashMap2.put("trigger_max_content_delay", new M0.b(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        hashMap2.put("content_uri_triggers", new M0.b(0, 1, "content_uri_triggers", "BLOB", null, false));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at")));
        hashSet4.add(new d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time")));
        e eVar2 = new e("WorkSpec", hashMap2, hashSet3, hashSet4);
        e a9 = e.a(cVar, "WorkSpec");
        if (!eVar2.equals(a9)) {
            return new L(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a9, 2);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new M0.b(1, 1, "tag", "TEXT", null, true));
        hashMap3.put("work_spec_id", new M0.b(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new M0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id")));
        e eVar3 = new e("WorkTag", hashMap3, hashSet5, hashSet6);
        e a10 = e.a(cVar, "WorkTag");
        if (!eVar3.equals(a10)) {
            return new L(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a10, 2);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new M0.b(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap4.put("system_id", new M0.b(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new M0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        e eVar4 = new e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        e a11 = e.a(cVar, "SystemIdInfo");
        if (!eVar4.equals(a11)) {
            return new L(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a11, 2);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new M0.b(1, 1, "name", "TEXT", null, true));
        hashMap5.put("work_spec_id", new M0.b(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new M0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id")));
        e eVar5 = new e("WorkName", hashMap5, hashSet8, hashSet9);
        e a12 = e.a(cVar, "WorkName");
        if (!eVar5.equals(a12)) {
            return new L(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a12, 2);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new M0.b(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap6.put("progress", new M0.b(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new M0.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        e eVar6 = new e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        e a13 = e.a(cVar, "WorkProgress");
        if (!eVar6.equals(a13)) {
            return new L(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a13, 2);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new M0.b(1, 1, "key", "TEXT", null, true));
        hashMap7.put("long_value", new M0.b(0, 1, "long_value", "INTEGER", null, false));
        e eVar7 = new e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        e a14 = e.a(cVar, "Preference");
        if (!eVar7.equals(a14)) {
            return new L(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a14, 2);
        }
        return new L(true, (String) null, 2);
    }

    public String A(M m9) {
        String str;
        int i9 = m9.f19429e & 2;
        Resources resources = (Resources) this.f11404b;
        if (i9 != 0) {
            str = resources.getString(R.string.exo_track_role_alternate);
        } else {
            str = "";
        }
        int i10 = m9.f19429e;
        if ((i10 & 4) != 0) {
            str = H(str, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i10 & 8) != 0) {
            str = H(str, resources.getString(R.string.exo_track_role_commentary));
        }
        if ((i10 & 1088) != 0) {
            return H(str, resources.getString(R.string.exo_track_role_closed_captions));
        }
        return str;
    }

    @Override // N3.f0
    public void B(long j) {
        for (f0 f0Var : (f0[]) this.f11404b) {
            f0Var.B(j);
        }
    }

    public void D(int i9, int i10) {
        RunnableC0100d runnableC0100d = (RunnableC0100d) this.f11404b;
        Object obj = runnableC0100d.f2087a.get(i9);
        Object obj2 = runnableC0100d.f2088b.get(i10);
        if (obj != null && obj2 != null) {
            ((AbstractC0098c) runnableC0100d.f2091e.f2096b.f19c).getClass();
            return;
        }
        throw new AssertionError();
    }

    @Override // b5.O1
    public void E(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        J1 j12 = (J1) this.f11404b;
        if (isEmpty) {
            C0650n0 c0650n0 = j12.f10755l;
            if (c0650n0 != null) {
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10971f.c(str2, "AppId not known when logging event");
                return;
            }
            return;
        }
        j12.K().v0(new RunnableC0659q0(this, str, str2, bundle));
    }

    public Set F() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f11404b)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) this.f11404b);
        }
        return unmodifiableSet;
    }

    public String G(M m9) {
        String v8;
        String str;
        String str2;
        int h7 = n.h(m9.f19435l);
        int i9 = m9.f19448y;
        int i10 = m9.f19441r;
        int i11 = m9.f19440q;
        if (h7 == -1) {
            String str3 = m9.f19433i;
            if (n.i(str3) == null) {
                if (n.a(str3) == null) {
                    if (i11 == -1 && i10 == -1) {
                        if (i9 == -1 && m9.f19449z == -1) {
                            h7 = -1;
                        }
                    }
                }
                h7 = 1;
            }
            h7 = 2;
        }
        Resources resources = (Resources) this.f11404b;
        String str4 = "";
        int i12 = m9.f19432h;
        if (h7 == 2) {
            String A2 = A(m9);
            if (i11 == -1 || i10 == -1) {
                str2 = "";
            } else {
                str2 = resources.getString(R.string.exo_track_resolution, Integer.valueOf(i11), Integer.valueOf(i10));
            }
            if (i12 != -1) {
                str4 = resources.getString(R.string.exo_track_bitrate, Float.valueOf(i12 / 1000000.0f));
            }
            v8 = H(A2, str2, str4);
        } else if (h7 == 1) {
            String v9 = v(m9);
            if (i9 == -1 || i9 < 1) {
                str = "";
            } else if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 6 && i9 != 7) {
                        if (i9 != 8) {
                            str = resources.getString(R.string.exo_track_surround);
                        } else {
                            str = resources.getString(R.string.exo_track_surround_7_point_1);
                        }
                    } else {
                        str = resources.getString(R.string.exo_track_surround_5_point_1);
                    }
                } else {
                    str = resources.getString(R.string.exo_track_stereo);
                }
            } else {
                str = resources.getString(R.string.exo_track_mono);
            }
            if (i12 != -1) {
                str4 = resources.getString(R.string.exo_track_bitrate, Float.valueOf(i12 / 1000000.0f));
            }
            v8 = H(v9, str, str4);
        } else {
            v8 = v(m9);
        }
        if (v8.length() == 0) {
            return resources.getString(R.string.exo_track_unknown);
        }
        return v8;
    }

    public String H(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = ((Resources) this.f11404b).getString(R.string.exo_item_list, str, str2);
                }
            }
        }
        return str;
    }

    public G6.c K(JSONObject jSONObject) {
        f fVar;
        int i9 = jSONObject.getInt("settings_version");
        if (i9 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i9 + ". Using default settings values.", null);
            fVar = new F5.e(6);
        } else {
            fVar = new Q6.f(6);
        }
        return fVar.d((o) this.f11404b, jSONObject);
    }

    public void L(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = (HashMap) this.f11404b;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                    int i9 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = h.f17048b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i9 < zArr.length) {
                            boolArr[i9] = Boolean.valueOf(zArr[i9]);
                            i9++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = h.f17048b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i9 < bArr.length) {
                            bArr2[i9] = Byte.valueOf(bArr[i9]);
                            i9++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = h.f17048b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i9 < iArr.length) {
                            numArr[i9] = Integer.valueOf(iArr[i9]);
                            i9++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = h.f17048b;
                        Long[] lArr = new Long[jArr.length];
                        while (i9 < jArr.length) {
                            lArr[i9] = Long.valueOf(jArr[i9]);
                            i9++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = h.f17048b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i9 < fArr.length) {
                            fArr2[i9] = Float.valueOf(fArr[i9]);
                            i9++;
                        }
                        hashMap2.put(str, fArr2);
                    } else if (cls == double[].class) {
                        double[] dArr = (double[]) value;
                        String str7 = h.f17048b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i9 < dArr.length) {
                            dArr2[i9] = Double.valueOf(dArr[i9]);
                            i9++;
                        }
                        hashMap2.put(str, dArr2);
                    } else {
                        throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                    }
                } else {
                    hashMap2.put(str, value);
                }
            }
        }
    }

    @Override // N3.f0
    public boolean a() {
        for (f0 f0Var : (f0[]) this.f11404b) {
            if (f0Var.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // M.a
    public Cursor b(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f11404b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e8) {
            Log.w("FontsProvider", "Unable to query the content provider", e8);
            return null;
        }
    }

    @Override // M.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f11404b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // A1.j
    public A1.c d(A1.b bVar) {
        return null;
    }

    @Override // A1.j
    public void f(A1.b bVar, Bitmap bitmap, Map map) {
        ((i) this.f11404b).l(bVar, bitmap, map, AbstractC0485a.o(bitmap));
    }

    @Override // Q.q
    public boolean g(View view) {
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) ((C1535g) this.f11404b).f20185d;
        if (viewPager2.f10408r) {
            viewPager2.c(currentItem, true);
        }
        return true;
    }

    @Override // N3.f0
    public long h() {
        long j = Long.MAX_VALUE;
        for (f0 f0Var : (f0[]) this.f11404b) {
            long h7 = f0Var.h();
            if (h7 != Long.MIN_VALUE) {
                j = Math.min(j, h7);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // P.InterfaceC0304e
    public int i() {
        int flags;
        flags = ((ContentInfo) this.f11404b).getFlags();
        return flags;
    }

    @Override // P.InterfaceC0304e
    public ClipData j() {
        ClipData clip;
        clip = ((ContentInfo) this.f11404b).getClip();
        return clip;
    }

    @Override // P.InterfaceC0304e
    public ContentInfo m() {
        return (ContentInfo) this.f11404b;
    }

    @Override // G2.q
    public Object n(Object obj) {
        boolean z9;
        int i9;
        List y02;
        ListPlayerResponse dto = (ListPlayerResponse) obj;
        kotlin.jvm.internal.h.e(dto, "dto");
        boolean z10 = false;
        Boolean bool = dto.f14192a;
        if (bool != null) {
            z9 = bool.booleanValue();
        } else {
            z9 = false;
        }
        Integer num = dto.f14193b;
        if (num != null) {
            i9 = num.intValue();
        } else {
            i9 = 0;
        }
        Integer num2 = dto.f14194c;
        if (num2 != null && num2.intValue() == 1) {
            z10 = true;
        }
        C2235a c2235a = (C2235a) this.f11404b;
        List list = dto.f14195d;
        if (num2 != null && num2.intValue() == 1) {
            y02 = AbstractC1570b.q(c2235a, list);
        } else {
            y02 = k.y0(u0.D(new t(-1L, "", "", true, true, 10, "", "")), AbstractC1570b.q(c2235a, list));
        }
        return new H2.o(z9, i9, z10, y02);
    }

    @Override // N3.f0
    public long p() {
        long j = Long.MAX_VALUE;
        for (f0 f0Var : (f0[]) this.f11404b) {
            long p9 = f0Var.p();
            if (p9 != Long.MIN_VALUE) {
                j = Math.min(j, p9);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // P.InterfaceC0304e
    public int r() {
        int source;
        source = ((ContentInfo) this.f11404b).getSource();
        return source;
    }

    public boolean s(int i9, int i10) {
        RunnableC0100d runnableC0100d = (RunnableC0100d) this.f11404b;
        Object obj = runnableC0100d.f2087a.get(i9);
        Object obj2 = runnableC0100d.f2088b.get(i10);
        if (obj != null && obj2 != null) {
            return ((AbstractC0098c) runnableC0100d.f2091e.f2096b.f19c).a(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    @Override // P.InterfaceC0314o
    public P.u0 t(View view, P.u0 u0Var) {
        boolean z9;
        boolean z10;
        P.u0 u0Var2;
        switch (this.f11403a) {
            case 2:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f11404b;
                if (!Objects.equals(coordinatorLayout.f9559n, u0Var)) {
                    coordinatorLayout.f9559n = u0Var;
                    if (u0Var.d() > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    coordinatorLayout.f9560o = z9;
                    if (!z9 && coordinatorLayout.getBackground() == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    coordinatorLayout.setWillNotDraw(z10);
                    r0 r0Var = u0Var.f5645a;
                    if (!r0Var.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i9 = 0; i9 < childCount; i9++) {
                            View childAt = coordinatorLayout.getChildAt(i9);
                            WeakHashMap weakHashMap = Q.f5546a;
                            if (!childAt.getFitsSystemWindows() || ((B.f) childAt.getLayoutParams()).f567a == null || !r0Var.m()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return u0Var;
            default:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.f11404b;
                WeakHashMap weakHashMap2 = Q.f5546a;
                if (collapsingToolbarLayout.getFitsSystemWindows()) {
                    u0Var2 = u0Var;
                } else {
                    u0Var2 = null;
                }
                if (!Objects.equals(collapsingToolbarLayout.f15751A, u0Var2)) {
                    collapsingToolbarLayout.f15751A = u0Var2;
                    collapsingToolbarLayout.requestLayout();
                }
                return u0Var.f5645a.c();
        }
    }

    public String toString() {
        switch (this.f11403a) {
            case 12:
                return "ContentInfoCompat{" + ((ContentInfo) this.f11404b) + "}";
            default:
                return super.toString();
        }
    }

    public boolean u(int i9, int i10) {
        RunnableC0100d runnableC0100d = (RunnableC0100d) this.f11404b;
        Object obj = runnableC0100d.f2087a.get(i9);
        Object obj2 = runnableC0100d.f2088b.get(i10);
        if (obj != null && obj2 != null) {
            return ((AbstractC0098c) runnableC0100d.f2091e.f2096b.f19c).b(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String v(j3.M r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f19427c
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = ""
            if (r1 != 0) goto L3e
            java.lang.String r1 = "und"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L13
            goto L3e
        L13:
            int r1 = l4.y.f20553a
            r3 = 21
            if (r1 < r3) goto L1e
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            goto L24
        L1e:
            java.util.Locale r3 = new java.util.Locale
            r3.<init>(r0)
            r0 = r3
        L24:
            r3 = 24
            if (r1 < r3) goto L30
            com.google.android.material.datepicker.u.A()
            java.util.Locale r1 = com.google.android.material.datepicker.u.B()
            goto L34
        L30:
            java.util.Locale r1 = java.util.Locale.getDefault()
        L34:
            java.lang.String r0 = r0.getDisplayName(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L40
        L3e:
            r0 = r2
            goto L61
        L40:
            r3 = 1
            r4 = 0
            int r3 = r0.offsetByCodePoints(r4, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L61
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L61
            r5.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L61
            java.lang.String r4 = r0.substring(r4, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L61
            java.lang.String r1 = r4.toUpperCase(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L61
            r5.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L61
            java.lang.String r1 = r0.substring(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L61
            r5.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L61
            java.lang.String r0 = r5.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L61
        L61:
            java.lang.String r1 = r6.A(r7)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = r6.H(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L7e
            java.lang.String r7 = r7.f19426b
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L7c
            goto L7d
        L7c:
            r2 = r7
        L7d:
            r0 = r2
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.C0701c.v(j3.M):java.lang.String");
    }

    @Override // N3.f0
    public boolean z(long j) {
        boolean z9;
        boolean z10;
        boolean z11 = false;
        do {
            long h7 = h();
            if (h7 == Long.MIN_VALUE) {
                return z11;
            }
            z9 = false;
            for (f0 f0Var : (f0[]) this.f11404b) {
                long h9 = f0Var.h();
                if (h9 != Long.MIN_VALUE && h9 <= j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (h9 == h7 || z10) {
                    z9 |= f0Var.z(j);
                }
            }
            z11 |= z9;
        } while (z9);
        return z11;
    }

    public C0701c(int i9) {
        this.f11403a = i9;
        switch (i9) {
            case 9:
                return;
            case 16:
                this.f11404b = null;
                return;
            case 18:
                this.f11404b = new SparseArray();
                return;
            case 20:
                this.f11404b = new AtomicInteger(0);
                return;
            case 27:
                this.f11404b = new HashMap();
                return;
            default:
                this.f11404b = new HashSet();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0701c(l lVar) {
        this.f11403a = 21;
        this.f11404b = (kotlin.jvm.internal.i) lVar;
    }

    public C0701c(Resources resources) {
        this.f11403a = 15;
        resources.getClass();
        this.f11404b = resources;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [P.v, java.lang.Object, P.x] */
    public C0701c(View view) {
        this.f11403a = 13;
        if (Build.VERSION.SDK_INT >= 30) {
            ?? c0320v = new C0320v(view);
            c0320v.f5650b = view;
            this.f11404b = c0320v;
            return;
        }
        this.f11404b = new C0320v(view);
    }

    public C0701c(TextView textView) {
        this.f11403a = 28;
        this.f11404b = new C1155g(textView);
    }

    public C0701c(Context context, Uri uri) {
        this.f11403a = 10;
        this.f11404b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public C0701c(ContentInfo contentInfo) {
        this.f11403a = 12;
        contentInfo.getClass();
        this.f11404b = C3.q.p(contentInfo);
    }

    @Override // A1.j
    public void e(int i9) {
    }
}
