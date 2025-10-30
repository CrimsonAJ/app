package z8;

import F0.ExecutorC0101e;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: z8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2252a implements InterfaceC2262k {

    /* renamed from: b, reason: collision with root package name */
    public static final C2252a f25608b = new C2252a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C2252a f25609c = new C2252a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C2252a f25610d = new C2252a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C2252a f25611e = new C2252a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final C2252a f25612f = new C2252a(4);

    /* renamed from: g, reason: collision with root package name */
    public static final C2252a f25613g = new C2252a(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25614a;

    public /* synthetic */ C2252a(int i9) {
        this.f25614a = i9;
    }

    public List a(ExecutorC0101e executorC0101e) {
        return Collections.singletonList(new C2264m(executorC0101e));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, x8.i, x8.h] */
    @Override // z8.InterfaceC2262k
    public Object b(Object obj) {
        switch (this.f25614a) {
            case 0:
                return obj.toString();
            case 1:
                i8.N n7 = (i8.N) obj;
                try {
                    ?? obj2 = new Object();
                    n7.g().p(obj2);
                    i8.M m9 = new i8.M(n7.d(), n7.a(), obj2, 0);
                    n7.close();
                    return m9;
                } catch (Throwable th) {
                    n7.close();
                    throw th;
                }
            case 2:
                return (i8.J) obj;
            case 3:
                return (i8.N) obj;
            case 4:
                ((i8.N) obj).close();
                return A7.n.f558a;
            default:
                ((i8.N) obj).close();
                return null;
        }
    }

    public List c() {
        return Collections.EMPTY_LIST;
    }

    public String d(Method method, int i9) {
        return "parameter #" + (i9 + 1);
    }

    public Object e(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean f(Method method) {
        return false;
    }
}
