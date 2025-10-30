package C3;

import android.os.HandlerThread;

/* renamed from: C3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0081b implements O5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1435b;

    public /* synthetic */ C0081b(int i9, int i10) {
        this.f1434a = i10;
        this.f1435b = i9;
    }

    @Override // O5.n
    public final Object get() {
        switch (this.f1434a) {
            case 0:
                return new HandlerThread(c.c(this.f1435b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.c(this.f1435b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
