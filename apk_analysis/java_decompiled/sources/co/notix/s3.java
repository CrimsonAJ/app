package co.notix;

import a.AbstractC0485a;
import java.util.List;

/* loaded from: classes.dex */
public final class s3 extends G7.j implements O7.q {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ List f13147a;

    public s3(E7.d dVar) {
        super(3, dVar);
    }

    @Override // O7.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s3 s3Var = new s3((E7.d) obj3);
        s3Var.f13147a = (List) obj;
        return s3Var.invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        return this.f13147a;
    }
}
