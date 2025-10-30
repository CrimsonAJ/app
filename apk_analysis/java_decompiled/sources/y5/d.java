package y5;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import d.C1061b;

/* loaded from: classes.dex */
public final class d implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f25012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f25013b;

    public d(e eVar, b bVar) {
        this.f25013b = eVar;
        this.f25012a = bVar;
    }

    public final void onBackCancelled() {
        if (this.f25013b.f25011a != null) {
            this.f25012a.d();
        }
    }

    public final void onBackInvoked() {
        this.f25012a.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f25013b.f25011a != null) {
            this.f25012a.a(new C1061b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f25013b.f25011a != null) {
            this.f25012a.c(new C1061b(backEvent));
        }
    }
}
