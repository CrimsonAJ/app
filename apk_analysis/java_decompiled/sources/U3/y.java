package U3;

import P5.AbstractC0349q;
import P5.S;
import P5.f0;
import android.net.Uri;
import co.notix.R;
import j3.j0;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f7482a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f7483b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f7484c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f7485d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f7486e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f7487f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final String f7488g = new String(new byte[]{10});

    /* renamed from: h, reason: collision with root package name */
    public static final String f7489h = new String(new byte[]{13, 10});

    public static int a(String str) {
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1881579439:
                if (str.equals("RECORD")) {
                    c3 = 0;
                    break;
                }
                break;
            case -880847356:
                if (str.equals("TEARDOWN")) {
                    c3 = 1;
                    break;
                }
                break;
            case -702888512:
                if (str.equals("GET_PARAMETER")) {
                    c3 = 2;
                    break;
                }
                break;
            case -531492226:
                if (str.equals("OPTIONS")) {
                    c3 = 3;
                    break;
                }
                break;
            case -84360524:
                if (str.equals("PLAY_NOTIFY")) {
                    c3 = 4;
                    break;
                }
                break;
            case 2458420:
                if (str.equals("PLAY")) {
                    c3 = 5;
                    break;
                }
                break;
            case 6481884:
                if (str.equals("REDIRECT")) {
                    c3 = 6;
                    break;
                }
                break;
            case 71242700:
                if (str.equals("SET_PARAMETER")) {
                    c3 = 7;
                    break;
                }
                break;
            case 75902422:
                if (str.equals("PAUSE")) {
                    c3 = '\b';
                    break;
                }
                break;
            case 78791261:
                if (str.equals("SETUP")) {
                    c3 = '\t';
                    break;
                }
                break;
            case 133006441:
                if (str.equals("ANNOUNCE")) {
                    c3 = '\n';
                    break;
                }
                break;
            case 1800840907:
                if (str.equals("DESCRIBE")) {
                    c3 = 11;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return 8;
            case 1:
                return 12;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 7;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 11;
            case '\b':
                return 5;
            case '\t':
                return 10;
            case R.styleable.GradientColor_android_endX /* 10 */:
                return 1;
            case R.styleable.GradientColor_android_endY /* 11 */:
                return 2;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static S b(String str) {
        if (str == null) {
            P5.D d9 = P5.F.f5901b;
            return S.f5926e;
        }
        AbstractC0349q.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i9 = l4.y.f20553a;
        String[] split = str.split(",\\s?", -1);
        int length = split.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Integer valueOf = Integer.valueOf(a(split[i10]));
            int i12 = i11 + 1;
            if (objArr.length < i12) {
                objArr = Arrays.copyOf(objArr, P5.C.e(objArr.length, i12));
            }
            objArr[i11] = valueOf;
            i10++;
            i11 = i12;
        }
        return P5.F.k(i11, objArr);
    }

    public static R3.u c(Uri uri) {
        int i9 = 1;
        String userInfo = uri.getUserInfo();
        if (userInfo != null && userInfo.contains(":")) {
            int i10 = l4.y.f20553a;
            String[] split = userInfo.split(":", 2);
            return new R3.u(split[0], i9, split[1]);
        }
        return null;
    }

    public static l4.s d(String str) {
        Matcher matcher = f7486e.matcher(str);
        String str2 = "";
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(3);
            group2.getClass();
            String group3 = matcher.group(4);
            int i9 = O5.i.f5495a;
            if (group3 != null) {
                str2 = group3;
            }
            return new l4.s(2, group, group2, str2);
        }
        Matcher matcher2 = f7487f.matcher(str);
        if (matcher2.matches()) {
            String group4 = matcher2.group(1);
            group4.getClass();
            return new l4.s(1, group4, "", "");
        }
        throw j0.b("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri e(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String authority = uri.getAuthority();
        authority.getClass();
        AbstractC1566a.h(authority.contains("@"));
        int i9 = l4.y.f20553a;
        return uri.buildUpon().encodedAuthority(authority.split("@", -1)[1]).build();
    }

    public static S f(z zVar) {
        boolean z9;
        o oVar = zVar.f7492c;
        if (oVar.b("CSeq") != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        P5.C c3 = new P5.C();
        Object[] objArr = {g(zVar.f7491b), zVar.f7490a, "RTSP/1.0"};
        int i9 = l4.y.f20553a;
        c3.a(String.format(Locale.US, "%s %s %s", objArr));
        P5.G g9 = oVar.f7423a;
        f0 it = g9.f5902d.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            P5.F c9 = g9.c(str);
            for (int i10 = 0; i10 < c9.size(); i10++) {
                c3.a(String.format(Locale.US, "%s: %s", str, c9.get(i10)));
            }
        }
        c3.a("");
        c3.a(zVar.f7493d);
        return c3.d();
    }

    public static String g(int i9) {
        switch (i9) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case R.styleable.GradientColor_android_endX /* 10 */:
                return "SETUP";
            case R.styleable.GradientColor_android_endY /* 11 */:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
