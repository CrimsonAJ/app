package z4;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y4.b;

/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2247a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25416a = new b("MetadataUtils", null);

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f25417b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f25418c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f25417b = strArr;
        f25418c = "yyyyMMdd'T'HHmmss".concat(String.valueOf(strArr[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Calendar a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.AbstractC2247a.a(java.lang.String):java.util.Calendar");
    }

    public static JSONArray b(ArrayList arrayList) {
        arrayList.getClass();
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            E4.a aVar = (E4.a) obj;
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", aVar.f1941b.toString());
                jSONObject.put("width", aVar.f1942c);
                jSONObject.put("height", aVar.f1943d);
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static void c(ArrayList arrayList, JSONArray jSONArray) {
        try {
            arrayList.clear();
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                try {
                    arrayList.add(new E4.a(jSONArray.getJSONObject(i9)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }
}
