package U5;

import a6.C0503c;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import u0.z;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f7506a = new CopyOnWriteArrayList();

    public static C0503c a(String str) {
        boolean startsWith;
        Iterator it = f7506a.iterator();
        while (it.hasNext()) {
            C0503c c0503c = (C0503c) it.next();
            synchronized (c0503c) {
                startsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (startsWith) {
                return c0503c;
            }
        }
        throw new GeneralSecurityException(z.e("No KMS client does support: ", str));
    }
}
