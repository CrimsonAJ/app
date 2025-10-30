package co.notix;

import android.util.Log;
import co.notix.log.LogLevel;

/* loaded from: classes.dex */
public final class jd implements md {

    /* renamed from: b, reason: collision with root package name */
    public LogLevel f12546b = LogLevel.IMPORTANT;

    @Override // co.notix.md
    public final void a(String msg, Throwable th) {
        kotlin.jvm.internal.h.e(msg, "msg");
        if (this.f12546b.isGreaterOrEqual$sdk_release(LogLevel.ERROR)) {
            Log.e("Notix", msg, th);
        }
    }

    @Override // co.notix.md
    public final void b(String msg) {
        kotlin.jvm.internal.h.e(msg, "msg");
        if (this.f12546b.isGreaterOrEqual$sdk_release(LogLevel.FULL)) {
            Log.v("Notix", msg);
        }
    }

    @Override // co.notix.md
    public final void setLogLevel(LogLevel logLevel) {
        kotlin.jvm.internal.h.e(logLevel, "<set-?>");
        this.f12546b = logLevel;
    }

    @Override // co.notix.md
    public final void a(String msg) {
        kotlin.jvm.internal.h.e(msg, "msg");
        if (this.f12546b.isGreaterOrEqual$sdk_release(LogLevel.IMPORTANT)) {
            Log.i("Notix", msg);
        }
    }
}
