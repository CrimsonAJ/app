package e6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1145a {

    /* renamed from: b, reason: collision with root package name */
    public static final C1145a f17215b = new C1145a(Collections.unmodifiableMap(new HashMap()));

    /* renamed from: a, reason: collision with root package name */
    public final Map f17216a;

    public C1145a(Map map) {
        this.f17216a = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1145a)) {
            return false;
        }
        return this.f17216a.equals(((C1145a) obj).f17216a);
    }

    public final int hashCode() {
        return this.f17216a.hashCode();
    }

    public final String toString() {
        return this.f17216a.toString();
    }
}
