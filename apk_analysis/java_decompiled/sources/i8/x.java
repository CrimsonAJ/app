package i8;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public String f19160a;

    /* renamed from: d, reason: collision with root package name */
    public String f19163d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f19165f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f19166g;

    /* renamed from: h, reason: collision with root package name */
    public String f19167h;

    /* renamed from: b, reason: collision with root package name */
    public String f19161b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f19162c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f19164e = -1;

    public x() {
        ArrayList arrayList = new ArrayList();
        this.f19165f = arrayList;
        arrayList.add("");
    }

    public final void a(String name, String str) {
        String str2;
        kotlin.jvm.internal.h.e(name, "name");
        if (this.f19166g == null) {
            this.f19166g = new ArrayList();
        }
        ArrayList arrayList = this.f19166g;
        kotlin.jvm.internal.h.b(arrayList);
        arrayList.add(r.c(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219));
        ArrayList arrayList2 = this.f19166g;
        kotlin.jvm.internal.h.b(arrayList2);
        if (str != null) {
            str2 = r.c(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 219);
        } else {
            str2 = null;
        }
        arrayList2.add(str2);
    }

    public final y b() {
        ArrayList arrayList;
        String str;
        String str2 = this.f19160a;
        if (str2 != null) {
            String g9 = r.g(0, 0, 7, this.f19161b);
            String g10 = r.g(0, 0, 7, this.f19162c);
            String str3 = this.f19163d;
            if (str3 != null) {
                int c3 = c();
                ArrayList arrayList2 = this.f19165f;
                ArrayList arrayList3 = new ArrayList(B7.m.f0(arrayList2, 10));
                int size = arrayList2.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList2.get(i9);
                    i9++;
                    arrayList3.add(r.g(0, 0, 7, (String) obj));
                }
                ArrayList arrayList4 = this.f19166g;
                String str4 = null;
                if (arrayList4 != null) {
                    ArrayList arrayList5 = new ArrayList(B7.m.f0(arrayList4, 10));
                    int size2 = arrayList4.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj2 = arrayList4.get(i10);
                        i10++;
                        String str5 = (String) obj2;
                        if (str5 != null) {
                            str = r.g(0, 0, 3, str5);
                        } else {
                            str = null;
                        }
                        arrayList5.add(str);
                    }
                    arrayList = arrayList5;
                } else {
                    arrayList = null;
                }
                String str6 = this.f19167h;
                if (str6 != null) {
                    str4 = r.g(0, 0, 7, str6);
                }
                return new y(str2, g9, g10, str3, c3, arrayList3, arrayList, str4, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    public final int c() {
        int i9 = this.f19164e;
        if (i9 != -1) {
            return i9;
        }
        String str = this.f19160a;
        kotlin.jvm.internal.h.b(str);
        if (str.equals("http")) {
            return 80;
        }
        if (!str.equals("https")) {
            return -1;
        }
        return 443;
    }

    public final void d(String host) {
        kotlin.jvm.internal.h.e(host, "host");
        String V8 = v4.e.V(r.g(0, 0, 7, host));
        if (V8 != null) {
            this.f19163d = V8;
            return;
        }
        throw new IllegalArgumentException("unexpected host: ".concat(host));
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0210, code lost:
    
        if (r6 < 65536) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r14 == ':') goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x032e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(i8.y r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.x.e(i8.y, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r1 != r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.f19160a
            if (r1 == 0) goto L12
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L17
        L12:
            java.lang.String r1 = "//"
            r0.append(r1)
        L17:
            java.lang.String r1 = r6.f19161b
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L22
            goto L2a
        L22:
            java.lang.String r1 = r6.f19162c
            int r1 = r1.length()
            if (r1 <= 0) goto L44
        L2a:
            java.lang.String r1 = r6.f19161b
            r0.append(r1)
            java.lang.String r1 = r6.f19162c
            int r1 = r1.length()
            if (r1 <= 0) goto L3f
            r0.append(r2)
            java.lang.String r1 = r6.f19162c
            r0.append(r1)
        L3f:
            r1 = 64
            r0.append(r1)
        L44:
            java.lang.String r1 = r6.f19163d
            if (r1 == 0) goto L63
            boolean r1 = W7.d.M(r1, r2)
            if (r1 == 0) goto L5e
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r6.f19163d
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L63
        L5e:
            java.lang.String r1 = r6.f19163d
            r0.append(r1)
        L63:
            int r1 = r6.f19164e
            r3 = -1
            if (r1 != r3) goto L6c
            java.lang.String r1 = r6.f19160a
            if (r1 == 0) goto L91
        L6c:
            int r1 = r6.c()
            java.lang.String r4 = r6.f19160a
            if (r4 == 0) goto L8b
            java.lang.String r5 = "http"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L7f
            r3 = 80
            goto L89
        L7f:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L89
            r3 = 443(0x1bb, float:6.21E-43)
        L89:
            if (r1 == r3) goto L91
        L8b:
            r0.append(r2)
            r0.append(r1)
        L91:
            java.util.ArrayList r1 = r6.f19165f
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.h.e(r1, r2)
            int r2 = r1.size()
            r3 = 0
        L9d:
            if (r3 >= r2) goto Lb0
            r4 = 47
            r0.append(r4)
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            int r3 = r3 + 1
            goto L9d
        Lb0:
            java.util.ArrayList r1 = r6.f19166g
            if (r1 == 0) goto Lc1
            r1 = 63
            r0.append(r1)
            java.util.ArrayList r1 = r6.f19166g
            kotlin.jvm.internal.h.b(r1)
            i8.r.j(r1, r0)
        Lc1:
            java.lang.String r1 = r6.f19167h
            if (r1 == 0) goto Lcf
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r6.f19167h
            r0.append(r1)
        Lcf:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.h.d(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.x.toString():java.lang.String");
    }
}
