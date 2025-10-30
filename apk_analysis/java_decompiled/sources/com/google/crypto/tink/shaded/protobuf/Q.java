package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.measurement.Y1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f16307a;

    static {
        char[] cArr = new char[80];
        f16307a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i9, StringBuilder sb) {
        while (i9 > 0) {
            int i10 = 80;
            if (i9 <= 80) {
                i10 = i9;
            }
            sb.append(f16307a, 0, i10);
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
            C1036g c1036g = AbstractC1037h.f16356b;
            sb.append(Y1.m(new C1036g(((String) obj).getBytes(AbstractC1054z.f16405a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1037h) {
            sb.append(": \"");
            sb.append(Y1.m((AbstractC1037h) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1050v) {
            sb.append(" {");
            c((AbstractC1050v) obj, sb, i9 + 2);
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
    public static void c(com.google.crypto.tink.shaded.protobuf.AbstractC1050v r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Q.c(com.google.crypto.tink.shaded.protobuf.v, java.lang.StringBuilder, int):void");
    }
}
