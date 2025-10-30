package l3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class M implements InterfaceC1561j {

    /* renamed from: b, reason: collision with root package name */
    public int f20346b;

    /* renamed from: c, reason: collision with root package name */
    public float f20347c;

    /* renamed from: d, reason: collision with root package name */
    public float f20348d;

    /* renamed from: e, reason: collision with root package name */
    public C1559h f20349e;

    /* renamed from: f, reason: collision with root package name */
    public C1559h f20350f;

    /* renamed from: g, reason: collision with root package name */
    public C1559h f20351g;

    /* renamed from: h, reason: collision with root package name */
    public C1559h f20352h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20353i;
    public L j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f20354k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f20355l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f20356m;

    /* renamed from: n, reason: collision with root package name */
    public long f20357n;

    /* renamed from: o, reason: collision with root package name */
    public long f20358o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20359p;

    @Override // l3.InterfaceC1561j
    public final boolean a() {
        if (this.f20350f.f20403a != -1) {
            if (Math.abs(this.f20347c - 1.0f) >= 1.0E-4f || Math.abs(this.f20348d - 1.0f) >= 1.0E-4f || this.f20350f.f20403a != this.f20349e.f20403a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // l3.InterfaceC1561j
    public final ByteBuffer b() {
        L l9 = this.j;
        if (l9 != null) {
            int i9 = l9.f20336m;
            int i10 = l9.f20326b;
            int i11 = i9 * i10 * 2;
            if (i11 > 0) {
                if (this.f20354k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f20354k = order;
                    this.f20355l = order.asShortBuffer();
                } else {
                    this.f20354k.clear();
                    this.f20355l.clear();
                }
                ShortBuffer shortBuffer = this.f20355l;
                int min = Math.min(shortBuffer.remaining() / i10, l9.f20336m);
                int i12 = min * i10;
                shortBuffer.put(l9.f20335l, 0, i12);
                int i13 = l9.f20336m - min;
                l9.f20336m = i13;
                short[] sArr = l9.f20335l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f20358o += i11;
                this.f20354k.limit(i11);
                this.f20356m = this.f20354k;
            }
        }
        ByteBuffer byteBuffer = this.f20356m;
        this.f20356m = InterfaceC1561j.f20407a;
        return byteBuffer;
    }

    @Override // l3.InterfaceC1561j
    public final void c() {
        L l9 = this.j;
        if (l9 != null) {
            int i9 = l9.f20334k;
            float f9 = l9.f20327c;
            float f10 = l9.f20328d;
            int i10 = l9.f20336m + ((int) ((((i9 / (f9 / f10)) + l9.f20338o) / (l9.f20329e * f10)) + 0.5f));
            short[] sArr = l9.j;
            int i11 = l9.f20332h * 2;
            l9.j = l9.c(sArr, i9, i11 + i9);
            int i12 = 0;
            while (true) {
                int i13 = l9.f20326b;
                if (i12 >= i11 * i13) {
                    break;
                }
                l9.j[(i13 * i9) + i12] = 0;
                i12++;
            }
            l9.f20334k = i11 + l9.f20334k;
            l9.f();
            if (l9.f20336m > i10) {
                l9.f20336m = i10;
            }
            l9.f20334k = 0;
            l9.f20341r = 0;
            l9.f20338o = 0;
        }
        this.f20359p = true;
    }

    @Override // l3.InterfaceC1561j
    public final boolean d() {
        if (this.f20359p) {
            L l9 = this.j;
            if (l9 == null || l9.f20336m * l9.f20326b * 2 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // l3.InterfaceC1561j
    public final void e(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        L l9 = this.j;
        l9.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f20357n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i9 = l9.f20326b;
        int i10 = remaining2 / i9;
        short[] c3 = l9.c(l9.j, l9.f20334k, i10);
        l9.j = c3;
        asShortBuffer.get(c3, l9.f20334k * i9, ((i10 * i9) * 2) / 2);
        l9.f20334k += i10;
        l9.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // l3.InterfaceC1561j
    public final C1559h f(C1559h c1559h) {
        if (c1559h.f20405c == 2) {
            int i9 = this.f20346b;
            if (i9 == -1) {
                i9 = c1559h.f20403a;
            }
            this.f20349e = c1559h;
            C1559h c1559h2 = new C1559h(i9, c1559h.f20404b, 2);
            this.f20350f = c1559h2;
            this.f20353i = true;
            return c1559h2;
        }
        throw new C1560i(c1559h);
    }

    @Override // l3.InterfaceC1561j
    public final void flush() {
        if (a()) {
            C1559h c1559h = this.f20349e;
            this.f20351g = c1559h;
            C1559h c1559h2 = this.f20350f;
            this.f20352h = c1559h2;
            if (this.f20353i) {
                this.j = new L(c1559h.f20403a, c1559h.f20404b, this.f20347c, this.f20348d, c1559h2.f20403a);
            } else {
                L l9 = this.j;
                if (l9 != null) {
                    l9.f20334k = 0;
                    l9.f20336m = 0;
                    l9.f20338o = 0;
                    l9.f20339p = 0;
                    l9.f20340q = 0;
                    l9.f20341r = 0;
                    l9.f20342s = 0;
                    l9.f20343t = 0;
                    l9.f20344u = 0;
                    l9.f20345v = 0;
                }
            }
        }
        this.f20356m = InterfaceC1561j.f20407a;
        this.f20357n = 0L;
        this.f20358o = 0L;
        this.f20359p = false;
    }

    @Override // l3.InterfaceC1561j
    public final void reset() {
        this.f20347c = 1.0f;
        this.f20348d = 1.0f;
        C1559h c1559h = C1559h.f20402e;
        this.f20349e = c1559h;
        this.f20350f = c1559h;
        this.f20351g = c1559h;
        this.f20352h = c1559h;
        ByteBuffer byteBuffer = InterfaceC1561j.f20407a;
        this.f20354k = byteBuffer;
        this.f20355l = byteBuffer.asShortBuffer();
        this.f20356m = byteBuffer;
        this.f20346b = -1;
        this.f20353i = false;
        this.j = null;
        this.f20357n = 0L;
        this.f20358o = 0L;
        this.f20359p = false;
    }
}
