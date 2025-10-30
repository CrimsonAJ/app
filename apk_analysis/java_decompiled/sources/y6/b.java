package y6;

import B6.B;
import java.io.File;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final B f25030a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25031b;

    /* renamed from: c, reason: collision with root package name */
    public final File f25032c;

    public b(B b9, String str, File file) {
        this.f25030a = b9;
        if (str != null) {
            this.f25031b = str;
            this.f25032c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f25030a.equals(bVar.f25030a) && this.f25031b.equals(bVar.f25031b) && this.f25032c.equals(bVar.f25032c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f25030a.hashCode() ^ 1000003) * 1000003) ^ this.f25031b.hashCode()) * 1000003) ^ this.f25032c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f25030a + ", sessionId=" + this.f25031b + ", reportFile=" + this.f25032c + "}";
    }
}
