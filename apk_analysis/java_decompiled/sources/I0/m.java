package I0;

import G0.InterfaceC0154u;
import G0.K;

/* loaded from: classes.dex */
public final class m implements InterfaceC0154u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f3236b;

    public /* synthetic */ m(K k5, int i9) {
        this.f3235a = i9;
        this.f3236b = k5;
    }

    @Override // G0.InterfaceC0154u
    public final Object c(String str, O7.l lVar, G7.c cVar) {
        switch (this.f3235a) {
            case 0:
                return ((s) this.f3236b).c(str, lVar, cVar);
            default:
                return ((J0.d) this.f3236b).c(str, lVar, cVar);
        }
    }
}
