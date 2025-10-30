package b0;

import O7.l;
import java.util.Map;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583a extends kotlin.jvm.internal.i implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final C0583a f10456d = new kotlin.jvm.internal.i(1);

    @Override // O7.l
    public final Object invoke(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        kotlin.jvm.internal.h.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            kotlin.jvm.internal.h.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i9 = 0;
            for (byte b9 : bArr) {
                i9++;
                if (i9 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b9));
            }
            sb.append((CharSequence) "]");
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((g) entry.getKey()).f10466a + " = " + valueOf;
    }
}
