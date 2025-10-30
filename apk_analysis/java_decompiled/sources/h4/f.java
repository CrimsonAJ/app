package h4;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f17908a;

    /* renamed from: b, reason: collision with root package name */
    public final C1278b f17909b;

    public f(int i9, C1278b c1278b) {
        this.f17908a = i9;
        this.f17909b = c1278b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f17908a, ((f) obj).f17908a);
    }
}
