package X0;

import java.util.ArrayList;
import s.C1935e;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1935e f8216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f8217b;

    public o(p pVar, C1935e c1935e) {
        this.f8217b = pVar;
        this.f8216a = c1935e;
    }

    @Override // X0.j
    public final void g(m mVar) {
        ((ArrayList) this.f8216a.get(this.f8217b.f8219b)).remove(mVar);
        mVar.A(this);
    }
}
