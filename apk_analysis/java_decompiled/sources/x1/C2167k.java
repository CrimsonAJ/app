package x1;

import android.content.Context;
import java.util.ArrayList;
import t1.C1994c;

/* renamed from: x1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2167k {

    /* renamed from: a, reason: collision with root package name */
    public final C1.i f24551a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f24552b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24553c;

    /* renamed from: d, reason: collision with root package name */
    public final C1.i f24554d;

    /* renamed from: e, reason: collision with root package name */
    public final D1.h f24555e;

    /* renamed from: f, reason: collision with root package name */
    public final C1994c f24556f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24557g;

    public C2167k(C1.i iVar, ArrayList arrayList, int i9, C1.i iVar2, D1.h hVar, C1994c c1994c, boolean z9) {
        this.f24551a = iVar;
        this.f24552b = arrayList;
        this.f24553c = i9;
        this.f24554d = iVar2;
        this.f24555e = hVar;
        this.f24556f = c1994c;
        this.f24557g = z9;
    }

    public final void a(C1.i iVar, C2165i c2165i) {
        Context context = iVar.f1191a;
        C1.i iVar2 = this.f24551a;
        if (context == iVar2.f1191a) {
            if (iVar.f1192b != C1.k.f1216b) {
                if (iVar.f1193c == iVar2.f1193c) {
                    if (iVar.f1210u == iVar2.f1210u) {
                        if (iVar.f1211v == iVar2.f1211v) {
                            return;
                        }
                        throw new IllegalStateException(("Interceptor '" + c2165i + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                    }
                    throw new IllegalStateException(("Interceptor '" + c2165i + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + c2165i + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + c2165i + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + c2165i + "' cannot modify the request's context.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(C1.i r13, G7.c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof x1.C2166j
            if (r0 == 0) goto L13
            r0 = r14
            x1.j r0 = (x1.C2166j) r0
            int r1 = r0.f24550v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24550v = r1
            goto L18
        L13:
            x1.j r0 = new x1.j
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f24548t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f24550v
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            x1.i r13 = r0.f24547s
            x1.k r0 = r0.f24546r
            a.AbstractC0485a.A(r14)
            goto L6c
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            a.AbstractC0485a.A(r14)
            java.util.ArrayList r6 = r12.f24552b
            int r14 = r12.f24553c
            if (r14 <= 0) goto L47
            int r2 = r14 + (-1)
            java.lang.Object r2 = r6.get(r2)
            x1.i r2 = (x1.C2165i) r2
            r12.a(r13, r2)
        L47:
            java.lang.Object r2 = r6.get(r14)
            x1.i r2 = (x1.C2165i) r2
            int r7 = r14 + 1
            x1.k r4 = new x1.k
            C1.i r5 = r12.f24551a
            t1.c r10 = r12.f24556f
            D1.h r9 = r12.f24555e
            boolean r11 = r12.f24557g
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.f24546r = r12
            r0.f24547s = r2
            r0.f24550v = r3
            java.lang.Object r14 = r2.d(r4, r0)
            if (r14 != r1) goto L6a
            return r1
        L6a:
            r0 = r12
            r13 = r2
        L6c:
            C1.j r14 = (C1.j) r14
            C1.i r1 = r14.b()
            r0.a(r1, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.C2167k.b(C1.i, G7.c):java.lang.Object");
    }
}
