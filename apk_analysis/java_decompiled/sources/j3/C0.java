package j3;

/* loaded from: classes.dex */
public final class C0 implements InterfaceC1453f {

    /* renamed from: a, reason: collision with root package name */
    public Object f19235a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19236b;

    /* renamed from: c, reason: collision with root package name */
    public int f19237c;

    /* renamed from: d, reason: collision with root package name */
    public long f19238d;

    /* renamed from: e, reason: collision with root package name */
    public long f19239e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19240f;

    /* renamed from: g, reason: collision with root package name */
    public O3.b f19241g = O3.b.f5451f;

    public final long a(int i9, int i10) {
        O3.a a5 = this.f19241g.a(i9);
        if (a5.f5444b != -1) {
            return a5.f5448f[i10];
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(long r10) {
        /*
            r9 = this;
            O3.b r0 = r9.f19241g
            long r1 = r9.f19238d
            r0.getClass()
            r3 = -9223372036854775808
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            r6 = -1
            if (r5 == 0) goto L4b
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L1c
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 < 0) goto L1c
            goto L4b
        L1c:
            int r1 = r0.f5457d
        L1e:
            int r2 = r0.f5454a
            if (r1 >= r2) goto L48
            O3.a r5 = r0.a(r1)
            long r7 = r5.f5443a
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L36
            O3.a r5 = r0.a(r1)
            long r7 = r5.f5443a
            int r5 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r5 <= 0) goto L45
        L36:
            O3.a r5 = r0.a(r1)
            int r7 = r5.f5444b
            if (r7 == r6) goto L48
            int r5 = r5.a(r6)
            if (r5 >= r7) goto L45
            goto L48
        L45:
            int r1 = r1 + 1
            goto L1e
        L48:
            if (r1 >= r2) goto L4b
            return r1
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C0.b(long):int");
    }

    public final int c(long j) {
        O3.b bVar = this.f19241g;
        long j4 = this.f19238d;
        int i9 = bVar.f5454a - 1;
        while (i9 >= 0 && j != Long.MIN_VALUE) {
            long j9 = bVar.a(i9).f5443a;
            if (j9 == Long.MIN_VALUE) {
                if (j4 != -9223372036854775807L && j >= j4) {
                    break;
                }
                i9--;
            } else {
                if (j >= j9) {
                    break;
                }
                i9--;
            }
        }
        if (i9 >= 0) {
            O3.a a5 = bVar.a(i9);
            int i10 = a5.f5444b;
            if (i10 != -1) {
                for (int i11 = 0; i11 < i10; i11++) {
                    int i12 = a5.f5447e[i11];
                    if (i12 != 0 && i12 != 1) {
                    }
                }
            }
            return i9;
        }
        return -1;
    }

    public final long d(int i9) {
        return this.f19241g.a(i9).f5443a;
    }

    public final int e(int i9, int i10) {
        O3.a a5 = this.f19241g.a(i9);
        if (a5.f5444b != -1) {
            return a5.f5447e[i10];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0.class.equals(obj.getClass())) {
            C0 c02 = (C0) obj;
            if (l4.y.a(this.f19235a, c02.f19235a) && l4.y.a(this.f19236b, c02.f19236b) && this.f19237c == c02.f19237c && this.f19238d == c02.f19238d && this.f19239e == c02.f19239e && this.f19240f == c02.f19240f && l4.y.a(this.f19241g, c02.f19241g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i9) {
        return this.f19241g.a(i9).a(-1);
    }

    public final boolean g(int i9) {
        return this.f19241g.a(i9).f5450h;
    }

    public final void h(Object obj, Object obj2, int i9, long j, long j4, O3.b bVar, boolean z9) {
        this.f19235a = obj;
        this.f19236b = obj2;
        this.f19237c = i9;
        this.f19238d = j;
        this.f19239e = j4;
        this.f19241g = bVar;
        this.f19240f = z9;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f19235a;
        int i9 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (217 + hashCode) * 31;
        Object obj2 = this.f19236b;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        }
        int i11 = (((i10 + i9) * 31) + this.f19237c) * 31;
        long j = this.f19238d;
        int i12 = (i11 + ((int) (j ^ (j >>> 32)))) * 31;
        long j4 = this.f19239e;
        return this.f19241g.hashCode() + ((((i12 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.f19240f ? 1 : 0)) * 31);
    }
}
