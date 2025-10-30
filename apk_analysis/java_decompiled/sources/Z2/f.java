package Z2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final O0.c f8959a;

    /* renamed from: b, reason: collision with root package name */
    public final d f8960b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8961c;

    public f(Context context, d dVar) {
        O0.c cVar = new O0.c((Object) context, 9, false);
        this.f8961c = new HashMap();
        this.f8959a = cVar;
        this.f8960b = dVar;
    }

    public final synchronized h a(String str) {
        if (this.f8961c.containsKey(str)) {
            return (h) this.f8961c.get(str);
        }
        CctBackendFactory A2 = this.f8959a.A(str);
        if (A2 == null) {
            return null;
        }
        d dVar = this.f8960b;
        h create = A2.create(new b(dVar.f8954a, dVar.f8955b, dVar.f8956c, str));
        this.f8961c.put(str, create);
        return create;
    }
}
