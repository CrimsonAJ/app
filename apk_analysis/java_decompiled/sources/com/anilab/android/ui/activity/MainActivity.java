package com.anilab.android.ui.activity;

import A7.l;
import B7.C0051b;
import B7.t;
import C2.P;
import C6.a;
import I1.n;
import J1.AbstractC0159a;
import J2.b;
import L1.C0219a;
import L1.C0220b;
import L1.C0224f;
import L1.C0232n;
import L1.C0233o;
import L1.M;
import L1.N;
import L1.S;
import M1.C;
import M1.C0248d;
import M1.D;
import M1.E;
import M1.ViewOnClickListenerC0245a;
import W.c;
import W.g;
import W7.d;
import W7.k;
import Y2.r;
import Y7.B;
import a.AbstractC0485a;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PointF;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.y;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Y;
import androidx.lifecycle.h0;
import androidx.navigation.fragment.NavHostFragment;
import co.notix.R;
import com.anilab.android.ui.activity.MainActivity;
import com.anilab.android.ui.player.PlayerActivity;
import com.anilab.domain.model.Movie;
import com.google.android.gms.internal.measurement.Y1;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.u;
import d.AbstractActivityC1071l;
import f.e;
import f5.C1177i;
import g.C1188a;
import i.AbstractActivityC1322h;
import i0.AbstractComponentCallbacksC1366v;
import java.util.ArrayList;
import java.util.Locale;
import k4.C1499E;
import k4.C1521v;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import m0.C1580c;
import m0.C1581d;
import u0.H;
import u7.C2089e;
import u7.InterfaceC2085a;
import v7.C2114b;
import v7.C2116d;
import x7.InterfaceC2180b;

/* loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC1322h implements InterfaceC2180b {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f13723j0 = 0;

    /* renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f13724k0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public H f13725A;

    /* renamed from: B, reason: collision with root package name */
    public u f13726B;

    /* renamed from: C, reason: collision with root package name */
    public volatile C2114b f13727C;

    /* renamed from: D, reason: collision with root package name */
    public final Object f13728D = new Object();

    /* renamed from: X, reason: collision with root package name */
    public boolean f13729X = false;
    public final r Y;

    /* renamed from: Z, reason: collision with root package name */
    public final e f13730Z;

    /* renamed from: f0, reason: collision with root package name */
    public final e f13731f0;

    /* renamed from: g0, reason: collision with root package name */
    public final l f13732g0;

    /* renamed from: h0, reason: collision with root package name */
    public final l f13733h0;

    /* renamed from: i0, reason: collision with root package name */
    public final l f13734i0;

    /* renamed from: z, reason: collision with root package name */
    public g f13735z;

    public MainActivity() {
        J(new C0219a(this, 0));
        this.Y = new r(p.a(S.class), new C0233o(this, 1), new C0233o(this, 0), new C0233o(this, 2));
        this.f13730Z = this.f16595l.c("activity_rq#" + this.f16594k.getAndIncrement(), this, new C1188a(1), new a(12));
        this.f13731f0 = this.f16595l.c("activity_rq#" + this.f16594k.getAndIncrement(), this, new C1188a(2), new C0220b(this));
        final int i9 = 0;
        this.f13732g0 = Z0.a.q(new O7.a(this) { // from class: L1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f4517b;

            {
                this.f4517b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                MainActivity mainActivity = this.f4517b;
                switch (i9) {
                    case 0:
                        int i10 = MainActivity.f13724k0;
                        return (ConnectivityManager) mainActivity.getSystemService(ConnectivityManager.class);
                    default:
                        int i11 = MainActivity.f13724k0;
                        return new C0224f(mainActivity);
                }
            }
        });
        this.f13733h0 = Z0.a.q(new P(3));
        final int i10 = 1;
        this.f13734i0 = Z0.a.q(new O7.a(this) { // from class: L1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainActivity f4517b;

            {
                this.f4517b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                MainActivity mainActivity = this.f4517b;
                switch (i10) {
                    case 0:
                        int i102 = MainActivity.f13724k0;
                        return (ConnectivityManager) mainActivity.getSystemService(ConnectivityManager.class);
                    default:
                        int i11 = MainActivity.f13724k0;
                        return new C0224f(mainActivity);
                }
            }
        });
    }

    public final C2114b S() {
        if (this.f13727C == null) {
            synchronized (this.f13728D) {
                try {
                    if (this.f13727C == null) {
                        this.f13727C = new C2114b((AbstractActivityC1322h) this);
                    }
                } finally {
                }
            }
        }
        return this.f13727C;
    }

    public final void T() {
        FirebaseMessaging D8 = s8.e.D();
        C1177i c1177i = new C1177i();
        D8.f16448f.execute(new A6.r(D8, 10, c1177i));
        c1177i.f17413a.k(new C0220b(this));
    }

    public final ConnectivityManager U() {
        return (ConnectivityManager) this.f13732g0.getValue();
    }

    public final S V() {
        return (S) this.Y.getValue();
    }

    public final void W(Bundle bundle, boolean z9) {
        Object obj;
        Long l9;
        String str;
        String str2;
        String str3;
        long j;
        Long F2;
        Object obj2;
        Long l10;
        String str4;
        String str5;
        String str6;
        if (bundle != null) {
            String string = bundle.getString("link");
            if (string != null && !d.U(string)) {
                try {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
                    return;
                } catch (Throwable th) {
                    AbstractC0485a.h(th);
                }
            }
            String string2 = bundle.getString("children_id");
            String string3 = bundle.getString("parent_id");
            H7.a aVar = b.f4160e;
            if (string3 != null && string3.length() != 0 && string2 != null && string2.length() != 0) {
                aVar.getClass();
                C0051b c0051b = new C0051b(0, aVar);
                while (true) {
                    if (c0051b.hasNext()) {
                        obj2 = c0051b.next();
                        if (((b) obj2).f4161a.equalsIgnoreCase(bundle.getString("movie_type"))) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                b bVar = (b) obj2;
                String string4 = bundle.getString("movie_id");
                if (string4 != null) {
                    l10 = k.F(string4);
                } else {
                    l10 = null;
                }
                if (l10 != null && l10.longValue() > -1) {
                    String string5 = bundle.getString("movie_title");
                    if (string5 == null) {
                        str4 = "";
                    } else {
                        str4 = string5;
                    }
                    String string6 = bundle.getString("movie_poster");
                    if (string6 != null) {
                        str5 = W7.l.J(string6, "{width}x{height}", "313x438");
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str6 = "";
                    } else {
                        str6 = str5;
                    }
                    if (bVar == null) {
                        bVar = b.f4158c;
                    }
                    Movie movie = new Movie(l10.longValue(), str6, str4, null, null, null, 0, bVar, null, 0, 0, 0, 0.0d, 0L, null, false, null, null, false, 2097016);
                    S V8 = V();
                    V8.d(false, new M(V8, movie, string3, string2, null));
                    return;
                }
                return;
            }
            aVar.getClass();
            C0051b c0051b2 = new C0051b(0, aVar);
            while (true) {
                if (c0051b2.hasNext()) {
                    obj = c0051b2.next();
                    if (((b) obj).f4161a.equalsIgnoreCase(bundle.getString("movie_type"))) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            b bVar2 = (b) obj;
            if (bVar2 != null) {
                String string7 = bundle.getString("movie_id");
                if (string7 != null) {
                    l9 = k.F(string7);
                } else {
                    l9 = null;
                }
                if (l9 != null && l9.longValue() > -1) {
                    String string8 = bundle.getString("movie_title");
                    if (string8 == null) {
                        str = "";
                    } else {
                        str = string8;
                    }
                    String string9 = bundle.getString("movie_poster");
                    if (string9 != null) {
                        str2 = W7.l.J(string9, "{width}x{height}", "313x438");
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    String string10 = bundle.getString("episode_id");
                    if (string10 != null && (F2 = k.F(string10)) != null) {
                        j = F2.longValue();
                    } else {
                        j = -1;
                    }
                    boolean parseBoolean = Boolean.parseBoolean(bundle.getString("play"));
                    Movie movie2 = new Movie(l9.longValue(), str3, str, null, null, null, 0, bVar2, null, 0, 0, 0, 0.0d, 0L, null, false, null, null, false, 2097016);
                    String str7 = str3;
                    String str8 = str;
                    if (z9) {
                        if (parseBoolean) {
                            long longValue = l9.longValue();
                            t tVar = t.f1135a;
                            Intent intent = new Intent(this, (Class<?>) PlayerActivity.class);
                            intent.putExtra("extra_id", longValue);
                            intent.putExtra("extra_name", str8);
                            intent.putExtra("extra_poster", str7);
                            intent.putExtra("extra_episode_id", j);
                            intent.putExtra("extra_year", 0);
                            intent.putStringArrayListExtra("extra_al_names", new ArrayList<>(tVar));
                            this.f13731f0.a(intent);
                            return;
                        }
                        n nVar = new n(movie2, null, null);
                        try {
                            H h7 = this.f13725A;
                            if (h7 != null) {
                                h7.l(nVar);
                                return;
                            } else {
                                h.h("navController");
                                throw null;
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    if (parseBoolean) {
                        S V9 = V();
                        V9.d(false, new N(V9, l9.longValue(), str8, str7, j, null));
                    } else {
                        S V10 = V();
                        V10.d(false, new M(V10, movie2, null, null, null));
                    }
                }
            }
        }
    }

    public final void X(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        DataBinderMapperImpl dataBinderMapperImpl = c.f7843a;
        setContentView(R.layout.activity_main);
        g a5 = c.a((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content), 0, R.layout.activity_main);
        h.e(a5, "<set-?>");
        this.f13735z = a5;
        a5.i0(this);
        V();
        AbstractComponentCallbacksC1366v B9 = P().B(R.id.nav_host);
        h.c(B9, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        H e02 = ((NavHostFragment) B9).e0();
        h.e(e02, "<set-?>");
        this.f13725A = e02;
        B.r(Y.f(this), null, new C0248d(null, this), 3);
        Y1.E(getWindow(), false);
        Locale.setDefault(Locale.ENGLISH);
        T();
        int i9 = Build.VERSION.SDK_INT;
        l lVar = this.f13734i0;
        if (i9 >= 24) {
            U().registerDefaultNetworkCallback((C0224f) lVar.getValue());
        } else {
            U().registerNetworkCallback((NetworkRequest) this.f13733h0.getValue(), (C0224f) lVar.getValue());
        }
        Intent intent = getIntent();
        if (intent != null) {
            bundle2 = intent.getExtras();
        } else {
            bundle2 = null;
        }
        W(bundle2, false);
        B.r(Y.f(this), null, new C0232n(null, this), 3);
        if (i9 >= 33 && E.d.a(this, "android.permission.POST_NOTIFICATIONS") != 0 && !shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
            this.f13730Z.a("android.permission.POST_NOTIFICATIONS");
        }
    }

    public final void Y() {
        super.onDestroy();
        u uVar = this.f13726B;
        if (uVar != null) {
            uVar.f16512a = null;
        }
    }

    public final void Z(E uiText) {
        String string;
        h.e(uiText, "uiText");
        if (uiText instanceof C) {
            string = ((C) uiText).f4703a;
        } else if (uiText instanceof D) {
            string = getString(((D) uiText).f4704a);
            h.d(string, "getString(...)");
        } else {
            throw new RuntimeException();
        }
        g gVar = this.f13735z;
        if (gVar != null) {
            I5.l g9 = I5.l.g(gVar.f7853k, string);
            g9.h(new ViewOnClickListenerC0245a(0));
            g9.i();
            return;
        }
        h.h("binding");
        throw null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View currentFocus = getCurrentFocus();
        if (motionEvent != null && (currentFocus instanceof EditText)) {
            h.e(currentFocus, "<this>");
            int[] iArr = new int[2];
            currentFocus.getLocationOnScreen(iArr);
            PointF pointF = new PointF(new Point(iArr[0], iArr[1]));
            EditText editText = (EditText) currentFocus;
            float left = editText.getLeft();
            float right = editText.getRight();
            float f9 = pointF.y;
            float measuredHeight = editText.getMeasuredHeight() + f9;
            float y9 = motionEvent.getY();
            g gVar = this.f13735z;
            InputMethodManager inputMethodManager = null;
            if (gVar != null) {
                View view = ((AbstractC0159a) gVar).f7853k;
                h.d(view, "getRoot(...)");
                view.getLocationOnScreen(new int[2]);
                float f10 = y9 + new Point(r1[0], r1[1]).y;
                float x5 = motionEvent.getX();
                if (x5 < left || x5 > right || f10 < f9 || f10 > measuredHeight) {
                    Object systemService = editText.getContext().getSystemService("input_method");
                    if (systemService instanceof InputMethodManager) {
                        inputMethodManager = (InputMethodManager) systemService;
                    }
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    }
                    editText.clearFocus();
                }
            } else {
                h.h("binding");
                throw null;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // x7.InterfaceC2180b
    public final Object e() {
        return S().e();
    }

    @Override // d.AbstractActivityC1071l, androidx.lifecycle.InterfaceC0550k
    public final h0 j() {
        h0 j = super.j();
        C1499E a5 = ((I1.e) ((InterfaceC2085a) v4.e.p(InterfaceC2085a.class, this))).a();
        j.getClass();
        return new C2089e((C1521v) a5.f19985b, j, (A1.g) a5.f19986c);
    }

    @Override // i0.AbstractActivityC1369y, d.AbstractActivityC1071l, D.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        X(bundle);
        if (getApplication() instanceof InterfaceC2180b) {
            C2114b c2114b = (C2114b) S().f23905d;
            u uVar = ((C2116d) new y(c2114b.f23904c, new C1580c(2, (AbstractActivityC1071l) c2114b.f23905d)).J(C2116d.class)).f23908e;
            this.f13726B = uVar;
            if (((C1581d) uVar.f16512a) == null) {
                uVar.f16512a = p();
            }
        }
    }

    @Override // i.AbstractActivityC1322h, i0.AbstractActivityC1369y, android.app.Activity
    public final void onDestroy() {
        U().unregisterNetworkCallback((C0224f) this.f13734i0.getValue());
        Y();
    }

    @Override // d.AbstractActivityC1071l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Bundle bundle;
        super.onNewIntent(intent);
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        W(bundle, true);
    }
}
