package com.google.android.gms.internal.measurement;

import co.notix.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981q implements Iterable, InterfaceC0966n {

    /* renamed from: a, reason: collision with root package name */
    public final String f15572a;

    public C0981q(String str) {
        if (str != null) {
            this.f15572a = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Double b() {
        String str = this.f15572a;
        if (!str.isEmpty()) {
            try {
                return Double.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(Double.NaN);
            }
        }
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final String c() {
        return this.f15572a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Iterator e() {
        return new C0976p(0, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0981q)) {
            return false;
        }
        return this.f15572a.equals(((C0981q) obj).f15572a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n f() {
        return new C0981q(this.f15572a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n g(String str, com.google.firebase.messaging.s sVar, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        String str5;
        char c3;
        int i9;
        int i10;
        double doubleValue;
        double doubleValue2;
        double Q7;
        String c9;
        int i11;
        double d9;
        double min;
        double length;
        double min2;
        long j;
        int i12;
        int i13;
        com.google.firebase.messaging.s sVar2;
        int i14;
        int length2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(str.concat(" is not a String function"));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                if (str.equals(str4)) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -1776922004:
                str5 = "charAt";
                if (str.equals("toString")) {
                    c3 = 14;
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c3 = 65535;
                break;
            case -1464939364:
                str5 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c3 = '\f';
                    str4 = str2;
                    break;
                }
                str4 = str2;
                c3 = 65535;
                break;
            case -1361633751:
                str5 = "charAt";
                if (str.equals(str5)) {
                    str4 = str2;
                    c3 = 0;
                    break;
                }
                str4 = str2;
                c3 = 65535;
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    str4 = str2;
                    str5 = "charAt";
                    c3 = 1;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c3 = '\r';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case -906336856:
                if (str.equals("search")) {
                    c3 = 7;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c3 = 11;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c3 = 4;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c3 = 15;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case 3568674:
                if (str.equals(str3)) {
                    c3 = 16;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case 103668165:
                if (str.equals("match")) {
                    c3 = 5;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c3 = '\b';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case 109648666:
                if (str.equals("split")) {
                    c3 = '\t';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case 530542161:
                if (str.equals("substring")) {
                    c3 = '\n';
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    c3 = 6;
                    str4 = str2;
                    str5 = "charAt";
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    str4 = str2;
                    str5 = "charAt";
                    c3 = 3;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
            default:
                str4 = str2;
                str5 = "charAt";
                c3 = 65535;
                break;
        }
        String str6 = "undefined";
        char c10 = c3;
        String str7 = this.f15572a;
        switch (c10) {
            case 0:
                s8.n.c0(str5, 1, arrayList);
                if (!arrayList.isEmpty()) {
                    i9 = (int) s8.n.Q(((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0)).b().doubleValue());
                } else {
                    i9 = 0;
                }
                if (i9 >= 0 && i9 < str7.length()) {
                    return new C0981q(String.valueOf(str7.charAt(i9)));
                }
                return InterfaceC0966n.f15550U;
            case 1:
                if (!arrayList.isEmpty()) {
                    StringBuilder sb = new StringBuilder(str7);
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        sb.append(((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(i15)).c());
                    }
                    return new C0981q(sb.toString());
                }
                return this;
            case 2:
                s8.n.a0(1, str4, arrayList);
                InterfaceC0966n a5 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0));
                boolean equals = "length".equals(a5.c());
                C0921e c0921e = InterfaceC0966n.f15548S;
                if (equals) {
                    return c0921e;
                }
                double doubleValue3 = a5.b().doubleValue();
                if (doubleValue3 == Math.floor(doubleValue3) && (i10 = (int) doubleValue3) >= 0 && i10 < str7.length()) {
                    return c0921e;
                }
                return InterfaceC0966n.f15549T;
            case 3:
                s8.n.c0("indexOf", 2, arrayList);
                if (arrayList.size() > 0) {
                    str6 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0)).c();
                }
                String str8 = str6;
                if (arrayList.size() < 2) {
                    doubleValue = 0.0d;
                } else {
                    doubleValue = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(1)).b().doubleValue();
                }
                return new C0931g(Double.valueOf(str7.indexOf(str8, (int) s8.n.Q(doubleValue))));
            case 4:
                s8.n.c0("lastIndexOf", 2, arrayList);
                if (arrayList.size() > 0) {
                    str6 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0)).c();
                }
                String str9 = str6;
                if (arrayList.size() < 2) {
                    doubleValue2 = Double.NaN;
                } else {
                    doubleValue2 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(1)).b().doubleValue();
                }
                if (Double.isNaN(doubleValue2)) {
                    Q7 = Double.POSITIVE_INFINITY;
                } else {
                    Q7 = s8.n.Q(doubleValue2);
                }
                return new C0931g(Double.valueOf(str7.lastIndexOf(str9, (int) Q7)));
            case 5:
                s8.n.c0("match", 1, arrayList);
                if (arrayList.size() <= 0) {
                    c9 = "";
                } else {
                    c9 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0)).c();
                }
                Matcher matcher = Pattern.compile(c9).matcher(str7);
                if (matcher.find()) {
                    return new C0916d(Arrays.asList(new C0981q(matcher.group())));
                }
                return InterfaceC0966n.f15544O;
            case 6:
                s8.n.c0("replace", 2, arrayList);
                InterfaceC0966n interfaceC0966n = InterfaceC0966n.f15543N;
                if (!arrayList.isEmpty()) {
                    str6 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0)).c();
                    if (arrayList.size() > 1) {
                        interfaceC0966n = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(1));
                    }
                }
                String str10 = str6;
                int indexOf = str7.indexOf(str10);
                if (indexOf >= 0) {
                    if (interfaceC0966n instanceof AbstractC0936h) {
                        i11 = 0;
                        interfaceC0966n = ((AbstractC0936h) interfaceC0966n).a(sVar, Arrays.asList(new C0981q(str10), new C0931g(Double.valueOf(indexOf)), this));
                    } else {
                        i11 = 0;
                    }
                    return new C0981q(AbstractC0953k1.o(str7.substring(i11, indexOf), interfaceC0966n.c(), str7.substring(str10.length() + indexOf)));
                }
                return this;
            case 7:
                s8.n.c0("search", 1, arrayList);
                if (!arrayList.isEmpty()) {
                    str6 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0)).c();
                }
                if (Pattern.compile(str6).matcher(str7).find()) {
                    return new C0931g(Double.valueOf(r1.start()));
                }
                return new C0931g(Double.valueOf(-1.0d));
            case '\b':
                s8.n.c0("slice", 2, arrayList);
                if (!arrayList.isEmpty()) {
                    d9 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0)).b().doubleValue();
                } else {
                    d9 = 0.0d;
                }
                double Q8 = s8.n.Q(d9);
                if (Q8 < 0.0d) {
                    min = Math.max(str7.length() + Q8, 0.0d);
                } else {
                    min = Math.min(Q8, str7.length());
                }
                if (arrayList.size() > 1) {
                    length = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(1)).b().doubleValue();
                } else {
                    length = str7.length();
                }
                double Q9 = s8.n.Q(length);
                if (Q9 < 0.0d) {
                    min2 = Math.max(str7.length() + Q9, 0.0d);
                } else {
                    min2 = Math.min(Q9, str7.length());
                }
                int i16 = (int) min;
                return new C0981q(str7.substring(i16, Math.max(0, ((int) min2) - i16) + i16));
            case '\t':
                s8.n.c0("split", 2, arrayList);
                if (str7.length() == 0) {
                    return new C0916d(Arrays.asList(this));
                }
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.isEmpty()) {
                    arrayList2.add(this);
                } else {
                    String c11 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0)).c();
                    if (arrayList.size() > 1) {
                        j = s8.n.T(((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(1)).b().doubleValue()) & 4294967295L;
                    } else {
                        j = 2147483647L;
                    }
                    if (j == 0) {
                        return new C0916d();
                    }
                    String[] split = str7.split(Pattern.quote(c11), ((int) j) + 1);
                    int length3 = split.length;
                    if (c11.isEmpty() && length3 > 0) {
                        boolean isEmpty = split[0].isEmpty();
                        i12 = length3 - 1;
                        i13 = isEmpty;
                        if (!split[i12].isEmpty()) {
                            i12 = length3;
                            i13 = isEmpty;
                        }
                    } else {
                        i12 = length3;
                        i13 = 0;
                    }
                    if (length3 > j) {
                        i12--;
                    }
                    while (i13 < i12) {
                        arrayList2.add(new C0981q(split[i13]));
                        i13++;
                    }
                }
                return new C0916d(arrayList2);
            case R.styleable.GradientColor_android_endX /* 10 */:
                s8.n.c0("substring", 2, arrayList);
                if (!arrayList.isEmpty()) {
                    sVar2 = sVar;
                    i14 = (int) s8.n.Q(((C0995t) sVar2.f16505c).a(sVar2, (InterfaceC0966n) arrayList.get(0)).b().doubleValue());
                } else {
                    sVar2 = sVar;
                    i14 = 0;
                }
                if (arrayList.size() > 1) {
                    length2 = (int) s8.n.Q(((C0995t) sVar2.f16505c).a(sVar2, (InterfaceC0966n) arrayList.get(1)).b().doubleValue());
                } else {
                    length2 = str7.length();
                }
                int min3 = Math.min(Math.max(i14, 0), str7.length());
                int min4 = Math.min(Math.max(length2, 0), str7.length());
                return new C0981q(str7.substring(Math.min(min3, min4), Math.max(min3, min4)));
            case R.styleable.GradientColor_android_endY /* 11 */:
                s8.n.a0(0, "toLocaleUpperCase", arrayList);
                return new C0981q(str7.toUpperCase());
            case '\f':
                s8.n.a0(0, "toLocaleLowerCase", arrayList);
                return new C0981q(str7.toLowerCase());
            case '\r':
                s8.n.a0(0, "toLowerCase", arrayList);
                return new C0981q(str7.toLowerCase(Locale.ENGLISH));
            case 14:
                s8.n.a0(0, "toString", arrayList);
                return this;
            case 15:
                s8.n.a0(0, "toUpperCase", arrayList);
                return new C0981q(str7.toUpperCase(Locale.ENGLISH));
            case 16:
                s8.n.a0(0, "toUpperCase", arrayList);
                return new C0981q(str7.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final int hashCode() {
        return this.f15572a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0976p(1, this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Boolean o() {
        return Boolean.valueOf(!this.f15572a.isEmpty());
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("\""), this.f15572a, "\"");
    }
}
