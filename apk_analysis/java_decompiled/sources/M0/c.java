package M0;

import A7.n;
import B7.k;
import java.util.List;
import kotlin.jvm.internal.h;
import u0.z;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4686a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4687b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4688c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4689d;

    /* renamed from: e, reason: collision with root package name */
    public final List f4690e;

    public c(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
        h.e(referenceTable, "referenceTable");
        h.e(onDelete, "onDelete");
        h.e(onUpdate, "onUpdate");
        h.e(columnNames, "columnNames");
        h.e(referenceColumnNames, "referenceColumnNames");
        this.f4686a = referenceTable;
        this.f4687b = onDelete;
        this.f4688c = onUpdate;
        this.f4689d = columnNames;
        this.f4690e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (!h.a(this.f4686a, cVar.f4686a) || !h.a(this.f4687b, cVar.f4687b) || !h.a(this.f4688c, cVar.f4688c) || !h.a(this.f4689d, cVar.f4689d)) {
                return false;
            }
            return h.a(this.f4690e, cVar.f4690e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4690e.hashCode() + ((this.f4689d.hashCode() + z.c(this.f4688c, z.c(this.f4687b, this.f4686a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.f4686a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.f4687b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.f4688c);
        sb.append("',\n            |   columnNames = {");
        W7.e.C(k.u0(k.B0(this.f4689d), ",", null, null, null, 62));
        W7.e.C("},");
        n nVar = n.f558a;
        sb.append(nVar);
        sb.append("\n            |   referenceColumnNames = {");
        W7.e.C(k.u0(k.B0(this.f4690e), ",", null, null, null, 62));
        W7.e.C(" }");
        sb.append(nVar);
        sb.append("\n            |}\n        ");
        return W7.e.C(W7.e.D(sb.toString()));
    }
}
