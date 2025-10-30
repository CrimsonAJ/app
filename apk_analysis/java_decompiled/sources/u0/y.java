package u0;

import B6.u0;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f23545q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f23546r = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: s, reason: collision with root package name */
    public static final String f23547s = "http[s]?://";

    /* renamed from: t, reason: collision with root package name */
    public static final String f23548t = ".*";

    /* renamed from: u, reason: collision with root package name */
    public static final String f23549u = A0.a.n("\\E", ".*", "\\Q");

    /* renamed from: v, reason: collision with root package name */
    public static final String f23550v = "([^/]*?|)";

    /* renamed from: a, reason: collision with root package name */
    public final String f23551a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23552b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23553c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f23554d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23555e;

    /* renamed from: f, reason: collision with root package name */
    public final A7.l f23556f;

    /* renamed from: g, reason: collision with root package name */
    public final A7.l f23557g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f23558h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23559i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f23560k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f23561l;

    /* renamed from: m, reason: collision with root package name */
    public final A7.l f23562m;

    /* renamed from: n, reason: collision with root package name */
    public final String f23563n;

    /* renamed from: o, reason: collision with root package name */
    public final A7.l f23564o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f23565p;

    public y(String str, String str2, String str3) {
        List list;
        List list2;
        boolean z9;
        this.f23551a = str;
        this.f23552b = str2;
        this.f23553c = str3;
        ArrayList arrayList = new ArrayList();
        this.f23554d = arrayList;
        this.f23556f = Z0.a.q(new C2051w(this, 6));
        this.f23557g = Z0.a.q(new C2051w(this, 4));
        A7.f fVar = A7.f.f545a;
        this.f23558h = Z0.a.p(fVar, new C2051w(this, 7));
        this.j = Z0.a.p(fVar, new C2051w(this, 1));
        this.f23560k = Z0.a.p(fVar, new C2051w(this, 0));
        this.f23561l = Z0.a.p(fVar, new C2051w(this, 3));
        this.f23562m = Z0.a.q(new C2051w(this, 2));
        this.f23564o = Z0.a.q(new C2051w(this, 5));
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!f23545q.matcher(str).find()) {
                sb.append(f23547s);
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            String substring = str.substring(0, matcher.start());
            kotlin.jvm.internal.h.d(substring, "substring(...)");
            a(substring, arrayList, sb);
            String str4 = f23548t;
            if (!W7.d.N(sb, str4) && !W7.d.N(sb, f23550v)) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f23565p = z9;
            sb.append("($|(\\?(.)*)|(\\#(.)*))");
            String sb2 = sb.toString();
            kotlin.jvm.internal.h.d(sb2, "uriRegex.toString()");
            this.f23555e = W7.l.J(sb2, str4, f23549u);
        }
        if (str3 == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            Pattern compile = Pattern.compile("/");
            kotlin.jvm.internal.h.d(compile, "compile(...)");
            Matcher matcher2 = compile.matcher(str3);
            if (!matcher2.find()) {
                list = u0.D(str3.toString());
            } else {
                ArrayList arrayList2 = new ArrayList(10);
                int i9 = 0;
                do {
                    arrayList2.add(str3.subSequence(i9, matcher2.start()).toString());
                    i9 = matcher2.end();
                } while (matcher2.find());
                arrayList2.add(str3.subSequence(i9, str3.length()).toString());
                list = arrayList2;
            }
            if (!list.isEmpty()) {
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list2 = B7.k.D0(list, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list2 = B7.t.f1135a;
            this.f23563n = W7.l.J("^(" + ((String) list2.get(0)) + "|[*]+)/(" + ((String) list2.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
            return;
        }
        throw new IllegalArgumentException(A0.a.n("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = f23546r.matcher(str);
        int i9 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            kotlin.jvm.internal.h.c(group, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(group);
            if (matcher.start() > i9) {
                String substring = str.substring(i9, matcher.start());
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                sb.append(Pattern.quote(substring));
            }
            sb.append(f23550v);
            i9 = matcher.end();
        }
        if (i9 < str.length()) {
            String substring2 = str.substring(i9);
            kotlin.jvm.internal.h.d(substring2, "substring(...)");
            sb.append(Pattern.quote(substring2));
        }
    }

    public static void e(Bundle bundle, String key, String str, C2038i c2038i) {
        if (c2038i != null) {
            T t7 = c2038i.f23486a;
            kotlin.jvm.internal.h.e(key, "key");
            t7.e(bundle, key, t7.d(str));
            return;
        }
        bundle.putString(key, str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [A7.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [A7.e, java.lang.Object] */
    public final ArrayList b() {
        ArrayList arrayList = this.f23554d;
        Collection values = ((Map) this.f23558h.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            B7.q.h0(arrayList2, ((C2050v) it.next()).f23540b);
        }
        return B7.k.y0(B7.k.y0(arrayList, arrayList2), (List) this.f23560k.getValue());
    }

    public final boolean c(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f23554d;
        ArrayList arrayList2 = new ArrayList(B7.m.f0(arrayList, 10));
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int i11 = i9 + 1;
            if (i9 >= 0) {
                String str = (String) obj;
                String value = Uri.decode(matcher.group(i11));
                C2038i c2038i = (C2038i) linkedHashMap.get(str);
                try {
                    kotlin.jvm.internal.h.d(value, "value");
                    e(bundle, str, value, c2038i);
                    arrayList2.add(A7.n.f558a);
                    i9 = i11;
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } else {
                B7.l.e0();
                throw null;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [A7.e, java.lang.Object] */
    public final boolean d(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Matcher matcher;
        Object obj;
        boolean z9;
        T t7;
        Object obj2;
        String query;
        y yVar = this;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        for (Map.Entry entry : ((Map) yVar.f23558h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            C2050v c2050v = (C2050v) entry.getValue();
            List<String> inputParams = uri.getQueryParameters(str);
            if (yVar.f23559i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                inputParams = u0.D(query);
            }
            kotlin.jvm.internal.h.d(inputParams, "inputParams");
            A7.n nVar = A7.n.f558a;
            int i9 = 0;
            Bundle c3 = Z0.a.c(new A7.h[0]);
            ArrayList arrayList = c2050v.f23540b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj3 = arrayList.get(i10);
                i10++;
                String str2 = (String) obj3;
                C2038i c2038i = (C2038i) linkedHashMap2.get(str2);
                if (c2038i != null) {
                    t7 = c2038i.f23486a;
                } else {
                    t7 = null;
                }
                if ((t7 instanceof L) && !c2038i.f23488c) {
                    switch (((L) t7).f23436r) {
                        case 0:
                            obj2 = new boolean[0];
                            break;
                        case 1:
                            obj2 = B7.t.f1135a;
                            break;
                        case 2:
                            obj2 = new float[0];
                            break;
                        case 3:
                            obj2 = B7.t.f1135a;
                            break;
                        case 4:
                            obj2 = new int[0];
                            break;
                        case 5:
                            obj2 = B7.t.f1135a;
                            break;
                        case 6:
                            obj2 = new long[0];
                            break;
                        case 7:
                            obj2 = B7.t.f1135a;
                            break;
                        case 8:
                            obj2 = new String[0];
                            break;
                        default:
                            obj2 = B7.t.f1135a;
                            break;
                    }
                    t7.e(c3, str2, obj2);
                }
            }
            for (String str3 : inputParams) {
                String str4 = c2050v.f23539a;
                if (str4 != null) {
                    matcher = Pattern.compile(str4, 32).matcher(str3);
                } else {
                    matcher = null;
                }
                if (matcher == null || !matcher.matches()) {
                    return i9;
                }
                ArrayList arrayList2 = c2050v.f23540b;
                ArrayList arrayList3 = new ArrayList(B7.m.f0(arrayList2, 10));
                int size2 = arrayList2.size();
                int i11 = i9;
                int i12 = i11;
                while (i12 < size2) {
                    Object obj4 = arrayList2.get(i12);
                    i12++;
                    int i13 = i9;
                    int i14 = i11 + 1;
                    if (i11 >= 0) {
                        String str5 = (String) obj4;
                        String group = matcher.group(i14);
                        if (group == null) {
                            group = "";
                        }
                        String str6 = group;
                        C2038i c2038i2 = (C2038i) linkedHashMap2.get(str5);
                        if (!c3.containsKey(str5)) {
                            e(c3, str5, str6, c2038i2);
                            obj = nVar;
                            arrayList3.add(obj);
                            linkedHashMap2 = linkedHashMap;
                            i11 = i14;
                            i9 = i13;
                        } else {
                            if (!c3.containsKey(str5)) {
                                z9 = 1;
                            } else {
                                if (c2038i2 != null) {
                                    T t9 = c2038i2.f23486a;
                                    Object a5 = t9.a(str5, c3);
                                    if (c3.containsKey(str5)) {
                                        t9.e(c3, str5, t9.c(a5, str6));
                                    } else {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                }
                                z9 = i13;
                            }
                            obj = Boolean.valueOf(z9);
                            arrayList3.add(obj);
                            linkedHashMap2 = linkedHashMap;
                            i11 = i14;
                            i9 = i13;
                        }
                    } else {
                        B7.l.e0();
                        throw null;
                    }
                }
                linkedHashMap2 = linkedHashMap;
            }
            bundle.putAll(c3);
            yVar = this;
            linkedHashMap2 = linkedHashMap;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof y)) {
            y yVar = (y) obj;
            if (kotlin.jvm.internal.h.a(this.f23551a, yVar.f23551a) && kotlin.jvm.internal.h.a(this.f23552b, yVar.f23552b) && kotlin.jvm.internal.h.a(this.f23553c, yVar.f23553c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11 = 0;
        String str = this.f23551a;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = i9 * 31;
        String str2 = this.f23552b;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.f23553c;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }
}
