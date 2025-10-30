package f4;

import F0.Y;
import Y2.r;
import Y3.g;
import Y3.i;
import d1.C1097c;
import e1.q;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l4.AbstractC1566a;
import l4.y;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import u0.z;

/* renamed from: f4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1165c extends Y3.f {

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f17364n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f17365o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f17366p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f17367q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f17368r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f17369s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f17370t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u, reason: collision with root package name */
    public static final C1097c f17371u = new C1097c(1, 30.0f, 1);

    /* renamed from: v, reason: collision with root package name */
    public static final q f17372v = new q(15);

    /* renamed from: m, reason: collision with root package name */
    public final XmlPullParserFactory f17373m;

    public C1165c() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f17373m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e8) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e8);
        }
    }

    public static C1168f i(C1168f c1168f) {
        if (c1168f == null) {
            return new C1168f();
        }
        return c1168f;
    }

    public static boolean j(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static q k(XmlPullParser xmlPullParser, q qVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return qVar;
        }
        Matcher matcher = f17370t.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC1566a.P("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return qVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new q(parseInt2);
            }
            throw new Exception("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            AbstractC1566a.P("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return qVar;
        }
    }

    public static void l(String str, C1168f c1168f) {
        Matcher matcher;
        char c3 = 65535;
        int i9 = y.f20553a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f17366p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            AbstractC1566a.P("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(z.g(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c3 = 2;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    c1168f.j = 3;
                    break;
                case 1:
                    c1168f.j = 2;
                    break;
                case 2:
                    c1168f.j = 1;
                    break;
                default:
                    throw new Exception(A0.a.n("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            c1168f.f17404k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(A0.a.n("Invalid expression for fontSize: '", str, "'."));
    }

    public static C1097c m(XmlPullParser xmlPullParser) {
        int i9;
        float f9;
        int i10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i9 = Integer.parseInt(attributeValue);
        } else {
            i9 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i11 = y.f20553a;
            if (attributeValue2.split(" ", -1).length == 2) {
                f9 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
            } else {
                throw new Exception("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f9 = 1.0f;
        }
        C1097c c1097c = f17371u;
        int i12 = c1097c.f16691b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i12 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i10 = Integer.parseInt(attributeValue4);
        } else {
            i10 = c1097c.f16692c;
        }
        return new C1097c(i12, i9 * f9, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0236, code lost:
    
        if (l4.AbstractC1566a.E(r20, "metadata") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0238, code lost:
    
        r20.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0241, code lost:
    
        if (l4.AbstractC1566a.E(r20, "image") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0243, code lost:
    
        r7 = l4.AbstractC1566a.y(r20, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0247, code lost:
    
        if (r7 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0249, code lost:
    
        r25.put(r7, r20.nextText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0259, code lost:
    
        if (l4.AbstractC1566a.D(r20, "metadata") == false) goto L118;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0264 A[LOOP:0: B:2:0x000a->B:22:0x0264, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, e1.q r22, F0.Y r23, java.util.HashMap r24, java.util.HashMap r25) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.C1165c.n(org.xmlpull.v1.XmlPullParser, java.util.HashMap, e1.q, F0.Y, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x007a. Please report as an issue. */
    public static C1166d o(XmlPullParser xmlPullParser, C1166d c1166d, HashMap hashMap, C1097c c1097c) {
        char c3;
        char c9;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        String str = null;
        C1168f p9 = p(xmlPullParser, null);
        long j = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j9 = -9223372036854775807L;
        long j10 = -9223372036854775807L;
        String[] strArr = null;
        String str2 = "";
        int i9 = 0;
        while (i9 < attributeCount) {
            long j11 = j;
            String attributeName = xmlPullParser.getAttributeName(i9);
            String attributeValue = xmlPullParser.getAttributeValue(i9);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c3 = 5;
                        break;
                    }
                    break;
            }
            c3 = 65535;
            switch (c3) {
                case 0:
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        break;
                    }
                case 1:
                    j10 = q(attributeValue, c1097c);
                    break;
                case 2:
                    j9 = q(attributeValue, c1097c);
                    break;
                case 3:
                    j4 = q(attributeValue, c1097c);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                        c9 = 65535;
                    } else {
                        int i10 = y.f20553a;
                        c9 = 65535;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length <= 0) {
                        break;
                    } else {
                        strArr = split;
                        break;
                    }
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
            }
            i9++;
            j = j11;
        }
        long j12 = j;
        if (c1166d != null) {
            long j13 = c1166d.f17377d;
            if (j13 != j12) {
                if (j4 != j12) {
                    j4 += j13;
                }
                if (j9 != j12) {
                    j9 += j13;
                }
            }
        }
        long j14 = j4;
        if (j9 == j12) {
            if (j10 != j12) {
                j9 = j14 + j10;
            } else if (c1166d != null) {
                long j15 = c1166d.f17378e;
                if (j15 != j12) {
                    j9 = j15;
                }
            }
        }
        return new C1166d(xmlPullParser.getName(), null, j14, j9, p9, strArr, str2, str, c1166d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0146, code lost:
    
        r0.f17409p = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x050e, code lost:
    
        r0.f17408o = r17;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x00eb. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f4.C1168f p(org.xmlpull.v1.XmlPullParser r21, f4.C1168f r22) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.C1165c.p(org.xmlpull.v1.XmlPullParser, f4.f):f4.f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long q(java.lang.String r13, d1.C1097c r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.C1165c.q(java.lang.String, d1.c):long");
    }

    public static Y r(XmlPullParser xmlPullParser) {
        String y9 = AbstractC1566a.y(xmlPullParser, "extent");
        if (y9 == null) {
            return null;
        }
        Matcher matcher = f17369s.matcher(y9);
        if (!matcher.matches()) {
            AbstractC1566a.P("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(y9));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new Y(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            AbstractC1566a.P("TtmlDecoder", "Ignoring malformed tts extent: ".concat(y9));
            return null;
        }
    }

    @Override // Y3.f
    public final g f(int i9, boolean z9, byte[] bArr) {
        try {
            XmlPullParser newPullParser = this.f17373m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C1167e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Y y9 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i9), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C1097c c1097c = f17371u;
            q qVar = f17372v;
            int i10 = 0;
            C1097c c1097c2 = c1097c;
            r rVar = null;
            q qVar2 = qVar;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C1166d c1166d = (C1166d) arrayDeque.peek();
                if (i10 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c1097c2 = m(newPullParser);
                            qVar2 = k(newPullParser, qVar);
                            y9 = r(newPullParser);
                        }
                        C1097c c1097c3 = c1097c2;
                        q qVar3 = qVar2;
                        if (!j(name)) {
                            AbstractC1566a.A("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                        } else {
                            if ("head".equals(name)) {
                                n(newPullParser, hashMap, qVar3, y9, hashMap2, hashMap3);
                            } else {
                                try {
                                    C1166d o9 = o(newPullParser, c1166d, hashMap2, c1097c3);
                                    arrayDeque.push(o9);
                                    if (c1166d != null) {
                                        if (c1166d.f17385m == null) {
                                            c1166d.f17385m = new ArrayList();
                                        }
                                        c1166d.f17385m.add(o9);
                                    }
                                } catch (i e8) {
                                    AbstractC1566a.Q("TtmlDecoder", "Suppressing parser error", e8);
                                }
                            }
                            qVar2 = qVar3;
                            c1097c2 = c1097c3;
                        }
                        i10++;
                        qVar2 = qVar3;
                        c1097c2 = c1097c3;
                    } else if (eventType == 4) {
                        c1166d.getClass();
                        C1166d a5 = C1166d.a(newPullParser.getText());
                        if (c1166d.f17385m == null) {
                            c1166d.f17385m = new ArrayList();
                        }
                        c1166d.f17385m.add(a5);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            C1166d c1166d2 = (C1166d) arrayDeque.peek();
                            c1166d2.getClass();
                            rVar = new r(c1166d2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i10++;
                } else if (eventType == 3) {
                    i10--;
                }
                newPullParser.next();
            }
            if (rVar != null) {
                return rVar;
            }
            throw new Exception("No TTML subtitles found");
        } catch (IOException e9) {
            throw new IllegalStateException("Unexpected error when reading input.", e9);
        } catch (XmlPullParserException e10) {
            throw new Exception("Unable to decode source", e10);
        }
    }
}
