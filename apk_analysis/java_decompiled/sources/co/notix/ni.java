package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ni {

    /* renamed from: a, reason: collision with root package name */
    public final String f12824a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12825b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12826c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12827d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f12828e;

    public ni(String id, String type, int i9, long j, JSONObject paramsJson) {
        kotlin.jvm.internal.h.e(id, "id");
        kotlin.jvm.internal.h.e(type, "type");
        kotlin.jvm.internal.h.e(paramsJson, "paramsJson");
        this.f12824a = id;
        this.f12825b = type;
        this.f12826c = i9;
        this.f12827d = j;
        this.f12828e = paramsJson;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni)) {
            return false;
        }
        ni niVar = (ni) obj;
        return kotlin.jvm.internal.h.a(this.f12824a, niVar.f12824a) && kotlin.jvm.internal.h.a(this.f12825b, niVar.f12825b) && this.f12826c == niVar.f12826c && this.f12827d == niVar.f12827d && kotlin.jvm.internal.h.a(this.f12828e, niVar.f12828e);
    }

    public final int hashCode() {
        int a5 = (this.f12826c + h.a(this.f12825b, this.f12824a.hashCode() * 31, 31)) * 31;
        long j = this.f12827d;
        return this.f12828e.hashCode() + ((((int) (j ^ (j >>> 32))) + a5) * 31);
    }

    public final String toString() {
        return "PerseveranceParams(id=" + this.f12824a + ", type=" + this.f12825b + ", retryCount=" + this.f12826c + ", nextRetryTime=" + this.f12827d + ", paramsJson=" + this.f12828e + ')';
    }
}
