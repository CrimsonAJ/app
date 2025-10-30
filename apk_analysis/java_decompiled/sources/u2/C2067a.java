package u2;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2067a extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final String f23602a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f23603b;

    public /* synthetic */ C2067a(String str, int i9) {
        this((i9 & 1) != 0 ? null : str, (Throwable) null);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f23603b;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f23602a;
    }

    public C2067a(String str, Throwable th) {
        super(str, th);
        this.f23602a = str;
        this.f23603b = th;
    }
}
