package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.request.ChangePasswordRequest;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import v2.C2102b;
import z8.C2266o;

/* loaded from: classes.dex */
public final class T extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1292r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g0 f1293s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f1294t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f1295u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(g0 g0Var, String str, String str2, E7.d dVar) {
        super(2, dVar);
        this.f1293s = g0Var;
        this.f1294t = str;
        this.f1295u = str2;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new T(this.f1293s, this.f1294t, this.f1295u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1292r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            g0 g0Var = this.f1293s;
            B2.b bVar = g0Var.f1359a;
            String n7 = AbstractC0953k1.n(O4.h.t(g0Var.f1360b), g6.o.f17761a.p());
            String str = this.f1294t;
            if (str.length() == 0) {
                str = null;
            }
            ChangePasswordRequest changePasswordRequest = new ChangePasswordRequest(str, this.f1295u);
            this.f1292r = 1;
            obj = bVar.l(n7, changePasswordRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        z8.O o9 = (z8.O) obj;
        if (o9.f25587a.g()) {
            return new C2102b(A7.n.f558a);
        }
        throw new C2266o(o9);
    }
}
