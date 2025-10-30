package b5;

import F0.C0104h;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import co.notix.lsi.LsiInterval;
import com.google.android.gms.internal.measurement.K3;

/* renamed from: b5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646m extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D.n f11186b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0646m(C0649n c0649n, Context context) {
        this(context, "google_app_measurement.db");
        this.f11185a = 0;
        this.f11186b = c0649n;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f11185a) {
            case 0:
                C0649n c0649n = (C0649n) this.f11186b;
                C0104h c0104h = c0649n.f11213e;
                C0650n0 c0650n0 = (C0650n0) c0649n.f1707a;
                c0650n0.getClass();
                if (c0104h.f2114b != 0) {
                    ((K4.a) c0104h.f2115c).getClass();
                    if (SystemClock.elapsedRealtime() - c0104h.f2114b < LsiInterval.LSI_FALLBACK_INTERVAL) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    C0104h c0104h2 = c0649n.f11213e;
                    ((K4.a) c0104h2.f2115c).getClass();
                    c0104h2.f2114b = SystemClock.elapsedRealtime();
                    V v8 = c0650n0.f11229i;
                    C0650n0.f(v8);
                    v8.f10971f.b("Opening the database failed, dropping and recreating it");
                    if (!c0650n0.f11221a.getDatabasePath("google_app_measurement.db").delete()) {
                        V v9 = c0650n0.f11229i;
                        C0650n0.f(v9);
                        v9.f10971f.c("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        c0104h2.f2114b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e8) {
                        V v10 = c0650n0.f11229i;
                        C0650n0.f(v10);
                        v10.f10971f.c(e8, "Failed to open freshly created database");
                        throw e8;
                    }
                }
            default:
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e9) {
                    throw e9;
                } catch (SQLiteException unused2) {
                    N n7 = (N) this.f11186b;
                    C0650n0 c0650n02 = (C0650n0) n7.f1707a;
                    V v11 = c0650n02.f11229i;
                    C0650n0.f(v11);
                    v11.f10971f.b("Opening the local database failed, dropping and recreating it");
                    if (!c0650n02.f11221a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        V v12 = c0650n02.f11229i;
                        C0650n0.f(v12);
                        v12.f10971f.c("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e10) {
                        V v13 = ((C0650n0) n7.f1707a).f11229i;
                        C0650n0.f(v13);
                        v13.f10971f.c(e10, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f11185a) {
            case 0:
                V v8 = ((C0650n0) ((C0649n) this.f11186b).f1707a).f11229i;
                C0650n0.f(v8);
                D0.f(v8, sQLiteDatabase);
                return;
            default:
                V v9 = ((C0650n0) ((N) this.f11186b).f1707a).f11229i;
                C0650n0.f(v9);
                D0.f(v9, sQLiteDatabase);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        int i11 = this.f11185a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        switch (this.f11185a) {
            case 0:
                C0650n0 c0650n0 = (C0650n0) ((C0649n) this.f11186b).f1707a;
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                D0.c(v8, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C0649n.f11202f);
                V v9 = c0650n0.f11229i;
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C0649n.f11204h);
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C0649n.f11205i);
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C0649n.f11206k);
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C0649n.j);
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C0649n.f11207l);
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C0649n.f11208m);
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C0649n.f11209n);
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C0649n.f11210o);
                K3.b();
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C0649n.f11211p);
                C0650n0.f(v9);
                D0.c(v9, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", C0649n.f11203g);
                return;
            default:
                V v10 = ((C0650n0) ((N) this.f11186b).f1707a).f11229i;
                C0650n0.f(v10);
                D0.c(v10, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", N.f10810e);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        int i11 = this.f11185a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0646m(N n7, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f11185a = 1;
        this.f11186b = n7;
    }

    public C0646m(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
    }

    private final void d(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
    }

    private final void g(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
    }

    private final void s(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
    }
}
