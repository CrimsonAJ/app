package u1;

import x8.InterfaceC2189i;
import x8.u;

/* loaded from: classes.dex */
public final class o extends AbstractC2065m {

    /* renamed from: a, reason: collision with root package name */
    public final O4.h f23599a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23600b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2189i f23601c;

    public o(InterfaceC2189i interfaceC2189i, O4.h hVar) {
        this.f23599a = hVar;
        this.f23601c = interfaceC2189i;
    }

    @Override // u1.AbstractC2065m
    public final O4.h a() {
        return this.f23599a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f23600b = true;
        InterfaceC2189i interfaceC2189i = this.f23601c;
        if (interfaceC2189i != null) {
            H1.f.a(interfaceC2189i);
        }
    }

    @Override // u1.AbstractC2065m
    public final synchronized InterfaceC2189i d() {
        InterfaceC2189i interfaceC2189i;
        try {
            if (!this.f23600b) {
                interfaceC2189i = this.f23601c;
                if (interfaceC2189i == null) {
                    u uVar = x8.n.f24664a;
                    kotlin.jvm.internal.h.b(null);
                    uVar.k(null);
                    throw null;
                }
            } else {
                throw new IllegalStateException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC2189i;
    }
}
