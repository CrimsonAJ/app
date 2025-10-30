package y6;

import android.util.Log;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final E6.b f25046d = new E6.b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final E6.a f25047e = new E6.a(21);

    /* renamed from: a, reason: collision with root package name */
    public final E6.e f25048a;

    /* renamed from: b, reason: collision with root package name */
    public String f25049b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f25050c = null;

    public h(E6.e eVar) {
        this.f25048a = eVar;
    }

    public static void a(E6.e eVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                eVar.b(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e8) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e8);
            }
        }
    }
}
