package U3;

import android.net.Uri;
import co.notix.R;
import j3.j0;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f7327a = Pattern.compile("([a-z])=\\s?(.+)");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f7328b = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f7329c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0050. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x00f9. Please report as an issue. */
    public static D a(String str) {
        char c3;
        char c9;
        boolean z9;
        C c10 = new C();
        String str2 = y.f7489h;
        if (!str.contains(str2)) {
            str2 = y.f7488g;
        }
        int i9 = l4.y.f20553a;
        char c11 = 65535;
        String[] split = str.split(str2, -1);
        int length = split.length;
        C0394a c0394a = null;
        int i10 = 0;
        while (true) {
            P5.C c12 = c10.f7306b;
            if (i10 < length) {
                String str3 = split[i10];
                String str4 = "";
                if ("".equals(str3)) {
                    c9 = c11;
                } else {
                    Matcher matcher = f7327a.matcher(str3);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        group.getClass();
                        String group2 = matcher.group(2);
                        group2.getClass();
                        switch (group.hashCode()) {
                            case 97:
                                if (group.equals("a")) {
                                    c3 = 11;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 98:
                                if (group.equals("b")) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 99:
                                if (group.equals("c")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 100:
                            case 102:
                            case 103:
                            case 104:
                            case 106:
                            case 108:
                            case 110:
                            case 113:
                            case 119:
                            case 120:
                            case 121:
                            default:
                                c3 = 65535;
                                break;
                            case 101:
                                if (group.equals("e")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 105:
                                if (group.equals("i")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 107:
                                if (group.equals("k")) {
                                    c3 = '\n';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 109:
                                if (group.equals("m")) {
                                    c3 = '\f';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 111:
                                if (group.equals("o")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 112:
                                if (group.equals("p")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 114:
                                if (group.equals("r")) {
                                    c3 = '\r';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 115:
                                if (group.equals("s")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 116:
                                if (group.equals("t")) {
                                    c3 = '\t';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 117:
                                if (group.equals("u")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 118:
                                if (group.equals("v")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 122:
                                if (group.equals("z")) {
                                    c3 = 14;
                                    break;
                                }
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                c9 = 65535;
                                if (!"0".equals(group2)) {
                                    throw j0.b("SDP version " + group2 + " is not supported.", null);
                                }
                                break;
                            case 1:
                                c9 = 65535;
                                c10.f7309e = group2;
                                break;
                            case 2:
                                c9 = 65535;
                                c10.f7308d = group2;
                                break;
                            case 3:
                                c9 = 65535;
                                if (c0394a == null) {
                                    c10.j = group2;
                                    break;
                                } else {
                                    c0394a.f7341f = group2;
                                    break;
                                }
                            case 4:
                                c9 = 65535;
                                c10.f7311g = Uri.parse(group2);
                                break;
                            case 5:
                                c9 = 65535;
                                c10.f7314k = group2;
                                break;
                            case 6:
                                c9 = 65535;
                                c10.f7315l = group2;
                                break;
                            case 7:
                                c9 = 65535;
                                if (c0394a == null) {
                                    c10.f7312h = group2;
                                    break;
                                } else {
                                    c0394a.f7342g = group2;
                                    break;
                                }
                            case '\b':
                                c9 = 65535;
                                String[] split2 = group2.split(":\\s?", -1);
                                if (split2.length == 2) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                AbstractC1566a.h(z9);
                                int parseInt = Integer.parseInt(split2[1]);
                                if (c0394a == null) {
                                    c10.f7307c = parseInt * 1000;
                                    break;
                                } else {
                                    c0394a.f7338c = parseInt * 1000;
                                    break;
                                }
                            case '\t':
                                c10.f7310f = group2;
                                c9 = 65535;
                                break;
                            case R.styleable.GradientColor_android_endX /* 10 */:
                                if (c0394a == null) {
                                    c10.f7313i = group2;
                                } else {
                                    c0394a.f7343h = group2;
                                }
                                c9 = 65535;
                                break;
                            case R.styleable.GradientColor_android_endY /* 11 */:
                                Matcher matcher2 = f7328b.matcher(group2);
                                if (matcher2.matches()) {
                                    String group3 = matcher2.group(1);
                                    group3.getClass();
                                    String group4 = matcher2.group(2);
                                    int i11 = O5.i.f5495a;
                                    if (group4 != null) {
                                        str4 = group4;
                                    }
                                    if (c0394a == null) {
                                        c10.f7305a.put(group3, str4);
                                    } else {
                                        ((HashMap) c0394a.f7344i).put(group3, str4);
                                    }
                                    c9 = 65535;
                                    break;
                                } else {
                                    throw j0.b("Malformed Attribute line: " + str3, null);
                                }
                            case '\f':
                                if (c0394a != null) {
                                    try {
                                        c12.a(c0394a.a());
                                    } catch (IllegalArgumentException | IllegalStateException e8) {
                                        throw j0.b(null, e8);
                                    }
                                }
                                Matcher matcher3 = f7329c.matcher(group2);
                                if (matcher3.matches()) {
                                    String group5 = matcher3.group(1);
                                    group5.getClass();
                                    String group6 = matcher3.group(2);
                                    group6.getClass();
                                    String group7 = matcher3.group(3);
                                    group7.getClass();
                                    String group8 = matcher3.group(4);
                                    group8.getClass();
                                    try {
                                        c0394a = new C0394a(group5, Integer.parseInt(group6), Integer.parseInt(group8), group7);
                                        c9 = 65535;
                                        break;
                                    } catch (NumberFormatException e9) {
                                        throw j0.b("Malformed SDP media description line: ".concat(group2), e9);
                                    }
                                } else {
                                    throw j0.b("Malformed SDP media description line: ".concat(group2), null);
                                }
                            default:
                                c9 = 65535;
                                break;
                        }
                    } else {
                        throw j0.b("Malformed SDP line: " + str3, null);
                    }
                }
                i10++;
                c11 = c9;
            } else {
                if (c0394a != null) {
                    try {
                        c12.a(c0394a.a());
                    } catch (IllegalArgumentException | IllegalStateException e10) {
                        throw j0.b(null, e10);
                    }
                }
                try {
                    return new D(c10);
                } catch (IllegalArgumentException | IllegalStateException e11) {
                    throw j0.b(null, e11);
                }
            }
        }
    }
}
