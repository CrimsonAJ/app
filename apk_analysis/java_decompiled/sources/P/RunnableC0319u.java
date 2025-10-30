package P;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: P.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0319u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5643b;

    public /* synthetic */ RunnableC0319u(View view, int i9) {
        this.f5642a = i9;
        this.f5643b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5642a) {
            case 0:
                View view = this.f5643b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                View view2 = this.f5643b;
                ((InputMethodManager) view2.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view2, 1);
                return;
        }
    }
}
