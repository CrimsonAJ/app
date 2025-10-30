package M4;

import android.content.Context;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f4791b;

    /* renamed from: a, reason: collision with root package name */
    public b f4792a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, M4.c] */
    static {
        ?? obj = new Object();
        obj.f4792a = null;
        f4791b = obj;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f4791b;
        synchronized (cVar) {
            try {
                if (cVar.f4792a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f4792a = new b(context, false);
                }
                bVar = cVar.f4792a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
