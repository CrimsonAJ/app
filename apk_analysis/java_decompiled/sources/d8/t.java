package d8;

import Y7.AbstractC0450a;
import com.google.android.gms.internal.measurement.D1;

/* loaded from: classes.dex */
public class t extends AbstractC0450a implements G7.d {

    /* renamed from: d, reason: collision with root package name */
    public final E7.d f17005d;

    public t(E7.d dVar, E7.i iVar) {
        super(iVar, true);
        this.f17005d = dVar;
    }

    @Override // Y7.r0
    public final boolean K() {
        return true;
    }

    @Override // G7.d
    public final G7.d getCallerFrame() {
        E7.d dVar = this.f17005d;
        if (dVar instanceof G7.d) {
            return (G7.d) dVar;
        }
        return null;
    }

    @Override // Y7.r0
    public void m(Object obj) {
        AbstractC1130a.h(D1.A(this.f17005d), Y7.B.t(obj));
    }

    @Override // Y7.r0
    public void n(Object obj) {
        this.f17005d.resumeWith(Y7.B.t(obj));
    }
}
