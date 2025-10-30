package P5;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class B extends AbstractC0345m implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5890a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5891b;

    public B(Object obj, Object obj2) {
        this.f5890a = obj;
        this.f5891b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5890a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5891b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
