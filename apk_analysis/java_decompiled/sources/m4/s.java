package m4;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public final class s implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public static final s f20806e = new s();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f20807a = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f20808b;

    /* renamed from: c, reason: collision with root package name */
    public Choreographer f20809c;

    /* renamed from: d, reason: collision with root package name */
    public int f20810d;

    public s() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i9 = y.f20553a;
        Handler handler = new Handler(looper, this);
        this.f20808b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f20807a = j;
        Choreographer choreographer = this.f20809c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i9 = message.what;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return false;
                }
                Choreographer choreographer = this.f20809c;
                if (choreographer != null) {
                    int i10 = this.f20810d - 1;
                    this.f20810d = i10;
                    if (i10 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.f20807a = -9223372036854775807L;
                        return true;
                    }
                }
            } else {
                Choreographer choreographer2 = this.f20809c;
                if (choreographer2 != null) {
                    int i11 = this.f20810d + 1;
                    this.f20810d = i11;
                    if (i11 == 1) {
                        choreographer2.postFrameCallback(this);
                        return true;
                    }
                }
            }
        } else {
            try {
                this.f20809c = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e8) {
                AbstractC1566a.Q("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e8);
            }
        }
        return true;
    }
}
