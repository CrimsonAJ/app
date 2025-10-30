package M0;

import A7.n;
import B7.k;
import W7.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f4691a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4692b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4693c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4694d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public d(String name, boolean z9, List columns, List list) {
        h.e(name, "name");
        h.e(columns, "columns");
        this.f4691a = name;
        this.f4692b = z9;
        this.f4693c = columns;
        this.f4694d = list;
        if (list.isEmpty()) {
            int size = columns.size();
            list = new ArrayList(size);
            for (int i9 = 0; i9 < size; i9++) {
                list.add("ASC");
            }
        }
        this.f4694d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f4692b == dVar.f4692b && h.a(this.f4693c, dVar.f4693c) && h.a(this.f4694d, dVar.f4694d)) {
                String str = this.f4691a;
                boolean L8 = l.L(str, "index_", false);
                String str2 = dVar.f4691a;
                if (L8) {
                    return l.L(str2, "index_", false);
                }
                return str.equals(str2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f4691a;
        if (l.L(str, "index_", false)) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.f4694d.hashCode() + ((this.f4693c.hashCode() + (((hashCode * 31) + (this.f4692b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.f4691a);
        sb.append("',\n            |   unique = '");
        sb.append(this.f4692b);
        sb.append("',\n            |   columns = {");
        W7.e.C(k.u0(this.f4693c, ",", null, null, null, 62));
        W7.e.C("},");
        n nVar = n.f558a;
        sb.append(nVar);
        sb.append("\n            |   orders = {");
        W7.e.C(k.u0(this.f4694d, ",", null, null, null, 62));
        W7.e.C(" }");
        sb.append(nVar);
        sb.append("\n            |}\n        ");
        return W7.e.C(W7.e.D(sb.toString()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.lang.String r6, java.util.List r7) {
        /*
            r5 = this;
            java.lang.String r0 = "columns"
            kotlin.jvm.internal.h.e(r7, r0)
            int r0 = r7.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r0) goto L1a
            java.lang.String r4 = "ASC"
            r1.add(r4)
            int r3 = r3 + 1
            goto L10
        L1a:
            r5.<init>(r6, r2, r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.d.<init>(java.lang.String, java.util.List):void");
    }
}
