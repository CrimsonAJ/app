package C3;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f1448g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f1449h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f1450a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f1451b;

    /* renamed from: c, reason: collision with root package name */
    public e f1452c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f1453d;

    /* renamed from: e, reason: collision with root package name */
    public final H1.k f1454e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1455f;

    /* JADX WARN: Type inference failed for: r0v0, types: [H1.k, java.lang.Object] */
    public g(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ?? obj = new Object();
        this.f1450a = mediaCodec;
        this.f1451b = handlerThread;
        this.f1454e = obj;
        this.f1453d = new AtomicReference();
    }

    public static f b() {
        ArrayDeque arrayDeque = f1448g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new f();
                }
                return (f) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(f fVar) {
        ArrayDeque arrayDeque = f1448g;
        synchronized (arrayDeque) {
            arrayDeque.add(fVar);
        }
    }

    public final void a() {
        if (this.f1455f) {
            try {
                e eVar = this.f1452c;
                eVar.getClass();
                eVar.removeCallbacksAndMessages(null);
                H1.k kVar = this.f1454e;
                kVar.c();
                e eVar2 = this.f1452c;
                eVar2.getClass();
                eVar2.obtainMessage(2).sendToTarget();
                synchronized (kVar) {
                    while (!kVar.f2964a) {
                        kVar.wait();
                    }
                }
            } catch (InterruptedException e8) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e8);
            }
        }
    }
}
