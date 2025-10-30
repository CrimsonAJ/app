package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ve implements gr {
    @Override // co.notix.td
    public final Object a(Object obj) {
        we from = (we) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("color", from.f13422a);
        jSONObject.put("event", from.f13423b);
        jSONObject.put("icon_url", from.f13424c);
        jSONObject.put("image_url", from.f13425d);
        jSONObject.put("priority", from.f13426e);
        jSONObject.put("show_badge_icon", from.f13427f);
        jSONObject.put("show_only_last_notification", from.f13428g);
        jSONObject.put("show_toast", from.f13429h);
        jSONObject.put("title", from.f13430i);
        jSONObject.put("text", from.j);
        jSONObject.put("importance", from.f13431k);
        jSONObject.put("random_group_id", from.f13432l);
        jSONObject.put("click_data", from.f13433m);
        jSONObject.put("impression_data", from.f13434n);
        jSONObject.put("pd", from.f13435o);
        jSONObject.put("target_url", from.f13436p);
        return jSONObject;
    }
}
