package R7;

import java.util.Random;

/* loaded from: classes.dex */
public abstract class a extends d {
    @Override // R7.d
    public final int a(int i9) {
        return ((-i9) >> 31) & (e().nextInt() >>> (32 - i9));
    }

    @Override // R7.d
    public final int b() {
        return e().nextInt();
    }

    @Override // R7.d
    public final long c() {
        return e().nextLong();
    }

    public abstract Random e();

    public final int f(int i9) {
        return e().nextInt(i9);
    }
}
