package l8;

import B7.C0050a;
import O7.l;
import java.io.IOException;
import kotlin.jvm.internal.i;
import x8.C2182b;
import x8.C2187g;
import x8.G;
import x8.o;

/* loaded from: classes.dex */
public final class h extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20656b = 1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20657c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.a f20658d;

    public h(G g9, C0050a c0050a) {
        super(g9);
        this.f20658d = c0050a;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [O7.l, kotlin.jvm.internal.i] */
    @Override // x8.o, x8.G
    public final void G(C2187g source, long j) {
        switch (this.f20656b) {
            case 0:
                kotlin.jvm.internal.h.e(source, "source");
                if (this.f20657c) {
                    source.n(j);
                    return;
                }
                try {
                    super.G(source, j);
                    return;
                } catch (IOException e8) {
                    this.f20657c = true;
                    ((i) this.f20658d).invoke(e8);
                    return;
                }
            default:
                if (this.f20657c) {
                    source.n(j);
                    return;
                }
                try {
                    super.G(source, j);
                    return;
                } catch (IOException e9) {
                    this.f20657c = true;
                    ((C0050a) this.f20658d).invoke(e9);
                    return;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [O7.l, kotlin.jvm.internal.i] */
    @Override // x8.o, x8.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f20656b) {
            case 0:
                if (!this.f20657c) {
                    try {
                        super.close();
                        return;
                    } catch (IOException e8) {
                        this.f20657c = true;
                        ((i) this.f20658d).invoke(e8);
                        return;
                    }
                }
                return;
            default:
                try {
                    super.close();
                    return;
                } catch (IOException e9) {
                    this.f20657c = true;
                    ((C0050a) this.f20658d).invoke(e9);
                    return;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [O7.l, kotlin.jvm.internal.i] */
    @Override // x8.o, x8.G, java.io.Flushable
    public final void flush() {
        switch (this.f20656b) {
            case 0:
                if (!this.f20657c) {
                    try {
                        super.flush();
                        return;
                    } catch (IOException e8) {
                        this.f20657c = true;
                        ((i) this.f20658d).invoke(e8);
                        return;
                    }
                }
                return;
            default:
                try {
                    super.flush();
                    return;
                } catch (IOException e9) {
                    this.f20657c = true;
                    ((C0050a) this.f20658d).invoke(e9);
                    return;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(C2182b c2182b, l lVar) {
        super(c2182b);
        this.f20658d = (i) lVar;
    }
}
