package t8;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f23325a = new Handler();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int i9;
        int min;
        kotlin.jvm.internal.h.e(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.f23323a;
        String loggerName = record.getLoggerName();
        kotlin.jvm.internal.h.d(loggerName, "record.loggerName");
        int intValue = record.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            i9 = 5;
        } else if (record.getLevel().intValue() == level.intValue()) {
            i9 = 4;
        } else {
            i9 = 3;
        }
        String message = record.getMessage();
        kotlin.jvm.internal.h.d(message, "record.message");
        Throwable thrown = record.getThrown();
        String str = (String) c.f23324b.get(loggerName);
        if (str == null) {
            str = W7.d.h0(23, loggerName);
        }
        if (Log.isLoggable(str, i9)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i10 = 0;
            while (i10 < length) {
                int R2 = W7.d.R(message, '\n', i10, 4);
                if (R2 == -1) {
                    R2 = length;
                }
                while (true) {
                    min = Math.min(R2, i10 + 4000);
                    String substring = message.substring(i10, min);
                    kotlin.jvm.internal.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i9, str, substring);
                    if (min >= R2) {
                        break;
                    } else {
                        i10 = min;
                    }
                }
                i10 = min + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
