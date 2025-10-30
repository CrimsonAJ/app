package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j9 implements gb {
    @Override // co.notix.td
    public final Object a(Object obj) {
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        String string = from.getString("dn_df");
        kotlin.jvm.internal.h.d(string, "from.getString(\"dn_df\")");
        String string2 = from.getString("dn_ad");
        kotlin.jvm.internal.h.d(string2, "from.getString(\"dn_ad\")");
        String string3 = from.getString("dn_fb");
        kotlin.jvm.internal.h.d(string3, "from.getString(\"dn_fb\")");
        return new l9(string, string2, string3);
    }
}
