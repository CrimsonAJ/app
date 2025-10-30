package b7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: b7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11400a;

    /* renamed from: b, reason: collision with root package name */
    public final C0701c f11401b;

    public C0700b(Set set, C0701c c0701c) {
        this.f11400a = b(set);
        this.f11401b = c0701c;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0699a c0699a = (C0699a) it.next();
            sb.append(c0699a.f11398a);
            sb.append('/');
            sb.append(c0699a.f11399b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        C0701c c0701c = this.f11401b;
        synchronized (((HashSet) c0701c.f11404b)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) c0701c.f11404b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f11400a;
        if (isEmpty) {
            return str;
        }
        return str + ' ' + b(c0701c.F());
    }
}
