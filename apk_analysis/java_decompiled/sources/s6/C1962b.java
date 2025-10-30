package s6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import k3.C1487c;

/* renamed from: s6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1962b {

    /* renamed from: a, reason: collision with root package name */
    public final String f22747a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f22748b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f22749c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22750d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22751e;

    /* renamed from: f, reason: collision with root package name */
    public final d f22752f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f22753g;

    public C1962b(String str, Set set, Set set2, int i9, int i10, d dVar, Set set3) {
        this.f22747a = str;
        this.f22748b = Collections.unmodifiableSet(set);
        this.f22749c = Collections.unmodifiableSet(set2);
        this.f22750d = i9;
        this.f22751e = i10;
        this.f22752f = dVar;
        this.f22753g = Collections.unmodifiableSet(set3);
    }

    public static C1961a a(Class cls) {
        return new C1961a(cls, new Class[0]);
    }

    public static C1961a b(p pVar) {
        return new C1961a(pVar, new p[0]);
    }

    public static C1962b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            Z0.a.d(cls2, "Null interface");
            hashSet.add(p.a(cls2));
        }
        return new C1962b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C1487c(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f22748b.toArray()) + ">{" + this.f22750d + ", type=" + this.f22751e + ", deps=" + Arrays.toString(this.f22749c.toArray()) + "}";
    }
}
