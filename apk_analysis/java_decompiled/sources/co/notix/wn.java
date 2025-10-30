package co.notix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class wn implements gr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gr f13457a;

    public wn(ol olVar) {
        this.f13457a = olVar;
    }

    @Override // co.notix.td
    public final Object a(Object obj) {
        xn from = (xn) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        gr grVar = this.f13457a;
        List list = from.f13556a;
        ArrayList arrayList = new ArrayList(B7.m.f0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((JSONObject) grVar.a((pl) it.next()));
        }
        jSONObject.put("entries", new JSONArray((Collection) arrayList));
        jSONObject.put("manufacturer", from.f13557b);
        jSONObject.put("model", from.f13558c);
        jSONObject.put("android_api", from.f13559d);
        jSONObject.put("app_version_code", from.f13560e);
        return jSONObject;
    }
}
