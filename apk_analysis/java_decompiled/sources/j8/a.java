package j8;

import i8.s;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f19798a;

    /* renamed from: b, reason: collision with root package name */
    public final List f19799b;

    public a(int i9, String dnsHostname, List list) {
        switch (i9) {
            case 1:
                this.f19798a = dnsHostname;
                this.f19799b = list;
                return;
            default:
                h.e(dnsHostname, "dnsHostname");
                this.f19798a = dnsHostname;
                this.f19799b = list;
                return;
        }
    }

    public static String a(a aVar) {
        boolean z9;
        boolean z10 = false;
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = aVar.f19798a;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (upperCase.matches("[A-F0-9]+")) {
                sb.append("/");
                sb.append(upperCase);
            } else {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
        }
        List<String> list = aVar.f19799b;
        if (list != null) {
            if (!list.isEmpty()) {
                if (str == null) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (str == null) {
                    sb.append("/");
                }
                sb.append("/");
                boolean z11 = true;
                for (String str2 : list) {
                    y4.a.c(str2);
                    if (!z11) {
                        sb.append(",");
                    }
                    if (!y4.a.f24915a.matcher(str2).matches()) {
                        StringBuilder sb2 = new StringBuilder(str2.length());
                        for (int i9 = 0; i9 < str2.length(); i9++) {
                            char charAt = str2.charAt(i9);
                            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-' && charAt != '.' && charAt != ':'))) {
                                sb2.append(String.format("%%%04x", Integer.valueOf(charAt)));
                            } else {
                                sb2.append(charAt);
                            }
                        }
                        str2 = sb2.toString();
                    }
                    sb.append(str2);
                    z11 = false;
                }
                z10 = z9;
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        } else if (str != null) {
            z10 = true;
        }
        if (true != z10 && list == null) {
            sb.append("/");
        }
        if (list == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    @Override // i8.s
    public List i(String hostname) {
        h.e(hostname, "hostname");
        String str = this.f19798a;
        if (h.a(str, hostname)) {
            return this.f19799b;
        }
        throw new UnknownHostException("BootstrapDns called for " + hostname + " instead of " + str);
    }
}
