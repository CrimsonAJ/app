package x8;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24605a;

    /* renamed from: b, reason: collision with root package name */
    public int f24606b;

    /* renamed from: c, reason: collision with root package name */
    public int f24607c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24608d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24609e;

    /* renamed from: f, reason: collision with root package name */
    public D f24610f;

    /* renamed from: g, reason: collision with root package name */
    public D f24611g;

    public D() {
        this.f24605a = new byte[8192];
        this.f24609e = true;
        this.f24608d = false;
    }

    public final D a() {
        D d9 = this.f24610f;
        if (d9 == this) {
            d9 = null;
        }
        D d10 = this.f24611g;
        kotlin.jvm.internal.h.b(d10);
        d10.f24610f = this.f24610f;
        D d11 = this.f24610f;
        kotlin.jvm.internal.h.b(d11);
        d11.f24611g = this.f24611g;
        this.f24610f = null;
        this.f24611g = null;
        return d9;
    }

    public final void b(D segment) {
        kotlin.jvm.internal.h.e(segment, "segment");
        segment.f24611g = this;
        segment.f24610f = this.f24610f;
        D d9 = this.f24610f;
        kotlin.jvm.internal.h.b(d9);
        d9.f24611g = segment;
        this.f24610f = segment;
    }

    public final D c() {
        this.f24608d = true;
        return new D(this.f24605a, this.f24606b, this.f24607c, true);
    }

    public final void d(D sink, int i9) {
        kotlin.jvm.internal.h.e(sink, "sink");
        if (sink.f24609e) {
            int i10 = sink.f24607c;
            int i11 = i10 + i9;
            byte[] bArr = sink.f24605a;
            if (i11 > 8192) {
                if (!sink.f24608d) {
                    int i12 = sink.f24606b;
                    if (i11 - i12 <= 8192) {
                        B7.j.c0(0, i12, i10, bArr, bArr);
                        sink.f24607c -= sink.f24606b;
                        sink.f24606b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i13 = sink.f24607c;
            int i14 = this.f24606b;
            B7.j.c0(i13, i14, i14 + i9, this.f24605a, bArr);
            sink.f24607c += i9;
            this.f24606b += i9;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public D(byte[] data, int i9, int i10, boolean z9) {
        kotlin.jvm.internal.h.e(data, "data");
        this.f24605a = data;
        this.f24606b = i9;
        this.f24607c = i10;
        this.f24608d = z9;
        this.f24609e = false;
    }
}
