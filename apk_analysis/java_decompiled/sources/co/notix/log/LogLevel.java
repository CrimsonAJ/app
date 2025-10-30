package co.notix.log;

import androidx.annotation.Keep;
import kotlin.jvm.internal.h;

@Keep
/* loaded from: classes.dex */
public enum LogLevel {
    NONE,
    ERROR,
    IMPORTANT,
    FULL;

    public final boolean isGreaterOrEqual$sdk_release(LogLevel other) {
        h.e(other, "other");
        return ordinal() >= other.ordinal();
    }
}
