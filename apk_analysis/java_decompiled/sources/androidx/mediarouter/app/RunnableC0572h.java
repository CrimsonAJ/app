package androidx.mediarouter.app;

/* renamed from: androidx.mediarouter.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0572h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10095b;

    public /* synthetic */ RunnableC0572h(int i9, Object obj) {
        this.f10094a = i9;
        this.f10095b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10094a) {
            case 0:
                s sVar = (s) this.f10095b;
                sVar.i(true);
                sVar.f10141X.requestLayout();
                sVar.f10141X.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0571g(sVar));
                return;
            default:
                s sVar2 = ((q) this.f10095b).f10120b;
                if (sVar2.f10152k0 != null) {
                    sVar2.f10152k0 = null;
                    if (sVar2.f10125A0) {
                        sVar2.p(sVar2.f10127B0);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
