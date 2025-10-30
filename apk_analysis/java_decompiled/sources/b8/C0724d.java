package b8;

import c8.AbstractC0793c;

/* renamed from: b8.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724d implements InterfaceC0725e {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0725e f11469a;

    public C0724d(InterfaceC0725e interfaceC0725e) {
        this.f11469a = interfaceC0725e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.o, java.lang.Object] */
    @Override // b8.InterfaceC0725e
    public final Object collect(InterfaceC0726f interfaceC0726f, E7.d dVar) {
        ?? obj = new Object();
        obj.f20159a = AbstractC0793c.f11752b;
        Object collect = this.f11469a.collect(new C0723c(this, (kotlin.jvm.internal.o) obj, interfaceC0726f), dVar);
        if (collect == F7.a.f2587a) {
            return collect;
        }
        return A7.n.f558a;
    }
}
