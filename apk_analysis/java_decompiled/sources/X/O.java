package X;

import G0.C0152s;
import Y7.C0463g0;
import Y7.InterfaceC0465h0;
import Y7.InterfaceC0484z;
import Y7.y0;
import b7.C0701c;
import b8.InterfaceC0725e;
import java.util.List;
import l1.C1535g;

/* loaded from: classes.dex */
public final class O implements InterfaceC0408h {

    /* renamed from: a, reason: collision with root package name */
    public final Z.f f8011a;

    /* renamed from: b, reason: collision with root package name */
    public final C0701c f8012b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0484z f8013c;

    /* renamed from: f, reason: collision with root package name */
    public int f8016f;

    /* renamed from: g, reason: collision with root package name */
    public y0 f8017g;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.firebase.messaging.s f8019i;

    /* renamed from: l, reason: collision with root package name */
    public final C1535g f8021l;

    /* renamed from: d, reason: collision with root package name */
    public final C0419t f8014d = new C0419t(new C0420u(this, null));

    /* renamed from: e, reason: collision with root package name */
    public final g8.d f8015e = g8.e.a();

    /* renamed from: h, reason: collision with root package name */
    public final C0152s f8018h = new C0152s();
    public final A7.l j = Z0.a.q(new C0413m(this, 1));

