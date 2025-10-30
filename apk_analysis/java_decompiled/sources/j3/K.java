package j3;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f19387a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f19388b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (K.class) {
            if (f19387a.add(str)) {
                f19388b += ", " + str;
            }
        }
    }
}
