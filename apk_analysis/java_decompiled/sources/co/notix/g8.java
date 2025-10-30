package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g8 implements td {
    @Override // co.notix.td
    public final Object a(Object obj) {
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        String string = from.getString("click_data");
        kotlin.jvm.internal.h.d(string, "from.getString(DATA_FIELD)");
        return new f8(string);
    }
}
