package q4;

import F4.y;
import java.util.Arrays;
import k4.C1499E;

/* renamed from: q4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1913b implements C4.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1913b f22360c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22361a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22362b;

    static {
        C1499E c1499e = new C1499E(15, false);
        c1499e.f19985b = Boolean.FALSE;
        f22360c = new C1913b(c1499e);
    }

    public C1913b(C1499E c1499e) {
        this.f22361a = ((Boolean) c1499e.f19985b).booleanValue();
        this.f22362b = (String) c1499e.f19986c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1913b)) {
            return false;
        }
        C1913b c1913b = (C1913b) obj;
        c1913b.getClass();
        if (y.k(null, null) && this.f22361a == c1913b.f22361a && y.k(this.f22362b, c1913b.f22362b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f22361a), this.f22362b});
    }
}
