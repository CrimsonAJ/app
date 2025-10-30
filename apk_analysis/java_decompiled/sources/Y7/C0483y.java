package Y7;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: Y7.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483y extends E7.a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0463g0 f8861b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f8862a;

    public C0483y() {
        super(f8861b);
        this.f8862a = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0483y) && kotlin.jvm.internal.h.a(this.f8862a, ((C0483y) obj).f8862a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8862a.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.p(new StringBuilder("CoroutineName("), this.f8862a, ')');
    }
}
