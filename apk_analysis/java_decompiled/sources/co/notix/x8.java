package co.notix;

import co.notix.log.LogLevel;

/* loaded from: classes.dex */
public final class x8 implements md {

    /* renamed from: b, reason: collision with root package name */
    public final md[] f13506b;

    public x8(md... loggers) {
        kotlin.jvm.internal.h.e(loggers, "loggers");
        this.f13506b = loggers;
        LogLevel logLevel = LogLevel.NONE;
    }

    @Override // co.notix.md
    public final void a(String msg, Throwable th) {
        kotlin.jvm.internal.h.e(msg, "msg");
        for (md mdVar : this.f13506b) {
            mdVar.a(msg, th);
        }
    }

    @Override // co.notix.md
    public final void b(String msg) {
        kotlin.jvm.internal.h.e(msg, "msg");
        for (md mdVar : this.f13506b) {
            mdVar.b(msg);
        }
    }

    @Override // co.notix.md
    public final void setLogLevel(LogLevel value) {
        kotlin.jvm.internal.h.e(value, "value");
        for (md mdVar : this.f13506b) {
            mdVar.setLogLevel(value);
        }
    }

    @Override // co.notix.md
    public final void a(String msg) {
        kotlin.jvm.internal.h.e(msg, "msg");
        for (md mdVar : this.f13506b) {
            mdVar.a(msg);
        }
    }
}
