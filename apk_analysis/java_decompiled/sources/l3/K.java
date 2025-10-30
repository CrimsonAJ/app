package l3;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class K extends v {

    /* renamed from: i, reason: collision with root package name */
    public final long f20314i = 150000;
    public final long j = 20000;

    /* renamed from: k, reason: collision with root package name */
    public final short f20315k = 1024;

    /* renamed from: l, reason: collision with root package name */
    public int f20316l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20317m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f20318n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f20319o;

    /* renamed from: p, reason: collision with root package name */
    public int f20320p;

    /* renamed from: q, reason: collision with root package name */
    public int f20321q;

    /* renamed from: r, reason: collision with root package name */
    public int f20322r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20323s;

    /* renamed from: t, reason: collision with root package name */
    public long f20324t;

    public K() {
        byte[] bArr = l4.y.f20558f;
        this.f20318n = bArr;
        this.f20319o = bArr;
    }

    @Override // l3.v, l3.InterfaceC1561j
    public final boolean a() {
        return this.f20317m;
    }

    @Override // l3.InterfaceC1561j
    public final void e(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f20469g.hasRemaining()) {
            int i9 = this.f20320p;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        int limit = byteBuffer.limit();
                        int l9 = l(byteBuffer);
                        byteBuffer.limit(l9);
                        this.f20324t += byteBuffer.remaining() / this.f20316l;
                        n(byteBuffer, this.f20319o, this.f20322r);
                        if (l9 < limit) {
                            m(this.f20322r, this.f20319o);
                            this.f20320p = 0;
                            byteBuffer.limit(limit);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int l10 = l(byteBuffer);
                    int position2 = l10 - byteBuffer.position();
                    byte[] bArr = this.f20318n;
                    int length = bArr.length;
                    int i10 = this.f20321q;
                    int i11 = length - i10;
                    if (l10 < limit2 && position2 < i11) {
                        m(i10, bArr);
                        this.f20321q = 0;
                        this.f20320p = 0;
                    } else {
                        int min = Math.min(position2, i11);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.f20318n, this.f20321q, min);
                        int i12 = this.f20321q + min;
                        this.f20321q = i12;
                        byte[] bArr2 = this.f20318n;
                        if (i12 == bArr2.length) {
                            if (this.f20323s) {
                                m(this.f20322r, bArr2);
                                this.f20324t += (this.f20321q - (this.f20322r * 2)) / this.f20316l;
                            } else {
                                this.f20324t += (i12 - this.f20322r) / this.f20316l;
                            }
                            n(byteBuffer, this.f20318n, this.f20321q);
                            this.f20321q = 0;
                            this.f20320p = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f20318n.length));
                int limit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f20315k) {
                            int i13 = this.f20316l;
                            position = ((limit4 / i13) * i13) + i13;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f20320p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    k(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f20323s = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // l3.v
    public final C1559h g(C1559h c1559h) {
        if (c1559h.f20405c == 2) {
            if (this.f20317m) {
                return c1559h;
            }
            return C1559h.f20402e;
        }
        throw new C1560i(c1559h);
    }

    @Override // l3.v
    public final void h() {
        if (this.f20317m) {
            C1559h c1559h = this.f20464b;
            int i9 = c1559h.f20406d;
            this.f20316l = i9;
            int i10 = c1559h.f20403a;
            int i11 = ((int) ((this.f20314i * i10) / 1000000)) * i9;
            if (this.f20318n.length != i11) {
                this.f20318n = new byte[i11];
            }
            int i12 = ((int) ((this.j * i10) / 1000000)) * i9;
            this.f20322r = i12;
            if (this.f20319o.length != i12) {
                this.f20319o = new byte[i12];
            }
        }
        this.f20320p = 0;
        this.f20324t = 0L;
        this.f20321q = 0;
        this.f20323s = false;
    }

    @Override // l3.v
    public final void i() {
        int i9 = this.f20321q;
        if (i9 > 0) {
            m(i9, this.f20318n);
        }
        if (!this.f20323s) {
            this.f20324t += this.f20322r / this.f20316l;
        }
    }

    @Override // l3.v
    public final void j() {
        this.f20317m = false;
        this.f20322r = 0;
        byte[] bArr = l4.y.f20558f;
        this.f20318n = bArr;
        this.f20319o = bArr;
    }

    public final int l(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f20315k) {
                int i9 = this.f20316l;
                return (position / i9) * i9;
            }
        }
        return byteBuffer.limit();
    }

    public final void m(int i9, byte[] bArr) {
        k(i9).put(bArr, 0, i9).flip();
        if (i9 > 0) {
            this.f20323s = true;
        }
    }

    public final void n(ByteBuffer byteBuffer, byte[] bArr, int i9) {
        int min = Math.min(byteBuffer.remaining(), this.f20322r);
        int i10 = this.f20322r - min;
        System.arraycopy(bArr, i9 - i10, this.f20319o, 0, i10);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f20319o, i10, min);
    }
}
