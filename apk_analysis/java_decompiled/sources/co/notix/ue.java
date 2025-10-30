package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ue implements gb {
    @Override // co.notix.td
    public final Object a(Object obj) {
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        return new we(jc.b(from, "color"), jc.d(from, "event"), jc.d(from, "icon_url"), jc.d(from, "image_url"), jc.b(from, "priority"), jc.a(from, "show_badge_icon"), jc.a(from, "show_only_last_notification"), jc.a(from, "show_toast"), jc.d(from, "title"), jc.d(from, "text"), jc.b(from, "importance"), jc.a(from, "random_group_id"), jc.d(from, "click_data"), jc.d(from, "impression_data"), jc.d(from, "pd"), jc.d(from, "target_url"));
    }
}
