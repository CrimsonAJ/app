package q3;

import j3.M;
import java.io.EOFException;
import k4.InterfaceC1510j;

/* renamed from: q3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1904i implements u {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f22319a = new byte[4096];

    @Override // q3.u
    public final int a(InterfaceC1510j interfaceC1510j, int i9, boolean z9) {
        byte[] bArr = this.f22319a;
        int D8 = interfaceC1510j.D(bArr, 0, Math.min(bArr.length, i9));
        if (D8 == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        return D8;
    }

    @Override // q3.u
    public final void b(int i9, A4.r rVar) {
        rVar.I(i9);
    }

    @Override // q3.u
    public final void c(int i9, A4.r rVar) {
        rVar.I(i9);
    }

    @Override // q3.u
    public final void e(M m9) {
    }

    @Override // q3.u
    public final void d(long j, int i9, int i10, int i11, t tVar) {
    }
}
