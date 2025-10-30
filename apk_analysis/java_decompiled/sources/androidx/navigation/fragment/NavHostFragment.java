package androidx.navigation.fragment;

import A7.l;
import Z0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import co.notix.R;
import e2.e;
import i0.AbstractComponentCallbacksC1366v;
import i0.C1345a;
import kotlin.jvm.internal.h;
import u0.H;
import u0.X;
import w0.k;

/* loaded from: classes.dex */
public class NavHostFragment extends AbstractComponentCallbacksC1366v {

    /* renamed from: v0, reason: collision with root package name */
    public final l f10202v0 = a.q(new e(29, this));

    /* renamed from: w0, reason: collision with root package name */
    public View f10203w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f10204x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f10205y0;

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void E(Context context) {
        h.e(context, "context");
        super.E(context);
        if (this.f10205y0) {
            C1345a c1345a = new C1345a(o());
            c1345a.k(this);
            c1345a.e(false);
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void F(Bundle bundle) {
        e0();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f10205y0 = true;
            C1345a c1345a = new C1345a(o());
            c1345a.k(this);
            c1345a.e(false);
        }
        super.F(bundle);
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final View G(LayoutInflater inflater, ViewGroup viewGroup) {
        h.e(inflater, "inflater");
        Context context = inflater.getContext();
        h.d(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i9 = this.f18420w;
        if (i9 == 0 || i9 == -1) {
            i9 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i9);
        return fragmentContainerView;
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void I() {
        this.f18382D = true;
        View view = this.f10203w0;
        if (view != null && v4.e.n(view) == e0()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f10203w0 = null;
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void M(Context context, AttributeSet attrs, Bundle bundle) {
        h.e(context, "context");
        h.e(attrs, "attrs");
        super.M(context, attrs, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, X.f23464b);
        h.d(obtainStyledAttributes, "context.obtainStyledAttr…tion.R.styleable.NavHost)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f10204x0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attrs, k.f24000c);
        h.d(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f10205y0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void P(Bundle bundle) {
        if (this.f10205y0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void S(View view) {
        h.e(view, "view");
        if (view instanceof ViewGroup) {
            view.setTag(R.id.nav_controller_view_tag, e0());
            if (view.getParent() != null) {
                Object parent = view.getParent();
                h.c(parent, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) parent;
                this.f10203w0 = view2;
                if (view2.getId() == this.f18420w) {
                    View view3 = this.f10203w0;
                    h.b(view3);
                    view3.setTag(R.id.nav_controller_view_tag, e0());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }

    public final H e0() {
        return (H) this.f10202v0.getValue();
    }
}
