package B7;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f extends AbstractList implements List, P7.b {
    public abstract int b();

    public abstract Object c(int i9);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i9) {
        return c(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
