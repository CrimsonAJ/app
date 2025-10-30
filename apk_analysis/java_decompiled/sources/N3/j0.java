package N3;

import java.util.Arrays;
import k4.C1516p;
import k4.InterfaceC1513m;

/* loaded from: classes.dex */
public final class j0 implements k4.J {

    /* renamed from: a, reason: collision with root package name */
    public final C1516p f5126a;

    /* renamed from: b, reason: collision with root package name */
    public final k4.V f5127b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f5128c;

    public j0(InterfaceC1513m interfaceC1513m, C1516p c1516p) {
        C0266q.f5180a.getAndIncrement();
        this.f5126a = c1516p;
        this.f5127b = new k4.V(interfaceC1513m);
    }

    @Override // k4.J
    public final void a() {
        k4.V v8 = this.f5127b;
        v8.f20033b = 0L;
        try {
            v8.g(this.f5126a);
            int i9 = 0;
            while (i9 != -1) {
                int i10 = (int) v8.f20033b;
                byte[] bArr = this.f5128c;
                if (bArr == null) {
                    this.f5128c = new byte[1024];
                } else if (i10 == bArr.length) {
                    this.f5128c = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f5128c;
                i9 = v8.D(bArr2, i10, bArr2.length - i10);
            }
            s8.n.h(v8);
        } catch (Throwable th) {
            s8.n.h(v8);
            throw th;
        }
    }

    @Override // k4.J
    public final void c() {
    }
}
