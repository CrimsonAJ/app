package I2;

import A7.h;
import B7.u;
import java.util.Map;
import u0.z;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3456a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3457b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f3458c;

    /* renamed from: d, reason: collision with root package name */
    public final h f3459d;

    /* renamed from: e, reason: collision with root package name */
    public final h f3460e;

    public b(String name, String url, Map map, h hVar, h hVar2) {
        kotlin.jvm.internal.h.e(name, "name");
        kotlin.jvm.internal.h.e(url, "url");
        this.f3456a = name;
        this.f3457b = url;
        this.f3458c = map;
        this.f3459d = hVar;
        this.f3460e = hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (kotlin.jvm.internal.h.a(this.f3456a, bVar.f3456a) && kotlin.jvm.internal.h.a(this.f3457b, bVar.f3457b) && kotlin.jvm.internal.h.a(this.f3458c, bVar.f3458c) && kotlin.jvm.internal.h.a(this.f3459d, bVar.f3459d) && kotlin.jvm.internal.h.a(this.f3460e, bVar.f3460e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3458c.hashCode() + z.c(this.f3457b, this.f3456a.hashCode() * 31, 31)) * 31;
        int i9 = 0;
        h hVar = this.f3459d;
        if (hVar == null) {
            hashCode = 0;
        } else {
            hashCode = hVar.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        h hVar2 = this.f3460e;
        if (hVar2 != null) {
            i9 = hVar2.hashCode();
        }
        return i10 + i9;
    }

    public final String toString() {
        return "AnimeHls(name=" + this.f3456a + ", url=" + this.f3457b + ", headers=" + this.f3458c + ", intro=" + this.f3459d + ", outro=" + this.f3460e + ")";
    }

    public /* synthetic */ b() {
        this("", "", u.f1136a, null, null);
    }
}
