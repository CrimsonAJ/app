package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lp implements gr {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gr f12736a;

    public lp(k9 k9Var) {
        this.f12736a = k9Var;
    }

    @Override // co.notix.td
    public final Object a(Object obj) {
        Object obj2;
        String str;
        Long l9;
        Long l10;
        Long l11;
        Long l12;
        Long l13;
        Boolean bool;
        Integer num;
        Long l14;
        Long l15;
        Long l16;
        Long l17;
        op opVar;
        np npVar;
        np npVar2;
        np npVar3;
        np npVar4;
        qp qpVar;
        qp qpVar2;
        qp qpVar3;
        qp qpVar4;
        ql qlVar;
        sp from = (sp) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        gr grVar = this.f12736a;
        l9 l9Var = from.f13194a;
        Long l18 = null;
        if (l9Var != null) {
            obj2 = (JSONObject) grVar.a(l9Var);
        } else {
            obj2 = null;
        }
        jSONObject.put("domains", obj2);
        JSONObject jSONObject2 = new JSONObject();
        rp rpVar = from.f13195b;
        if (rpVar != null && (qlVar = rpVar.f13137a) != null) {
            str = qlVar.f13063a;
        } else {
            str = null;
        }
        jSONObject2.put("level", str);
        rp rpVar2 = from.f13195b;
        if (rpVar2 != null) {
            l9 = rpVar2.f13138b;
        } else {
            l9 = null;
        }
        jSONObject2.put("storage_max_size", l9);
        JSONObject jSONObject3 = new JSONObject();
        rp rpVar3 = from.f13195b;
        if (rpVar3 != null && (qpVar4 = rpVar3.f13139c) != null) {
            l10 = qpVar4.f13069a;
        } else {
            l10 = null;
        }
        jSONObject3.put("vh", l10);
        rp rpVar4 = from.f13195b;
        if (rpVar4 != null && (qpVar3 = rpVar4.f13139c) != null) {
            l11 = qpVar3.f13070b;
        } else {
            l11 = null;
        }
        jSONObject3.put("ih", l11);
        rp rpVar5 = from.f13195b;
        if (rpVar5 != null && (qpVar2 = rpVar5.f13139c) != null) {
            l12 = qpVar2.f13071c;
        } else {
            l12 = null;
        }
        jSONObject3.put("eh", l12);
        rp rpVar6 = from.f13195b;
        if (rpVar6 != null && (qpVar = rpVar6.f13139c) != null) {
            l13 = qpVar.f13072d;
        } else {
            l13 = null;
        }
        jSONObject3.put("delay", l13);
        jSONObject2.put("rate_limits", jSONObject3);
        jSONObject.put("remote_logs", jSONObject2);
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        pp ppVar = from.f13196c;
        if (ppVar != null && (npVar4 = ppVar.f12994a) != null) {
            bool = npVar4.f12839a;
        } else {
            bool = null;
        }
        jSONObject5.put("force_ad", bool);
        pp ppVar2 = from.f13196c;
        if (ppVar2 != null && (npVar3 = ppVar2.f12994a) != null) {
            num = npVar3.f12840b;
        } else {
            num = null;
        }
        jSONObject5.put("ad_freq", num);
        pp ppVar3 = from.f13196c;
        if (ppVar3 != null && (npVar2 = ppVar3.f12994a) != null) {
            l14 = npVar2.f12841c;
        } else {
            l14 = null;
        }
        jSONObject5.put("ad_initial_delay", l14);
        pp ppVar4 = from.f13196c;
        if (ppVar4 != null && (npVar = ppVar4.f12994a) != null) {
            l15 = npVar.f12842d;
        } else {
            l15 = null;
        }
        jSONObject5.put("ad_minimal_delay", l15);
        jSONObject4.put("pull", jSONObject5);
        JSONObject jSONObject6 = new JSONObject();
        pp ppVar5 = from.f13196c;
        if (ppVar5 != null && (opVar = ppVar5.f12995b) != null) {
            l16 = opVar.f12908a;
        } else {
            l16 = null;
        }
        jSONObject6.put("sender_id", l16);
        jSONObject4.put("push", jSONObject6);
        jSONObject.put("notifications", jSONObject4);
        JSONObject jSONObject7 = new JSONObject();
        mp mpVar = from.f13197d;
        if (mpVar != null) {
            l17 = mpVar.f12796a;
        } else {
            l17 = null;
        }
        jSONObject7.put("interval_sec", l17);
        mp mpVar2 = from.f13197d;
        if (mpVar2 != null) {
            l18 = mpVar2.f12797b;
        }
        jSONObject7.put("close_sec", l18);
        jSONObject.put("lsi", jSONObject7);
        return jSONObject;
    }
}
