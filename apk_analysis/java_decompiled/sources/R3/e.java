package R3;

import B6.u0;
import P5.AbstractC0349q;
import android.net.Uri;
import android.text.TextUtils;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.j0;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.C1515o;
import k4.O;
import l4.AbstractC1566a;
import l4.y;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class e extends DefaultHandler implements O {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f6603b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f6604c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f6605d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f6606e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f6607a;

    public e() {
        try {
            this.f6607a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e8) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e8);
        }
    }

    public static long a(ArrayList arrayList, long j, long j4, int i9, long j9) {
        int i10;
        if (i9 >= 0) {
            i10 = i9 + 1;
        } else {
            int i11 = y.f20553a;
            i10 = (int) ((((j9 - j) + j4) - 1) / j4);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList.add(new q(j, j4));
            j += j4;
        }
        return j;
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i9 = 1;
            while (i9 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i9++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i9--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0081, code lost:
    
        if (r0 == 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        if (r6.equals("fa01") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0105, code lost:
    
        if (r0 < 33) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.e.c(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return Float.parseFloat(attributeValue) * 1000000.0f;
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z9) {
        int i9;
        int i10;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i9 = Integer.parseInt(attributeValue);
        } else if (z9) {
            i9 = 1;
        } else {
            i9 = Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        if (attributeValue2 != null) {
            i10 = Integer.parseInt(attributeValue2);
        } else {
            i10 = 1;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC1566a.D(xmlPullParser, "BaseURL"));
        if (str2 != null && AbstractC1566a.z(str2)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str2;
            }
            return AbstractC0349q.n(new b(str2, i9, i10, attributeValue3));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            b bVar = (b) arrayList.get(i11);
            String L8 = AbstractC1566a.L(bVar.f6581a, str2);
            if (attributeValue3 == null) {
                str = L8;
            } else {
                str = attributeValue3;
            }
            if (z9) {
                i9 = bVar.f6583c;
                i10 = bVar.f6584d;
                str = bVar.f6582b;
            }
            arrayList2.add(new b(L8, i9, i10, str));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r14) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.e.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (!TextUtils.isEmpty(attributeValue)) {
            if ("audio".equals(attributeValue)) {
                return 1;
            }
            if ("video".equals(attributeValue)) {
                return 2;
            }
            if ("text".equals(attributeValue)) {
                return 3;
            }
            return -1;
        }
        return -1;
    }

    public static f h(XmlPullParser xmlPullParser, String str) {
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        if (attributeValue3 != null) {
            str2 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!AbstractC1566a.D(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j) {
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = y.f20560h.matcher(attributeValue);
        if (matcher.matches()) {
            boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
            String group = matcher.group(3);
            double d14 = 0.0d;
            if (group != null) {
                d9 = Double.parseDouble(group) * 3.1556908E7d;
            } else {
                d9 = 0.0d;
            }
            String group2 = matcher.group(5);
            if (group2 != null) {
                d10 = Double.parseDouble(group2) * 2629739.0d;
            } else {
                d10 = 0.0d;
            }
            double d15 = d9 + d10;
            String group3 = matcher.group(7);
            if (group3 != null) {
                d11 = Double.parseDouble(group3) * 86400.0d;
            } else {
                d11 = 0.0d;
            }
            double d16 = d15 + d11;
            String group4 = matcher.group(10);
            if (group4 != null) {
                d12 = Double.parseDouble(group4) * 3600.0d;
            } else {
                d12 = 0.0d;
            }
            double d17 = d16 + d12;
            String group5 = matcher.group(12);
            if (group5 != null) {
                d13 = Double.parseDouble(group5) * 60.0d;
            } else {
                d13 = 0.0d;
            }
            double d18 = d17 + d13;
            String group6 = matcher.group(14);
            if (group6 != null) {
                d14 = Double.parseDouble(group6);
            }
            long j4 = (long) ((d18 + d14) * 1000.0d);
            if (!isEmpty) {
                return -j4;
            }
            return j4;
        }
        return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
    }

    public static float j(XmlPullParser xmlPullParser, float f9) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f6603b.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                if (!TextUtils.isEmpty(matcher.group(2))) {
                    return parseInt / Integer.parseInt(r2);
                }
                return parseInt;
            }
        }
        return f9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x08e3, code lost:
    
        r3 = "audio/eac3-joc";
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x08f1, code lost:
    
        if ("audio/eac3-joc".equals(r3) != false) goto L326;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:642:0x0f89. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0e5e A[LOOP:5: B:182:0x0403->B:191:0x0e5e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0cf9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0b7b A[LOOP:11: B:338:0x0666->B:346:0x0b7b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x085a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x126e A[LOOP:1: B:34:0x00d5->B:42:0x126e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x1238 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0b0f  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0b4c  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x08f7  */
    /* JADX WARN: Type inference failed for: r1v174, types: [R3.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static R3.c l(org.xmlpull.v1.XmlPullParser r151, android.net.Uri r152) {
        /*
            Method dump skipped, instructions count: 4790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.e.l(org.xmlpull.v1.XmlPullParser, android.net.Uri):R3.c");
    }

    public static j m(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j4;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j4 = (Long.parseLong(split[1]) - j) + 1;
                return new j(j, attributeValue, j4);
            }
        } else {
            j = 0;
        }
        j4 = -1;
        return new j(j, attributeValue, j4);
    }

    public static int n(String str) {
        if (str != null) {
            char c3 = 65535;
            switch (str.hashCode()) {
                case -2060497896:
                    if (str.equals("subtitle")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1724546052:
                    if (str.equals("description")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case -1580883024:
                    if (str.equals("enhanced-audio-intelligibility")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case -1574842690:
                    if (str.equals("forced_subtitle")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case -1408024454:
                    if (str.equals("alternate")) {
                        c3 = 4;
                        break;
                    }
                    break;
                case -1396432756:
                    if (str.equals("forced-subtitle")) {
                        c3 = 5;
                        break;
                    }
                    break;
                case 99825:
                    if (str.equals("dub")) {
                        c3 = 6;
                        break;
                    }
                    break;
                case 3343801:
                    if (str.equals("main")) {
                        c3 = 7;
                        break;
                    }
                    break;
                case 3530173:
                    if (str.equals("sign")) {
                        c3 = '\b';
                        break;
                    }
                    break;
                case 552573414:
                    if (str.equals("caption")) {
                        c3 = '\t';
                        break;
                    }
                    break;
                case 899152809:
                    if (str.equals("commentary")) {
                        c3 = '\n';
                        break;
                    }
                    break;
                case 1629013393:
                    if (str.equals("emergency")) {
                        c3 = 11;
                        break;
                    }
                    break;
                case 1855372047:
                    if (str.equals("supplementary")) {
                        c3 = '\f';
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                case 3:
                case 5:
                    return 128;
                case 1:
                    return 512;
                case 2:
                    return 2048;
                case 4:
                    return 2;
                case 6:
                    return 16;
                case 7:
                    return 1;
                case '\b':
                    return 256;
                case '\t':
                    return 64;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    return 8;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    return 32;
                case '\f':
                    return 4;
            }
        }
        return 0;
    }

    public static int o(ArrayList arrayList) {
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (u0.w("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i10)).f6608a)) {
                i9 = 16384;
            }
        }
        return i9;
    }

    public static r p(XmlPullParser xmlPullParser, r rVar) {
        long j;
        long j4;
        long j9;
        if (rVar != null) {
            j = rVar.f6649b;
        } else {
            j = 1;
        }
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j = Long.parseLong(attributeValue);
        }
        long j10 = j;
        long j11 = 0;
        if (rVar != null) {
            j4 = rVar.f6650c;
        } else {
            j4 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j4 = Long.parseLong(attributeValue2);
        }
        long j12 = j4;
        if (rVar != null) {
            j9 = rVar.f6646d;
        } else {
            j9 = 0;
        }
        if (rVar != null) {
            j11 = rVar.f6647e;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] split = attributeValue3.split("-");
            j9 = Long.parseLong(split[0]);
            j11 = (Long.parseLong(split[1]) - j9) + 1;
        }
        long j13 = j11;
        long j14 = j9;
        if (rVar != null) {
            jVar = rVar.f6648a;
        }
        while (true) {
            xmlPullParser.next();
            if (AbstractC1566a.E(xmlPullParser, "Initialization")) {
                jVar = m(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar2 = jVar;
            if (AbstractC1566a.D(xmlPullParser, "SegmentBase")) {
                return new r(jVar2, j10, j12, j14, j13);
            }
            jVar = jVar2;
        }
    }

    public static o q(XmlPullParser xmlPullParser, o oVar, long j, long j4, long j9, long j10, long j11) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17 = 1;
        if (oVar != null) {
            j12 = oVar.f6649b;
        } else {
            j12 = 1;
        }
        List list = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j12 = Long.parseLong(attributeValue);
        }
        long j18 = j12;
        if (oVar != null) {
            j13 = oVar.f6650c;
        } else {
            j13 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j13 = Long.parseLong(attributeValue2);
        }
        long j19 = j13;
        if (oVar != null) {
            j14 = oVar.f6637e;
        } else {
            j14 = -9223372036854775807L;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j14 = Long.parseLong(attributeValue3);
        }
        long j20 = j14;
        if (oVar != null) {
            j17 = oVar.f6636d;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j17 = Long.parseLong(attributeValue4);
        }
        long j21 = j17;
        if (j10 == -9223372036854775807L) {
            j15 = j9;
        } else {
            j15 = j10;
        }
        if (j15 == Long.MAX_VALUE) {
            j16 = -9223372036854775807L;
        } else {
            j16 = j15;
        }
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (AbstractC1566a.E(xmlPullParser, "Initialization")) {
                jVar = m(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC1566a.E(xmlPullParser, "SegmentTimeline")) {
                list2 = s(xmlPullParser, j18, j4);
            } else if (AbstractC1566a.E(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(m(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC1566a.D(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = oVar.f6648a;
            }
            if (list2 == null) {
                list2 = oVar.f6638f;
            }
            if (list == null) {
                list = oVar.j;
            }
        }
        return new o(jVar, j18, j19, j21, j20, list2, j16, list, y.H(j11), y.H(j));
    }

    public static p r(XmlPullParser xmlPullParser, p pVar, List list, long j, long j4, long j9, long j10, long j11) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        A4.q qVar;
        A4.q qVar2;
        long j18 = 1;
        if (pVar != null) {
            j12 = pVar.f6649b;
        } else {
            j12 = 1;
        }
        j jVar = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j12 = Long.parseLong(attributeValue);
        }
        long j19 = j12;
        if (pVar != null) {
            j13 = pVar.f6650c;
        } else {
            j13 = 0;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j13 = Long.parseLong(attributeValue2);
        }
        long j20 = j13;
        if (pVar != null) {
            j14 = pVar.f6637e;
        } else {
            j14 = -9223372036854775807L;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j14 = Long.parseLong(attributeValue3);
        }
        long j21 = j14;
        if (pVar != null) {
            j18 = pVar.f6636d;
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j18 = Long.parseLong(attributeValue4);
        }
        long j22 = j18;
        int i9 = 0;
        while (true) {
            if (i9 < list.size()) {
                f fVar = (f) list.get(i9);
                if (u0.w("http://dashif.org/guidelines/last-segment-number", fVar.f6608a)) {
                    j15 = Long.parseLong(fVar.f6609b);
                    break;
                }
                i9++;
            } else {
                j15 = -1;
                break;
            }
        }
        long j23 = j15;
        if (j10 == -9223372036854775807L) {
            j16 = j9;
        } else {
            j16 = j10;
        }
        if (j16 == Long.MAX_VALUE) {
            j17 = -9223372036854775807L;
        } else {
            j17 = j16;
        }
        if (pVar != null) {
            qVar = pVar.f6642k;
        } else {
            qVar = null;
        }
        A4.q t7 = t(xmlPullParser, "media", qVar);
        if (pVar != null) {
            qVar2 = pVar.j;
        } else {
            qVar2 = null;
        }
        A4.q t9 = t(xmlPullParser, "initialization", qVar2);
        List list2 = null;
        do {
            xmlPullParser.next();
            if (AbstractC1566a.E(xmlPullParser, "Initialization")) {
                jVar = m(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC1566a.E(xmlPullParser, "SegmentTimeline")) {
                list2 = s(xmlPullParser, j19, j4);
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC1566a.D(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = pVar.f6648a;
            }
            if (list2 == null) {
                list2 = pVar.f6638f;
            }
        }
        return new p(jVar, j19, j20, j22, j23, j21, list2, j17, t9, t7, y.H(j11), y.H(j));
    }

    public static ArrayList s(XmlPullParser xmlPullParser, long j, long j4) {
        long parseLong;
        long j9;
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        long j11 = -9223372036854775807L;
        boolean z9 = false;
        int i9 = 0;
        do {
            xmlPullParser.next();
            if (AbstractC1566a.E(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                if (attributeValue == null) {
                    parseLong = -9223372036854775807L;
                } else {
                    parseLong = Long.parseLong(attributeValue);
                }
                if (z9) {
                    int i10 = i9;
                    j9 = parseLong;
                    j10 = a(arrayList, j10, j11, i10, j9);
                } else {
                    j9 = parseLong;
                }
                if (j9 != -9223372036854775807L) {
                    j10 = j9;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                if (attributeValue2 == null) {
                    j11 = -9223372036854775807L;
                } else {
                    j11 = Long.parseLong(attributeValue2);
                }
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "r");
                if (attributeValue3 == null) {
                    i9 = 0;
                } else {
                    i9 = Integer.parseInt(attributeValue3);
                }
                z9 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC1566a.D(xmlPullParser, "SegmentTimeline"));
        if (z9) {
            a(arrayList, j10, j11, i9, y.O(j4, j, 1000L));
            return arrayList;
        }
        return arrayList;
    }

    public static A4.q t(XmlPullParser xmlPullParser, String str, A4.q qVar) {
        String str2;
        char c3;
        int i9 = -1;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            String[] strArr = new String[5];
            int[] iArr = new int[4];
            String[] strArr2 = new String[4];
            strArr[0] = "";
            int i10 = 0;
            int i11 = 0;
            while (i10 < attributeValue.length()) {
                int indexOf = attributeValue.indexOf("$", i10);
                if (indexOf == i9) {
                    strArr[i11] = strArr[i11] + attributeValue.substring(i10);
                    i10 = attributeValue.length();
                } else if (indexOf != i10) {
                    strArr[i11] = strArr[i11] + attributeValue.substring(i10, indexOf);
                    i10 = indexOf;
                } else if (attributeValue.startsWith("$$", i10)) {
                    strArr[i11] = AbstractC0953k1.q(new StringBuilder(), strArr[i11], "$");
                    i10 += 2;
                } else {
                    int i12 = i10 + 1;
                    int indexOf2 = attributeValue.indexOf("$", i12);
                    String substring = attributeValue.substring(i12, indexOf2);
                    if (substring.equals("RepresentationID")) {
                        iArr[i11] = 1;
                    } else {
                        int indexOf3 = substring.indexOf("%0");
                        if (indexOf3 != i9) {
                            str2 = substring.substring(indexOf3);
                            if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                                str2 = str2.concat("d");
                            }
                            substring = substring.substring(0, indexOf3);
                        } else {
                            str2 = "%01d";
                        }
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1950496919:
                                if (substring.equals("Number")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case 2606829:
                                if (substring.equals("Time")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case 38199441:
                                if (substring.equals("Bandwidth")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                        }
                        c3 = 65535;
                        switch (c3) {
                            case 0:
                                iArr[i11] = 2;
                                break;
                            case 1:
                                iArr[i11] = 4;
                                break;
                            case 2:
                                iArr[i11] = 3;
                                break;
                            default:
                                throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                        }
                        strArr2[i11] = str2;
                    }
                    i11++;
                    strArr[i11] = "";
                    i10 = indexOf2 + 1;
                }
                i9 = -1;
            }
            return new A4.q(strArr, iArr, strArr2, i11);
        }
        return qVar;
    }

    @Override // k4.O
    public final Object k(Uri uri, C1515o c1515o) {
        try {
            XmlPullParser newPullParser = this.f6607a.newPullParser();
            newPullParser.setInput(c1515o, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return l(newPullParser, uri);
            }
            throw j0.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e8) {
            throw j0.b(null, e8);
        }
    }
}
