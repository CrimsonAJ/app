package M1;

import Y7.y0;
import androidx.lifecycle.Y;
import androidx.lifecycle.e0;
import b8.AbstractC0714M;
import b8.C0713L;
import b8.C0718Q;

/* loaded from: classes.dex */
public abstract class r extends e0 {

    /* renamed from: d, reason: collision with root package name */
    public final C0713L f4740d = AbstractC0714M.b(7);

    /* renamed from: e, reason: collision with root package name */
    public final C0718Q f4741e = AbstractC0714M.c(Boolean.FALSE);

    public final y0 d(boolean z9, O7.p pVar) {
        return Y7.B.r(Y.g(this), null, new p(z9, this, pVar, null), 3);
    }

    public final Object e(E e8, E7.d dVar) {
        Object emit = this.f4740d.emit(e8, dVar);
        if (emit == F7.a.f2587a) {
            return emit;
        }
        return A7.n.f558a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.Throwable r9, E7.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof M1.q
            if (r0 == 0) goto L13
            r0 = r10
            M1.q r0 = (M1.q) r0
            int r1 = r0.f4739v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4739v = r1
            goto L18
        L13:
            M1.q r0 = new M1.q
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f4737t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f4739v
            A7.n r3 = A7.n.f558a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L4a
            if (r2 == r7) goto L42
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            a.AbstractC0485a.A(r10)
            return r3
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            a.AbstractC0485a.A(r10)
            return r3
        L3e:
            a.AbstractC0485a.A(r10)
            return r3
        L42:
            java.lang.Throwable r9 = r0.f4736s
            M1.r r2 = r0.f4735r
            a.AbstractC0485a.A(r10)
            goto L5b
        L4a:
            a.AbstractC0485a.A(r10)
            r0.f4735r = r8
            r0.f4736s = r9
            r0.f4739v = r7
            java.lang.Object r10 = l6.AbstractC1570b.m(r0)
            if (r10 != r1) goto L5a
            goto Lc4
        L5a:
            r2 = r8
        L5b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L6a
            u6.b r10 = u6.C2083b.a()
            r10.b(r9)
        L6a:
            boolean r10 = r9 instanceof u2.C2069c
            r7 = 0
            if (r10 == 0) goto L84
            M1.D r9 = new M1.D
            r10 = 2132017475(0x7f140143, float:1.967323E38)
            r9.<init>(r10)
            r0.f4735r = r7
            r0.f4736s = r7
            r0.f4739v = r6
            java.lang.Object r9 = r2.e(r9, r0)
            if (r9 != r1) goto Lc5
            goto Lc4
        L84:
            boolean r10 = r9 instanceof u2.C2068b
            if (r10 == 0) goto L9d
            M1.D r9 = new M1.D
            r10 = 2132017482(0x7f14014a, float:1.9673244E38)
            r9.<init>(r10)
            r0.f4735r = r7
            r0.f4736s = r7
            r0.f4739v = r5
            java.lang.Object r9 = r2.e(r9, r0)
            if (r9 != r1) goto Lc5
            goto Lc4
        L9d:
            java.lang.String r9 = r9.getMessage()
            if (r9 == 0) goto Lb0
            boolean r10 = W7.d.U(r9)
            if (r10 == 0) goto Laa
            goto Lb0
        Laa:
            M1.C r10 = new M1.C
            r10.<init>(r9)
            goto Lb8
        Lb0:
            M1.D r10 = new M1.D
            r9 = 2132017536(0x7f140180, float:1.9673353E38)
            r10.<init>(r9)
        Lb8:
            r0.f4735r = r7
            r0.f4736s = r7
            r0.f4739v = r4
            java.lang.Object r9 = r2.e(r10, r0)
            if (r9 != r1) goto Lc5
        Lc4:
            return r1
        Lc5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.r.f(java.lang.Throwable, E7.d):java.lang.Object");
    }
}
