package i7;

/* renamed from: i7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1392g implements L6.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1392g f18862a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final L6.c f18863b = L6.c.a("eventType");

    /* renamed from: c, reason: collision with root package name */
    public static final L6.c f18864c = L6.c.a("sessionData");

    /* renamed from: d, reason: collision with root package name */
    public static final L6.c f18865d = L6.c.a("applicationInfo");

    @Override // L6.a
    public final void a(Object obj, Object obj2) {
        N n7 = (N) obj;
        L6.e eVar = (L6.e) obj2;
        n7.getClass();
        eVar.a(f18863b, EnumC1399n.SESSION_START);
        eVar.a(f18864c, n7.f18773a);
        eVar.a(f18865d, n7.f18774b);
    }
}
