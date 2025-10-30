package l3;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class w extends v {

    /* renamed from: i, reason: collision with root package name */
    public int[] f20471i;
    public int[] j;

    @Override // l3.InterfaceC1561j
    public final void e(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k5 = k(((limit - position) / this.f20464b.f20406d) * this.f20465c.f20406d);
        while (position < limit) {
            for (int i9 : iArr) {
                k5.putShort(byteBuffer.getShort((i9 * 2) + position));
            }
            position += this.f20464b.f20406d;
        }
        byteBuffer.position(limit);
        k5.flip();
    }

    @Override // l3.v
    public final C1559h g(C1559h c1559h) {
        boolean z9;
        boolean z10;
        int[] iArr = this.f20471i;
        if (iArr == null) {
            return C1559h.f20402e;
        }
        if (c1559h.f20405c == 2) {
            int length = iArr.length;
            int i9 = c1559h.f20404b;
            if (i9 != length) {
                z9 = true;
            } else {
                z9 = false;
            }
            for (int i10 = 0; i10 < iArr.length; i10++) {
                int i11 = iArr[i10];
                if (i11 < i9) {
                    if (i11 != i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z9 |= z10;
                } else {
                    throw new C1560i(c1559h);
                }
            }
            if (z9) {
                return new C1559h(c1559h.f20403a, iArr.length, 2);
            }
            return C1559h.f20402e;
        }
        throw new C1560i(c1559h);
    }

    @Override // l3.v
    public final void h() {
        this.j = this.f20471i;
    }

    @Override // l3.v
    public final void j() {
        this.j = null;
        this.f20471i = null;
    }
}
