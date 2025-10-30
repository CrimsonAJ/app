package co.notix;

import co.notix.log.LogLevel;

/* loaded from: classes.dex */
public final class kd implements md {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kd f12606c = new kd();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x8 f12607b = wq.e();

    @Override // co.notix.md
    public final void a(String msg, Throwable th) {
        kotlin.jvm.internal.h.e(msg, "msg");
        this.f12607b.a(msg, th);
    }

    @Override // co.notix.md
    public final void b(String msg) {
        kotlin.jvm.internal.h.e(msg, "msg");
        this.f12607b.b(msg);
    }

    @Override // co.notix.md
    public final void setLogLevel(LogLevel logLevel) {
        kotlin.jvm.internal.h.e(logLevel, "<set-?>");
        this.f12607b.setLogLevel(logLevel);
    }

    @Override // co.notix.md
    public final void a(String msg) {
        kotlin.jvm.internal.h.e(msg, "msg");
        this.f12607b.a(msg);
    }
}
