package co.notix;

import a.AbstractC0485a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kp implements gb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb f12638a;

    public kp(j9 j9Var) {
        this.f12638a = j9Var;
    }

    @Override // co.notix.td
    public final Object a(Object obj) {
        l9 l9Var;
        rp rpVar;
        pp ppVar;
        np npVar;
        op opVar;
        ql qlVar;
        qp qpVar;
        Object h7;
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject optJSONObject = from.optJSONObject("domains");
        mp mpVar = null;
        if (optJSONObject != null) {
            gb gbVar = this.f12638a;
            kotlin.jvm.internal.h.e(gbVar, "<this>");
            try {
                h7 = gbVar.a(optJSONObject);
            } catch (Throwable th) {
                h7 = AbstractC0485a.h(th);
            }
            if (h7 instanceof A7.i) {
                h7 = null;
            }
            l9Var = (l9) h7;
        } else {
            l9Var = null;
        }
        JSONObject optJSONObject2 = from.optJSONObject("remote_logs");
        if (optJSONObject2 != null) {
            String d9 = jc.d(optJSONObject2, "level");
            if (d9 != null) {
                ql[] values = ql.values();
                int length = values.length;
                for (int i9 = 0; i9 < length; i9++) {
                    qlVar = values[i9];
                    if (kotlin.jvm.internal.h.a(qlVar.f13063a, d9)) {
                        break;
                    }
                }
            }
            qlVar = null;
            Long c3 = jc.c(optJSONObject2, "storage_max_size");
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("rate_limits");
            if (optJSONObject3 != null) {
                qpVar = new qp(jc.c(optJSONObject3, "vh"), jc.c(optJSONObject3, "ih"), jc.c(optJSONObject3, "eh"), jc.c(optJSONObject3, "delay"));
            } else {
                qpVar = null;
            }
            rpVar = new rp(qlVar, c3, qpVar);
        } else {
            rpVar = null;
        }
        JSONObject optJSONObject4 = from.optJSONObject("notifications");
        if (optJSONObject4 != null) {
            JSONObject optJSONObject5 = optJSONObject4.optJSONObject("pull");
            if (optJSONObject5 != null) {
                npVar = new np(jc.a(optJSONObject5, "force_ad"), jc.b(optJSONObject5, "ad_freq"), jc.c(optJSONObject5, "ad_initial_delay"), jc.c(optJSONObject5, "ad_minimal_delay"));
            } else {
                npVar = null;
            }
            JSONObject optJSONObject6 = optJSONObject4.optJSONObject("push");
            if (optJSONObject6 != null) {
                opVar = new op(jc.c(optJSONObject6, "sender_id"));
            } else {
                opVar = null;
            }
            ppVar = new pp(npVar, opVar);
        } else {
            ppVar = null;
        }
        JSONObject optJSONObject7 = from.optJSONObject("lsi");
        if (optJSONObject7 != null) {
            mpVar = new mp(jc.c(optJSONObject7, "interval_sec"), jc.c(optJSONObject7, "close_sec"));
        }
        return new sp(l9Var, rpVar, ppVar, mpVar);
    }
}
