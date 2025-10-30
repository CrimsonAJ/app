package co.notix.interstitial;

import A7.e;
import A7.n;
import C3.v;
import H.c;
import P.H;
import P.Q;
import P.u0;
import Y7.B;
import Z0.a;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import co.notix.d;
import co.notix.da;
import co.notix.h9;
import co.notix.hc;
import co.notix.ia;
import co.notix.jr;
import co.notix.m;
import co.notix.p8;
import co.notix.wq;
import co.notix.zb;
import java.util.WeakHashMap;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class WebViewInterstitialActivity extends zb {
    public FrameLayout j;

    /* renamed from: k, reason: collision with root package name */
    public WebView f12488k;

    /* renamed from: l, reason: collision with root package name */
    public ProgressBar f12489l;

    /* renamed from: h, reason: collision with root package name */
    public final ia f12486h = wq.g();

    /* renamed from: i, reason: collision with root package name */
    public final d f12487i = wq.i();

    /* renamed from: m, reason: collision with root package name */
    public final e f12490m = a.q(new jr(this));

    @Override // co.notix.zb
    public final void a() {
        this.f12488k = new WebView(this);
        String str = ((m) c()).f12753c;
        if (str == null || W7.d.U(str)) {
            WebView webView = this.f12488k;
            if (webView != null) {
                String str2 = ((m) c()).f12752b;
                h.b(str2);
                webView.loadUrl(str2);
            } else {
                h.h("wv");
                throw null;
            }
        } else {
            WebView webView2 = this.f12488k;
            if (webView2 != null) {
                String str3 = ((m) c()).f12753c;
                h.b(str3);
                webView2.loadDataWithBaseURL("http://example.com", str3, "text/html", null, "http://example.com");
            } else {
                h.h("wv");
                throw null;
            }
        }
        FrameLayout frameLayout = this.j;
        if (frameLayout == null) {
            h.h("root");
            throw null;
        }
        frameLayout.removeAllViews();
        FrameLayout frameLayout2 = this.j;
        if (frameLayout2 == null) {
            h.h("root");
            throw null;
        }
        WebView webView3 = this.f12488k;
        if (webView3 == null) {
            h.h("wv");
            throw null;
        }
        frameLayout2.addView(webView3);
        FrameLayout frameLayout3 = this.j;
        if (frameLayout3 != null) {
            frameLayout3.addView(b());
            a(((m) c()).f12751a);
        } else {
            h.h("root");
            throw null;
        }
    }

    @Override // co.notix.zb
    public final View b() {
        return (View) this.f12490m.getValue();
    }

    @Override // co.notix.zb
    public final void e() {
        FrameLayout frameLayout = new FrameLayout(this);
        this.j = frameLayout;
        setContentView(frameLayout);
        ProgressBar progressBar = new ProgressBar(this);
        this.f12489l = progressBar;
        progressBar.setLayoutParams(new FrameLayout.LayoutParams((int) h9.a(40), (int) h9.a(40), 17));
        ProgressBar progressBar2 = this.f12489l;
        if (progressBar2 == null) {
            h.h("pb");
            throw null;
        }
        progressBar2.setIndeterminate(true);
        FrameLayout frameLayout2 = this.j;
        if (frameLayout2 == null) {
            h.h("root");
            throw null;
        }
        ProgressBar progressBar3 = this.f12489l;
        if (progressBar3 != null) {
            frameLayout2.addView(progressBar3);
        } else {
            h.h("pb");
            throw null;
        }
    }

    @Override // co.notix.zb
    public final void f() {
    }

    @Override // co.notix.zb
    public final void a(View view) {
        h.e(view, "view");
        v vVar = new v(16, this);
        WeakHashMap weakHashMap = Q.f5546a;
        H.l(view, vVar);
    }

    public static final u0 a(WebViewInterstitialActivity this$0, View view, u0 u0Var) {
        h.e(this$0, "this$0");
        c f9 = u0Var.f5645a.f(519);
        h.d(f9, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        View b9 = this$0.b();
        ViewGroup.LayoutParams layoutParams = this$0.b().getLayoutParams();
        h.c(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = (int) h9.a(12);
        layoutParams2.leftMargin = (int) h9.a(12);
        layoutParams2.rightMargin = (int) h9.a(12);
        b9.setLayoutParams(layoutParams2);
        FrameLayout frameLayout = this$0.j;
        if (frameLayout == null) {
            h.h("root");
            throw null;
        }
        if (frameLayout == null) {
            h.h("root");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
        h.c(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.leftMargin = f9.f2914a;
        layoutParams4.topMargin = f9.f2915b;
        layoutParams4.rightMargin = f9.f2916c;
        layoutParams4.bottomMargin = f9.f2917d;
        frameLayout.setLayoutParams(layoutParams4);
        return u0.f5644b;
    }

    @Override // co.notix.zb
    public final void a(String data) {
        h.e(data, "data");
        ia iaVar = this.f12486h;
        iaVar.getClass();
        B.r(iaVar.f12446c, null, new da(iaVar, data, null), 3);
    }

    @Override // co.notix.zb
    public final Object a(E7.d dVar) {
        String stringExtra = getIntent().getStringExtra("start_id");
        n nVar = n.f558a;
        if (stringExtra != null) {
            d dVar2 = this.f12487i;
            dVar2.getClass();
            co.notix.e eVar = (co.notix.e) dVar2.f12066b.get(stringExtra);
            hc hcVar = eVar instanceof hc ? (hc) eVar : null;
            if (hcVar != null) {
                m mVar = hcVar.f12367a;
                h.e(mVar, "<set-?>");
                this.f13656c = mVar;
                this.f13657d = hcVar.f12368b;
                this.f13658e = hcVar.f12369c;
                this.f13659f = hcVar.f12370d;
                return nVar;
            }
        }
        a(p8.ERROR);
        return nVar;
    }
}
