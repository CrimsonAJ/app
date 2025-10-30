package i6;

import com.google.firebase.messaging.u;
import d0.w;
import f5.C1183o;
import i.G;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f18730b = new i(new d0.o(4));

    /* renamed from: c, reason: collision with root package name */
    public static final i f18731c = new i(new w(5));

    /* renamed from: a, reason: collision with root package name */
    public final h f18732a;

    static {
        new i(new d0.o(6));
        new i(new e0.c(5));
        new i(new w(4));
        new i(new d0.o(5));
        new i(new e0.c(4));
    }

    public i(j jVar) {
        if (Y5.a.a()) {
            this.f18732a = new u(jVar);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f18732a = new G(2, jVar);
        } else {
            this.f18732a = new C1183o(4, jVar);
        }
    }
}
