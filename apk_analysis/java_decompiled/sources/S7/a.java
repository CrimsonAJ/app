package S7;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class a extends R7.a {
    @Override // R7.d
    public final long d(long j) {
        return ThreadLocalRandom.current().nextLong(0L, j);
    }

    @Override // R7.a
    public final Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        h.d(current, "current(...)");
        return current;
    }
}
