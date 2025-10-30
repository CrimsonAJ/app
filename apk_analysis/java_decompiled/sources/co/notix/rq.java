package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rq implements td {
    @Override // co.notix.td
    public final Object a(Object obj) {
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = from.getJSONObject("notification");
        kotlin.jvm.internal.h.d(jSONObject, "from.getJSONObject(NOTIFICATION_FIELD)");
        return new qq(new we(jc.b(jSONObject, "color"), jc.d(jSONObject, "event"), jc.d(jSONObject, "icon_url"), jc.d(jSONObject, "image_url"), jc.b(jSONObject, "priority"), jc.a(jSONObject, "show_badge_icon"), jc.a(jSONObject, "show_only_last_notification"), jc.a(jSONObject, "show_toast"), jc.d(jSONObject, "title"), jc.d(jSONObject, "text"), jc.b(jSONObject, "importance"), jc.a(jSONObject, "random_group_id"), jc.d(jSONObject, "click_data"), jc.d(jSONObject, "impression_data"), jc.d(jSONObject, "pd"), jc.d(jSONObject, "target_url")));
    }
}
