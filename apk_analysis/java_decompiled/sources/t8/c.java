package t8;

import B7.y;
import i8.E;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f23323a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f23324b;

    static {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = E.class.getPackage();
        if (r22 != null) {
            str = r22.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        linkedHashMap.put(E.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(q8.f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(m8.c.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f23324b = y.H(linkedHashMap);
    }
}
