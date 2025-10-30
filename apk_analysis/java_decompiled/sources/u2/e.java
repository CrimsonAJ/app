package u2;

import z8.C2266o;

/* loaded from: classes.dex */
public final class e extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final C2266o f23606a;

    public e(C2266o c2266o) {
        super(null, c2266o);
        this.f23606a = c2266o;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f23606a;
    }
}
