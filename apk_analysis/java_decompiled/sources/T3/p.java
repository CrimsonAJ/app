package T3;

import android.util.Base64;
import j3.AbstractC1455g;
import j3.j0;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.O;
import l4.y;
import n3.C1629f;
import n3.C1630g;
import y3.AbstractC2214j;

/* loaded from: classes.dex */
public final class p implements O {

    /* renamed from: a, reason: collision with root package name */
    public final m f7203a;

    /* renamed from: b, reason: collision with root package name */
    public final j f7204b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f7160c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f7161d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f7162e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f7163f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f7165g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f7167h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f7169i = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f7172k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f7174l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f7176m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f7178n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f7180o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f7182p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f7184q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f7186r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f7187s = a("CAN-SKIP-DATERANGES");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f7189t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f7191u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f7193v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f7195w = a("CAN-BLOCK-RELOAD");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f7197x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f7199y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f7201z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f7154A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: B, reason: collision with root package name */
    public static final Pattern f7155B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f7156C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f7157D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: X, reason: collision with root package name */
    public static final Pattern f7158X = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern Y = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: Z, reason: collision with root package name */
    public static final Pattern f7159Z = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f7164f0 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f7166g0 = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f7168h0 = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: i0, reason: collision with root package name */
    public static final Pattern f7170i0 = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: j0, reason: collision with root package name */
    public static final Pattern f7171j0 = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: k0, reason: collision with root package name */
    public static final Pattern f7173k0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: l0, reason: collision with root package name */
    public static final Pattern f7175l0 = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: m0, reason: collision with root package name */
    public static final Pattern f7177m0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: n0, reason: collision with root package name */
    public static final Pattern f7179n0 = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: o0, reason: collision with root package name */
    public static final Pattern f7181o0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: p0, reason: collision with root package name */
    public static final Pattern f7183p0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: q0, reason: collision with root package name */
    public static final Pattern f7185q0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern r0 = a("AUTOSELECT");

    /* renamed from: s0, reason: collision with root package name */
    public static final Pattern f7188s0 = a("DEFAULT");

    /* renamed from: t0, reason: collision with root package name */
    public static final Pattern f7190t0 = a("FORCED");

    /* renamed from: u0, reason: collision with root package name */
    public static final Pattern f7192u0 = a("INDEPENDENT");

    /* renamed from: v0, reason: collision with root package name */
    public static final Pattern f7194v0 = a("GAP");

    /* renamed from: w0, reason: collision with root package name */
    public static final Pattern f7196w0 = a("PRECISE");

    /* renamed from: x0, reason: collision with root package name */
    public static final Pattern f7198x0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: y0, reason: collision with root package name */
    public static final Pattern f7200y0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: z0, reason: collision with root package name */
    public static final Pattern f7202z0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public p(m mVar, j jVar) {
        this.f7203a = mVar;
        this.f7204b = jVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static C1630g b(String str, C1629f[] c1629fArr) {
        C1629f[] c1629fArr2 = new C1629f[c1629fArr.length];
        for (int i9 = 0; i9 < c1629fArr.length; i9++) {
            C1629f c1629f = c1629fArr[i9];
            c1629fArr2[i9] = new C1629f(c1629f.f21116b, c1629f.f21117c, c1629f.f21118d, null);
        }
        return new C1630g(str, true, c1629fArr2);
    }

    public static C1629f c(String str, String str2, HashMap hashMap) {
        String i9 = i(str, f7168h0, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f7170i0;
        if (equals) {
            String j4 = j(str, pattern, hashMap);
            return new C1629f(AbstractC1455g.f19619d, null, "video/mp4", Base64.decode(j4.substring(j4.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC1455g.f19619d;
            int i10 = y.f20553a;
            return new C1629f(uuid, null, "hls", str.getBytes(O5.e.f5491c));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(i9)) {
            return null;
        }
        String j9 = j(str, pattern, hashMap);
        byte[] decode = Base64.decode(j9.substring(j9.indexOf(44)), 0);
        UUID uuid2 = AbstractC1455g.f19620e;
        return new C1629f(uuid2, null, "video/mp4", AbstractC2214j.a(uuid2, null, decode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static T3.j d(T3.m r110, T3.j r111, android.support.v4.media.session.y r112, java.lang.String r113) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.p.d(T3.m, T3.j, android.support.v4.media.session.y, java.lang.String):T3.j");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x015c, code lost:
    
        if (r9 > 0) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x0397. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static T3.m e(android.support.v4.media.session.y r37, java.lang.String r38) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.p.e(android.support.v4.media.session.y, java.lang.String):T3.m");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return -9.223372036854776E18d;
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return l(str2, map);
        }
        return str2;
    }

    public static String j(String str, Pattern pattern, Map map) {
        String i9 = i(str, pattern, null, map);
        if (i9 != null) {
            return i9;
        }
        throw j0.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = f7202z0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073 A[Catch: all -> 0x00a0, LOOP:0: B:13:0x0073->B:38:0x0073, LOOP_START, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0010, B:5:0x0019, B:7:0x0021, B:10:0x002a, B:13:0x0073, B:15:0x0079, B:18:0x0084, B:53:0x008c, B:20:0x00a2, B:22:0x00aa, B:24:0x00b2, B:26:0x00ba, B:28:0x00c2, B:30:0x00ca, B:32:0x00d2, B:34:0x00da, B:36:0x00e3, B:41:0x00e7, B:62:0x0109, B:63:0x010f, B:67:0x0031, B:69:0x0037, B:74:0x0040, B:76:0x0049, B:82:0x0055, B:84:0x005b, B:87:0x0062, B:90:0x0067), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0109 A[Catch: all -> 0x00a0, TRY_ENTER, TryCatch #0 {all -> 0x00a0, blocks: (B:3:0x0010, B:5:0x0019, B:7:0x0021, B:10:0x002a, B:13:0x0073, B:15:0x0079, B:18:0x0084, B:53:0x008c, B:20:0x00a2, B:22:0x00aa, B:24:0x00b2, B:26:0x00ba, B:28:0x00c2, B:30:0x00ca, B:32:0x00d2, B:34:0x00da, B:36:0x00e3, B:41:0x00e7, B:62:0x0109, B:63:0x010f, B:67:0x0031, B:69:0x0037, B:74:0x0040, B:76:0x0049, B:82:0x0055, B:84:0x005b, B:87:0x0062, B:90:0x0067), top: B:2:0x0010 }] */
    @Override // k4.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(android.net.Uri r9, k4.C1515o r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.p.k(android.net.Uri, k4.o):java.lang.Object");
    }
}
