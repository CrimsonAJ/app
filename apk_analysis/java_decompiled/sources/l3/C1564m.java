package l3;

import android.os.Handler;
import j3.SurfaceHolderCallbackC1438A;

/* renamed from: l3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1564m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20412a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f20413b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC1438A f20414c;

    public /* synthetic */ C1564m(Handler handler, SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A, int i9) {
        this.f20412a = i9;
        this.f20413b = handler;
        this.f20414c = surfaceHolderCallbackC1438A;
    }

    private final void b(m3.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = this.f20413b;
        if (handler != null) {
            handler.post(new A6.r(this, 17, dVar));
        }
    }

    public final void a(m3.d dVar) {
        switch (this.f20412a) {
            case 0:
                b(dVar);
                return;
            default:
                synchronized (dVar) {
                }
                Handler handler = this.f20413b;
                if (handler != null) {
                    handler.post(new A6.r(this, 21, dVar));
                    return;
                }
                return;
        }
    }
}
