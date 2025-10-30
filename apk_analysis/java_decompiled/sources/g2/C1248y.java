package g2;

import Y7.InterfaceC0484z;
import com.anilab.android.ui.player.PlayerActivity;

/* renamed from: g2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1248y extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f17702r;

    /* renamed from: s, reason: collision with root package name */
    public int f17703s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17704t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1248y(E7.d dVar, PlayerActivity playerActivity) {
        super(2, dVar);
        this.f17704t = playerActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1248y(dVar, this.f17704t);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((C1248y) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
        return F7.a.f2587a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r6.f17703s
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            int r1 = r6.f17702r
            a.AbstractC0485a.A(r7)
            goto L38
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            a.AbstractC0485a.A(r7)
        L1b:
            r1 = r2
        L1c:
            int r7 = X7.a.f8474d
            X7.c r7 = X7.c.SECONDS
            long r4 = Z0.a.A(r3, r7)
            r6.f17702r = r1
            r6.f17703s = r3
            long r4 = Y7.B.z(r4)
            java.lang.Object r7 = Y7.B.g(r4, r6)
            if (r7 != r0) goto L33
            goto L35
        L33:
            A7.n r7 = A7.n.f558a
        L35:
            if (r7 != r0) goto L38
            return r0
        L38:
            int r1 = r1 + r3
            com.anilab.android.ui.player.PlayerActivity r7 = r6.f17704t
            boolean r4 = r7.f13801Z
            if (r4 == 0) goto L42
            r7.p0(r2)
        L42:
            int r4 = r1 % 30
            if (r4 != 0) goto L1c
            j3.r0 r1 = r7.Z()
            D.n r1 = (D.n) r1
            boolean r1 = r1.d0()
            if (r1 == 0) goto L1b
            r7.V(r3)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C1248y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
