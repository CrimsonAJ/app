package x;

import java.util.HashSet;
import java.util.Iterator;
import u0.z;
import w.AbstractC2128h;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2148c {

    /* renamed from: b, reason: collision with root package name */
    public final C2149d f24339b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24340c;

    /* renamed from: d, reason: collision with root package name */
    public C2148c f24341d;

    /* renamed from: g, reason: collision with root package name */
    public w.i f24344g;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f24338a = null;

    /* renamed from: e, reason: collision with root package name */
    public int f24342e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f24343f = -1;

    public C2148c(C2149d c2149d, int i9) {
        this.f24339b = c2149d;
        this.f24340c = i9;
    }

    public final void a(C2148c c2148c, int i9) {
        b(c2148c, i9, -1, false);
    }

    public final boolean b(C2148c c2148c, int i9, int i10, boolean z9) {
        if (c2148c == null) {
            h();
            return true;
        }
        if (!z9 && !g(c2148c)) {
            return false;
        }
        this.f24341d = c2148c;
        if (c2148c.f24338a == null) {
            c2148c.f24338a = new HashSet();
        }
        this.f24341d.f24338a.add(this);
        if (i9 > 0) {
            this.f24342e = i9;
        } else {
            this.f24342e = 0;
        }
        this.f24343f = i10;
        return true;
    }

    public final int c() {
        C2148c c2148c;
        if (this.f24339b.f24365V == 8) {
            return 0;
        }
        int i9 = this.f24343f;
        if (i9 > -1 && (c2148c = this.f24341d) != null && c2148c.f24339b.f24365V == 8) {
            return i9;
        }
        return this.f24342e;
    }

    public final C2148c d() {
        int i9 = this.f24340c;
        int b9 = AbstractC2128h.b(i9);
        C2149d c2149d = this.f24339b;
        switch (b9) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c2149d.f24396z;
            case 2:
                return c2149d.f24345A;
            case 3:
                return c2149d.f24394x;
            case 4:
                return c2149d.f24395y;
            default:
                throw new AssertionError(z.j(i9));
        }
    }

    public final boolean e() {
        HashSet hashSet = this.f24338a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C2148c) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        if (this.f24341d != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0024. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(x.C2148c r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L5
            goto L60
        L5:
            r1 = 6
            int r2 = r8.f24340c
            r3 = 1
            x.d r4 = r9.f24339b
            int r9 = r9.f24340c
            if (r9 != r2) goto L1c
            if (r2 != r1) goto L5e
            boolean r9 = r4.f24393w
            if (r9 == 0) goto L60
            x.d r9 = r8.f24339b
            boolean r9 = r9.f24393w
            if (r9 != 0) goto L5e
            goto L60
        L1c:
            int r5 = w.AbstractC2128h.b(r2)
            r6 = 8
            r7 = 9
            switch(r5) {
                case 0: goto L60;
                case 1: goto L4c;
                case 2: goto L38;
                case 3: goto L4c;
                case 4: goto L38;
                case 5: goto L60;
                case 6: goto L31;
                case 7: goto L60;
                case 8: goto L60;
                default: goto L27;
            }
        L27:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r0 = u0.z.j(r2)
            r9.<init>(r0)
            throw r9
        L31:
            if (r9 == r1) goto L60
            if (r9 == r6) goto L60
            if (r9 == r7) goto L60
            goto L5e
        L38:
            r1 = 3
            if (r9 == r1) goto L41
            r1 = 5
            if (r9 != r1) goto L3f
            goto L41
        L3f:
            r1 = r0
            goto L42
        L41:
            r1 = r3
        L42:
            boolean r2 = r4 instanceof x.C2153h
            if (r2 == 0) goto L4b
            if (r1 != 0) goto L5e
            if (r9 != r7) goto L60
            goto L5e
        L4b:
            return r1
        L4c:
            r1 = 2
            if (r9 == r1) goto L55
            r1 = 4
            if (r9 != r1) goto L53
            goto L55
        L53:
            r1 = r0
            goto L56
        L55:
            r1 = r3
        L56:
            boolean r2 = r4 instanceof x.C2153h
            if (r2 == 0) goto L5f
            if (r1 != 0) goto L5e
            if (r9 != r6) goto L60
        L5e:
            return r3
        L5f:
            return r1
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C2148c.g(x.c):boolean");
    }

    public final void h() {
        HashSet hashSet;
        C2148c c2148c = this.f24341d;
        if (c2148c != null && (hashSet = c2148c.f24338a) != null) {
            hashSet.remove(this);
        }
        this.f24341d = null;
        this.f24342e = 0;
        this.f24343f = -1;
    }

    public final void i() {
        w.i iVar = this.f24344g;
        if (iVar == null) {
            this.f24344g = new w.i(1);
        } else {
            iVar.c();
        }
    }

    public final String toString() {
        return this.f24339b.f24366W + ":" + z.j(this.f24340c);
    }
}
