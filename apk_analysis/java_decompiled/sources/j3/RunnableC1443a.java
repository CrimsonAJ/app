package j3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.internal.measurement.C1;

/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1443a extends BroadcastReceiver implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final SurfaceHolderCallbackC1438A f19498a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f19499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1 f19500c;

    public RunnableC1443a(C1 c12, Handler handler, SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A) {
        this.f19500c = c12;
        this.f19499b = handler;
        this.f19498a = surfaceHolderCallbackC1438A;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f19499b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19500c.f15186a) {
            this.f19498a.f19226a.J0(-1, 3, false);
        }
    }
}
