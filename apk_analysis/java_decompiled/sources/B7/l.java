package B7;

import B6.u0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l extends u0 {
    public static int a0(List list) {
        kotlin.jvm.internal.h.e(list, "<this>");
        return list.size() - 1;
    }

    public static List b0(Object... elements) {
        kotlin.jvm.internal.h.e(elements, "elements");
        if (elements.length > 0) {
            return j.a0(elements);
        }
        return t.f1135a;
    }

    public static ArrayList c0(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new h(objArr, true));
    }

    public static final List d0(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return u0.D(list.get(0));
        }
        return t.f1135a;
    }

    public static void e0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
