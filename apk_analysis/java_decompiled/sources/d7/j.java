package d7;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f16924a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f16925b;

    /* renamed from: c, reason: collision with root package name */
    public final d f16926c;

    /* renamed from: d, reason: collision with root package name */
    public final d f16927d;

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public j(Executor executor, d dVar, d dVar2) {
        this.f16925b = executor;
        this.f16926c = dVar;
        this.f16927d = dVar2;
    }

    public static HashSet b(d dVar) {
        HashSet hashSet = new HashSet();
        e c3 = dVar.c();
        if (c3 != null) {
            Iterator<String> keys = c3.f16898b.keys();
            while (keys.hasNext()) {
                hashSet.add(keys.next());
            }
        }
        return hashSet;
    }

    public final void a(c7.k kVar) {
        synchronized (this.f16924a) {
            this.f16924a.add(kVar);
        }
    }
}
