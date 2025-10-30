package b8;

import c8.AbstractC0793c;
import co.notix.eg;

/* renamed from: b8.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0705D implements InterfaceC0725e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0707F f11418a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0707F f11419b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eg f11420c;

    public C0705D(InterfaceC0707F interfaceC0707F, InterfaceC0707F interfaceC0707F2, eg egVar) {
        this.f11418a = interfaceC0707F;
        this.f11419b = interfaceC0707F2;
        this.f11420c = egVar;
    }

    @Override // b8.InterfaceC0725e
    public final Object collect(InterfaceC0726f interfaceC0726f, E7.d dVar) {
        Object a5 = AbstractC0793c.a(dVar, new C0704C(this.f11420c, (E7.d) null), interfaceC0726f, new InterfaceC0725e[]{this.f11418a, this.f11419b});
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return A7.n.f558a;
    }
}
