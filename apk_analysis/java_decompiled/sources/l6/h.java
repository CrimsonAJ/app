package l6;

import F4.y;

/* loaded from: classes.dex */
public abstract class h extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str) {
        super(str);
        y.f(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, Throwable th) {
        super(str, th);
        y.f(str, "Detail message must not be empty");
    }
}
