package B0;

import A7.n;
import C0.g;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.net.Uri;

/* loaded from: classes.dex */
public final class c extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f594r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f595s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Uri f596t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Uri uri, E7.d dVar2) {
        super(2, dVar2);
        this.f595s = dVar;
        this.f596t = uri;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new c(this.f595s, this.f596t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f594r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            g gVar = this.f595s.f597a;
            this.f594r = 1;
            if (gVar.i(this.f596t, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
