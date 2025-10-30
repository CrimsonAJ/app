package o7;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: o7.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1727s extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1729u f21716b;

    public /* synthetic */ C1727s(C1729u c1729u, int i9) {
        this.f21715a = i9;
        this.f21716b = c1729u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f21715a) {
            case 0:
                this.f21716b.clear();
                return;
            default:
                this.f21716b.clear();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f21715a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            o7.u r0 = r4.f21716b
            boolean r5 = r0.containsKey(r5)
            return r5
        Lc:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L38
            o7.u r0 = r4.f21716b
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r2 = r5.getKey()
            r3 = 0
            if (r2 == 0) goto L21
            o7.t r0 = r0.a(r2, r1)     // Catch: java.lang.ClassCastException -> L21
            goto L22
        L21:
            r0 = r3
        L22:
            if (r0 == 0) goto L35
            java.lang.Object r2 = r0.f21724h
            java.lang.Object r5 = r5.getValue()
            if (r2 == r5) goto L34
            if (r2 == 0) goto L35
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L35
        L34:
            r3 = r0
        L35:
            if (r3 == 0) goto L38
            r1 = 1
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.C1727s.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f21715a) {
            case 0:
                return new C1726r(this.f21716b, 0);
            default:
                return new C1726r(this.f21716b, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f21715a
            switch(r0) {
                case 0: goto L19;
                default: goto L5;
            }
        L5:
            o7.u r0 = r5.f21716b
            r1 = 0
            r2 = 0
            if (r6 == 0) goto Lf
            o7.t r2 = r0.a(r6, r1)     // Catch: java.lang.ClassCastException -> Lf
        Lf:
            r6 = 1
            if (r2 == 0) goto L15
            r0.c(r2, r6)
        L15:
            if (r2 == 0) goto L18
            r1 = r6
        L18:
            return r1
        L19:
            boolean r0 = r6 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L1f
            goto L4a
        L1f:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            o7.u r0 = r5.f21716b
            java.lang.Object r2 = r6.getKey()
            r3 = 0
            if (r2 == 0) goto L2f
            o7.t r2 = r0.a(r2, r1)     // Catch: java.lang.ClassCastException -> L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L43
            java.lang.Object r4 = r2.f21724h
            java.lang.Object r6 = r6.getValue()
            if (r4 == r6) goto L42
            if (r4 == 0) goto L43
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L43
        L42:
            r3 = r2
        L43:
            if (r3 != 0) goto L46
            goto L4a
        L46:
            r1 = 1
            r0.c(r3, r1)
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.C1727s.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f21715a) {
            case 0:
                return this.f21716b.f21730d;
            default:
                return this.f21716b.f21730d;
        }
    }
}
