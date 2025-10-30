package f4;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: f4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1166d {

    /* renamed from: a, reason: collision with root package name */
    public final String f17374a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17375b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17376c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17377d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17378e;

    /* renamed from: f, reason: collision with root package name */
    public final C1168f f17379f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f17380g;

    /* renamed from: h, reason: collision with root package name */
    public final String f17381h;

    /* renamed from: i, reason: collision with root package name */
    public final String f17382i;
    public final C1166d j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f17383k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f17384l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f17385m;

    public C1166d(String str, String str2, long j, long j4, C1168f c1168f, String[] strArr, String str3, String str4, C1166d c1166d) {
        boolean z9;
        this.f17374a = str;
        this.f17375b = str2;
        this.f17382i = str4;
        this.f17379f = c1168f;
        this.f17380g = strArr;
        if (str2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f17376c = z9;
        this.f17377d = j;
        this.f17378e = j4;
        str3.getClass();
        this.f17381h = str3;
        this.j = c1166d;
        this.f17383k = new HashMap();
        this.f17384l = new HashMap();
    }

    public static C1166d a(String str) {
        return new C1166d(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            Y3.a aVar = new Y3.a();
            aVar.f8661a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((Y3.a) treeMap.get(str)).f8661a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final C1166d b(int i9) {
        ArrayList arrayList = this.f17385m;
        if (arrayList != null) {
            return (C1166d) arrayList.get(i9);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f17385m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z9) {
        boolean z10;
        String str = this.f17374a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z9 || equals || (equals2 && this.f17382i != null)) {
            long j = this.f17377d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j4 = this.f17378e;
            if (j4 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j4));
            }
        }
        if (this.f17385m != null) {
            for (int i9 = 0; i9 < this.f17385m.size(); i9++) {
                C1166d c1166d = (C1166d) this.f17385m.get(i9);
                if (!z9 && !equals) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                c1166d.d(treeSet, z10);
            }
        }
    }

    public final boolean f(long j) {
        long j4 = this.f17377d;
        long j9 = this.f17378e;
        if (j4 != -9223372036854775807L || j9 != -9223372036854775807L) {
            if (j4 > j || j9 != -9223372036854775807L) {
                if (j4 != -9223372036854775807L || j >= j9) {
                    if (j4 <= j && j < j9) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f17381h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.f17374a) && (str2 = this.f17382i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i9 = 0; i9 < c(); i9++) {
            b(i9).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r19, java.util.Map r21, java.util.HashMap r22, java.lang.String r23, java.util.TreeMap r24) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.C1166d.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j, boolean z9, String str, TreeMap treeMap) {
        String str2;
        boolean z10;
        TreeMap treeMap2;
        long j4;
        HashMap hashMap = this.f17383k;
        hashMap.clear();
        HashMap hashMap2 = this.f17384l;
        hashMap2.clear();
        String str3 = this.f17374a;
        if (!"metadata".equals(str3)) {
            String str4 = this.f17381h;
            if ("".equals(str4)) {
                str2 = str;
            } else {
                str2 = str4;
            }
            if (this.f17376c && z9) {
                SpannableStringBuilder e8 = e(str2, treeMap);
                String str5 = this.f17375b;
                str5.getClass();
                e8.append((CharSequence) str5);
                return;
            }
            if ("br".equals(str3) && z9) {
                e(str2, treeMap).append('\n');
                return;
            }
            if (f(j)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    String str6 = (String) entry.getKey();
                    CharSequence charSequence = ((Y3.a) entry.getValue()).f8661a;
                    charSequence.getClass();
                    hashMap.put(str6, Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(str3);
                for (int i9 = 0; i9 < c(); i9++) {
                    C1166d b9 = b(i9);
                    if (!z9 && !equals) {
                        z10 = false;
                        j4 = j;
                        treeMap2 = treeMap;
                    } else {
                        z10 = true;
                        treeMap2 = treeMap;
                        j4 = j;
                    }
                    b9.i(j4, z10, str2, treeMap2);
                }
                if (equals) {
                    SpannableStringBuilder e9 = e(str2, treeMap);
                    int length = e9.length() - 1;
                    while (length >= 0 && e9.charAt(length) == ' ') {
                        length--;
                    }
                    if (length >= 0 && e9.charAt(length) != '\n') {
                        e9.append('\n');
                    }
                }
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    String str7 = (String) entry2.getKey();
                    CharSequence charSequence2 = ((Y3.a) entry2.getValue()).f8661a;
                    charSequence2.getClass();
                    hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
