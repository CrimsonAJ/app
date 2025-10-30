package P5;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class T extends F {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U f5929c;

    public T(U u9) {
        this.f5929c = u9;
    }

    @Override // P5.A
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        U u9 = this.f5929c;
        O4.h.f(i9, u9.f5932f);
        int i10 = i9 * 2;
        Object[] objArr = u9.f5931e;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5929c.f5932f;
    }
}
