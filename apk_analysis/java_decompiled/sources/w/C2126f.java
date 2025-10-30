package w;

/* renamed from: w.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2126f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public i f23944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2127g f23945b;

    public C2126f(C2127g c2127g) {
        this.f23945b = c2127g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f23944a.f23952b - ((i) obj).f23952b;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f23944a != null) {
            for (int i9 = 0; i9 < 9; i9++) {
                str = str + this.f23944a.f23958h[i9] + " ";
            }
        }
        return str + "] " + this.f23944a;
    }
}
