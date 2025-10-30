package h4;

import A4.r;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import c4.C0775c;
import com.google.android.gms.internal.measurement.D1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f17920a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f17921b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c, reason: collision with root package name */
    public static final Map f17922c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f17923d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f17922c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f17923d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c3;
        boolean z9;
        boolean z10;
        ?? r42;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = eVar.f17905b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.f17904a;
        str2.getClass();
        int i14 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i13, length, 33);
                break;
            case 2:
                for (String str3 : eVar.f17907d) {
                    Map map = f17922c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i13, length, 33);
                    } else {
                        Map map2 = f17923d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i13, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i13, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
                break;
            case 7:
                int c9 = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C1280d.f17901c);
                int i15 = eVar.f17905b;
                int i16 = 0;
                int i17 = 0;
                while (i16 < arrayList.size()) {
                    if ("rt".equals(((C1280d) arrayList.get(i16)).f17902a.f17904a)) {
                        C1280d c1280d = (C1280d) arrayList.get(i16);
                        int c10 = c(list2, str, c1280d.f17902a);
                        if (c10 == i14) {
                            if (c9 != i14) {
                                c10 = c9;
                            } else {
                                c10 = 1;
                            }
                        }
                        int i18 = c1280d.f17902a.f17905b - i17;
                        int i19 = c1280d.f17903b - i17;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i18, i19);
                        spannableStringBuilder.delete(i18, i19);
                        spannableStringBuilder.setSpan(new C0775c(subSequence.toString(), c10), i15, i18, 33);
                        i17 = subSequence.length() + i17;
                        i15 = i18;
                    }
                    i16++;
                    i14 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b9 = b(list2, str, eVar);
        for (int i20 = 0; i20 < b9.size(); i20++) {
            C1278b c1278b = ((f) b9.get(i20)).f17909b;
            int i21 = c1278b.f17892l;
            if (i21 == -1 && c1278b.f17893m == -1) {
                r42 = -1;
            } else {
                if (i21 == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (c1278b.f17893m == 1) {
                    z10 = 2;
                } else {
                    z10 = false;
                }
                r42 = z10 | z9;
            }
            if (r42 != -1) {
                int i22 = c1278b.f17892l;
                if (i22 == -1 && c1278b.f17893m == -1) {
                    i12 = -1;
                    i9 = 1;
                } else {
                    i9 = 1;
                    if (i22 == 1) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if (c1278b.f17893m == 1) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    i12 = i10 | i11;
                }
                D1.d(spannableStringBuilder, new StyleSpan(i12), i13, length);
            } else {
                i9 = 1;
            }
            if (c1278b.j == i9) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i13, length, 33);
            }
            if (c1278b.f17891k == i9) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
            }
            if (c1278b.f17888g) {
                if (c1278b.f17888g) {
                    D1.d(spannableStringBuilder, new ForegroundColorSpan(c1278b.f17887f), i13, length);
                } else {
                    throw new IllegalStateException("Font color not defined");
                }
            }
            if (c1278b.f17890i) {
                if (c1278b.f17890i) {
                    D1.d(spannableStringBuilder, new BackgroundColorSpan(c1278b.f17889h), i13, length);
                } else {
                    throw new IllegalStateException("Background color not defined.");
                }
            }
            if (c1278b.f17886e != null) {
                D1.d(spannableStringBuilder, new TypefaceSpan(c1278b.f17886e), i13, length);
            }
            int i23 = c1278b.f17894n;
            if (i23 != 1) {
                if (i23 != 2) {
                    if (i23 == 3) {
                        D1.d(spannableStringBuilder, new RelativeSizeSpan(c1278b.f17895o / 100.0f), i13, length);
                    }
                } else {
                    D1.d(spannableStringBuilder, new RelativeSizeSpan(c1278b.f17895o), i13, length);
                }
            } else {
                D1.d(spannableStringBuilder, new AbsoluteSizeSpan((int) c1278b.f17895o, true), i13, length);
            }
            if (c1278b.f17897q) {
                spannableStringBuilder.setSpan(new Object(), i13, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, e eVar) {
        int i9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C1278b c1278b = (C1278b) list.get(i10);
            String str2 = eVar.f17904a;
            if (c1278b.f17882a.isEmpty() && c1278b.f17883b.isEmpty() && c1278b.f17884c.isEmpty() && c1278b.f17885d.isEmpty()) {
                i9 = TextUtils.isEmpty(str2);
            } else {
                int a5 = C1278b.a(c1278b.f17885d, C1278b.a(c1278b.f17883b, C1278b.a(c1278b.f17882a, 0, 1073741824, str), 2, str2), 4, eVar.f17906c);
                if (a5 != -1) {
                    if (eVar.f17907d.containsAll(c1278b.f17884c)) {
                        i9 = a5 + (c1278b.f17884c.size() * 4);
                    }
                }
                i9 = 0;
            }
            if (i9 > 0) {
                arrayList.add(new f(i9, c1278b));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList b9 = b(list, str, eVar);
        for (int i9 = 0; i9 < b9.size(); i9++) {
            int i10 = ((f) b9.get(i9)).f17909b.f17896p;
            if (i10 != -1) {
                return i10;
            }
        }
        return -1;
    }

    public static C1279c d(r rVar, ArrayList arrayList) {
        String j = rVar.j();
        if (j != null) {
            Pattern pattern = f17920a;
            Matcher matcher = pattern.matcher(j);
            if (matcher.matches()) {
                return e(null, matcher, rVar, arrayList);
            }
            String j4 = rVar.j();
            if (j4 != null) {
                Matcher matcher2 = pattern.matcher(j4);
                if (matcher2.matches()) {
                    return e(j.trim(), matcher2, rVar, arrayList);
                }
            }
        }
        return null;
    }

    public static C1279c e(String str, Matcher matcher, r rVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String group = matcher.group(1);
            group.getClass();
            gVar.f17910a = i.b(group);
            String group2 = matcher.group(2);
            group2.getClass();
            gVar.f17911b = i.b(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            f(group3, gVar);
            StringBuilder sb = new StringBuilder();
            String j = rVar.j();
            while (!TextUtils.isEmpty(j)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(j.trim());
                j = rVar.j();
            }
            gVar.f17912c = g(str, sb.toString(), arrayList);
            return new C1279c(gVar.a().a(), gVar.f17910a, gVar.f17911b);
        } catch (NumberFormatException unused) {
            AbstractC1566a.P("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static void f(String str, g gVar) {
        char c3;
        int i9;
        char c9;
        int i10;
        int i11;
        Matcher matcher = f17921b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    h(group2, gVar);
                } else if ("align".equals(group)) {
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals("end")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c3 = 4;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals("start")) {
                                c3 = 5;
                                break;
                            }
                            break;
                    }
                    c3 = 65535;
                    switch (c3) {
                        case 0:
                        case 1:
                            break;
                        case 2:
                            i9 = 3;
                            break;
                        case 3:
                            i9 = 4;
                            break;
                        case 4:
                            i9 = 5;
                            break;
                        case 5:
                            i9 = 1;
                            break;
                        default:
                            AbstractC1566a.P("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                            break;
                    }
                    i9 = 2;
                    gVar.f17913d = i9;
                } else if ("position".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        String substring = group2.substring(indexOf + 1);
                        substring.getClass();
                        switch (substring.hashCode()) {
                            case -1842484672:
                                if (substring.equals("line-left")) {
                                    c9 = 0;
                                    break;
                                }
                                break;
                            case -1364013995:
                                if (substring.equals("center")) {
                                    c9 = 1;
                                    break;
                                }
                                break;
                            case -1276788989:
                                if (substring.equals("line-right")) {
                                    c9 = 2;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (substring.equals("middle")) {
                                    c9 = 3;
                                    break;
                                }
                                break;
                            case 100571:
                                if (substring.equals("end")) {
                                    c9 = 4;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (substring.equals("start")) {
                                    c9 = 5;
                                    break;
                                }
                                break;
                        }
                        c9 = 65535;
                        switch (c9) {
                            case 0:
                            case 5:
                                i10 = 0;
                                break;
                            case 1:
                            case 3:
                                i10 = 1;
                                break;
                            case 2:
                            case 4:
                                i10 = 2;
                                break;
                            default:
                                AbstractC1566a.P("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                i10 = Integer.MIN_VALUE;
                                break;
                        }
                        gVar.f17918i = i10;
                        group2 = group2.substring(0, indexOf);
                    }
                    gVar.f17917h = i.a(group2);
                } else if ("size".equals(group)) {
                    gVar.j = i.a(group2);
                } else if ("vertical".equals(group)) {
                    if (!group2.equals("lr")) {
                        if (!group2.equals("rl")) {
                            AbstractC1566a.P("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i11 = Integer.MIN_VALUE;
                        } else {
                            i11 = 1;
                        }
                    } else {
                        i11 = 2;
                    }
                    gVar.f17919k = i11;
                } else {
                    AbstractC1566a.P("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                AbstractC1566a.P("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0105. Please report as an issue. */
    public static SpannedString g(String str, String str2, List list) {
        char c3;
        boolean z9;
        boolean z10;
        int i9;
        int i10;
        char c9;
        int i11 = 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (true) {
            String str3 = "";
            if (i12 < str2.length()) {
                char charAt = str2.charAt(i12);
                if (charAt != '&') {
                    if (charAt != '<') {
                        spannableStringBuilder.append(charAt);
                        i12++;
                    } else {
                        int i13 = i12 + 1;
                        if (i13 < str2.length()) {
                            if (str2.charAt(i13) == '/') {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            int indexOf = str2.indexOf(62, i13);
                            if (indexOf == -1) {
                                i13 = str2.length();
                            } else {
                                i13 = indexOf + 1;
                            }
                            int i14 = i13 - 2;
                            if (str2.charAt(i14) == '/') {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z9) {
                                i9 = i11;
                            } else {
                                i9 = 1;
                            }
                            int i15 = i12 + i9;
                            if (!z10) {
                                i14 = i13 - 1;
                            }
                            String substring = str2.substring(i15, i14);
                            if (!substring.trim().isEmpty()) {
                                String trim = substring.trim();
                                AbstractC1566a.h(!trim.isEmpty());
                                int i16 = y.f20553a;
                                String str4 = trim.split("[ \\.]", i11)[0];
                                str4.getClass();
                                switch (str4.hashCode()) {
                                    case 98:
                                        if (str4.equals("b")) {
                                            i10 = 0;
                                            break;
                                        }
                                        break;
                                    case 99:
                                        if (str4.equals("c")) {
                                            i10 = 1;
                                            break;
                                        }
                                        break;
                                    case 105:
                                        if (str4.equals("i")) {
                                            i10 = i11;
                                            break;
                                        }
                                        break;
                                    case 117:
                                        if (str4.equals("u")) {
                                            i10 = 3;
                                            break;
                                        }
                                        break;
                                    case 118:
                                        if (str4.equals("v")) {
                                            i10 = 4;
                                            break;
                                        }
                                        break;
                                    case 3650:
                                        if (str4.equals("rt")) {
                                            i10 = 5;
                                            break;
                                        }
                                        break;
                                    case 3314158:
                                        if (str4.equals("lang")) {
                                            i10 = 6;
                                            break;
                                        }
                                        break;
                                    case 3511770:
                                        if (str4.equals("ruby")) {
                                            i10 = 7;
                                            break;
                                        }
                                        break;
                                }
                                i10 = -1;
                                switch (i10) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        if (!z9) {
                                            if (!z10) {
                                                int length = spannableStringBuilder.length();
                                                String trim2 = substring.trim();
                                                AbstractC1566a.h(!trim2.isEmpty());
                                                int indexOf2 = trim2.indexOf(" ");
                                                if (indexOf2 == -1) {
                                                    c9 = 0;
                                                } else {
                                                    str3 = trim2.substring(indexOf2).trim();
                                                    c9 = 0;
                                                    trim2 = trim2.substring(0, indexOf2);
                                                }
                                                String[] split = trim2.split("\\.", -1);
                                                String str5 = split[c9];
                                                HashSet hashSet = new HashSet();
                                                for (int i17 = 1; i17 < split.length; i17++) {
                                                    hashSet.add(split[i17]);
                                                }
                                                arrayDeque.push(new e(str5, length, str3, hashSet));
                                                break;
                                            }
                                        }
                                        while (!arrayDeque.isEmpty()) {
                                            e eVar = (e) arrayDeque.pop();
                                            a(str, eVar, arrayList, spannableStringBuilder, list);
                                            if (!arrayDeque.isEmpty()) {
                                                arrayList.add(new C1280d(eVar, spannableStringBuilder.length()));
                                            } else {
                                                arrayList.clear();
                                            }
                                            if (eVar.f17904a.equals(str4)) {
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                            i12 = i13;
                        }
                        i12 = i13;
                    }
                } else {
                    i12++;
                    int indexOf3 = str2.indexOf(59, i12);
                    int indexOf4 = str2.indexOf(32, i12);
                    if (indexOf3 == -1) {
                        indexOf3 = indexOf4;
                    } else if (indexOf4 != -1) {
                        indexOf3 = Math.min(indexOf3, indexOf4);
                    }
                    if (indexOf3 != -1) {
                        String substring2 = str2.substring(i12, indexOf3);
                        substring2.getClass();
                        switch (substring2.hashCode()) {
                            case 3309:
                                if (substring2.equals("gt")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case 3464:
                                if (substring2.equals("lt")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case 96708:
                                if (substring2.equals("amp")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case 3374865:
                                if (substring2.equals("nbsp")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                        }
                        c3 = 65535;
                        switch (c3) {
                            case 0:
                                spannableStringBuilder.append('>');
                                break;
                            case 1:
                                spannableStringBuilder.append('<');
                                break;
                            case 2:
                                spannableStringBuilder.append('&');
                                break;
                            case 3:
                                spannableStringBuilder.append(' ');
                                break;
                            default:
                                AbstractC1566a.P("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
                                break;
                        }
                        if (indexOf3 == indexOf4) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        i12 = indexOf3 + 1;
                    } else {
                        spannableStringBuilder.append(charAt);
                    }
                }
                i11 = 2;
            } else {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    public static void h(String str, g gVar) {
        int i9 = 2;
        int indexOf = str.indexOf(44);
        char c3 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c3 = 3;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                case 1:
                    i9 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i9 = 0;
                    break;
                default:
                    AbstractC1566a.P("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i9 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f17916g = i9;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            gVar.f17914e = i.a(str);
            gVar.f17915f = 0;
        } else {
            gVar.f17914e = Integer.parseInt(str);
            gVar.f17915f = 1;
        }
    }
}
