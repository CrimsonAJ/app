package Q6;

import android.util.Base64OutputStream;
import b7.C0700b;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f6452b;

    public /* synthetic */ d(e eVar, int i9) {
        this.f6451a = i9;
        this.f6452b = eVar;
    }

    private final Object a() {
        String byteArrayOutputStream;
        e eVar = this.f6452b;
        synchronized (eVar) {
            try {
                i iVar = (i) eVar.f6453a.get();
                ArrayList c3 = iVar.c();
                iVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i9 = 0; i9 < c3.size(); i9++) {
                    a aVar = (a) c3.get(i9);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", aVar.f6444a);
                    jSONObject.put("dates", new JSONArray((Collection) aVar.f6445b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return byteArrayOutputStream;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6451a) {
            case 0:
                return a();
            default:
                e eVar = this.f6452b;
                synchronized (eVar) {
                    ((i) eVar.f6453a.get()).k(System.currentTimeMillis(), ((C0700b) eVar.f6455c.get()).a());
                }
                return null;
        }
    }
}
