package N3;

import P5.AbstractC0349q;
import P5.C0352u;
import j3.C1446b0;
import j3.E0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import k4.C1517q;

/* loaded from: classes.dex */
public final class N extends AbstractC0259j {

    /* renamed from: r, reason: collision with root package name */
    public static final j3.Y f4941r;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0250a[] f4942k;

    /* renamed from: l, reason: collision with root package name */
    public final E0[] f4943l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f4944m;

    /* renamed from: n, reason: collision with root package name */
    public final F5.e f4945n;

    /* renamed from: o, reason: collision with root package name */
    public int f4946o;

    /* renamed from: p, reason: collision with root package name */
    public long[][] f4947p;

    /* renamed from: q, reason: collision with root package name */
    public M f4948q;

    /* JADX WARN: Type inference failed for: r4v0, types: [j3.P, j3.Q] */
    static {
        j3.O o9 = new j3.O();
        P5.D d9 = P5.F.f5901b;
        P5.S s9 = P5.S.f5926e;
        List list = Collections.EMPTY_LIST;
        P5.S s10 = P5.S.f5926e;
        f4941r = new j3.Y("MergingMediaSource", new j3.P(o9), null, new j3.T(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C1446b0.f19533Z, j3.V.f19480c);
    }

    public N(AbstractC0250a... abstractC0250aArr) {
        F5.e eVar = new F5.e(9);
        this.f4942k = abstractC0250aArr;
        this.f4945n = eVar;
        this.f4944m = new ArrayList(Arrays.asList(abstractC0250aArr));
        this.f4946o = -1;
        this.f4943l = new E0[abstractC0250aArr.length];
        this.f4947p = new long[0];
        new HashMap();
        AbstractC0349q.c(8, "expectedKeys");
        AbstractC0349q.c(2, "expectedValuesPerKey");
        C0352u b9 = C0352u.b();
        new P5.N();
        if (b9.isEmpty()) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // N3.AbstractC0250a
    public final InterfaceC0272x b(A a5, C1517q c1517q, long j) {
        AbstractC0250a[] abstractC0250aArr = this.f4942k;
        int length = abstractC0250aArr.length;
        InterfaceC0272x[] interfaceC0272xArr = new InterfaceC0272x[length];
        E0[] e0Arr = this.f4943l;
        int b9 = e0Arr[0].b(a5.f5207a);
        for (int i9 = 0; i9 < length; i9++) {
            interfaceC0272xArr[i9] = abstractC0250aArr[i9].b(a5.b(e0Arr[i9].l(b9)), c1517q, j - this.f4947p[b9][i9]);
        }
        return new L(this.f4945n, this.f4947p[b9], interfaceC0272xArr);
    }

    @Override // N3.AbstractC0250a
    public final j3.Y j() {
        AbstractC0250a[] abstractC0250aArr = this.f4942k;
        if (abstractC0250aArr.length > 0) {
            return abstractC0250aArr[0].j();
        }
        return f4941r;
    }

    @Override // N3.AbstractC0259j, N3.AbstractC0250a
    public final void l() {
        M m9 = this.f4948q;
        if (m9 == null) {
            super.l();
            return;
        }
        throw m9;
    }

    @Override // N3.AbstractC0250a
    public final void n(k4.W w7) {
        this.j = w7;
        this.f5125i = l4.y.l(null);
        int i9 = 0;
        while (true) {
            AbstractC0250a[] abstractC0250aArr = this.f4942k;
            if (i9 < abstractC0250aArr.length) {
                z(Integer.valueOf(i9), abstractC0250aArr[i9]);
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // N3.AbstractC0250a
    public final void p(InterfaceC0272x interfaceC0272x) {
        L l9 = (L) interfaceC0272x;
        int i9 = 0;
        while (true) {
            AbstractC0250a[] abstractC0250aArr = this.f4942k;
            if (i9 < abstractC0250aArr.length) {
                AbstractC0250a abstractC0250a = abstractC0250aArr[i9];
                InterfaceC0272x interfaceC0272x2 = l9.f4932a[i9];
                if (interfaceC0272x2 instanceof J) {
                    interfaceC0272x2 = ((J) interfaceC0272x2).f4927a;
                }
                abstractC0250a.p(interfaceC0272x2);
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // N3.AbstractC0259j, N3.AbstractC0250a
    public final void r() {
        super.r();
        Arrays.fill(this.f4943l, (Object) null);
        this.f4946o = -1;
        this.f4948q = null;
        ArrayList arrayList = this.f4944m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f4942k);
    }

    @Override // N3.AbstractC0259j
    public final A v(Object obj, A a5) {
        if (((Integer) obj).intValue() == 0) {
            return a5;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [N3.M, java.io.IOException] */
    @Override // N3.AbstractC0259j
    public final void y(Object obj, AbstractC0250a abstractC0250a, E0 e02) {
        Integer num = (Integer) obj;
        if (this.f4948q == null) {
            if (this.f4946o == -1) {
                this.f4946o = e02.h();
            } else if (e02.h() != this.f4946o) {
                this.f4948q = new IOException();
                return;
            }
            int length = this.f4947p.length;
            E0[] e0Arr = this.f4943l;
            if (length == 0) {
                this.f4947p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f4946o, e0Arr.length);
            }
            ArrayList arrayList = this.f4944m;
            arrayList.remove(abstractC0250a);
            e0Arr[num.intValue()] = e02;
            if (arrayList.isEmpty()) {
                o(e0Arr[0]);
            }
        }
    }
}
