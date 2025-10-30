package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: b, reason: collision with root package name */
    public static final C0531q f9624b = new C0531q(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f9625a;

    public C(C0524j c0524j) {
        AbstractC0535v.a(c0524j, "output");
        this.f9625a = c0524j;
        c0524j.f9728i = this;
    }

    public void a(int i9, Object obj, T t7) {
        C0524j c0524j = (C0524j) this.f9625a;
        c0524j.e0(i9, 3);
        t7.f((AbstractC0515a) obj, c0524j.f9728i);
        c0524j.e0(i9, 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.B, java.lang.Object] */
    public C() {
        P p9 = P.f9654c;
        Object obj = f9624b;
        try {
            obj = (I) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        I[] iArr = {C0531q.f9761b, obj};
        ?? obj2 = new Object();
        obj2.f9623a = iArr;
        Charset charset = AbstractC0535v.f9765a;
        this.f9625a = obj2;
    }
}
