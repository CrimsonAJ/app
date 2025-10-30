package i8;

import f5.C1183o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class w implements Iterable, P7.a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f19159a;

    public w(String[] strArr) {
        this.f19159a = strArr;
    }

    public final String b(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        String[] strArr = this.f19159a;
        int length = strArr.length - 2;
        int z9 = v4.e.z(length, 0, -2);
        if (z9 <= length) {
            while (!W7.l.H(name, strArr[length], true)) {
                if (length != z9) {
                    length -= 2;
                } else {
                    return null;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String c(int i9) {
        return this.f19159a[i9 * 2];
    }

    public final C1183o d() {
        C1183o c1183o = new C1183o(5);
        ArrayList arrayList = (ArrayList) c1183o.f17433b;
        kotlin.jvm.internal.h.e(arrayList, "<this>");
        String[] elements = this.f19159a;
        kotlin.jvm.internal.h.e(elements, "elements");
        arrayList.addAll(B7.j.a0(elements));
        return c1183o;
    }

    public final TreeMap e() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.h.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            String c3 = c(i9);
            Locale US = Locale.US;
            kotlin.jvm.internal.h.d(US, "US");
            String lowerCase = c3.toLowerCase(US);
            kotlin.jvm.internal.h.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(f(i9));
        }
        return treeMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            if (Arrays.equals(this.f19159a, ((w) obj).f19159a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String f(int i9) {
        return this.f19159a[(i9 * 2) + 1];
    }

    public final List g(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < size; i9++) {
            if (name.equalsIgnoreCase(c(i9))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(f(i9));
            }
        }
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.h.d(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            return unmodifiableList;
        }
        return B7.t.f1135a;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19159a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        A7.h[] hVarArr = new A7.h[size];
        for (int i9 = 0; i9 < size; i9++) {
            hVarArr[i9] = new A7.h(c(i9), f(i9));
        }
        return kotlin.jvm.internal.r.e(hVarArr);
    }

    public final int size() {
        return this.f19159a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            String c3 = c(i9);
            String f9 = f(i9);
            sb.append(c3);
            sb.append(": ");
            if (k8.c.q(c3)) {
                f9 = "██";
            }
            sb.append(f9);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
