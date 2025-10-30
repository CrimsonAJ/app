package C4;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f1587a = Collections.newSetFromMap(new WeakHashMap());

    public static Set a() {
        Set set = f1587a;
        synchronized (set) {
        }
        return set;
    }
}
