package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j implements gb {
    @Override // co.notix.td
    public final Object a(Object obj) {
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        String d9 = jc.d(from, "title");
        String d10 = jc.d(from, "description");
        String d11 = jc.d(from, "image_url");
        String d12 = jc.d(from, "icon_url");
        String d13 = jc.d(from, "target_url");
        String string = from.getString("impression_data");
        kotlin.jvm.internal.h.d(string, "from.getString(\"impression_data\")");
        return new l(d9, d10, d11, d12, d13, string, jc.d(from, "nurl"), jc.d(from, "adm"));
    }
}
