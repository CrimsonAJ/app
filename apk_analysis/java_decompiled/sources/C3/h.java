package C3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class h extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f1457b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f1458c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f1463h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f1464i;
    public MediaCodec.CodecException j;

    /* renamed from: k, reason: collision with root package name */
    public long f1465k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1466l;

    /* renamed from: m, reason: collision with root package name */
    public IllegalStateException f1467m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1456a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final B3.e f1459d = new B3.e();

    /* renamed from: e, reason: collision with root package name */
    public final B3.e f1460e = new B3.e();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f1461f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f1462g = new ArrayDeque();

    public h(HandlerThread handlerThread) {
        this.f1457b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f1462g;
        if (!arrayDeque.isEmpty()) {
            this.f1464i = (MediaFormat) arrayDeque.getLast();
        }
        B3.e eVar = this.f1459d;
        eVar.f669a = 0;
        eVar.f670b = -1;
        eVar.f671c = 0;
        B3.e eVar2 = this.f1460e;
        eVar2.f669a = 0;
        eVar2.f670b = -1;
        eVar2.f671c = 0;
        this.f1461f.clear();
        arrayDeque.clear();
        this.j = null;
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f1456a) {
            this.f1467m = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f1456a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i9) {
        synchronized (this.f1456a) {
            this.f1459d.c(i9);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i9, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f1456a) {
            try {
                MediaFormat mediaFormat = this.f1464i;
                if (mediaFormat != null) {
                    this.f1460e.c(-2);
                    this.f1462g.add(mediaFormat);
                    this.f1464i = null;
                }
                this.f1460e.c(i9);
                this.f1461f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f1456a) {
            this.f1460e.c(-2);
            this.f1462g.add(mediaFormat);
            this.f1464i = null;
        }
    }
}
