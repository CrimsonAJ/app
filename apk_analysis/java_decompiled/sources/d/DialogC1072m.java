package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0563y;
import androidx.lifecycle.EnumC0554o;
import androidx.lifecycle.InterfaceC0561w;
import co.notix.R;
import com.google.android.gms.internal.measurement.C1;

/* renamed from: d.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC1072m extends Dialog implements InterfaceC0561w, N0.g {

    /* renamed from: a, reason: collision with root package name */
    public C0563y f16603a;

    /* renamed from: b, reason: collision with root package name */
    public final C1 f16604b;

    /* renamed from: c, reason: collision with root package name */
    public final C1082w f16605c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC1072m(Context context, int i9) {
        super(context, i9);
        kotlin.jvm.internal.h.e(context, "context");
        this.f16604b = new C1(this);
        this.f16605c = new C1082w(new A6.s(19, this));
    }

    public static void a(DialogC1072m this$0) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.h.e(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        kotlin.jvm.internal.h.b(window);
        View decorView = window.getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        kotlin.jvm.internal.h.b(window2);
        View decorView2 = window2.getDecorView();
        kotlin.jvm.internal.h.d(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        kotlin.jvm.internal.h.b(window3);
        View decorView3 = window3.getDecorView();
        kotlin.jvm.internal.h.d(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // N0.g
    public final N0.f c() {
        return (N0.f) this.f16604b.f15188c;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f16605c.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            kotlin.jvm.internal.h.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C1082w c1082w = this.f16605c;
            c1082w.getClass();
            c1082w.f16631e = onBackInvokedDispatcher;
            c1082w.d(c1082w.f16633g);
        }
        this.f16604b.b(bundle);
        C0563y c0563y = this.f16603a;
        if (c0563y == null) {
            c0563y = new C0563y(this);
            this.f16603a = c0563y;
        }
        c0563y.o0(EnumC0554o.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        kotlin.jvm.internal.h.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f16604b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        C0563y c0563y = this.f16603a;
        if (c0563y == null) {
            c0563y = new C0563y(this);
            this.f16603a = c0563y;
        }
        c0563y.o0(EnumC0554o.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C0563y c0563y = this.f16603a;
        if (c0563y == null) {
            c0563y = new C0563y(this);
            this.f16603a = c0563y;
        }
        c0563y.o0(EnumC0554o.ON_DESTROY);
        this.f16603a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i9) {
        b();
        super.setContentView(i9);
    }

    @Override // androidx.lifecycle.InterfaceC0561w
    public final D.n x() {
        C0563y c0563y = this.f16603a;
        if (c0563y == null) {
            C0563y c0563y2 = new C0563y(this);
            this.f16603a = c0563y2;
            return c0563y2;
        }
        return c0563y;
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        kotlin.jvm.internal.h.e(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.h.e(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
