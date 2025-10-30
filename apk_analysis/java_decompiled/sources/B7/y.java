package B7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class y extends M4.a {
    public static Object C(LinkedHashMap linkedHashMap, Object obj) {
        kotlin.jvm.internal.h.e(linkedHashMap, "<this>");
        Object obj2 = linkedHashMap.get(obj);
        if (obj2 == null && !linkedHashMap.containsKey(obj)) {
            throw new NoSuchElementException("Key " + obj + " is missing in the map.");
        }
        return obj2;
    }

    public static int D(int i9) {
        if (i9 < 0) {
            return i9;
        }
        if (i9 < 3) {
            return i9 + 1;
        }
        if (i9 < 1073741824) {
            return (int) ((i9 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map E(A7.h pair) {
        kotlin.jvm.internal.h.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f547a, pair.f548b);
        kotlin.jvm.internal.h.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final void F(LinkedHashMap linkedHashMap, A7.h[] hVarArr) {
        for (A7.h hVar : hVarArr) {
            linkedHashMap.put(hVar.f547a, hVar.f548b);
        }
    }

    public static Map G(ArrayList arrayList) {
        u uVar = u.f1136a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(D(arrayList.size()));
                int size2 = arrayList.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    A7.h hVar = (A7.h) obj;
                    linkedHashMap.put(hVar.f547a, hVar.f548b);
                }
                return linkedHashMap;
            }
            return E((A7.h) arrayList.get(0));
        }
        return uVar;
    }

    public static Map H(Map map) {
        kotlin.jvm.internal.h.e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return I(map);
            }
            kotlin.jvm.internal.h.e(map, "<this>");
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            kotlin.jvm.internal.h.d(singletonMap, "with(...)");
            return singletonMap;
        }
        return u.f1136a;
    }

    public static LinkedHashMap I(Map map) {
        kotlin.jvm.internal.h.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
