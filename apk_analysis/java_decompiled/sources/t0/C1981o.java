package t0;

import android.os.Bundle;

/* renamed from: t0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1981o {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f23016a;

    /* renamed from: b, reason: collision with root package name */
    public C1988w f23017b;

    public C1981o(C1988w c1988w, boolean z9) {
        if (c1988w != null) {
            Bundle bundle = new Bundle();
            this.f23016a = bundle;
            this.f23017b = c1988w;
            bundle.putBundle("selector", c1988w.f23047a);
            bundle.putBoolean("activeScan", z9);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.f23017b == null) {
            C1988w b9 = C1988w.b(this.f23016a.getBundle("selector"));
            this.f23017b = b9;
            if (b9 == null) {
                this.f23017b = C1988w.f23046c;
            }
        }
    }

    public final boolean b() {
        return this.f23016a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1981o) {
            C1981o c1981o = (C1981o) obj;
            a();
            C1988w c1988w = this.f23017b;
            c1981o.a();
            if (c1988w.equals(c1981o.f23017b) && b() == c1981o.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f23017b.hashCode() ^ (b() ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.f23017b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        this.f23017b.a();
        sb.append(!r1.f23048b.contains(null));
        sb.append(" }");
        return sb.toString();
    }
}
