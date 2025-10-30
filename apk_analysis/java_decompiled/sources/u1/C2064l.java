package u1;

import v1.C2099g;
import x8.C;
import x8.InterfaceC2189i;
import x8.y;

/* renamed from: u1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2064l extends AbstractC2065m {

    /* renamed from: a, reason: collision with root package name */
    public final y f23593a;

    /* renamed from: b, reason: collision with root package name */
    public final x8.n f23594b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23595c;

    /* renamed from: d, reason: collision with root package name */
    public final C2099g f23596d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23597e;

    /* renamed from: f, reason: collision with root package name */
    public C f23598f;

    public C2064l(y yVar, x8.n nVar, String str, C2099g c2099g) {
        this.f23593a = yVar;
        this.f23594b = nVar;
        this.f23595c = str;
        this.f23596d = c2099g;
    }

    @Override // u1.AbstractC2065m
    public final O4.h a() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f23597e = true;
            C c3 = this.f23598f;
            if (c3 != null) {
                H1.f.a(c3);
            }
            C2099g c2099g = this.f23596d;
            if (c2099g != null) {
                H1.f.a(c2099g);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // u1.AbstractC2065m
    public final synchronized InterfaceC2189i d() {
        if (!this.f23597e) {
            C c3 = this.f23598f;
            if (c3 != null) {
                return c3;
            }
            C b9 = v4.e.b(this.f23594b.k(this.f23593a));
            this.f23598f = b9;
            return b9;
        }
        throw new IllegalStateException("closed");
    }
}
