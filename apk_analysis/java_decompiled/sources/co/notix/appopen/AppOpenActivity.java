package co.notix.appopen;

import A7.e;
import A7.j;
import C3.v;
import H.c;
import I5.k;
import O7.a;
import P.H;
import P.Q;
import P.u0;
import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import co.notix.R;
import co.notix.a7;
import co.notix.b7;
import co.notix.c7;
import co.notix.d;
import co.notix.h9;
import co.notix.i;
import co.notix.ia;
import co.notix.kd;
import co.notix.m6;
import co.notix.md;
import co.notix.mg;
import co.notix.n6;
import co.notix.o6;
import co.notix.p6;
import co.notix.q6;
import co.notix.r6;
import co.notix.s6;
import co.notix.t6;
import co.notix.u6;
import co.notix.v6;
import co.notix.v9;
import co.notix.w6;
import co.notix.wq;
import co.notix.x6;
import co.notix.y6;
import co.notix.z6;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.Y1;
import java.util.WeakHashMap;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class AppOpenActivity extends Activity {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f11873u = 0;

    /* renamed from: e, reason: collision with root package name */
    public c7 f11878e;

    /* renamed from: f, reason: collision with root package name */
    public a f11879f;

    /* renamed from: g, reason: collision with root package name */
    public a f11880g;

    /* renamed from: a, reason: collision with root package name */
    public final d f11874a = wq.c();

    /* renamed from: b, reason: collision with root package name */
    public final ia f11875b = wq.g();

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0484z f11876c = wq.f().c();

    /* renamed from: d, reason: collision with root package name */
    public final mg f11877d = new mg();

    /* renamed from: h, reason: collision with root package name */
    public final e f11881h = Z0.a.q(new b7(this));

    /* renamed from: i, reason: collision with root package name */
    public final e f11882i = Z0.a.q(new a7(this));
    public final e j = Z0.a.q(new r6(this));

    /* renamed from: k, reason: collision with root package name */
    public final e f11883k = Z0.a.q(new q6(this));

    /* renamed from: l, reason: collision with root package name */
    public final e f11884l = Z0.a.q(new t6(this));

    /* renamed from: m, reason: collision with root package name */
    public final e f11885m = Z0.a.q(new n6(this));

    /* renamed from: n, reason: collision with root package name */
    public final e f11886n = Z0.a.q(new u6(this));

    /* renamed from: o, reason: collision with root package name */
    public final e f11887o = Z0.a.q(new z6(this));

    /* renamed from: p, reason: collision with root package name */
    public final e f11888p = Z0.a.q(new m6(this));

    /* renamed from: q, reason: collision with root package name */
    public final e f11889q = Z0.a.q(new w6(this));

    /* renamed from: r, reason: collision with root package name */
    public final e f11890r = Z0.a.q(new p6(this));

    /* renamed from: s, reason: collision with root package name */
    public final e f11891s = Z0.a.q(new s6(this));

    /* renamed from: t, reason: collision with root package name */
    public final e f11892t = Z0.a.q(new o6(this));

    public final void a(View view) {
        v vVar = new v(15, this);
        WeakHashMap weakHashMap = Q.f5546a;
        H.l(view, vVar);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Y1.E(getWindow(), false);
        View decorView = getWindow().getDecorView();
        h.d(decorView, "window.decorView");
        a(decorView);
        setContentView(R.layout.notix_activity_appopen);
        B.r(this.f11876c, null, new v6(this, null), 3);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        String stringExtra = getIntent().getStringExtra("start_id");
        if (stringExtra != null) {
            d dVar = this.f11874a;
            dVar.getClass();
        }
        this.f11877d.a(this.f11880g);
    }

    public final void a() {
        String str;
        c7 c7Var = this.f11878e;
        if (c7Var != null) {
            i iVar = c7Var.f11987a;
            Object value = this.f11881h.getValue();
            h.d(value, "<get-tvTitle>(...)");
            ((TextView) value).setText(iVar.f12416a);
            Object value2 = this.f11882i.getValue();
            h.d(value2, "<get-tvDescription>(...)");
            ((TextView) value2).setText(iVar.f12417b);
            Object value3 = this.j.getValue();
            h.d(value3, "<get-ivImage>(...)");
            ((ImageView) value3).setOutlineProvider(new x6());
            Object value4 = this.j.getValue();
            h.d(value4, "<get-ivImage>(...)");
            ((ImageView) value4).setClipToOutline(true);
            Object value5 = this.j.getValue();
            h.d(value5, "<get-ivImage>(...)");
            ((ImageView) value5).setImageBitmap(iVar.f12418c);
            if (iVar.f12420e == null) {
                Object value6 = this.f11883k.getValue();
                h.d(value6, "<get-ivIcon>(...)");
                ((ImageView) value6).setVisibility(8);
            } else {
                Object value7 = this.f11883k.getValue();
                h.d(value7, "<get-ivIcon>(...)");
                ((ImageView) value7).setImageBitmap(iVar.f12420e);
            }
            int i9 = getApplicationInfo().icon;
            Integer valueOf = Integer.valueOf(i9);
            if (i9 == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Object value8 = this.f11885m.getValue();
                h.d(value8, "<get-ivAppIcon>(...)");
                ((ImageView) value8).setImageDrawable(getDrawable(intValue));
            }
            Object value9 = this.f11887o.getValue();
            h.d(value9, "<get-tvAppname>(...)");
            TextView textView = (TextView) value9;
            int i10 = getApplicationInfo().labelRes;
            Integer valueOf2 = Integer.valueOf(i10);
            if (i10 == 0) {
                valueOf2 = null;
            }
            if (valueOf2 == null || (str = getString(valueOf2.intValue())) == null) {
                str = "";
            }
            textView.setText(str);
            Object value10 = this.f11884l.getValue();
            h.d(value10, "<get-llContinueContainer>(...)");
            ((LinearLayout) value10).setOnClickListener(null);
            Object value11 = this.f11888p.getValue();
            h.d(value11, "<get-flContinue>(...)");
            ((FrameLayout) value11).setBackground(null);
            Object value12 = this.f11890r.getValue();
            h.d(value12, "<get-ivContinue>(...)");
            ((ImageView) value12).setAlpha(0.0f);
            Object value13 = this.f11889q.getValue();
            h.d(value13, "<get-pbContinue>(...)");
            ((ProgressBar) value13).setAlpha(1.0f);
            B.r(this.f11876c, null, new y6(this, null), 3);
            Object value14 = this.f11891s.getValue();
            h.d(value14, "<get-llContentCard>(...)");
            ((LinearLayout) value14).setOnClickListener(new k(this, 11, iVar));
            ia iaVar = this.f11875b;
            c7 c7Var2 = this.f11878e;
            if (c7Var2 != null) {
                String data = c7Var2.f11987a.f12423h;
                iaVar.getClass();
                h.e(data, "data");
                B.r(iaVar.f12446c, null, new v9(iaVar, data, null), 3);
                return;
            }
            h.h("appOpenData");
            throw null;
        }
        h.h("appOpenData");
        throw null;
    }

    public static final void a(AppOpenActivity this$0, i this_with, View view) {
        Object obj;
        h.e(this$0, "this$0");
        h.e(this_with, "$this_with");
        String url = this_with.f12422g;
        h.e(url, "url");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            this$0.startActivity(intent);
            obj = intent;
        } catch (Throwable th) {
            obj = AbstractC0485a.h(th);
        }
        Throwable a5 = j.a(obj);
        if (a5 == null) {
            md.f12779a.b("successfully started activity with url: ".concat(url));
        } else {
            kd kdVar = md.f12779a;
            StringBuilder r5 = AbstractC0953k1.r("couldn't start activity with url=", url, ", error=");
            r5.append(a5.getMessage());
            kdVar.a(r5.toString(), a5);
        }
        this$0.f11877d.a(this$0.f11879f);
    }

    public static final u0 a(AppOpenActivity this$0, View view, u0 u0Var) {
        h.e(this$0, "this$0");
        c f9 = u0Var.f5645a.f(519);
        h.d(f9, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        Object value = this$0.f11886n.getValue();
        h.d(value, "<get-llHeader>(...)");
        Object value2 = this$0.f11886n.getValue();
        h.d(value2, "<get-llHeader>(...)");
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) value2).getLayoutParams();
        h.c(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = f9.f2915b;
        ((LinearLayout) value).setLayoutParams(layoutParams2);
        Object value3 = this$0.f11892t.getValue();
        h.d(value3, "<get-ivClick>(...)");
        Object value4 = this$0.f11892t.getValue();
        h.d(value4, "<get-ivClick>(...)");
        ViewGroup.LayoutParams layoutParams3 = ((ImageView) value4).getLayoutParams();
        h.c(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.bottomMargin = f9.f2917d + ((int) h9.a(24));
        ((ImageView) value3).setLayoutParams(layoutParams4);
        return u0.f5644b;
    }
}
