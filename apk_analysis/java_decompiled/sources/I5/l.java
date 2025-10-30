package I5;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.notix.R;
import com.google.android.material.snackbar.SnackbarContentLayout;
import l1.C1535g;

/* loaded from: classes.dex */
public final class l extends j {

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f3576D = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* renamed from: B, reason: collision with root package name */
    public final AccessibilityManager f3577B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f3578C;

    public l(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f3577B = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static l g(View view, String str) {
        ViewGroup viewGroup;
        int i9;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3576D);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1 && resourceId2 != -1) {
                i9 = R.layout.mtrl_layout_snackbar_include;
            } else {
                i9 = R.layout.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i9, viewGroup, false);
            l lVar = new l(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) lVar.f3561i.getChildAt(0)).getMessageView().setText(str);
            return lVar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public final void h(View.OnClickListener onClickListener) {
        CharSequence text = this.f3560h.getText(R.string.label_hide);
        Button actionView = ((SnackbarContentLayout) this.f3561i.getChildAt(0)).getActionView();
        if (!TextUtils.isEmpty(text)) {
            this.f3578C = true;
            actionView.setVisibility(0);
            actionView.setText(text);
            actionView.setOnClickListener(new k(this, 0, onClickListener));
            return;
        }
        actionView.setVisibility(8);
        actionView.setOnClickListener(null);
        this.f3578C = false;
    }

    public final void i() {
        int i9;
        int i10;
        C1535g r5 = C1535g.r();
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.f3577B;
        boolean z9 = false;
        if (i11 >= 29) {
            if (this.f3578C) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            i9 = accessibilityManager.getRecommendedTimeoutMillis(0, i10 | 3);
        } else if (this.f3578C && accessibilityManager.isTouchExplorationEnabled()) {
            i9 = -2;
        } else {
            i9 = 0;
        }
        f fVar = this.f3572u;
        synchronized (r5.f20182a) {
            try {
                if (r5.t(fVar)) {
                    m mVar = (m) r5.f20184c;
                    mVar.f3580b = i9;
                    ((Handler) r5.f20183b).removeCallbacksAndMessages(mVar);
                    r5.G((m) r5.f20184c);
                    return;
                }
                m mVar2 = (m) r5.f20185d;
                if (mVar2 != null && mVar2.f3579a.get() == fVar) {
                    z9 = true;
                }
                if (z9) {
                    ((m) r5.f20185d).f3580b = i9;
                } else {
                    r5.f20185d = new m(i9, fVar);
                }
                m mVar3 = (m) r5.f20184c;
                if (mVar3 != null && r5.h(mVar3, 4)) {
                    return;
                }
                r5.f20184c = null;
                r5.I();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
