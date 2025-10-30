package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import b8.InterfaceC0707F;
import co.notix.push.firebase.NotixFirebaseMessagingService;

/* loaded from: classes.dex */
public final class qg extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NotixFirebaseMessagingService f13046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13047b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(NotixFirebaseMessagingService notixFirebaseMessagingService, String str, E7.d dVar) {
        super(2, dVar);
        this.f13046a = notixFirebaseMessagingService;
        this.f13047b = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new qg(this.f13046a, this.f13047b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((qg) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        kd kdVar = md.f12779a;
        kdVar.getClass();
        kdVar.f12607b.a("FirebaseMessagingService.onNewToken");
        ra raVar = this.f13046a.f13000b;
        String newToken = this.f13047b;
        raVar.getClass();
        kotlin.jvm.internal.h.e(newToken, "newToken");
        InterfaceC0707F interfaceC0707F = raVar.f13095d;
        va vaVar = new va(newToken);
        C0718Q c0718q = (C0718Q) interfaceC0707F;
        c0718q.getClass();
        c0718q.j(null, vaVar);
        return A7.n.f558a;
    }
}
