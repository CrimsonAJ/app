package N3;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f5101a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f5102b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f5103c;

    public g0() {
        this(new Random());
    }

    public final g0 a(int i9) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i9];
        int[] iArr3 = new int[i9];
        int i10 = 0;
        while (true) {
            random = this.f5101a;
            iArr = this.f5102b;
            if (i10 >= i9) {
                break;
            }
            iArr2[i10] = random.nextInt(iArr.length + 1);
            int i11 = i10 + 1;
            int nextInt = random.nextInt(i11);
            iArr3[i10] = iArr3[nextInt];
            iArr3[nextInt] = i10;
            i10 = i11;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i9];
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length + i9; i14++) {
            if (i12 < i9 && i13 == iArr2[i12]) {
                iArr4[i14] = iArr3[i12];
                i12++;
            } else {
                int i15 = i13 + 1;
                int i16 = iArr[i13];
                iArr4[i14] = i16;
                if (i16 >= 0) {
                    iArr4[i14] = i16 + i9;
                }
                i13 = i15;
            }
        }
        return new g0(iArr4, new Random(random.nextLong()));
    }

    public g0(int[] iArr, Random random) {
        this.f5102b = iArr;
        this.f5101a = random;
        this.f5103c = new int[iArr.length];
        for (int i9 = 0; i9 < iArr.length; i9++) {
            this.f5103c[iArr[i9]] = i9;
        }
    }

    public g0(Random random) {
        this(new int[0], random);
    }
}
