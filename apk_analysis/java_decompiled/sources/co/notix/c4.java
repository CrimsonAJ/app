package co.notix;

import Y7.InterfaceC0465h0;
import Y7.InterfaceC0484z;
import b8.AbstractC0714M;
import b8.InterfaceC0706E;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class c4 implements i3 {

    /* renamed from: a, reason: collision with root package name */
    public final o4 f11974a;

    /* renamed from: b, reason: collision with root package name */
    public final d4 f11975b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0484z f11976c;

    /* renamed from: d, reason: collision with root package name */
    public final tb f11977d;

    /* renamed from: e, reason: collision with root package name */
    public final te f11978e;

    /* renamed from: f, reason: collision with root package name */
    public final b f11979f;

    /* renamed from: g, reason: collision with root package name */
    public final t7 f11980g;

    /* renamed from: h, reason: collision with root package name */
    public final g8.a f11981h;

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f11982i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0706E f11983k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0465h0 f11984l;

    public c4(o4 adRequest, d4 adRepository, InterfaceC0484z csIo, tb notixInitializationStatusProvider, te networkStatusRepository, b activityCreatedProvider, t7 cachingImageLoader) {
        kotlin.jvm.internal.h.e(adRequest, "adRequest");
        kotlin.jvm.internal.h.e(adRepository, "adRepository");
        kotlin.jvm.internal.h.e(csIo, "csIo");
        kotlin.jvm.internal.h.e(notixInitializationStatusProvider, "notixInitializationStatusProvider");
        kotlin.jvm.internal.h.e(networkStatusRepository, "networkStatusRepository");
        kotlin.jvm.internal.h.e(activityCreatedProvider, "activityCreatedProvider");
        kotlin.jvm.internal.h.e(cachingImageLoader, "cachingImageLoader");
        this.f11974a = adRequest;
        this.f11975b = adRepository;
        this.f11976c = csIo;
        this.f11977d = notixInitializationStatusProvider;
        this.f11978e = networkStatusRepository;
        this.f11979f = activityCreatedProvider;
        this.f11980g = cachingImageLoader;
        this.f11981h = g8.e.a();
        this.f11982i = new ConcurrentHashMap();
        this.f11983k = AbstractC0714M.b(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(co.notix.c4 r5, E7.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof co.notix.n3
            if (r0 == 0) goto L16
            r0 = r6
            co.notix.n3 r0 = (co.notix.n3) r0
            int r1 = r0.f12808c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f12808c = r1
            goto L1b
        L16:
            co.notix.n3 r0 = new co.notix.n3
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f12806a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12808c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            a.AbstractC0485a.A(r6)
            return r6
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            a.AbstractC0485a.A(r6)
            goto L4b
        L39:
            a.AbstractC0485a.A(r6)
            r0.f12808c = r4
            co.notix.d4 r6 = r5.f11975b
            co.notix.o4 r5 = r5.f11974a
            co.notix.l4 r6 = (co.notix.l4) r6
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 != r1) goto L4b
            goto L5a
        L4b:
            b8.e r6 = (b8.InterfaceC0725e) r6
            co.notix.m3 r5 = new co.notix.m3
            r5.<init>(r6)
            r0.f12808c = r3
            java.lang.Object r5 = b8.AbstractC0714M.m(r5, r0)
            if (r5 != r1) goto L5b
        L5a:
            return r1
        L5b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.c4.a(co.notix.c4, E7.d):java.lang.Object");
    }

    public static final Object a(c4 c4Var, l lVar, E7.d dVar) {
        String str;
        F7.a aVar = F7.a.f2587a;
        String str2 = lVar.f12655g;
        if ((str2 != null && !W7.d.U(str2)) || ((str = lVar.f12656h) != null && !W7.d.U(str))) {
            return new m(lVar.f12654f, lVar.f12655g, lVar.f12656h);
        }
        Object a5 = c4Var.a(lVar, dVar);
        return a5 == aVar ? a5 : (g) a5;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0096 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(co.notix.l r20, E7.d r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof co.notix.b4
            if (r3 == 0) goto L19
            r3 = r2
            co.notix.b4 r3 = (co.notix.b4) r3
            int r4 = r3.f11912e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f11912e = r4
            goto L1e
        L19:
            co.notix.b4 r3 = new co.notix.b4
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f11910c
            F7.a r4 = F7.a.f2587a
            int r5 = r3.f11912e
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L4d
            if (r5 == r7) goto L41
            if (r5 != r6) goto L39
            java.lang.Object r1 = r3.f11909b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            java.lang.Object r3 = r3.f11908a
            co.notix.l r3 = (co.notix.l) r3
            a.AbstractC0485a.A(r2)
            goto L8a
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L41:
            java.lang.Object r1 = r3.f11909b
            co.notix.l r1 = (co.notix.l) r1
            java.lang.Object r5 = r3.f11908a
            co.notix.c4 r5 = (co.notix.c4) r5
            a.AbstractC0485a.A(r2)
            goto L68
        L4d:
            a.AbstractC0485a.A(r2)
            java.lang.String r2 = r1.f12651c
            if (r2 == 0) goto Lb1
            co.notix.t7 r5 = r0.f11980g
            co.notix.no r9 = co.notix.no.f12836f
            r3.f11908a = r0
            r3.f11909b = r1
            r3.f11912e = r7
            co.notix.c8 r5 = (co.notix.c8) r5
            java.lang.Object r2 = r5.a(r2, r9, r3)
            if (r2 != r4) goto L67
            goto L83
        L67:
            r5 = r0
        L68:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 != 0) goto L6d
            goto Lb1
        L6d:
            java.lang.String r7 = r1.f12652d
            if (r7 == 0) goto L90
            co.notix.t7 r5 = r5.f11980g
            co.notix.no r9 = co.notix.no.f12836f
            r3.f11908a = r1
            r3.f11909b = r2
            r3.f11912e = r6
            co.notix.c8 r5 = (co.notix.c8) r5
            java.lang.Object r3 = r5.a(r7, r9, r3)
            if (r3 != r4) goto L84
        L83:
            return r4
        L84:
            r18 = r3
            r3 = r1
            r1 = r2
            r2 = r18
        L8a:
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r12 = r1
            r14 = r2
            r1 = r3
            goto L92
        L90:
            r12 = r2
            r14 = r8
        L92:
            java.lang.String r10 = r1.f12649a
            if (r10 != 0) goto L97
            return r8
        L97:
            java.lang.String r11 = r1.f12650b
            if (r11 != 0) goto L9c
            return r8
        L9c:
            java.lang.String r2 = r1.f12653e
            if (r2 != 0) goto La1
            return r8
        La1:
            java.lang.String r3 = r1.f12654f
            java.lang.String r13 = r1.f12651c
            java.lang.String r15 = r1.f12652d
            co.notix.i r9 = new co.notix.i
            r16 = r2
            r17 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            return r9
        Lb1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.c4.a(co.notix.l, E7.d):java.lang.Object");
    }
}
