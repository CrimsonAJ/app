package Q6;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6444a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6445b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f6444a = str;
            this.f6445b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f6444a.equals(aVar.f6444a) && this.f6445b.equals(aVar.f6445b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f6444a.hashCode() ^ 1000003) * 1000003) ^ this.f6445b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f6444a + ", usedDates=" + this.f6445b + "}";
    }
}
