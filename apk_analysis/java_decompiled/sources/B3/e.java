package B3;

import A4.r;
import java.util.NoSuchElementException;
import y3.InterfaceC2208d;

/* loaded from: classes.dex */
public final class e implements InterfaceC2208d {

    /* renamed from: d, reason: collision with root package name */
    public int f672d;

    /* renamed from: a, reason: collision with root package name */
    public int f669a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f670b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f671c = 0;

    /* renamed from: e, reason: collision with root package name */
    public Object f673e = new int[16];

    public e() {
        this.f672d = r0.length - 1;
    }

    @Override // y3.InterfaceC2208d
    public int a() {
        return -1;
    }

    @Override // y3.InterfaceC2208d
    public int b() {
        return this.f669a;
    }

    public void c(int i9) {
        int i10 = this.f671c;
        int[] iArr = (int[]) this.f673e;
        if (i10 == iArr.length) {
            int length = iArr.length << 1;
            if (length >= 0) {
                int[] iArr2 = new int[length];
                int length2 = iArr.length;
                int i11 = this.f669a;
                int i12 = length2 - i11;
                System.arraycopy(iArr, i11, iArr2, 0, i12);
                System.arraycopy((int[]) this.f673e, 0, iArr2, i12, i11);
                this.f669a = 0;
                this.f670b = this.f671c - 1;
                this.f673e = iArr2;
                this.f672d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i13 = (this.f670b + 1) & this.f672d;
        this.f670b = i13;
        ((int[]) this.f673e)[i13] = i9;
        this.f671c++;
    }

    @Override // y3.InterfaceC2208d
    public int d() {
        r rVar = (r) this.f673e;
        int i9 = this.f670b;
        if (i9 == 8) {
            return rVar.x();
        }
        if (i9 == 16) {
            return rVar.C();
        }
        int i10 = this.f671c;
        this.f671c = i10 + 1;
        if (i10 % 2 == 0) {
            int x5 = rVar.x();
            this.f672d = x5;
            return (x5 & 240) >> 4;
        }
        return this.f672d & 15;
    }

    public int e() {
        int i9 = this.f671c;
        if (i9 != 0) {
            int[] iArr = (int[]) this.f673e;
            int i10 = this.f669a;
            int i11 = iArr[i10];
            this.f669a = (i10 + 1) & this.f672d;
            this.f671c = i9 - 1;
            return i11;
        }
        throw new NoSuchElementException();
    }
}
