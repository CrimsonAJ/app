package W7;

import B6.u0;
import B7.r;
import B7.t;
import P1.B;
import com.google.android.gms.internal.measurement.Y1;
import java.util.ArrayList;
import java.util.List;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public abstract class e extends AbstractC1570b {
    public static String C(String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        return V7.l.h0(new V7.i(new r(4, str), new B("    ", 4), 2), "\n");
    }

    public static String D(String str) {
        List list;
        kotlin.jvm.internal.h.e(str, "<this>");
        if (!d.U("|")) {
            b bVar = new b(str);
            if (!bVar.hasNext()) {
                list = t.f1135a;
            } else {
                Object next = bVar.next();
                if (!bVar.hasNext()) {
                    list = u0.D(next);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (bVar.hasNext()) {
                        arrayList.add(bVar.next());
                    }
                    list = arrayList;
                }
            }
            int length = str.length();
            list.size();
            int a02 = B7.l.a0(list);
            ArrayList arrayList2 = new ArrayList();
            int i9 = 0;
            for (Object obj : list) {
                int i10 = i9 + 1;
                String str2 = null;
                if (i9 >= 0) {
                    String str3 = (String) obj;
                    if ((i9 != 0 && i9 != a02) || !d.U(str3)) {
                        int length2 = str3.length();
                        int i11 = 0;
                        while (true) {
                            if (i11 < length2) {
                                if (!Y1.u(str3.charAt(i11))) {
                                    break;
                                }
                                i11++;
                            } else {
                                i11 = -1;
                                break;
                            }
                        }
                        if (i11 != -1 && l.K(str3, "|", i11, false)) {
                            str2 = str3.substring("|".length() + i11);
                            kotlin.jvm.internal.h.d(str2, "substring(...)");
                        }
                        if (str2 == null) {
                            str2 = str3;
                        }
                    }
                    if (str2 != null) {
                        arrayList2.add(str2);
                    }
                    i9 = i10;
                } else {
                    B7.l.e0();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            B7.k.t0(arrayList2, sb);
            return sb.toString();
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.");
    }
}
