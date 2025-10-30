package V7;

import B6.u0;
import B7.r;
import B7.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public abstract class l extends m {
    public static j f0(Iterator it) {
        kotlin.jvm.internal.h.e(it, "<this>");
        return new a(new r(3, it));
    }

    public static j g0(Object obj, O7.l lVar) {
        if (obj == null) {
            return e.f7818a;
        }
        return new i(new B2.i(6, obj), lVar);
    }

    public static String h0(j jVar, String str) {
        kotlin.jvm.internal.h.e(jVar, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i9 = 0;
        for (Object obj : jVar) {
            i9++;
            if (i9 > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC1570b.a(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static List i0(j jVar) {
        Iterator it = jVar.iterator();
        if (!it.hasNext()) {
            return t.f1135a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return u0.D(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
