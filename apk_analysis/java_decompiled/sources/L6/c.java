package L6;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f4644a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f4645b;

    public c(String str, Map map) {
        this.f4644a = str;
        this.f4645b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f4644a.equals(cVar.f4644a) && this.f4645b.equals(cVar.f4645b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4645b.hashCode() + (this.f4644a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f4644a + ", properties=" + this.f4645b.values() + "}";
    }
}
