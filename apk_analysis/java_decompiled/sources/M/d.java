package M;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f4651a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4652b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4653c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4654d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4655e;

    public d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f4651a = str;
        str2.getClass();
        this.f4652b = str2;
        this.f4653c = str3;
        list.getClass();
        this.f4654d = list;
        this.f4655e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f4651a + ", mProviderPackage: " + this.f4652b + ", mQuery: " + this.f4653c + ", mCertificates:");
        int i9 = 0;
        while (true) {
            List list = this.f4654d;
            if (i9 < list.size()) {
                sb.append(" [");
                List list2 = (List) list.get(i9);
                for (int i10 = 0; i10 < list2.size(); i10++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
                i9++;
            } else {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
        }
    }
}
