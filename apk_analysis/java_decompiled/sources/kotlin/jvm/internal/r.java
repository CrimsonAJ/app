package kotlin.jvm.internal;

import B7.C0051b;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class r {
    public static Collection a(AbstractCollection abstractCollection) {
        if ((abstractCollection instanceof P7.a) && !(abstractCollection instanceof P7.b)) {
            f(abstractCollection, "kotlin.collections.MutableCollection");
            throw null;
        }
        return abstractCollection;
    }

    public static Map b(LinkedHashMap linkedHashMap) {
        if ((linkedHashMap instanceof P7.a) && !(linkedHashMap instanceof P7.c)) {
            f(linkedHashMap, "kotlin.collections.MutableMap");
            throw null;
        }
        return linkedHashMap;
    }

    public static void c(int i9, Object obj) {
        if (obj != null && !d(i9, obj)) {
            f(obj, "kotlin.jvm.functions.Function" + i9);
            throw null;
        }
    }

    public static boolean d(int i9, Object obj) {
        int i10;
        if (obj instanceof A7.a) {
            if (obj instanceof e) {
                i10 = ((e) obj).getArity();
            } else if (obj instanceof O7.a) {
                i10 = 0;
            } else if (obj instanceof O7.l) {
                i10 = 1;
            } else if (obj instanceof O7.p) {
                i10 = 2;
            } else if (obj instanceof O7.q) {
                i10 = 3;
            } else if (obj instanceof O7.r) {
                i10 = 4;
            } else {
                i10 = -1;
            }
            if (i10 == i9) {
                return true;
            }
        }
        return false;
    }

    public static final C0051b e(Object[] array) {
        h.e(array, "array");
        return new C0051b(array);
    }

    public static void f(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(AbstractC0953k1.o(name, " cannot be cast to ", str));
        h.g(classCastException, r.class.getName());
        throw classCastException;
    }
}
