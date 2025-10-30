package z8;

import x8.InterfaceC2189i;

/* renamed from: z8.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2274x extends i8.N {

    /* renamed from: a, reason: collision with root package name */
    public final i8.A f25640a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25641b;

    public C2274x(i8.A a5, long j) {
        this.f25640a = a5;
        this.f25641b = j;
    }

    @Override // i8.N
    public final long a() {
        return this.f25641b;
    }

    @Override // i8.N
    public final i8.A d() {
        return this.f25640a;
    }

    @Override // i8.N
    public final InterfaceC2189i g() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
