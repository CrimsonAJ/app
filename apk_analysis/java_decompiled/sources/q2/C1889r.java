package q2;

import android.net.Uri;

/* renamed from: q2.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1889r implements InterfaceC1891t {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f22267a;

    public C1889r(Uri uri) {
        kotlin.jvm.internal.h.e(uri, "uri");
        this.f22267a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1889r) && kotlin.jvm.internal.h.a(this.f22267a, ((C1889r) obj).f22267a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22267a.hashCode();
    }

    public final String toString() {
        return "DownloadedR(uri=" + this.f22267a + ")";
    }
}
