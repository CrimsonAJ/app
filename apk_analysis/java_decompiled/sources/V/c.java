package V;

import Q.g;
import Q6.f;
import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f7552a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f7553b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7554c;

    /* renamed from: d, reason: collision with root package name */
    public final f f7555d;

    public c(boolean z9, f fVar) {
        this.f7554c = z9;
        this.f7555d = fVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f7555d.getClass();
        Rect rect = this.f7552a;
        ((g) obj).f(rect);
        Rect rect2 = this.f7553b;
        ((g) obj2).f(rect2);
        int i9 = rect.top;
        int i10 = rect2.top;
        if (i9 >= i10) {
            if (i9 <= i10) {
                int i11 = rect.left;
                int i12 = rect2.left;
                boolean z9 = this.f7554c;
                if (i11 < i12) {
                    if (!z9) {
                        return -1;
                    }
                    return 1;
                }
                if (i11 > i12) {
                    if (z9) {
                        return -1;
                    }
                    return 1;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 >= i14) {
                    if (i13 <= i14) {
                        int i15 = rect.right;
                        int i16 = rect2.right;
                        if (i15 < i16) {
                            if (!z9) {
                                return -1;
                            }
                            return 1;
                        }
                        if (i15 > i16) {
                            if (z9) {
                                return -1;
                            }
                            return 1;
                        }
                        return 0;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }
        return -1;
    }
}
