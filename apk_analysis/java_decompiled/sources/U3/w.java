package U3;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class w implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f7471a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f7472b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f7473c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f7474d;

    public w(x xVar, OutputStream outputStream) {
        this.f7474d = xVar;
        this.f7471a = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f7472b = handlerThread;
        handlerThread.start();
        this.f7473c = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Handler handler = this.f7473c;
        HandlerThread handlerThread = this.f7472b;
        Objects.requireNonNull(handlerThread);
        handler.post(new A6.s(11, handlerThread));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
