package e1;

import android.net.Uri;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f17039a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17040b;

    public d(Uri uri, boolean z9) {
        this.f17039a = uri;
        this.f17040b = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f17040b == dVar.f17040b && this.f17039a.equals(dVar.f17039a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17039a.hashCode() * 31) + (this.f17040b ? 1 : 0);
    }
}