    /* renamed from: k, reason: collision with root package name */
    public final A7.l f8020k = Z0.a.q(new C0413m(this, 0));

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, l1.g] */
    public O(Z.f fVar, List list, C0701c c0701c, InterfaceC0484z interfaceC0484z) {
        this.f8011a = fVar;
        this.f8012b = c0701c;
        this.f8013c = interfaceC0484z;
        this.f8019i = new com.google.firebase.messaging.s(this, list);
        C0.b bVar = new C0.b(1, this);
        L l9 = new L(this, null);
        ?? obj = new Object();
        obj.f20182a = interfaceC0484z;
        obj.f20183b = l9;
        obj.f20184c = M4.a.a(Integer.MAX_VALUE, 6, null);
        obj.f20185d = new C0701c(20);
        InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) interfaceC0484z.g().get(C0463g0.f8811a);
        if (interfaceC0465h0 != null) {
            interfaceC0465h0.O(new A0.b(bVar, 1, obj));
        }
        this.f8021l = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005a), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(X.O r4, G7.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof X.C0421v
            if (r0 == 0) goto L16
            r0 = r5
            X.v r0 = (X.C0421v) r0
            int r1 = r0.f8120v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f8120v = r1
            goto L1b
        L16:
            X.v r0 = new X.v
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f8118t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f8120v
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            g8.d r4 = r0.f8117s
            X.O r0 = r0.f8116r
            a.AbstractC0485a.A(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            a.AbstractC0485a.A(r5)
            r0.f8116r = r4
            g8.d r5 = r4.f8015e
            r0.f8117s = r5
            r0.f8120v = r3
            java.lang.Object r0 = r5.d(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = 0
            int r1 = r4.f8016f     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 + (-1)
            r4.f8016f = r1     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L5f
            Y7.y0 r1 = r4.f8017g     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5a
            r1.d(r0)     // Catch: java.lang.Throwable -> L5d
        L5a:
            r4.f8017g = r0     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r4 = move-exception
            goto L65
        L5f:
            r5.a(r0)
            A7.n r4 = A7.n.f558a
            return r4
        L65:
            r5.a(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O.c(X.O, G7.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|(7:55|(1:(1:(1:59)(2:61|62))(3:63|64|65))(1:66)|60|17|(1:19)(1:23)|20|21)(5:8|9|10|(3:12|13|14)(3:30|(1:32)(1:53)|(2:34|(2:36|(1:38))(2:45|46))(2:47|(2:49|50)(2:51|52)))|24)|39|40|41))|68|6|(0)(0)|39|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /* JADX WARN: Type inference failed for: r2v3, types: [G7.j, O7.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [G7.j, O7.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(X.O r9, X.Q r10, G7.c r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O.d(X.O, X.Q, G7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:12:0x004b, B:14:0x0052), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(X.O r4, G7.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof X.C0424y
            if (r0 == 0) goto L16
            r0 = r5
            X.y r0 = (X.C0424y) r0
            int r1 = r0.f8133v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f8133v = r1
            goto L1b
        L16:
            X.y r0 = new X.y
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f8131t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f8133v
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            g8.d r4 = r0.f8130s
            X.O r0 = r0.f8129r
            a.AbstractC0485a.A(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            a.AbstractC0485a.A(r5)
            r0.f8129r = r4
            g8.d r5 = r4.f8015e
            r0.f8130s = r5
            r0.f8133v = r3
            java.lang.Object r0 = r5.d(r0)
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = 0
            int r1 = r4.f8016f     // Catch: java.lang.Throwable -> L61
            int r1 = r1 + r3
            r4.f8016f = r1     // Catch: java.lang.Throwable -> L61
            if (r1 != r3) goto L63
            Y7.z r1 = r4.f8013c     // Catch: java.lang.Throwable -> L61
            X.z r2 = new X.z     // Catch: java.lang.Throwable -> L61
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L61
            r3 = 3
            Y7.y0 r1 = Y7.B.r(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L61
            r4.f8017g = r1     // Catch: java.lang.Throwable -> L61
            goto L63
        L61:
            r4 = move-exception
            goto L69
        L63:
            r5.a(r0)
            A7.n r4 = A7.n.f558a
            return r4
        L69:
            r5.a(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O.e(X.O, G7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(X.O r8, boolean r9, E7.d r10) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O.f(X.O, boolean, E7.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|72|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0062, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0023. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0142 A[Catch: all -> 0x016e, TryCatch #2 {all -> 0x016e, blocks: (B:27:0x0130, B:29:0x0142, B:32:0x014a), top: B:26:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014a A[Catch: all -> 0x016e, TRY_LEAVE, TryCatch #2 {all -> 0x016e, blocks: (B:27:0x0130, B:29:0x0142, B:32:0x014a), top: B:26:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2 A[Catch: b -> 0x0062, TryCatch #0 {b -> 0x0062, blocks: (B:36:0x005d, B:37:0x0101, B:40:0x006b, B:41:0x00e3, B:56:0x0088, B:58:0x00a2, B:59:0x00a8, B:65:0x0091, B:68:0x00d0), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.jvm.internal.m, java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.o, java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [O7.l, kotlin.jvm.internal.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(X.O r9, boolean r10, G7.c r11) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O.g(X.O, boolean, G7.c):java.lang.Object");
    }

    @Override // X.InterfaceC0408h
    public final Object a(O7.p pVar, G7.c cVar) {
        c0 c0Var = (c0) cVar.getContext().get(b0.f8051a);
        if (c0Var != null) {
            c0Var.b(this);
        }
        return Y7.B.C(new c0(c0Var, this), new K(this, pVar, null), cVar);
    }

    @Override // X.InterfaceC0408h
    public final InterfaceC0725e b() {
        return this.f8014d;
    }

    public final Y h() {
        return (Y) this.f8020k.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.s(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(G7.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.A
            if (r0 == 0) goto L13
            r0 = r6
            X.A r0 = (X.A) r0
            int r1 = r0.f7949v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7949v = r1
            goto L18
        L13:
            X.A r0 = new X.A
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f7947t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f7949v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f7946s
            X.O r0 = r0.f7945r
            a.AbstractC0485a.A(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            X.O r2 = r0.f7945r
            a.AbstractC0485a.A(r6)
            goto L51
        L3e:
            a.AbstractC0485a.A(r6)
            X.Y r6 = r5.h()
            r0.f7945r = r5
            r0.f7949v = r4
            java.lang.Integer r6 = r6.a()
            if (r6 != r1) goto L50
            goto L65
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            com.google.firebase.messaging.s r4 = r2.f8019i     // Catch: java.lang.Throwable -> L6d
            r0.f7945r = r2     // Catch: java.lang.Throwable -> L6d
            r0.f7946s = r6     // Catch: java.lang.Throwable -> L6d
            r0.f7949v = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r4.s(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            A7.n r6 = A7.n.f558a
            return r6
        L69:
            r1 = r6
            r6 = r0
            r0 = r2
            goto L6f
        L6d:
            r0 = move-exception
            goto L69
        L6f:
            G0.s r0 = r0.f8018h
            X.S r2 = new X.S
            r2.<init>(r6, r1)
            r0.c(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O.i(G7.c):java.lang.Object");
    }

    public final Object j(G7.c cVar) {
        return ((Z.i) this.j.getValue()).a(new C0417q(3, (E7.d) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.m, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r11, boolean r12, G7.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.M
            if (r0 == 0) goto L13
            r0 = r13
            X.M r0 = (X.M) r0
            int r1 = r0.f8003u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8003u = r1
            goto L18
        L13:
            X.M r0 = new X.M
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f8001s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f8003u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.m r11 = r0.f8000r
            a.AbstractC0485a.A(r13)
            goto L56
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            a.AbstractC0485a.A(r13)
            kotlin.jvm.internal.m r5 = new kotlin.jvm.internal.m
            r5.<init>()
            A7.l r13 = r10.j
            java.lang.Object r13 = r13.getValue()
            Z.i r13 = (Z.i) r13
            X.N r4 = new X.N
            r9 = 0
            r6 = r10
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f8000r = r5
            r0.f8003u = r3
            java.lang.Object r11 = r13.b(r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            int r11 = r11.f20157a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O.k(java.lang.Object, boolean, G7.c):java.lang.Object");
    }
}
