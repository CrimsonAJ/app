package l3;

import P5.X;
import java.util.Arrays;

/* renamed from: l3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1558g {

    /* renamed from: c, reason: collision with root package name */
    public static final C1558g f20397c = new C1558g(new int[]{2}, 8);

    /* renamed from: d, reason: collision with root package name */
    public static final C1558g f20398d = new C1558g(new int[]{2, 5, 6}, 8);

    /* renamed from: e, reason: collision with root package name */
    public static final X f20399e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f20400a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20401b;

    static {
        A3.E e8 = new A3.E(4, 6);
        e8.n(5, 6);
        e8.n(17, 6);
        e8.n(7, 6);
        e8.n(18, 6);
        e8.n(6, 8);
        e8.n(8, 8);
        e8.n(14, 8);
        f20399e = e8.d();
    }

    public C1558g(int[] iArr, int i9) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f20400a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f20400a = new int[0];
        }
        this.f20401b = i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r8 > r9.f20401b) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r8 != 5) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(j3.M r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f19435l
            r0.getClass()
            java.lang.String r1 = r10.f19433i
            int r0 = l4.n.c(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            P5.X r2 = l3.C1558g.f20399e
            boolean r1 = r2.containsKey(r1)
            r3 = 0
            if (r1 != 0) goto L1a
            goto La2
        L1a:
            int[] r1 = r9.f20400a
            r4 = 7
            r5 = 6
            r6 = 8
            r7 = 18
            if (r0 != r7) goto L2d
            int r8 = java.util.Arrays.binarySearch(r1, r7)
            if (r8 < 0) goto L2b
            goto L2d
        L2b:
            r0 = r5
            goto L37
        L2d:
            if (r0 != r6) goto L37
            int r8 = java.util.Arrays.binarySearch(r1, r6)
            if (r8 < 0) goto L36
            goto L37
        L36:
            r0 = r4
        L37:
            int r1 = java.util.Arrays.binarySearch(r1, r0)
            if (r1 < 0) goto Lb0
            r1 = -1
            int r8 = r10.f19448y
            if (r8 == r1) goto L4a
            if (r0 != r7) goto L45
            goto L4a
        L45:
            int r10 = r9.f20401b
            if (r8 <= r10) goto L75
            goto La2
        L4a:
            int r10 = r10.f19449z
            if (r10 == r1) goto L4f
            goto L52
        L4f:
            r10 = 48000(0xbb80, float:6.7262E-41)
        L52:
            int r1 = l4.y.f20553a
            r7 = 29
            if (r1 < r7) goto L5e
            int r10 = l3.AbstractC1557f.b(r0, r10)
        L5c:
            r8 = r10
            goto L75
        L5e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r10 = r2.get(r10)
            if (r10 == 0) goto L6e
            r1 = r10
        L6e:
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r10 = r1.intValue()
            goto L5c
        L75:
            int r10 = l4.y.f20553a
            r1 = 28
            if (r10 > r1) goto L89
            if (r8 != r4) goto L7f
            r5 = r6
            goto L8a
        L7f:
            r1 = 3
            if (r8 == r1) goto L8a
            r1 = 4
            if (r8 == r1) goto L8a
            r1 = 5
            if (r8 != r1) goto L89
            goto L8a
        L89:
            r5 = r8
        L8a:
            r1 = 26
            if (r10 > r1) goto L9c
            java.lang.String r10 = "fugu"
            java.lang.String r1 = l4.y.f20554b
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L9c
            r10 = 1
            if (r5 != r10) goto L9c
            r5 = 2
        L9c:
            int r10 = l4.y.n(r5)
            if (r10 != 0) goto La3
        La2:
            return r3
        La3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        Lb0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C1558g.a(j3.M):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1558g)) {
            return false;
        }
        C1558g c1558g = (C1558g) obj;
        if (Arrays.equals(this.f20400a, c1558g.f20400a) && this.f20401b == c1558g.f20401b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f20400a) * 31) + this.f20401b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f20401b + ", supportedEncodings=" + Arrays.toString(this.f20400a) + "]";
    }
}
