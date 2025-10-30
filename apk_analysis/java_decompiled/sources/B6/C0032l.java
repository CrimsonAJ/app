package B6;

/* renamed from: B6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032l implements L6.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0032l f1003a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final L6.c f1004b = L6.c.a("baseAddress");

    /* renamed from: c, reason: collision with root package name */
    public static final L6.c f1005c = L6.c.a("size");

    /* renamed from: d, reason: collision with root package name */
    public static final L6.c f1006d = L6.c.a("name");

    /* renamed from: e, reason: collision with root package name */
    public static final L6.c f1007e = L6.c.a("uuid");

    @Override // L6.a
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        L6.e eVar = (L6.e) obj2;
        T t7 = (T) ((x0) obj);
        eVar.f(f1004b, t7.f860a);
        eVar.f(f1005c, t7.f861b);
        eVar.a(f1006d, t7.f862c);
        String str = t7.f863d;
        if (str != null) {
            bArr = str.getBytes(O0.f841a);
        } else {
            bArr = null;
        }
        eVar.a(f1007e, bArr);
    }
}
