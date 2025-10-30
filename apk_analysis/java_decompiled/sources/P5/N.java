package P5;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class N implements O5.n, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int f5919a;

    public N() {
        AbstractC0349q.c(2, "expectedValuesPerKey");
        this.f5919a = 2;
    }

    @Override // O5.n
    public final Object get() {
        return new ArrayList(this.f5919a);
    }
}
