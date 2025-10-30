package u2;

import java.io.IOException;

/* renamed from: u2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2069c extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final IOException f23604a;

    public C2069c(IOException iOException) {
        super(iOException);
        this.f23604a = iOException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f23604a;
    }
}
