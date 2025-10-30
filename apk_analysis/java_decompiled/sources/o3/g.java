package o3;

import android.util.SparseArray;
import android.util.SparseIntArray;
import j3.C0;
import j3.D0;
import j3.E0;
import j3.T;
import j3.Y;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends E0 {

    /* renamed from: h, reason: collision with root package name */
    public static final g f21590h = new g(new int[0], new SparseArray());

    /* renamed from: b, reason: collision with root package name */
    public final SparseIntArray f21591b;

    /* renamed from: c, reason: collision with root package name */
    public final Y[] f21592c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f21593d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f21594e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f21595f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f21596g;

    public g(int[] iArr, SparseArray sparseArray) {
        int length = iArr.length;
        this.f21591b = new SparseIntArray(length);
        this.f21593d = Arrays.copyOf(iArr, length);
        this.f21594e = new long[length];
        this.f21595f = new long[length];
        this.f21596g = new boolean[length];
        this.f21592c = new Y[length];
        int i9 = 0;
        while (true) {
            int[] iArr2 = this.f21593d;
            if (i9 < iArr2.length) {
                int i10 = iArr2[i9];
                this.f21591b.put(i10, i9);
                f fVar = (f) sparseArray.get(i10, f.f21584f);
                this.f21592c[i9] = fVar.f21588d;
                this.f21594e[i9] = fVar.f21585a;
                long[] jArr = this.f21595f;
                long j = fVar.f21586b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                jArr[i9] = j;
                this.f21596g[i9] = fVar.f21587c;
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // j3.E0
    public final int b(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return this.f21591b.get(((Integer) obj).intValue(), -1);
    }

    @Override // j3.E0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (Arrays.equals(this.f21593d, gVar.f21593d) && Arrays.equals(this.f21594e, gVar.f21594e) && Arrays.equals(this.f21595f, gVar.f21595f) && Arrays.equals(this.f21596g, gVar.f21596g)) {
            return true;
        }
        return false;
    }

    @Override // j3.E0
    public final C0 f(int i9, C0 c02, boolean z9) {
        int i10 = this.f21593d[i9];
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(i10);
        long j = this.f21594e[i9];
        c02.getClass();
        c02.h(valueOf, valueOf2, i9, j, 0L, O3.b.f5451f, false);
        return c02;
    }

    @Override // j3.E0
    public final int h() {
        return this.f21593d.length;
    }

    @Override // j3.E0
    public final int hashCode() {
        return Arrays.hashCode(this.f21596g) + ((Arrays.hashCode(this.f21595f) + ((Arrays.hashCode(this.f21594e) + (Arrays.hashCode(this.f21593d) * 31)) * 31)) * 31);
    }

    @Override // j3.E0
    public final Object l(int i9) {
        return Integer.valueOf(this.f21593d[i9]);
    }

    @Override // j3.E0
    public final D0 m(int i9, D0 d02, long j) {
        boolean z9;
        T t7;
        long j4 = this.f21594e[i9];
        if (j4 == -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z10 = z9;
        Integer valueOf = Integer.valueOf(this.f21593d[i9]);
        Y y9 = this.f21592c[i9];
        boolean z11 = !z10;
        if (this.f21596g[i9]) {
            t7 = y9.f19493c;
        } else {
            t7 = null;
        }
        d02.b(valueOf, y9, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, z11, z10, t7, this.f21595f[i9], j4, i9, i9, 0L);
        return d02;
    }

    @Override // j3.E0
    public final int o() {
        return this.f21593d.length;
    }
}
