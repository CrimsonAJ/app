package P5;

import java.util.Comparator;

/* renamed from: P5.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354w extends AbstractC0356y {
    public static AbstractC0356y f(int i9) {
        if (i9 < 0) {
            return AbstractC0356y.f6013b;
        }
        if (i9 > 0) {
            return AbstractC0356y.f6014c;
        }
        return AbstractC0356y.f6012a;
    }

    @Override // P5.AbstractC0356y
    public final AbstractC0356y a(int i9, int i10) {
        int i11;
        if (i9 < i10) {
            i11 = -1;
        } else if (i9 > i10) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        return f(i11);
    }

    @Override // P5.AbstractC0356y
    public final AbstractC0356y b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // P5.AbstractC0356y
    public final AbstractC0356y c(boolean z9, boolean z10) {
        int i9;
        if (z9 == z10) {
            i9 = 0;
        } else if (z9) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        return f(i9);
    }

    @Override // P5.AbstractC0356y
    public final AbstractC0356y d(boolean z9, boolean z10) {
        int i9;
        if (z10 == z9) {
            i9 = 0;
        } else if (z10) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        return f(i9);
    }

    @Override // P5.AbstractC0356y
    public final int e() {
        return 0;
    }
}
