package m3;

import j3.K;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class f extends Q0.b {

    /* renamed from: c, reason: collision with root package name */
    public final C1589b f20703c = new C1589b();

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f20704d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20705e;

    /* renamed from: f, reason: collision with root package name */
    public long f20706f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f20707g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20708h;

    static {
        K.a("goog.exo.decoder");
    }

    public f(int i9) {
        this.f20708h = i9;
    }

    public void r() {
        this.f6039b = 0;
        ByteBuffer byteBuffer = this.f20704d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f20707g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f20705e = false;
    }

    public final ByteBuffer s(int i9) {
        int capacity;
        int i10 = this.f20708h;
        if (i10 == 1) {
            return ByteBuffer.allocate(i9);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i9);
        }
        ByteBuffer byteBuffer = this.f20704d;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i9 + ")");
    }

    public final void t(int i9) {
        ByteBuffer byteBuffer = this.f20704d;
        if (byteBuffer == null) {
            this.f20704d = s(i9);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i10 = i9 + position;
        if (capacity >= i10) {
            this.f20704d = byteBuffer;
            return;
        }
        ByteBuffer s9 = s(i10);
        s9.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            s9.put(byteBuffer);
        }
        this.f20704d = s9;
    }

    public final void u() {
        ByteBuffer byteBuffer = this.f20704d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f20707g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
