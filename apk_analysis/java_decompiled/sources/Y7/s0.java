package Y7;

import a.AbstractC0485a;
import com.google.android.gms.internal.measurement.D1;
import d8.AbstractC1130a;

/* loaded from: classes.dex */
public final class s0 extends y0 {

    /* renamed from: d, reason: collision with root package name */
    public final E7.d f8853d;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(E7.i iVar, O7.p pVar) {
        super(iVar, false);
        this.f8853d = ((G7.a) pVar).create(this, this);
    }

    @Override // Y7.r0
    public final void U() {
        try {
            AbstractC1130a.h(D1.A(this.f8853d), A7.n.f558a);
        } catch (Throwable th) {
            resumeWith(AbstractC0485a.h(th));
            throw th;
        }
    }
}
