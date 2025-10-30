package P;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: P.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0320v {

    /* renamed from: a, reason: collision with root package name */
    public final View f5646a;

    public void a() {
        View view = this.f5646a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void b() {
        View view;
        View view2 = this.f5646a;
        if (view2 != null) {
            if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
                view = view2.getRootView().findFocus();
            } else {
                view2.requestFocus();
                view = view2;
            }
            if (view == null) {
                view = view2.getRootView().findViewById(R.id.content);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new RunnableC0319u(view, 0));
            }
        }
    }
}
