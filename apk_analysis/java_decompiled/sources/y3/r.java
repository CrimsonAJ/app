package y3;

import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final o f24907a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24908b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f24909c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f24910d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24911e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f24912f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f24913g;

    /* renamed from: h, reason: collision with root package name */
    public final long f24914h;

    public r(o oVar, long[] jArr, int[] iArr, int i9, long[] jArr2, int[] iArr2, long j) {
        boolean z9;
        boolean z10;
        if (iArr.length == jArr2.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC1566a.h(z10);
        AbstractC1566a.h(iArr2.length == jArr2.length);
        this.f24907a = oVar;
        this.f24909c = jArr;
        this.f24910d = iArr;
        this.f24911e = i9;
        this.f24912f = jArr2;
        this.f24913g = iArr2;
        this.f24914h = j;
        this.f24908b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f24912f;
        for (int b9 = y.b(jArr, j, true); b9 < jArr.length; b9++) {
            if ((this.f24913g[b9] & 1) != 0) {
                return b9;
            }
        }
        return -1;
    }
}
