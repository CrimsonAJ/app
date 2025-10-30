package b5;

/* renamed from: b5.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0618c1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0621d1 f11055b;

    public /* synthetic */ RunnableC0618c1(C0621d1 c0621d1, int i9) {
        this.f11054a = i9;
        this.f11055b = c0621d1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11054a) {
            case 0:
                C0621d1 c0621d1 = this.f11055b;
                c0621d1.f11066e = c0621d1.j;
                return;
            default:
                this.f11055b.j = null;
                return;
        }
    }
}
