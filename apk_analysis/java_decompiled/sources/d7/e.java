package d7;

import c1.C0753b;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    public static final Date f16896h = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f16897a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f16898b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f16899c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f16900d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f16901e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16902f;

    /* renamed from: g, reason: collision with root package name */
    public final JSONArray f16903g;

    public e(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f16898b = jSONObject;
        this.f16899c = date;
        this.f16900d = jSONArray;
        this.f16901e = jSONObject2;
        this.f16902f = j;
        this.f16903g = jSONArray2;
        this.f16897a = jSONObject3;
    }

    public static e a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new e(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), optJSONArray);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, c1.b] */
    public static C0753b c() {
        ?? obj = new Object();
        obj.f11589b = new JSONObject();
        obj.f11590c = f16896h;
        obj.f11591d = new JSONArray();
        obj.f11592e = new JSONObject();
        obj.f11588a = 0L;
        obj.f11593f = new JSONArray();
        return obj;
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        int i9 = 0;
        while (true) {
            JSONArray jSONArray = this.f16903g;
            if (i9 < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i9);
                String string = jSONObject.getString("rolloutId");
                String string2 = jSONObject.getString("variantId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                    String string3 = jSONArray2.getString(i10);
                    if (!hashMap.containsKey(string3)) {
                        hashMap.put(string3, new HashMap());
                    }
                    Map map = (Map) hashMap.get(string3);
                    if (map != null) {
                        map.put(string, string2);
                    }
                }
                i9++;
            } else {
                return hashMap;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f16897a.toString().equals(((e) obj).f16897a.toString());
    }

    public final int hashCode() {
        return this.f16897a.hashCode();
    }

    public final String toString() {
        return this.f16897a.toString();
    }
}
