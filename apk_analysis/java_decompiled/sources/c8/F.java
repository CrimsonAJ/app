package c8;

import b8.C0713L;
import b8.InterfaceC0716O;

/* loaded from: classes.dex */
public final class F extends C0713L implements InterfaceC0716O {
    public final void t(int i9) {
        synchronized (this) {
            Object[] objArr = this.f11437h;
            kotlin.jvm.internal.h.b(objArr);
            d(Integer.valueOf(((Number) objArr[((int) ((this.f11438i + ((int) ((m() + this.f11439k) - this.f11438i))) - 1)) & (objArr.length - 1)]).intValue() + i9));
        }
    }
}
