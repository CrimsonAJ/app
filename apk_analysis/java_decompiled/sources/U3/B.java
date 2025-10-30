package U3;

import android.net.Uri;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final long f7302a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7303b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f7304c;

    public B(int i9, long j, Uri uri) {
        this.f7302a = j;
        this.f7303b = i9;
        this.f7304c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[Catch: Exception -> 0x0063, TRY_LEAVE, TryCatch #0 {Exception -> 0x0063, blocks: (B:7:0x0034, B:20:0x0085, B:25:0x008e, B:26:0x0093, B:29:0x0094, B:30:0x0099, B:31:0x0059, B:34:0x0065, B:37:0x0070), top: B:6:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static P5.S a(android.net.Uri r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.B.a(android.net.Uri, java.lang.String):P5.S");
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        AbstractC1566a.h(scheme.equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        String host = parse2.getHost();
        host.getClass();
        if (host.equals(uri.getHost())) {
            return parse2;
        }
        if (uri2.endsWith("/")) {
            return AbstractC1566a.M(uri2, str);
        }
        return AbstractC1566a.M(uri2.concat("/"), str);
    }
}
