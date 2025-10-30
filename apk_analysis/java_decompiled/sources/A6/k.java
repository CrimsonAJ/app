package A6;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class k extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f513a;

    /* renamed from: b, reason: collision with root package name */
    public int f514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f515c;

    public k(m mVar, j jVar) {
        this.f515c = mVar;
        this.f513a = mVar.g0(jVar.f511a + 4);
        this.f514b = jVar.f512b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        if (bArr != null) {
            if ((i9 | i10) >= 0 && i10 <= bArr.length - i9) {
                int i11 = this.f514b;
                if (i11 <= 0) {
                    return -1;
                }
                if (i10 > i11) {
                    i10 = i11;
                }
                int i12 = this.f513a;
                m mVar = this.f515c;
                mVar.O(i12, i9, i10, bArr);
                this.f513a = mVar.g0(this.f513a + i10);
                this.f514b -= i10;
                return i10;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new NullPointerException("buffer");
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f514b == 0) {
            return -1;
        }
        m mVar = this.f515c;
        mVar.f517a.seek(this.f513a);
        int read = mVar.f517a.read();
        this.f513a = mVar.g0(this.f513a + 1);
        this.f514b--;
        return read;
    }
}
