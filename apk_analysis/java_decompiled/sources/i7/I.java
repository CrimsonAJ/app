package i7;

import a.AbstractC0485a;
import b0.C0584b;

/* loaded from: classes.dex */
public final class I extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18757r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f18758s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(String str, E7.d dVar) {
        super(2, dVar);
        this.f18758s = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        I i9 = new I(this.f18758s, dVar);
        i9.f18757r = obj;
        return i9;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        I i9 = (I) create((C0584b) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        i9.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        C0584b c0584b = (C0584b) this.f18757r;
        c0584b.getClass();
        b0.g key = AbstractC1404t.f18913c;
        kotlin.jvm.internal.h.e(key, "key");
        c0584b.d(key, this.f18758s);
        return A7.n.f558a;
    }
}
