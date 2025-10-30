package z3;

import l4.AbstractC1566a;
import l4.y;
import q3.r;

/* renamed from: z3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2238b implements InterfaceC2243g {

    /* renamed from: a, reason: collision with root package name */
    public final C2242f f25368a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25369b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25370c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2245i f25371d;

    /* renamed from: e, reason: collision with root package name */
    public int f25372e;

    /* renamed from: f, reason: collision with root package name */
    public long f25373f;

    /* renamed from: g, reason: collision with root package name */
    public long f25374g;

    /* renamed from: h, reason: collision with root package name */
    public long f25375h;

    /* renamed from: i, reason: collision with root package name */
    public long f25376i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public long f25377k;

    /* renamed from: l, reason: collision with root package name */
    public long f25378l;

    public C2238b(AbstractC2245i abstractC2245i, long j, long j4, long j9, long j10, boolean z9) {
        boolean z10;
        if (j >= 0 && j4 > j) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC1566a.h(z10);
        this.f25371d = abstractC2245i;
        this.f25369b = j;
        this.f25370c = j4;
        if (j9 != j4 - j && !z9) {
            this.f25372e = 0;
        } else {
            this.f25373f = j10;
            this.f25372e = 4;
        }
        this.f25368a = new C2242f();
    }

    @Override // z3.InterfaceC2243g
    public final r e() {
        if (this.f25373f != 0) {
            return new C2237a(this);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // z3.InterfaceC2243g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o(q3.C1902g r29) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.C2238b.o(q3.g):long");
    }

    @Override // z3.InterfaceC2243g
    public final void t(long j) {
        this.f25375h = y.j(j, 0L, this.f25373f - 1);
        this.f25372e = 2;
        this.f25376i = this.f25369b;
        this.j = this.f25370c;
        this.f25377k = 0L;
        this.f25378l = this.f25373f;
    }
}
