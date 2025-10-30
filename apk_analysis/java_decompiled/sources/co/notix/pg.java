package co.notix;

import Y7.InterfaceC0484z;
import co.notix.push.firebase.NotixFirebaseMessagingService;
import com.google.firebase.messaging.r;

/* loaded from: classes.dex */
public final class pg extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f12968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NotixFirebaseMessagingService f12969c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(r rVar, NotixFirebaseMessagingService notixFirebaseMessagingService, E7.d dVar) {
        super(2, dVar);
        this.f12968b = rVar;
        this.f12969c = notixFirebaseMessagingService;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new pg(this.f12968b, this.f12969c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((pg) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.pg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
