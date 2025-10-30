package B7;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class m extends l {
    public static int f0(Iterable iterable, int i9) {
        kotlin.jvm.internal.h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i9;
    }
}
