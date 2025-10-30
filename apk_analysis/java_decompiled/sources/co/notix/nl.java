package co.notix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nl implements gb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb f12830a;

    public nl(rj rjVar) {
        this.f12830a = rjVar;
    }

    @Override // co.notix.td
    public final Object a(Object obj) {
        ArrayList arrayList;
        ql qlVar;
        LinkedHashMap linkedHashMap;
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        String string = from.getString("id");
        kotlin.jvm.internal.h.d(string, "from.getString(\"id\")");
        String it = from.getString("level");
        kotlin.jvm.internal.h.d(it, "it");
        ql[] values = ql.values();
        int length = values.length;
        int i9 = 0;
        while (true) {
            arrayList = null;
            if (i9 < length) {
                ql qlVar2 = values[i9];
                if (kotlin.jvm.internal.h.a(qlVar2.f13063a, it)) {
                    qlVar = qlVar2;
                    break;
                }
                i9++;
            } else {
                qlVar = null;
                break;
            }
        }
        kotlin.jvm.internal.h.b(qlVar);
        String string2 = from.getString("message");
        kotlin.jvm.internal.h.d(string2, "from.getString(\"message\")");
        String d9 = jc.d(from, "stacktrace");
        long j = from.getLong("timestamp");
        JSONObject optJSONObject = from.optJSONObject("tags");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            kotlin.jvm.internal.h.d(keys, "obj.keys()");
            V7.j f02 = V7.l.f0(keys);
            linkedHashMap = new LinkedHashMap();
            for (Object obj2 : f02) {
                linkedHashMap.put(obj2, optJSONObject.getString((String) obj2));
            }
        } else {
            linkedHashMap = null;
        }
        JSONArray optJSONArray = from.optJSONArray("prev");
        if (optJSONArray != null) {
            ml mlVar = new ml(this.f12830a);
            List H02 = B7.k.H0(B6.u0.N(0, optJSONArray.length()));
            arrayList = new ArrayList(B7.m.f0(H02, 10));
            Iterator it2 = H02.iterator();
            while (it2.hasNext()) {
                JSONObject jSONObject = optJSONArray.getJSONObject(((Number) it2.next()).intValue());
                kotlin.jvm.internal.h.d(jSONObject, "getJSONObject(index)");
                arrayList.add(mlVar.invoke(jSONObject));
            }
        }
        return new pl(string, qlVar, string2, d9, j, linkedHashMap, arrayList);
    }
}
