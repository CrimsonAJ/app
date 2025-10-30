package S2;

import A4.r;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f6739c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f6740d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final r f6741a = new r(5, false);

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f6742b = new StringBuilder();

    public static String a(r rVar, StringBuilder sb) {
        boolean z9 = false;
        sb.setLength(0);
        int i9 = rVar.f382a;
        int i10 = rVar.f383b;
        while (i9 < i10 && !z9) {
            char c3 = (char) ((byte[]) rVar.f384c)[i9];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && ((c3 < '0' || c3 > '9') && c3 != '#' && c3 != '-' && c3 != '.' && c3 != '_'))) {
                z9 = true;
            } else {
                i9++;
                sb.append(c3);
            }
        }
        rVar.I(i9 - rVar.f382a);
        return sb.toString();
    }

    public static String b(r rVar, StringBuilder sb) {
        c(rVar);
        if (rVar.e() == 0) {
            return null;
        }
        String a5 = a(rVar, sb);
        if (!"".equals(a5)) {
            return a5;
        }
        return "" + ((char) rVar.x());
    }

    public static void c(r rVar) {
        while (true) {
            for (boolean z9 = true; rVar.e() > 0 && z9; z9 = false) {
                int i9 = rVar.f382a;
                byte[] bArr = (byte[]) rVar.f384c;
                byte b9 = bArr[i9];
                char c3 = (char) b9;
                if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                    int i10 = rVar.f383b;
                    int i11 = i9 + 2;
                    if (i11 <= i10) {
                        int i12 = i9 + 1;
                        if (b9 == 47 && bArr[i12] == 42) {
                            while (true) {
                                int i13 = i11 + 1;
                                if (i13 >= i10) {
                                    break;
                                }
                                if (((char) bArr[i11]) == '*' && ((char) bArr[i13]) == '/') {
                                    i11 += 2;
                                    i10 = i11;
                                } else {
                                    i11 = i13;
                                }
                            }
                            rVar.I(i10 - rVar.f382a);
                        }
                    }
                } else {
                    rVar.I(1);
                }
            }
            return;
        }
    }
}
