package d;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: d.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1078s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O7.l f16616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O7.l f16617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O7.a f16618c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O7.a f16619d;

    public C1078s(O7.l lVar, O7.l lVar2, O7.a aVar, O7.a aVar2) {
        this.f16616a = lVar;
        this.f16617b = lVar2;
        this.f16618c = aVar;
        this.f16619d = aVar2;
    }

    public final void onBackCancelled() {
        this.f16619d.invoke();
    }

    public final void onBackInvoked() {
        this.f16618c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.h.e(backEvent, "backEvent");
        this.f16617b.invoke(new C1061b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.h.e(backEvent, "backEvent");
        this.f16616a.invoke(new C1061b(backEvent));
    }
}
