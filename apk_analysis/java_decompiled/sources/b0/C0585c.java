package b0;

import A7.n;
import O7.p;
import a.AbstractC0485a;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585c extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f10459r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f10460s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ G7.j f10461t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0585c(p pVar, E7.d dVar) {
        super(2, dVar);
        this.f10461t = (G7.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0585c c0585c = new C0585c(this.f10461t, dVar);
        c0585c.f10460s = obj;
        return c0585c;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0585c) create((C0584b) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [G7.j, O7.p] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f10459r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            C0584b c0584b = (C0584b) this.f10460s;
            this.f10459r = 1;
            obj = this.f10461t.invoke(c0584b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C0584b c0584b2 = (C0584b) obj;
        kotlin.jvm.internal.h.c(c0584b2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        c0584b2.f10458b.f8863a.set(true);
        return c0584b2;
    }
}
