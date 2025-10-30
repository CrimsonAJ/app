package co.notix;

import co.notix.interstitial.InterstitialButton;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ac implements gb {
    @Override // co.notix.td
    public final Object a(Object obj) {
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        return new InterstitialButton(from.getString("text"));
    }
}
