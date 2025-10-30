package co.notix;

/* loaded from: classes.dex */
public abstract class lr {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009b -> B:10:0x009f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(co.notix.no r9, O7.p r10, O7.l r11, E7.d r12) {
        /*
            boolean r0 = r12 instanceof co.notix.kr
            if (r0 == 0) goto L13
            r0 = r12
            co.notix.kr r0 = (co.notix.kr) r0
            int r1 = r0.f12648g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12648g = r1
            goto L18
        L13:
            co.notix.kr r0 = new co.notix.kr
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f12647f
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f12648g
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Throwable r9 = r0.f12646e
            java.util.Iterator r10 = r0.f12645d
            O7.l r11 = r0.f12644c
            O7.p r2 = r0.f12643b
            co.notix.no r4 = r0.f12642a
            a.AbstractC0485a.A(r12)
            goto L9f
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            a.AbstractC0485a.A(r12)
            T7.c r12 = new T7.c
            int r2 = r9.f12837a
            r12.<init>(r3, r2, r3)
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>()
            java.util.Iterator r12 = r12.iterator()
            r8 = r11
            r11 = r10
            r10 = r12
            r12 = r8
        L51:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto La6
            r2 = r10
            B7.x r2 = (B7.x) r2
            int r2 = r2.a()
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> L68
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r4 = r12.invoke(r4)     // Catch: java.lang.Throwable -> L68
            goto L6d
        L68:
            r4 = move-exception
            A7.i r4 = a.AbstractC0485a.h(r4)
        L6d:
            java.lang.Throwable r5 = A7.j.a(r4)
            if (r5 != 0) goto L74
            return r4
        L74:
            if (r11 == 0) goto L7e
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            r11.invoke(r4, r5)
        L7e:
            int r4 = r9.f12837a
            if (r2 >= r4) goto La4
            co.notix.mo r4 = r9.f12838b
            long r6 = r4.a(r2)
            r0.f12642a = r9
            r0.f12643b = r11
            r0.f12644c = r12
            r0.f12645d = r10
            r0.f12646e = r5
            r0.f12648g = r3
            java.lang.Object r2 = Y7.B.g(r6, r0)
            if (r2 != r1) goto L9b
            return r1
        L9b:
            r4 = r9
            r2 = r11
            r11 = r12
            r9 = r5
        L9f:
            r12 = r11
            r11 = r2
            r2 = r9
            r9 = r4
            goto L51
        La4:
            r2 = r5
            goto L51
        La6:
            A7.i r9 = a.AbstractC0485a.h(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.lr.a(co.notix.no, O7.p, O7.l, E7.d):java.lang.Object");
    }
}
