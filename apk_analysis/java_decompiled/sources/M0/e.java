package M0;

import B.j;
import B7.k;
import B7.t;
import a.AbstractC0485a;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f4695a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4696b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f4697c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractSet f4698d;

    public e(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        h.e(foreignKeys, "foreignKeys");
        this.f4695a = str;
        this.f4696b = map;
        this.f4697c = foreignKeys;
        this.f4698d = abstractSet;
    }

    public static final e a(R0.c cVar, String str) {
        return Z0.a.v(new J0.a(cVar), str);
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (!this.f4695a.equals(eVar.f4695a) || !this.f4696b.equals(eVar.f4696b) || !h.a(this.f4697c, eVar.f4697c)) {
                    return false;
                }
                AbstractSet abstractSet2 = this.f4698d;
                if (abstractSet2 != null && (abstractSet = eVar.f4698d) != null) {
                    return abstractSet2.equals(abstractSet);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4697c.hashCode() + ((this.f4696b.hashCode() + (this.f4695a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    public final String toString() {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f4695a);
        sb.append("',\n            |    columns = {");
        sb.append(AbstractC0485a.n(k.C0(this.f4696b.values(), new j(8))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(AbstractC0485a.n(this.f4697c));
        sb.append("\n            |    indices = {");
        AbstractSet abstractSet = this.f4698d;
        if (abstractSet != null) {
            collection = k.C0(abstractSet, new j(9));
        } else {
            collection = t.f1135a;
        }
        sb.append(AbstractC0485a.n(collection));
        sb.append("\n            |}\n        ");
        return W7.e.D(sb.toString());
    }
}
