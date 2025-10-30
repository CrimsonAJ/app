package i;

import P.Q;
import P.V;
import P.X;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import h.AbstractC1260a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l6.AbstractC1570b;
import p.C1780Y0;
import p.InterfaceC1789d;
import p.InterfaceC1794f0;

/* loaded from: classes.dex */
public final class I extends AbstractC1570b implements InterfaceC1789d {

    /* renamed from: E, reason: collision with root package name */
    public static final AccelerateInterpolator f17996E = new AccelerateInterpolator();

    /* renamed from: F, reason: collision with root package name */
    public static final DecelerateInterpolator f17997F = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public boolean f17998A;

    /* renamed from: B, reason: collision with root package name */
    public final F f17999B;

    /* renamed from: C, reason: collision with root package name */
    public final F f18000C;

    /* renamed from: D, reason: collision with root package name */
    public final G f18001D;

    /* renamed from: g, reason: collision with root package name */
    public Context f18002g;

    /* renamed from: h, reason: collision with root package name */
    public Context f18003h;

    /* renamed from: i, reason: collision with root package name */
    public ActionBarOverlayLayout f18004i;
    public ActionBarContainer j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1794f0 f18005k;

    /* renamed from: l, reason: collision with root package name */
    public ActionBarContextView f18006l;

    /* renamed from: m, reason: collision with root package name */
    public final View f18007m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18008n;

    /* renamed from: o, reason: collision with root package name */
    public H f18009o;

    /* renamed from: p, reason: collision with root package name */
    public H f18010p;

    /* renamed from: q, reason: collision with root package name */
    public O0.c f18011q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18012r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f18013s;

    /* renamed from: t, reason: collision with root package name */
    public int f18014t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f18015u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f18016v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18017w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f18018x;

    /* renamed from: y, reason: collision with root package name */
    public n.j f18019y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f18020z;

    public I(Activity activity, boolean z9) {
        new ArrayList();
        this.f18013s = new ArrayList();
        this.f18014t = 0;
        this.f18015u = true;
        this.f18018x = true;
        this.f17999B = new F(this, 0);
        this.f18000C = new F(this, 1);
        this.f18001D = new G(0, this);
        View decorView = activity.getWindow().getDecorView();
        E(decorView);
        if (z9) {
            return;
        }
        this.f18007m = decorView.findViewById(R.id.content);
    }

