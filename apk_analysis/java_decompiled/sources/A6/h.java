package A6;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o1.C1671f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u0.z;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f506b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final E6.e f507a;

    public h(E6.e eVar) {
        this.f507a = eVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            String string = jSONArray.getString(i9);
            try {
                C1671f c1671f = o.f526a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, 256);
                }
                arrayList.add(new b(string2, string3, string4, string5, j));
            } catch (Exception e8) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e8);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i9 = 0; i9 < list.size(); i9++) {
            try {
                jSONArray.put(new JSONObject(o.f526a.u(list.get(i9))));
            } catch (JSONException e8) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e8);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath() + "\nReason: " + str, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    public final Map c(String str, boolean z9) {
        File b9;
        Throwable th;
        FileInputStream fileInputStream;
        Exception e8;
        E6.e eVar = this.f507a;
        if (z9) {
            b9 = eVar.b(str, "internal-keys");
        } else {
            b9 = eVar.b(str, "keys");
        }
        if (b9.exists() && b9.length() != 0) {
            try {
                try {
                    fileInputStream = new FileInputStream(b9);
                    try {
                        HashMap a5 = a(y6.g.i(fileInputStream));
                        y6.g.b(fileInputStream, "Failed to close user metadata file.");
                        return a5;
                    } catch (Exception e9) {
                        e8 = e9;
                        Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e8);
                        f(b9);
                        y6.g.b(fileInputStream, "Failed to close user metadata file.");
                        return Collections.EMPTY_MAP;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    y6.g.b(r1, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e10) {
                fileInputStream = null;
                e8 = e10;
            } catch (Throwable th3) {
                ?? r1 = 0;
                th = th3;
                y6.g.b(r1, "Failed to close user metadata file.");
                throw th;
            }
        } else {
            g(b9, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        String str2;
        File b9 = this.f507a.b(str, "user-data");
        Closeable closeable = null;
        if (b9.exists()) {
            ?? r32 = (b9.length() > 0L ? 1 : (b9.length() == 0L ? 0 : -1));
            try {
                if (r32 != 0) {
                    try {
                        fileInputStream = new FileInputStream(b9);
                        try {
                            JSONObject jSONObject = new JSONObject(y6.g.i(fileInputStream));
                            if (!jSONObject.isNull("userId")) {
                                str2 = jSONObject.optString("userId", null);
                            } else {
                                str2 = null;
                            }
                            String str3 = "Loaded userId " + str2 + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str3, null);
                            }
                            y6.g.b(fileInputStream, "Failed to close user metadata file.");
                            return str2;
                        } catch (Exception e8) {
                            e = e8;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(b9);
                            y6.g.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        y6.g.b(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
            }
        }
        String e10 = z.e("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", e10, null);
        }
        f(b9);
        return null;
    }

    public final void h(String str, Map map, boolean z9) {
        File b9;
        String jSONObject;
        BufferedWriter bufferedWriter;
        E6.e eVar = this.f507a;
        if (z9) {
            b9 = eVar.b(str, "internal-keys");
        } else {
            b9 = eVar.b(str, "keys");
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b9), f506b));
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            y6.g.b(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e9) {
            e = e9;
            bufferedWriter2 = bufferedWriter;
            Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
            f(b9);
            y6.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            y6.g.b(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    public final void i(String str, List list) {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e8;
        File b9 = this.f507a.b(str, "rollouts-state");
        ?? isEmpty = list.isEmpty();
        if (isEmpty != 0) {
            g(b9, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                String e9 = e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b9), f506b));
                try {
                    bufferedWriter.write(e9);
                    bufferedWriter.flush();
                    y6.g.b(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e10) {
                    e8 = e10;
                    Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e8);
                    f(b9);
                    y6.g.b(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th2) {
                th = th2;
                y6.g.b(isEmpty, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e11) {
            bufferedWriter = null;
            e8 = e11;
        } catch (Throwable th3) {
            isEmpty = 0;
            th = th3;
            y6.g.b(isEmpty, "Failed to close rollouts state file.");
            throw th;
        }
    }
}
