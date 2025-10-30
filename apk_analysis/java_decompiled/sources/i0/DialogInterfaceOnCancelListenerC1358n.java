package i0;

import B6.u0;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import d.DialogC1072m;
import r.C1921c;
import r.C1924f;

/* renamed from: i0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1358n extends AbstractComponentCallbacksC1366v implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: E0, reason: collision with root package name */
    public boolean f18347E0;

    /* renamed from: G0, reason: collision with root package name */
    public Dialog f18349G0;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f18350H0;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f18351I0;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f18352J0;

    /* renamed from: v0, reason: collision with root package name */
    public Handler f18354v0;

    /* renamed from: w0, reason: collision with root package name */
    public final A4.e f18355w0 = new A4.e(25, this);

    /* renamed from: x0, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC1354j f18356x0 = new DialogInterfaceOnCancelListenerC1354j(this);

    /* renamed from: y0, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC1355k f18357y0 = new DialogInterfaceOnDismissListenerC1355k(this);

    /* renamed from: z0, reason: collision with root package name */
    public int f18358z0 = 0;

    /* renamed from: A0, reason: collision with root package name */
    public int f18343A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f18344B0 = true;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f18345C0 = true;

    /* renamed from: D0, reason: collision with root package name */
    public int f18346D0 = -1;

    /* renamed from: F0, reason: collision with root package name */
    public final C1356l f18348F0 = new C1356l(this);

    /* renamed from: K0, reason: collision with root package name */
    public boolean f18353K0 = false;

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void B() {
        this.f18382D = true;
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public void E(Context context) {
        Object obj;
        super.E(context);
        androidx.lifecycle.E e8 = this.f18408o0;
        e8.getClass();
        androidx.lifecycle.E.a("observeForever");
        C1356l c1356l = this.f18348F0;
        androidx.lifecycle.D d9 = new androidx.lifecycle.D(e8, c1356l);
        C1924f c1924f = e8.f9792b;
        C1921c b9 = c1924f.b(c1356l);
        if (b9 != null) {
            obj = b9.f22579b;
        } else {
            C1921c c1921c = new C1921c(c1356l, d9);
            c1924f.f22588d++;
            C1921c c1921c2 = c1924f.f22586b;
            if (c1921c2 == null) {
                c1924f.f22585a = c1921c;
                c1924f.f22586b = c1921c;
            } else {
                c1921c2.f22580c = c1921c;
                c1921c.f22581d = c1921c2;
                c1924f.f22586b = c1921c;
            }
            obj = null;
        }
        androidx.lifecycle.D d10 = (androidx.lifecycle.D) obj;
        if (!(d10 instanceof androidx.lifecycle.C)) {
            if (d10 == null) {
                d9.g(true);
            }
            if (!this.f18352J0) {
                this.f18351I0 = false;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public void F(Bundle bundle) {
        boolean z9;
        super.F(bundle);
        this.f18354v0 = new Handler();
        if (this.f18421x == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f18345C0 = z9;
        if (bundle != null) {
            this.f18358z0 = bundle.getInt("android:style", 0);
            this.f18343A0 = bundle.getInt("android:theme", 0);
            this.f18344B0 = bundle.getBoolean("android:cancelable", true);
            this.f18345C0 = bundle.getBoolean("android:showsDialog", this.f18345C0);
            this.f18346D0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void I() {
        this.f18382D = true;
        Dialog dialog = this.f18349G0;
        if (dialog != null) {
            this.f18350H0 = true;
            dialog.setOnDismissListener(null);
            this.f18349G0.dismiss();
            if (!this.f18351I0) {
                onDismiss(this.f18349G0);
            }
            this.f18349G0 = null;
            this.f18353K0 = false;
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void J() {
        this.f18382D = true;
        if (!this.f18352J0 && !this.f18351I0) {
            this.f18351I0 = true;
        }
        this.f18408o0.h(this.f18348F0);
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public LayoutInflater K(Bundle bundle) {
        LayoutInflater K = super.K(bundle);
        boolean z9 = this.f18345C0;
        if (z9 && !this.f18347E0) {
            if (z9 && !this.f18353K0) {
                try {
                    this.f18347E0 = true;
                    Dialog g02 = g0(bundle);
                    this.f18349G0 = g02;
                    if (this.f18345C0) {
                        j0(g02, this.f18358z0);
                        Context m9 = m();
                        if (m9 instanceof Activity) {
                            this.f18349G0.setOwnerActivity((Activity) m9);
                        }
                        this.f18349G0.setCancelable(this.f18344B0);
                        this.f18349G0.setOnCancelListener(this.f18356x0);
                        this.f18349G0.setOnDismissListener(this.f18357y0);
                        this.f18353K0 = true;
                    } else {
                        this.f18349G0 = null;
                    }
                    this.f18347E0 = false;
                } catch (Throwable th) {
                    this.f18347E0 = false;
                    throw th;
                }
            }
            if (AbstractC1336M.H(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f18349G0;
            if (dialog != null) {
                return K.cloneInContext(dialog.getContext());
            }
        } else if (AbstractC1336M.H(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f18345C0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return K;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return K;
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public void P(Bundle bundle) {
        Dialog dialog = this.f18349G0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i9 = this.f18358z0;
        if (i9 != 0) {
            bundle.putInt("android:style", i9);
        }
        int i10 = this.f18343A0;
        if (i10 != 0) {
            bundle.putInt("android:theme", i10);
        }
        boolean z9 = this.f18344B0;
        if (!z9) {
            bundle.putBoolean("android:cancelable", z9);
        }
        boolean z10 = this.f18345C0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i11 = this.f18346D0;
        if (i11 != -1) {
            bundle.putInt("android:backStackId", i11);
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public void Q() {
        this.f18382D = true;
        Dialog dialog = this.f18349G0;
        if (dialog != null) {
            this.f18350H0 = false;
            dialog.show();
            View decorView = this.f18349G0.getWindow().getDecorView();
            kotlin.jvm.internal.h.e(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public void R() {
        this.f18382D = true;
        Dialog dialog = this.f18349G0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void T(Bundle bundle) {
        Bundle bundle2;
        this.f18382D = true;
        if (this.f18349G0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f18349G0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void U(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.U(layoutInflater, viewGroup, bundle);
        if (this.Y == null && this.f18349G0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f18349G0.onRestoreInstanceState(bundle2);
        }
    }

    public void e0() {
        f0(false, false);
    }

    public final void f0(boolean z9, boolean z10) {
        if (this.f18351I0) {
            return;
        }
        this.f18351I0 = true;
        this.f18352J0 = false;
        Dialog dialog = this.f18349G0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f18349G0.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.f18354v0.getLooper()) {
                    onDismiss(this.f18349G0);
                } else {
                    this.f18354v0.post(this.f18355w0);
                }
            }
        }
        this.f18350H0 = true;
        if (this.f18346D0 >= 0) {
            AbstractC1336M o9 = o();
            int i9 = this.f18346D0;
            if (i9 >= 0) {
                o9.v(new C1334K(o9, null, i9, 1), z9);
                this.f18346D0 = -1;
                return;
            }
            throw new IllegalArgumentException(AbstractC0953k1.j(i9, "Bad id: "));
        }
        C1345a c1345a = new C1345a(o());
        c1345a.f18296p = true;
        c1345a.i(this);
        if (z9) {
            c1345a.e(true);
        } else {
            c1345a.e(false);
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final u0 g() {
        return new C1357m(this, new C1361q(this));
    }

    public Dialog g0(Bundle bundle) {
        if (AbstractC1336M.H(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC1072m(X(), this.f18343A0);
    }

    public final Dialog h0() {
        Dialog dialog = this.f18349G0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public final void i0(boolean z9) {
        this.f18344B0 = z9;
        Dialog dialog = this.f18349G0;
        if (dialog != null) {
            dialog.setCancelable(z9);
        }
    }

    public void j0(Dialog dialog, int i9) {
        if (i9 != 1 && i9 != 2) {
            if (i9 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void k0(AbstractC1336M abstractC1336M, String str) {
        this.f18351I0 = false;
        this.f18352J0 = true;
        abstractC1336M.getClass();
        C1345a c1345a = new C1345a(abstractC1336M);
        c1345a.f18296p = true;
        c1345a.g(0, this, str, 1);
        c1345a.e(false);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f18350H0) {
            if (AbstractC1336M.H(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            f0(true, true);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
