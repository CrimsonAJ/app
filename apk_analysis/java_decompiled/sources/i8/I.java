package i8;

import x8.InterfaceC2188h;

/* loaded from: classes.dex */
public final class I extends J {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f19014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f19016c;

    public I(A a5, int i9, byte[] bArr) {
        this.f19014a = a5;
        this.f19015b = i9;
        this.f19016c = bArr;
    }

    @Override // i8.J
    public final long a() {
        return this.f19015b;
    }

    @Override // i8.J
    public final A b() {
        return this.f19014a;
    }

    @Override // i8.J
    public final void c(InterfaceC2188h interfaceC2188h) {
        interfaceC2188h.V(this.f19015b, this.f19016c);
    }
}
