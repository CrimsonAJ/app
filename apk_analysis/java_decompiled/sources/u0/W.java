package u0;

import B6.u0;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f23461b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f23462a = new LinkedHashMap();

    public final void a(V v8) {
        String y9 = u0.y(v8.getClass());
        if (y9.length() > 0) {
            LinkedHashMap linkedHashMap = this.f23462a;
            V v9 = (V) linkedHashMap.get(y9);
            if (kotlin.jvm.internal.h.a(v9, v8)) {
                return;
            }
            boolean z9 = false;
            if (v9 != null && v9.f23460b) {
                z9 = true;
            }
            if (!z9) {
                if (!v8.f23460b) {
                    return;
                }
                throw new IllegalStateException(("Navigator " + v8 + " is already attached to another NavController").toString());
            }
            throw new IllegalStateException(("Navigator " + v8 + " is replacing an already attached " + v9).toString());
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public final V b(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        if (name.length() > 0) {
            V v8 = (V) this.f23462a.get(name);
            if (v8 != null) {
                return v8;
            }
            throw new IllegalStateException(A0.a.n("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}
