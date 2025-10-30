package u2;

import java.io.IOException;

/* renamed from: u2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2070d extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final String f23605a;

    public C2070d(String str) {
        this.f23605a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f23605a;
    }
}
