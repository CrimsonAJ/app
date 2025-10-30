package l3;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class N extends v {

    /* renamed from: i, reason: collision with root package name */
    public int f20360i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20361k;

    /* renamed from: l, reason: collision with root package name */
    public int f20362l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f20363m;

    /* renamed from: n, reason: collision with root package name */
    public int f20364n;

    /* renamed from: o, reason: collision with root package name */
    public long f20365o;

    @Override // l3.v, l3.InterfaceC1561j
    public final ByteBuffer b() {
        int i9;
        if (super.d() && (i9 = this.f20364n) > 0) {
            k(i9).put(this.f20363m, 0, this.f20364n).flip();
            this.f20364n = 0;
        }
        return super.b();
    }

    @Override // l3.v, l3.InterfaceC1561j
    public final boolean d() {
        if (super.d() && this.f20364n == 0) {
            return true;
        }
        return false;
    }

    @Override // l3.InterfaceC1561j
    public final void e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i9 = limit - position;
        if (i9 != 0) {
            int min = Math.min(i9, this.f20362l);
            this.f20365o += min / this.f20464b.f20406d;
            this.f20362l -= min;
            byteBuffer.position(position + min);
            if (this.f20362l > 0) {
                return;
            }
            int i10 = i9 - min;
            int length = (this.f20364n + i10) - this.f20363m.length;
            ByteBuffer k5 = k(length);
            int i11 = l4.y.i(length, 0, this.f20364n);
            k5.put(this.f20363m, 0, i11);
            int i12 = l4.y.i(length - i11, 0, i10);
            byteBuffer.limit(byteBuffer.position() + i12);
            k5.put(byteBuffer);
            byteBuffer.limit(limit);
            int i13 = i10 - i12;
            int i14 = this.f20364n - i11;
            this.f20364n = i14;
            byte[] bArr = this.f20363m;
            System.arraycopy(bArr, i11, bArr, 0, i14);
            byteBuffer.get(this.f20363m, this.f20364n, i13);
            this.f20364n += i13;
            k5.flip();
        }
    }

    @Override // l3.v
    public final C1559h g(C1559h c1559h) {
        if (c1559h.f20405c == 2) {
            this.f20361k = true;
            if (this.f20360i == 0 && this.j == 0) {
                return C1559h.f20402e;
            }
            return c1559h;
        }
        throw new C1560i(c1559h);
    }

    @Override // l3.v
    public final void h() {
        if (this.f20361k) {
            this.f20361k = false;
            int i9 = this.j;
            int i10 = this.f20464b.f20406d;
            this.f20363m = new byte[i9 * i10];
            this.f20362l = this.f20360i * i10;
        }
        this.f20364n = 0;
    }

    @Override // l3.v
    public final void i() {
        if (this.f20361k) {
            if (this.f20364n > 0) {
                this.f20365o += r0 / this.f20464b.f20406d;
            }
            this.f20364n = 0;
        }
    }

    @Override // l3.v
    public final void j() {
        this.f20363m = l4.y.f20558f;
    }
}
