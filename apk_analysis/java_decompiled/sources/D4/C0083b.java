package D4;

import java.util.Arrays;

/* renamed from: D4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1830a;

    /* renamed from: b, reason: collision with root package name */
    public final A1.g f1831b;

    /* renamed from: c, reason: collision with root package name */
    public final C4.b f1832c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1833d;

    public C0083b(A1.g gVar, C4.b bVar, String str) {
        this.f1831b = gVar;
        this.f1832c = bVar;
        this.f1833d = str;
        this.f1830a = Arrays.hashCode(new Object[]{gVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0083b)) {
            return false;
        }
        C0083b c0083b = (C0083b) obj;
        if (!F4.y.k(this.f1831b, c0083b.f1831b) || !F4.y.k(this.f1832c, c0083b.f1832c) || !F4.y.k(this.f1833d, c0083b.f1833d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1830a;
    }
}
