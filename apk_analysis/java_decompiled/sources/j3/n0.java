package j3;

import android.util.SparseBooleanArray;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class n0 implements InterfaceC1453f {

    /* renamed from: a, reason: collision with root package name */
    public final l4.f f19699a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        AbstractC1566a.m(!false);
        new l4.f(sparseBooleanArray);
    }

    public n0(l4.f fVar) {
        this.f19699a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        return this.f19699a.equals(((n0) obj).f19699a);
    }

    public final int hashCode() {
        return this.f19699a.hashCode();
    }
}
