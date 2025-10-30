package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: c, reason: collision with root package name */
    public static final P f9654c = new P();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f9656b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C f9655a = new C();

    public final T a(Class cls) {
        T x5;
        Class cls2;
        AbstractC0535v.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f9656b;
        T t7 = (T) concurrentHashMap.get(cls);
        if (t7 == null) {
            C c3 = this.f9655a;
            c3.getClass();
            Class cls3 = U.f9664a;
            if (!AbstractC0533t.class.isAssignableFrom(cls) && (cls2 = U.f9664a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            S a5 = ((B) c3.f9625a).a(cls);
            if ((a5.f9663d & 2) == 2) {
                boolean isAssignableFrom = AbstractC0533t.class.isAssignableFrom(cls);
                AbstractC0533t abstractC0533t = a5.f9660a;
                if (isAssignableFrom) {
                    x5 = new L(U.f9666c, AbstractC0528n.f9736a, abstractC0533t);
                } else {
                    b0 b0Var = U.f9665b;
                    C0527m c0527m = AbstractC0528n.f9737b;
                    if (c0527m != null) {
                        x5 = new L(b0Var, c0527m, abstractC0533t);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
            } else if (AbstractC0533t.class.isAssignableFrom(cls)) {
                C0527m c0527m2 = null;
                M m9 = N.f9653b;
                C0539z c0539z = A.f9622b;
                b0 b0Var2 = U.f9666c;
                if (AbstractC2128h.b(a5.a()) != 1) {
                    c0527m2 = AbstractC0528n.f9736a;
                }
                C0527m c0527m3 = c0527m2;
                G g9 = H.f9633b;
                int[] iArr = K.f9635n;
                if (a5 instanceof S) {
                    x5 = K.x(a5, m9, c0539z, b0Var2, c0527m3, g9);
                } else {
                    a5.getClass();
                    throw new ClassCastException();
                }
            } else {
                C0527m c0527m4 = null;
                M m10 = N.f9652a;
                C0539z c0539z2 = A.f9621a;
                b0 b0Var3 = U.f9665b;
                if (AbstractC2128h.b(a5.a()) == 1 || (c0527m4 = AbstractC0528n.f9737b) != null) {
                    C0527m c0527m5 = c0527m4;
                    G g10 = H.f9632a;
                    int[] iArr2 = K.f9635n;
                    if (a5 instanceof S) {
                        x5 = K.x(a5, m10, c0539z2, b0Var3, c0527m5, g10);
                    } else {
                        a5.getClass();
                        throw new ClassCastException();
                    }
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            }
            T t9 = (T) concurrentHashMap.putIfAbsent(cls, x5);
            if (t9 != null) {
                return t9;
            }
            return x5;
        }
        return t7;
    }
}
