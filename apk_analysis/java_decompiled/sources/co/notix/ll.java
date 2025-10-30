package co.notix;

import java.util.Map;

/* loaded from: classes.dex */
public final class ll {

    /* renamed from: a, reason: collision with root package name */
    public final ql f12721a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12722b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12723c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12724d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f12725e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12726f;

    public ll(ql level, String message, String str, long j, boolean z9) {
        kotlin.jvm.internal.h.e(level, "level");
        kotlin.jvm.internal.h.e(message, "message");
        this.f12721a = level;
        this.f12722b = message;
        this.f12723c = str;
        this.f12724d = j;
        this.f12725e = null;
        this.f12726f = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll)) {
            return false;
        }
        ll llVar = (ll) obj;
        return this.f12721a == llVar.f12721a && kotlin.jvm.internal.h.a(this.f12722b, llVar.f12722b) && kotlin.jvm.internal.h.a(this.f12723c, llVar.f12723c) && this.f12724d == llVar.f12724d && kotlin.jvm.internal.h.a(this.f12725e, llVar.f12725e) && this.f12726f == llVar.f12726f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int a5 = h.a(this.f12722b, this.f12721a.hashCode() * 31, 31);
        String str = this.f12723c;
        int i9 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.f12724d;
        int i10 = (((int) (j ^ (j >>> 32))) + ((a5 + hashCode) * 31)) * 31;
        Map map = this.f12725e;
        if (map != null) {
            i9 = map.hashCode();
        }
        int i11 = (i10 + i9) * 31;
        boolean z9 = this.f12726f;
        int i12 = z9;
        if (z9 != 0) {
            i12 = 1;
        }
        return i11 + i12;
    }

    public final String toString() {
        return "RemoteLog(level=" + this.f12721a + ", message=" + this.f12722b + ", stacktrace=" + this.f12723c + ", timestamp=" + this.f12724d + ", tags=" + this.f12725e + ", sendPrev=" + this.f12726f + ')';
    }
}
