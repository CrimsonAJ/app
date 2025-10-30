package l3;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class F extends v {

    /* renamed from: i, reason: collision with root package name */
    public static final int f20295i = Float.floatToIntBits(Float.NaN);

    @Override // l3.InterfaceC1561j
    public final void e(ByteBuffer byteBuffer) {
        ByteBuffer k5;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i9 = limit - position;
        int i10 = this.f20464b.f20405c;
        int i11 = f20295i;
        if (i10 != 536870912) {
            if (i10 == 805306368) {
                k5 = k(i9);
                while (position < limit) {
                    int floatToIntBits = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                    if (floatToIntBits == i11) {
                        floatToIntBits = Float.floatToIntBits(0.0f);
                    }
                    k5.putInt(floatToIntBits);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            k5 = k((i9 / 3) * 4);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i11) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                k5.putInt(floatToIntBits2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        k5.flip();
    }

    @Override // l3.v
    public final C1559h g(C1559h c1559h) {
        int i9 = c1559h.f20405c;
        if (i9 != 536870912 && i9 != 805306368 && i9 != 4) {
            throw new C1560i(c1559h);
        }
        if (i9 != 4) {
            return new C1559h(c1559h.f20403a, c1559h.f20404b, 4);
        }
        return C1559h.f20402e;
    }
}
