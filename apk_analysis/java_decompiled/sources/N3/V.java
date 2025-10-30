package N3;

import b5.G1;
import k4.InterfaceC1512l;
import l4.AbstractC1566a;
import q3.C1903h;

/* loaded from: classes.dex */
public final class V implements InterfaceC0274z {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1512l f5005a;

    /* renamed from: b, reason: collision with root package name */
    public final C3.v f5006b;

    /* renamed from: c, reason: collision with root package name */
    public final G1 f5007c;

    /* renamed from: d, reason: collision with root package name */
    public e1.q f5008d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5009e;

    public V(InterfaceC1512l interfaceC1512l, C1903h c1903h) {
        C3.v vVar = new C3.v(5, c1903h);
        G1 g12 = new G1(18);
        e1.q qVar = new e1.q(-1);
        this.f5005a = interfaceC1512l;
        this.f5006b = vVar;
        this.f5007c = g12;
        this.f5008d = qVar;
        this.f5009e = 1048576;
    }

    @Override // N3.InterfaceC0274z
    public final InterfaceC0274z a(e1.q qVar) {
        AbstractC1566a.l(qVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f5008d = qVar;
        return this;
    }

    @Override // N3.InterfaceC0274z
    public final AbstractC0250a b(j3.Y y9) {
        y9.f19492b.getClass();
        y9.f19492b.getClass();
        return new W(y9, this.f5005a, this.f5006b, this.f5007c.m(y9), this.f5008d, this.f5009e);
    }
}
