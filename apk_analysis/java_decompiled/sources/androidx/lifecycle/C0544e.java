package androidx.lifecycle;

import Y7.C0463g0;
import Y7.InterfaceC0465h0;
import Y7.InterfaceC0484z;
import java.io.Closeable;

/* renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544e implements Closeable, InterfaceC0484z, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final E7.i f9879a;

    public C0544e(E7.i iVar) {
        this.f9879a = iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) this.f9879a.get(C0463g0.f8811a);
        if (interfaceC0465h0 != null) {
            interfaceC0465h0.d(null);
        }
    }

    @Override // Y7.InterfaceC0484z
    public final E7.i g() {
        return this.f9879a;
    }
}
