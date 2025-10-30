package co.notix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ol implements gr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gr f12902a;

    public ol(sj sjVar) {
        this.f12902a = sjVar;
    }

    @Override // co.notix.td
    public final Object a(Object obj) {
        JSONObject jSONObject;
        pl from = (pl) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject2 = new JSONObject();
        gr grVar = this.f12902a;
        jSONObject2.put("id", from.f12983a);
        jSONObject2.put("level", from.f12984b.f13063a);
        jSONObject2.put("message", from.f12985c);
        jSONObject2.put("stacktrace", from.f12986d);
        jSONObject2.put("timestamp", from.f12987e);
        Map map = from.f12988f;
        JSONArray jSONArray = null;
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = null;
        }
        jSONObject2.put("tags", jSONObject);
        List list = from.f12989g;
        if (list != null) {
            ArrayList arrayList = new ArrayList(B7.m.f0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((JSONObject) grVar.a((tj) it.next()));
            }
            jSONArray = new JSONArray((Collection) arrayList);
        }
        jSONObject2.put("prev", jSONArray);
        return jSONObject2;
    }
}
