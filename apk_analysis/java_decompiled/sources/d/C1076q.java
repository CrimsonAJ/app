package d;

import android.window.OnBackInvokedCallback;

/* renamed from: d.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1076q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16614b;

    public /* synthetic */ C1076q(int i9, Object obj) {
        this.f16613a = i9;
        this.f16614b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f16613a) {
            case 0:
                O7.a onBackInvoked = (O7.a) this.f16614b;
                kotlin.jvm.internal.h.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                return;
            case 1:
                ((i.w) this.f16614b).D();
                return;
            case 2:
                ((Runnable) this.f16614b).run();
                return;
            default:
                ((y5.b) this.f16614b).b();
                return;
        }
    }
}
