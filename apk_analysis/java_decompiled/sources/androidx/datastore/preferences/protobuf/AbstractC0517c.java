package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0517c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f9689a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f9690b;

    static {
        Class<?> cls;
        boolean z9;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f9689a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        f9690b = z9;
    }

    public static boolean a() {
        if (f9689a != null && !f9690b) {
            return true;
        }
        return false;
    }
}
