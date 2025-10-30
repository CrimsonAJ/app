package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import co.notix.log.LogLevel;

/* loaded from: classes.dex */
public final class ul implements md {

    /* renamed from: b, reason: collision with root package name */
    public final yl f13313b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0484z f13314c;

    public ul(lm remoteLoggerRepository, InterfaceC0484z csIo) {
        kotlin.jvm.internal.h.e(remoteLoggerRepository, "remoteLoggerRepository");
        kotlin.jvm.internal.h.e(csIo, "csIo");
        this.f13313b = remoteLoggerRepository;
        this.f13314c = csIo;
        LogLevel logLevel = LogLevel.NONE;
    }

    @Override // co.notix.md
    public final void a(String msg, Throwable th) {
        kotlin.jvm.internal.h.e(msg, "msg");
        B.r(this.f13314c, null, new rl(msg, th, this, null), 3);
    }

    @Override // co.notix.md
    public final void b(String msg) {
        kotlin.jvm.internal.h.e(msg, "msg");
        B.r(this.f13314c, null, new tl(msg, this, null), 3);
    }

    @Override // co.notix.md
    public final void setLogLevel(LogLevel logLevel) {
        kotlin.jvm.internal.h.e(logLevel, "<set-?>");
    }

    @Override // co.notix.md
    public final void a(String msg) {
        kotlin.jvm.internal.h.e(msg, "msg");
        B.r(this.f13314c, null, new sl(msg, this, null), 3);
    }
}
