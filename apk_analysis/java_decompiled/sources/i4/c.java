package i4;

import N3.m0;
import android.os.SystemClock;
import j3.M;
import java.util.Arrays;
import java.util.List;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public abstract class c implements q {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f18504a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18505b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f18506c;

    /* renamed from: d, reason: collision with root package name */
    public final M[] f18507d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f18508e;

    /* renamed from: f, reason: collision with root package name */
    public int f18509f;

    public c(m0 m0Var, int[] iArr) {
        boolean z9;
        int i9 = 0;
        if (iArr.length > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        m0Var.getClass();
        this.f18504a = m0Var;
        int length = iArr.length;
        this.f18505b = length;
        this.f18507d = new M[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f18507d[i10] = m0Var.f5167d[iArr[i10]];
        }
        Arrays.sort(this.f18507d, new E6.a(11));
        this.f18506c = new int[this.f18505b];
        while (true) {
            int i11 = this.f18505b;
            if (i9 < i11) {
                this.f18506c[i9] = m0Var.a(this.f18507d[i9]);
                i9++;
            } else {
                this.f18508e = new long[i11];
                return;
            }
        }
    }

    @Override // i4.q
    public final /* synthetic */ void b(boolean z9) {
    }

    @Override // i4.q
    public final M c(int i9) {
        return this.f18507d[i9];
    }

    @Override // i4.q
    public final int e(int i9) {
        return this.f18506c[i9];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f18504a == cVar.f18504a && Arrays.equals(this.f18506c, cVar.f18506c)) {
                return true;
            }
        }
        return false;
    }

    @Override // i4.q
    public int f(long j, List list) {
        return list.size();
    }

    @Override // i4.q
    public final boolean g(long j, int i9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean h7 = h(elapsedRealtime, i9);
        for (int i10 = 0; i10 < this.f18505b && !h7; i10++) {
            if (i10 != i9 && !h(elapsedRealtime, i10)) {
                h7 = true;
            } else {
                h7 = false;
            }
        }
        if (!h7) {
            return false;
        }
        long[] jArr = this.f18508e;
        long j4 = jArr[i9];
        int i11 = y.f20553a;
        long j9 = elapsedRealtime + j;
        if (((j ^ j9) & (elapsedRealtime ^ j9)) < 0) {
            j9 = Long.MAX_VALUE;
        }
        jArr[i9] = Math.max(j4, j9);
        return true;
    }

    @Override // i4.q
    public final boolean h(long j, int i9) {
        if (this.f18508e[i9] > j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f18509f == 0) {
            this.f18509f = Arrays.hashCode(this.f18506c) + (System.identityHashCode(this.f18504a) * 31);
        }
        return this.f18509f;
    }

    @Override // i4.q
    public final int j() {
        return this.f18506c[p()];
    }

    @Override // i4.q
    public final int k(M m9) {
        for (int i9 = 0; i9 < this.f18505b; i9++) {
            if (this.f18507d[i9] == m9) {
                return i9;
            }
        }
        return -1;
    }

    @Override // i4.q
    public final m0 l() {
        return this.f18504a;
    }

    @Override // i4.q
    public final int length() {
        return this.f18506c.length;
    }

    @Override // i4.q
    public final M m() {
        return this.f18507d[p()];
    }

    @Override // i4.q
    public final /* synthetic */ boolean n(long j, P3.e eVar, List list) {
        return false;
    }

    @Override // i4.q
    public final /* synthetic */ void s() {
    }

    @Override // i4.q
    public final /* synthetic */ void t() {
    }

    @Override // i4.q
    public final int u(int i9) {
        for (int i10 = 0; i10 < this.f18505b; i10++) {
            if (this.f18506c[i10] == i9) {
                return i10;
            }
        }
        return -1;
    }

    @Override // i4.q
    public void d() {
    }

    @Override // i4.q
    public void i() {
    }

    @Override // i4.q
    public void q(float f9) {
    }
}
