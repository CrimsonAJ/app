package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class G {
    public static F a(Object obj, Object obj2) {
        F f9 = (F) obj;
        F f10 = (F) obj2;
        if (!f10.isEmpty()) {
            if (!f9.f9631a) {
                f9 = f9.c();
            }
            f9.b();
            if (!f10.isEmpty()) {
                f9.putAll(f10);
            }
        }
        return f9;
    }
}
