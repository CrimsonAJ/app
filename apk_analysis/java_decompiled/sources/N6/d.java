package N6;

import L6.g;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements M6.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f5235f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f5236g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5238a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5239b;

    /* renamed from: c, reason: collision with root package name */
    public final a f5240c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5241d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f5234e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f5237h = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [N6.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [N6.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [N6.c, java.lang.Object] */
    static {
        final int i9 = 0;
        f5235f = new L6.f() { // from class: N6.b
            @Override // L6.a
            public final void a(Object obj, Object obj2) {
                switch (i9) {
                    case 0:
                        ((g) obj2).d((String) obj);
                        return;
                    default:
                        ((g) obj2).g(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final int i10 = 1;
        f5236g = new L6.f() { // from class: N6.b
            @Override // L6.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).d((String) obj);
                        return;
                    default:
                        ((g) obj2).g(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f5238a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f5239b = hashMap2;
        this.f5240c = f5234e;
        this.f5241d = false;
        hashMap2.put(String.class, f5235f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f5236g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f5237h);
        hashMap.remove(Date.class);
    }

    public final M6.a a(Class cls, L6.d dVar) {
        this.f5238a.put(cls, dVar);
        this.f5239b.remove(cls);
        return this;
    }
}
