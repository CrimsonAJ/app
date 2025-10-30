package S5;

/* loaded from: classes.dex */
public final class b extends Throwable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6938a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i9) {
        super(str);
        this.f6938a = i9;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    private final synchronized Throwable c() {
        return this;
    }

    private final synchronized Throwable d() {
        return this;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f6938a) {
            case 0:
                a();
                return this;
            case 1:
                b();
                return this;
            case 2:
                c();
                return this;
            case 3:
                d();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.f6938a) {
            case 4:
                return null;
            default:
                return super.getCause();
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (this.f6938a) {
            case 4:
                return null;
            default:
                return super.getMessage();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Throwable th) {
        super(str, th);
        this.f6938a = 4;
    }
}
