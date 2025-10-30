package I2;

import B7.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;
import u0.z;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f3466a;

    /* renamed from: b, reason: collision with root package name */
    public int f3467b;

    /* renamed from: c, reason: collision with root package name */
    public String f3468c;

    /* renamed from: d, reason: collision with root package name */
    public List f3469d;

    /* renamed from: e, reason: collision with root package name */
    public String f3470e;

    /* renamed from: f, reason: collision with root package name */
    public final List f3471f;

    public e() {
        t tVar = t.f1135a;
        ArrayList arrayList = new ArrayList();
        this.f3466a = 0L;
        this.f3467b = 0;
        this.f3468c = "";
        this.f3469d = tVar;
        this.f3470e = "";
        this.f3471f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f3466a == eVar.f3466a && this.f3467b == eVar.f3467b && h.a(this.f3468c, eVar.f3468c) && h.a(this.f3469d, eVar.f3469d) && h.a(this.f3470e, eVar.f3470e) && h.a(this.f3471f, eVar.f3471f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f3466a;
        return this.f3471f.hashCode() + z.c(this.f3470e, (this.f3469d.hashCode() + z.c(this.f3468c, ((((int) (j ^ (j >>> 32))) * 31) + this.f3467b) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "CurrentAnime(id=" + this.f3466a + ", year=" + this.f3467b + ", name=" + this.f3468c + ", allNames=" + this.f3469d + ", poster=" + this.f3470e + ", episodes=" + this.f3471f + ")";
    }
}
