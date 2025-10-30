package K4;

import F4.y;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class c {
    static {
        Pattern.compile("\\\\.");
        Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != null || obj2 != null) {
            if (obj != null && obj2 != null) {
                try {
                    if ((obj instanceof JSONObject) && (obj2 instanceof JSONObject)) {
                        JSONObject jSONObject = (JSONObject) obj;
                        JSONObject jSONObject2 = (JSONObject) obj2;
                        if (jSONObject.length() == jSONObject2.length()) {
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (jSONObject2.has(next)) {
                                    y.h(next);
                                    if (a(jSONObject.get(next), jSONObject2.get(next))) {
                                    }
                                }
                            }
                            return true;
                        }
                    } else if ((obj instanceof JSONArray) && (obj2 instanceof JSONArray)) {
                        JSONArray jSONArray = (JSONArray) obj;
                        JSONArray jSONArray2 = (JSONArray) obj2;
                        if (jSONArray.length() == jSONArray2.length()) {
                            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                                if (a(jSONArray.get(i9), jSONArray2.get(i9))) {
                                }
                            }
                            return true;
                        }
                    } else {
                        return obj.equals(obj2);
                    }
                } catch (JSONException unused) {
                }
            }
            return false;
        }
        return true;
    }
}
