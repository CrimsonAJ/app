package n8;

import J5.k;
import java.io.IOException;
import java.net.ProtocolException;
import x8.C2187g;
import x8.I;
import x8.p;

/* loaded from: classes.dex */
public final class c extends p {

    /* renamed from: b, reason: collision with root package name */
    public final long f21251b;

    /* renamed from: c, reason: collision with root package name */
    public long f21252c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21253d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21254e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21255f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f21256g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, I delegate, long j) {
        super(delegate);
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f21256g = kVar;
        this.f21251b = j;
        this.f21253d = true;
        if (j == 0) {
            a(null);
        }
    }

    public final IOException a(IOException iOException) {
        if (this.f21254e) {
            return iOException;
        }
        this.f21254e = true;
        k kVar = this.f21256g;
        if (iOException == null && this.f21253d) {
            this.f21253d = false;
            kVar.getClass();
            g call = (g) kVar.f4224b;
            kotlin.jvm.internal.h.e(call, "call");
        }
        return kVar.b(true, false, iOException);
    }

    @Override // x8.p, x8.I
    public final long b0(C2187g sink, long j) {
        kotlin.jvm.internal.h.e(sink, "sink");
        if (!this.f21255f) {
            try {
                long b02 = this.f24666a.b0(sink, j);
                if (this.f21253d) {
                    this.f21253d = false;
                    k kVar = this.f21256g;
                    kVar.getClass();
                    g call = (g) kVar.f4224b;
                    kotlin.jvm.internal.h.e(call, "call");
                }
                if (b02 == -1) {
                    a(null);
                    return -1L;
                }
                long j4 = this.f21252c + b02;
                long j9 = this.f21251b;
                if (j9 != -1 && j4 > j9) {
                    throw new ProtocolException("expected " + j9 + " bytes but received " + j4);
                }
                this.f21252c = j4;
                if (j4 == j9) {
                    a(null);
                }
                return b02;
            } catch (IOException e8) {
                throw a(e8);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // x8.p, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21255f) {
            return;
        }
        this.f21255f = true;
        try {
            super.close();
            a(null);
        } catch (IOException e8) {
            throw a(e8);
        }
    }
}
