package X1;

import Y7.InterfaceC0484z;
import java.util.List;

/* loaded from: classes.dex */
public final class s extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Object f8287r;

    /* renamed from: s, reason: collision with root package name */
    public int f8288s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f8289t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f8290u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(y yVar, List list, E7.d dVar) {
        super(2, dVar);
        this.f8289t = yVar;
        this.f8290u = list;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new s(this.f8289t, this.f8290u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x002f, code lost:
    
        if (r11 == r0) goto L38;
     */
    @Override // G7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            F7.a r0 = F7.a.f2587a
            int r1 = r10.f8288s
            A7.n r2 = A7.n.f558a
            X1.y r3 = r10.f8289t
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L1c
            if (r1 != r4) goto L14
            a.AbstractC0485a.A(r11)
            return r2
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            a.AbstractC0485a.A(r11)
            A7.j r11 = (A7.j) r11
            java.lang.Object r11 = r11.f550a
            goto L32
        L24:
            a.AbstractC0485a.A(r11)
            r10.f8288s = r5
            O2.t r11 = r3.f8316m
            java.lang.Object r11 = r11.a(r5, r10)
            if (r11 != r0) goto L32
            goto L9e
        L32:
            boolean r1 = r11 instanceof A7.i
            if (r1 != 0) goto L8e
            r1 = r11
            H2.k r1 = (H2.k) r1
            java.util.List r5 = r1.f3034b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L42
            goto L9f
        L42:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r6 = r10.f8290u
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L85
            java.lang.Object r7 = B7.k.p0(r6)
            H2.n r7 = (H2.n) r7
            boolean r8 = r7 instanceof H2.m
            if (r8 == 0) goto L85
            r5.add(r7)
            r5.add(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L68:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L82
            java.lang.Object r7 = r6.next()
            r8 = r7
            H2.n r8 = (H2.n) r8
            boolean r9 = r8 instanceof H2.m
            if (r9 != 0) goto L68
            boolean r8 = r8 instanceof H2.k
            if (r8 == 0) goto L7e
            goto L68
        L7e:
            r1.add(r7)
            goto L68
        L82:
            r5.addAll(r1)
        L85:
            b8.Q r1 = r3.f8317n
            r1.getClass()
            r6 = 0
            r1.j(r6, r5)
        L8e:
            java.lang.Throwable r1 = A7.j.a(r11)
            if (r1 == 0) goto L9f
            r10.f8287r = r11
            r10.f8288s = r4
            java.lang.Object r11 = r3.f(r1, r10)
            if (r11 != r0) goto L9f
        L9e:
            return r0
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
