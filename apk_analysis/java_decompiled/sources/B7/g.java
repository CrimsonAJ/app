package B7;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g extends AbstractSet implements Set, P7.b {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
