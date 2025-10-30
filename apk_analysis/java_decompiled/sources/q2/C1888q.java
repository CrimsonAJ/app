package q2;

import java.io.File;

/* renamed from: q2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1888q implements InterfaceC1891t {

    /* renamed from: a, reason: collision with root package name */
    public final File f22266a;

    public C1888q(File file) {
        kotlin.jvm.internal.h.e(file, "file");
        this.f22266a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1888q) && kotlin.jvm.internal.h.a(this.f22266a, ((C1888q) obj).f22266a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22266a.hashCode();
    }

    public final String toString() {
        return "Downloaded(file=" + this.f22266a + ")";
    }
}
