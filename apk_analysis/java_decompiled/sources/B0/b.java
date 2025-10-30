package B0;

import A7.n;
import C0.g;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.net.Uri;
import android.view.InputEvent;

/* loaded from: classes.dex */
public final class b extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f590r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f591s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Uri f592t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InputEvent f593u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Uri uri, InputEvent inputEvent, E7.d dVar2) {
        super(2, dVar2);
        this.f591s = dVar;
        this.f592t = uri;
        this.f593u = inputEvent;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new b(this.f591s, this.f592t, this.f593u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f590r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            g gVar = this.f591s.f597a;
            this.f590r = 1;
            if (gVar.f(this.f592t, this.f593u, this) == aVar) {
                return aVar;
            }
        }
        return n.f558a;
    }
}
