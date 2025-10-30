package p0;

import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f22102a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22103b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22104c;

    public d(String str, int i9, int i10) {
        this.f22102a = str;
        this.f22103b = i9;
        this.f22104c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i9 = this.f22104c;
        String str = this.f22102a;
        int i10 = this.f22103b;
        if (i10 >= 0 && dVar.f22103b >= 0) {
            if (TextUtils.equals(str, dVar.f22102a) && i10 == dVar.f22103b && i9 == dVar.f22104c) {
                return true;
            }
            return false;
        }
        if (TextUtils.equals(str, dVar.f22102a) && i9 == dVar.f22104c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f22102a, Integer.valueOf(this.f22104c));
    }
}
