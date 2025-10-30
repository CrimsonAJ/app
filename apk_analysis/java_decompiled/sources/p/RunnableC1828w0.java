package p;

/* renamed from: p.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1828w0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1733A0 f22089b;

    public /* synthetic */ RunnableC1828w0(C1733A0 c1733a0, int i9) {
        this.f22088a = i9;
        this.f22089b = c1733a0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22088a) {
            case 0:
                C1812o0 c1812o0 = this.f22089b.f21773c;
                if (c1812o0 != null) {
                    c1812o0.setListSelectionHidden(true);
                    c1812o0.requestLayout();
                    return;
                }
                return;
            default:
                C1733A0 c1733a0 = this.f22089b;
                C1812o0 c1812o02 = c1733a0.f21773c;
                if (c1812o02 != null && c1812o02.isAttachedToWindow() && c1733a0.f21773c.getCount() > c1733a0.f21773c.getChildCount() && c1733a0.f21773c.getChildCount() <= c1733a0.f21782m) {
                    c1733a0.f21795z.setInputMethodMode(2);
                    c1733a0.d();
                    return;
                }
                return;
        }
    }
}
