package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pb implements td {
    @Override // co.notix.td
    public final Object a(Object obj) {
        d3 d3Var;
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        String string = from.getString("impression_data");
        kotlin.jvm.internal.h.d(string, "from.getString(DATA_FIELD)");
        String it = from.getString("ad_format");
        kotlin.jvm.internal.h.d(it, "it");
        switch (it.hashCode()) {
            case -1980132765:
                if (it.equals("LockScreenInterstitial")) {
                    d3Var = z2.f13625a;
                    return new ob(string, d3Var);
                }
                break;
            case -1968751561:
                if (it.equals("Native")) {
                    d3Var = a3.f11820a;
                    return new ob(string, d3Var);
                }
                break;
            case 2499173:
                if (it.equals("Pull")) {
                    d3Var = b3.f11907a;
                    return new ob(string, d3Var);
                }
                break;
            case 2499386:
                if (it.equals("Push")) {
                    d3Var = c3.f11973a;
                    return new ob(string, d3Var);
                }
                break;
            case 769047372:
                if (it.equals("Interstitial")) {
                    d3Var = y2.f13572a;
                    return new ob(string, d3Var);
                }
                break;
            case 870560747:
                if (it.equals("AppOpen")) {
                    d3Var = v2.f13328a;
                    return new ob(string, d3Var);
                }
                break;
            case 1982491468:
                if (it.equals("Banner")) {
                    d3Var = w2.f13398a;
                    return new ob(string, d3Var);
                }
                break;
        }
        throw new IllegalArgumentException("unknown AdFormat name=".concat(it));
    }
}
