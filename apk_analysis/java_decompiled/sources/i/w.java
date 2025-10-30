package i;

import P.Q;
import P.X;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import b5.G1;
import f5.C1183o;
import h.AbstractC1260a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import n.AbstractC1595a;
import n.C1597c;
import p.C1770T0;
import p.C1780Y0;
import p.C1795g;
import p.C1805l;
import p.C1821t;
import p.InterfaceC1792e0;
import p.InterfaceC1794f0;
import p.g1;
import s.C1939i;

/* loaded from: classes.dex */
public final class w extends l implements o.j, LayoutInflater.Factory2 {

    /* renamed from: F0, reason: collision with root package name */
    public static final C1939i f18111F0 = new C1939i(0);

    /* renamed from: G0, reason: collision with root package name */
    public static final int[] f18112G0 = {R.attr.windowBackground};

    /* renamed from: H0, reason: collision with root package name */
    public static final boolean f18113H0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public ViewGroup f18114A;

    /* renamed from: A0, reason: collision with root package name */
    public Rect f18115A0;

    /* renamed from: B, reason: collision with root package name */
    public TextView f18116B;

    /* renamed from: B0, reason: collision with root package name */
    public Rect f18117B0;

    /* renamed from: C, reason: collision with root package name */
    public View f18118C;

    /* renamed from: C0, reason: collision with root package name */
    public C1312B f18119C0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f18120D;

    /* renamed from: D0, reason: collision with root package name */
    public OnBackInvokedDispatcher f18121D0;

    /* renamed from: E0, reason: collision with root package name */
    public OnBackInvokedCallback f18122E0;

    /* renamed from: X, reason: collision with root package name */
    public boolean f18123X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f18124Z;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f18125f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f18126g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f18127h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f18128i0;
    public final Object j;

    /* renamed from: j0, reason: collision with root package name */
    public v[] f18129j0;

    /* renamed from: k, reason: collision with root package name */
    public final Context f18130k;

    /* renamed from: k0, reason: collision with root package name */
    public v f18131k0;

    /* renamed from: l, reason: collision with root package name */
    public Window f18132l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f18133l0;

    /* renamed from: m, reason: collision with root package name */
    public s f18134m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f18135m0;

    /* renamed from: n, reason: collision with root package name */
    public final Object f18136n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f18137n0;

    /* renamed from: o, reason: collision with root package name */
    public I f18138o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f18139o0;

    /* renamed from: p, reason: collision with root package name */
    public n.h f18140p;

    /* renamed from: p0, reason: collision with root package name */
    public Configuration f18141p0;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f18142q;

    /* renamed from: q0, reason: collision with root package name */
    public final int f18143q0;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1792e0 f18144r;
    public int r0;

    /* renamed from: s, reason: collision with root package name */
    public C1183o f18145s;

    /* renamed from: s0, reason: collision with root package name */
    public int f18146s0;

    /* renamed from: t, reason: collision with root package name */
    public n f18147t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f18148t0;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC1595a f18149u;

    /* renamed from: u0, reason: collision with root package name */
    public t f18150u0;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f18151v;

    /* renamed from: v0, reason: collision with root package name */
    public t f18152v0;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f18153w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f18154w0;

    /* renamed from: x, reason: collision with root package name */
    public m f18155x;

    /* renamed from: x0, reason: collision with root package name */
    public int f18156x0;

    /* renamed from: y, reason: collision with root package name */
    public X f18157y = null;

    /* renamed from: y0, reason: collision with root package name */
    public final m f18158y0 = new m(this, 0);

    /* renamed from: z, reason: collision with root package name */
    public boolean f18159z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f18160z0;

