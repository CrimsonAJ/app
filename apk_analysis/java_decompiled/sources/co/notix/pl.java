package co.notix;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class pl {

    /* renamed from: a, reason: collision with root package name */
    public final String f12983a;

    /* renamed from: b, reason: collision with root package name */
    public final ql f12984b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12985c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12986d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12987e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f12988f;

    /* renamed from: g, reason: collision with root package name */
    public final List f12989g;

    public pl(String id, ql level, String message, String str, long j, Map map, List list) {
        kotlin.jvm.internal.h.e(id, "id");
        kotlin.jvm.internal.h.e(level, "level");
        kotlin.jvm.internal.h.e(message, "message");
        this.f12983a = id;
        this.f12984b = level;
        this.f12985c = message;
        this.f12986d = str;
        this.f12987e = j;
        this.f12988f = map;
        this.f12989g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl)) {
            return false;
        }
        pl plVar = (pl) obj;
        return kotlin.jvm.internal.h.a(this.f12983a, plVar.f12983a) && this.f12984b == plVar.f12984b && kotlin.jvm.internal.h.a(this.f12985c, plVar.f12985c) && kotlin.jvm.internal.h.a(this.f12986d, plVar.f12986d) && this.f12987e == plVar.f12987e && kotlin.jvm.internal.h.a(this.f12988f, plVar.f12988f) && kotlin.jvm.internal.h.a(this.f12989g, plVar.f12989g);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int a5 = h.a(this.f12985c, (this.f12984b.hashCode() + (this.f12983a.hashCode() * 31)) * 31, 31);
        String str = this.f12986d;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.f12987e;
        int i10 = (((int) (j ^ (j >>> 32))) + ((a5 + hashCode) * 31)) * 31;
        Map map = this.f12988f;
        if (map == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = map.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        List list = this.f12989g;
        if (list != null) {
            i9 = list.hashCode();
        }
        return i11 + i9;
    }

    public final String toString() {
        return "RemoteLogDto(id=" + this.f12983a + ", level=" + this.f12984b + ", message=" + this.f12985c + ", stacktrace=" + this.f12986d + ", timestamp=" + this.f12987e + ", tags=" + this.f12988f + ", prev=" + this.f12989g + ')';
    }
}
