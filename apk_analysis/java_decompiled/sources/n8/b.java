package n8;

import J5.k;
import java.io.IOException;
import java.net.ProtocolException;
import x8.C2187g;
import x8.G;
import x8.o;

/* loaded from: classes.dex */
public final class b extends o {

    /* renamed from: b, reason: collision with root package name */
    public final long f21246b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21247c;

    /* renamed from: d, reason: collision with root package name */
    public long f21248d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f21250f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, G delegate, long j) {
        super(delegate);
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f21250f = kVar;
        this.f21246b = j;
    }

    @Override // x8.o, x8.G
    public final void G(C2187g source, long j) {
        kotlin.jvm.internal.h.e(source, "source");
        if (!this.f21249e) {
            long j4 = this.f21246b;
            if (j4 != -1 && this.f21248d + j > j4) {
                throw new ProtocolException("expected " + j4 + " bytes but received " + (this.f21248d + j));
            }
            try {
                super.G(source, j);
                this.f21248d += j;
                return;
            } catch (IOException e8) {
                throw a(e8);
            }
        }
        throw new IllegalStateException("closed");
    }

    public final IOException a(IOException iOException) {
        if (this.f21247c) {
            return iOException;
        }
        this.f21247c = true;
        return this.f21250f.b(false, true, iOException);
    }

    @Override // x8.o, x8.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21249e) {
            return;
        }
        this.f21249e = true;
        long j = this.f21246b;
        if (j != -1 && this.f21248d != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e8) {
            throw a(e8);
        }
    }

    @Override // x8.o, x8.G, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e8) {
            throw a(e8);
        }
    }
}
