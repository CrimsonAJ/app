package w;

/* renamed from: w.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2128h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23950a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public static /* synthetic */ boolean a(int i9, int i10) {
        if (i9 != 0) {
            return i9 == i10;
        }
        throw null;
    }

    public static /* synthetic */ int b(int i9) {
        if (i9 != 0) {
            return i9 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] c(int i9) {
        int[] iArr = new int[i9];
        System.arraycopy(f23950a, 0, iArr, 0, i9);
        return iArr;
    }
}
