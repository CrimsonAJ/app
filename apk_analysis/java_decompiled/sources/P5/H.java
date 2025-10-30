package P5;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5903a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5904b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5905c;

    public H(Object obj, Object obj2, Object obj3) {
        this.f5903a = obj;
        this.f5904b = obj2;
        this.f5905c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f5903a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f5904b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f5905c);
        StringBuilder sb = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
