package y4;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f24915a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    /* renamed from: b, reason: collision with root package name */
    public static final Random f24916b = new Random(SystemClock.elapsedRealtime());

    public static JSONObject a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String b(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() <= 128) {
                if (str.startsWith("urn:x-cast:")) {
                    if (str.length() != 11) {
                        return;
                    } else {
                        throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
                    }
                }
                throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
            }
            throw new IllegalArgumentException("Invalid namespace length");
        }
        throw new IllegalArgumentException("Namespace cannot be null or empty");
    }

    public static ArrayList d(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i9 : iArr) {
            arrayList.add(Integer.valueOf(i9));
        }
        return arrayList;
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj != null && obj2 != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int[] f(AbstractCollection abstractCollection) {
        int[] iArr = new int[abstractCollection.size()];
        Iterator it = abstractCollection.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            iArr[i9] = ((Integer) it.next()).intValue();
            i9++;
        }
        return iArr;
    }
}
