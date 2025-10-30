package B2;

import Y7.B;
import android.content.Context;
import android.util.Base64;
import g6.o;
import i8.L;
import i8.y;
import i8.z;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g implements z {

    /* renamed from: a, reason: collision with root package name */
    public final Context f626a;

    /* renamed from: b, reason: collision with root package name */
    public int f627b;

    public g(Context applicationContext) {
        kotlin.jvm.internal.h.e(applicationContext, "applicationContext");
        this.f626a = applicationContext;
    }

    public static final String b(g gVar, y yVar) {
        gVar.getClass();
        try {
            o oVar = o.f17761a;
            String b9 = yVar.b();
            String d9 = yVar.d();
            if (d9 == null) {
                d9 = "";
            }
            return Base64.encodeToString(oVar.B(gVar.f626a, b9, d9), 2);
        } catch (Exception unused) {
            return new JSONObject().toString();
        }
    }

    @Override // i8.z
    public final L a(o8.d dVar) {
        return (L) B.v(E7.j.f1978a, new f(dVar, this, null));
    }
}
