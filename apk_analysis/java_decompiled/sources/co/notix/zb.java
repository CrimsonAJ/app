package co.notix;

import K5.ViewOnClickListenerC0215a;
import Y7.B;
import Y7.InterfaceC0484z;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.measurement.Y1;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class zb extends Activity {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f13653g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ia f13654a = wq.g();

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0484z f13655b = wq.f().c();

    /* renamed from: c, reason: collision with root package name */
    public g f13656c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13657d;

    /* renamed from: e, reason: collision with root package name */
    public O7.a f13658e;

    /* renamed from: f, reason: collision with root package name */
    public O7.a f13659f;

    public abstract Object a(E7.d dVar);

    public abstract void a();

    public abstract void a(View view);

    public void a(p8 reason) {
        kotlin.jvm.internal.h.e(reason, "reason");
        ia iaVar = this.f13654a;
        String data = c().a();
        iaVar.getClass();
        kotlin.jvm.internal.h.e(data, "data");
        B.r(iaVar.f12446c, null, new aa(iaVar, data, reason, null), 3);
        finish();
    }

    public abstract void a(String str);

    public abstract View b();

    public final g c() {
        g gVar = this.f13656c;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.h.h("model");
        throw null;
    }

    public final void d() {
        View b9 = b();
        if (b9 != null) {
            b9.setOnClickListener(new ViewOnClickListenerC0215a(14, this));
        }
    }

    public abstract void e();

    public abstract void f();

    @Override // android.app.Activity
    public final void onBackPressed() {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.h.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        f();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Y1.E(getWindow(), false);
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.h.d(decorView, "window.decorView");
        a(decorView);
        e();
        B.r(this.f13655b, null, new yb(this, null), 3);
    }

    public void a(long j) {
        new xb(j, new WeakReference(b())).start();
        View b9 = b();
        if (b9 != null) {
            b9.setAlpha(1.0f);
        }
        View b10 = b();
        FrameLayout.LayoutParams layoutParams = null;
        ViewGroup.LayoutParams layoutParams2 = b10 != null ? b10.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            int i9 = (int) (layoutParams3.width * 1.0f);
            layoutParams3.width = i9;
            layoutParams3.height = i9;
            layoutParams = layoutParams3;
        }
        View b11 = b();
        if (b11 == null) {
            return;
        }
        b11.setLayoutParams(layoutParams);
    }

    public static final void a(zb this$0, View view) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        this$0.a(p8.X);
    }
}
