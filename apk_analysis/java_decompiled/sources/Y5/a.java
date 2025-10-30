package Y5;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f8733a = Logger.getLogger(a.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f8734b = new AtomicBoolean(false);

    public static boolean a() {
        if (f8734b.get()) {
            return true;
        }
        return false;
    }
}
