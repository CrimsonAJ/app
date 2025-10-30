package k4;

import java.io.IOException;

/* loaded from: classes.dex */
public final class L extends IOException {
    public L(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}
