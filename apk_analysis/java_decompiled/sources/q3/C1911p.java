package q3;

import l4.AbstractC1566a;
import l4.y;

/* renamed from: q3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1911p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f22338a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f22339b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22340c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22341d;

    public C1911p(long j, long[] jArr, long[] jArr2) {
        boolean z9;
        boolean z10;
        if (jArr.length == jArr2.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        int length = jArr2.length;
        if (length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f22341d = z10;
        if (z10 && jArr2[0] > 0) {
            int i9 = length + 1;
            long[] jArr3 = new long[i9];
            this.f22338a = jArr3;
            long[] jArr4 = new long[i9];
            this.f22339b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.f22338a = jArr;
            this.f22339b = jArr2;
        }
        this.f22340c = j;
    }

    @Override // q3.r
    public final boolean e() {
        return this.f22341d;
    }

    @Override // q3.r
    public final q g(long j) {
        if (!this.f22341d) {
            s sVar = s.f22344c;
            return new q(sVar, sVar);
        }
        long[] jArr = this.f22339b;
        int e8 = y.e(jArr, j, true);
        long j4 = jArr[e8];
        long[] jArr2 = this.f22338a;
        s sVar2 = new s(j4, jArr2[e8]);
        if (j4 != j && e8 != jArr.length - 1) {
            int i9 = e8 + 1;
            return new q(sVar2, new s(jArr[i9], jArr2[i9]));
        }
        return new q(sVar2, sVar2);
    }

    @Override // q3.r
    public final long h() {
        return this.f22340c;
    }
}
