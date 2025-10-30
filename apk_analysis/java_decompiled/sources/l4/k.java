package l4;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20500a;

    /* renamed from: b, reason: collision with root package name */
    public A6.i f20501b = new A6.i();

    /* renamed from: c, reason: collision with root package name */
    public boolean f20502c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20503d;

    public k(Object obj) {
        this.f20500a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            return this.f20500a.equals(((k) obj).f20500a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20500a.hashCode();
    }
}
