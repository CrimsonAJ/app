package e4;

import A4.r;
import O0.c;
import Y3.b;
import Y3.f;
import Y3.g;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import co.notix.lsi.LsiInterval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l4.AbstractC1566a;

/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1143a extends f {

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f17195o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f17196p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m, reason: collision with root package name */
    public final StringBuilder f17197m = new StringBuilder();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f17198n = new ArrayList();

    public static long i(Matcher matcher, int i9) {
        long j;
        String group = matcher.group(i9 + 1);
        if (group != null) {
            j = Long.parseLong(group) * LsiInterval.LSI_FALLBACK_INTERVAL;
        } else {
            j = 0;
        }
        String group2 = matcher.group(i9 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j;
        String group3 = matcher.group(i9 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i9 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x019d. Please report as an issue. */
    @Override // Y3.f
    public final g f(int i9, boolean z9, byte[] bArr) {
        String j;
        String str;
        long[] jArr;
        r rVar;
        char c3;
        int i10;
        char c9;
        int i11;
        int i12;
        int i13;
        float f9;
        b bVar;
        C1143a c1143a = this;
        ArrayList arrayList = new ArrayList();
        long[] jArr2 = new long[32];
        r rVar2 = new r(i9, bArr);
        int i14 = 0;
        int i15 = 0;
        while (true) {
            String j4 = rVar2.j();
            if (j4 != null) {
                if (j4.length() != 0) {
                    try {
                        Integer.parseInt(j4);
                        j = rVar2.j();
                    } catch (NumberFormatException unused) {
                        AbstractC1566a.P("SubripDecoder", "Skipping invalid index: ".concat(j4));
                    }
                    if (j == null) {
                        AbstractC1566a.P("SubripDecoder", "Unexpected end");
                    } else {
                        Matcher matcher = f17195o.matcher(j);
                        if (matcher.matches()) {
                            long i16 = i(matcher, 1);
                            if (i15 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i15 * 2);
                            }
                            int i17 = i15 + 1;
                            jArr2[i15] = i16;
                            long i18 = i(matcher, 6);
                            if (i17 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i17 * 2);
                            }
                            i15 += 2;
                            jArr2[i17] = i18;
                            StringBuilder sb = c1143a.f17197m;
                            sb.setLength(i14);
                            ArrayList arrayList2 = c1143a.f17198n;
                            arrayList2.clear();
                            String j9 = rVar2.j();
                            while (!TextUtils.isEmpty(j9)) {
                                if (sb.length() > 0) {
                                    sb.append("<br>");
                                }
                                String trim = j9.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = f17196p.matcher(trim);
                                int i19 = i14;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i19;
                                    int length = group.length();
                                    sb2.replace(start, start + length, "");
                                    i19 += length;
                                }
                                sb.append(sb2.toString());
                                j9 = rVar2.j();
                                i14 = 0;
                            }
                            Spanned fromHtml = Html.fromHtml(sb.toString());
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList2.size()) {
                                    str = (String) arrayList2.get(i20);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i20++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            if (str == null) {
                                bVar = new b(fromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                jArr = jArr2;
                                rVar = rVar2;
                            } else {
                                jArr = jArr2;
                                rVar = rVar2;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c3 = 0;
                                            break;
                                        }
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c3 = 6;
                                            break;
                                        }
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c3 = 3;
                                            break;
                                        }
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c3 = 1;
                                            break;
                                        }
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c3 = 7;
                                            break;
                                        }
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c3 = 4;
                                            break;
                                        }
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c3 = 2;
                                            break;
                                        }
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c3 = '\b';
                                            break;
                                        }
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c3 = 5;
                                            break;
                                        }
                                        break;
                                }
                                c3 = 65535;
                                if (c3 != 0 && c3 != 1 && c3 != 2) {
                                    if (c3 != 3 && c3 != 4 && c3 != 5) {
                                        i10 = 1;
                                    } else {
                                        i10 = 2;
                                    }
                                } else {
                                    i10 = 0;
                                }
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c9 = 0;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c9 = 1;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c9 = 2;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c9 = 6;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c9 = 7;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c9 = '\b';
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c9 = 3;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c9 = 4;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c9 = 5;
                                            break;
                                        }
                                        c9 = 65535;
                                        break;
                                    default:
                                        c9 = 65535;
                                        break;
                                }
                                if (c9 != 0 && c9 != 1 && c9 != 2) {
                                    if (c9 != 3 && c9 != 4 && c9 != 5) {
                                        i11 = 1;
                                    } else {
                                        i11 = 0;
                                    }
                                } else {
                                    i11 = 2;
                                }
                                float f10 = 0.08f;
                                if (i10 != 0) {
                                    i12 = 1;
                                    if (i10 != 1) {
                                        i13 = 2;
                                        if (i10 == 2) {
                                            f9 = 0.92f;
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    } else {
                                        i13 = 2;
                                        f9 = 0.5f;
                                    }
                                } else {
                                    i12 = 1;
                                    i13 = 2;
                                    f9 = 0.08f;
                                }
                                if (i11 != 0) {
                                    if (i11 != i12) {
                                        if (i11 == i13) {
                                            f10 = 0.92f;
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    } else {
                                        f10 = 0.5f;
                                    }
                                }
                                bVar = new b(fromHtml, null, null, null, f10, 0, i11, f9, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                            }
                            arrayList.add(bVar);
                            arrayList.add(b.f8677r);
                            c1143a = this;
                            jArr2 = jArr;
                            rVar2 = rVar;
                            i14 = 0;
                        } else {
                            AbstractC1566a.P("SubripDecoder", "Skipping invalid timing: ".concat(j));
                            c1143a = this;
                            i14 = 0;
                        }
                    }
                }
            }
        }
        return new c((b[]) arrayList.toArray(new b[i14]), 21, Arrays.copyOf(jArr2, i15));
    }
}
