package d7;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final Date f16949e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Date f16950f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f16951a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16952b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f16953c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f16954d = new Object();

    public m(SharedPreferences sharedPreferences) {
        this.f16951a = sharedPreferences;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, d7.l] */
    public final l a() {
        ?? obj;
        synchronized (this.f16953c) {
            int i9 = this.f16951a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f16951a.getLong("backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.f16947a = i9;
            obj.f16948b = date;
        }
        return obj;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f16951a.getString("customSignals", "{}"));
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, d7.l] */
    public final l c() {
        ?? obj;
        synchronized (this.f16954d) {
            int i9 = this.f16951a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f16951a.getLong("realtime_backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.f16947a = i9;
            obj.f16948b = date;
        }
        return obj;
    }

    public final void d(int i9, Date date) {
        synchronized (this.f16953c) {
            this.f16951a.edit().putInt("num_failed_fetches", i9).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(String str) {
        synchronized (this.f16952b) {
            this.f16951a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public final void f(int i9, Date date) {
        synchronized (this.f16954d) {
            this.f16951a.edit().putInt("num_failed_realtime_streams", i9).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void g() {
        synchronized (this.f16952b) {
            this.f16951a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public final void h() {
        synchronized (this.f16952b) {
            this.f16951a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
