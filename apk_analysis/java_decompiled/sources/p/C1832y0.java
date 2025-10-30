package p;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: p.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1832y0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1733A0 f22095a;

    public C1832y0(C1733A0 c1733a0) {
        this.f22095a = c1733a0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i9) {
        if (i9 == 1) {
            C1733A0 c1733a0 = this.f22095a;
            if (c1733a0.f21795z.getInputMethodMode() != 2 && c1733a0.f21795z.getContentView() != null) {
                Handler handler = c1733a0.f21791v;
                RunnableC1828w0 runnableC1828w0 = c1733a0.f21787r;
                handler.removeCallbacks(runnableC1828w0);
                runnableC1828w0.run();
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i9, int i10, int i11) {
    }
}
