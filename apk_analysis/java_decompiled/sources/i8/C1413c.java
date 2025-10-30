package i8;

import java.io.IOException;
import x8.C2187g;
import x8.InterfaceC2189i;

/* renamed from: i8.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1413c extends x8.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19066b = 2;

    /* renamed from: c, reason: collision with root package name */
    public Object f19067c;

    public /* synthetic */ C1413c(x8.I i9) {
        super(i9);
    }

    @Override // x8.p, x8.I
    public long b0(C2187g c2187g, long j) {
        switch (this.f19066b) {
            case 1:
                try {
                    return super.b0(c2187g, j);
                } catch (Exception e8) {
                    this.f19067c = e8;
                    throw e8;
                }
            case 2:
                try {
                    return super.b0(c2187g, j);
                } catch (IOException e9) {
                    ((K1.b) this.f19067c).f4236d = e9;
                    throw e9;
                }
            default:
                return super.b0(c2187g, j);
        }
    }

    @Override // x8.p, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f19066b) {
            case 0:
                ((C1414d) this.f19067c).f19068a.close();
                super.close();
                return;
            default:
                super.close();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1413c(K1.b bVar, InterfaceC2189i interfaceC2189i) {
        super(interfaceC2189i);
        this.f19067c = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1413c(x8.I i9, C1414d c1414d) {
        super(i9);
        this.f19067c = c1414d;
    }
}
