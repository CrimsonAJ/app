package androidx.datastore.preferences.protobuf;

import a.AbstractC0485a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f9634a;

    static {
        char[] cArr = new char[80];
        f9634a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i9, StringBuilder sb) {
        while (i9 > 0) {
            int i10 = 80;
            if (i9 <= 80) {
                i10 = i9;
            }
            sb.append(f9634a, 0, i10);
            i9 -= i10;
        }
    }

    public static void b(StringBuilder sb, int i9, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i9, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i9, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i9, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0521g c0521g = C0521g.f9700c;
            sb.append(AbstractC0485a.m(new C0521g(((String) obj).getBytes(AbstractC0535v.f9765a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0521g) {
            sb.append(": \"");
            sb.append(AbstractC0485a.m((C0521g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0533t) {
            sb.append(" {");
            c((AbstractC0533t) obj, sb, i9 + 2);
            sb.append("\n");
            a(i9, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i11 = i9 + 2;
            b(sb, i11, "key", entry.getKey());
            b(sb, i11, "value", entry.getValue());
            sb.append("\n");
            a(i9, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x019a, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019c, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01af, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c5, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(androidx.datastore.preferences.protobuf.AbstractC0533t r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.J.c(androidx.datastore.preferences.protobuf.t, java.lang.StringBuilder, int):void");
    }
}
