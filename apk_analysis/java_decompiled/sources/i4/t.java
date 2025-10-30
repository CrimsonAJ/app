package i4;

import N3.m0;
import P5.F;
import j3.InterfaceC1453f;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class t implements InterfaceC1453f {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f18597a;

    /* renamed from: b, reason: collision with root package name */
    public final F f18598b;

    public t(m0 m0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= m0Var.f5164a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f18597a = m0Var;
        this.f18598b = F.o(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f18597a.equals(tVar.f18597a) && this.f18598b.equals(tVar.f18598b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18598b.hashCode() * 31) + this.f18597a.hashCode();
    }
}
