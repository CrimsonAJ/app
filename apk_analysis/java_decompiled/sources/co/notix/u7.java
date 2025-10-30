package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.io.File;

/* loaded from: classes.dex */
public final class u7 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c8 f13278a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(c8 c8Var, E7.d dVar) {
        super(2, dVar);
        this.f13278a = c8Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new u7(this.f13278a, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u7) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        c8 c8Var = this.f13278a;
        fb fbVar = c8.f11988f;
        File[] listFiles = ((File) c8Var.f11992c.getValue()).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.lastModified() + c8.f11989g < System.currentTimeMillis()) {
                    file.delete();
                }
            }
            return A7.n.f558a;
        }
        return null;
    }
}