    public final void C(boolean z9) {
        X i9;
        X x5;
        long j;
        if (z9) {
            if (!this.f18017w) {
                this.f18017w = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f18004i;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                H(false);
            }
        } else if (this.f18017w) {
            this.f18017w = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f18004i;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            H(false);
        }
        if (this.j.isLaidOut()) {
            if (z9) {
                C1780Y0 c1780y0 = (C1780Y0) this.f18005k;
                i9 = Q.a(c1780y0.f21928a);
                i9.a(0.0f);
                i9.c(100L);
                i9.d(new n.i(c1780y0, 4));
                x5 = this.f18006l.i(200L, 0);
            } else {
                C1780Y0 c1780y02 = (C1780Y0) this.f18005k;
                X a5 = Q.a(c1780y02.f21928a);
                a5.a(1.0f);
                a5.c(200L);
                a5.d(new n.i(c1780y02, 0));
                i9 = this.f18006l.i(100L, 8);
                x5 = a5;
            }
            n.j jVar = new n.j();
            ArrayList arrayList = jVar.f20995a;
            arrayList.add(i9);
            View view = (View) i9.f5563a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) x5.f5563a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(x5);
            jVar.b();
            return;
        }
        if (z9) {
            ((C1780Y0) this.f18005k).f21928a.setVisibility(4);
            this.f18006l.setVisibility(0);
        } else {
            ((C1780Y0) this.f18005k).f21928a.setVisibility(0);
            this.f18006l.setVisibility(8);
        }
    }

    public final Context D() {
        if (this.f18003h == null) {
            TypedValue typedValue = new TypedValue();
            this.f18002g.getTheme().resolveAttribute(co.notix.R.attr.actionBarWidgetTheme, typedValue, true);
            int i9 = typedValue.resourceId;
            if (i9 != 0) {
                this.f18003h = new ContextThemeWrapper(this.f18002g, i9);
            } else {
                this.f18003h = this.f18002g;
            }
        }
        return this.f18003h;
    }

    public final void E(View view) {
        String str;
        InterfaceC1794f0 wrapper;
        boolean z9;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(co.notix.R.id.decor_content_parent);
        this.f18004i = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(co.notix.R.id.action_bar);
        if (findViewById instanceof InterfaceC1794f0) {
            wrapper = (InterfaceC1794f0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f18005k = wrapper;
        this.f18006l = (ActionBarContextView) view.findViewById(co.notix.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(co.notix.R.id.action_bar_container);
        this.j = actionBarContainer;
        InterfaceC1794f0 interfaceC1794f0 = this.f18005k;
        if (interfaceC1794f0 != null && this.f18006l != null && actionBarContainer != null) {
            Context context = ((C1780Y0) interfaceC1794f0).f21928a.getContext();
            this.f18002g = context;
            if ((((C1780Y0) this.f18005k).f21929b & 4) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                this.f18008n = true;
            }
            int i9 = context.getApplicationInfo().targetSdkVersion;
            this.f18005k.getClass();
            G(context.getResources().getBoolean(co.notix.R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f18002g.obtainStyledAttributes(null, AbstractC1260a.f17805a, co.notix.R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f18004i;
                if (actionBarOverlayLayout2.f9403g) {
                    this.f17998A = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.j;
                WeakHashMap weakHashMap = Q.f5546a;
                P.H.k(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(I.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void F(boolean z9) {
        int i9;
        if (!this.f18008n) {
            if (z9) {
                i9 = 4;
            } else {
                i9 = 0;
            }
            C1780Y0 c1780y0 = (C1780Y0) this.f18005k;
            int i10 = c1780y0.f21929b;
            this.f18008n = true;
            c1780y0.a((i9 & 4) | (i10 & (-5)));
        }
    }

    public final void G(boolean z9) {
        if (!z9) {
            ((C1780Y0) this.f18005k).getClass();
            this.j.setTabContainer(null);
        } else {
            this.j.setTabContainer(null);
            ((C1780Y0) this.f18005k).getClass();
        }
        this.f18005k.getClass();
        ((C1780Y0) this.f18005k).f21928a.setCollapsible(false);
        this.f18004i.setHasNonEmbeddedTabs(false);
    }

    public final void H(boolean z9) {
        boolean z10;
        int i9 = 0;
        boolean z11 = this.f18016v;
        if (!this.f18017w && z11) {
            z10 = false;
        } else {
            z10 = true;
        }
        View view = this.f18007m;
        V v8 = null;
        G g9 = this.f18001D;
        if (z10) {
            if (!this.f18018x) {
                this.f18018x = true;
                n.j jVar = this.f18019y;
                if (jVar != null) {
                    jVar.a();
                }
                this.j.setVisibility(0);
                int i10 = this.f18014t;
                F f9 = this.f18000C;
                if (i10 == 0 && (this.f18020z || z9)) {
                    this.j.setTranslationY(0.0f);
                    float f10 = -this.j.getHeight();
                    if (z9) {
                        this.j.getLocationInWindow(new int[]{0, 0});
                        f10 -= r12[1];
                    }
                    this.j.setTranslationY(f10);
                    n.j jVar2 = new n.j();
                    X a5 = Q.a(this.j);
                    a5.e(0.0f);
                    View view2 = (View) a5.f5563a.get();
                    if (view2 != null) {
                        if (g9 != null) {
                            v8 = new V(g9, i9, view2);
                        }
                        view2.animate().setUpdateListener(v8);
                    }
                    boolean z12 = jVar2.f20999e;
                    ArrayList arrayList = jVar2.f20995a;
                    if (!z12) {
                        arrayList.add(a5);
                    }
                    if (this.f18015u && view != null) {
                        view.setTranslationY(f10);
                        X a9 = Q.a(view);
                        a9.e(0.0f);
                        if (!jVar2.f20999e) {
                            arrayList.add(a9);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = f17997F;
                    boolean z13 = jVar2.f20999e;
                    if (!z13) {
                        jVar2.f20997c = decelerateInterpolator;
                    }
                    if (!z13) {
                        jVar2.f20996b = 250L;
                    }
                    if (!z13) {
                        jVar2.f20998d = f9;
                    }
                    this.f18019y = jVar2;
                    jVar2.b();
                } else {
                    this.j.setAlpha(1.0f);
                    this.j.setTranslationY(0.0f);
                    if (this.f18015u && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    f9.a();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f18004i;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = Q.f5546a;
                    P.F.c(actionBarOverlayLayout);
                    return;
                }
                return;
            }
            return;
        }
        if (this.f18018x) {
            this.f18018x = false;
            n.j jVar3 = this.f18019y;
            if (jVar3 != null) {
                jVar3.a();
            }
            int i11 = this.f18014t;
            F f11 = this.f17999B;
            if (i11 == 0 && (this.f18020z || z9)) {
                this.j.setAlpha(1.0f);
                this.j.setTransitioning(true);
                n.j jVar4 = new n.j();
                float f12 = -this.j.getHeight();
                if (z9) {
                    this.j.getLocationInWindow(new int[]{0, 0});
                    f12 -= r12[1];
                }
                X a10 = Q.a(this.j);
                a10.e(f12);
                View view3 = (View) a10.f5563a.get();
                if (view3 != null) {
                    if (g9 != null) {
                        v8 = new V(g9, i9, view3);
                    }
                    view3.animate().setUpdateListener(v8);
                }
                boolean z14 = jVar4.f20999e;
                ArrayList arrayList2 = jVar4.f20995a;
                if (!z14) {
                    arrayList2.add(a10);
                }
                if (this.f18015u && view != null) {
                    X a11 = Q.a(view);
                    a11.e(f12);
                    if (!jVar4.f20999e) {
                        arrayList2.add(a11);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f17996E;
                boolean z15 = jVar4.f20999e;
                if (!z15) {
                    jVar4.f20997c = accelerateInterpolator;
                }
                if (!z15) {
                    jVar4.f20996b = 250L;
                }
                if (!z15) {
                    jVar4.f20998d = f11;
                }
                this.f18019y = jVar4;
                jVar4.b();
                return;
            }
            f11.a();
        }
    }

    public I(Dialog dialog) {
        new ArrayList();
        this.f18013s = new ArrayList();
        this.f18014t = 0;
        this.f18015u = true;
        this.f18018x = true;
        this.f17999B = new F(this, 0);
        this.f18000C = new F(this, 1);
        this.f18001D = new G(0, this);
        E(dialog.getWindow().getDecorView());
    }
}
