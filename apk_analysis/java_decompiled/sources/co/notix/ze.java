package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.Context;
import co.notix.push.NotixNotificationModifier;
import co.notix.push.data.NotificationOverrides;

/* loaded from: classes.dex */
public final class ze extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NotixNotificationModifier f13674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df f13675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ we f13676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze(E7.d dVar, NotixNotificationModifier notixNotificationModifier, df dfVar, we weVar) {
        super(2, dVar);
        this.f13674a = notixNotificationModifier;
        this.f13675b = dfVar;
        this.f13676c = weVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new ze(dVar, this.f13674a, this.f13675b, this.f13676c);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ze) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        NotixNotificationModifier notixNotificationModifier = this.f13674a;
        Context a5 = this.f13675b.a();
        we weVar = this.f13676c;
        return notixNotificationModifier.modify(a5, new NotificationOverrides(weVar.f13422a, weVar.f13423b, weVar.f13424c, weVar.f13425d, weVar.f13426e, weVar.f13427f, weVar.f13428g, weVar.f13429h, weVar.f13430i, weVar.j, weVar.f13431k, weVar.f13432l));
    }
}