    public w(Context context, Window window, InterfaceC1323i interfaceC1323i, Object obj) {
        AbstractActivityC1322h abstractActivityC1322h = null;
        this.f18143q0 = -100;
        this.f18130k = context;
        this.f18136n = interfaceC1323i;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof AbstractActivityC1322h) {
                        abstractActivityC1322h = (AbstractActivityC1322h) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC1322h != null) {
                this.f18143q0 = ((w) abstractActivityC1322h.R()).f18143q0;
            }
        }
        if (this.f18143q0 == -100) {
            C1939i c1939i = f18111F0;
            Integer num = (Integer) c1939i.get(this.j.getClass().getName());
            if (num != null) {
                this.f18143q0 = num.intValue();
                c1939i.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            m(window);
        }
        C1821t.d();
    }

    public static L.g n(Context context) {
        L.g gVar;
        L.g b9;
        Locale locale;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33 || (gVar = l.f18075c) == null) {
            return null;
        }
        L.g y9 = y(context.getApplicationContext().getResources().getConfiguration());
        L.i iVar = gVar.f4447a;
        if (i9 >= 24) {
            if (iVar.isEmpty()) {
                b9 = L.g.f4446b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i10 = 0; i10 < y9.f4447a.size() + iVar.size(); i10++) {
                    if (i10 < iVar.size()) {
                        locale = iVar.get(i10);
                    } else {
                        locale = y9.f4447a.get(i10 - iVar.size());
                    }
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                }
                b9 = L.g.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (iVar.isEmpty()) {
            b9 = L.g.f4446b;
        } else {
            b9 = L.g.b(p.b(iVar.get(0)));
        }
        if (b9.f4447a.isEmpty()) {
            return y9;
        }
        return b9;
    }

    public static Configuration r(Context context, int i9, L.g gVar, Configuration configuration, boolean z9) {
        int i10;
        if (i9 != 1) {
            if (i9 != 2) {
                if (z9) {
                    i10 = 0;
                } else {
                    i10 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i10 = 32;
            }
        } else {
            i10 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                q.d(configuration2, gVar);
                return configuration2;
            }
            L.i iVar = gVar.f4447a;
            configuration2.setLocale(iVar.get(0));
            configuration2.setLayoutDirection(iVar.get(0));
        }
        return configuration2;
    }

    public static L.g y(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return q.b(configuration);
        }
        return L.g.b(p.b(configuration.locale));
    }

    public final void A() {
        v();
        if (this.Y && this.f18138o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.f18138o = new I((Activity) obj, this.f18124Z);
            } else if (obj instanceof Dialog) {
                this.f18138o = new I((Dialog) obj);
            }
            I i9 = this.f18138o;
            if (i9 != null) {
                i9.F(this.f18160z0);
            }
        }
    }

    public final void B(int i9) {
        this.f18156x0 = (1 << i9) | this.f18156x0;
        if (!this.f18154w0) {
            View decorView = this.f18132l.getDecorView();
            m mVar = this.f18158y0;
            WeakHashMap weakHashMap = Q.f5546a;
            decorView.postOnAnimation(mVar);
            this.f18154w0 = true;
        }
    }

    public final int C(Context context, int i9) {
        if (i9 != -100) {
            if (i9 != -1) {
                if (i9 != 0) {
                    if (i9 != 1 && i9 != 2) {
                        if (i9 == 3) {
                            if (this.f18152v0 == null) {
                                this.f18152v0 = new t(this, context);
                            }
                            return this.f18152v0.i();
                        }
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return x(context).i();
                }
            }
            return i9;
        }
        return -1;
    }

    public final boolean D() {
        InterfaceC1794f0 interfaceC1794f0;
        C1770T0 c1770t0;
        o.n nVar;
        boolean z9 = this.f18133l0;
        this.f18133l0 = false;
        v z10 = z(0);
        if (z10.f18107m) {
            if (!z9) {
                q(z10, true);
                return true;
            }
        } else {
            AbstractC1595a abstractC1595a = this.f18149u;
            if (abstractC1595a != null) {
                abstractC1595a.a();
                return true;
            }
            A();
            I i9 = this.f18138o;
            if (i9 == null || (interfaceC1794f0 = i9.f18005k) == null || (c1770t0 = ((C1780Y0) interfaceC1794f0).f21928a.f9505m0) == null || c1770t0.f21918b == null) {
                return false;
            }
            C1770T0 c1770t02 = ((C1780Y0) interfaceC1794f0).f21928a.f9505m0;
            if (c1770t02 == null) {
                nVar = null;
            } else {
                nVar = c1770t02.f21918b;
            }
            if (nVar != null) {
                nVar.collapseActionView();
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0175, code lost:
    
        if (r3.f21367f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0155, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(i.v r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.w.E(i.v, android.view.KeyEvent):void");
    }

    public final boolean F(v vVar, int i9, KeyEvent keyEvent) {
        o.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!vVar.f18105k && !G(vVar, keyEvent)) || (lVar = vVar.f18103h) == null) {
            return false;
        }
        return lVar.performShortcut(i9, keyEvent, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        if (r13.f18103h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G(i.v r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.w.G(i.v, android.view.KeyEvent):boolean");
    }

    public final void H() {
        if (!this.f18159z) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z9 = false;
            if (this.f18121D0 != null && (z(0).f18107m || this.f18149u != null)) {
                z9 = true;
            }
            if (z9 && this.f18122E0 == null) {
                this.f18122E0 = r.b(this.f18121D0, this);
            } else if (!z9 && (onBackInvokedCallback = this.f18122E0) != null) {
                r.c(this.f18121D0, onBackInvokedCallback);
                this.f18122E0 = null;
            }
        }
    }

    @Override // i.l
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f18130k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof w)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // i.l
    public final void c() {
        String str;
        this.f18135m0 = true;
        k(false, true);
        w();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = D.c.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e8) {
                    throw new IllegalArgumentException(e8);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                I i9 = this.f18138o;
                if (i9 == null) {
                    this.f18160z0 = true;
                } else {
                    i9.F(true);
                }
            }
            synchronized (l.f18080h) {
                l.e(this);
                l.f18079g.add(new WeakReference(this));
            }
        }
        this.f18141p0 = new Configuration(this.f18130k.getResources().getConfiguration());
        this.f18137n0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // i.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = i.l.f18080h
            monitor-enter(r0)
            i.l.e(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f18154w0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f18132l
            android.view.View r0 = r0.getDecorView()
            i.m r1 = r3.f18158y0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f18139o0 = r0
            int r0 = r3.f18143q0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            s.i r0 = i.w.f18111F0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f18143q0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            s.i r0 = i.w.f18111F0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            i.t r0 = r3.f18150u0
            if (r0 == 0) goto L63
            r0.d()
        L63:
            i.t r0 = r3.f18152v0
            if (r0 == 0) goto L6a
            r0.d()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.w.d():void");
    }

    @Override // i.l
    public final boolean f(int i9) {
        if (i9 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i9 = 108;
        } else if (i9 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i9 = 109;
        }
        if (this.f18127h0 && i9 == 108) {
            return false;
        }
        if (this.Y && i9 == 1) {
            this.Y = false;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 5) {
                    if (i9 != 10) {
                        if (i9 != 108) {
                            if (i9 != 109) {
                                return this.f18132l.requestFeature(i9);
                            }
                            H();
                            this.f18124Z = true;
                            return true;
                        }
                        H();
                        this.Y = true;
                        return true;
                    }
                    H();
                    this.f18125f0 = true;
                    return true;
                }
                H();
                this.f18123X = true;
                return true;
            }
            H();
            this.f18120D = true;
            return true;
        }
        H();
        this.f18127h0 = true;
        return true;
    }

    @Override // i.l
    public final void g(int i9) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f18114A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f18130k).inflate(i9, viewGroup);
        this.f18134m.a(this.f18132l.getCallback());
    }

    @Override // i.l
    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f18114A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f18134m.a(this.f18132l.getCallback());
    }

    @Override // i.l
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f18114A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f18134m.a(this.f18132l.getCallback());
    }

    @Override // i.l
    public final void j(CharSequence charSequence) {
        this.f18142q = charSequence;
        InterfaceC1792e0 interfaceC1792e0 = this.f18144r;
        if (interfaceC1792e0 != null) {
            interfaceC1792e0.setWindowTitle(charSequence);
            return;
        }
        I i9 = this.f18138o;
        if (i9 != null) {
            C1780Y0 c1780y0 = (C1780Y0) i9.f18005k;
            if (!c1780y0.f21934g) {
                c1780y0.f21935h = charSequence;
                if ((c1780y0.f21929b & 8) != 0) {
                    Toolbar toolbar = c1780y0.f21928a;
                    toolbar.setTitle(charSequence);
                    if (c1780y0.f21934g) {
                        Q.n(toolbar.getRootView(), charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = this.f18116B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.w.k(boolean, boolean):boolean");
    }

    @Override // o.j
    public final boolean l(o.l lVar, MenuItem menuItem) {
        int i9;
        v vVar;
        Window.Callback callback = this.f18132l.getCallback();
        if (callback != null && !this.f18139o0) {
            o.l k5 = lVar.k();
            v[] vVarArr = this.f18129j0;
            if (vVarArr != null) {
                i9 = vVarArr.length;
            } else {
                i9 = 0;
            }
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    vVar = vVarArr[i10];
                    if (vVar != null && vVar.f18103h == k5) {
                        break;
                    }
                    i10++;
                } else {
                    vVar = null;
                    break;
                }
            }
            if (vVar != null) {
                return callback.onMenuItemSelected(vVar.f18096a, menuItem);
            }
        }
        return false;
    }

    public final void m(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f18132l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof s)) {
                s sVar = new s(this, callback);
                this.f18134m = sVar;
                window.setCallback(sVar);
                G1 v8 = G1.v(this.f18130k, null, f18112G0);
                Drawable p9 = v8.p(0);
                if (p9 != null) {
                    window.setBackgroundDrawable(p9);
                }
                v8.y();
                this.f18132l = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f18121D0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f18122E0) != null) {
                        r.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f18122E0 = null;
                    }
                    Object obj = this.j;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.f18121D0 = r.a(activity);
                            I();
                            return;
                        }
                    }
                    this.f18121D0 = null;
                    I();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void o(int i9, v vVar, o.l lVar) {
        if (lVar == null) {
            if (vVar == null && i9 >= 0) {
                v[] vVarArr = this.f18129j0;
                if (i9 < vVarArr.length) {
                    vVar = vVarArr[i9];
                }
            }
            if (vVar != null) {
                lVar = vVar.f18103h;
            }
        }
        if ((vVar == null || vVar.f18107m) && !this.f18139o0) {
            s sVar = this.f18134m;
            Window.Callback callback = this.f18132l.getCallback();
            sVar.getClass();
            try {
                sVar.f18090d = true;
                callback.onPanelClosed(i9, lVar);
            } finally {
                sVar.f18090d = false;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0115, code lost:
    
        if (r2.equals("ImageButton") == false) goto L24;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r18, java.lang.String r19, android.content.Context r20, android.util.AttributeSet r21) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.w.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(o.l lVar) {
        C1805l c1805l;
        if (this.f18128i0) {
            return;
        }
        this.f18128i0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f18144r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((C1780Y0) actionBarOverlayLayout.f9401e).f21928a.f9486a;
        if (actionMenuView != null && (c1805l = actionMenuView.f9426t) != null) {
            c1805l.d();
            C1795g c1795g = c1805l.f22026u;
            if (c1795g != null && c1795g.b()) {
                c1795g.f21449i.dismiss();
            }
        }
        Window.Callback callback = this.f18132l.getCallback();
        if (callback != null && !this.f18139o0) {
            callback.onPanelClosed(108, lVar);
        }
        this.f18128i0 = false;
    }

    public final void q(v vVar, boolean z9) {
        u uVar;
        InterfaceC1792e0 interfaceC1792e0;
        C1805l c1805l;
        if (z9 && vVar.f18096a == 0 && (interfaceC1792e0 = this.f18144r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1792e0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((C1780Y0) actionBarOverlayLayout.f9401e).f21928a.f9486a;
            if (actionMenuView != null && (c1805l = actionMenuView.f9426t) != null && c1805l.e()) {
                p(vVar.f18103h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f18130k.getSystemService("window");
        if (windowManager != null && vVar.f18107m && (uVar = vVar.f18100e) != null) {
            windowManager.removeView(uVar);
            if (z9) {
                o(vVar.f18096a, vVar, null);
            }
        }
        vVar.f18105k = false;
        vVar.f18106l = false;
        vVar.f18107m = false;
        vVar.f18101f = null;
        vVar.f18108n = true;
        if (this.f18131k0 == vVar) {
            this.f18131k0 = null;
        }
        if (vVar.f18096a == 0) {
            I();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        if (r7.d() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0102, code lost:
    
        if (r7.n() != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.w.s(android.view.KeyEvent):boolean");
    }

    public final void t(int i9) {
        v z9 = z(i9);
        if (z9.f18103h != null) {
            Bundle bundle = new Bundle();
            z9.f18103h.t(bundle);
            if (bundle.size() > 0) {
                z9.f18110p = bundle;
            }
            z9.f18103h.w();
            z9.f18103h.clear();
        }
        z9.f18109o = true;
        z9.f18108n = true;
        if ((i9 == 108 || i9 == 0) && this.f18144r != null) {
            v z10 = z(0);
            z10.f18105k = false;
            G(z10, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.e() != false) goto L20;
     */
    @Override // o.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(o.l r6) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.w.u(o.l):void");
    }

    public final void v() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f18159z) {
            int[] iArr = AbstractC1260a.j;
            Context context2 = this.f18130k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    f(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    f(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    f(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    f(10);
                }
                this.f18126g0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                w();
                this.f18132l.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.f18127h0) {
                    if (this.f18126g0) {
                        viewGroup = (ViewGroup) from.inflate(co.notix.R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.f18124Z = false;
                        this.Y = false;
                    } else if (this.Y) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(co.notix.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new C1597c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(co.notix.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        InterfaceC1792e0 interfaceC1792e0 = (InterfaceC1792e0) viewGroup.findViewById(co.notix.R.id.decor_content_parent);
                        this.f18144r = interfaceC1792e0;
                        interfaceC1792e0.setWindowCallback(this.f18132l.getCallback());
                        if (this.f18124Z) {
                            ((ActionBarOverlayLayout) this.f18144r).j(109);
                        }
                        if (this.f18120D) {
                            ((ActionBarOverlayLayout) this.f18144r).j(2);
                        }
                        if (this.f18123X) {
                            ((ActionBarOverlayLayout) this.f18144r).j(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.f18125f0 ? (ViewGroup) from.inflate(co.notix.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(co.notix.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    n nVar = new n(this);
                    WeakHashMap weakHashMap = Q.f5546a;
                    P.H.l(viewGroup, nVar);
                    if (this.f18144r == null) {
                        this.f18116B = (TextView) viewGroup.findViewById(co.notix.R.id.title);
                    }
                    boolean z9 = g1.f21992a;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, null);
                    } catch (IllegalAccessException e8) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e8);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e9) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e9);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(co.notix.R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f18132l.findViewById(R.id.content);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(R.id.content);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f18132l.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new s4.i(this));
                    this.f18114A = viewGroup;
                    Object obj = this.j;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f18142q;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        InterfaceC1792e0 interfaceC1792e02 = this.f18144r;
                        if (interfaceC1792e02 != null) {
                            interfaceC1792e02.setWindowTitle(charSequence);
                        } else {
                            I i9 = this.f18138o;
                            if (i9 != null) {
                                C1780Y0 c1780y0 = (C1780Y0) i9.f18005k;
                                if (!c1780y0.f21934g) {
                                    c1780y0.f21935h = charSequence;
                                    if ((c1780y0.f21929b & 8) != 0) {
                                        Toolbar toolbar = c1780y0.f21928a;
                                        toolbar.setTitle(charSequence);
                                        if (c1780y0.f21934g) {
                                            Q.n(toolbar.getRootView(), charSequence);
                                        }
                                    }
                                }
                            } else {
                                TextView textView = this.f18116B;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f18114A.findViewById(R.id.content);
                    View decorView = this.f18132l.getDecorView();
                    contentFrameLayout2.f9463g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f18159z = true;
                    v z10 = z(0);
                    if (!this.f18139o0 && z10.f18103h == null) {
                        B(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.Y + ", windowActionBarOverlay: " + this.f18124Z + ", android:windowIsFloating: " + this.f18126g0 + ", windowActionModeOverlay: " + this.f18125f0 + ", windowNoTitle: " + this.f18127h0 + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void w() {
        if (this.f18132l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                m(((Activity) obj).getWindow());
            }
        }
        if (this.f18132l != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final A5.q x(Context context) {
        if (this.f18150u0 == null) {
            if (G1.f10715e == null) {
                Context applicationContext = context.getApplicationContext();
                G1.f10715e = new G1(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f18150u0 = new t(this, G1.f10715e);
        }
        return this.f18150u0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [i.v, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i.v z(int r5) {
        /*
            r4 = this;
            i.v[] r0 = r4.f18129j0
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            i.v[] r2 = new i.v[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.f18129j0 = r2
            r0 = r2
        L15:
            r2 = r0[r5]
            if (r2 != 0) goto L24
            i.v r2 = new i.v
            r2.<init>()
            r2.f18096a = r5
            r2.f18108n = r1
            r0[r5] = r2
        L24:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.w.z(int):i.v");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
