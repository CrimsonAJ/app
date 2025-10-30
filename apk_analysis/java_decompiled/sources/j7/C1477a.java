package j7;

import kotlin.jvm.internal.h;
import y6.i;

/* renamed from: j7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1477a {

    /* renamed from: a, reason: collision with root package name */
    public final g8.d f19781a;

    /* renamed from: b, reason: collision with root package name */
    public i f19782b = null;

    public C1477a(g8.d dVar) {
        this.f19781a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1477a) {
                C1477a c1477a = (C1477a) obj;
                if (!this.f19781a.equals(c1477a.f19781a) || !h.a(this.f19782b, c1477a.f19782b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f19781a.hashCode() * 31;
        i iVar = this.f19782b;
        if (iVar == null) {
            hashCode = 0;
        } else {
            hashCode = iVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f19781a + ", subscriber=" + this.f19782b + ')';
    }
}
