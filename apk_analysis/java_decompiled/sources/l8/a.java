package l8;

import J5.k;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import x8.B;
import x8.C2187g;
import x8.I;
import x8.InterfaceC2189i;
import x8.K;

/* loaded from: classes.dex */
public final class a implements I, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2189i f20613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f20614c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f20615d;

    public a(InterfaceC2189i interfaceC2189i, k kVar, B b9) {
        this.f20613b = interfaceC2189i;
        this.f20614c = kVar;
        this.f20615d = b9;
    }

    @Override // x8.I
    public final long b0(C2187g sink, long j) {
        kotlin.jvm.internal.h.e(sink, "sink");
        try {
            long b02 = this.f20613b.b0(sink, j);
            B b9 = this.f20615d;
            if (b02 == -1) {
                if (!this.f20612a) {
                    this.f20612a = true;
                    b9.close();
                }
                return -1L;
            }
            sink.I(b9.f24600b, sink.f24644b - b02, b02);
            b9.a();
            return b02;
        } catch (IOException e8) {
            if (!this.f20612a) {
                this.f20612a = true;
                this.f20614c.a();
                throw e8;
            }
            throw e8;
        }
    }

    @Override // x8.I
    public final K c() {
        return this.f20613b.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f20612a) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!k8.c.h(this)) {
                this.f20612a = true;
                this.f20614c.a();
            }
        }
        this.f20613b.close();
    }
}
