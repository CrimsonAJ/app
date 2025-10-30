package b0;

import O7.p;
import X.InterfaceC0408h;
import b8.InterfaceC0725e;

/* renamed from: b0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0586d implements InterfaceC0408h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0408h f10462a;

    public C0586d(InterfaceC0408h interfaceC0408h) {
        this.f10462a = interfaceC0408h;
    }

    @Override // X.InterfaceC0408h
    public final Object a(p pVar, G7.c cVar) {
        return this.f10462a.a(new C0585c(pVar, null), cVar);
    }

    @Override // X.InterfaceC0408h
    public final InterfaceC0725e b() {
        return this.f10462a.b();
    }
}
