package Q0;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface d extends Closeable {
    a Z();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z9);
}
