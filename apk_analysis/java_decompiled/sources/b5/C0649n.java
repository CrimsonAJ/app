package b5;

import F0.C0104h;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0903a1;
import com.google.android.gms.internal.measurement.C0908b1;
import com.google.android.gms.internal.measurement.C0913c1;
import com.google.android.gms.internal.measurement.C0918d1;
import com.google.android.gms.internal.measurement.K3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: b5.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649n extends D1 {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f11202f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f11203g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f11204h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f11205i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"};
    public static final String[] j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f11206k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f11207l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f11208m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f11209n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f11210o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: p, reason: collision with root package name */
    public static final String[] f11211p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d, reason: collision with root package name */
    public final C0646m f11212d;

    /* renamed from: e, reason: collision with root package name */
    public final C0104h f11213e;

    public C0649n(J1 j12) {
        super(j12);
        this.f11213e = new C0104h(((C0650n0) this.f1707a).f11233n);
        ((C0650n0) this.f1707a).getClass();
        this.f11212d = new C0646m(this, ((C0650n0) this.f1707a).f11221a);
    }

    public static final String U0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        return A0.a.n(" AND (upload_type IN (", TextUtils.join(", ", arrayList), "))");
    }

    public static final void b1(ContentValues contentValues, Object obj) {
        F4.y.e("value");
        F4.y.h(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put("value", (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final void A0() {
        m0();
        h1().endTransaction();
    }

    public final void B0(ArrayList arrayList) {
        l0();
        m0();
        F4.y.h(arrayList);
        if (arrayList.size() != 0) {
            if (!W0()) {
                return;
            }
            String n7 = A0.a.n("(", TextUtils.join(",", arrayList), ")");
            long c12 = c1("SELECT COUNT(1) FROM queue WHERE rowid IN " + n7 + " AND retry_count =  2147483647 LIMIT 1", null);
            C0650n0 c0650n0 = (C0650n0) this.f1707a;
            if (c12 > 0) {
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10974i.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                h1().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + n7 + " AND (retry_count IS NULL OR retry_count < 2147483647)");
                return;
            } catch (SQLiteException e8) {
                V v9 = c0650n0.f11229i;
                C0650n0.f(v9);
                v9.f10971f.c(e8, "Error incrementing retry count. error");
                return;
            }
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public final void C0(Long l9) {
        String str;
        l0();
        m0();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (c0650n0.f11227g.y0(null, E.f10611N0) && W0()) {
            long c12 = c1("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l9 + " AND retry_count =  2147483647 LIMIT 1", null);
            V v8 = c0650n0.f11229i;
            if (c12 > 0) {
                C0650n0.f(v8);
                v8.f10974i.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase h12 = h1();
                if (c0650n0.f11227g.y0(null, E.f10617Q0)) {
                    c0650n0.f11233n.getClass();
                    str = " SET retry_count = retry_count + 1, last_upload_timestamp = " + System.currentTimeMillis();
                } else {
                    str = " SET retry_count = retry_count + 1 ";
                }
                h12.execSQL("UPDATE upload_queue" + str + " WHERE rowid = " + l9 + " AND retry_count < 2147483647");
            } catch (SQLiteException e8) {
                C0650n0.f(v8);
                v8.f10971f.c(e8, "Error incrementing retry count. error");
            }
        }
    }

    public final void D0() {
        l0();
        m0();
        if (W0()) {
            J1 j12 = this.f11361b;
            long f9 = j12.f10753i.f11260e.f();
            C0650n0 c0650n0 = (C0650n0) this.f1707a;
            c0650n0.f11233n.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - f9) > ((Long) E.f10608M.a(null)).longValue()) {
                j12.f10753i.f11260e.g(elapsedRealtime);
                l0();
                m0();
                if (W0()) {
                    SQLiteDatabase h12 = h1();
                    c0650n0.f11233n.getClass();
                    int delete = h12.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) E.f10618R.a(null)).longValue())});
                    if (delete > 0) {
                        V v8 = c0650n0.f11229i;
                        C0650n0.f(v8);
                        v8.f10978n.c(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void E0(String str, String str2) {
        F4.y.e(str);
        F4.y.e(str2);
        l0();
        m0();
        try {
            h1().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            C0650n0 c0650n0 = (C0650n0) this.f1707a;
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10971f.e("Error deleting user property. appId", V.t0(str), c0650n0.f11232m.f(str2), e8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        S0("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F0(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.F0(java.lang.String):void");
    }

    public final void G0() {
        m0();
        h1().setTransactionSuccessful();
    }

    public final void H0(Q q9, boolean z9) {
        l0();
        m0();
        String c3 = q9.c();
        F4.y.h(c3);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c3);
        B0 b02 = B0.ANALYTICS_STORAGE;
        J1 j12 = this.f11361b;
        if (z9) {
            contentValues.put("app_instance_id", (String) null);
        } else if (j12.n0(c3).k(b02)) {
            contentValues.put("app_instance_id", q9.d());
        }
        contentValues.put("gmp_app_id", q9.g());
        boolean k5 = j12.n0(c3).k(B0.AD_STORAGE);
        C0650n0 c0650n0 = q9.f10865a;
        if (k5) {
            C0647m0 c0647m0 = c0650n0.j;
            C0650n0.f(c0647m0);
            c0647m0.l0();
            contentValues.put("resettable_device_id_hash", q9.f10869e);
        }
        C0647m0 c0647m02 = c0650n0.j;
        C0650n0.f(c0647m02);
        c0647m02.l0();
        contentValues.put("last_bundle_index", Long.valueOf(q9.f10871g));
        C0647m0 c0647m03 = c0650n0.j;
        C0650n0.f(c0647m03);
        c0647m03.l0();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(q9.f10872h));
        C0647m0 c0647m04 = c0650n0.j;
        C0650n0.f(c0647m04);
        c0647m04.l0();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(q9.f10873i));
        contentValues.put("app_version", q9.e());
        C0647m0 c0647m05 = c0650n0.j;
        C0650n0.f(c0647m05);
        c0647m05.l0();
        contentValues.put("app_store", q9.f10875l);
        C0647m0 c0647m06 = c0650n0.j;
        C0650n0.f(c0647m06);
        c0647m06.l0();
        contentValues.put("gmp_version", Long.valueOf(q9.f10876m));
        C0647m0 c0647m07 = c0650n0.j;
        C0650n0.f(c0647m07);
        c0647m07.l0();
        contentValues.put("dev_cert_hash", Long.valueOf(q9.f10877n));
        C0647m0 c0647m08 = c0650n0.j;
        C0650n0.f(c0647m08);
        c0647m08.l0();
        contentValues.put("measurement_enabled", Boolean.valueOf(q9.f10878o));
        C0647m0 c0647m09 = c0650n0.j;
        C0650n0.f(c0647m09);
        c0647m09.l0();
        contentValues.put("day", Long.valueOf(q9.K));
        C0647m0 c0647m010 = c0650n0.j;
        C0650n0.f(c0647m010);
        c0647m010.l0();
        contentValues.put("daily_public_events_count", Long.valueOf(q9.f10856L));
        C0650n0.f(c0647m010);
        c0647m010.l0();
        contentValues.put("daily_events_count", Long.valueOf(q9.f10857M));
        C0650n0.f(c0647m010);
        c0647m010.l0();
        contentValues.put("daily_conversions_count", Long.valueOf(q9.f10858N));
        C0647m0 c0647m011 = c0650n0.j;
        C0650n0.f(c0647m011);
        c0647m011.l0();
        contentValues.put("config_fetched_time", Long.valueOf(q9.f10863S));
        C0647m0 c0647m012 = c0650n0.j;
        C0650n0.f(c0647m012);
        c0647m012.l0();
        contentValues.put("failed_config_fetch_time", Long.valueOf(q9.f10864T));
        contentValues.put("app_version_int", Long.valueOf(q9.S()));
        contentValues.put("firebase_instance_id", q9.f());
        C0650n0.f(c0647m010);
        c0647m010.l0();
        contentValues.put("daily_error_events_count", Long.valueOf(q9.f10859O));
        C0650n0.f(c0647m010);
        c0647m010.l0();
        contentValues.put("daily_realtime_events_count", Long.valueOf(q9.f10860P));
        C0650n0.f(c0647m010);
        c0647m010.l0();
        contentValues.put("health_monitor_sample", q9.f10861Q);
        contentValues.put("android_id", (Long) 0L);
        C0647m0 c0647m013 = c0650n0.j;
        C0650n0.f(c0647m013);
        c0647m013.l0();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(q9.f10879p));
        contentValues.put("admob_app_id", q9.a());
        contentValues.put("dynamite_version", Long.valueOf(q9.T()));
        if (j12.n0(c3).k(b02)) {
            C0647m0 c0647m014 = c0650n0.j;
            C0650n0.f(c0647m014);
            c0647m014.l0();
            contentValues.put("session_stitching_token", q9.f10884u);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(q9.t()));
        C0647m0 c0647m015 = c0650n0.j;
        C0650n0.f(c0647m015);
        c0647m015.l0();
        contentValues.put("target_os_version", Long.valueOf(q9.f10886w));
        C0647m0 c0647m016 = c0650n0.j;
        C0650n0.f(c0647m016);
        c0647m016.l0();
        contentValues.put("session_stitching_token_hash", Long.valueOf(q9.f10887x));
        K3.b();
        C0650n0 c0650n02 = (C0650n0) this.f1707a;
        if (c0650n02.f11227g.y0(c3, E.f10629W0)) {
            C0647m0 c0647m017 = c0650n0.j;
            C0650n0.f(c0647m017);
            c0647m017.l0();
            contentValues.put("ad_services_version", Integer.valueOf(q9.f10888y));
            C0647m0 c0647m018 = c0650n0.j;
            C0650n0.f(c0647m018);
            c0647m018.l0();
            contentValues.put("attribution_eligibility_status", Long.valueOf(q9.f10848C));
        }
        C0647m0 c0647m019 = c0650n0.j;
        C0650n0.f(c0647m019);
        c0647m019.l0();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(q9.f10889z));
        contentValues.put("npa_metadata_value", q9.U());
        C0647m0 c0647m020 = c0650n0.j;
        C0650n0.f(c0647m020);
        c0647m020.l0();
        contentValues.put("bundle_delivery_index", Long.valueOf(q9.f10852G));
        contentValues.put("sgtm_preview_key", q9.i());
        C0650n0.f(c0647m010);
        c0647m010.l0();
        contentValues.put("dma_consent_state", Integer.valueOf(q9.f10850E));
        C0650n0.f(c0647m010);
        c0647m010.l0();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(q9.f10851F));
        contentValues.put("serialized_npa_metadata", q9.h());
        D d9 = E.f10617Q0;
        C0628g c0628g = c0650n02.f11227g;
        if (c0628g.y0(c3, d9)) {
            contentValues.put("client_upload_eligibility", Integer.valueOf(q9.R()));
        }
        C0647m0 c0647m021 = c0650n0.j;
        C0650n0.f(c0647m021);
        c0647m021.l0();
        ArrayList arrayList = q9.f10883t;
        V v8 = c0650n02.f11229i;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                C0650n0.f(v8);
                v8.f10974i.c(c3, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (c0628g.y0(null, E.f10605K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        C0647m0 c0647m022 = c0650n0.j;
        C0650n0.f(c0647m022);
        c0647m022.l0();
        contentValues.put("unmatched_pfo", q9.f10846A);
        C0647m0 c0647m023 = c0650n0.j;
        C0650n0.f(c0647m023);
        c0647m023.l0();
        contentValues.put("unmatched_uwa", q9.f10847B);
        C0647m0 c0647m024 = c0650n0.j;
        C0650n0.f(c0647m024);
        c0647m024.l0();
        contentValues.put("ad_campaign_info", q9.f10854I);
        try {
            SQLiteDatabase h12 = h1();
            if (h12.update("apps", contentValues, "app_id = ?", new String[]{c3}) == 0 && h12.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                C0650n0.f(v8);
                v8.f10971f.c(V.t0(c3), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e8) {
            C0650n0.f(v8);
            v8.f10971f.d(V.t0(c3), e8, "Error storing app. appId");
        }
    }

    public final void I0(String str, C0 c02) {
        F4.y.h(str);
        l0();
        m0();
        J0(str, p1(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", c02.j());
        T0(contentValues);
    }

    public final void J0(String str, C0 c02) {
        F4.y.h(str);
        F4.y.h(c02);
        l0();
        m0();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c02.j());
        contentValues.put("consent_source", Integer.valueOf(c02.f10566b));
        T0(contentValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0074 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean K0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r8.f1707a
            b5.n0 r2 = (b5.C0650n0) r2
            b5.g r3 = r2.f11227g
            b5.D r4 = b5.E.f10611N0
            r5 = 0
            boolean r3 = r3.y0(r5, r4)
            if (r3 == 0) goto L75
            b5.D r3 = b5.E.f10617Q0
            b5.g r2 = r2.f11227g
            boolean r2 = r2.y0(r5, r3)
            r3 = 0
            if (r2 == 0) goto L5e
            b5.Z0[] r2 = new b5.Z0[r0]
            b5.Z0 r5 = b5.Z0.GOOGLE_SIGNAL
            r2[r1] = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            r2 = r2[r1]
            int r2 = r2.f11011a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.add(r2)
            java.lang.String r2 = U0(r5)
            java.lang.String r5 = r8.P0()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?"
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = " AND NOT "
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = r6.toString()
            java.lang.String[] r9 = new java.lang.String[]{r9}
            long r5 = r8.c1(r2, r9)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 == 0) goto L75
            goto L74
        L5e:
            java.lang.String r2 = r8.P0()
            java.lang.String[] r9 = new java.lang.String[]{r9}
            java.lang.String r5 = "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT "
            java.lang.String r2 = r5.concat(r2)
            long r5 = r8.c1(r2, r9)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 == 0) goto L75
        L74:
            return r0
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.K0(java.lang.String):boolean");
    }

    public final boolean L0(String str, String str2) {
        if (c1("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0) {
            return true;
        }
        return false;
    }

    public final void M0(String str, String str2) {
        F4.y.e(str);
        F4.y.e(str2);
        l0();
        m0();
        try {
            h1().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e8) {
            C0650n0 c0650n0 = (C0650n0) this.f1707a;
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10971f.e("Error deleting conditional property", V.t0(str), c0650n0.f11232m.f(str2), e8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b5.r N0(java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.N0(java.lang.String, java.lang.String, java.lang.String):b5.r");
    }

    public final K1 O0(String str, long j4, byte[] bArr, String str2, String str3, int i9, int i10, long j9, long j10) {
        Z0 z02;
        boolean isEmpty = TextUtils.isEmpty(str2);
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (isEmpty) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10977m.b("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            C0903a1 c0903a1 = (C0903a1) Z.R0(C0908b1.o(), bArr);
            Z0[] values = Z0.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    z02 = values[i11];
                    if (z02.f11011a == i9) {
                        break;
                    }
                    i11++;
                } else {
                    z02 = Z0.UNKNOWN;
                    break;
                }
            }
            if (z02 != Z0.GOOGLE_SIGNAL && z02 != Z0.GOOGLE_SIGNAL_PENDING && i10 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((C0908b1) c0903a1.f15439b).t()).iterator();
                while (it.hasNext()) {
                    C0913c1 c0913c1 = (C0913c1) ((C0918d1) it.next()).f();
                    c0913c1.j();
                    C0918d1.u1((C0918d1) c0913c1.f15439b, i10);
                    arrayList.add((C0918d1) c0913c1.h());
                }
                c0903a1.j();
                C0908b1.w((C0908b1) c0903a1.f15439b);
                c0903a1.j();
                C0908b1.u((C0908b1) c0903a1.f15439b, arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length2 = split.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        break;
                    }
                    String str4 = split[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        V v9 = c0650n0.f11229i;
                        C0650n0.f(v9);
                        v9.f10971f.c(str4, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i12++;
                }
            }
            return new K1(j4, (C0908b1) c0903a1.h(), str2, hashMap, z02, j9, j10, i10);
        } catch (IOException e8) {
            V v10 = c0650n0.f11229i;
            C0650n0.f(v10);
            v10.f10971f.d(str, e8, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String P0() {
        ((C0650n0) this.f1707a).f11233n.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l9 = (Long) E.f10620S.a(null);
        l9.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l9 + ")";
        long longValue = ((Long) E.f10618R.a(null)).longValue();
        StringBuilder sb = new StringBuilder("(upload_type != 1 AND ABS(creation_timestamp - ");
        sb.append(currentTimeMillis);
        sb.append(") > ");
        return "(" + str + " OR " + A0.a.o(sb, longValue, ")") + ")";
    }

    public final String Q0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = h1().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return "";
            } catch (SQLiteException e8) {
                V v8 = ((C0650n0) this.f1707a).f11229i;
                C0650n0.f(v8);
                v8.f10971f.d(str, e8, "Database error");
                throw e8;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void R0(String str, String str2) {
        F4.y.e(str2);
        l0();
        m0();
        try {
            h1().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e8) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10971f.d(V.t0(str2), e8, "Error deleting snapshot. appId");
        }
    }

    public final void S0(String str, r rVar) {
        Long l9;
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        F4.y.h(rVar);
        l0();
        m0();
        ContentValues contentValues = new ContentValues();
        String str2 = rVar.f11284a;
        contentValues.put("app_id", str2);
        contentValues.put("name", rVar.f11285b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.f11286c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.f11287d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f11289f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.f11290g));
        contentValues.put("last_bundled_day", rVar.f11291h);
        contentValues.put("last_sampled_complex_event_id", rVar.f11292i);
        contentValues.put("last_sampling_rate", rVar.j);
        contentValues.put("current_session_count", Long.valueOf(rVar.f11288e));
        Boolean bool = rVar.f11293k;
        if (bool != null && bool.booleanValue()) {
            l9 = 1L;
        } else {
            l9 = null;
        }
        contentValues.put("last_exempt_from_sampling", l9);
        try {
            if (h1().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10971f.c(V.t0(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e8) {
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10971f.d(V.t0(str2), e8, "Error storing event aggregates. appId");
        }
    }

    public final void T0(ContentValues contentValues) {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        try {
            SQLiteDatabase h12 = h1();
            if (contentValues.getAsString("app_id") == null) {
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10973h.c(V.t0("app_id"), "Value of the primary key is not set.");
            } else if (h12.update("consent_settings", contentValues, "app_id = ?", new String[]{r4}) == 0 && h12.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                V v9 = c0650n0.f11229i;
                C0650n0.f(v9);
                v9.f10971f.d(V.t0("consent_settings"), V.t0("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e8) {
            V v10 = c0650n0.f11229i;
            C0650n0.f(v10);
            v10.f10971f.e("Error storing into table. key", V.t0("consent_settings"), V.t0("app_id"), e8);
        }
    }

    public final void V0(String str, x1 x1Var) {
        l0();
        m0();
        F4.y.e(str);
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        c0650n0.f11233n.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        D d9 = E.f10693v0;
        long longValue = currentTimeMillis - ((Long) d9.a(null)).longValue();
        long j4 = x1Var.f11346b;
        V v8 = c0650n0.f11229i;
        if (j4 < longValue || j4 > ((Long) d9.a(null)).longValue() + currentTimeMillis) {
            C0650n0.f(v8);
            v8.f10974i.e("Storing trigger URI outside of the max retention time span. appId, now, timestamp", V.t0(str), Long.valueOf(currentTimeMillis), Long.valueOf(j4));
        }
        C0650n0.f(v8);
        v8.f10978n.b("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", x1Var.f11345a);
        contentValues.put("source", Integer.valueOf(x1Var.f11347c));
        contentValues.put("timestamp_millis", Long.valueOf(j4));
        try {
            if (h1().insert("trigger_uris", null, contentValues) == -1) {
                C0650n0.f(v8);
                v8.f10971f.c(V.t0(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e8) {
            C0650n0.f(v8);
            v8.f10971f.d(V.t0(str), e8, "Error storing trigger URI. appId");
        }
    }

    public final boolean W0() {
        return ((C0650n0) this.f1707a).f11221a.getDatabasePath("google_app_measurement.db").exists();
    }

    public final void X0(String str, Long l9, long j4, com.google.android.gms.internal.measurement.V0 v02) {
        l0();
        m0();
        F4.y.h(v02);
        F4.y.e(str);
        byte[] c3 = v02.c();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        V v8 = c0650n0.f11229i;
        V v9 = c0650n0.f11229i;
        C0650n0.f(v8);
        v8.f10978n.d(c0650n0.f11232m.d(str), Integer.valueOf(c3.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l9);
        contentValues.put("children_to_process", Long.valueOf(j4));
        contentValues.put("main_event", c3);
        try {
            if (h1().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                C0650n0.f(v9);
                v9.f10971f.c(V.t0(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e8) {
            C0650n0.f(v9);
            v9.f10971f.d(V.t0(str), e8, "Error storing complex main event. appId");
        }
    }

    public final boolean Y0(C0622e c0622e) {
        l0();
        m0();
        String str = c0622e.f11073a;
        F4.y.h(str);
        N1 r1 = r1(str, c0622e.f11075c.f10804b);
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (r1 == null) {
            long c12 = c1("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            c0650n0.getClass();
            if (c12 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c0622e.f11074b);
        contentValues.put("name", c0622e.f11075c.f10804b);
        Object f9 = c0622e.f11075c.f();
        F4.y.h(f9);
        b1(contentValues, f9);
        contentValues.put("active", Boolean.valueOf(c0622e.f11077e));
        contentValues.put("trigger_event_name", c0622e.f11078f);
        contentValues.put("trigger_timeout", Long.valueOf(c0622e.f11080h));
        P1 p12 = c0650n0.f11231l;
        V v8 = c0650n0.f11229i;
        C0650n0.d(p12);
        contentValues.put("timed_out_event", P1.m1(c0622e.f11079g));
        contentValues.put("creation_timestamp", Long.valueOf(c0622e.f11076d));
        C0650n0.d(c0650n0.f11231l);
        contentValues.put("triggered_event", P1.m1(c0622e.f11081i));
        contentValues.put("triggered_timestamp", Long.valueOf(c0622e.f11075c.f10805c));
        contentValues.put("time_to_live", Long.valueOf(c0622e.j));
        contentValues.put("expired_event", P1.m1(c0622e.f11082k));
        try {
            if (h1().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                C0650n0.f(v8);
                v8.f10971f.c(V.t0(str), "Failed to insert/update conditional user property (got -1)");
                return true;
            }
            return true;
        } catch (SQLiteException e8) {
            C0650n0.f(v8);
            v8.f10971f.d(V.t0(str), e8, "Error storing conditional user property");
            return true;
        }
    }

    public final boolean Z0(N1 n12) {
        l0();
        m0();
        String str = n12.f10816a;
        String str2 = n12.f10818c;
        N1 r1 = r1(str, str2);
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        String str3 = n12.f10817b;
        if (r1 == null) {
            if (P1.g1(str2)) {
                if (c1("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(c0650n0.f11227g.r0(str, E.f10626V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long c12 = c1("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3});
                c0650n0.getClass();
                if (c12 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(n12.f10819d));
        b1(contentValues, n12.f10820e);
        try {
            if (h1().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10971f.c(V.t0(str), "Failed to insert/update user property (got -1). appId");
                return true;
            }
            return true;
        } catch (SQLiteException e8) {
            V v9 = c0650n0.f11229i;
            C0650n0.f(v9);
            v9.f10971f.d(V.t0(str), e8, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01e1 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a1(java.lang.String r20, long r21, long r23, b5.C0620d0 r25) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.a1(java.lang.String, long, long, b5.d0):void");
    }

    public final long c1(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = h1().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j4 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j4;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e8) {
                V v8 = ((C0650n0) this.f1707a).f11229i;
                C0650n0.f(v8);
                v8.f10971f.d(str, e8, "Database error");
                throw e8;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long d1(long j4, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = h1().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j4 = cursor.getLong(0);
                }
                cursor.close();
                return j4;
            } catch (SQLiteException e8) {
                V v8 = ((C0650n0) this.f1707a).f11229i;
                C0650n0.f(v8);
                v8.f10971f.d(str, e8, "Database error");
                throw e8;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long e1(String str, C0908b1 c0908b1, String str2, Map map, Z0 z02, Long l9) {
        long j4;
        int delete;
        l0();
        m0();
        F4.y.h(c0908b1);
        F4.y.e(str);
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (c0650n0.f11227g.y0(null, E.f10611N0)) {
            l0();
            m0();
            boolean W02 = W0();
            K4.a aVar = c0650n0.f11233n;
            V v8 = c0650n0.f11229i;
            if (!W02) {
                j4 = -1;
            } else {
                J1 j12 = this.f11361b;
                long f9 = j12.f10753i.f11261f.f();
                aVar.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j4 = -1;
                if (Math.abs(elapsedRealtime - f9) > ((Long) E.f10608M.a(null)).longValue()) {
                    j12.f10753i.f11261f.g(elapsedRealtime);
                    l0();
                    m0();
                    if (W0() && (delete = h1().delete("upload_queue", P0(), new String[0])) > 0) {
                        C0650n0.f(v8);
                        v8.f10978n.c(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                    }
                    D d9 = E.f10617Q0;
                    C0628g c0628g = c0650n0.f11227g;
                    if (c0628g.y0(null, d9)) {
                        F4.y.e(str);
                        l0();
                        m0();
                        try {
                            int r0 = c0628g.r0(str, E.f10585A);
                            if (r0 > 0) {
                                h1().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(r0)});
                            }
                        } catch (SQLiteException e8) {
                            C0650n0.f(v8);
                            v8.f10971f.d(V.t0(str), e8, "Error deleting over the limit queued batches. appId");
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
            byte[] c3 = c0908b1.c();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("measurement_batch", c3);
            contentValues.put("upload_uri", str2);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) "\r\n");
                }
            }
            contentValues.put("upload_headers", sb.toString());
            contentValues.put("upload_type", Integer.valueOf(z02.f11011a));
            aVar.getClass();
            contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("retry_count", (Integer) 0);
            if (l9 != null) {
                contentValues.put("associated_row_id", l9);
            }
            try {
                long insert = h1().insert("upload_queue", null, contentValues);
                if (insert == j4) {
                    C0650n0.f(v8);
                    v8.f10971f.c(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
                    return j4;
                }
                return insert;
            } catch (SQLiteException e9) {
                C0650n0.f(v8);
                v8.f10971f.d(str, e9, "Error storing MeasurementBatch to upload_queue. appId");
                return j4;
            }
        }
        return -1L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(3:2|3|4)|(2:6|(3:8|9|10)(1:14))|15|16|(1:18)(2:21|22)|19|9|10|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        r1 = r1.f11229i;
        b5.C0650n0.f(r1);
        r1.f10971f.e("Error inserting column. appId", b5.V.t0(r14), "first_open_count", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f1(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f1707a
            r1 = r0
            b5.n0 r1 = (b5.C0650n0) r1
            F4.y.e(r14)
            java.lang.String r2 = "first_open_count"
            F4.y.e(r2)
            r13.l0()
            r13.m0()
            android.database.sqlite.SQLiteDatabase r3 = r13.h1()
            r3.beginTransaction()
            r4 = 0
            java.lang.String r0 = "select first_open_count from app2 where app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L63
            r7 = -1
            long r9 = r13.d1(r7, r0, r6)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L63
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r6 = "app2"
            java.lang.String r11 = "app_id"
            if (r0 != 0) goto L66
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L63
            r0.<init>()     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L63
            r0.put(r11, r14)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L63
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L63
            r0.put(r2, r9)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L63
            java.lang.String r10 = "previous_install_count"
            r0.put(r10, r9)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L63
            r9 = 0
            r10 = 5
            long r9 = r3.insertWithOnConflict(r6, r9, r0, r10)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L63
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 != 0) goto L65
            b5.V r0 = r1.f11229i     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L63
            b5.C0650n0.f(r0)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L63
            b5.T r0 = r0.f10971f     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L63
            java.lang.String r6 = "Failed to insert column (got -1). appId"
            b5.U r9 = b5.V.t0(r14)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L63
            r0.d(r9, r2, r6)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L63
            goto Lb1
        L60:
            r0 = move-exception
            r14 = r0
            goto Lb5
        L63:
            r0 = move-exception
            goto La0
        L65:
            r9 = r4
        L66:
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L98
            r0.<init>()     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L98
            r0.put(r11, r14)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L98
            r11 = 1
            long r11 = r11 + r9
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L98
            r0.put(r2, r11)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L98
            java.lang.String r11 = "app_id = ?"
            java.lang.String[] r12 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L98
            int r0 = r3.update(r6, r0, r11, r12)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L98
            long r11 = (long) r0     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L98
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 != 0) goto L9a
            b5.V r0 = r1.f11229i     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L98
            b5.C0650n0.f(r0)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L98
            b5.T r0 = r0.f10971f     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L98
            java.lang.String r4 = "Failed to update column (got 0). appId"
            b5.U r5 = b5.V.t0(r14)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L98
            r0.d(r5, r2, r4)     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L98
            goto Lb1
        L98:
            r0 = move-exception
            goto L9f
        L9a:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L60 android.database.sqlite.SQLiteException -> L98
            r7 = r9
            goto Lb1
        L9f:
            r4 = r9
        La0:
            b5.V r1 = r1.f11229i     // Catch: java.lang.Throwable -> L60
            b5.C0650n0.f(r1)     // Catch: java.lang.Throwable -> L60
            b5.T r1 = r1.f10971f     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = "Error inserting column. appId"
            b5.U r14 = b5.V.t0(r14)     // Catch: java.lang.Throwable -> L60
            r1.e(r6, r14, r2, r0)     // Catch: java.lang.Throwable -> L60
            r7 = r4
        Lb1:
            r3.endTransaction()
            return r7
        Lb5:
            r3.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.f1(java.lang.String):long");
    }

    public final long g1(String str) {
        F4.y.e(str);
        return d1(0L, "select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str});
    }

    public final SQLiteDatabase h1() {
        l0();
        try {
            return this.f11212d.getWritableDatabase();
        } catch (SQLiteException e8) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10974i.c(e8, "Error opening database");
            throw e8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x03fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b5.Q i1(java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.i1(java.lang.String):b5.Q");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:247), block:B:37:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b5.C0622e j1(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.j1(java.lang.String, java.lang.String):b5.e");
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:109), block:B:27:0x006c */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.support.v4.media.session.y k1(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f1707a
            r1 = r0
            b5.n0 r1 = (b5.C0650n0) r1
            F4.y.e(r12)
            r11.l0()
            r11.m0()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.h1()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r4 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r10 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r0 != 0) goto L33
            goto L83
        L33:
            r0 = 0
            byte[] r0 = r3.getBlob(r0)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r4 = 1
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r5 = 2
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r6 == 0) goto L5e
            b5.V r6 = r1.f11229i     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            b5.C0650n0.f(r6)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            b5.T r6 = r6.f10971f     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            b5.U r8 = b5.V.t0(r12)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r6.c(r8, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L6c
        L5c:
            r0 = move-exception
            goto L73
        L5e:
            if (r0 != 0) goto L61
            goto L83
        L61:
            android.support.v4.media.session.y r6 = new android.support.v4.media.session.y     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r7 = 26
            r6.<init>(r0, r4, r5, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r3.close()
            return r6
        L6c:
            r2 = r3
            goto L89
        L6e:
            r0 = move-exception
            r12 = r0
            goto L89
        L71:
            r0 = move-exception
            r3 = r2
        L73:
            b5.V r1 = r1.f11229i     // Catch: java.lang.Throwable -> L59
            b5.C0650n0.f(r1)     // Catch: java.lang.Throwable -> L59
            b5.T r1 = r1.f10971f     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "Error querying remote config. appId"
            b5.U r12 = b5.V.t0(r12)     // Catch: java.lang.Throwable -> L59
            r1.d(r12, r0, r4)     // Catch: java.lang.Throwable -> L59
        L83:
            if (r3 == 0) goto L88
            r3.close()
        L88:
            return r2
        L89:
            if (r2 == 0) goto L8e
            r2.close()
        L8e:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.k1(java.lang.String):android.support.v4.media.session.y");
    }

    public final C0637j l1(long j4, String str, boolean z9, boolean z10, boolean z11, boolean z12) {
        return m1(j4, str, 1L, false, false, z9, false, z10, z11, z12);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [b5.j, java.lang.Object] */
    public final C0637j m1(long j4, String str, long j9, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        F4.y.e(str);
        l0();
        m0();
        String[] strArr = {str};
        ?? obj = new Object();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase h12 = h1();
                cursor = h12.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    V v8 = c0650n0.f11229i;
                    C0650n0.f(v8);
                    v8.f10974i.c(V.t0(str), "Not updating daily counts, app is not known. appId");
                } else {
                    if (cursor.getLong(0) == j4) {
                        obj.f11154b = cursor.getLong(1);
                        obj.f11153a = cursor.getLong(2);
                        obj.f11155c = cursor.getLong(3);
                        obj.f11156d = cursor.getLong(4);
                        obj.f11157e = cursor.getLong(5);
                        obj.f11158f = cursor.getLong(6);
                        obj.f11159g = cursor.getLong(7);
                    }
                    if (z9) {
                        obj.f11154b += j9;
                    }
                    if (z10) {
                        obj.f11153a += j9;
                    }
                    if (z11) {
                        obj.f11155c += j9;
                    }
                    if (z12) {
                        obj.f11156d += j9;
                    }
                    if (z13) {
                        obj.f11157e += j9;
                    }
                    if (z14) {
                        obj.f11158f += j9;
                    }
                    if (z15) {
                        obj.f11159g += j9;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j4));
                    contentValues.put("daily_public_events_count", Long.valueOf(obj.f11153a));
                    contentValues.put("daily_events_count", Long.valueOf(obj.f11154b));
                    contentValues.put("daily_conversions_count", Long.valueOf(obj.f11155c));
                    contentValues.put("daily_error_events_count", Long.valueOf(obj.f11156d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(obj.f11157e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(obj.f11158f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(obj.f11159g));
                    h12.update("apps", contentValues, "app_id=?", strArr);
                }
            } catch (SQLiteException e8) {
                V v9 = c0650n0.f11229i;
                C0650n0.f(v9);
                v9.f10971f.d(V.t0(str), e8, "Error updating daily counts. appId");
            }
            if (cursor != null) {
                cursor.close();
            }
            return obj;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final r n1(String str, com.google.android.gms.internal.measurement.V0 v02, String str2) {
        r N02 = N0("events", str, v02.t());
        if (N02 == null) {
            C0650n0 c0650n0 = (C0650n0) this.f1707a;
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10974i.d(V.t0(str), c0650n0.f11232m.d(str2), "Event aggregate wasn't created during raw event logging. appId, event");
            return new r(str, v02.t(), 1L, 1L, 1L, v02.q(), 0L, null, null, null, null);
        }
        long j4 = N02.f11288e + 1;
        long j9 = N02.f11287d + 1;
        return new r(N02.f11284a, N02.f11285b, N02.f11286c + 1, j9, j4, N02.f11289f, N02.f11290g, N02.f11291h, N02.f11292i, N02.j, N02.f11293k);
    }

    public final C0 o1(String str) {
        F4.y.h(str);
        l0();
        m0();
        return C0.e(100, Q0("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String p0() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.h1()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L37
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3d
        L22:
            r0 = move-exception
            goto L3d
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            java.lang.Object r3 = r6.f1707a     // Catch: java.lang.Throwable -> L1a
            b5.n0 r3 = (b5.C0650n0) r3     // Catch: java.lang.Throwable -> L1a
            b5.V r3 = r3.f11229i     // Catch: java.lang.Throwable -> L1a
            b5.C0650n0.f(r3)     // Catch: java.lang.Throwable -> L1a
            b5.T r3 = r3.f10971f     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.c(r2, r4)     // Catch: java.lang.Throwable -> L1a
        L37:
            if (r0 == 0) goto L3c
            r0.close()
        L3c:
            return r1
        L3d:
            if (r1 == 0) goto L42
            r1.close()
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.p0():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b5.C0 p1(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f1707a
            b5.n0 r0 = (b5.C0650n0) r0
            F4.y.h(r5)
            r4.l0()
            r4.m0()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r1 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r4.h1()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            android.database.Cursor r5 = r3.rawQuery(r1, r5)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            if (r1 != 0) goto L36
            b5.V r1 = r0.f11229i     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            b5.C0650n0.f(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            b5.T r1 = r1.f10978n     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            java.lang.String r3 = "No data found"
            r1.b(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
        L2e:
            r5.close()
            goto L5c
        L32:
            r0 = move-exception
            goto L45
        L34:
            r1 = move-exception
            goto L4d
        L36:
            r1 = 0
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            r3 = 1
            int r3 = r5.getInt(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            b5.C0 r2 = b5.C0.e(r3, r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            goto L2e
        L45:
            r2 = r5
            goto L62
        L47:
            r5 = move-exception
            r0 = r5
            goto L62
        L4a:
            r5 = move-exception
            r1 = r5
            r5 = r2
        L4d:
            b5.V r0 = r0.f11229i     // Catch: java.lang.Throwable -> L32
            b5.C0650n0.f(r0)     // Catch: java.lang.Throwable -> L32
            b5.T r0 = r0.f10971f     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "Error querying database."
            r0.c(r1, r3)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L5c
            goto L2e
        L5c:
            if (r2 != 0) goto L61
            b5.C0 r5 = b5.C0.f10564c
            return r5
        L61:
            return r2
        L62:
            if (r2 == 0) goto L67
            r2.close()
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.p1(java.lang.String):b5.C0");
    }

    public final List q0(String str, String str2, String str3) {
        F4.y.e(str);
        l0();
        m0();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return r0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b5.K1 q1(java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.q1(java.lang.String):b5.K1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        r20 = r12.getString(5);
        r22 = r12.getLong(6);
        r3 = r28.f11361b.f10749g;
        b5.J1.J(r3);
        r4 = r12.getBlob(7);
        r5 = b5.C0665t.CREATOR;
        r21 = (b5.C0665t) r3.N0(r4, r5);
        r17 = r12.getLong(8);
        b5.J1.J(r3);
        r24 = (b5.C0665t) r3.N0(r12.getBlob(9), r5);
        r6 = r12.getLong(10);
        r25 = r12.getLong(11);
        b5.J1.J(r3);
        r0.add(new b5.C0622e(r14, r15, new b5.M1(r6, r8, r9, r15), r17, r19, r20, r21, r22, r24, r25, (b5.C0665t) r3.N0(r12.getBlob(12), r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f9, code lost:
    
        if (r12.moveToNext() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r3 = r2.f11229i;
        b5.C0650n0.f(r3);
        r3.f10971f.c(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x004c, code lost:
    
        if (r12.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        if (r0.size() < 1000) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006e, code lost:
    
        r14 = r12.getString(0);
        r15 = r12.getString(1);
        r9 = r12.getString(2);
        r8 = s1(r12, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0087, code lost:
    
        if (r12.getInt(4) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0089, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List r0(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.r0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b5.N1 r1(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f1707a
            r1 = r0
            b5.n0 r1 = (b5.C0650n0) r1
            F4.y.e(r12)
            F4.y.e(r13)
            r11.l0()
            r11.m0()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.h1()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r4 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r6 = "app_id=? and name=?"
            java.lang.String[] r7 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            r10 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L37
            goto L95
        L37:
            r0 = 0
            long r8 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r0 = 1
            java.lang.Object r10 = r11.s1(r3, r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r10 != 0) goto L44
            goto L95
        L44:
            r0 = 2
            java.lang.String r6 = r3.getString(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            b5.N1 r4 = new b5.N1     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r12 == 0) goto L6d
            b5.V r12 = r1.f11229i     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            b5.C0650n0.f(r12)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            b5.T r12 = r12.f10971f     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r13 = "Got multiple records for user property, expected one. appId"
            b5.U r0 = b5.V.t0(r5)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r12.c(r0, r13)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6d
        L67:
            r0 = move-exception
            r12 = r0
            goto L75
        L6a:
            r0 = move-exception
        L6b:
            r12 = r0
            goto L7f
        L6d:
            r3.close()
            return r4
        L71:
            r0 = move-exception
            r5 = r12
            r7 = r13
            goto L6b
        L75:
            r2 = r3
            goto L9b
        L77:
            r0 = move-exception
            r12 = r0
            goto L9b
        L7a:
            r0 = move-exception
            r5 = r12
            r7 = r13
            r12 = r0
            r3 = r2
        L7f:
            b5.V r13 = r1.f11229i     // Catch: java.lang.Throwable -> L67
            b5.C0650n0.f(r13)     // Catch: java.lang.Throwable -> L67
            b5.T r13 = r13.f10971f     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Error querying user property. appId"
            b5.U r4 = b5.V.t0(r5)     // Catch: java.lang.Throwable -> L67
            b5.O r1 = r1.f11232m     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.f(r7)     // Catch: java.lang.Throwable -> L67
            r13.e(r0, r4, r1, r12)     // Catch: java.lang.Throwable -> L67
        L95:
            if (r3 == 0) goto L9a
            r3.close()
        L9a:
            return r2
        L9b:
            if (r2 == 0) goto La0
            r2.close()
        La0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.r1(java.lang.String, java.lang.String):b5.N1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List s0(java.lang.String r26, b5.B1 r27, int r28) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.s0(java.lang.String, b5.B1, int):java.util.List");
    }

    public final Object s1(Cursor cursor, int i9) {
        int type = cursor.getType(i9);
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            V v8 = c0650n0.f11229i;
                            C0650n0.f(v8);
                            v8.f10971f.c(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                            return null;
                        }
                        V v9 = c0650n0.f11229i;
                        C0650n0.f(v9);
                        v9.f10971f.b("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i9);
                }
                return Double.valueOf(cursor.getDouble(i9));
            }
            return Long.valueOf(cursor.getLong(i9));
        }
        V v10 = c0650n0.f11229i;
        C0650n0.f(v10);
        v10.f10971f.b("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List t0(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f1707a
            r1 = r0
            b5.n0 r1 = (b5.C0650n0) r1
            F4.y.e(r13)
            r12.l0()
            r12.m0()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1000"
            r11 = 0
            android.database.sqlite.SQLiteDatabase r2 = r12.h1()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r9 = "rowid"
            r1.getClass()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            boolean r2 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r2 == 0) goto L9c
        L3f:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2 = 1
            java.lang.String r2 = r11.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r2 != 0) goto L4d
            java.lang.String r2 = ""
        L4d:
            r5 = r2
            goto L52
        L4f:
            r0 = move-exception
            r4 = r13
            goto L8a
        L52:
            r2 = 2
            long r7 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2 = 3
            java.lang.Object r9 = r12.s1(r11, r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r9 != 0) goto L73
            b5.V r2 = r1.f11229i     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            b5.C0650n0.f(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            b5.T r2 = r2.f10971f     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            java.lang.String r3 = "Read invalid user property value, ignoring it. appId"
            b5.U r4 = b5.V.t0(r13)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2.c(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r4 = r13
            goto L7c
        L70:
            r0 = move-exception
            r13 = r0
            goto La2
        L73:
            b5.N1 r3 = new b5.N1     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
            r0.add(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
        L7c:
            boolean r13 = r11.moveToNext()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
            if (r13 != 0) goto L83
            goto L9c
        L83:
            r13 = r4
            goto L3f
        L85:
            r0 = move-exception
            goto L8a
        L87:
            r0 = move-exception
            r4 = r13
            r13 = r0
        L8a:
            b5.V r13 = r1.f11229i     // Catch: java.lang.Throwable -> L70
            b5.C0650n0.f(r13)     // Catch: java.lang.Throwable -> L70
            b5.T r13 = r13.f10971f     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "Error querying user properties. appId"
            b5.U r2 = b5.V.t0(r4)     // Catch: java.lang.Throwable -> L70
            r13.d(r2, r0, r1)     // Catch: java.lang.Throwable -> L70
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L70
        L9c:
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r0
        La2:
            if (r11 == 0) goto La7
            r11.close()
        La7:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.t0(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        b5.C0650n0.f(r7);
        r7.f10971f.c(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List u0(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.u0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f0, code lost:
    
        if (r4 == null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0117 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v0(java.lang.String r28, java.lang.Long r29, java.lang.String r30, android.os.Bundle r31) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.v0(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    public final void w0() {
        m0();
        h1().beginTransaction();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r2.moveToNext() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r2.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        r1 = r2.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        r1 = N0("events", r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        S0("events_snapshot", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x0(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "events_snapshot"
            r12.R0(r0, r13)
            java.lang.String r1 = "name"
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r12.h1()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            java.lang.String r4 = "events"
            r11 = 0
            java.lang.String[] r5 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            java.lang.Object[] r1 = r1.toArray(r5)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            r5 = r1
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            r10 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            boolean r1 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 == 0) goto L61
        L2f:
            java.lang.String r1 = r2.getString(r11)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 == 0) goto L46
            java.lang.String r3 = "events"
            b5.r r1 = r12.N0(r3, r13, r1)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 == 0) goto L46
            r12.S0(r0, r1)     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            goto L46
        L41:
            r0 = move-exception
            r13 = r0
            goto L67
        L44:
            r0 = move-exception
            goto L4d
        L46:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> L41 android.database.sqlite.SQLiteException -> L44
            if (r1 != 0) goto L2f
            goto L61
        L4d:
            java.lang.Object r1 = r12.f1707a     // Catch: java.lang.Throwable -> L41
            b5.n0 r1 = (b5.C0650n0) r1     // Catch: java.lang.Throwable -> L41
            b5.V r1 = r1.f11229i     // Catch: java.lang.Throwable -> L41
            b5.C0650n0.f(r1)     // Catch: java.lang.Throwable -> L41
            b5.T r1 = r1.f10971f     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "Error creating snapshot. appId"
            b5.U r13 = b5.V.t0(r13)     // Catch: java.lang.Throwable -> L41
            r1.d(r13, r0, r3)     // Catch: java.lang.Throwable -> L41
        L61:
            if (r2 == 0) goto L66
            r2.close()
        L66:
            return
        L67:
            if (r2 == 0) goto L6c
            r2.close()
        L6c:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0649n.x0(java.lang.String):void");
    }

    public final void y0(ArrayList arrayList) {
        F4.y.h(arrayList);
        l0();
        m0();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (i9 != 0) {
                sb.append(",");
            }
            sb.append(((Long) arrayList.get(i9)).longValue());
        }
        sb.append(")");
        int delete = h1().delete("raw_events", sb.toString(), null);
        if (delete != arrayList.size()) {
            V v8 = ((C0650n0) this.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10971f.d(Integer.valueOf(delete), Integer.valueOf(arrayList.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    public final void z0(Long l9) {
        l0();
        m0();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        C0628g c0628g = c0650n0.f11227g;
        V v8 = c0650n0.f11229i;
        if (c0628g.y0(null, E.f10611N0)) {
            try {
                if (h1().delete("upload_queue", "rowid=?", new String[]{l9.toString()}) != 1) {
                    C0650n0.f(v8);
                    v8.f10974i.b("Deleted fewer rows from upload_queue than expected");
                }
            } catch (SQLiteException e8) {
                C0650n0.f(v8);
                v8.f10971f.c(e8, "Failed to delete a MeasurementBatch in a upload_queue table");
                throw e8;
            }
        }
    }

    @Override // b5.D1
    public final void o0() {
    }
}
