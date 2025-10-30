package Y2;

import java.util.Set;

/* loaded from: classes.dex */
public final class q implements V2.f {

    /* renamed from: a, reason: collision with root package name */
    public final Set f8644a;

    /* renamed from: b, reason: collision with root package name */
    public final j f8645b;

    /* renamed from: c, reason: collision with root package name */
    public final s f8646c;

    public q(Set set, j jVar, s sVar) {
        this.f8644a = set;
        this.f8645b = jVar;
        this.f8646c = sVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y2.r, java.lang.Object] */
    public final r a(String str, V2.c cVar, V2.e eVar) {
        Set set = this.f8644a;
        if (set.contains(cVar)) {
            j jVar = this.f8645b;
            s sVar = this.f8646c;
            ?? obj = new Object();
            obj.f8647a = jVar;
            obj.f8648b = str;
            obj.f8649c = cVar;
            obj.f8650d = eVar;
            obj.f8651e = sVar;
            return obj;
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
