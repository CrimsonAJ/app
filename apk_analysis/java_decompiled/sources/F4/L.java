package F4;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2363a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2364b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2365c;

    public /* synthetic */ L(String str, boolean z9, int i9) {
        this.f2363a = i9;
        this.f2365c = str;
        this.f2364b = z9;
    }

    public String toString() {
        switch (this.f2363a) {
            case 3:
                String str = this.f2365c;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.f2364b);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ L(boolean z9, String str, int i9) {
        this.f2363a = i9;
        this.f2364b = z9;
        this.f2365c = str;
    }
}
