package K5;

import java.util.Arrays;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public int f4353a;

    /* renamed from: b, reason: collision with root package name */
    public int f4354b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4355c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4356d;

    public p() {
        this.f4355c = new long[10];
        this.f4356d = new Object[10];
    }

    public synchronized void a(long j, Object obj) {
        if (this.f4354b > 0) {
            if (j <= ((long[]) this.f4355c)[((this.f4353a + r0) - 1) % ((Object[]) this.f4356d).length]) {
                b();
            }
        }
        c();
        int i9 = this.f4353a;
        int i10 = this.f4354b;
        Object[] objArr = (Object[]) this.f4356d;
        int length = (i9 + i10) % objArr.length;
        ((long[]) this.f4355c)[length] = j;
        objArr[length] = obj;
        this.f4354b = i10 + 1;
    }

    public synchronized void b() {
        this.f4353a = 0;
        this.f4354b = 0;
        Arrays.fill((Object[]) this.f4356d, (Object) null);
    }

    public void c() {
        int length = ((Object[]) this.f4356d).length;
        if (this.f4354b < length) {
            return;
        }
        int i9 = length * 2;
        long[] jArr = new long[i9];
        Object[] objArr = new Object[i9];
        int i10 = this.f4353a;
        int i11 = length - i10;
        System.arraycopy((long[]) this.f4355c, i10, jArr, 0, i11);
        System.arraycopy((Object[]) this.f4356d, this.f4353a, objArr, 0, i11);
        int i12 = this.f4353a;
        if (i12 > 0) {
            System.arraycopy((long[]) this.f4355c, 0, jArr, i11, i12);
            System.arraycopy((Object[]) this.f4356d, 0, objArr, i11, this.f4353a);
        }
        this.f4355c = jArr;
        this.f4356d = objArr;
        this.f4353a = 0;
    }

    public Object d(long j, boolean z9) {
        Object obj = null;
        long j4 = Long.MAX_VALUE;
        while (this.f4354b > 0) {
            long j9 = j - ((long[]) this.f4355c)[this.f4353a];
            if (j9 < 0 && (z9 || (-j9) >= j4)) {
                break;
            }
            obj = f();
            j4 = j9;
        }
        return obj;
    }

    public synchronized Object e(long j) {
        return d(j, true);
    }

    public Object f() {
        boolean z9;
        if (this.f4354b > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        Object[] objArr = (Object[]) this.f4356d;
        int i9 = this.f4353a;
        Object obj = objArr[i9];
        objArr[i9] = null;
        this.f4353a = (i9 + 1) % objArr.length;
        this.f4354b--;
        return obj;
    }

    public p(int i9, float[] fArr, float[] fArr2, int i10) {
        this.f4353a = i9;
        AbstractC1566a.h(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f4355c = fArr;
        this.f4356d = fArr2;
        this.f4354b = i10;
    }

    public p(p pVar) {
        float[] fArr = (float[]) pVar.f4355c;
        this.f4353a = fArr.length / 3;
        this.f4355c = AbstractC1566a.r(fArr);
        this.f4356d = AbstractC1566a.r((float[]) pVar.f4356d);
        int i9 = pVar.f4354b;
        if (i9 == 1) {
            this.f4354b = 5;
        } else if (i9 != 2) {
            this.f4354b = 4;
        } else {
            this.f4354b = 6;
        }
    }
}
