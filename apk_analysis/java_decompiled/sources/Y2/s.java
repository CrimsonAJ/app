package Y2;

import android.content.Context;
import android.support.v4.media.session.y;
import d3.InterfaceC1121c;
import h3.InterfaceC1276a;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static volatile l f8652e;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1276a f8653a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1276a f8654b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1121c f8655c;

    /* renamed from: d, reason: collision with root package name */
    public final e3.j f8656d;

    public s(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2, InterfaceC1121c interfaceC1121c, e3.j jVar, e3.l lVar) {
        this.f8653a = interfaceC1276a;
        this.f8654b = interfaceC1276a2;
        this.f8655c = interfaceC1121c;
        this.f8656d = jVar;
        lVar.getClass();
        lVar.f17187a.execute(new A6.s(22, lVar));
    }

    public static s a() {
        l lVar = f8652e;
        if (lVar != null) {
            return (s) lVar.f8638f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, Y2.k] */
    public static void b(Context context) {
        if (f8652e == null) {
            synchronized (s.class) {
                try {
                    if (f8652e == null) {
                        ?? obj = new Object();
                        context.getClass();
                        obj.f8632a = context;
                        f8652e = obj.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final q c(W2.a aVar) {
        Set singleton;
        byte[] bytes;
        if (aVar != null) {
            aVar.getClass();
            singleton = Collections.unmodifiableSet(W2.a.f7874d);
        } else {
            singleton = Collections.singleton(new V2.c("proto"));
        }
        y a5 = j.a();
        aVar.getClass();
        a5.f9331b = "cct";
        String str = aVar.f7877a;
        String str2 = aVar.f7878b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        a5.f9332c = bytes;
        return new q(singleton, a5.B(), this);
    }
}
