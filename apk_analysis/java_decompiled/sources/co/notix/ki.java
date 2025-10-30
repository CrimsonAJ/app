package co.notix;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class ki {
    public static long a(int i9) {
        long pow = ((long) Math.pow(2.0d, i9)) * 30000;
        long millis = TimeUnit.HOURS.toMillis(5L);
        return pow > millis ? millis : pow;
    }
}
