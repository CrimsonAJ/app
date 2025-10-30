package d8;

import Y7.S;
import Y7.T;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class A {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16960b = AtomicIntegerFieldUpdater.newUpdater(A.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public S[] f16961a;

    public final void a(S s9) {
        s9.e((T) this);
        S[] sArr = this.f16961a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16960b;
        if (sArr == null) {
            sArr = new S[4];
            this.f16961a = sArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= sArr.length) {
            Object[] copyOf = Arrays.copyOf(sArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            sArr = (S[]) copyOf;
            this.f16961a = sArr;
        }
        int i9 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i9 + 1);
        sArr[i9] = s9;
        s9.f8783b = i9;
        e(i9);
    }

    public final S b() {
        S s9;
        synchronized (this) {
            S[] sArr = this.f16961a;
            if (sArr != null) {
                s9 = sArr[0];
            } else {
                s9 = null;
            }
        }
        return s9;
    }

    public final void c(S s9) {
        synchronized (this) {
            if (s9.a() != null) {
                d(s9.f8783b);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Y7.S d(int r9) {
        /*
            r8 = this;
            Y7.S[] r0 = r8.f16961a
            kotlin.jvm.internal.h.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = d8.A.f16960b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.f(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.h.b(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.h.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.f(r9, r2)
            r8.e(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            Y7.S[] r5 = r8.f16961a
            kotlin.jvm.internal.h.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.h.b(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.h.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.h.b(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.h.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.f(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.h.b(r9)
            r2 = 0
            r9.e(r2)
            r9.f8783b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.A.d(int):Y7.S");
    }

    public final void e(int i9) {
        while (i9 > 0) {
            S[] sArr = this.f16961a;
            kotlin.jvm.internal.h.b(sArr);
            int i10 = (i9 - 1) / 2;
            S s9 = sArr[i10];
            kotlin.jvm.internal.h.b(s9);
            S s10 = sArr[i9];
            kotlin.jvm.internal.h.b(s10);
            if (s9.compareTo(s10) <= 0) {
                return;
            }
            f(i9, i10);
            i9 = i10;
        }
    }

    public final void f(int i9, int i10) {
        S[] sArr = this.f16961a;
        kotlin.jvm.internal.h.b(sArr);
        S s9 = sArr[i10];
        kotlin.jvm.internal.h.b(s9);
        S s10 = sArr[i9];
        kotlin.jvm.internal.h.b(s10);
        sArr[i9] = s9;
        sArr[i10] = s10;
        s9.f8783b = i9;
        s10.f8783b = i10;
    }
}
