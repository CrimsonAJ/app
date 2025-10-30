package co.notix;

import co.notix.interstitial.InterstitialButton;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bc implements gr {
    @Override // co.notix.td
    public final Object a(Object obj) {
        InterstitialButton from = (InterstitialButton) obj;
        kotlin.jvm.internal.h.e(from, "from");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", from.getText());
        return jSONObject;
    }
}
