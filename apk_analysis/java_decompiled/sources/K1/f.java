package K1;

import i8.K;
import i8.L;
import i8.N;
import i8.z;
import kotlin.jvm.internal.h;
import q2.C1892u;

/* loaded from: classes.dex */
public final class f implements z {

    /* renamed from: a, reason: collision with root package name */
    public C1892u f4247a;

    @Override // i8.z
    public final L a(o8.d dVar) {
        b bVar;
        L b9 = dVar.b(dVar.f21756e);
        N n7 = b9.f19035g;
        if (n7 == null) {
            bVar = null;
        } else {
            bVar = new b(n7, this.f4247a);
        }
        K s9 = b9.s();
        h.b(bVar);
        s9.f19023g = bVar;
        return s9.a();
    }
}
